package com.stdstack.multithread;

import com.stdstack.model.ConnectionInfo;
import com.stdstack.service.FileService;
import com.stdstack.util.Randomizer;

import java.util.Date;
import java.util.List;

public class Multithread extends Thread {

    private final ConnectionInfo connectionInfo;
    private final String name;
    private final int iterator;

    public Multithread(ConnectionInfo connectionInfo, int iterator, String name) {
        this.connectionInfo = connectionInfo;
        this.iterator = iterator;
        this.name = name;
    }

    @Override
    public void run() {
        boolean newProcess = true;
        boolean append = false;

        for (int i = 0; i < 100; i++) {
            Long period = 1L; //1000*60*60*12L;
            ConnectionInfo connectionInfo = new ConnectionInfo(Randomizer.getRandomSessionId(), Randomizer.getRandomIP(), new Date().getTime() - (i*period) );
            FileService.writeInfoToFile(connectionInfo,"connections.txt", append, newProcess);
            newProcess = false;
            append = true;
        }

        List<ConnectionInfo> connectionInfoList = FileService.readInfoFromFile("connections.txt");
        System.out.println(connectionInfoList.size());

        System.out.println(name + " is finished!");
    }


}
