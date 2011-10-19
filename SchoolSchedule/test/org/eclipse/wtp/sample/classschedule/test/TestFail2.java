package org.eclipse.wtp.sample.classschedule.test;
import static org.junit.Assert.*;
import java.util.List;
import org.eclipse.wtp.sample.classschedule.SchoolClass;
import org.eclipse.wtp.sample.classschedule.SchoolSchedule;
import org.junit.Test;

public class TestFail2 {
	@Test
	public void test() {
		
		List<SchoolClass> classes;
		SchoolSchedule s = new SchoolSchedule();
		SchoolClass c1 = new SchoolClass("CSCI2270", 3, 5, 1);
		s.addClass(c1);
		SchoolClass c2 = new SchoolClass("CSCI2270", 3, 5, 1);
		s.addClass(c2);
		
		if (s.getClasses().size() == 2)
			fail("Course list allows duplicate classes");
	}
}