package br.com.dio.teste;

import jdk.jfr.Enabled;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class CondicionaisTest {
    @Test
    void validarAlgoSomenteSe(){
        Assumptions.assumeFalse("João".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 5 + 5);
    }
    @Test
    @DisabledIfEnvironmentVariable(named = "USER", matches = "João")
    void validarAlgoSomenteSeUsuarioDiferenteDeJoao(){
        Assertions.assertTrue(true);
    }
    @Test
    @EnabledOnOs(OS.WINDOWS)
    void ValidarSomenteEmWindows(){
        Assertions.assertEquals(10, 5 * 2);
    }
    @Test
    @EnabledOnJre(JRE.JAVA_18)
    void ValidarNaJRE18(){
        Assertions.assertEquals('#', '#');
    }
}