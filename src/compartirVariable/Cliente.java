package compartirVariable;

public class Cliente {


private int idCliente;
    private int edad;
    private double saldo;


    public Cliente(int idCliente,int edad, double saldo) {
        this.idCliente=idCliente;
        this.edad=edad;
        this.saldo=saldo;
    }

    public Cliente() {
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "{"+"Id"+"\""+idCliente+"\""+"edad\":"+"\""+edad+"\", "+"\"saldo\":"+"\""+saldo+"\""+"}";
    }
}
