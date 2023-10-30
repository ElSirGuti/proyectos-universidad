using UnityEngine;
using UnityEngine.UI;

public class GameControl : MonoBehaviour {

    // Variables estáticas para almacenar los objetos del juego y los estados del juego
    private static GameObject whoWinsTextShadow, player1MoveText, player2MoveText;
    private static GameObject player1, player2;
    public static int diceSideThrown = 0;
    public static int player1StartWaypoint = 0;
    public static int player2StartWaypoint = 0;
    public static bool gameOver = false;

    // Inicialización del juego
    void Start () {

        // Buscar y asignar los objetos del juego a las variables correspondientes
        whoWinsTextShadow = GameObject.Find("WhoWinsText");
        player1MoveText = GameObject.Find("Player1MoveText");
        player2MoveText = GameObject.Find("Player2MoveText");
        player1 = GameObject.Find("Player1");
        player2 = GameObject.Find("Player2");

        // Inicialmente, los jugadores no pueden moverse
        player1.GetComponent<FollowThePath>().moveAllowed = false;
        player2.GetComponent<FollowThePath>().moveAllowed = false;

        // Configurar la visibilidad de los objetos de texto
        whoWinsTextShadow.gameObject.SetActive(false);
        player1MoveText.gameObject.SetActive(true);
        player2MoveText.gameObject.SetActive(false);
    }

    // Actualizar el estado del juego en cada frame
    void Update()
    {
        // Si el jugador 1 ha avanzado más allá de su punto de inicio + lanzamiento de dados, detener su movimiento y permitir que el jugador 2 se mueva
        if (player1.GetComponent<FollowThePath>().waypointIndex > 
            player1StartWaypoint + diceSideThrown)
        {
            player1.GetComponent<FollowThePath>().moveAllowed = false;
            player1MoveText.gameObject.SetActive(false);
            player2MoveText.gameObject.SetActive(true);
            player1StartWaypoint = player1.GetComponent<FollowThePath>().waypointIndex - 1;
        }

        // Si el jugador 2 ha avanzado más allá de su punto de inicio + lanzamiento de dados, detener su movimiento y permitir que el jugador 1 se mueva
        if (player2.GetComponent<FollowThePath>().waypointIndex >
            player2StartWaypoint + diceSideThrown)
        {
            player2.GetComponent<FollowThePath>().moveAllowed = false;
            player2MoveText.gameObject.SetActive(false);
            player1MoveText.gameObject.SetActive(true);
            player2StartWaypoint = player2.GetComponent<FollowThePath>().waypointIndex - 1;
        }

        // Si el jugador 1 ha llegado al final del camino, declararlo como ganador y terminar el juego
        if (player1.GetComponent<FollowThePath>().waypointIndex == 
            player1.GetComponent<FollowThePath>().waypoints.Length)
        {
            whoWinsTextShadow.gameObject.SetActive(true);
            whoWinsTextShadow.GetComponent<Text>().text = "Jugador 1 Gana";
            gameOver = true;
        }

        // Si el jugador 2 ha llegado al final del camino, declararlo como ganador y terminar el juego
        if (player2.GetComponent<FollowThePath>().waypointIndex ==
            player2.GetComponent<FollowThePath>().waypoints.Length)
        {
            whoWinsTextShadow.gameObject.SetActive(true);
            whoWinsTextShadow.GetComponent<Text>().text = "Jugador 2 Gana";
            gameOver = true;
        }
    }

    // Método para mover a un jugador específico
    public static void MovePlayer(int playerToMove)
    {
        switch (playerToMove) { 
            case 1:
                // Permitir que el jugador 1 se mueva
                player1.GetComponent<FollowThePath>().moveAllowed = true;
                break;

            case 2:
                // Permitir que el jugador 2 se mueva
                player2.GetComponent<FollowThePath>().moveAllowed = true;
                break;
        }
    }
}
