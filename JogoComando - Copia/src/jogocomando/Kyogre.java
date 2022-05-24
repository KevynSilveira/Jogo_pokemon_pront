package jogocomando;

import java.util.Random;

public class Kyogre extends DadosPokemon {

    //implementando o Random 
    Random ataqueKyogre = new Random();

    //Contrutor
    public Kyogre() {

    }

    //Mostrar dados Kyogre
    public final void dadosKyogre() {
        System.out.println("Level " + super.getLevel_Kyogre());
        System.out.println(super.getVida_Kyogre() + " pontos de vida.");
        System.out.println(super.getSpeed_Kyogre() + " pontos de speed.");
        System.out.println("\nAtaques");
        System.out.println("Origem pulse\nWater gun\nWater pulse\nBody slam\n\n");
    }

    //ATAQUES KYOGRE PARA LUCÁRIO
    //Ataque Origem pulse tira de 50 a 100 de dano.
    public final void origemPulse_Lucario() {
        System.out.println("\nKyogre usou Orgiem pulse!");
        this.dano = ataqueKyogre.nextInt(50, 100);
        super.setVida_Lucario(super.getVida_Lucario() - this.dano);

        System.out.println("Origem pulse tirou " + this.dano + "pontos de vida Lucário.");
        if (super.getVida_Lucario() <= 0) {
            super.setVida_Lucario(0);
            super.setLucarioDerrotado(true);
        }
        System.out.println("Lucário ficou com " + super.getVida_Lucario() + " pontos de vida.\n");
    }

    //Ataque water gun tira de 40 a 50 de dano
    public final void waterGun_Lucario() {
        System.out.println("\nKyogre usou Water gun!");
        this.dano = ataqueKyogre.nextInt(40, 50);
        super.setVida_Lucario(super.getVida_Lucario() - this.dano);

        System.out.println("Water gun tirou " + this.dano + " pontos de vida de Lucário.");
        if (super.getVida_Lucario() <= 0) {
            super.setVida_Lucario(0);
            super.setLucarioDerrotado(true);
        }
        System.out.println("Lucário ficou com " + super.getVida_Lucario() + " pontos de vida.\n");
    }

    //Ataque Water pulse tira de 40 a 75 de dano
    public final void waterPulse_Lucario() {
        System.out.println("\nKyogre usou Water pulse!");
        this.dano = ataqueKyogre.nextInt(40, 75);
        super.setVida_Lucario(super.getVida_Lucario() - this.dano);

        System.out.println("Water pulse tirou " + this.dano + " pontos de vida de Lucário.");
        if (super.getVida_Lucario() <= 0) {
            super.setVida_Lucario(0);
            super.setLucarioDerrotado(true);
        }
        System.out.println("Lucário ficou com " + super.getVida_Lucario() + " pontos de vida. \n");
    }

    //Ataque Body Slam tira de 40 a 70 de dano
    public final void bodySlam_Lucario() {
        System.out.println("\nKyogre usou Body slam!");
        this.dano = ataqueKyogre.nextInt(40, 70);
        super.setVida_Lucario(super.getVida_Lucario() - this.dano);

        System.out.println("Body slam tirou " + this.dano + "pontos de vida de Lucário.");
        if (super.getVida_Lucario() <= 0) {
            super.setVida_Lucario(0);
            super.setLucarioDerrotado(true);
        }
        System.out.println("Lucário ficou com " + super.getVida_Lucario() + " pontos de vida.\n");
    }

    //ATAQUES KYOGRE PARA ALAKAZAM
    //Ataque Origem pulse tira de 50 a 100 de dano.
    public final void origemPulse_Alakazam() {
        System.out.println("\nKyogre usou Orgiem pulse!");
        this.dano = ataqueKyogre.nextInt(50, 100);
        super.setVida_Alakazam(super.getVida_Alakazam() - this.dano);

        System.out.println("Origem pulse tirou " + this.dano + " pontos de vida de Alakazam.");
        if (super.getVida_Alakazam() <= 0) {
            super.setVida_Alakazam(0);
            super.setAlakazamDerrotado(true);
        }
        System.out.println("Alakazam ficou com " + super.getVida_Alakazam() + " pontos de vida.\n");
    }

    //Ataque water gun tira de 40 a 50 de dano
    public final void waterGun_Alakazam() {
        System.out.println("\nKyogre usou Water gun!");
        this.dano = ataqueKyogre.nextInt(40, 50);
        super.setVida_Alakazam(super.getVida_Alakazam() - this.dano);

        System.out.println("Water gun tirou " + this.dano + " pontos de vida de Alakazam.");
        if (super.getVida_Alakazam() <= 0) {
            super.setVida_Alakazam(0);
            super.setAlakazamDerrotado(true);
        }
        System.out.println("Alakazam ficou com " + super.getVida_Alakazam() + " pontos de vida.\n");
    }

    //Ataque Water pulse tira de 40 a 75 de dano
    public final void waterPulse_Alakazam() {
        System.out.println("\nKyogre usou Water pulse!");
        this.dano = ataqueKyogre.nextInt(40, 75);
        super.setVida_Alakazam(super.getVida_Alakazam() - this.dano);

        System.out.println("Water pulse tirou " + this.dano + "pontos de vida de Alakazam.");
        if (super.getVida_Alakazam() <= 0) {
            super.setVida_Alakazam(0);
            super.setAlakazamDerrotado(true);
        }
        System.out.println("Alakazam ficou com " + super.getVida_Lucario() + " pontos de vida. \n");
    }
    //Ataque Body Slam tira de 40 a 70 de dano

    public final void bodySlam_Alakazam() {
        System.out.println("\nKyogre usou Body slam!");
        this.dano = ataqueKyogre.nextInt(40, 70);
        super.setVida_Alakazam(super.getVida_Alakazam() - this.dano);

        System.out.println("Body slam tirou " + this.dano + " pontos de vida de Alakazam.");
        if (super.getVida_Alakazam() <= 0) {
            super.setVida_Alakazam(0);
            super.setAlakazamDerrotado(true);
        }
        System.out.println("Alakazam ficou com " + super.getVida_Alakazam() + " pontos de vida.\n");
    }

    //ATAQUES KYOGRE PARA DRAGAPULT
    //Ataque Origem pulse tira de 50 a 100 de dano.
    public final void origemPulse_Dragapult() {
        System.out.println("\nKyogre usou Orgiem pulse!");
        this.dano = ataqueKyogre.nextInt(50, 100);
        super.setVida_Dragapult(super.getVida_Dragapult() - this.dano);

        System.out.println("Origem pulse tirou " + this.dano + " pontos de vida de Dragapult.");
        if (super.getVida_Dragapult() <= 0) {
            super.setVida_Dragapult(0);
            super.setDragapultDerrotado(true);
        }
        System.out.println("Dragapult ficou com " + super.getVida_Dragapult() + " pontos de vida.\n");
    }

    //Ataque water gun tira de 40 a 50 de dano
    public final void waterGun_Dragapult() {
        System.out.println("\nKyogre usou Water gun!");
        this.dano = ataqueKyogre.nextInt(40, 50);
        super.setVida_Dragapult(super.getVida_Dragapult() - this.dano);

        System.out.println("Water gun tirou " + this.dano + " pontos de vida de Dragapult.");
        if (super.getVida_Dragapult() <= 0) {
            super.setVida_Dragapult(0);
            super.setDragapultDerrotado(true);
        }
        System.out.println("Dragapult ficou com " + super.getVida_Dragapult() + " pontos de vida.\n");
    }

    //Ataque Water pulse tira de 40 a 75 de dano
    public final void waterPulse_Dragapult() {
        System.out.println("\nKyogre usou Water pulse!");
        this.dano = ataqueKyogre.nextInt(40, 75);
        super.setVida_Dragapult(super.getVida_Dragapult() - this.dano);

        System.out.println("Water pulse tirou " + this.dano + " pontos de vida de Dragapult.");
        if (super.getVida_Dragapult() <= 0) {
            super.setVida_Dragapult(0);
            super.setDragapultDerrotado(true);
        }
        System.out.println("Dragapult ficou com " + super.getVida_Dragapult() + " pontos de vida. \n");
    }

    //Ataque Body Slam tira de 40 a 70 de dano
    public final void bodySlam_Dragapult() {
        System.out.println("\nKyogre usou Body slam!");
        this.dano = ataqueKyogre.nextInt(40, 70);
        super.setVida_Dragapult(super.getVida_Dragapult() - this.dano);

        System.out.println("Body slam tirou " + this.dano + " pontos de vida de Dragapult.");
        if (super.getVida_Dragapult() <= 0) {
            super.setVida_Dragapult(0);
            super.setDragapultDerrotado(true);
        }
        System.out.println("Dragapult ficou com " + super.getVida_Dragapult() + " pontos de vida.\n");
    }
}
