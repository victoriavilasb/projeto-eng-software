import java.util.Scanner;

import model.Aeroporto;
import model.Equipe;
import model.Estadio;
import model.Hotel;
import model.Partida;
import model.TabelaJogos;

public class menu {

    public static void buildRelations(TabelaJogos tabelaJogos){
        Partida partidaAux = new Partida();
        Equipe equipeAux = new Equipe();
        Aeroporto aeroportoAux = new Aeroporto();
        Hotel hotelAux = new Hotel();

        //Constroi estadio
        Estadio estadioMineirao = new Estadio(
                "Mineirao",
                "MG",
                "Belo Horizonte",
                "Pampulha",
                "Av. Antonio Abrahao Caram",
                1001
        );

        //Partidas
        partidaAux.data = "12/03/2022";
        partidaAux.horario = "15:00";
        partidaAux.valorIngresso = "R$ 240,00";
        partidaAux.confronto = "Brasil X Peru";
        estadioMineirao.setPartidasMarcadas(partidaAux);
        partidaAux = new Partida();

        partidaAux.data = "19/03/2022";
        partidaAux.horario = "12:00";
        partidaAux.valorIngresso = "R$ 430,00";
        partidaAux.confronto = "Brasil X Holanda";
        estadioMineirao.setPartidasMarcadas(partidaAux);
        partidaAux = new Partida();

        partidaAux.data = "15/03/2022";
        partidaAux.horario = "17:00";
        partidaAux.valorIngresso = "R$ 120,00";
        partidaAux.confronto = "Holanda X Alemanha";
        estadioMineirao.setPartidasMarcadas(partidaAux);
        partidaAux = new Partida();

        //Aeroportos proximos
        aeroportoAux.setNome("Confins");
        estadioMineirao.setAeroportosProximos(aeroportoAux);
        aeroportoAux = new Aeroporto();

        //Hoteis proximos
        hotelAux.nome = "Arena Flats";
        hotelAux.vagas = "4";
        hotelAux.diariaInicial = "R$200,00";
        estadioMineirao.setHoteisProximos(hotelAux);
        hotelAux = new Hotel();

        hotelAux.nome = "Stop Inn";
        hotelAux.vagas = "12";
        hotelAux.diariaInicial = "R$350,00";
        estadioMineirao.setHoteisProximos(hotelAux);
        hotelAux = new Hotel();
        
        //Adiciona estadio criado a tabela de jogos
        tabelaJogos.estadiosCopa.add(estadioMineirao);


        //Constroi estadio
        Estadio estadioMaracana = new Estadio(
                "Maracana",
                "RJ",
                "Rio de Janeiro",
                "Maracana",
                "Av. Pres. Castelo Branco",
                3
        );

        //Partidas
        partidaAux.data = "10/03/2022";
        partidaAux.horario = "09:00";
        partidaAux.valorIngresso = "R$ 130,00";
        partidaAux.confronto = "Mexico X Uruguai";
        estadioMaracana.setPartidasMarcadas(partidaAux);
        partidaAux = new Partida();

        partidaAux.data = "22/03/2022";
        partidaAux.horario = "21:00";
        partidaAux.valorIngresso = "R$ 190,00";
        partidaAux.confronto = "Portugal X Espanha";
        estadioMaracana.setPartidasMarcadas(partidaAux);
        partidaAux = new Partida();
        
        //Aeroportos proximos
        aeroportoAux.setNome("Galeao");
        estadioMaracana.setAeroportosProximos(aeroportoAux);
        aeroportoAux = new Aeroporto();

        //Hoteis proximos
        hotelAux.nome = "Hostel Estacao Maracana";
        hotelAux.vagas = "6";
        hotelAux.diariaInicial = "R$120,00";
        estadioMaracana.setHoteisProximos(hotelAux);
        hotelAux = new Hotel();

        hotelAux.nome = "Varandas do Maracana";
        hotelAux.vagas = "2";
        hotelAux.diariaInicial = "R$82,00";
        estadioMaracana.setHoteisProximos(hotelAux);
        hotelAux = new Hotel();

        hotelAux.nome = "Hostel Recanto de Alegrias";
        hotelAux.vagas = "6";
        hotelAux.diariaInicial = "R$170,00";
        estadioMaracana.setHoteisProximos(hotelAux);
        hotelAux = new Hotel();

        //Adiciona estadio criado a tabela de jogos
        tabelaJogos.estadiosCopa.add(estadioMaracana);


        //Constroi estadio
        Estadio estadioMorumbi = new Estadio(
                "Morumbi",
                "SP",
                "Sao Paulo",
                "Morumbi",
                "Praca Roberto Gomes Pedrosa",
                1
        );

        //Partidas
        partidaAux.data = "02/04/2022";
        partidaAux.horario = "11:00";
        partidaAux.valorIngresso = "R$ 290,00";
        partidaAux.confronto = "Brasil X Portugal";
        estadioMorumbi.setPartidasMarcadas(partidaAux);
        partidaAux = new Partida();

        partidaAux.data = "05/04/2022";
        partidaAux.horario = "13:00";
        partidaAux.valorIngresso = "R$ 220,00";
        partidaAux.confronto = "Argentina X Portugal";
        estadioMorumbi.setPartidasMarcadas(partidaAux);
        partidaAux = new Partida();

        partidaAux.data = "22/04/2022";
        partidaAux.horario = "19:00";
        partidaAux.valorIngresso = "R$ 320,00";
        partidaAux.confronto = "Brasil X Argentina";
        estadioMorumbi.setPartidasMarcadas(partidaAux);
        partidaAux = new Partida();
        
        //Aeroportos proximos
        aeroportoAux.setNome("Congonhas");
        estadioMorumbi.setAeroportosProximos(aeroportoAux);
        aeroportoAux = new Aeroporto();

        aeroportoAux.setNome("Guarulhos");
        estadioMorumbi.setAeroportosProximos(aeroportoAux);
        aeroportoAux = new Aeroporto();

        //Hoteis proximos
        hotelAux.nome = "Hostel B2B SP";
        hotelAux.vagas = "13";
        hotelAux.diariaInicial = "R$230,00";
        estadioMorumbi.setHoteisProximos(hotelAux);
        hotelAux = new Hotel();

        //Adiciona estadio criado a tabela de jogos
        tabelaJogos.estadiosCopa.add(estadioMorumbi);

        //Equipes participantes
        equipeAux.nome = "Brasil";
        equipeAux.tecnico = "Tite";
        tabelaJogos.equipesParticipantes.add(equipeAux);
        equipeAux = new Equipe();

        equipeAux.nome = "Alemanha";
        equipeAux.tecnico = "Hans Flick";
        tabelaJogos.equipesParticipantes.add(equipeAux);
        equipeAux = new Equipe();

        equipeAux.nome = "Peru";
        equipeAux.tecnico = "Ricardo Gareca";
        tabelaJogos.equipesParticipantes.add(equipeAux);
        equipeAux = new Equipe();

        equipeAux.nome = "Portugal";
        equipeAux.tecnico = "Fernando Santos";
        tabelaJogos.equipesParticipantes.add(equipeAux);
        equipeAux = new Equipe();

        equipeAux.nome = "Argentina";
        equipeAux.tecnico = "Lionel Scaloni";
        tabelaJogos.equipesParticipantes.add(equipeAux);
        equipeAux = new Equipe();

        equipeAux.nome = "Espanha";
        equipeAux.tecnico = "Luis Enrique";
        tabelaJogos.equipesParticipantes.add(equipeAux);
        equipeAux = new Equipe();

        equipeAux.nome = "Uruguai";
        equipeAux.tecnico = "Diego Alonso";
        tabelaJogos.equipesParticipantes.add(equipeAux);
        equipeAux = new Equipe();

        equipeAux.nome = "Mexico";
        equipeAux.tecnico = "Gerardo Martino";
        tabelaJogos.equipesParticipantes.add(equipeAux);
        equipeAux = new Equipe();

        equipeAux.nome = "Holanda";
        equipeAux.tecnico = "Louis van Gaal";
        tabelaJogos.equipesParticipantes.add(equipeAux);
        equipeAux = new Equipe();
    }

    public static void listaTabelaDeJogos(TabelaJogos tabelaJogos){

        Integer index = 1;
        
        for(Estadio estadio : tabelaJogos.estadiosCopa){

            System.out.printf("\n Estadio %s\n\n", estadio.getNome());
            for(Partida partida : estadio.getPartidasMarcadas()){

                System.out.printf(" %s as %s do dia %s\n", partida.confronto, partida.horario, partida.data);
                System.out.printf(" Valor ingresso: %s\n\n", partida.valorIngresso);
                index++;
            }
        }

        System.out.printf("\n");
    }

    public static void listaEquipesParticipantes(TabelaJogos tabelaJogos){
               
        for(Equipe equipe : tabelaJogos.equipesParticipantes){

            System.out.printf("\n Selecao %s\n", equipe.nome);
            System.out.printf(" Tecnico: %s\n\n", equipe.tecnico);
        }

        System.out.printf("\n");
    }

    public static void listaEstadios(TabelaJogos tabelaJogos){
        
        for(Estadio estadio : tabelaJogos.estadiosCopa){
            System.out.printf(estadio.getResumoDoEstadio());
        }

        System.out.printf("\n");
    }

    public static void listaEstadiosAeroportosProximos(TabelaJogos tabelaJogos){
               
        for(Estadio estadio : tabelaJogos.estadiosCopa){

            System.out.printf("\n Estadio %s\n", estadio.getNome());
            for(Aeroporto aeroporto : estadio.getAeroportosProximos()){

                System.out.printf(" Aeroporto: %s\n", aeroporto.getNome());
            }
        }

        System.out.printf("\n");
    }

    public static void listaEstadiosHoteisProximos(TabelaJogos tabelaJogos){
               
        for(Estadio estadio : tabelaJogos.estadiosCopa){

            System.out.printf("\n Estadio %s\n\n", estadio.getNome());
            for(Hotel hotel : estadio.getHoteisProximos()){

                System.out.printf(" Hotel: %s, %s vagas com diaria a partir de %s\n", hotel.nome, hotel.vagas, hotel.diariaInicial);
            }
        }

        System.out.printf("\n");
    }

    public static void main(String args[]){

        boolean sairDoSistema = false;
        Integer opcaoUsuarioMenu;
        Scanner input = new Scanner(System.in);

        TabelaJogos tabelaJogos = new TabelaJogos();

        buildRelations(tabelaJogos);

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
                    listaTabelaDeJogos(tabelaJogos);
                    break;
                case 2:
                    listaEquipesParticipantes(tabelaJogos);
                    break;
                case 3:
                    listaEstadios(tabelaJogos);
                    break;
                case 4:
                    listaEstadiosAeroportosProximos(tabelaJogos);
                    break;
                case 5:
                    listaEstadiosHoteisProximos(tabelaJogos);
                    break;  
                case 6:
                    sairDoSistema = true;
                    break;      
            }

        }

        input.close();
    }
}