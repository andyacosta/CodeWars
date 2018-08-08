package codewars.kyu6;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CheckingGroupsTest {
  
  @Test
  public void myTests() {
	  assertEquals(CheckingGroups.groupCheck(""), true);
	  assertEquals(CheckingGroups.groupCheck("()"), true);
	  assertEquals(CheckingGroups.groupCheck("({"), false);
	  assertEquals(CheckingGroups.groupCheck("{(})"), false);
	  assertEquals(CheckingGroups.groupCheck("([]"), false);
	  assertEquals(CheckingGroups.groupCheck("[])"), false);
  }
}


