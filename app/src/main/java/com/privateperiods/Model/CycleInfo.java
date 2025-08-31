package com.privateperiods.Model;

import java.time.LocalDateTime;

/**
 * Contains minimal information on a menstrual cycle to display before an entire cycle is loaded
 *
 * @author Emily
 */
public class CycleInfo {

    String cycleId;
    LocalDateTime startDate;
    LocalDateTime endDate;
    CycleInfo prevCycle;
    CycleInfo nextCycle;
}
