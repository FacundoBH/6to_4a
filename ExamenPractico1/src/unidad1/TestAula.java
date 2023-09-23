package unidad1;

public class TestAula {
	
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Berardi Hernandez", "Facundo Nicolas", 17, 47156827, "6to4ta", 2023);
        Estudiante estudiante2 = new Estudiante("Rodriguez", "Paula", 19, 45678097, "7mo3ra", 2023);
        Estudiante estudiante3 = new Estudiante("Lopez", "Luca Nahuel", 18, 45678098, "6to4ta", 2023);

        Profesor profesor1 = new Profesor("Mauricio", "Bedacarratz", 45, 32987123, 20, 27);
       

        System.out.println("Datos de los estudiantes:");
        System.out.println(estudiante1.misDatos());
        System.out.println(estudiante2.misDatos());
        System.out.println(estudiante3.misDatos());


        System.out.println("Datos del Profesor 1:");
        System.out.println(profesor1.misDatos());
    }
}
