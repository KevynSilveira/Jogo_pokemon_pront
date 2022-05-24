package jogocomando;

public class DadosPokemon {

    //Atributos gerais
    protected int dano;
    private boolean derrotado;

    //Atributos Kyogre
    protected int level_Kyogre = 70;
    protected int vida_Kyogre = 300;
    protected int speed_Kyogre = 100;
    private boolean kyogreDerrotado;

    //Atributos Lucario  
    protected int level_Lucario = 50;
    protected int vida_Lucario = 250;
    protected int speed_Lucario = 120;
    private boolean lucarioDerrotado;

    //atributos alakazam
    protected int level_Alakazam = 55;
    protected int vida_Alakazam = 200;
    protected int speed_Alakazam = 105;
    private boolean alakazamDerrotado;

    //Atributos dragapult
    protected int level_Dragapult = 60;
    protected int vida_Dragapult = 185;
    protected int speed_Dragapult = 210;
    private boolean dragapultDerrotado;

    //Métodos  
    //Método de resetar a partida
    public final void reset() {

        //resetando a vida dos pokemons
        this.vida_Lucario = 250;
        this.vida_Kyogre = 300;
        this.vida_Alakazam = 200;
        this.vida_Dragapult = 185;

        //regulando suas velocidades
        this.speed_Kyogre = 100;
        this.speed_Lucario = 120;
        this.speed_Alakazam = 105;
        this.speed_Dragapult = 210;

    }

    //apresentacao do Rival a batalha exibindo seus dados
    public final void gerarEspacamento() {
        System.out.println("-------------------------------------------------------------------------");
    }

    //apresentacao dos dados do lucário a batalha
    public final void apresentacaoLucario() {
        System.out.println("Selecione um ataque:\n1-Focus punch\n2-Aura Sphere\n3-Swords Dances\n4-Crunch");
    }

    //apresentação dos dados do Alakazam a batalha
    public final void apresentacaoAlakazam() {
        System.out.println("Selecione um ataque:\n1-Psychic\n2-Recover\n3-Zen heabut\n4-Quick atack");
    }

    //apresentação dos dados do dragapult a batalha
    public final void apresentacaoDragapult() {
        System.out.println("Selecione um ataque:\n1-Draco meteor\n2-Dragon pulse\n3-Dragon dance\n4-Shadow claw");
    }

    //contrutor
    public DadosPokemon() {
    }

    //Getters e Setters GERAIS
    public int getDano() {
        return dano;
    }

    //get dano
    public void setDano(int dano) {
        this.dano = dano;
    }

    //set dano
    public boolean getDerrotado() {
        return derrotado;
    }

    //get derrotado
    public void setDerrotado(boolean derrotado) {
        this.derrotado = derrotado;
    }
    //set derrotado

    //getters e setters LUCARIO
    public int getLevel_Lucario() {
        return level_Lucario;
    }

    //get level lucário
    public void setLevel_Lucario(int level_Lucario) {
        this.level_Lucario = level_Lucario;
    }

    //set level lucário
    public int getVida_Lucario() {
        return vida_Lucario;
    }

    //get vida lucário
    public void setVida_Lucario(int vida_Lucario) {
        this.vida_Lucario = vida_Lucario;
    }

    //set vida lucário
    public int getSpeed_Lucario() {
        return speed_Lucario;
    }

    //get speed lucário
    public void setSpeed_Lucario(int speed_Lucario) {
        this.speed_Lucario = speed_Lucario;
    }
    //set speed lucário

    //getters e setters KYOGRE
    public int getLevel_Kyogre() {
        return level_Kyogre;
    }

    //get level Kyogre
    public void setLevel_Kyogre(int level_Kyogre) {
        this.level_Kyogre = level_Kyogre;
    }

    //set level Kyogre 
    public int getVida_Kyogre() {
        return vida_Kyogre;
    }

    //get vida Kyogre
    public void setVida_Kyogre(int vida_Kyogre) {
        this.vida_Kyogre = vida_Kyogre;
    }

    //set vida Kyogre
    public int getSpeed_Kyogre() {
        return speed_Kyogre;
    }

    //get speed Kyogre
    public void setSpeed_Kyogre(int speed_Kyogre) {
        this.speed_Kyogre = speed_Kyogre;
    }
    //set speed Kyogre

    //getters e setters ALAKAZAM
    public int getLevel_Alakazam() {
        return level_Alakazam;
    }

    //get level alakazam
    public void setLevel_Alakazam(int level_Alakazam) {
        this.level_Alakazam = level_Alakazam;
    }

    //set level alakazam
    public int getVida_Alakazam() {
        return vida_Alakazam;
    }

    //get vida alakazam
    public void setVida_Alakazam(int vida_Alakazam) {
        this.vida_Alakazam = vida_Alakazam;
    }

    //set vida alakazam
    public int getSpeed_Alakazam() {
        return speed_Alakazam;
    }

    //get speed alakazam
    public void setSpeed_Alakazam(int speed_Alakazam) {
        this.speed_Alakazam = speed_Alakazam;
    }
    //set speed alakazam

    //getters e setters DRAGAPULT
    public int getLevel_Dragapult() {
        return level_Dragapult;
    }

    //get level dragapult
    public void setLevel_Dragapult(int level_Dragapult) {
        this.level_Dragapult = level_Dragapult;
    }

    //set level dragapult
    public int getVida_Dragapult() {
        return vida_Dragapult;
    }

    //get vida dragapult
    public void setVida_Dragapult(int vida_Dragapult) {
        this.vida_Dragapult = vida_Dragapult;
    }

    //set vida dragapult
    public int getSpeed_Dragapult() {
        return speed_Dragapult;
    }

    //get speed dragapult
    public void setSpeed_Dragapult(int speed_Dragapult) {
        this.speed_Dragapult = speed_Dragapult;
    }
    //set vida dragapult

    //POKEMONS DERROTADOS
    //KYOGRE
    public boolean getKyogreDerrotado() {
        return kyogreDerrotado;
    }

    //get kyogre derrotado
    public void setKyogreDerrotado(boolean kyogreDerrotado) {
        this.kyogreDerrotado = kyogreDerrotado;
    }
    //set kyogre derrotado

    //LUCÁRIO
    public boolean getLucarioDerrotado() {
        return lucarioDerrotado;
    }

    //get lucário derrotado
    public void setLucarioDerrotado(boolean lucarioDerrotado) {
        this.lucarioDerrotado = lucarioDerrotado;
    }
    //set lucario derrotado

    //ALAKAZAM
    public boolean getAlakazamDerrotado() {
        return alakazamDerrotado;
    }

    //get alakazam derrotado
    public void setAlakazamDerrotado(boolean alakazamDerrotado) {
        this.alakazamDerrotado = alakazamDerrotado;
    }
    //set alakazam derrotado

    //DRAGAPULT
    public boolean getDragapultDerrotado() {
        return dragapultDerrotado;
    }

    //get dragapult derrotado
    public void setDragapultDerrotado(boolean dragapultDerrotado) {
        this.dragapultDerrotado = dragapultDerrotado;
    }
    //set dragapult derrotado

}
