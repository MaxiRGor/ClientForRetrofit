
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Main {

    /*
    Вопросы: id, тема, текст вопроса, ответ 1, ответ 2, ответ 3, ответ 4, правильный ответ. Создать массив объектов. Вывести:

    a) все вопросы по теме
    b) один вопрос по теме
    c) самый частый правильный ответ
    */

    public static void main(String[] args) {
/*
        Selection selection = new Selection();
        Question questions[] = new Question[25];
        for (int i = 0; i<25; i++){
            questions[i] = new Question();
            questions[i].ID = i;
        }

        Question onequestion = new Question("simpleConstructor");

        Scanner in = new Scanner(System.in);
        System.out.println(" 0 = Вывести все 25 вопросов ");
        System.out.println(" 1 = Вывести вопросы по теме ");
        System.out.println(" 2 = Вывести один вопрос ");
        System.out.println(" 3 = Вывести самый частый правильный ответ ");

        while (true) {
            System.out.println();
            System.out.println("Введите номер действия: ");
            int num = in.nextInt();
            switch (num) {
                case 0:
                    for (int i = 0; i < questions.length; i++) {
                        questions[i].show();
                    }
                    break;
                case 1:
                    System.out.print("Введите номер темы ");
                    int theme = in.nextInt();
                    selection.getAllFromTheme(questions,theme,onequestion.stackTheme);
                    break;
                case 2:
                    System.out.print("Введите id вопроса ");
                    int id = in.nextInt();
                    selection.getOneByID(questions,id);
                    break;
                case 3:
                    selection.getMostFrequent(questions,onequestion.stackAnswer);
                    break;
            }
        }

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://rawgit.com/startandroid/data/master/messages/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        MessagesApi messagesApi = retrofit.create(MessagesApi.class);

        Call<List<Message>> messages = messagesApi.messages();

        messages.enqueue(new Callback<List<Message>>() {
            @Override
            public void onResponse(Call<List<Message>> call, Response<List<Message>> response) {
                System.out.println( "response " +  response.body().size());
            }

            @Override
            public void onFailure(Call<List<Message>> call, Throwable throwable) {

            }
        });



        NetworkService.getInstance().getJSONApi()
                .getPostWithId(1).enqueue(new Callback<Post>() {
            @Override
            public void onResponse(Call<Post> call, Response<Post> response) {
                Post post = response.body();
                if (post != null) {
                    System.out.println(post.getId());
                    System.out.println(post.getUserId());
                    System.out.println(post.getTitle());
                    System.out.println(post.getBody());
                }
            }

            @Override
            public void onFailure(Call<Post> call, Throwable throwable) {
                System.out.println("ERROR OCCURED");
            }
        });
*/


        NetworkService.getInstance().getJSONApi().getAllPosts()
                .enqueue(new Callback<List<Post>>() {
                    @Override
                    public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {

                        List<Post> posts = response.body();
                        if (posts != null) {
                            for (Post post : posts) {
                                System.out.println(post.getId());
                                System.out.println(post.getUserId());
                                System.out.println(post.getTitle());
                            }
                        }

                    }

                    @Override
                    public void onFailure(Call<List<Post>> call, Throwable throwable) {

                    }
                });







    }
}


