package snippet;

public class Snippet {
	<?xml version="1.0" encoding="UTF-8"?>
	<Configuration status="WARN">
	    <Appenders>
	        <!-- Console appender -->
	        <Console name="Console" target="SYSTEM_OUT">
	            <PatternLayout pattern="%d{HH:mm:ss.SSS} [%t] %-5level %logger{36} - %msg%n"/>
	        </Console>
	    </Appenders>
	
	    <Loggers>
	        <!-- Root logger -->
	        <Root level="INFO">
	            <AppenderRef ref="Console"/>
	        </Root>
	
	        <!-- Optional: logger for your 
}

