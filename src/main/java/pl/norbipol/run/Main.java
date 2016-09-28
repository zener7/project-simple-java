package pl.norbipol.run;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class Main {

	public static void main(String[] args) {
		System.out.println("działa");
		log.info("Działa log4j");
		if(log.isDebugEnabled()){
			log.debug("debug jest");
		}
		
	}

}
