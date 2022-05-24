package jogocomando;

import java.util.Random;

public class Lucario extends DadosPokemon {

    //implementação do Random
    Random ataqueLucario = new Random();

    //Construtor
    public Lucario() {
    }

    //exibir dados
    public final void dadosLucario() {
        System.out.println("Level " + super.getLevel_Lucario());
        System.out.println(super.getVida_Lucario() + " pontos de vida.");
        System.out.println(super.getSpeed_Lucario() + " pontos de speed.");
        System.out.println("\nAtaques");
        System.out.println("Focus punch\nAura sphere\nClose combat\ncrunch\n");
    }

    //ATAQUES LUCÁRIO
    //Ataque focus punch tira de 40 a 110 de dano
    public final void focusPunch() {
        System.out.println("\nLucário usou Focus punch!");
        this.dano = ataqueLucario.nextInt(40, 70);
        super.setVida_Kyogre(super.getVida_Kyogre() - this.dano);

        System.out.println("Focus punch tirou " + this.dano + " pontos de vida de Kyogre.");
        if (super.getVida_Kyogre() <= 0) {
            super.setVida_Kyogre(0);
            super.setKyogreDerrotado(true);
        }
        System.out.println("Kyogre ficou com " + super.getVida_Kyogre() + " pontos de vida.\n");
    }

    //Ataque aura sphere tira de 50 a 80 de dano
    public final void auraSphere() {
        System.out.println("\nLucário usou Aura Sphere!");
        this.dano = ataqueLucario.nextInt(40, 80);
        super.setVida_Kyogre(super.getVida_Kyogre() - this.dano);

        System.out.println("Aura sphere tirou " + this.dano + " pontos de vida de Kyogre.");
        if (super.getVida_Kyogre() <= 0) {
            super.setVida_Kyogre(0);
            super.setKyogreDerrotado(true);
        }
        System.out.println("Kyogre ficou com " + super.getVida_Kyogre() + " pontos de vida.\n");
    }

    //Ataque swords dances aumenta a velocidade do usuário de 10 a 30 pontos de speeds
    public final void CloseCombat() {

        System.out.println("\nLucário usou Close combat!");
        this.dano = ataqueLucario.nextInt(40, 120);
        super.setVida_Kyogre(super.getVida_Kyogre() - this.dano);
        System.out.println("Close combat tirou " + this.dano + " pontos de vida de Kyogre.");

        if (super.getVida_Kyogre() <= 0) {
            super.setVida_Kyogre(0);
            super.setKyogreDerrotado(true);
        }
        System.out.println("Kyogre ficou com " + super.getVida_Kyogre() + " pontos de vida.\n");

    }

    //Ataques crunch tira de 60 a 80 de dano
    public final void crunch() {

        System.out.println("\nLucário usou Crunch!");
        this.dano = ataqueLucario.nextInt(50, 70);
        super.setVida_Kyogre(super.getVida_Kyogre() - this.dano);

        System.out.println("Crunch tirou " + this.dano + " pontos de vida de Kyogre.");
        if (super.getVida_Kyogre() <= 0) {
            super.setVida_Kyogre(0);
            super.setKyogreDerrotado(true);
        }
        System.out.println("Kyogre ficou com " + super.getVida_Kyogre() + " pontos de vida.\n");
    }

}
