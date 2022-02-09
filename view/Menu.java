package view;
import java.util.Scanner;

import controller.TabelaJogosController;

public class Menu {

    public void run(){

        boolean sairDoSistema = false;
        Integer opcaoUsuarioMenu;
        Scanner input = new Scanner(System.in);

        TabelaJogosController controllerTabelaJogos = new TabelaJogosController();
        //Requisita a model para construir a base de dados do sistema
        controllerTabelaJogos.buildDataBase();

        System.out.printf("\n\n");
        System.out.printf("*********** Bem vindo ao sistema da Copa do Mundo! ***********\n");

        while(!sairDoSistema){

            System.out.printf("Selecione o que deseja fazer a seguir:\n");
            System.out.printf("1 - Ver Tabela de Jogos \n");
            System.out.printf("2 - Lista equipes participantes \n");
            System.out.printf("3 - Lista estadios \n");
            System.out.printf("4 - Lista estadios com aeroportos proximos \n");
            System.out.printf("5 - Lista estadios com hoteis proximos \n");
            System.out.printf("6 - Sair do sistema \n");

            opcaoUsuarioMenu = input.nextInt();

            switch (opcaoUsuarioMenu){
                case 1:
                    controllerTabelaJogos.listaJogosCopa();
                    break;
                case 2:
                    controllerTabelaJogos.listaEquipes();
                    break;
                case 3:
                    controllerTabelaJogos.listaEstadios();
                    break;
                case 4:
                    controllerTabelaJogos.listaAeroportosProximos();
                    break;
                case 5:
                    controllerTabelaJogos.listaHoteisProximos();
                    break;  
                case 6:
                    sairDoSistema = true;
                    break;      
            }

        }

        input.close();
    }
}