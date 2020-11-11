package com.homework.todolist.utils;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: qyl
 * @Date: 2020/11/10 21:32
 */
@Component
public class TimeUtil {

    public String timeFormat(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String formatDate = sdf.format(date);
        return formatDate;
    }

}
