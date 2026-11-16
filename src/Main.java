import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] preguntes = new String[50];
        String [][] opcions = new String[preguntes.length][4];
        String respostauser;
        int usercorrectes = 0;
            preguntes[0] = "Qui va crear el llenguatge Java?";
            preguntes[1] = "Quina extensió té un fitxer Java?";
            preguntes[2] = "Quin mètode permet iniciar un programa Java?";
            preguntes[3] = "Quina paraula clau permet declarar una classe en Java?";
            preguntes[4] = "Quina ordre permet compilar un fitxer Java?";
            preguntes[5] = "Quin tipus de dada permet guardar nombres enters?";
            preguntes[6] = "Quin tipus de dada permet guardar text?";
            preguntes[7] = "Quin valor representa cert en Java?";
            preguntes[8] = "Quin símbol acaba normalment una instrucció Java?";
            preguntes[9] = "Quina instrucció permet mostrar un text a la consola?";
            preguntes[10] = "Quin tipus de dada permet guardar nombres decimals?";
            preguntes[11] = "Quin operador serveix per sumar?";
            preguntes[12] = "Quin operador serveix per comparar si dos valors són iguals?";
            preguntes[13] = "Quin operador representa el «I» lògic?";
            preguntes[14] = "Quina paraula clau permet declarar una constant?";
            preguntes[15] = "Quin és el resultat de 10 % 3?";
            preguntes[16] = "Quin tipus de dada permet guardar un únic caràcter?";
            preguntes[17] = "Quin és el valor per defecte d'un atribut boolean d'una classe?";
            preguntes[18] = "Quin operador permet incrementar una variable en 1?";
            preguntes[19] = "Quin és el resultat de 5 + 3 * 2?";
            preguntes[20] = "Quina paraula clau permet crear una condició?";
            preguntes[21] = "Quina paraula clau permet definir una alternativa després d'un if?";
            preguntes[22] = "Quin bucle repeteix un codi mentre una condició sigui certa?";
            preguntes[23] = "Quin bucle s'utilitza habitualment quan sabem el nombre de repeticions?";
            preguntes[24] = "Quina paraula clau permet sortir immediatament d'un bucle?";
            preguntes[25] = "Quina paraula clau permet passar directament a la següent iteració d'un bucle?";
            preguntes[26] = "Quina estructura permet escollir entre diverses opcions?";
            preguntes[27] = "Quantes vegades s'executa aquest bucle? for (int i = 0; i < 5; i++)";
            preguntes[28] = "Quin és el resultat d'aquesta condició? 10 > 5";
            preguntes[29] = "Quin bucle s'executa almenys una vegada encara que la condició sigui falsa?";
            preguntes[30] = "Què significa POO?";
            preguntes[31] = "Què és una classe en Java?";
            preguntes[32] = "Què és un objecte?";
            preguntes[33] = "Quina paraula clau permet crear un objecte?";
            preguntes[34] = "Quina paraula clau permet heretar d'una altra classe?";
            preguntes[35] = "Quina paraula clau permet implementar una interfície?";
            preguntes[36] = "Quina és la funció d'un constructor?";
            preguntes[37] = "Quina paraula clau permet fer referència a l'objecte actual?";
            preguntes[38] = "Quin modificador permet que un atribut només sigui accessible dins de la seva classe?";
            preguntes[39] = "Quin concepte permet tenir diversos mètodes amb el mateix nom però amb paràmetres diferents?";
            preguntes[40] = "Quina paraula clau permet gestionar una possible excepció?";
            preguntes[41] = "Quin bloc s'utilitza per capturar una excepció?";
            preguntes[42] = "Quina paraula clau permet llançar una excepció manualment?";
            preguntes[43] = "Quina paraula clau permet indicar que un mètode pot llançar una excepció?";
            preguntes[44] = "Quina és la funció del bloc finally?";
            preguntes[45] = "Quina paraula clau permet declarar un mètode que pertany a la classe i no a una instància?";
            preguntes[46] = "Quina classe permet treballar amb llistes dinàmiques en Java?";
            preguntes[47] = "En quin paquet es troba la classe Scanner?";
            preguntes[48] = "Quina paraula clau impedeix que una classe pugui ser heretada?";
            preguntes[49] = "Què significa JVM?";

            opcions[0] = new String[]{"A. Bill Gates", "B. James Gosling", "C. Mark Zuckerberg", "D. Steve Jobs"};
            opcions[1] = new String[]{"A. .js", "B. .html", "C. .java", "D. .py"};
            opcions[2] = new String[]{"A. start()", "B. main()", "C. run()", "D. begin()"};
            opcions[3] = new String[]{"A. function", "B. class", "C. define", "D. object"};
            opcions[4] = new String[]{"A. java", "B. compile", "C. javac", "D. run"};
            opcions[5] = new String[]{"A. String", "B. int", "C. boolean", "D. char"};
            opcions[6] = new String[]{"A. int", "B. double", "C. String", "D. float"};
            opcions[7] = new String[]{"A. yes", "B. true", "C. 1", "D. correct"};
            opcions[8] = new String[]{"A. :", "B. .", "C. ;", "D. ,"};
            opcions[9] = new String[]{"A. Console.write()", "B. System.out.println()", "C. print.console()", "D. echo()"};
            opcions[10] = new String[]{"A. int", "B. boolean", "C. double", "D. char"};
            opcions[11] = new String[]{"A. -", "B. +", "C. *", "D. /"};
            opcions[12] = new String[]{"A. =", "B. ==", "C. !=", "D. >="};
            opcions[13] = new String[]{"A. ||", "B. !", "C. &&", "D. =="};
            opcions[14] = new String[]{"A. static", "B. final", "C. const", "D. constant"};
            opcions[15] = new String[]{"A. 3", "B. 1", "C. 0", "D. 2"};
            opcions[16] = new String[]{"A. String", "B. char", "C. int", "D. boolean"};
            opcions[17] = new String[]{"A. true", "B. 1", "C. false", "D. null"};
            opcions[18] = new String[]{"A. --", "B. ++", "C. +=2", "D. **"};
            opcions[19] = new String[]{"A. 16", "B. 13", "C. 11", "D. 10"};
            opcions[20] = new String[]{"A. when", "B. if", "C. check", "D. condition"};
            opcions[21] = new String[]{"A. else", "B. other", "C. otherwise", "D. next"};
            opcions[22] = new String[]{"A. if", "B. while", "C. switch", "D. case"};
            opcions[23] = new String[]{"A. if", "B. while", "C. for", "D. switch"};
            opcions[24] = new String[]{"A. stop", "B. exit", "C. break", "D. return"};
            opcions[25] = new String[]{"A. skip", "B. continue", "C. next", "D. pass"};
            opcions[26] = new String[]{"A. switch", "B. while", "C. for", "D. try"};
            opcions[27] = new String[]{"A. 4 vegades", "B. 5 vegades", "C. 6 vegades", "D. 10 vegades"};
            opcions[28] = new String[]{"A. false", "B. null", "C. true", "D. 0"};
            opcions[29] = new String[]{"A. for", "B. while", "C. do while", "D. foreach"};
            opcions[30] = new String[]{"A. Programació Orientada a Objectes", "B. Programa Organitzat Obert", "C. Programació Optimitzada Ordinària", "D. Protocol Orientat a Ordinadors"};
            opcions[31] = new String[]{"A. Un bucle", "B. Un model per crear objectes", "C. Una variable", "D. Una condició"};
            opcions[32] = new String[]{"A. Una instància d'una classe", "B. Un mètode", "C. Un bucle", "D. Un operador"};
            opcions[33] = new String[]{"A. class", "B. create", "C. new", "D. object"};
            opcions[34] = new String[]{"A. implements", "B. extends", "C. inherits", "D. super"};
            opcions[35] = new String[]{"A. extends", "B. implements", "C. interface", "D. inherit"};
            opcions[36] = new String[]{"A. Eliminar una classe", "B. Inicialitzar un objecte", "C. Aturar un programa", "D. Compilar un fitxer"};
            opcions[37] = new String[]{"A. this", "B. self", "C. current", "D. object"};
            opcions[38] = new String[]{"A. public", "B. protected", "C. private", "D. static"};
            opcions[39] = new String[]{"A. Herència", "B. Encapsulació", "C. Sobrecàrrega (Overloading)", "D. Abstracció"};
            opcions[40] = new String[]{"A. try", "B. check", "C. error", "D. catcher"};
            opcions[41] = new String[]{"A. finally", "B. catch", "C. throw", "D. throws"};
            opcions[42] = new String[]{"A. throws", "B. catch", "C. throw", "D. exception"};
            opcions[43] = new String[]{"A. throw", "B. throws", "C. try", "D. finally"};
            opcions[44] = new String[]{"A. S'executa només si apareix un error", "B. S'executa normalment després dels blocs try i catch", "C. Atura el programa", "D. Crea una excepció"};
            opcions[45] = new String[]{"A. private", "B. final", "C. static", "D. public"};
            opcions[46] = new String[]{"A. ArrayList", "B. Scanner", "C. String", "D. Integer"};
            opcions[47] = new String[]{"A. java.io", "B. java.util", "C. java.lang", "D. java.net"};
            opcions[48] = new String[]{"A. static", "B. private", "C. final", "D. abstract"};
            opcions[49] = new String[]{"A. Java Variable Method", "B. Java Virtual Machine", "C. Java Visual Model", "D. Java Version Manager"};

            String[] resposta = {"B", "C", "B", "B", "C", "B", "C", "B", "C", "B", "C", "B", "B", "C", "B", "B", "B", "C", "B", "C", "B", "A", "B", "C", "C", "B", "A", "B", "C", "C", "A", "B", "A", "C", "B", "B", "B", "A", "C", "C", "A", "B", "C", "B", "B", "C", "A", "B", "C", "B"};

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