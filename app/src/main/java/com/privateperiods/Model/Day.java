package com.privateperiods.Model;

import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * Information for a particular day in a menstrual cycle
 *
 * @author Emily
 */
public class Day {
    Date date;
    boolean isPeriodDay;
    Date startTime;
    boolean isOvulating;
    int painRating;
    List<String> symptoms;
    List<String> notes;
    boolean hadProtectedSex;
    boolean hadUnprotectedSex;

}
