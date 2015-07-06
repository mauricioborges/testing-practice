//imports estaticos para facilitar o uso das APIs. É uma sugestão do REST assured inclusive
import static com.jayway.restassured.RestAssured.*
import static com.jayway.restassured.matcher.RestAssuredMatchers.*
import static org.hamcrest.Matchers.*

//note que eu extendo do GroovyTestCase, e não de um TestCase Junit. Para maiores informações consulte
// http://docs.groovy-lang.org/latest/html/documentation/core-testing-guide.html#_unit_tests_with_junit_3_and_4
class MyClassTest extends GroovyTestCase {

    void setUp(){
    //aqui eu configurei a url de um serviço web para consulta dos correios. Não fui eu que fiz :)
        baseURI = "http://correiosapi.apphb.com"
    }
    //detalhe para a sintaxe simplficada de declaração, e para o título do teste bem mais declarativo
    void "testa se consigo obter um endereço a partir de um CEP"() {
        //REST assure + hamcrest + groovy == <3
        get("/cep/{cep}", 88062000)
        .then()
        .assertThat()
        .body("logradouro", equalTo("Afonso Dalembert"))
    }
}
