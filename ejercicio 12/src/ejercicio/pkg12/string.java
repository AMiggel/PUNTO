package ejercicio.pkg12;

class string {

     String NOM;
        double NHT,HEE8,HET;
        double VHN,SALARIO;
        
    double calcular(double NHT, double VHN) {

        if (NHT > 40) {
            HET = NHT - 40;
            if (HET > 8) {
                HEE8 = HET - 8;
                SALARIO = 40 * VHN + 16 * VHN + HEE8 * 3 * VHN;
            } else {
                SALARIO = 40 * VHN + HET * 2 * VHN;
            }
        } else {
            SALARIO = NHT * VHN;
        }

        return SALARIO;

    }
}
