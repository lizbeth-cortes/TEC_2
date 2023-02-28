import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList arboles = new ArrayList<Arbol>();
        arboles.add(new Arbol("Roble",25, 200,"Frío","Asia y América"));
        arboles.add(new Arbol("Cerezo", 30,40,"Templado","Japón"));
        arboles.add(new Arbol("Pino", 24,300,"Templado húmedo","Hemisferio Norte"));
        arboles.add(new Arbol("Jacaranda", 20,100,"Templado","México, Paraguay, Bolivia, sur de Brasil y norte de Argentina."));
        System.out.println(arboles);


    }
}