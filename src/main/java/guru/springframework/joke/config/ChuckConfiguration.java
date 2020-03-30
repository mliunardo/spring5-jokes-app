package guru.springframework.joke.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

//@Configuration
public class ChuckConfiguration {
	
	// @Bean
	public ChuckNorrisQuotes chuckNorrisQuotes() {
		/*
		 * Function name: IRRELEVANT
		 * Spring will simply search Bean based on the return type
		 */
		return new ChuckNorrisQuotes();
	}
	
}
