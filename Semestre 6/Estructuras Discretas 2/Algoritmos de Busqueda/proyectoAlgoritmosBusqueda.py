# Proyecto realizado por Andres Gutierrez
# Fecha de entrega: 25/10/2023
# Nota Final: 18/20

from collections import deque
from queue import PriorityQueue

def print_puzzle(puzzle):
    for row in puzzle:
        print(' '.join(str(cell) for cell in row))
    print()

def find_empty(puzzle):
    for i in range(3):
        for j in range(3):
            if puzzle[i][j] == ' ':
                return i, j

def valid_moves(i, j):
    moves = [(i-1, j), (i+1, j), (i, j-1), (i, j+1)]
    return [(x, y) for x, y in moves if 0 <= x < 3 and 0 <= y < 3]

def swap_cells(puzzle, empty, move):
    i, j = empty
    x, y = move
    new_puzzle = [row.copy() for row in puzzle]
    new_puzzle[i][j], new_puzzle[x][y] = new_puzzle[x][y], new_puzzle[i][j]
    return new_puzzle

def bfs(initial_puzzle, goal_puzzle):
    queue = deque([(initial_puzzle, [])])
    seen = set([str(initial_puzzle)])
    
    while queue:
        puzzle, path = queue.popleft()
        print("Movimiento actual:")
        print_puzzle(puzzle)
        
        if puzzle == goal_puzzle:
            return path, len(seen)
        
        i, j = find_empty(puzzle)
        for move in valid_moves(i, j):
            new_puzzle = swap_cells(puzzle, (i, j), move)
            if str(new_puzzle) not in seen:
                queue.append((new_puzzle, path + [move]))
                seen.add(str(new_puzzle))

    return None, len(seen)  # Devuelve None para la ruta y el número de estados vistos



def dfs(initial_puzzle, goal_puzzle):
    stack = deque([(initial_puzzle, [])])
    seen = set([str(initial_puzzle)])
    
    while stack:
        puzzle, path = stack.pop()
        print("Movimiento actual:")
        print_puzzle(puzzle)
        
        if puzzle == goal_puzzle:
            return path, len(seen)
        
        i, j = find_empty(puzzle)
        for move in valid_moves(i, j):
            new_puzzle = swap_cells(puzzle, (i, j), move)
            if str(new_puzzle) not in seen:
                stack.append((new_puzzle, path + [move]))
                seen.add(str(new_puzzle))

def heuristic(puzzle, goal):
    manhattan_distance = 0
    misplaced_tiles = 0
    for i in range(3):
        for j in range(3):
            if puzzle[i][j] != ' ':
                try:
                    x, y = divmod(goal.index(puzzle[i][j]), 3)
                    manhattan_distance += abs(x - i) + abs(y - j)
                    if (i,j) != (x,y):
                        misplaced_tiles += 1
                except ValueError:
                    pass  # El número no se encuentra en la configuración objetivo, así que lo ignoramos
    return manhattan_distance + misplaced_tiles

def a_star(initial_puzzle, goal_puzzle):
    queue = PriorityQueue()
    queue.put((0, 0, (initial_puzzle, [])))
    seen = set([str(initial_puzzle)])
    
    while not queue.empty():
        _, _, (puzzle, path) = queue.get()
        print("Movimiento actual:")
        print_puzzle(puzzle)
        
        if puzzle == goal_puzzle:
            return path, len(seen)
        
        i, j = find_empty(puzzle)
        for move in valid_moves(i, j):
            new_puzzle = swap_cells(puzzle, (i, j), move)
            if str(new_puzzle) not in seen:
                cost = len(path) + 1 + heuristic(new_puzzle, goal_puzzle)
                queue.put((cost, len(seen), (new_puzzle, path + [move])))
                seen.add(str(new_puzzle))

    return None, len(seen)

initial_puzzle = [[2, 8, 3], [1, 6, 4], [7, ' ', 5]]
goal_puzzle = [[1, 2, 3], [4, 5, 6], [7, 8, ' ']]

while True:
    print("""Como desea resolver el 8-puzzle?
    2  8  3
    1  6  4
    7     5

1. Algoritmo de Busqueda en Amplitud
2. Algoritmo de Busqueda en Profundidad
3. Algoritmo A*
4. Salir
(Cada algoritmo tarda alrededor de 100 segundos en ejecutarse por completo)""")
    dec = int(input())

    if dec == 1:
        result_path,result_moves = bfs(initial_puzzle, goal_puzzle)
        if result_path is not None:
            print("Solución encontrada en {} movimientos:".format(len(result_path)))
            for move in result_path:
                print(move)
        else:
            print("No se encontró ninguna solución después de {} movimientos.".format(result_moves))
    elif dec == 2:
        print("2 seleccionado")
        path, moves = dfs(initial_puzzle, goal_puzzle)
        if path is not None:
            print("Solución encontrada en {} movimientos:".format(len(path)))
            for move in path:
                print(move)
        else:
            print("No se encontró ninguna solución después de {} movimientos.".format(moves))
    elif dec == 3:
        path, moves= a_star(initial_puzzle, goal_puzzle)
        if path is not None:
            print("Solución encontrada en {} movimientos:".format(len(path)))
            for move in path:
                print(move)
        else:
            print("No se encontró ninguna solución después de {} movimientos.".format(moves))
    elif dec == 4:
        exit()

