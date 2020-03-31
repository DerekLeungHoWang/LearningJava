package academy.learnProgramming;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team <FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);

        Team <BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);
        Team<FootballPlayer> frementale = new Team<>("fremantle");


        System.out.println(adelaideCrows.numPlayers());

        adelaideCrows.matchResult(frementale,2,1);
        System.out.println(adelaideCrows.getName() + " : " + adelaideCrows.ranking());
        System.out.println(frementale.getName() + " : " + frementale.ranking());

        System.out.println(adelaideCrows.compareTo(frementale));
    }
}
