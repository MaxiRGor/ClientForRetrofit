import java.util.ArrayList;
import java.util.Collections;

public class Selection {

    public void getAllFromTheme(Question[] questions, int themeNumber, String[] stackTheme){
        for(int i = 0; i<questions.length;i++){
            if(questions[i].THEME.equals(stackTheme[themeNumber])){
                questions[i].show();
            }
        }
    }


    public void getOneByID(Question[] questions, int id) {
        for(int i = 0; i<questions.length;i++){
            if(questions[i].ID==id){
                questions[i].show();
            }
        }
    }

    public void getMostFrequent(Question[] questions, int[] stackAnswer) {
        ArrayList<Integer> numberOfMeet = new ArrayList<Integer>();

        for(int i = 0;i<stackAnswer.length;i++){
            numberOfMeet.add(0);
        }

        for(int i  = 0; i<questions.length;i++){
            if (questions[i].RIGHT==1){
                numberOfMeet.set(0,numberOfMeet.get(0)+1);
            }

            if (questions[i].RIGHT==2){
                numberOfMeet.set(1,numberOfMeet.get(1)+1);
            }
            if (questions[i].RIGHT==3){
                numberOfMeet.set(2,numberOfMeet.get(2)+1);
            }
            if (questions[i].RIGHT==4){
                numberOfMeet.set(3,numberOfMeet.get(3)+1);
            }
        }

        for (int i = 0; i<stackAnswer.length; i++){
            if (numberOfMeet.get(i)==Collections.max(numberOfMeet)){
                int num = i+1;
                System.out.println("Cамый частый правильный ответ: " + num + ", встречается " + Collections.max(numberOfMeet) + " раз");
            }
        }

    }
}
