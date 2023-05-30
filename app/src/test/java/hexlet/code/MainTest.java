package hexlet.code;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static hexlet.code.Main.sayHello;
import static  org.assertj.core.api.Assertions.*;

class MainTest {

    @Test
    void testSayHello() {
        String expected ="hello";
        String actual = sayHello();
        assertThat(actual).isEqualTo(expected);
    }
}