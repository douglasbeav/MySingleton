import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


class PersonTest {

    Person p;

    @BeforeEach
    void setUp() throws Exception {
        p = new Person();
        System.out.println("Before test");
    }

    @AfterEach
    void tearDown() throws Exception {
        System.out.println("After test");
    }

    @Test
    void testGetName() {
//        String s = "Jack";
//        p.setName("Jack");
//        String jill = p.getName();
//        assertEquals("Jack", p.getName());
//        assertNotEquals("Bob", p.getName());
        assertNull(null, p.getName());
        System.out.println("Testing getName");
    }

    @Test
    void testSetName() {
        p.setName("Bob");
        assertTrue(p.getName() == "Bob");
        System.out.println("Testing setName");
    }

    @Test
    void testInstanceOf() {
        System.out.println("Testing instance of Person");
            assertTrue(p instanceof Person);
    }
 }