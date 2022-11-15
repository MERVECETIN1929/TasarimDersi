/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg15.pkg11.pkg2022bmt;

/**
 *
 * @author merve
 */
public class SayısaıStratejisi implements SinavStratejisi{

        @Override
    public Enum getBirinci() {
        return EnumDers.MATEMATIK;
    }

    @Override
    public Enum getIkinci() {
        return EnumDers.FEN;
    }

    @Override
    public Enum getUcuncu() {
        return EnumDers.TURKCE;
    }

    @Override
    public Enum getDorduncu() {
        return EnumDers.SOSYAL;
    }
}
