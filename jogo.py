def contar_vizinhos_vivos(matriz, x, y, N):
    direcoes = [(-1, -1), (-1, 0), (-1, 1),
                (0, -1),           (0, 1),
                (1, -1),  (1, 0),  (1, 1)]
    
    vizinhos_vivos = 0
    for dx, dy in direcoes:
        nx, ny = x + dx, y + dy
        if 0 <= nx < N and 0 <= ny < N and matriz[nx][ny] == 1:
            vizinhos_vivos += 1
    return vizinhos_vivos

def proximo_estado(matriz, N):
    nova_matriz = [[0]*N for _ in range(N)]
    for i in range(N):
        for j in range(N):
            vivos = contar_vizinhos_vivos(matriz, i, j, N)
            if matriz[i][j] == 1:
                nova_matriz[i][j] = 1 if vivos == 2 or vivos == 3 else 0
            else:
                nova_matriz[i][j] = 1 if vivos == 3 else 0
    return nova_matriz

def main():
    N, Q = map(int, input().split())
    matriz = [list(map(int, list(input().strip()))) for _ in range(N)]

    for _ in range(Q):
        matriz = proximo_estado(matriz, N)

    for linha in matriz:
        print(''.join(map(str, linha)))

if __name__ == "__main__":
    main()
