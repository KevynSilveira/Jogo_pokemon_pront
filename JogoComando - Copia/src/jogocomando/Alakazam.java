package jogocomando;

import java.util.Random;

public class Alakazam extends DadosPokemon {

    //Implementação do random
    Random ataqueAlakazam = new Random();

    //Construtor
    public Alakazam() {
    }

    //Exibir dados
    public final void dadosAlakazam() {
        System.out.println("Level " + super.getLevel_Alakazam());
        System.out.println(super.getVida_Alakazam() + " pontos de vida.");
        System.out.println(super.getSpeed_Alakazam() + " pontos de speed.");
        System.out.println("\nAtaques");
        System.out.println("Psychic\nConfusion\nQuick atack\nPsychock\n");
    }

    //ATAQUES ALAKAZAM
    //Ataque psychic tira de 70 a 90 de dano;
    public final void psychic() {

        System.out.println("\nAlakazam usou psychic!");
        this.dano = ataqueAlakazam.nextInt(60, 100);
        super.setVida_Kyogre(super.getVida_Kyogre() - this.dano);
        System.out.println("Psychic tirou " + this.dano + " pontos de vida de Kyogre.");

        if (super.getVida_Kyogre() <= 0) {
            super.setVida_Kyogre(0);
            super.setKyogreDerrotado(true);
        }
        System.out.println("Kyogre ficou com " + super.getVida_Kyogre() + " pontos de vida.\n");
    }

    //Ataque recober recuperra de 10 a 40 pontos de vida
    public final void confusion() {

        System.out.println("\nAlakazam usou confusion!");
        this.dano = ataqueAlakazam.nextInt(60, 70);
        System.out.println("Confusion tirou " + this.dano + " pontos de vida de Kyogre.");
        super.setVida_Kyogre(super.getVida_Kyogre() - this.dano);

        if (super.getVida_Kyogre() <= 0) {
            super.setVida_Kyogre(0);
            super.setKyogreDerrotado(true);
        }
        System.out.println("Kyogre ficou com " + super.getVida_Kyogre() + " pontos de vida.\n");
    }

    //Ataque quick atack tira de 30 a 40 de vida 
    public final void quickAtack() {

        System.out.println("\nAlakazam usou quick atack!");
        this.dano = ataqueAlakazam.nextInt(50, 60);
        super.setVida_Kyogre(super.getVida_Kyogre() - this.dano);
        System.out.println("Quick atack tirou " + this.dano + " pontos de vida de Kyogre.");

        if (super.getVida_Kyogre() <= 0) {
            super.setVida_Kyogre(0);
            super.setKyogreDerrotado(true);
        }
        System.out.println("Kyogre ficou com " + super.getVida_Kyogre() + " pontos de vida.\n");
    }

    //Ataque psychoc tira de 40 a 60 de vida
    public final void psychock() {

        System.out.println("\nAlakazam usou psychock!");
        this.dano = ataqueAlakazam.nextInt(50, 80);
        super.setVida_Kyogre(super.getVida_Kyogre() - this.dano);
        System.out.println("Psychock tirou " + this.dano + " pontos de vida de Kyogre.");

        if (super.getVida_Kyogre() <= 0) {
            super.setVida_Kyogre(0);
            super.setKyogreDerrotado(true);
        }
        System.out.println("Kyogre ficou com " + super.getVida_Kyogre() + " pontos de vida.\n");
    }

}
