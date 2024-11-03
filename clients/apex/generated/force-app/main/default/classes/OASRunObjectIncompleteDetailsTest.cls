@isTest
private class OASRunObjectIncompleteDetailsTest {
    @isTest
    private static void equalsSameInstance() {
        OASRunObjectIncompleteDetails runObjectIncompleteDetails1 = OASRunObjectIncompleteDetails.getExample();
        OASRunObjectIncompleteDetails runObjectIncompleteDetails2 = runObjectIncompleteDetails1;
        OASRunObjectIncompleteDetails runObjectIncompleteDetails3 = new OASRunObjectIncompleteDetails();
        OASRunObjectIncompleteDetails runObjectIncompleteDetails4 = runObjectIncompleteDetails3;

        System.assert(runObjectIncompleteDetails1.equals(runObjectIncompleteDetails2));
        System.assert(runObjectIncompleteDetails2.equals(runObjectIncompleteDetails1));
        System.assert(runObjectIncompleteDetails1.equals(runObjectIncompleteDetails1));
        System.assert(runObjectIncompleteDetails3.equals(runObjectIncompleteDetails4));
        System.assert(runObjectIncompleteDetails4.equals(runObjectIncompleteDetails3));
        System.assert(runObjectIncompleteDetails3.equals(runObjectIncompleteDetails3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRunObjectIncompleteDetails runObjectIncompleteDetails1 = OASRunObjectIncompleteDetails.getExample();
        OASRunObjectIncompleteDetails runObjectIncompleteDetails2 = OASRunObjectIncompleteDetails.getExample();
        OASRunObjectIncompleteDetails runObjectIncompleteDetails3 = new OASRunObjectIncompleteDetails();
        OASRunObjectIncompleteDetails runObjectIncompleteDetails4 = new OASRunObjectIncompleteDetails();

        System.assert(runObjectIncompleteDetails1.equals(runObjectIncompleteDetails2));
        System.assert(runObjectIncompleteDetails2.equals(runObjectIncompleteDetails1));
        System.assert(runObjectIncompleteDetails3.equals(runObjectIncompleteDetails4));
        System.assert(runObjectIncompleteDetails4.equals(runObjectIncompleteDetails3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRunObjectIncompleteDetails runObjectIncompleteDetails1 = OASRunObjectIncompleteDetails.getExample();
        OASRunObjectIncompleteDetails runObjectIncompleteDetails2 = new OASRunObjectIncompleteDetails();

        System.assertEquals(false, runObjectIncompleteDetails1.equals('foo'));
        System.assertEquals(false, runObjectIncompleteDetails2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRunObjectIncompleteDetails runObjectIncompleteDetails1 = OASRunObjectIncompleteDetails.getExample();
        OASRunObjectIncompleteDetails runObjectIncompleteDetails2 = new OASRunObjectIncompleteDetails();
        OASRunObjectIncompleteDetails runObjectIncompleteDetails3;

        System.assertEquals(false, runObjectIncompleteDetails1.equals(runObjectIncompleteDetails3));
        System.assertEquals(false, runObjectIncompleteDetails2.equals(runObjectIncompleteDetails3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRunObjectIncompleteDetails runObjectIncompleteDetails1 = OASRunObjectIncompleteDetails.getExample();
        OASRunObjectIncompleteDetails runObjectIncompleteDetails2 = new OASRunObjectIncompleteDetails();

        System.assertEquals(runObjectIncompleteDetails1.hashCode(), runObjectIncompleteDetails1.hashCode());
        System.assertEquals(runObjectIncompleteDetails2.hashCode(), runObjectIncompleteDetails2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRunObjectIncompleteDetails runObjectIncompleteDetails1 = OASRunObjectIncompleteDetails.getExample();
        OASRunObjectIncompleteDetails runObjectIncompleteDetails2 = OASRunObjectIncompleteDetails.getExample();
        OASRunObjectIncompleteDetails runObjectIncompleteDetails3 = new OASRunObjectIncompleteDetails();
        OASRunObjectIncompleteDetails runObjectIncompleteDetails4 = new OASRunObjectIncompleteDetails();

        System.assert(runObjectIncompleteDetails1.equals(runObjectIncompleteDetails2));
        System.assert(runObjectIncompleteDetails3.equals(runObjectIncompleteDetails4));
        System.assertEquals(runObjectIncompleteDetails1.hashCode(), runObjectIncompleteDetails2.hashCode());
        System.assertEquals(runObjectIncompleteDetails3.hashCode(), runObjectIncompleteDetails4.hashCode());
    }
}
