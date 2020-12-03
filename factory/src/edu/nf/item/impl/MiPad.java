package edu.nf.item.impl;

import edu.nf.containerfactory.Bean;
import edu.nf.item.Pad;

@Bean("miPad")
public class MiPad extends Pad {
    @Override
    public void read() {
        System.out.println("使用小米平板阅读");
    }

    @Override
    public void play() {
        System.out.println("使用小米平板玩游戏");
    }
}
