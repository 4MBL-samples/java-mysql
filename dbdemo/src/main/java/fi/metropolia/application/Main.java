package fi.metropolia.application;

import fi.metropolia.dao.WorkerDao;
import fi.metropolia.datasource.MariaDBConn;
import fi.metropolia.entity.Worker;

public class Main {
    public static void main(String[] args) throws Exception {

        MariaDBConn.getInstance();

        WorkerDao wDao = new WorkerDao();

        Worker w = wDao.getWorker(1);
        System.out.println(w.getFirstName() + " " + w.getLastName());
    }
}
