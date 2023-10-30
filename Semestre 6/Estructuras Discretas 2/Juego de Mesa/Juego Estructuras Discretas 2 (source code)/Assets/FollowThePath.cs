using UnityEngine;

public class FollowThePath : MonoBehaviour {

    public Transform[] waypoints; // Array de puntos de referencia que el objeto seguirá.

    [SerializeField]
    private float moveSpeed = 1f; // Velocidad de movimiento del objeto.

    [HideInInspector]
    public int waypointIndex = 0; // Índice del punto de referencia actual al que se dirige el objeto.

    public bool moveAllowed = false; // Variable para controlar si el objeto puede moverse o no.

	private void Start () {
        transform.position = waypoints[waypointIndex].transform.position; // Al inicio, establece la posición del objeto en el primer punto de referencia.
	}
	
	private void Update () {
        if (moveAllowed) // Si se permite el movimiento...
            Move(); // ...llama a la función Move.
	}

    private void Move()
    {
        if (waypointIndex <= waypoints.Length - 1) // Si el índice del punto de referencia es menor o igual al último índice en el array...
        {
            transform.position = Vector2.MoveTowards(transform.position, // Mueve el objeto desde su posición actual...
            waypoints[waypointIndex].transform.position, // ...hacia la posición del punto de referencia actual...
            moveSpeed * Time.deltaTime); // ...a la velocidad especificada.

            if (transform.position == waypoints[waypointIndex].transform.position) // Si el objeto ha llegado al punto de referencia actual...
            {
                waypointIndex += 1; // ...incrementa el índice del punto de referencia para dirigirse al siguiente.
            }
        }
    }
}
