public class Ejercicio9 {
   
    public static void main(String[] args) {
        System.out.println("El cliente:");

        Cliente cliente1 = new Cliente();

        // Establecer edad e imprimir
        cliente1.setEdad(17);
        System.out.println(cliente1.getEdad());

        // Establecer nombre e imprimir
        cliente1.setNombre("Daniel");
        System.out.println(cliente1.getNombre());

        // Establecer telefono e imprimir
        cliente1.setTelefono(606711110);
        System.out.println(cliente1.getTelefono());

        // Establecer credito e imprimir
        cliente1.setCredito(1500);
        System.out.println(cliente1.getCredito());

        System.out.println("El trabajador:");

        Trabajador trabajador1 = new Trabajador();

        // Establecer edad e imprimir
        trabajador1.setEdad(23);
        System.out.println(trabajador1.getEdad());

        // Establecer nombre e imprimir
        trabajador1.setNombre("Pedro");
        System.out.println(trabajador1.getNombre());

        // Establecer telefono e imprimir
        trabajador1.setTelefono(673046432);
        System.out.println(trabajador1.getTelefono());

        // Establecer salario e imprimir
        trabajador1.setSalario(2300);
        System.out.println(trabajador1.getSalario());

    }

}

class Persona {
    public int edad;
    public String nombre;
    public int telefono;
}

class Cliente extends Persona {
    public int credito;

    // Edad
    public void setEdad(int edadNueva) {
        this.edad = edadNueva;
    }

    public int getEdad() {
        return edad;
    }

    // Nombre
    public void setNombre(String nombreNuevo) {
        this.nombre = nombreNuevo;
    }

    public String getNombre() {
        return nombre;
    }
    
    // Telefono
    public void setTelefono(int telefonoNuevo) {
        this.telefono = telefonoNuevo;
    }

    public int getTelefono() {
        return telefono;
    }

    // Credito
    public void setCredito(int creditoNuevo) {
        this.credito = creditoNuevo;
    }

    public int getCredito() {
        return credito;
    }
}

class Trabajador extends Persona {
    public int salario;

    // Edad
    public void setEdad(int edadNueva) {
        this.edad = edadNueva;
    }

    public int getEdad() {
        return edad;
    }

    // Nombre
    public void setNombre(String nombreNuevo) {
        this.nombre = nombreNuevo;
    }

    public String getNombre() {
        return nombre;
    }
    
    // Telefono
    public void setTelefono(int telefonoNuevo) {
        this.telefono = telefonoNuevo;
    }

    public int getTelefono() {
        return telefono;
    }

    // Salario
    public void setSalario(int salarioNuevo) {
        this.salario = salarioNuevo;
    }

    public int getSalario() {
        return salario;
    }
}
