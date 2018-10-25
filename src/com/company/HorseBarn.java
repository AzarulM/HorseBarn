package com.company;

import java.util.ArrayList;
import java.util.List;

public class HorseBarn {
    private Horse[] spaces;

    public HorseBarn(Horse[] spaces) {
        this.spaces = spaces;
    }

    public int findHorseSpace(String name) {
        for (int i = 0; i < spaces.length; i++) {
            if (spaces[i] != null && name.equals(spaces[i]))
                return i;
        }
        return -1;
    }

    public void consolidate() {
        for (int i = 0; i < this.spaces.length - 1; i++) {
            if (this.spaces[i] == null) {
                for (int j = i + 1; j < this.spaces.length; j++) {
                    if (this.spaces[j] != null) {
                        this.spaces[i] = this.spaces[j];
                        this.spaces[j] = null;
                        j = this.spaces.length;
                    }
                }
            }
        }
    }
}