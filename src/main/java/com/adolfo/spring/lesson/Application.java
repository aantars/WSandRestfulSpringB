package com.adolfo.spring.lesson;

import com.adolfo.spring.lesson.game.GameRunner;
import com.adolfo.spring.lesson.game.MarioGame;
import com.adolfo.spring.lesson.game.SuperContra;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		/*System.out.println("jello");*/

		GameRunner runner = context.getBean(GameRunner.class);
		//MarioGame game = new MarioGame();
		/*SuperContra game = new SuperContra();

		GameRunner runner = new GameRunner(game) ;*/
		runner.runGame();
	}


}
