@isTest
private class OASMessageDeltaObjectDeltaContentInnTest {
    @isTest
    private static void equalsSameInstance() {
        OASMessageDeltaObjectDeltaContentInn messageDeltaObjectDeltaContentInner1 = OASMessageDeltaObjectDeltaContentInn.getExample();
        OASMessageDeltaObjectDeltaContentInn messageDeltaObjectDeltaContentInner2 = messageDeltaObjectDeltaContentInner1;
        OASMessageDeltaObjectDeltaContentInn messageDeltaObjectDeltaContentInner3 = new OASMessageDeltaObjectDeltaContentInn();
        OASMessageDeltaObjectDeltaContentInn messageDeltaObjectDeltaContentInner4 = messageDeltaObjectDeltaContentInner3;

        System.assert(messageDeltaObjectDeltaContentInner1.equals(messageDeltaObjectDeltaContentInner2));
        System.assert(messageDeltaObjectDeltaContentInner2.equals(messageDeltaObjectDeltaContentInner1));
        System.assert(messageDeltaObjectDeltaContentInner1.equals(messageDeltaObjectDeltaContentInner1));
        System.assert(messageDeltaObjectDeltaContentInner3.equals(messageDeltaObjectDeltaContentInner4));
        System.assert(messageDeltaObjectDeltaContentInner4.equals(messageDeltaObjectDeltaContentInner3));
        System.assert(messageDeltaObjectDeltaContentInner3.equals(messageDeltaObjectDeltaContentInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMessageDeltaObjectDeltaContentInn messageDeltaObjectDeltaContentInner1 = OASMessageDeltaObjectDeltaContentInn.getExample();
        OASMessageDeltaObjectDeltaContentInn messageDeltaObjectDeltaContentInner2 = OASMessageDeltaObjectDeltaContentInn.getExample();
        OASMessageDeltaObjectDeltaContentInn messageDeltaObjectDeltaContentInner3 = new OASMessageDeltaObjectDeltaContentInn();
        OASMessageDeltaObjectDeltaContentInn messageDeltaObjectDeltaContentInner4 = new OASMessageDeltaObjectDeltaContentInn();

        System.assert(messageDeltaObjectDeltaContentInner1.equals(messageDeltaObjectDeltaContentInner2));
        System.assert(messageDeltaObjectDeltaContentInner2.equals(messageDeltaObjectDeltaContentInner1));
        System.assert(messageDeltaObjectDeltaContentInner3.equals(messageDeltaObjectDeltaContentInner4));
        System.assert(messageDeltaObjectDeltaContentInner4.equals(messageDeltaObjectDeltaContentInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMessageDeltaObjectDeltaContentInn messageDeltaObjectDeltaContentInner1 = OASMessageDeltaObjectDeltaContentInn.getExample();
        OASMessageDeltaObjectDeltaContentInn messageDeltaObjectDeltaContentInner2 = new OASMessageDeltaObjectDeltaContentInn();

        System.assertEquals(false, messageDeltaObjectDeltaContentInner1.equals('foo'));
        System.assertEquals(false, messageDeltaObjectDeltaContentInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMessageDeltaObjectDeltaContentInn messageDeltaObjectDeltaContentInner1 = OASMessageDeltaObjectDeltaContentInn.getExample();
        OASMessageDeltaObjectDeltaContentInn messageDeltaObjectDeltaContentInner2 = new OASMessageDeltaObjectDeltaContentInn();
        OASMessageDeltaObjectDeltaContentInn messageDeltaObjectDeltaContentInner3;

        System.assertEquals(false, messageDeltaObjectDeltaContentInner1.equals(messageDeltaObjectDeltaContentInner3));
        System.assertEquals(false, messageDeltaObjectDeltaContentInner2.equals(messageDeltaObjectDeltaContentInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMessageDeltaObjectDeltaContentInn messageDeltaObjectDeltaContentInner1 = OASMessageDeltaObjectDeltaContentInn.getExample();
        OASMessageDeltaObjectDeltaContentInn messageDeltaObjectDeltaContentInner2 = new OASMessageDeltaObjectDeltaContentInn();

        System.assertEquals(messageDeltaObjectDeltaContentInner1.hashCode(), messageDeltaObjectDeltaContentInner1.hashCode());
        System.assertEquals(messageDeltaObjectDeltaContentInner2.hashCode(), messageDeltaObjectDeltaContentInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMessageDeltaObjectDeltaContentInn messageDeltaObjectDeltaContentInner1 = OASMessageDeltaObjectDeltaContentInn.getExample();
        OASMessageDeltaObjectDeltaContentInn messageDeltaObjectDeltaContentInner2 = OASMessageDeltaObjectDeltaContentInn.getExample();
        OASMessageDeltaObjectDeltaContentInn messageDeltaObjectDeltaContentInner3 = new OASMessageDeltaObjectDeltaContentInn();
        OASMessageDeltaObjectDeltaContentInn messageDeltaObjectDeltaContentInner4 = new OASMessageDeltaObjectDeltaContentInn();

        System.assert(messageDeltaObjectDeltaContentInner1.equals(messageDeltaObjectDeltaContentInner2));
        System.assert(messageDeltaObjectDeltaContentInner3.equals(messageDeltaObjectDeltaContentInner4));
        System.assertEquals(messageDeltaObjectDeltaContentInner1.hashCode(), messageDeltaObjectDeltaContentInner2.hashCode());
        System.assertEquals(messageDeltaObjectDeltaContentInner3.hashCode(), messageDeltaObjectDeltaContentInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASMessageDeltaObjectDeltaContentInn messageDeltaObjectDeltaContentInner = new OASMessageDeltaObjectDeltaContentInn();
        Map<String, String> x-property-mappings = messageDeltaObjectDeltaContentInner.getx-property-mappings();
        System.assertEquals('imageFile', x-property-mappings.get('image_file'));
        System.assertEquals('imageUrl', x-property-mappings.get('image_url'));
    }
}
