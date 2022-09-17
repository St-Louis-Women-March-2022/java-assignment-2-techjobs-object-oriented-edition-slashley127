package org.launchcode.techjobs.oo.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.assertNotEquals;


/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {


    @Test
    public void testSettingJobId(){
        Job jobTest1 = new Job();
        Job jobTest2 = new Job();
        assertNotEquals(jobTest1.getId(), jobTest2.getId());
    }


}
