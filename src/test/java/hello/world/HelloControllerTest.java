package hello.world;


import io.micronaut.context.ApplicationContext;
import org.junit.Test;
import javax.inject.Inject;
import static org.junit.Assert.assertEquals;

public class HelloControllerTest {

    private ApplicationContext context;

    @Inject
    public prueba prueb;

    @Test
    public void testSaludo(){
        context = ApplicationContext.run(String.valueOf(Application.class));
        prueb = context.getBean(prueba.class);
        String saludo = prueb.saludo();
        assertEquals("hola mundo",saludo);
    }

}