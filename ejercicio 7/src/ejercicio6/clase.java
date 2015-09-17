package ejercicio6;

public class clase {

    int A, B;
    String resul;

    String mostrar_res(int A, int B) {
        if (A > B) {
            return "A es mayor que B";
        } else if (A == B) {
            return "A es igual a B";
        } else {

            return "B es mayor que A";

        }

    }
}
