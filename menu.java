import java.util.Scanner;

import modelos.aeroporto;
import modelos.equipe;
import modelos.estadio;
import modelos.hotel;
import modelos.partida;
import modelos.tabelaJogos;

public class menu{

    public static void buildRelations(tabelaJogos tabelaJogos){

        partida partidaAux = new partida();
        estadio estadioAux = new estadio();
        equipe equipeAux = new equipe();
        aeroporto aeroportoAux = new aeroporto();
        hotel hotelAux = new hotel();

        //Constroi estadio 
        estadioAux.nome = "Mineirao";
        estadioAux.estado = "MG";
        estadioAux.cidade = "Belo Horizonte";
        estadioAux.bairro = "Pampulha";
        estadioAux.rua = "Av. Antonio Abrahao Caram";
        estadioAux.numero = 1001;

        //Partidas
        partidaAux.data = "12/03/2022";
        partidaAux.horario = "15:00";
        partidaAux.valorIngresso = "R$ 240,00";
        partidaAux.confronto = "Brasil X Peru";
        estadioAux.partidasMarcadas.add(partidaAux);
        partidaAux = new partida();

        partidaAux.data = "19/03/2022";
        partidaAux.horario = "12:00";
        partidaAux.valorIngresso = "R$ 430,00";
        partidaAux.confronto = "Brasil X Holanda";
        estadioAux.partidasMarcadas.add(partidaAux);
        partidaAux = new partida();

        partidaAux.data = "15/03/2022";
        partidaAux.horario = "17:00";
        partidaAux.valorIngresso = "R$ 120,00";
        partidaAux.confronto = "Holanda X Alemanha";
        estadioAux.partidasMarcadas.add(partidaAux);
        partidaAux = new partida();

        //Aeroportos proximos
        aeroportoAux.nome = "Confins";
        estadioAux.aeroportosProximos.add(aeroportoAux);
        aeroportoAux = new aeroporto();

        //Hoteis proximos
        hotelAux.nome = "Arena Flats";
        hotelAux.vagas = "4";
        hotelAux.diariaInicial = "R$200,00";
        estadioAux.hoteisProximos.add(hotelAux);
        hotelAux = new hotel();

        hotelAux.nome = "Stop Inn";
        hotelAux.vagas = "12";
        hotelAux.diariaInicial = "R$350,00";
        estadioAux.hoteisProximos.add(hotelAux);
        hotelAux = new hotel();
        
        //Adiciona estadio criado a tabela de jogos
        tabelaJogos.estadiosCopa.add(estadioAux);
        estadioAux = new estadio();

        //Constroi estadio 
        estadioAux.nome = "Maracana";
        estadioAux.estado = "RJ";
        estadioAux.cidade = "Rio de Janeiro";
        estadioAux.bairro = "Maracana";
        estadioAux.rua = "Av. Pres. Castelo Branco";
        estadioAux.numero = 3;

        //Partidas
        partidaAux.data = "10/03/2022";
        partidaAux.horario = "09:00";
        partidaAux.valorIngresso = "R$ 130,00";
        partidaAux.confronto = "Mexico X Uruguai";
        estadioAux.partidasMarcadas.add(partidaAux);
        partidaAux = new partida();

        partidaAux.data = "22/03/2022";
        partidaAux.horario = "21:00";
        partidaAux.valorIngresso = "R$ 190,00";
        partidaAux.confronto = "Portugal X Espanha";
        estadioAux.partidasMarcadas.add(partidaAux);
        partidaAux = new partida();
        
        //Aeroportos proximos
        aeroportoAux.nome = "Galeao";
        estadioAux.aeroportosProximos.add(aeroportoAux);
        aeroportoAux = new aeroporto();

        //Hoteis proximos
        hotelAux.nome = "Hostel Estacao Maracana";
        hotelAux.vagas = "6";
        hotelAux.diariaInicial = "R$120,00";
        estadioAux.hoteisProximos.add(hotelAux);
        hotelAux = new hotel();

        hotelAux.nome = "Varandas do Maracana";
        hotelAux.vagas = "2";
        hotelAux.diariaInicial = "R$82,00";
        estadioAux.hoteisProximos.add(hotelAux);
        hotelAux = new hotel();

        hotelAux.nome = "Hostel Recanto de Alegrias";
        hotelAux.vagas = "6";
        hotelAux.diariaInicial = "R$170,00";
        estadioAux.hoteisProximos.add(hotelAux);
        hotelAux = new hotel();

        //Adiciona estadio criado a tabela de jogos
        tabelaJogos.estadiosCopa.add(estadioAux);
        estadioAux = new estadio();

        //Constroi estadio 
        estadioAux.nome = "Morumbi";
        estadioAux.estado = "SP";
        estadioAux.cidade = "Sao Paulo";
        estadioAux.bairro = "Morumbi";
        estadioAux.rua = "Praca Roberto Gomes Pedrosa";
        estadioAux.numero = 1;

        //Partidas
        partidaAux.data = "02/04/2022";
        partidaAux.horario = "11:00";
        partidaAux.valorIngresso = "R$ 290,00";
        partidaAux.confronto = "Brasil X Portugal";
        estadioAux.partidasMarcadas.add(partidaAux);
        partidaAux = new partida();

        partidaAux.data = "05/04/2022";
        partidaAux.horario = "13:00";
        partidaAux.valorIngresso = "R$ 220,00";
        partidaAux.confronto = "Argentina X Portugal";
        estadioAux.partidasMarcadas.add(partidaAux);
        partidaAux = new partida();

        partidaAux.data = "22/04/2022";
        partidaAux.horario = "19:00";
        partidaAux.valorIngresso = "R$ 320,00";
        partidaAux.confronto = "Brasil X Argentina";
        estadioAux.partidasMarcadas.add(partidaAux);
        partidaAux = new partida();
        
        //Aeroportos proximos
        aeroportoAux.nome = "Congonhas";
        estadioAux.aeroportosProximos.add(aeroportoAux);
        aeroportoAux = new aeroporto();

        aeroportoAux.nome = "Guarulhos";
        estadioAux.aeroportosProximos.add(aeroportoAux);
        aeroportoAux = new aeroporto();

        //Hoteis proximos
        hotelAux.nome = "Hostel B2B SP";
        hotelAux.vagas = "13";
        hotelAux.diariaInicial = "R$230,00";
        estadioAux.hoteisProximos.add(hotelAux);
        hotelAux = new hotel();

        //Adiciona estadio criado a tabela de jogos
        tabelaJogos.estadiosCopa.add(estadioAux);

        //Equipes participantes
        equipeAux.nome = "Brasil";
        equipeAux.tecnico = "Tite";
        tabelaJogos.equipesParticipantes.add(equipeAux);
        equipeAux = new equipe();

        equipeAux.nome = "Alemanha";
        equipeAux.tecnico = "Hans Flick";
        tabelaJogos.equipesParticipantes.add(equipeAux);
        equipeAux = new equipe();

        equipeAux.nome = "Peru";
        equipeAux.tecnico = "Ricardo Gareca";
        tabelaJogos.equipesParticipantes.add(equipeAux);
        equipeAux = new equipe();

        equipeAux.nome = "Portugal";
        equipeAux.tecnico = "Fernando Santos";
        tabelaJogos.equipesParticipantes.add(equipeAux);
        equipeAux = new equipe();

        equipeAux.nome = "Argentina";
        equipeAux.tecnico = "Lionel Scaloni";
        tabelaJogos.equipesParticipantes.add(equipeAux);
        equipeAux = new equipe();

        equipeAux.nome = "Espanha";
        equipeAux.tecnico = "Luis Enrique";
        tabelaJogos.equipesParticipantes.add(equipeAux);
        equipeAux = new equipe();

        equipeAux.nome = "Uruguai";
        equipeAux.tecnico = "Diego Alonso";
        tabelaJogos.equipesParticipantes.add(equipeAux);
        equipeAux = new equipe();

        equipeAux.nome = "Mexico";
        equipeAux.tecnico = "Gerardo Martino";
        tabelaJogos.equipesParticipantes.add(equipeAux);
        equipeAux = new equipe();

        equipeAux.nome = "Holanda";
        equipeAux.tecnico = "Louis van Gaal";
        tabelaJogos.equipesParticipantes.add(equipeAux);
        equipeAux = new equipe();
    }

    public static void listaTabelaDeJogos(tabelaJogos tabelaJogos){

        Integer index = 1;
        
        for(estadio estadio : tabelaJogos.estadiosCopa){

            System.out.printf("\n Estadio %s\n\n", estadio.nome);
            for(partida partida : estadio.partidasMarcadas){

                System.out.printf(" %s as %s do dia %s\n", partida.confronto, partida.horario, partida.data);
                System.out.printf(" Valor ingresso: %s\n\n", partida.valorIngresso);
                index++;
            }
        }

        System.out.printf("\n");
    }

    public static void listaEquipesParticipantes(tabelaJogos tabelaJogos){
               
        for(equipe equipe : tabelaJogos.equipesParticipantes){

            System.out.printf("\n Selecao %s\n", equipe.nome);
            System.out.printf(" Tecnico: %s\n\n", equipe.tecnico);
        }

        System.out.printf("\n");
    }

    public static void listaEstadios(tabelaJogos tabelaJogos){
        
        for(estadio estadio : tabelaJogos.estadiosCopa){

            System.out.printf("\n Estadio %s\n", estadio.nome);
            System.out.printf(" %s - %s, %d - %s, %s\n\n", estadio.estado, estadio.rua, estadio.numero, estadio.bairro, estadio.cidade);
        
        }

        System.out.printf("\n");
    }

    public static void listaEstadiosAeroportosProximos(tabelaJogos tabelaJogos){
               
        for(estadio estadio : tabelaJogos.estadiosCopa){

            System.out.printf("\n Estadio %s\n", estadio.nome);
            for(aeroporto aeroporto : estadio.aeroportosProximos){

                System.out.printf(" Aeroporto: %s\n", aeroporto.nome);
            }
        }

        System.out.printf("\n");
    }

    public static void listaEstadiosHoteisProximos(tabelaJogos tabelaJogos){
               
        for(estadio estadio : tabelaJogos.estadiosCopa){

            System.out.printf("\n Estadio %s\n\n", estadio.nome);
            for(hotel hotel : estadio.hoteisProximos){

                System.out.printf(" Hotel: %s, %s vagas com diaria a partir de %s\n", hotel.nome, hotel.vagas, hotel.diariaInicial);
            }
        }

        System.out.printf("\n");
    }

    public static void main(String args[]){

        boolean sairDoSistema = false;
        Integer opcaoUsuarioMenu;
        Scanner input = new Scanner(System.in);

        tabelaJogos tabelaJogos = new tabelaJogos();

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