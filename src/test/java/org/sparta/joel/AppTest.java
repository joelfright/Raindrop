package org.sparta.joel;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;


public class AppTest {

    @Test
    @DisplayName("28 Factor | Plong")
    public void plongFactor() {
        Assert.assertEquals("Plong",App.raindrop(28));
    }

    @Test
    @DisplayName("30 Factor | PlingPlang")
    public void plangFactor() {
        Assert.assertEquals("PlingPlang",App.raindrop(30));
    }

    @Test
    @DisplayName("34 Factor | 34")
    public void numberFactor() {
        Assert.assertEquals("34",App.raindrop(34));
    }

    @Test
    @DisplayName("Out of Bounds | Number out of bounds")
    public void outOfBoundsZero(){
        Assert.assertEquals("Number out of bounds", App.raindrop(0));
    }

    @Test
    @DisplayName("Out of Bounds | Number out of bounds")
    public void outOfBoundsNegative(){
        Assert.assertEquals("Number out of bounds", App.raindrop(-1));
    }

}
