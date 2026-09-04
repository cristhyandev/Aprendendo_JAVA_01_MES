import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
    Map<String,Integer> artilheiro = new HashMap<>();

    artilheiro.put("Neymar", 50);
    artilheiro.put("CR7", 972);
    artilheiro.put("Messi",910);


    artilheiro.forEach((jogador, gols) ->{
        System.out.println("O jogador " + jogador + " fez " + gols + " gols ");
        });
    }
}