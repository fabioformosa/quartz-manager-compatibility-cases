package it.fabioformosa.labs.legacyspring.jobs;

import it.fabioformosa.quartzmanager.api.jobs.AbstractQuartzManagerJob;
import it.fabioformosa.quartzmanager.api.jobs.entities.LogRecord;
import org.quartz.JobExecutionContext;

public class AlbertEinsteinQuoteJob extends AbstractQuartzManagerJob {
    @Override
    public LogRecord doIt(JobExecutionContext jobExecutionContext) {
        return new LogRecord(LogRecord.LogType.INFO, "Strive not to be a success, but rather to be of value");
    }
}

//import lombok.extern.slf4j.Slf4j;
//import org.quartz.Job;
//import org.quartz.JobExecutionContext;
//import org.quartz.JobExecutionException;
//
//@Slf4j
//public class AlbertEinsteinQuoteJob implements Job {
//
//    @Override
//    public void execute(JobExecutionContext context) throws JobExecutionException {
//        log.info("Strive not to be a success, but rather to be of value");
//    }
//}
