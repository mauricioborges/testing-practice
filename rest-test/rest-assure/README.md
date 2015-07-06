# Testando REST em Java usando Groovy

# In details

Esta ideia surgiu de uma pergunta que fiz pro Júlio no [N Ways to Test](http://www.meetup.com/N-Ways-to-Test/) ao ver o resultado fantástico do [hands on dele](https://goo.gl/ClkJve):

> Júlio, já chegaste a usar o REST-assured com Groovy?

Decidi então fazer um teste básico, em moldes similares ao teste que ele apresentou no evento.

# Rodando

Usei o [Gradle](http://gradle.org/) ao invés do [Maven](https://maven.apache.org/) por alguns motivos:
* depois que pega o jeito, é mais fácil de configurar
* possui uma integração mais tranquila com código Groovy
* é fácil de executar sem nenhuma instalação (veja a seguir)
* eu gosto dele :)

Para começar, você só precisar executar, no shell do Linux:
```
./gradlew test
```
ou ainda, no Windows:
```
gradlew.bat test
```

Este [comando](https://docs.gradle.org/current/userguide/gradle_wrapper.html) instala o Gradle na primeira vez que é executado, facilitando o prineiro uso.

Fiz algumas configurações adicionais para que a saída do console mostre qual foi o erro de asserção. Além disso o Gradle gera por padrão um relatório em HTML dos erros de teste.

Note que eu deixei o teste falhando de propósito, mas tá lá: Groovy + REST assured funciona :)

# Sobre a configuração do build

Abrindo o arquivo build.gradle, há algumas seções que achei interessante explicar:

