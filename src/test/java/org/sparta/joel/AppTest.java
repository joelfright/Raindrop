package org.sparta.joel;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;


public class AppTest {

    @Test
    @DisplayName("28 Factor | Plong")
    public void PlongFactor() {
        Assert.assertEquals("Plong",App.raindrop(28));
    }

    @Test
    @DisplayName("30 Factor | PlingPlang")
    public void PlangFactor() {
        Assert.assertEquals("PlingPlang",App.raindrop(30));
    }

    @Test
    @DisplayName("34 Factor | 34")
    public void NumberFactor() {
        Assert.assertEquals("34",App.raindrop(34));
    }

    @Test
    @DisplayName("Out of Bounds | Number out of bounds")
    public void OutOfBoundsZero(){
        Assert.assertEquals("Number out of bounds", App.raindrop(0));
    }

    @Test
    @DisplayName("Out of Bounds | Number out of bounds")
    public void OutOfBoundsNegative(){
        Assert.assertEquals("Number out of bounds", App.raindrop(-1));
    }
}
