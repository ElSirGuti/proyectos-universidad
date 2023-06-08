function trabajo3()
    % ------------Ejercicio 1-------------
    % Define the function to be integrated
    f = @(x) exp(1).^x./x;

    % Define the interval of integration
    a = 4;
    b = 2;

    % Define the number of subdivisions
    n = 4;

    % Calculate the width of each subdivision
    h = (b-a)/n;

    % Calculate the x values for each subdivision
    x = a:h:b;

    % Calculate the y values for each subdivision
    y = f(x);

    % Calculate the integral using Simpson's method
    I = (h/3)*(y(1) + 4*sum(y(2:2:end-1)) + 2*sum(y(3:2:end-2)) + y(end));

    % Display the result
    disp(['Resultado Ejercicio 1: ', num2str(I)])

        
    % ------------Ejercicio 2-------------
    % Define the differential equation
    dydx = @(x,y) x.*sqrt(y);

    % Define the initial condition
    x0 = 1;
    y0 = 4;

    % Define the value of x at which to approximate y
    x_end = 1.5;

    % Define the number of intervals
    n = 5;

    % Calculate the step size
    h = (x_end-x0)/n;

    % Initialize x and y
    x = x0;
    y = y0;

    % Iterate using Euler's method
    for i = 1:n
        y = y + h*dydx(x,y);
        x = x + h;
    end

    % Display the result
    disp(['Resultado Ejercicio 2: ', num2str(y)])