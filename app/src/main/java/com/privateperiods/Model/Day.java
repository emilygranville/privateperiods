package com.privateperiods.Model;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Information for a particular day in a menstrual cycle
 *
 * @author Emily
 */
public class Day {
    LocalDateTime date;
    boolean isPeriodDay;
    LocalDateTime startTime;
    boolean isOvulating;
    int painRating;
    List<String> symptoms;
    List<String> notes;
    boolean hadProtectedSex;
    boolean hadUnprotectedSex;

}
