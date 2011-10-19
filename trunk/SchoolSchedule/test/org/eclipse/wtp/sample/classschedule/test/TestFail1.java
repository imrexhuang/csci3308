package org.eclipse.wtp.sample.classschedule.test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.wtp.sample.classschedule.SchoolClass;
import org.eclipse.wtp.sample.classschedule.SchoolSchedule;
import org.junit.Test;
public class TestFail1 {
@Test
public void test() {
	SchoolSchedule s = new SchoolSchedule();
	SchoolClass cl = new SchoolClass("CSCI2270", 3, 4, 1);
	
	if (s.getClasses().size() != 0)
		fail("Empty course list has length != 0");
	
	s.addClass(cl);
	
	if (s.getClasses().size() != 1)
		fail("Course list with one course added is not 1 long");SchoolClass c2 = (SchoolClass) s.getClasses().get(0);
	
	if (c2.getTitle().equals("CSCI2270") == false)
		fail("First course added has wrong name");
	}
}