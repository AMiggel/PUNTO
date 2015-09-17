package ejercicio.pkg13;

public class CLASE {

    int PDES,color;
    double VALPAG;

    double calcular(int color, double VALCOMP) {

        if (color == 1) {
            PDES = 25;

        } else if (color == 2) {
            PDES = 10;

        } else if (color == 3) {
            PDES = 50;
        } else if (color == 4) {
            PDES = 0;
        } else {
            PDES = 100;
        }

        VALPAG = VALCOMP - PDES * VALCOMP / 100;
        return VALPAG;
    }

}
