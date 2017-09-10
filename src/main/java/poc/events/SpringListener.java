package poc.events;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class SpringListener {

	private static final Logger log = LoggerFactory.getLogger(SpringListener.class);

	@EventListener
	public void handleContextRefresh(ContextStartedEvent event) {
		log.info("{} @ {}", event.getClass().getName(), event.getTimestamp());
	}

	@EventListener
	public void handleContextRefresh(ContextClosedEvent event) {
		log.info("{} @ {}", event.getClass().getName(), event.getTimestamp());
	}

	@EventListener
	public void handleContextRefresh(ContextStoppedEvent event) {
		log.info("{} @ {}", event.getClass().getName(), event.getTimestamp());
	}

	@EventListener
	public void handleContextRefresh(ContextRefreshedEvent event) {
		log.info("{} @ {}", event.getClass().getName(), event.getTimestamp());
	}
}
