import java.util.Random;

public class Question {

    protected int ID;
    public String THEME;
    private String TEXT;
    private String ANSWERS[];
    protected int RIGHT;
    private Random random;

    protected String[] stackTheme = {"logic", "heroes", "location", "color", "relationship"};
    protected String[] stackText = {"TEXT?", "TEXTTEXT??", "TEXTTEXTTEXT???", "TEXTTEXTTEXTTEXT????", "TEXTTEXTTEXTTEXTTEXT?????"};
    protected int[] stackAnswer = {1, 2, 3, 4};

    Question() {
        random = new Random();
        THEME = stackTheme[random.nextInt(stackTheme.length)];
        TEXT = stackText[random.nextInt(stackText.length)];
        ANSWERS = new String[]{"FIRST", "SECOND", "THIRD", "FOURTH"};
        RIGHT = stackAnswer[random.nextInt(stackAnswer.length)];
    }

    Question(String string) {
    }

    protected void show() {
        System.out.println();
        System.out.print("  ID: " + ID + "  ");
        System.out.print("  THEME: " + THEME + "  ");
        System.out.print("  TEXT: " + TEXT + "  ");
        System.out.print("  ANSWERS: ");
        for(int i = 0; i<ANSWERS.length;i++){
            System.out.print(ANSWERS[i] + " ");
        }
        System.out.print("  RIGHT: " + RIGHT + "  ");
    }

}
