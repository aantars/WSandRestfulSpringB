package com.adolfo.spring.lesson;

import com.adolfo.spring.lesson.game.GameRunner;
import com.adolfo.spring.lesson.game.MarioGame;
import com.adolfo.spring.lesson.game.SuperContra;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		/*SpringApplication.run(Application.class, args);
		System.out.println("jello");*/
		MarioGame game = new MarioGame();
		//SuperContra game = new SuperContra();

		GameRunner runner = new GameRunner(game) ;
		runner.runGame();
	}


}
