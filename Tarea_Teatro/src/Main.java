public class Main {
    public static void main(String[] args) {
    Asiento matriz[][]=new Asiento[10][8];
    int count = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                    if (i==0){
                        matriz[i][j] = new Asiento(10, "Plastico", true, count+1);
                    } else if (i<4) {
                        matriz[i][j] = new Asiento(10, "Plastico", false, count+1);
                    } else{
                        matriz[i][j] = new Asiento(6, "Plastico", false, count+1);
                    }
                    count++;
                    System.out.println(matriz[i][j]);//Muestra la información de todos los asientos

            }
        }
        System.out.println("----------");
        System.out.println(matriz[1][0]);//Puede ver la información del asiento que desee

        System.out.println("----------");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("\nFila " + (i+1) + ":");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(" "+(matriz[i][j].getNo_asiento()));
            }

        }

    }
}