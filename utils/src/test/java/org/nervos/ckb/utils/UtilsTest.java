package org.nervos.ckb.utils;

import java.math.BigInteger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/** Copyright © 2019 Nervos Foundation. All rights reserved. */
public class UtilsTest {

  @Test
  public void testCkbToShannon() {
    Assertions.assertEquals(BigInteger.valueOf(234300000000L), Utils.ckbToShannon(2343));
  }

  @Test
  public void testCkbToShannonWithBigInteger() {
    Assertions.assertEquals(
        new BigInteger("26589358000000000000"),
        Utils.ckbToShannon(BigInteger.valueOf(265893580000L)));
  }

  @Test
  public void testCkbToShannonWithDouble() {
    Assertions.assertEquals(new BigInteger("2560000"), Utils.ckbToShannon(0.0256));
  }
}
