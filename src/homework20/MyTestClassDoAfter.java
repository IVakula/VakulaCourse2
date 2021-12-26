package homework20;


public class MyTestClassDoAfter {
    @Test(priority = 2)
    public void doTest1() {
        System.out.println("Counted");
    }

    @Test(priority = 1)
    public void doTest3() {
        System.out.println("Read");
    }

    @Test(priority = 3)
    public void doTest2() {
        System.out.println("Wrote");
    }

    @Test(priority = 4)
    public void doTest4() {
        System.out.println("Called");
    }

    @BeforeSuite
    public void doBefore() {
        System.out.println("Reviewed");
    }

    @AfterSuite
    public void doAfter1() {
        System.out.println("Checked");
    }

    @AfterSuite
    public void doAfter2() {
        System.out.println("Checked2");
    }
}
