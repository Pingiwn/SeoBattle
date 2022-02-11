public class SimpleDotComeGame {
    public static void main(String[] args) {
     int  numOfGuesses = 0;
    GameHelper helper = new GameHelper();

        SimpleDotCom theDotCom = new SimpleDotCom();
        int randomNum = (int) (Math.random() * 5);
        int[] location = {randomNum, randomNum + 1, randomNum + 2};
        theDotCom.setLocationCells(location);
        boolean isAlive = true;


        while (isAlive){
            String guess = helper.getUserInput("Введите число");
            String result = theDotCom.checkYouself(guess);
            numOfGuesses++;
            if (result.equals("Потопил")){
                isAlive = false;
                System.out.println("Вам потребовалось" + numOfGuesses + "попыток(и)");
            }

        }
    }
}
