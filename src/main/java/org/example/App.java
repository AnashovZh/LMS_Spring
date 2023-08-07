package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        Spring Framework
//        Spring Core
//        1. Озунуздор логикалык жактан байланышкан проект  тузунуздор.
//        1. Проектте 3 класс болсун. Ичине каалаган свойстваларын берип bean тузунуздор.
//        2. 1 класс тузуп, DI кылыныздар
//        3. Бардык настройкаларды applicationContext.xml файлда бериниздер
//        4. DI 1 класстыкы, конструктор аркылуу 2 класстыкы setter аркылуу болсун.Setter де лист алсын.
//        5. Полелерге маанилер application.properties аркылуу берилсин
        //space-earth -sun-moon
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
//      Moon moon=new Moon();
//      moon.getSpaceName();
//        System.out.println(moon);
//        Jupiter jupiter=new Jupiter();
//        jupiter.getSpaceName();
//        System.out.println(jupiter);
//        Sun sun=new Sun();
//        sun.getSpaceName();
//        System.out.println(sun);
//        Planet planet=applicationContext.getBean("planeta",Planet.class);
//        System.out.println(planet);
//        applicationContext.close();
        Moon moon=applicationContext.getBean("moon", Moon.class);
        System.out.println(moon);
        moon.getSpaceName();
//        applicationContext.close();
        Sun sun=applicationContext.getBean("sun",Sun.class);
        System.out.println(sun);
        sun.getSpaceName();
//        applicationContext.close();
        Jupiter jupiter=applicationContext.getBean("jupiter",Jupiter.class);
        System.out.println(jupiter);
        jupiter.getSpaceName();
//        applicationContext.close();
        Planet planet=applicationContext.getBean("planet",Planet.class);
        System.out.println(planet);
        applicationContext.close();


    }
}
