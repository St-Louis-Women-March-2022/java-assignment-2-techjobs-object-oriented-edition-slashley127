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
        Job emptyJobTest1 = new Job();
        Job emptyJobTest2 = new Job();
        assertNotEquals(emptyJobTest1.getId(), emptyJobTest2.getId());
    }


    @Test
    public void testJobConstructorSetsAllFields(){
        Job jobTest1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job jobTest2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(jobTest1.getEmployer() instanceof Employer);
        assertTrue(jobTest1.getLocation() instanceof Location);
        assertTrue(jobTest1.getPositionType() instanceof PositionType);
        assertTrue(jobTest1.getCoreCompetency() instanceof CoreCompetency);
        assertTrue(jobTest1.getName() != null);

        assertEquals(jobTest1.getName(), "Product tester");
        assertEquals(jobTest1.getEmployer().getValue(), "ACME");
        assertEquals(jobTest1.getLocation().getValue(), "Desert");
        assertEquals(jobTest1.getPositionType().getValue(), "Quality control");
        assertEquals(jobTest1.getCoreCompetency().getValue(), "Persistence");

    }

    @Test
    public void testJobsForEquality(){
        Job jobTest1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job jobTest2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(jobTest1 == jobTest2);
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job jobTest1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String jobTest1String = jobTest1.toString();

        assertEquals(jobTest1String.charAt(0), '\n' );
        assertEquals(jobTest1String.charAt(jobTest1String.length()-1), '\n');
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job jobTest1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals(jobTest1.toString(), "\nID: " + jobTest1.getId() + jobTest1.getName() + jobTest1.getEmployer() + jobTest1.getLocation() + jobTest1.getPositionType() + jobTest1.getCoreCompetency() + "\n");

    }

    @Test
    public void testToStringHandlesEmptyField(){
        Job jobTest1WithEmptyFields = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));

        assertEquals(jobTest1WithEmptyFields.toString(), "\nID: " + jobTest1WithEmptyFields.getId() + "\nName: Data not available\nEmployer: Data not available\nLocation: Data not available\nPosition Type: Data not available\nCore Competency: Data not available\n");
    }

}
