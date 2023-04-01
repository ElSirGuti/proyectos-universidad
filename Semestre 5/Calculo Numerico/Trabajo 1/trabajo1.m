disp('El metodo de Cholesky solo funciona con una matriz simetrica y definida positiva');
a=zeros(3,3)
b=zeros(3,1)
for i=1:3
    for j=1:3
    a(i,j)=input(['ingrese a' num2str(i) num2str(j) '=']);
    end
    b(i)=input(['ingrese b' num2str(i) '='])
end
% Condicion de la matriz definida positiva simetrica
% existe una condicion en matlab para determinar esto y es usando las siguientes 4 lineas:
try chol(a)
    disp('La matriz es simetrica positiva definida')
catch ME
    disp('La matriz es simetrica positiva definida')
end
disp(a);
U=chol(a) % El comando chol les devuelve la matriz triangular superior U
% Como U y L son solo la transpuesta una de la otra, transponemos U para hallar L
L = U' % Si colocamos una variable seguida de ' la estamos transponiendo ej:U' que es U 
% transpuesta 
x=[x;y;z]; % Matriz columna de variables del SEL AX=B
ychol=[y1;y2;y3]; % Matriz columna de variables "y" necesaria para el metodo de Cholesky
Y=linsolve(L,b)
X=linsolve(U,Y)