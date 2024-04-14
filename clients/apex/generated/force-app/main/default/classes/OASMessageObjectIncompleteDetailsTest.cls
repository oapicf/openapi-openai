@isTest
private class OASMessageObjectIncompleteDetailsTest {
    @isTest
    private static void equalsSameInstance() {
        OASMessageObjectIncompleteDetails messageObjectIncompleteDetails1 = OASMessageObjectIncompleteDetails.getExample();
        OASMessageObjectIncompleteDetails messageObjectIncompleteDetails2 = messageObjectIncompleteDetails1;
        OASMessageObjectIncompleteDetails messageObjectIncompleteDetails3 = new OASMessageObjectIncompleteDetails();
        OASMessageObjectIncompleteDetails messageObjectIncompleteDetails4 = messageObjectIncompleteDetails3;

        System.assert(messageObjectIncompleteDetails1.equals(messageObjectIncompleteDetails2));
        System.assert(messageObjectIncompleteDetails2.equals(messageObjectIncompleteDetails1));
        System.assert(messageObjectIncompleteDetails1.equals(messageObjectIncompleteDetails1));
        System.assert(messageObjectIncompleteDetails3.equals(messageObjectIncompleteDetails4));
        System.assert(messageObjectIncompleteDetails4.equals(messageObjectIncompleteDetails3));
        System.assert(messageObjectIncompleteDetails3.equals(messageObjectIncompleteDetails3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMessageObjectIncompleteDetails messageObjectIncompleteDetails1 = OASMessageObjectIncompleteDetails.getExample();
        OASMessageObjectIncompleteDetails messageObjectIncompleteDetails2 = OASMessageObjectIncompleteDetails.getExample();
        OASMessageObjectIncompleteDetails messageObjectIncompleteDetails3 = new OASMessageObjectIncompleteDetails();
        OASMessageObjectIncompleteDetails messageObjectIncompleteDetails4 = new OASMessageObjectIncompleteDetails();

        System.assert(messageObjectIncompleteDetails1.equals(messageObjectIncompleteDetails2));
        System.assert(messageObjectIncompleteDetails2.equals(messageObjectIncompleteDetails1));
        System.assert(messageObjectIncompleteDetails3.equals(messageObjectIncompleteDetails4));
        System.assert(messageObjectIncompleteDetails4.equals(messageObjectIncompleteDetails3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMessageObjectIncompleteDetails messageObjectIncompleteDetails1 = OASMessageObjectIncompleteDetails.getExample();
        OASMessageObjectIncompleteDetails messageObjectIncompleteDetails2 = new OASMessageObjectIncompleteDetails();

        System.assertEquals(false, messageObjectIncompleteDetails1.equals('foo'));
        System.assertEquals(false, messageObjectIncompleteDetails2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMessageObjectIncompleteDetails messageObjectIncompleteDetails1 = OASMessageObjectIncompleteDetails.getExample();
        OASMessageObjectIncompleteDetails messageObjectIncompleteDetails2 = new OASMessageObjectIncompleteDetails();
        OASMessageObjectIncompleteDetails messageObjectIncompleteDetails3;

        System.assertEquals(false, messageObjectIncompleteDetails1.equals(messageObjectIncompleteDetails3));
        System.assertEquals(false, messageObjectIncompleteDetails2.equals(messageObjectIncompleteDetails3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMessageObjectIncompleteDetails messageObjectIncompleteDetails1 = OASMessageObjectIncompleteDetails.getExample();
        OASMessageObjectIncompleteDetails messageObjectIncompleteDetails2 = new OASMessageObjectIncompleteDetails();

        System.assertEquals(messageObjectIncompleteDetails1.hashCode(), messageObjectIncompleteDetails1.hashCode());
        System.assertEquals(messageObjectIncompleteDetails2.hashCode(), messageObjectIncompleteDetails2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMessageObjectIncompleteDetails messageObjectIncompleteDetails1 = OASMessageObjectIncompleteDetails.getExample();
        OASMessageObjectIncompleteDetails messageObjectIncompleteDetails2 = OASMessageObjectIncompleteDetails.getExample();
        OASMessageObjectIncompleteDetails messageObjectIncompleteDetails3 = new OASMessageObjectIncompleteDetails();
        OASMessageObjectIncompleteDetails messageObjectIncompleteDetails4 = new OASMessageObjectIncompleteDetails();

        System.assert(messageObjectIncompleteDetails1.equals(messageObjectIncompleteDetails2));
        System.assert(messageObjectIncompleteDetails3.equals(messageObjectIncompleteDetails4));
        System.assertEquals(messageObjectIncompleteDetails1.hashCode(), messageObjectIncompleteDetails2.hashCode());
        System.assertEquals(messageObjectIncompleteDetails3.hashCode(), messageObjectIncompleteDetails4.hashCode());
    }
}
