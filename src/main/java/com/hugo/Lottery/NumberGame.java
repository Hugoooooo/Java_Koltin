package com.hugo.Lottery;

import java.util.HashSet;
import java.util.Set;

public abstract class NumberGame {
    Set<Integer> numbers = new HashSet<>();
    public int numbercount = 0;

    public abstract void generate();
}
