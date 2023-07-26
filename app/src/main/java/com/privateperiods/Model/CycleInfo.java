package com.privateperiods.Model;

import java.util.Date;

/**
 * Contains minimal information on a menstrual cycle to display before an entire cycle is loaded
 *
 * @author Emily
 */
public class CycleInfo {

    String cycleId;
    Date startDate;
    Date endDate;
    CycleInfo prevCycle;
    CycleInfo nextCycle;
}
