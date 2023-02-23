From dabal/jre11-alpine
RUN apk add curl jq  
WORKDIR /usr/share/selenium
ADD target/selenium-docker.jar selenium-docker.jar
ADD target/selenium-docker-tests.jar selenium-docker-tests.jar
ADD testng.xml testng.xml
ADD testng1.xml testng1.xml
ADD target/libs libs
RUN wget https://s3.amazonaws.com/selenium-docker/healthcheck/healthcheck.sh
Entrypoint sh healthcheck.sh

