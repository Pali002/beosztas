/*
* File: MainController.java
* Author: Zentai Pál
* Copyright: 2022, Zentai Pál
* Group: Szoft-I-N
* Date: 2022-05-31
* Github: https://github.com/Pali002/
* Licenc: GNU GPL
*/

package controllers;

import models.MainModel;
import views.MainFrame;

public class MainController {
    MainFrame mainFrame;
    MainModel mainModel;
    public MainController() {
        this.mainFrame = new MainFrame();
        this.mainModel = new MainModel();
        this.mainFrame.groupModel.addElement("válasszon beosztást");
        this.mainModel.grouplist.forEach(group ->{
            this.mainFrame.groupModel.addElement(group.post);
        });
        this.setEvents();
    }
    private void setEvents() {
        this.mainFrame.groupCombo.addActionListener(event -> onActionGroupCombo());
    }
    private void onActionGroupCombo() {
        int index = this.mainFrame.groupCombo.getSelectedIndex();
        int selectedGroupId = index;
        this.mainFrame.workerModel.clear();
        this.mainModel.workerList.forEach(worker -> {
            if(selectedGroupId == worker.groupId) {
                this.mainFrame.workerModel.addElement(worker.name);
            }
        });
    }
    
}
