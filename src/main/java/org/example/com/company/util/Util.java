package org.example.com.company.util;

import org.example.com.company.service.MainService;
import org.example.com.company.service.TaskService;

@SuppressWarnings("ALL")
public interface Util {
    MainService MAIN_SERVICE = new MainService();
    TaskService TASK_SERVICE = new TaskService();
}
