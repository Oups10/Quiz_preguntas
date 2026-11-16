import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] preguntes = new String[50];
        String [][] opcions = new String[preguntes.length][4];
        String [] resposta = new String [preguntes.length];
        String respostauser;
        int usercorrectes = 0;

        for (int i = 0; i< preguntes.length; i++){
            System.out.println(preguntes[i]);
            for (int j=0; j<opcions[i].length; j++){
                System.out.println(opcions[i][j]);
            }
            do {
                respostauser = input.next();
                if (respostauser.equalsIgnoreCase("a") || respostauser.equalsIgnoreCase("b") || respostauser.equalsIgnoreCase("c") || respostauser.equalsIgnoreCase("d")) {
                    if (respostauser.equalsIgnoreCase(resposta[i])) {
                        System.out.println("Resposta correcta");
                        usercorrectes ++;
                    } else {
                        System.out.println("Resposta incorrecta, la resposta correcta és: " + resposta[i]);
                    }
                } else {
                    System.out.println("Resposta no vàlida: a,b,c,d");
                }
            } while (!(respostauser.equalsIgnoreCase("a") || respostauser.equalsIgnoreCase("b") || respostauser.equalsIgnoreCase("c") || respostauser.equalsIgnoreCase("d")));
        }
        System.out.println("En tot el quiz has respost " + usercorrectes + "preguntes correctes.");
    }
}