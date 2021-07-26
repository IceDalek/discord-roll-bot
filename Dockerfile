FROM bellsoft/liberica-openjdk-alpine:8

ADD target/Discord-roll-bot-1.0-SNAPSHOT.jar /app/Discord-roll-bot-1.0-SNAPSHOT.jar

WORKDIR /app

CMD ["java", "-Djava.net.preferIPv6Addresses=false", "-Djava.net.preferIPv4Stack=true", "-Dfile.encoding=utf8", "-jar", "Discord-roll-bot-1.0-SNAPSHOT.jar"]

