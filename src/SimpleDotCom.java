public class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;

    public String checkYouself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "мимо";
        for(int cell: locationCells){
            if (guess == cell){
                result = "Попал";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length){
            result = "Потопил";
        }
        System.out.println(result);
        return  result;
    }
    public void setLocationCells(int[] locs){
        locationCells  = locs;
    }

}
