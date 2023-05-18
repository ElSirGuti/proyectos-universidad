from datetime import datetime

#En esta clase basicamente se crea el objeto
class Producto:
    def __init__(self, nombre, descripcion, precio, status, cantidad, fecha_creacion, fecha_actualizacion):
        self.nombre = nombre
        self.descripcion = descripcion
        self.precio = precio
        self.status = status
        self.cantidad = cantidad
        self.fecha_creacion = fecha_creacion
        self.fecha_actualizacion = fecha_actualizacion


#Tambien tiene el otro metodo que solamente modifica el el archivo interno del stock del producto
    def vender(self, cantidad_vendida):
        if cantidad_vendida > self.cantidad:
            print("Esa venta supera la cantidad de producto en posesion")
            
        else:
            self.cantidad -= cantidad_vendida
            self.fecha_actualizacion = datetime.now()
            print("Venta realizada con éxito. Cantidad en stock actualizada.")

"""
En esta segunda clase volvemos a iniciar todo igual que arriba, basicamente un copia y pega
solo que de ultimo puedes ver que pedimos de parametro tambien opciones que es un diccionario que va a tener el objeto
y vamos a tener que andar consultando

"""

class ProductoConOpciones(Producto):
    def __init__(self, nombre, descripcion, precio, status, cantidad, fecha_creacion, fecha_actualizacion, opciones):
        super().__init__(nombre, descripcion, precio, status, cantidad, fecha_creacion, fecha_actualizacion)
        self.opciones = opciones
    
#Aqui solo imprimimos las opciones para que el huevon decida que ponerle
    def imprimir_opciones(self):
        for opcion, valores in self.opciones.items():
            print(f"{opcion}:")
            for valor in valores:
                print(f"- {valor}")

"""
En esta clase vamos armando el carrito y todo lo que vamos comprando
La verdad esta si la medio robe de internet pero si se entiende lo que hace
"""

class Carrito:
    
    """
    El atributo "siguiente" es una referencia al siguiente nodo en la lista enlazada 
    Cuando el atributo le ponemos none, estamos indicando que no sigue ninguno, por lo que tomara de referencia al ultimo de la lista
    """
    class Nodo:
        def __init__(self, producto, siguiente=None):
            self.producto = producto
            self.siguiente = siguiente

    """
Este metodo tomara el nombre del producto que hayamos seleccionado y lo añadira al carrito
simplemente agregando el nombre y sumando el precio al total
    """
    def __init__(self):
        self.cabeza = None
        self.total = 0

    def agregar_producto(self, producto):
        nuevo_nodo = Carrito.Nodo(producto)
        nuevo_nodo.siguiente = self.cabeza
        self.cabeza = nuevo_nodo
        self.total += producto.precio

    """
Este es sencillo ya que una vez que le pasemos el parametro que sera el nombre del producto,
el metodo va a recorrer su lista interna y cuando de con el nombre lo borrara
    """
    def eliminar_producto(self, producto):
        actual = self.cabeza
        anterior = None
        while actual and actual.producto != producto:
            anterior = actual
            actual = actual.siguiente
        if not actual:
            return False
        if not anterior:
            self.cabeza = actual.siguiente
        else:
            anterior.siguiente = actual.siguiente
        self.total -= producto.precio
        return True

    def calcular_total(self):
        return self.total

"""
Clase la cual se agregan los productos y se arma lo que seria la factura para completar todo
"""
class Orden:
    class Nodo:
        def __init__(self, producto, cantidad, opciones, siguiente=None):
            self.producto = producto
            self.cantidad = cantidad
            self.opciones = opciones
            self.siguiente = siguiente

    def __init__(self):
        self.cabeza = None
        self.total = 0

    def agregar_producto(self, producto, cantidad, opciones):
        nuevo_nodo = Orden.Nodo(producto, cantidad, opciones)
        if not self.cabeza:
            self.cabeza = nuevo_nodo
        else:
            actual = self.cabeza
            while actual.siguiente:
                actual = actual.siguiente
            actual.siguiente = nuevo_nodo
        self.total += producto.precio * cantidad

    """
    Aprendiendo salidas formateadas con duran
    """
    def generar_factura(self):
        print("Factura:")
        print("Total: {}$ \n".format(self.total))
        actual = self.cabeza
        while actual:
            print("Producto: {}".format(actual.producto.nombre))
            print("Precio: {}$".format(actual.producto.precio))
            print("Cantidad: {}".format(actual.cantidad))
            print("Opciones seleccionadas: {}".format(actual.opciones))
            print("")
            actual = actual.siguiente

#Ejemplo de productos metidos a mano

producto1 = Producto("Libro", "Libro de ciencia ficción", 15.99, "Disponible", 10, datetime.now(), datetime.now())
producto2 = Producto("Camiseta", "Camiseta de algodón", 20.99, "Disponible", 50, datetime.now(), datetime.now())

orden = Orden()
orden.agregar_producto(producto1, 2, ["Tapa dura"])
orden.agregar_producto(producto2, 1, ["Talla M"])
orden.generar_factura() 