import java.util.Random;

public class Words {
    private String[] randomWords = { "casa", "perro", "gato", "sol", "luna",
            "montana", "rio", "playa", "arbol", "flores",
            "ciudad", "coche", "bicicleta", "computadora", "telefono",
            "libro", "musica", "cafe", "amor", "familia",
            "felicidad", "viaje", "aventura", "estrella", "verano",
            "invierno", "primavera", "madera", "juego", "deporte"};  //Attribute
    private String selectedWord; //Attribute//Instance Variables
    private Random random = new Random(); //Attribute//Instance Variables
    private char[] letters; //Attribute//Instance Variables
    public Words() {
        selectedWord = randomWords[random.nextInt(randomWords.length)];
        letters = new char[selectedWord.length()];
    } //Constructor

    public String toString() {
        StringBuilder text = new StringBuilder();

        for(char letter: letters) {

            if(letter == '\u0000'){
                text.append('-');
            }else {
                text.append(letter);
            }
            text.append(' ');
        }

        return text.toString();
    }//Method

    public void guess(char letter) {
        for(int i=0; i<selectedWord.length(); i++){
            if(letter == selectedWord.charAt(i)){
                letters[i] = letter;
            }
        }
    }//Method

    public boolean youreRight() {
        for(char letter: letters){
            if(letter == '\u0000'){
                return false;
            }
        }
        return true;
    }//Method
}
