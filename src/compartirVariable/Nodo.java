package compartirVariable;

public class Nodo {
//    private int idNodo;
    Nodo siguiente;
    private Cliente clienteNodo;


    public Nodo(Cliente clienteNodo) {
//        this.idNodo = idNodo;
        this.clienteNodo = clienteNodo;
    }


    public Cliente getClienteNodo() {
        return clienteNodo;
    }

    public void setClienteNodo(Cliente clienteNodo) {
        this.clienteNodo = clienteNodo;
    }

}
