@isTest
private class OASMessageObjectContentInnerTest {
    @isTest
    private static void equalsSameInstance() {
        OASMessageObjectContentInner messageObjectContentInner1 = OASMessageObjectContentInner.getExample();
        OASMessageObjectContentInner messageObjectContentInner2 = messageObjectContentInner1;
        OASMessageObjectContentInner messageObjectContentInner3 = new OASMessageObjectContentInner();
        OASMessageObjectContentInner messageObjectContentInner4 = messageObjectContentInner3;

        System.assert(messageObjectContentInner1.equals(messageObjectContentInner2));
        System.assert(messageObjectContentInner2.equals(messageObjectContentInner1));
        System.assert(messageObjectContentInner1.equals(messageObjectContentInner1));
        System.assert(messageObjectContentInner3.equals(messageObjectContentInner4));
        System.assert(messageObjectContentInner4.equals(messageObjectContentInner3));
        System.assert(messageObjectContentInner3.equals(messageObjectContentInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMessageObjectContentInner messageObjectContentInner1 = OASMessageObjectContentInner.getExample();
        OASMessageObjectContentInner messageObjectContentInner2 = OASMessageObjectContentInner.getExample();
        OASMessageObjectContentInner messageObjectContentInner3 = new OASMessageObjectContentInner();
        OASMessageObjectContentInner messageObjectContentInner4 = new OASMessageObjectContentInner();

        System.assert(messageObjectContentInner1.equals(messageObjectContentInner2));
        System.assert(messageObjectContentInner2.equals(messageObjectContentInner1));
        System.assert(messageObjectContentInner3.equals(messageObjectContentInner4));
        System.assert(messageObjectContentInner4.equals(messageObjectContentInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMessageObjectContentInner messageObjectContentInner1 = OASMessageObjectContentInner.getExample();
        OASMessageObjectContentInner messageObjectContentInner2 = new OASMessageObjectContentInner();

        System.assertEquals(false, messageObjectContentInner1.equals('foo'));
        System.assertEquals(false, messageObjectContentInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMessageObjectContentInner messageObjectContentInner1 = OASMessageObjectContentInner.getExample();
        OASMessageObjectContentInner messageObjectContentInner2 = new OASMessageObjectContentInner();
        OASMessageObjectContentInner messageObjectContentInner3;

        System.assertEquals(false, messageObjectContentInner1.equals(messageObjectContentInner3));
        System.assertEquals(false, messageObjectContentInner2.equals(messageObjectContentInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMessageObjectContentInner messageObjectContentInner1 = OASMessageObjectContentInner.getExample();
        OASMessageObjectContentInner messageObjectContentInner2 = new OASMessageObjectContentInner();

        System.assertEquals(messageObjectContentInner1.hashCode(), messageObjectContentInner1.hashCode());
        System.assertEquals(messageObjectContentInner2.hashCode(), messageObjectContentInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMessageObjectContentInner messageObjectContentInner1 = OASMessageObjectContentInner.getExample();
        OASMessageObjectContentInner messageObjectContentInner2 = OASMessageObjectContentInner.getExample();
        OASMessageObjectContentInner messageObjectContentInner3 = new OASMessageObjectContentInner();
        OASMessageObjectContentInner messageObjectContentInner4 = new OASMessageObjectContentInner();

        System.assert(messageObjectContentInner1.equals(messageObjectContentInner2));
        System.assert(messageObjectContentInner3.equals(messageObjectContentInner4));
        System.assertEquals(messageObjectContentInner1.hashCode(), messageObjectContentInner2.hashCode());
        System.assertEquals(messageObjectContentInner3.hashCode(), messageObjectContentInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASMessageObjectContentInner messageObjectContentInner = new OASMessageObjectContentInner();
        Map<String, String> x-property-mappings = messageObjectContentInner.getx-property-mappings();
        System.assertEquals('imageFile', x-property-mappings.get('image_file'));
    }
}
