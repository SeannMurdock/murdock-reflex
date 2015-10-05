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

/**
 * Created by murdock on 10/5/15.
 */
public class gsb3controller{
    private static GBStatList gsb3 =  null;
    static public GBStatList getGBStatList() {
        if(gsb3 ==null){
            gsb3 = new GBStatList(3);
        }
        return gsb3;
    }

    public void P1press() {
        Stat stat = new Stat();
        stat.setData("1");
        getGBStatList().add(stat);
    }

    public void P2press() {
        Stat stat = new Stat();
        stat.setData("2");
        getGBStatList().add(stat);
    }

    public void P3press() {
        Stat stat = new Stat();
        stat.setData("3");
        getGBStatList().add(stat);
    }

}
