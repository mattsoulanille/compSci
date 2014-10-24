
/**
 * Write a description of class CombinationLockTester here.
 * 
 * @author Richard White 
 * @version 2013-10-14
 */
public class CombinationLockTester
{
    public static void main(String[] args)
    {
        int testsPassed = 0;
        
        System.out.println("Testing bikeLock...");
        System.out.println("Constructing lock with combo \"XYZ\"");
        CombinationLock bikeLock = new CombinationLock("XYZ");
        System.out.println("Lock open?" + bikeLock.isOpen());
        System.out.println("Expected: false");
        if (!bikeLock.isOpen()) testsPassed++;
        
        System.out.println("Trying AXY...");
        bikeLock.selectLetter("A");
        bikeLock.selectLetter("X");
        bikeLock.selectLetter("Y");
        bikeLock.openLock();
        System.out.println("Lock open?" + bikeLock.isOpen());
        System.out.println("Expected: false");
        if (!bikeLock.isOpen()) testsPassed++;
        
        System.out.println("Trying to add a Z...");
        bikeLock.selectLetter("Z");
        System.out.println("Lock open?" + bikeLock.isOpen());
        System.out.println("Expected: false");
        if (!bikeLock.isOpen()) testsPassed++;
        
        System.out.println("Trying AXYZ...");
        bikeLock.selectLetter("A");
        bikeLock.selectLetter("X");
        bikeLock.selectLetter("Y");
        bikeLock.selectLetter("Z");
        bikeLock.openLock();
        System.out.println("Lock open?" + bikeLock.isOpen());
        System.out.println("Expected: true");
        if (bikeLock.isOpen()) testsPassed++;
        
        System.out.println("Changing combination to \"ABC\"");
        bikeLock.changeCombo("ABC");
        
        System.out.println("Closing lock...");
        bikeLock.closeLock();
        System.out.println("Lock open?" + bikeLock.isOpen());
        System.out.println("Expected: false");
        if (!bikeLock.isOpen()) testsPassed++;
        
        System.out.println("Trying ABC...");
        bikeLock.selectLetter("A");
        bikeLock.selectLetter("B");
        bikeLock.selectLetter("C");
        bikeLock.openLock();
        System.out.println("Lock open?" + bikeLock.isOpen());
        System.out.println("Expected: true");
        if (bikeLock.isOpen()) testsPassed++;
    
        System.out.println("Tests passed = " + testsPassed + "/6");
    }
}
