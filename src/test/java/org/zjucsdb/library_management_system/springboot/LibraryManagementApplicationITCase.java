package org.zjucsdb.library_management_system.springboot;

import org.junit.jupiter.api.Test;
import org.zjucsdb.library_management_system.springboot.controller.LibraryManagementApplication;

public class LibraryManagementApplicationITCase {

    @Test
    public void testStart() throws InterruptedException {
        LibraryManagementApplication.start();
    }
}
