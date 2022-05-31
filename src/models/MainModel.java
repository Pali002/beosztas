/*
* File: MainModel.java
* Author: Zentai Pál
* Copyright: 2022, Zentai Pál
* Group: Szoft-I-N
* Date: 2022-05-31
* Github: https://github.com/Pali002/
* Licenc: GNU GPL
*/

package models;

import java.util.Arrays;
import java.util.Vector;


public class MainModel {
    Group[] groupArray = {
        new Group(1, "takarító"),
        new Group(1, "portás"),
        new Group(1, "recepciós"),
        new Group(1, "progaramozó"),
        new Group(1, "tesztelő"),
        new Group(1, "lakatos"),
        new Group(1, "szerelő"),
        new Group(1, "könyvelő"),
        new Group(1, "pénzkezelő"),
        new Group(1, "biztonsági őr"),
    };
    public Vector<Group> grouplist = new Vector<>(Arrays.asList(groupArray));
    Worker[] workerArray = {
        new Worker(1, "takarító", 1),
        new Worker(2, "portás", 2),
        new Worker(3, "recepciós", 3),
        new Worker(4, "programozó", 4),
        new Worker(5, "tesztelő", 5),
        new Worker(6, "lakatos", 6),
        new Worker(7, "szerelő", 7),
        new Worker(8, "könyvelő", 8),
        new Worker(9, "pénzkezelő", 9),
        new Worker(10, "biztonsági őr", 10),
    };
    public Vector<Worker> workerList = new Vector<>(Arrays.asList(workerArray));
}
