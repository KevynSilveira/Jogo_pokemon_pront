package jogocomando;

import java.util.Random;

public class Dragapult extends DadosPokemon {

    //Implementação do random
    Random ataqueDragapult = new Random();

    //Construtor
    public Dragapult() {
    }

    //Exibir dados
    public final void dadosDragapult() {
        System.out.println("Level " + super.getLevel_Dragapult());
        System.out.println(super.getVida_Dragapult() + " pontos de vida.");
        System.out.println(super.getSpeed_Dragapult() + " pontos de speed.");
        System.out.println("\nAtaques");
        System.out.println("Draco meteor\nDragon pulse\nShadow claw\nDragon darts\n");
    }

    //ATAQUES DRAGAPULT
    //Ataque draco meteor tira um dano de 50 a 120 de dano.
    public final void dracoMeteor() {

        System.out.println("Dragapult usou Draco meteor!");
        this.dano = ataqueDragapult.nextInt(50, 120);
        super.setVida_Kyogre(super.getVida_Kyogre() - this.dano);
        System.out.println("Draco meteor tirou " + this.dano + " pontos de vida de Kyogre.");

        if (super.getVida_Kyogre() <= 0) {
            super.setVida_Kyogre(0);
            super.setKyogreDerrotado(true);
        }
        System.out.println("Kyogre ficou com " + super.getVida_Kyogre() + " pontos de vida.\n");
    }

    //Ataque Dragon pulse tira um dano de 40 a 90 de dano.
    public final void DragonPulse() {

        System.out.println("Dragapult usou Dragon pulse!");
        this.dano = ataqueDragapult.nextInt(40, 90);
        super.setVida_Kyogre(super.getVida_Kyogre() - this.dano);
        System.out.println("Dragon pulse tirou " + this.dano + " pontos de vida de Kyogre.");

        if (super.getVida_Kyogre() <= 0) {
            super.setVida_Kyogre(0);
            super.setKyogreDerrotado(true);
        }
        System.out.println("Kyogre ficou com " + super.getVida_Kyogre() + " pontos de vida.\n");
    }

    //Ataque Shadow claw tira um dano de 50 a 70
    public final void shadowClaw() {

        System.out.println("Dragapult usou Shadow claw!");
        this.dano = ataqueDragapult.nextInt(50, 70);
        super.setVida_Kyogre(super.getVida_Kyogre() - this.dano);
        System.out.println("Shadow claw tirou " + this.dano + " pontos de vida de Kyogre.");

        if (super.getVida_Kyogre() <= 0) {
            super.setVida_Kyogre(0);
            super.setKyogreDerrotado(true);
        }

        System.out.println("Kyogre ficou com " + super.getVida_Kyogre() + " pontos de vida.\n");
    }

    //Ataque Dragon dance aumenta a speed do usuário 10 a 30 pontos de speed.
    public final void DragonDarts() {

        System.out.println("Dragapult usou Dragon darts!");
        this.dano = ataqueDragapult.nextInt(30, 50);
        int receber = this.dano;
        this.dano = ataqueDragapult.nextInt(30, 50);
        this.dano = this.dano + receber;
        super.setVida_Kyogre(super.getVida_Kyogre() - this.dano);
        System.out.println("Dragon darts tirou " + this.dano + " pontos de vida de Kyogre.");

        if (super.getVida_Kyogre() <= 0) {
            super.setVida_Kyogre(0);
            super.setKyogreDerrotado(true);
        }

        System.out.println("Kyogre ficou com " + super.getVida_Kyogre() + " pontos de vida.\n");
    }
}
