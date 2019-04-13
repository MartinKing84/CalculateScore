public class Main {

    public static void main(String[] args) {

        //calculateScore("Marcin", 90);
        int newScore = calculateScore("Kasia", 100);
        System.out.println("Your new score is = "+ newScore);
    }



public static int calculateScore(String name, int score){
    System.out.println("Player " + name +" achieved score "+ score);
    return score * 100;
    }

}
