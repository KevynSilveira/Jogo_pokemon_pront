package jogocomando;

import java.util.Random;
import java.util.Scanner;

public class JogoComando {

    public static void main(String[] args) {

        //ATRIBUTOS DA CLASSES PRINCIPAL
        
        String batalha;
        char revanche;
        boolean termino = false;
        String valor = " ";
        int contador;
        int valorAtaque;

        //IMPLEMENTAÇÃO
        
        //Implementando as classes dos pokemons
        Kyogre kyogre = new Kyogre();
        Lucario lucario = new Lucario();
        Alakazam alakazam = new Alakazam();
        Dragapult dragapult = new Dragapult();
        Treinador player = new Treinador();
        DadosPokemon comandos = new DadosPokemon();

        //implementando Scanner
        Scanner scan = new Scanner(System.in);

        //implementando Random
        Random gerar = new Random();

        //Pegando nome do treinador
        System.out.println("Fala ai irmão, suave?\nInsira seu nome e participe "
                + "de uma batalha insana contra Kyogre:");
        String nome = scan.next();
        player.setNome(nome);

        //Escolhendo Pokemon
        boolean registro = false;
        while (registro == false) {

            System.out.println("\n\nEai " + player.getNome() + " Você irá batalhar contra Kyogre.");
            System.out.println("Abaixo você irá ver as informações sobre esse lendário dos oceanos.\n");
            System.out.println("Pokemon: Kyogre");

            kyogre.dadosKyogre();

            System.out.println("Com essas informações escolha um dos pokemon abaixos para enfrenta-lo.\n");

            comandos.gerarEspacamento();
            System.out.println("\nDigite 1 para: Lucário");
            lucario.dadosLucario();
            comandos.gerarEspacamento();

            System.out.println("\nDigite 2 para: Alakazam");
            alakazam.dadosAlakazam();
            comandos.gerarEspacamento();

            System.out.println("\nDigite 3 para: Dragapult");
            dragapult.dadosDragapult();
            comandos.gerarEspacamento();

            String escolha = scan.next();
            switch (escolha) {

                case "1":
                    System.out.println("\nVocê escolheu Lucário.");
                    System.out.println("Prepare-se para batalha!\n");
                    valor = escolha;
                    registro = true;
                    break;

                case "2":
                    System.out.println("\nVocê escolheu Alakazam.");
                    System.out.println("Prepare-se para batalha!\n");
                    valor = escolha;
                    registro = true;
                    break;

                case "3":
                    System.out.println("\nVocê escolheu Dragapult.");
                    System.out.println("Prepare-se para batalha!\n");
                    valor = escolha;
                    registro = true;
                    break;

                default:
                    System.out.println("\nIrmão essa opção é invalida"
                            + ", volte e escolha uma que desejar.\n");
                    break;
            }
        }

        comandos.setDerrotado(false);
        switch (valor) {

            case "1":
                for (contador = 1; comandos.getDerrotado() == false; contador++) {

                    System.out.println(player.getNome() + " este é seu " + contador + "º round!");
                    System.out.println("Selecione um ataque:\n1-Focus punch"
                            + "\n2-Aura Sphere\n3-Close combat\n4-Crunch");

                    batalha = scan.next();

                    switch (batalha) {
                        case "1":
                            lucario.focusPunch();
                            break;
                        case "2":
                            lucario.auraSphere();
                            break;
                        case "3":
                            lucario.CloseCombat();
                            break;
                        case "4":
                            lucario.crunch();
                            break;
                        default:
                            System.out.println("\n########   ATENÇÃO   ########\n" + player.getNome() + " você acabou de perde um turno.\n");
                            break;
                    }

                    valorAtaque = gerar.nextInt(1, 4);

                    switch (valorAtaque) {
                        case 1:
                            kyogre.origemPulse_Lucario();
                            break;
                        case 2:
                            kyogre.waterGun_Lucario();
                            break;
                        case 3:
                            kyogre.waterPulse_Lucario();
                            break;
                        case 4:
                            kyogre.bodySlam_Lucario();
                            break;
                    }

                    if (lucario.getKyogreDerrotado() == true) {

                        System.out.println("\n\n########### Parabéns " + player.getNome() + " ###########\n");
                        System.out.println("Você ganhou partida\n");

                        while (termino == false) {

                            System.out.println("Deseja lutar novamente?\ns-sim\nn-não");

                            revanche = scan.next().charAt(0);
                            revanche = Character.toLowerCase(revanche);

                            switch (revanche) {

                                case 's':

                                    System.out.println("\n\nA batalha será reiniciada!\n");
                                    lucario.setVida_Kyogre(300);
                                    kyogre.setVida_Lucario(250);
                                    lucario.setKyogreDerrotado(false);
                                    kyogre.setLucarioDerrotado(false);
                                    contador = 0;
                                    termino = true;

                                    break;

                                case 'n':

                                    termino = true;
                                    comandos.setDerrotado(true);
                                    System.out.println("Batalha encerrada!");

                                    break;

                                default:

                                    System.out.println("############################## Selecione uma opção valida! ###############################");
                                    break;
                            }
                        }
                    }

                    if (kyogre.getLucarioDerrotado() == true) {

                        player.setSecundario(player.getNome());
                        player.setSecundario(player.getSecundario().toUpperCase());

                        System.out.println("\n\n########## ATENÇÃO " + player.getSecundario() + " ##############\n");
                        System.out.println("Você perdeu a partida!\n");

                        while (termino == false) {

                            System.out.println("Deseja fazer uma revanche?\ns-sim\nn-não");

                            revanche = scan.next().charAt(0);
                            revanche = Character.toLowerCase(revanche);

                            switch (revanche) {

                                case 's':

                                    System.out.println("\nA batalha será reiniciada, foque em suas estratégias e boa sorte!\n\n");

                                    lucario.setVida_Kyogre(300);
                                    kyogre.setVida_Lucario(250);
                                    lucario.setKyogreDerrotado(false);
                                    kyogre.setLucarioDerrotado(false);
                                    contador = 0;
                                    termino = true;

                                    break;

                                case 'n':

                                    termino = true;
                                    comandos.setDerrotado(true);
                                    System.out.println("Batalha encerrada!");
                                    System.out.println(player.getNome() + " você perdeu!");

                                    break;

                                default:

                                    System.out.println("Selecione uma opção valida!");
                                    break;
                            }
                        }
                    }
                }
                break;

            //BATALHA ALAKAZAM x KYOGRE
            case "2":
                for (contador = 1; comandos.getDerrotado() == false; contador++) {

                    System.out.println(player.getNome() + " este é seu " + contador + "º round!");
                    System.out.println("Selecione um ataque:\n1-Psychic"
                            + "\n2-Confusion\n3-Quick atack\n4-Psychock");

                    batalha = scan.next();

                    switch (batalha) {

                        case "1":
                            alakazam.psychic();
                            break;

                        case "2":
                            alakazam.confusion();
                            break;

                        case "3":
                            alakazam.quickAtack();
                            break;

                        case "4":
                            alakazam.psychock();
                            break;

                        default:
                            System.out.println("\n########   ATENÇÃO   ########\n" + player.getNome() + " você acabou de perde um turno.\n");
                            break;
                    }

                    valorAtaque = gerar.nextInt(1, 4);

                    switch (valorAtaque) {
                        case 1:
                            kyogre.origemPulse_Alakazam();
                            break;
                        case 2:
                            kyogre.waterGun_Alakazam();
                            break;
                        case 3:
                            kyogre.waterPulse_Alakazam();
                            break;
                        case 4:
                            kyogre.bodySlam_Alakazam();
                            break;
                    }

                    if (alakazam.getKyogreDerrotado() == true) {

                        System.out.println("\n\n########### Parabéns " + player.getNome() + " ###########\n");
                        System.out.println("Você ganhou partida\n");

                        while (termino == false) {

                            System.out.println("Deseja lutar novamente?\ns-sim\nn-não");

                            revanche = scan.next().charAt(0);
                            revanche = Character.toLowerCase(revanche);

                            switch (revanche) {

                                case 's':

                                    System.out.println("\n\nA batalha será reiniciada!\n");
                                    alakazam.setVida_Kyogre(300);
                                    kyogre.setVida_Alakazam(200);
                                    alakazam.setKyogreDerrotado(false);
                                    kyogre.setAlakazamDerrotado(false);
                                    contador = 0;
                                    termino = true;

                                    break;

                                case 'n':

                                    termino = true;
                                    comandos.setDerrotado(true);
                                    System.out.println("Batalha encerrada!");

                                    break;

                                default:

                                    System.out.println(" ####################### Selecione uma opção valida! ###########################");
                                    break;
                            }
                        }
                    }

                    if (kyogre.getAlakazamDerrotado() == true) {

                        player.setSecundario(player.getNome());
                        player.setSecundario(player.getSecundario().toUpperCase());

                        System.out.println("\n\n########## ATENÇÃO " + player.getSecundario() + " ##############\n");
                        System.out.println("Você perdeu a partida!\n");

                        while (termino == false) {

                            System.out.println("Deseja fazer uma revanche?\ns-sim\nn-não");

                            revanche = scan.next().charAt(0);
                            revanche = Character.toLowerCase(revanche);

                            switch (revanche) {

                                case 's':

                                    System.out.println("\nA batalha será reiniciada, foque em suas estratégias e boa sorte!\n\n");

                                    alakazam.setVida_Kyogre(300);
                                    kyogre.setVida_Alakazam(200);
                                    alakazam.setKyogreDerrotado(false);
                                    kyogre.setLucarioDerrotado(false);
                                    contador = 0;
                                    termino = true;

                                    break;

                                case 'n':

                                    termino = true;
                                    comandos.setDerrotado(true);
                                    System.out.println("Batalha encerrada!");
                                    System.out.println(player.getNome() + " você perdeu!");

                                    break;

                                default:

                                    System.out.println("########################### Selecione uma opção valida! ########################");
                                    break;
                            }
                        }
                    }
                }
                break;

            //BATALHA DRAGAPULT x KYOGRE
            case "3":
                for (contador = 1; comandos.getDerrotado() == false; contador++) {
                    System.out.println(player.getNome() + " este é seu " + contador + "º round!");
                    System.out.println("Selecione um ataque:\n1-Draco meteor"
                            + "\n2-Dragon pulse\n3-Shadow claw\n4-Dragon darts");

                    batalha = scan.next();

                    switch (batalha) {

                        case "1":
                            dragapult.dracoMeteor();
                            break;

                        case "2":
                            dragapult.DragonPulse();
                            break;

                        case "3":
                            dragapult.shadowClaw();
                            break;

                        case "4":
                            dragapult.DragonDarts();
                            break;

                        default:
                            System.out.println("\n########   ATENÇÃO   ########\n" + player.getNome() + " você acabou de perde um turno.\n");
                            break;
                    }

                    valorAtaque = gerar.nextInt(1, 4);

                    switch (valorAtaque) {
                        case 1:
                            kyogre.origemPulse_Dragapult();
                            break;
                        case 2:
                            kyogre.waterGun_Dragapult();
                            break;
                        case 3:
                            kyogre.waterPulse_Dragapult();
                            break;
                        case 4:
                            kyogre.bodySlam_Dragapult();
                            break;
                    }

                    if (dragapult.getKyogreDerrotado() == true) {

                        System.out.println("\n\n########### Parabéns " + player.getNome() + " ###########\n");
                        System.out.println("Você ganhou partida\n");

                        while (termino == false) {

                            System.out.println("Deseja lutar novamente?\ns-sim\nn-não");

                            revanche = scan.next().charAt(0);
                            revanche = Character.toLowerCase(revanche);

                            switch (revanche) {

                                case 's':

                                    System.out.println("\n\nA batalha será reiniciada!\n");
                                    dragapult.setVida_Kyogre(300);
                                    kyogre.setVida_Dragapult(185);
                                    dragapult.setKyogreDerrotado(false);
                                    kyogre.setDragapultDerrotado(false);
                                    contador = 0;
                                    termino = true;

                                    break;

                                case 'n':

                                    termino = true;
                                    comandos.setDerrotado(true);
                                    System.out.println("Batalha encerrada!");

                                    break;

                                default:

                                    System.out.println(" ####################### Selecione uma opção valida! ###########################");
                                    break;
                            }
                        }
                    }

                    if (kyogre.getDragapultDerrotado() == true) {

                        player.setSecundario(player.getNome());
                        player.setSecundario(player.getSecundario().toUpperCase());

                        System.out.println("\n\n########## ATENÇÃO " + player.getSecundario() + " ##############\n");
                        System.out.println("Você perdeu a partida!\n");

                        while (termino == false) {

                            System.out.println("Deseja fazer uma revanche?\ns-sim\nn-não");

                            revanche = scan.next().charAt(0);
                            revanche = Character.toLowerCase(revanche);

                            switch (revanche) {

                                case 's':

                                    System.out.println("\nA batalha será reiniciada, foque em suas estratégias e boa sorte!\n\n");

                                    dragapult.setVida_Kyogre(300);
                                    kyogre.setVida_Dragapult(200);
                                    dragapult.setKyogreDerrotado(false);
                                    kyogre.setDragapultDerrotado(false);
                                    contador = 0;
                                    termino = true;
                                    break;

                                case 'n':

                                    termino = true;
                                    comandos.setDerrotado(true);
                                    System.out.println("Batalha encerrada!");
                                    System.out.println(player.getNome() + " você perdeu!");
                                    break;

                                default:

                                    System.out.println("########################### Selecione uma opção valida! ########################");
                                    break;
                            }
                        }
                    }
                }

                break;
        }
    }
}
