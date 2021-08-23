package dev.marcelomds.template;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TemplateApplicationTests {

  @Test
  void contextLoads() {
    Assertions.assertDoesNotThrow(() -> TemplateApplication.main(new String[] {}));
  }
}
