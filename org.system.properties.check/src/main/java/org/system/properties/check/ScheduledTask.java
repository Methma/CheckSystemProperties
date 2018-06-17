package org.system.properties.check;

import java.util.*;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ScheduledTask extends TimerTask {

    Log log = LogFactory.getLog(ScheduledTask.class);

    public void run() {
        Properties properties = System.getProperties();

        log.info("-- System Properties --");

        for (Map.Entry<Object, Object> entry : properties.entrySet()) {
            log.info(entry.getKey().toString() + "=" + entry.getValue().toString());
        }
    }

    public static void main(String args[]) {

        Timer time = new Timer();
        ScheduledTask st = new ScheduledTask();
        time.schedule(st, 0, 10000);


    }
}
