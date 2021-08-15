package com.example.Puzzled_ULHacks2021;

public class QuestionsInfo {

    /*This class contains hardcoded arrays such as the questions, options, answers, and images array.
      All to be used in the main EasyPuzzle class. It is also used to retrieve each item from each array
      by using get....(int i){}.
     */

    private String questionsArr [] = {
            "2 x 2 = ",
            "2 + 5 = ",
            "4 - 2 = ",
            "2 + 4 = "    };

    private String optionsArr [][] = {

            {"4", "8", "5", "6"},
            {"4", "7", "1", "12"},
            {"2", "3", "9", "4"},
            {"0", "12", "6", "3"}    };

    private int imageArr[] = {
           R.drawable.leftdown, R.drawable.leftfull, R.drawable.leftfull3, R.drawable.main
    };

    private String correctArr [] = {
            "4", "7", "2", "6"
    };

    public String getQuestionArr(int i) {
        String question = questionsArr[i];
        return question;
    }

    public String getOptionsArr1(int i) {
        String option0 = optionsArr[i][0];
        return option0;
    }

    public String getOptionsArr2(int i) {
        String option1 = optionsArr[i][1];
        return option1;
    }

    public String getOptionsArr3(int i) {
        String option2 = optionsArr[i][2];
        return option2;
    }

    public String getCorrectArr(int i){
        String answer = correctArr[i];
        return answer;
    }

    public int getImageArr(int i){
        int obtain = imageArr[i];
        return obtain;
    }
}
