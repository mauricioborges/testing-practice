docker run -it --rm --name rest-assure-testing -v "$PWD":/usr/src/rest-assure -w /usr/src/rest-assure maven:3.2-jdk-7 mvn clean test
