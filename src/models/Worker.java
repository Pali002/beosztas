/*
* File: Worker.java
* Author: Zentai Pál
* Copyright: 2022, Zentai Pál
* Group: Szoft-I-N
* Date: 2022-05-31
* Github: https://github.com/Pali002/
* Licenc: GNU GPL
*/

package models;

public class Worker {
    public int id;
    public String name;
    public double groupId;
    public Worker(int id, String name, double groupId) {
        this.id = id;
        this.name = name;
        this.groupId = groupId;
    }
}
