package guru.springframework.spring5webapp;

import org.junit.Test;

public class FooTest {

  @Test
  public void testBar() {
    Foo foo = new Foo();
    assert(foo.bar().equals("bar"));
  }

}
