/*
Copyright 2015 Seann Murdock

        Licensed under the Apache License, Version 2.0 (the "License");
        you may not use this file except in compliance with the License.
        You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

        Unless required by applicable law or agreed to in writing, software
        distributed under the License is distributed on an "AS IS" BASIS,
        WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        See the License for the specific language governing permissions and
        limitations under the License.
 */
package com.seannmurdock.murdock_reflex;

import java.util.ArrayList;

/**
 * Created by murdock on 10/2/15.
 */
public class GBStatList {
    // store wins as an integer list
    private ArrayList<Integer> wins = new ArrayList<Integer>();

    public GBStatList(int players) {
        // wins set to 0 for all players
        for(int x=0; x< players; x++){
            this.wins.add(0);
        }
    }
    // extracts who won from the stat and updates to the list
    public void add(Stat stat){
        int x = Integer.parseInt(stat.getData());
        int y = this.wins.get(x-1);
        y = y +1;
        this.wins.set(x-1, y);
    }
    // returns the number of wins for a specific player
    public String get(int i){
        Integer x =  this.wins.get(i);
        return x.toString();
    }
}
