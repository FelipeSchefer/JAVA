package aula07;
public class UltraEmojiCombat {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Pretty Boy", "França",31, 1.75f, 68.9f, 11, 2, 1);
        l[1] = new Lutador("Putscrit", "Brasil", 29, 1.68f, 68.9f, 11, 2, 1);
        l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        l[3] = new Lutador("Deadcode", "Austália", 28, 1.93f, 81.6f, 13, 0, 1);
        l[4] = new Lutador("UOCobol", "Mexico", 37, 1.70f, 119.3f, 5, 4, 3);
        l[5] = new Lutador("Nerdaart", "Japão", 30, 1.81f, 105.7f, 12, 2, 4);
        
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[2], l[3]);
        UEC01.lutar();
        l[2].status();
        l[3].status();
    }   
}
