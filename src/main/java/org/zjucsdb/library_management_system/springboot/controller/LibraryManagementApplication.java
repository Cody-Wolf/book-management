package org.zjucsdb.library_management_system.springboot.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

import static java.lang.Thread.sleep;

@SpringBootApplication
public class LibraryManagementApplication {
    private static final Logger log = Logger.getLogger(LibraryManagementApplication.class.getName());

    public static void main(String[] args) {
        SpringApplication.run(LibraryManagementApplication.class, args);
    }

    public static void start() throws InterruptedException {
        SpringApplication.run(LibraryManagementApplication.class);
        log.info("\u001B[31m" + "Testing LibraryManagementApplication for 30 min. After that, application will shut down.");
        sleep(1000 * 60 * 30);
    }
}
