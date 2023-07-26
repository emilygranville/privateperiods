package com.privateperiods.Model;

import java.util.Date;
import java.util.List;

/**
 * Contains all information about a menstrual cycle
 *
 * @author Emily
 */
public class Cycle {
    String cycleId;
    Date startDate;
    Date endDate;
    List<String> notes;
    boolean isUsingBirthControl;
    double averagePain;
    List<Day> listOfDays;
    boolean inMenopause;
}
