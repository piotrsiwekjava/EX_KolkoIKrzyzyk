import java.util.Scanner;

public class J19_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] gra = new int[3][3];
        int zawodnik = 1;

        while (true) {

            for (int i = 0; i < 3; i++) {

                for (int j = 0; j < 3; j++) {

                    System.out.print(gra[i][j]);
                }
                System.out.println();
            }


            System.out.println("Podaj wsp. X zawodnik (" + zawodnik + ")");
            int x = sc.nextInt();
            System.out.println("Podaj wsp. y zawodnik (" + zawodnik + ")");
            int y = sc.nextInt();

            if (zawodnik==1 && gra[x][y]==1){ //moduł utraty kolejki gdy ta już jest zajęte pole
                zawodnik=2;
            }
            else if (zawodnik==1 && gra[x][y]==2) {
                zawodnik = 2;
            }
            else if (zawodnik==2 && gra[x][y]==1) {
                zawodnik = 1;
            }
            else if (zawodnik==2 && gra[x][y]==2) {
                zawodnik = 1;
            }
            else if (gra[x][y]!=1 && gra[x][y]!=2) {
                gra[x][y] = zawodnik;
                if (zawodnik == 1) {
                    zawodnik = 2;
                } else {
                    zawodnik = 1;
                }
            }
            if (((gra[0][0]==2)&&(gra[0][1]==2)&&(gra[0][2]==2)) ||
                    ((gra[1][0]==2)&&(gra[1][1]==2)&&(gra[2][2]==2)) ||
                    ((gra[2][0]==2)&&(gra[2][1]==2)&&(gra[2][2]==2)) ||
                    ((gra[0][0]==2)&&(gra[1][0]==2)&&(gra[2][0]==2)) ||
                    ((gra[0][1]==2)&&(gra[1][1]==2)&&(gra[2][1]==2)) ||
                    ((gra[0][2]==2)&&(gra[1][2]==2)&&(gra[2][2]==2)) ||
                    ((gra[0][0]==2)&&(gra[1][1]==2)&&(gra[2][2]==2)) ||
                    ((gra[0][2]==2)&&(gra[1][1]==2)&&(gra[2][0]==2))
            )
            {
                System.out.println("Wygrywa zawodnik 2");
                System.out.println("Koniec gry");
                break;
            }
            if (((gra[0][0]==1)&&(gra[0][1]==1)&&(gra[0][2]==1)) ||
                    ((gra[1][0]==1)&&(gra[1][1]==1)&&(gra[2][2]==1)) ||
                    ((gra[2][0]==1)&&(gra[2][1]==1)&&(gra[2][2]==1)) ||
                    ((gra[0][0]==1)&&(gra[1][0]==1)&&(gra[2][0]==1)) ||
                    ((gra[0][1]==1)&&(gra[1][1]==1)&&(gra[2][1]==1)) ||
                    ((gra[0][2]==1)&&(gra[1][2]==1)&&(gra[2][2]==1)) ||
                    ((gra[0][0]==1)&&(gra[1][1]==1)&&(gra[2][2]==1)) ||
                    ((gra[0][2]==1)&&(gra[1][1]==1)&&(gra[2][0]==1))
            )
            {
                System.out.println("Wygrywa zawodnik 1");
                System.out.println("Koniec gry");
                break;
            }
            if ((gra[0][0]!=0)&& (gra[0][1]!=0)&&(gra[0][2]!=0)&& //model zakończenia gry gdy brak wolnego pola
                    (gra[1][0]!=0)&&(gra[1][1]!=0)&&(gra[1][2]!=0)&&
                    (gra[2][0]!=0)&&(gra[2][1]!=0)&&(gra[2][2]!=0)){
                System.out.println("Brak roztrzygnięcia - KONIEC GRY");
            }

        }

    }
}
