import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Answer {
    @SerializedName("id_answer")
    @Expose
    private int id_answer;

    @SerializedName("id_question")
    @Expose
    private int id_question;

    @SerializedName("right_answer")
    @Expose
    private int right_answer;

    @SerializedName("answer_one")
    @Expose
    private int answer_one;

    @SerializedName("answer_two")
    @Expose
    private int answer_two;

    @SerializedName("answer_three")
    @Expose
    private int answer_three;

    @SerializedName("answer_four")
    @Expose
    private int answer_four;


    public int getId_question() {
        return id_question;
    }

    public int getId_answer() {
        return id_answer;
    }

    public int getAnswer_one() {
        return answer_one;
    }

    public int getAnswer_two() {
        return answer_two;
    }

    public int getAnswer_three() {
        return answer_three;
    }

    public int getAnswer_four() {
        return answer_four;
    }

    public void setAnswer_one(int answer_one) {
        this.answer_one = answer_one;
    }

    public void setAnswer_two(int answer_two) {
        this.answer_two = answer_two;
    }

    public void setAnswer_three(int answer_three) {
        this.answer_three = answer_three;
    }

    public void setAnswer_four(int answer_four) {
        this.answer_four = answer_four;
    }
}
