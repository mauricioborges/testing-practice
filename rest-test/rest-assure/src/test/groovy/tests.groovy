import static com.jayway.restassured.RestAssured.*
import static com.jayway.restassured.matcher.RestAssuredMatchers.*
import static org.hamcrest.Matchers.*

class MyClassTest extends GroovyTestCase {

    void setUp(){
        baseURI = "http://correiosapi.apphb.com"
    }
    
    void "testa se consigo obter um endereço a partir de um CEP"() {
        get("/cep/{cep}", 88062000)
        .then()
        .assertThat()
        .body("logradouro", equalTo("Afonso Dalembert"))
    }
}
