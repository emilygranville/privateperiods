package com.privateperiods.Model;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Contains all information about a menstrual cycle
 *
 * @author Emily
 */
public class Cycle {
    String cycleId;
    LocalDateTime startDate;
    LocalDateTime endDate;
    List<String> notes;
    boolean isUsingBirthControl;
    double averagePain;
    List<Day> listOfDays;
    boolean inMenopause;
}
