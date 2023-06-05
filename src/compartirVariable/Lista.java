package compartirVariable;

public class Lista {
    private Nodo primero, ultimo, actual;
    private int numReg;

    public Lista() {
        primero=ultimo=actual=null;
        numReg=0;
    }

    public void create(Nodo miNodo){
        if (primero==null){
            numReg++;
            primero=miNodo;
            primero.siguiente=null;
            ultimo=primero;
        } else if (primero==ultimo) {
            numReg++;
            ultimo=miNodo;
            ultimo.siguiente=null;
            primero.siguiente=ultimo;
        }else {
            numReg++;
            actual=ultimo;
            ultimo=miNodo;
            ultimo.siguiente=null;
            actual.siguiente=ultimo;
        }
    }

    public void listarTodo(){
        actual=primero;
        while (actual!=null){
            System.out.println(actual.getClienteNodo());
            actual=actual.siguiente;
        }
    }


    public Cliente buscar(int id){
        actual=primero;
        boolean encontrado=false;
        Cliente miClinete=null;
        while (actual!=null && !encontrado){
            miClinete= actual.getClienteNodo();
            if (miClinete.getIdCliente()==id){
                encontrado=true;
            }
            else actual=actual.siguiente;
//            System.out.println(actual.getClienteNodo());
//            encontrado=true;

        }return encontrado ? miClinete:null;
    }

    public void agregarOrdenado(Nodo nodoNuevo){
        Cliente miCVlientedlNodo= nodoNuevo.getClienteNodo();
        Cliente miClinete2=buscar(miCVlientedlNodo.getIdCliente());


        if (miClinete2==null){
            Nodo temp, busqueda;
            temp=nodoNuevo;
            temp.siguiente=null;

            busqueda=primero;
            if (busqueda==null){
                primero=temp;
            }else {
                boolean hallado=false;


            }
        }
        else System.out.println("ya existe");
    }

}
