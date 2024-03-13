package com.example.mymood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    private int createRandomNumber() {
        return (int) (Math.random() * 100);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonGenerate = findViewById(R.id.button_generate);
        TextView tvPercent = findViewById(R.id.tv_percent);
        TextView tvAnswerDescription = findViewById(R.id.tv_answer_description);
        TextView tvAnswerTitle = findViewById(R.id.tv_answer_title);

        ImageView sadImage = findViewById(R.id.sadImage);
        ImageView normalImage = findViewById(R.id.normalImage);

        LottieAnimationView sun = findViewById(R.id.sun);
        LottieAnimationView fun = findViewById(R.id.fun);
        LottieAnimationView fire = findViewById(R.id.fire);

        String[] answers = {
                "В следующий раз точно получится, держись",
                "Не расстраивайся, все будет хорошо)",
                "Все в порядке? Расскажи мне",
                "Рад, что у вас все отлично!",
                "Это очень хорошо, молодец"
        };

        buttonGenerate.setOnClickListener(v -> {
            int randomNumber = createRandomNumber();
            tvPercent.setText("Процент: " + randomNumber + " %");

            if (randomNumber <= 10) {
                tvAnswerDescription.setText(answers[0]);
                sadImage.setVisibility(View.VISIBLE);
                fire.setVisibility(View.INVISIBLE);
                normalImage.setVisibility(View.INVISIBLE);
                fun.setVisibility(View.INVISIBLE);
                sun.setVisibility(View.INVISIBLE);
                tvAnswerTitle.setText("Ответ: Ужасно");
            }
            else if (randomNumber <= 30) {
                tvAnswerDescription.setText(answers[1]);
                fire.setVisibility(View.VISIBLE);
                sadImage.setVisibility(View.INVISIBLE);
                normalImage.setVisibility(View.INVISIBLE);
                fun.setVisibility(View.INVISIBLE);
                sun.setVisibility(View.INVISIBLE);
                tvAnswerTitle.setText("Ответ: Плохо");
            }
            else if (randomNumber <= 50) {
                tvAnswerDescription.setText(answers[2]);
                sadImage.setVisibility(View.INVISIBLE);
                fire.setVisibility(View.INVISIBLE);
                normalImage.setVisibility(View.VISIBLE);
                fun.setVisibility(View.INVISIBLE);
                sun.setVisibility(View.INVISIBLE);
                tvAnswerTitle.setText("Ответ: Нормально");
            }
            else if (randomNumber <= 80) {
                tvAnswerDescription.setText(answers[3]);
                sadImage.setVisibility(View.INVISIBLE);
                fire.setVisibility(View.INVISIBLE);
                normalImage.setVisibility(View.INVISIBLE);
                fun.setVisibility(View.VISIBLE);
                sun.setVisibility(View.INVISIBLE);
                tvAnswerTitle.setText("Ответ: Хорошо");
            }
            else {
                tvAnswerDescription.setText(answers[4]);
                sadImage.setVisibility(View.INVISIBLE);
                fire.setVisibility(View.INVISIBLE);
                normalImage.setVisibility(View.INVISIBLE);
                fun.setVisibility(View.INVISIBLE);
                sun.setVisibility(View.VISIBLE);
                tvAnswerTitle.setText("Ответ: Отлично");
            }
        });
    }
}