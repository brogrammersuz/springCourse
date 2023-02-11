package uz.brogrammers;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);

        //MusicPlayer player1 = context.getBean("musicPlayer", MusicPlayer.class);

        //System.out.println(player.equals(player1));

        player.playMusic();

        System.out.println(player.getName());
        System.out.println(player.getVolume());

        context.close();


        SingletonExample example1 = SingletonExample.getInstance("Example1");
        SingletonExample example2 = SingletonExample.getInstance("Example2");

        System.out.println(example1 == example2);
        System.out.println(example1.equals(example2));

        System.out.println(example1.getName());
        System.out.println(example2.getName());

    }

}
