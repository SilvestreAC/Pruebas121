package compartirVariable;

public class Runner {
    public static void main(String[] args) {

        Lista lista=new Lista();

        lista.create(new Nodo(new Cliente(1,18,12346.12)));
        lista.create(new Nodo(new Cliente(2,19,21235.12)));
        lista.create(new Nodo(new Cliente(3,20,31234.12)));
        lista.create(new Nodo(new Cliente(4,21,41234.12)));
        lista.create(new Nodo(new Cliente(5,22,51234.12)));
        lista.create(new Nodo(new Cliente(6,23,61234.12)));


//        lista.agregarOrdenado(new Nodo(new Cliente(1,18,12346.12)));
//        lista.agregarOrdenado(new Nodo(new Cliente(2,19,21235.12)));
//        lista.agregarOrdenado(new Nodo(new Cliente(3,20,31234.12)));
//        lista.agregarOrdenado(new Nodo(new Cliente(4,21,41234.12)));
//        lista.agregarOrdenado(new Nodo(new Cliente(5,22,51234.12)));
//        lista.agregarOrdenado(new Nodo(new Cliente(6,23,61234.12)));


//        System.out.println("Id:"+nodo1.getIdNodo()+"\n"+nodo1.getClienteNodo());
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||");

        lista.listarTodo();
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||");
        Cliente cliente;
        cliente= lista.buscar(8);
        if(cliente==null){
            System.out.println("cliente no existe");
        }else {
            System.out.println(cliente);
        }

//        lista.create(nodo1);
//        lista.create(nodo3);
//        lista.create(nodo2);
//        lista.agregarOrdenado(nodo2);
//        lista.agregarOrdenado(nodo3);
//        lista.agregarOrdenado(nodo1);
//        lista.listarTodo();
//        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||");

//        lista.buscar(3);
//        System.out.println(lista.buscar(3));

    }
}
