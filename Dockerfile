From dabal/jre11-alpine
RUN apk add curl jq  
WORKDIR /usr/share/udemy
ADD target/docker.jar docker.jar
ADD target/docker-tests.jar docker-tests.jar
ADD testng.xml testng.xml
ADD testng1.xml testng1.xml
ADD target/alternateLocation alternateLocation
ADD healthcheck.sh healthcheck.sh
Entrypoint sh healthcheck.sh