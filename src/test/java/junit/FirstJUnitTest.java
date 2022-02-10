package junit;

import org.junit.jupiter.api.*;

public class FirstJUnitTest {

    @BeforeAll
    static void before() {
        System.out.println("Этот метод один раз перед всеми");
    }

    @AfterAll
    static void after() {
        System.out.println("Этот метод один раз после всех");
    }

    @BeforeEach
    void openBrowser() {
        System.out.println("    Этот каждый аз перед");
    }

    @AfterEach
    void closeBrowser() {
        System.out.println("    Этот каждый раз после");
    }

    @Test
    void textTest() {
        System.out.println("        Это сам тест первый");
    }

    @Test
    void videoTest() {
        System.out.println("        Это сам тест второй");
    }
}
