public class SimpleDotComeGame {
    static int  numOfGuesses = 0;
    GameHelper helper = new GameHelper();
    public static void main(String[] args) {
        SimpleDotCom theDotCom = new SimpleDotCom();
        int randomNum = (int) (Math.random() * 5);
        int[] location = {randomNum, randomNum + 1, randomNum + 2};
        theDotCom.setLocationCells(location);
        boolean isAlive = true;


        while (isAlive){
            String guess = helper.getInput("Введите число");
            String result = theDotCom.checkYouself(guess);
            numOfGuesses++;
            if (result.equals("Потопил")){
                isAlive = false;
                System.out.println("Вам потребовалось" + numOfGuesses + "попыток(и)");
            }

        }
    }
}
