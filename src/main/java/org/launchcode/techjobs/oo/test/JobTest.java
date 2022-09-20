package org.launchcode.techjobs.oo.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;


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

    @Test
    public void testJobConstructorSetsAllFields(){
        Job jobTestConstructor = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(jobTestConstructor.getEmployer() instanceof Employer);
        assertTrue(jobTestConstructor.getLocation() instanceof Location);
        assertTrue(jobTestConstructor.getPositionType() instanceof PositionType);
        assertTrue(jobTestConstructor.getCoreCompetency() instanceof CoreCompetency);
        assertTrue(jobTestConstructor.getName() != null);

        assertEquals(jobTestConstructor.getName(), "Product tester");
        assertEquals(jobTestConstructor.getEmployer().getValue(), "ACME");
        assertEquals(jobTestConstructor.getLocation().getValue(), "Desert");
        assertEquals(jobTestConstructor.getPositionType().getValue(), "Quality control");
        assertEquals(jobTestConstructor.getCoreCompetency().getValue(), "Persistence");

    }

    @Test
    public void testJobsForEquality(){
        Job jobTestForEquality1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job jobTestForEquality2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(jobTestForEquality1 == jobTestForEquality2);
    }
}
