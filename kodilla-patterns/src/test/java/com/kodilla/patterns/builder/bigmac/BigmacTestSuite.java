package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigmac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("bułka z sezamem")
                .burgers("2")
                .sauce("1000 wysp")
                .ingredient("sałata")
                .ingredient("bekon")
                .ingredient("papryczki chilli")
                .ingredient("ser")
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        Assert.assertEquals(4, howManyIngredients);
    }
}
