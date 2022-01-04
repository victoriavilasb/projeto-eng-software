import java.util.Scanner;
import modelos.estadio;
import modelos.partida;
import modelos.tabelaJogos;

public class menu{

    public static void buildTabelaJogos(tabelaJogos tabelaJogos){

        partida partidaAux = new partida();
        estadio estadioAux = new estadio();

        //Constroi estadio 
        estadioAux.nome = "Mineirao";
        estadioAux.estado = "MG";
        estadioAux.cidade = "Belo Horizonte";
        estadioAux.bairro = "Pampulha";
        estadioAux.rua = "Rua de teste";
        estadioAux.numero = 118;

        partidaAux.data = "12/03/2022";
        partidaAux.horario = "15:00";
        estadioAux.partidasMarcadas.add(partidaAux);
        //Limpa a referencia da partida anterior
        partidaAux = new partida();

        partidaAux.data = "15/03/2022";
        partidaAux.horario = "17:00";
        estadioAux.partidasMarcadas.add(partidaAux);
        partidaAux = new partida();

        //Adiciona estadio criado a tabela de jogos
        tabelaJogos.estadiosCopa.add(estadioAux);
        estadioAux = new estadio();

        //Constroi estadio 
        estadioAux.nome = "Maracana";
        estadioAux.estado = "RJ";
        estadioAux.cidade = "Rio de Janeiro";
        estadioAux.bairro = "Alvorada";
        estadioAux.rua = "Rua de teste dois";
        estadioAux.numero = 3459;

        partidaAux.data = "10/03/2022";
        partidaAux.horario = "09:00";
        estadioAux.partidasMarcadas.add(partidaAux);
        partidaAux = new partida();

        partidaAux.data = "22/04/2022";
        partidaAux.horario = "21:00";
        estadioAux.partidasMarcadas.add(partidaAux);
        partidaAux = new partida();
        
        //Adiciona estadio criado a tabela de jogos
        tabelaJogos.estadiosCopa.add(estadioAux);
        estadioAux = new estadio();
    }

    public static void listaTabelaDeJogos(tabelaJogos tabelaJogos){

        Integer index = 1;
        
        for(estadio estadio : tabelaJogos.estadiosCopa){

            for(partida partida : estadio.partidasMarcadas){

                System.out.printf("\n%d - Estadio %s partida no dia %s as %s\n", index, estadio.nome, partida.data, partida.horario);
                index++;
            }
        }

        System.out.printf("\n");
    }

    public static void main(String args[]){

        boolean sairDoSistema = false;
        Integer opcaoUsuarioMenu;
        Scanner input = new Scanner(System.in);

        tabelaJogos tabelaJogos = new tabelaJogos();

        buildTabelaJogos(tabelaJogos);

        System.out.printf("\n\n");
        System.out.printf("*********** Bem vindo ao sistema da Copa do Mundo! ***********\n");

        while(!sairDoSistema){

            System.out.printf("Selecione o que deseja fazer a seguir:\n");
            System.out.printf("1 - Ver Tabela de Jogos \n");
            System.out.printf("2 - Sair do sistema \n");

            opcaoUsuarioMenu = input.nextInt();

            switch (opcaoUsuarioMenu){
                case 1:
                    listaTabelaDeJogos(tabelaJogos);
                    break;
                case 2:
                    sairDoSistema = true;
                    break;
    
            }

        }

        input.close();
    }
}