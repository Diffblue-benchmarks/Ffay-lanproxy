package org.fengfei.lanproxy.common;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;

import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.lang.reflect.InvocationTargetException;

@RunWith(PowerMockRunner.class)
public class LangUtilTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: LangUtil */
  // Test written by Diffblue Cover.

  @Test
  public void constructorOutputVoid() {

    // Act, creating object to test constructor
    final LangUtil objectUnderTest = new LangUtil();

    // Method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void parseBooleanInputNotNullFalseOutputFalse() {

    // Arrange
    final Boolean value = new Boolean(false);
    final boolean defaultValue = false;

    // Act
    final boolean actual = LangUtil.parseBoolean(value, defaultValue);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void parseBooleanInputNotNullFalseOutputFalse2() {

    // Arrange
    final Object value = "a/b/c";
    final boolean defaultValue = false;

    // Act
    final boolean actual = LangUtil.parseBoolean(value, defaultValue);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void parseBooleanInputNotNullOutputFalse() {

    // Arrange
    final Boolean value = new Boolean(false);

    // Act
    final Boolean actual = LangUtil.parseBoolean(value);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void parseBooleanInputNotNullOutputFalse2() {

    // Arrange
    final Object value = "1a 2b 3c";

    // Act
    final Boolean actual = LangUtil.parseBoolean(value);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void parseBooleanInputNullFalseOutputFalse() {

    // Arrange
    final Object value = null;
    final boolean defaultValue = false;

    // Act
    final boolean actual = LangUtil.parseBoolean(value, defaultValue);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void parseBooleanInputNullOutputNull() {

    // Arrange
    final Object value = null;

    // Act
    final Boolean actual = LangUtil.parseBoolean(value);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void parseDoubleInputNotNullNullOutputZero() {

    // Arrange
    final Double value = new Double(0.0);
    final Double defaultValue = null;

    // Act
    final Double actual = LangUtil.parseDouble(value, defaultValue);

    // Assert result
    Assert.assertEquals(0.0, actual, 0.0);
  }

  // Test written by Diffblue Cover.
  @Test
  public void parseDoubleInputNotNullOutputZero() {

    // Arrange
    final Double value = new Double(0.0);

    // Act
    final Double actual = LangUtil.parseDouble(value);

    // Assert result
    Assert.assertEquals(0.0, actual, 0.0);
  }

  // Test written by Diffblue Cover.
  @Test
  public void parseDoubleInputNullNullOutputNull() {

    // Arrange
    final Object value = null;
    final Double defaultValue = null;

    // Act
    final Double actual = LangUtil.parseDouble(value, defaultValue);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void parseDoubleInputNullOutputNull() {

    // Arrange
    final Object value = null;

    // Act
    final Double actual = LangUtil.parseDouble(value);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void parseIntInputNotNullOutputPositive() {

    // Arrange
    final Object value = "3";

    // Act
    final Integer actual = LangUtil.parseInt(value);

    // Assert result
    Assert.assertEquals(new Integer(3), actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void parseIntInputNotNullZeroOutputPositive() {

    // Arrange
    final Object value = "1";
    final Integer defaultValue = 0;

    // Act
    final Integer actual = LangUtil.parseInt(value, defaultValue);

    // Assert result
    Assert.assertEquals(new Integer(1), actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void parseIntInputNullOutputNull() {

    // Arrange
    final Object value = null;

    // Act
    final Integer actual = LangUtil.parseInt(value);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void parseIntInputNullZeroOutputZero() {

    // Arrange
    final Object value = null;
    final Integer defaultValue = 0;

    // Act
    final Integer actual = LangUtil.parseInt(value, defaultValue);

    // Assert result
    Assert.assertEquals(new Integer(0), actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void parseIntInputPositiveOutputPositive() {

    // Arrange
    final Object value = 1;

    // Act
    final Integer actual = LangUtil.parseInt(value);

    // Assert result
    Assert.assertEquals(new Integer(1), actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void parseIntInputPositiveZeroOutputPositive() {

    // Arrange
    final Object value = 1;
    final Integer defaultValue = 0;

    // Act
    final Integer actual = LangUtil.parseInt(value, defaultValue);

    // Assert result
    Assert.assertEquals(new Integer(1), actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void parseLongInputNotNullOutputPositive() {

    // Arrange
    final Long value = new Long(6L);

    // Act
    final Long actual = LangUtil.parseLong(value);

    // Assert result
    Assert.assertEquals(new Long(6L), actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void parseLongInputNotNullOutputPositive2() {

    // Arrange
    final Object value = "3";

    // Act
    final Long actual = LangUtil.parseLong(value);

    // Assert result
    Assert.assertEquals(new Long(3L), actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void parseLongInputNotNullZeroOutputPositive() {

    // Arrange
    final Object value = "2";
    final Long defaultValue = 0L;

    // Act
    final Long actual = LangUtil.parseLong(value, defaultValue);

    // Assert result
    Assert.assertEquals(new Long(2L), actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void parseLongInputNullNullOutputNull() {

    // Arrange
    final Object value = null;
    final Long defaultValue = null;

    // Act
    final Long actual = LangUtil.parseLong(value, defaultValue);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void parseLongInputNullOutputNull() {

    // Arrange
    final Object value = null;

    // Act
    final Long actual = LangUtil.parseLong(value);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void parseLongInputPositiveZeroOutputPositive() {

    // Arrange
    final Object value = 1L;
    final Long defaultValue = 0L;

    // Act
    final Long actual = LangUtil.parseLong(value, defaultValue);

    // Assert result
    Assert.assertEquals(new Long(1L), actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void staticInitOutputVoid() throws InvocationTargetException {

    // Act, using constructor to test static initializer
    final Object constructed = Reflector.getInstance("org.fengfei.lanproxy.common.LangUtil");

    // Method returns void, testing that no exception is thrown
  }
}
