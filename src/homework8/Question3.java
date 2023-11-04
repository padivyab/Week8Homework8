package homework8;



public class Question3 {

    public static void main(String[] args) {

        String[][] CountryAndCapital = {{"United Kingdom","London"},
                                        {"Australia","Canberra"},
                                        {"Canada","Ottawa"},
                                        {"NewZealand","Wellington"},
                                        {"USA","Washington D.C"}};

        /*String [][] stateAndcapital2 = new String[5][2];
        stateAndcapital2[0][0] = "Alabama";
        stateAndcapital2[0][1] = "Alaska";
        stateAndcapital2[1][0] = "Arkansas";
        stateAndcapital2[1][1] = "California";
        stateAndcapital2[2][0] = "Connecticut";
        stateAndcapital2[2][1] = "Delaware";
        stateAndcapital2[3][0] = "Florida";
        stateAndcapital2[3][1] = "Georgia";
        stateAndcapital2[4][0] = "a";
        stateAndcapital2[4][1] = "b";*/

        for (int i=0;i < 5; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                System.out.println(CountryAndCapital[i][j]);
            }}
        /*for (int i=0;i<2;i++)
        {
            System.out.println(statesAndCapitals[i][i]);
        }*/

    }
}
