import java.util.ArrayList;
import source.*;
import junit.framework.TestCase;

public class junitTest extends TestCase {
	Quaries q;
	//executeMain e;
	ArrayList<People> test = new ArrayList<>();
	People Nancy = new People("Nancy");
	People Adam = new People("Adam");
	People Jill = new People("Jill");
	People Carl = new People("Carl");
	People Kevin = new People("Kevin");
	People Catherine = new People("Catherine");
	People Joseph = new People("Joseph");
	People Aaron = new People("Aaron");
	People James = new People("James");
	People George = new People("George");
	People Samuel = new People("Samuel");
	People Mary = new People("Mary");
	People Patrick = new People("Patrick");
	People Robert = new People("Robert");

	public ArrayList<People> intialize() {

		Nancy.addChild(Adam);
		Nancy.addChild(Jill);
		Nancy.addChild(Carl);
		Jill.addChild(Kevin);
		Carl.addChild(Catherine);
		Carl.addChild(Joseph);
		Kevin.addChild(Samuel);
		Kevin.addChild(George);
		Kevin.addChild(James);
		Kevin.addChild(Aaron);
		James.addChild(Mary);
		George.addChild(Patrick);
		George.addChild(Robert);

		test.add(Nancy);
		test.add(Adam);
		test.add(Jill);
		test.add(Carl);
		test.add(Kevin);
		test.add(Catherine);
		test.add(Joseph);
		test.add(Aaron);
		test.add(James);
		test.add(George);
		test.add(Samuel);
		test.add(Mary);
		test.add(Patrick);
		test.add(Robert);

		return test;
	}	
	

	public void test_getpeopleWithNoChildren() {

		String result = "[Adam, Catherine, Joseph, Aaron, Samuel, Mary, Patrick, Robert]";
		assertEquals(result, q.getpeopleWithNoChildren(intialize()).toString());
	}

	public void test_getpeopleWithSiblings() {

		String noSiblings = "[Nancy, Kevin, Mary]";
		assertEquals(noSiblings, q.getpeopleWithNoSiblings(intialize())
				.toString());

	}
	
	public void test_getPersonlargenumberofGrandChildren() {

		String per = "Jill";
		assertEquals(per, q.MaxgrandChildList(intialize())
				.toString());

	}
	
	public void test_gradndPa() {

		Nancy.addChild(Adam);
		Nancy.addChild(Jill);
		Nancy.addChild(Carl);
		Jill.addChild(Kevin);
		Carl.addChild(Catherine);
		Carl.addChild(Joseph);
		Kevin.addChild(Samuel);
		Kevin.addChild(George);
		Kevin.addChild(James);
		Kevin.addChild(Aaron);
		James.addChild(Mary);
		George.addChild(Patrick);
		George.addChild(Robert);

		assertEquals("[Nancy]", q.getGradPa(Kevin).toString());	
	}
	
	public void test_gradndPaNotcorrect() {

		Nancy.addChild(Adam);
		Nancy.addChild(Jill);
		Nancy.addChild(Carl);
		Jill.addChild(Kevin);
		Carl.addChild(Catherine);
		Carl.addChild(Joseph);
		Kevin.addChild(Samuel);
		Kevin.addChild(George);
		Kevin.addChild(James);
		Kevin.addChild(Aaron);
		James.addChild(Mary);
		George.addChild(Patrick);
		George.addChild(Robert);

		assertNotSame("[Nancy]", q.getGradPa(Kevin).toString());		
	}

}
