package jp.techacademy.taiga.miyazaki.javalog;

import android.util.Log;

class Human extends Animal implements Thinkable {

    String hobby;

    public Human(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    @Override
    public void say() {
        Log.d("javatest", "私の名前は" + String.valueOf(name) + "です。年は、" + String.valueOf(age) + "歳です。");
    }

    @Override
    public void think() {
        Log.d("javatest", "私は、" + String.valueOf(hobby) + "について考えている。");
    }
}
