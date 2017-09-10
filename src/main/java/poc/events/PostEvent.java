package poc.events;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class PostEvent {

	
	private static final Logger log = LoggerFactory.getLogger(PostEvent.class);

	@PostConstruct
	public void postConstruct(){
		log.info("PostConstruct method being called");
	}
	
	@PreDestroy
	public void preDestroy(){
		log.info("PreDestroy method being called");
	}
}
