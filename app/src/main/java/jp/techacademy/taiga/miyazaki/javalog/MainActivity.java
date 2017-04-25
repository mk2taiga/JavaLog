package jp.techacademy.taiga.miyazaki.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Dog dog = new Dog("ポチ", 3);   // 名前をポチ、年齢3歳で、Dogのインスタンスを作る
        dog.move();
        Human human = new Human("田中", 20, "漫画");
        human.say();
        human.think();
    }
}
