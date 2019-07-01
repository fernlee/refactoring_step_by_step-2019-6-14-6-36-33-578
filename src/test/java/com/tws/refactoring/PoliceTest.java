package com.tws.refactoring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by yeli on 2019/7/1.
 */
class PoliceTest {
    @Test
    public void should_check_driver_is_true_when_drive_is_over_the_age_of_18() {
        Driver driver = new Driver(18);
        Police police = new Police();

        assertTrue(police.checkDriver(driver));

    }

    @Test
    public void should_check_driver_is_false_when_drive_is_under_the_age_of_18() {
        Driver driver = new Driver(17);
        Police police = new Police();

        assertFalse(police.checkDriver(driver));

    }

}