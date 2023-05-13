function trabajo2()
   % -----------Ejercicio 1-----------
   % Guardamos los puntos en vectores
   x = [1 3 4 6 8 9 11 14];
   y = [1 2 4 4 5 7 8 9];
   % Usamos size() para determinar el numero de pares ordenados
   [filas n] = size(x);
   
   for i=1:n
       % i tomara valores de 1 a 8 donde recorrera los arreglos y los 
       % multiplicará
       xy(i)=x(i)*y(i);
       % Ahora un arreglo para los valores de x al cuadrado
       x2(i) = x(i)^2;
   end
   
   fprintf('Primer Ejercicio\n')
   fprintf('Vector x: ')
   fprintf('%i ',x)
   fprintf('\nVector y: ')
   fprintf('%i ', y)
   fprintf('\nVector xy: ')
   fprintf('%i ',xy)
   fprintf('\nVector x^2: ')
   fprintf('%i ',x2)
   
   % Realizamos la sumatoria de cada vector
   sumatoriax = 0;
   sumatoriay = 0;
   sumatoriaxy = 0;
   sumatoriax2 = 0;
   
   for i=1:n
        sumatoriax = sumatoriax + x(i);
        sumatoriay = sumatoriay + y(i);
        sumatoriaxy = sumatoriaxy + xy(i);
        sumatoriax2 = sumatoriax2 + x2(i);
   end
   
   fprintf('\nSumatoria x = %i',sumatoriax)
   fprintf('\nSumatoria y = %i', sumatoriay)
   fprintf('\nSumatoria xy = %i', sumatoriaxy)
   fprintf('\nSumatoria x^2 = %i', sumatoriax2)
   
   % Calculamos la pendiente
   m = ((n * sumatoriaxy) - (sumatoriax * sumatoriay)) / (((n * sumatoriax2) - (sumatoriax^2))); 
   % Calculamos el punto de corte en Y
   b = ((sumatoriay - (m*sumatoriax))) / n;
   
   fprintf('\nLa ecuacion de la recta es y = %f x + (%f)',m,b)
   
   % -----------Ejercicio 2-----------
   x = [5 -2 7 -5 1 5 9 0 -3 2 0 3];
   y = [5 0 30 -15 6 18 28 10 -18 -5 -11 2];
   [filas n] = size(x);
   
   for i=1:n
       xy(i)=x(i)*y(i);
       x2(i) = x(i)^2;
   end
   
   fprintf('\n\nSegundo Ejercicio\n')
   fprintf('Vector x: ')
   fprintf('%i ',x)
   fprintf('\nVector y: ')
   fprintf('%i ', y)
   fprintf('\nVector xy: ')
   fprintf('%i ',xy)
   fprintf('\nVector x^2: ')
   fprintf('%i ',x2)
   
   sumatoriax = 0;
   sumatoriay = 0;
   sumatoriaxy = 0;
   sumatoriax2 = 0;
   
   for i=1:n
        sumatoriax = sumatoriax + x(i);
        sumatoriay = sumatoriay + y(i);
        sumatoriaxy = sumatoriaxy + xy(i);
        sumatoriax2 = sumatoriax2 + x2(i);
   end
   
   fprintf('\nSumatoria x = %i',sumatoriax)
   fprintf('\nSumatoria y = %i', sumatoriay)
   fprintf('\nSumatoria xy = %i', sumatoriaxy)
   fprintf('\nSumatoria x^2 = %i', sumatoriax2)
   
   m = ((n * sumatoriaxy) - (sumatoriax * sumatoriay)) / (((n * sumatoriax2) - (sumatoriax^2)));
   b = ((sumatoriay - (m*sumatoriax))) / n;
   
   fprintf('\nLa ecuacion de la recta es y = %f x + (%f)',m,b)
end