using System.Collections;
using UnityEngine;

public class Dice : MonoBehaviour {

    // Variables para almacenar los lados del dado, el renderizador de sprites y el turno del jugador
    private Sprite[] diceSides;
    private SpriteRenderer rend;
    private int whosTurn = 1;
    private bool coroutineAllowed = true;

	// Inicialización del juego
	private void Start () {
        // Obtener el componente SpriteRenderer y cargar todos los sprites de los lados del dado
        rend = GetComponent<SpriteRenderer>();
        diceSides = Resources.LoadAll<Sprite>("DiceSides/");
        rend.sprite = diceSides[5];
	}

    // Método que se llama cuando se hace clic en el dado
    private void OnMouseDown()
    {
        // Si el juego no ha terminado y la corrutina está permitida, iniciar la corrutina para lanzar el dado
        if (!GameControl.gameOver && coroutineAllowed)
            StartCoroutine("RollTheDice");
    }

    // Corrutina para lanzar el dado
    private IEnumerator RollTheDice()
    {
        // Deshabilitar la corrutina y lanzar el dado aleatoriamente 20 veces
        coroutineAllowed = false;
        int randomDiceSide = 0;
        for (int i = 0; i <= 20; i++)
        {
            randomDiceSide = Random.Range(0, 6);
            rend.sprite = diceSides[randomDiceSide];
            yield return new WaitForSeconds(0.05f);
        }

        // Guardar el resultado del lanzamiento del dado y mover al jugador correspondiente
        GameControl.diceSideThrown = randomDiceSide + 1;
        if (whosTurn == 1)
        {
            GameControl.MovePlayer(1);
        } else if (whosTurn == -1)
        {
            GameControl.MovePlayer(2);
        }
        
        // Cambiar el turno del jugador y habilitar la corrutina nuevamente
        whosTurn *= -1;
        coroutineAllowed = true;
    }
}
