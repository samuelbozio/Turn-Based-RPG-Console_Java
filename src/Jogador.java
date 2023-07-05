import java.util.Random;
import java.util.Scanner;

public class Jogador {

    private int HP;
    private int ATK;
    private int MANA;
    Scanner sc = new Scanner(System.in);


    public void menuInicial() {
        System.out.println("[ARENA DE BATALHA] ");
        System.out.println("[1] Nova Batalha");
        System.out.println("[2] Finalizar Jogo");


        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                batalha();


            case 2:
                System.out.println("....");
        }

    }

    public void batalha() {
        Random gerador = new Random();
        Inimigo inimigo = new Inimigo();

        setHP(10);
        inimigo.setHP(50);
        setATK(10);
        inimigo.setATK(5);
        int rounds = 0;

        while (getHP() > 0 && rounds <= 11) {


            System.out.println("-------");
            System.out.println("FASE > " + rounds);
            rounds = rounds + 1;
            System.out.println("-------");
            System.out.println(" ");
            System.out.println(" ");

            switch (rounds) {

                case 1:
                    System.out.println("-------");
                    System.out.println("INIMIGO -> O CAVALHEIRO PERDIDO");
                    System.out.println("-------");
                    System.out.println("Durante sua viagem para a Masmorra Perdida,");
                    System.out.println("você se depara com um cavalheiro que impede a sua passagem.");
                    setHP(25);
                    setATK(5);
                    inimigo.setHP(32);
                    inimigo.setATK(5);
                    setMANA(18);
                    inimigo.setMANA(20);
                    break;
                case 2:
                    System.out.println("-------");
                    System.out.println("INIMIGO -> INVASOR DE MASMORRAS");
                    System.out.println("-------");
                    System.out.println("Ao enfrentar o cavalheiro e adentrar na masmorra,");
                    System.out.println("somos pegos de surpresa por um bandido alí escondido.");
                    setHP(28);
                    setATK(7);
                    inimigo.setHP(38);
                    inimigo.setATK(6);
                    setMANA(32);
                    inimigo.setMANA(28);
                    break;
                case 3:
                    System.out.println("-------");
                    System.out.println("INIMIGO -> ARANHA GIGANTE");
                    System.out.println("-------");
                    System.out.println("A luta contra o ladrão chamou a atenção de um inimigo mortal,");
                    System.out.println("ao ver o cadáver do ladrão, você ouve sons de patas gigantes!");
                    setHP(35);
                    setATK(8);
                    inimigo.setHP(44);
                    inimigo.setATK(6);
                    setMANA(38);
                    inimigo.setMANA(30);
                    break;
                case 4:
                    System.out.println("-------");
                    System.out.println("INIMIGO -> MÚMIA AMALDIÇOADA");
                    System.out.println("-------");
                    System.out.println("Após enfrentar a aranha, você consegue finalmente avançar.");
                    System.out.println("Ao encontrar um túmulo e abrí-lo à espera de tesouros, um novo inimigo surge!");
                    setHP(42);
                    setATK(9);
                    inimigo.setHP(49);
                    inimigo.setATK(7);
                    setMANA(40);
                    inimigo.setMANA(32);
                    break;
                case 5:
                    System.out.println("-------");
                    System.out.println("INIMIGO -> GUARDIÃO DAS PROFUNDEZAS");
                    System.out.println("-------");
                    System.out.println("Após enfrentar a múmia, você avança e se aproxima do Portal Profundo,");
                    System.out.println("sentado logo em frente, um inimigo lhe aguarda.");
                    setHP(42);
                    setATK(10);
                    inimigo.setHP(52);
                    inimigo.setATK(7);
                    setMANA(45);
                    inimigo.setMANA(36);
                    break;
                case 6:
                    System.out.println("-------");
                    System.out.println("INIMIGO -> TIGRE IMAGINÁRIO");
                    System.out.println("-------");
                    System.out.println("Ao enfrentar o guardião, somos envenenados");
                    System.out.println("por uma espécie de feitiço alucinógeno. O que é aquilo!?");
                    setHP(45);
                    setATK(11);
                    inimigo.setHP(55);
                    inimigo.setATK(8);
                    setMANA(50);
                    inimigo.setMANA(40);
                    break;
                case 7:
                    System.out.println("-------");
                    System.out.println("INIMIGO -> FARKAS, O ESPADACHIM");
                    System.out.println("-------");
                    System.out.println("Ao fim da batalha contra a ilusão, nossa atenção");
                    System.out.println("é chamada por sons de palmas. É Farkas, o Espadachim Demente.");
                    setHP(48);
                    setATK(11);
                    inimigo.setHP(60);
                    inimigo.setATK(8);
                    setMANA(50);
                    inimigo.setMANA(45);
                    break;
                case 8:
                    System.out.println("-------");
                    System.out.println("INIMIGO -> LYDIA, SENHORA DAS MOLÉSTIAS");
                    System.out.println("-------");
                    System.out.println("Ao derrotar Farkas, descemos mais a baixo pelas profundezas.");
                    System.out.println("Durante o caminho ouvimos uma voz feminina pedindo socorro.");
                    System.out.println("Ao seguir a voz, a criatura que se apresenta não parece correr perigos.");
                    setHP(52);
                    setATK(12);
                    inimigo.setHP(62);
                    inimigo.setATK(9);
                    setMANA(54);
                    inimigo.setMANA(45);
                    break;
                case 9:
                    System.out.println("-------");
                    System.out.println("INIMIGO -> GÊMEO DE LYDIA");
                    System.out.println("-------");
                    System.out.println("Ao matar Lydia, sentimos uma gota de água cair em nosso nariz,");
                    System.out.println("é Arthur, o gêmeo incestuoso preso ao teto. Ele não espera para atacar!");
                    setHP(58);
                    setATK(13);
                    inimigo.setHP(68);
                    inimigo.setATK(11);
                    setMANA(56);
                    inimigo.setMANA(50);
                    break;
                case 10:
                    System.out.println("-------");
                    System.out.println("INIMIGO -> O CEIFADOR DE ALMAS");
                    System.out.println("-------");
                    System.out.println("Ao derrotarmos Arthur, conseguimos chegar ao fim da masmorra.");
                    System.out.println("Ao nos depararmos com o tesouro, todo o brilho das jóias desaparecem");
                    System.out.println("e a sala inteira se rompe em escuridão.");
                    setHP(65);
                    setATK(15);
                    inimigo.setHP(60);
                    inimigo.setATK(15);
                    setMANA(60);
                    inimigo.setMANA(54);
                    break;
            }


            while (inimigo.getHP() > 0) {

                System.out.println("-------");
                System.out.println("<---<o>---{SEU TURNO}---<o>--->");
                System.out.println("HP: " + getHP());
                System.out.println("ATK: " + getATK());
                System.out.println("MANA: " + getMANA());
                System.out.println("[1] - [SOCO] - ATK Médio - {4 - MANA}");
                System.out.println("[2] - [CHUTE] - ATK Forte - {5 - MANA}");
                System.out.println("[3] - [CURAR - Poder de Cura - {7 - MANA}");
                System.out.println("[4] - [DEFENDER] - Defesa - { +1 a 3 } - MANA}");

                int opcao = sc.nextInt();


                switch (opcao) {
                    case 1:
                        int linhas = 10;
                        while (linhas > 0) {
                            System.out.println();
                            linhas--;
                        }
                        System.out.println("[SOCO]");
                        System.out.println("<---<0>---{-}---<0>--->+<---<0>---{-}---<0>--->");
                        int valor = gerador.nextInt(1, 5);


                        if (getMANA() < 4) {
                            System.out.println("Mana insuficiente!");
                            System.out.println(" ");
                            break;
                        }

                        if (valor < 2) {
                            System.out.println("[ERROU]");
                            System.out.println(" ");

                        } else {
                            setMANA(getMANA() - 4);
                            int dano = valor + getATK();
                            inimigo.setHP(inimigo.getHP() - dano);
                            System.out.println(" -> DANO CAUSADO: " + "{" + dano + "}" + " " + " -> " + "HP ATUAL: " + getHP());
                            System.out.println(" -> MANA ATUAL: " + "{" + getMANA() + "}" + " " + " -> HP INIMIGO: " + "{" + inimigo.getHP() + "}");
                            System.out.println(" ");
                            System.out.println(" ");
                        }

                        break;
                    case 2:
                        linhas = 10;
                        while (linhas > 0) {
                            System.out.println();
                            linhas--;
                        }
                        System.out.println("<---<0>---{-}---<0>--->+<---<0>---{-}---<0>--->");
                        System.out.println("[CHUTE]");
                        valor = gerador.nextInt(3, 7);
                        setMANA(getMANA() - 5);
                        if (getMANA() < 5) {
                            System.out.println("Mana insuficiente!");
                            break;
                        }

                        if (valor < 2) {
                            System.out.println("[ERROU!]");
                            System.out.println(" ");
                        } else {
                            int dano = valor + getATK();
                            inimigo.setHP(inimigo.getHP() - dano);
                            System.out.println(" -> DANO CAUSADO: " + "{" + dano + "}" + " " + " -> " + "HP ATUAL: " + getHP());
                            System.out.println(" -> MANA ATUAL: " + "{" + getMANA() + "}" + " " + " -> HP INIMIGO: " + "{" + inimigo.getHP() + "}");
                            System.out.println(" ");
                            System.out.println(" ");
                        }
                        break;
                    case 3:
                        linhas = 10;
                        while (linhas > 0) {
                            System.out.println();
                            linhas--;
                        }
                        System.out.println("<---<0>---{-}---<0>--->+<---<0>---{-}---<0>--->");
                        System.out.println("[CURAR]");
                        valor = gerador.nextInt(1, 4);

                        setMANA(getMANA() - 7);
                        if (getMANA() < 7) {
                            System.out.println("Mana insuficiente!");
                            break;
                        } else {
                            setHP(getHP() + valor);
                            System.out.println("HP Restaurado +" + valor);
                            System.out.println("HP Atual: " + getHP());
                        }
                        break;
                    case 4:
                        linhas = 10;
                        while (linhas > 0) {
                            System.out.println();
                            linhas--;
                        }
                        System.out.println("<---<0>---{-}---<0>--->+<---<0>---{-}---<0>--->");
                        System.out.println("[DEFENDER]");
                        valor = gerador.nextInt(1, 8);
                        int mana = gerador.nextInt(0, 3);
                        setMANA(getMANA() + mana);
                        System.out.println("Mana regenerada durante a defesa: " + mana);

                        if (valor <= 3) {
                            setHP(getHP() + 2);
                            System.out.println("2 Pontos de DEFESA");
                        } else if (valor > 4 && valor <= 6) {
                            setHP(getHP() + 3);
                            System.out.println("3 Pontos de DEFESA");
                        } else {
                            setHP(getHP() + 4);
                            System.out.println("4 Pontos de DEFESA");
                        }

                }
                if (inimigo.getHP() > 0) {
                    System.out.println("-------");
                    System.out.println("<---<0>---{TURNO INIMIGO}---<0>--->");
                    int atk = gerador.nextInt(1, 3);
                    System.out.println("-------");
                    switch (atk) {
                        case 1:
                            System.out.println("Inimigo > [FACADA]");
                            int valor = gerador.nextInt(1, 5);

                            inimigo.setMANA(inimigo.getMANA() - 5);

                            if (inimigo.getMANA() < 5) {
                                System.out.println("Mana insuficiente!");
                                System.out.println(" ");
                                break;
                            }


                            if (valor < 2) {
                                System.out.println("[INIMIGO ERROU]");
                                System.out.println(" -> HP ATUAL: " + "{" + getHP() + "}");
                                System.out.println(" -> MANA ATUAL: " + "{" + getMANA() + "}");
                                System.out.println(" ");
                                break;
                            } else {
                                int dano = valor + inimigo.getATK();
                                setHP(getHP() - dano);
                                System.out.println(" -> DANO RECEBIDO: " + "{" + dano + "}");
                                System.out.println(" -> HP ATUAL: " + "{" + getHP() + "}");
                                System.out.println(" -> MANA ATUAL: " + "{" + getMANA() + "}");
                                setMANA(getMANA() + 2);
                                System.out.println(" ");
                            }
                            break;
                        case 2:
                            System.out.println("Inimigo > [PEDRADA]");
                            valor = gerador.nextInt(3, 7);

                            inimigo.setMANA(inimigo.getMANA() - 5);

                            if (inimigo.getMANA() < 5) {
                                System.out.println("Mana insuficiente!");
                                break;
                            }

                            if (valor < 2) {
                                System.out.println("[INIMIGO ERROU!]");
                                System.out.println(" -> HP ATUAL: " + "{" + getHP() + "}");
                                System.out.println(" -> MANA ATUAL: " + "{" + getMANA() + "}");
                                break;
                            } else {
                                int dano = valor + getATK();
                                setHP(getHP() - dano);
                                System.out.println(" -> DANO RECEBIDO: " + "{" + dano + "}");
                                System.out.println(" -> HP ATUAL: " + "{" + getHP() + "}");
                                System.out.println(" -> MANA ATUAL: " + "{" + getMANA() + "}");
                                System.out.println(" ");
                                if (getHP() <= 0) {
                                    System.out.println("[VOCÊ ESTÁ MORTO...]");
                                    System.out.println("--------");
                                    menuInicial();
                                    return;


                                }

                            }

                    }
                    int mana = gerador.nextInt(0, 3);
                    setMANA(getMANA() + mana);
                    inimigo.setMANA(inimigo.getMANA() + mana);
                    System.out.println("Mana regenerada durante o turno: " + mana);

                }


            }
            if (inimigo.getHP() <= 0) {
                System.out.println("------------");
                System.out.println("[INIMIGO DERROTADO!]");

            }


        }


        System.out.println("---------");
        System.out.println("VOCÊ FOI VENCEDOR! PARABÉNS");
        System.out.println("---------");
        System.out.println(" ");
        System.out.println("Começar Novamente: ");
        System.out.println("[1] Ir para Menu Inicial");
        System.out.println("[2] Finalizar Jogo");
        int opcoes = sc.nextInt();

        switch (opcoes) {
            case 1:
                menuInicial();
                break;

            case 2:
                System.out.println("....");
                break;
        }

    }


    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getATK() {
        return ATK;
    }

    public void setATK(int ATK) {
        this.ATK = ATK;
    }

    public int getMANA() {
        return MANA;
    }

    public void setMANA(int MANA) {
        this.MANA = MANA;
    }

}
