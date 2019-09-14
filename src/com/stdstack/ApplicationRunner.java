package com.stdstack;

import com.stdstack.model.ConnectionInfo;
import com.stdstack.multithread.Multithread;
import com.stdstack.service.FileService;
import com.stdstack.util.Randomizer;

import java.util.Date;
import java.util.List;

public class ApplicationRunner {

    public static void main(String[] args) {

//        boolean newProcess = true;
//        boolean append = false;
//
//        for (int i = 0; i < 10; i++) {
//            Long period = 1000*60*60*12L;
//            ConnectionInfo connectionInfo = new ConnectionInfo(Randomizer.getRandomSessionId(), Randomizer.getRandomIP(), new Date().getTime() - (i*period) );
//            FileService.writeInfoToFile(connectionInfo,"connections.txt", append, newProcess);
//            newProcess = false;
//            append = true;
//        }
//
//        List<ConnectionInfo> connectionInfoList = FileService.readInfoFromFile("connections.txt");
//        System.out.println(connectionInfoList.size());

        //Многопоточка

        for (int i = 0; i < 100; i++) {
            Multithread multithread = new Multithread(new ConnectionInfo(), i, "Thread #" + (i+1));
            multithread.start();
        }


    }
}
