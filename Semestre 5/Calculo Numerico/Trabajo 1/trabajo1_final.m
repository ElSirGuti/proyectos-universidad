function Programa()
    % Se define una matriz simetrica y positiva (A)
    A = [20 16 0; 16 24 12; 0 12 20];
    disp('Matriz A:')
    disp(A)
    % Se define el vector vertical b
    b = [-32; -52; -64];
    disp('Vector vertical b:')
    disp(b)

    % Se resuelve el sistema de ecuaciones utilizando la funcion cholesky
    [x_val, y_val, z_val] = cholesky(A, b);

    % Se muestran los valores finales de x1, x2, x3
    fprintf('El resultado tras aplicar el metodo de cholesky es:\n');
    fprintf('x1 = %f\n', x_val);
    fprintf('x2 = %f\n', y_val);
    fprintf('x3 = %f\n', z_val);
    fprintf('\n')
    
    % Sobreescribimos la matriz A para realizar el metodo de Jacobi
    A = [5 -1 3; -1 7 -4; 0 1 3];
    disp('Matriz A:')
    disp(A)
    
    % Sobreescribimos tambien el vector b
    b = [38; -45; 19];
    disp('Vector vertical b:')
    disp(b)
    
    % Se resuelve la matriz usando la funcion jacobi
    x = jacobi(A, b);

    % Se muestran los valores finales de x1, x2, x3
    fprintf('\nEl resultado tras aplicar el metodo de Jacobi es:\n');
    fprintf('x1 = %f\n', x(1));
    fprintf('x2 = %f\n', x(2));
    fprintf('x3 = %f\n', x(3));
end

function [x_val, y_val, z_val] = cholesky(A, b)
    % Se verifica que A sea simetrica y con determinante simetrico
    if ~isequal(A, A') || any(eig(A) <= 0)
        error('La matriz A debe ser simetrica y tener un determinante positivo')
    end

    % Se calcula la factorizacion de Cholesky para A
    R = chol(A);

    % Se resuelve el sistema de ecuaciones usando la sustitucion hacia
    % atras
    y = R'\b;
    x = R\y;

    % Se extraen los valores de x1, x2, x3 del vector final
    x_val = x(1);
    y_val = x(2);
    z_val = x(3);
end

function x = jacobi(A, b)
    % Se define el numero maximo de iteraciones
    iteracionesMax = 15;

    % Obtenemos el tamaño de la matriz A
    n = size(A, 1);

    % Inicializamos el vector que almacenará la respuesta
    x = zeros(n, 1); 

    % Iteramos hasta que se haya alcanzado el numero maximo de iteraciones
    for k = 1:iteracionesMax
        % Se actualiza cada elemento en el vector final "x"
        for i = 1:n
            x(i) = (b(i) - A(i,[1:i-1,i+1:n]) * x([1:i-1,i+1:n])) / A(i,i);
        end

        % Se muestra la iteracion actual
        fprintf('Iteracion %d: ', k);
        fprintf('%f ', x);
        fprintf('\n');
    end
end

