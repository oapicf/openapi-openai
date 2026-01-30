@isTest
private class OASArrayOfContentPartsInnerTest {
    @isTest
    private static void equalsSameInstance() {
        OASArrayOfContentPartsInner arrayOfContentPartsInner1 = OASArrayOfContentPartsInner.getExample();
        OASArrayOfContentPartsInner arrayOfContentPartsInner2 = arrayOfContentPartsInner1;
        OASArrayOfContentPartsInner arrayOfContentPartsInner3 = new OASArrayOfContentPartsInner();
        OASArrayOfContentPartsInner arrayOfContentPartsInner4 = arrayOfContentPartsInner3;

        System.assert(arrayOfContentPartsInner1.equals(arrayOfContentPartsInner2));
        System.assert(arrayOfContentPartsInner2.equals(arrayOfContentPartsInner1));
        System.assert(arrayOfContentPartsInner1.equals(arrayOfContentPartsInner1));
        System.assert(arrayOfContentPartsInner3.equals(arrayOfContentPartsInner4));
        System.assert(arrayOfContentPartsInner4.equals(arrayOfContentPartsInner3));
        System.assert(arrayOfContentPartsInner3.equals(arrayOfContentPartsInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASArrayOfContentPartsInner arrayOfContentPartsInner1 = OASArrayOfContentPartsInner.getExample();
        OASArrayOfContentPartsInner arrayOfContentPartsInner2 = OASArrayOfContentPartsInner.getExample();
        OASArrayOfContentPartsInner arrayOfContentPartsInner3 = new OASArrayOfContentPartsInner();
        OASArrayOfContentPartsInner arrayOfContentPartsInner4 = new OASArrayOfContentPartsInner();

        System.assert(arrayOfContentPartsInner1.equals(arrayOfContentPartsInner2));
        System.assert(arrayOfContentPartsInner2.equals(arrayOfContentPartsInner1));
        System.assert(arrayOfContentPartsInner3.equals(arrayOfContentPartsInner4));
        System.assert(arrayOfContentPartsInner4.equals(arrayOfContentPartsInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASArrayOfContentPartsInner arrayOfContentPartsInner1 = OASArrayOfContentPartsInner.getExample();
        OASArrayOfContentPartsInner arrayOfContentPartsInner2 = new OASArrayOfContentPartsInner();

        System.assertEquals(false, arrayOfContentPartsInner1.equals('foo'));
        System.assertEquals(false, arrayOfContentPartsInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASArrayOfContentPartsInner arrayOfContentPartsInner1 = OASArrayOfContentPartsInner.getExample();
        OASArrayOfContentPartsInner arrayOfContentPartsInner2 = new OASArrayOfContentPartsInner();
        OASArrayOfContentPartsInner arrayOfContentPartsInner3;

        System.assertEquals(false, arrayOfContentPartsInner1.equals(arrayOfContentPartsInner3));
        System.assertEquals(false, arrayOfContentPartsInner2.equals(arrayOfContentPartsInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASArrayOfContentPartsInner arrayOfContentPartsInner1 = OASArrayOfContentPartsInner.getExample();
        OASArrayOfContentPartsInner arrayOfContentPartsInner2 = new OASArrayOfContentPartsInner();

        System.assertEquals(arrayOfContentPartsInner1.hashCode(), arrayOfContentPartsInner1.hashCode());
        System.assertEquals(arrayOfContentPartsInner2.hashCode(), arrayOfContentPartsInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASArrayOfContentPartsInner arrayOfContentPartsInner1 = OASArrayOfContentPartsInner.getExample();
        OASArrayOfContentPartsInner arrayOfContentPartsInner2 = OASArrayOfContentPartsInner.getExample();
        OASArrayOfContentPartsInner arrayOfContentPartsInner3 = new OASArrayOfContentPartsInner();
        OASArrayOfContentPartsInner arrayOfContentPartsInner4 = new OASArrayOfContentPartsInner();

        System.assert(arrayOfContentPartsInner1.equals(arrayOfContentPartsInner2));
        System.assert(arrayOfContentPartsInner3.equals(arrayOfContentPartsInner4));
        System.assertEquals(arrayOfContentPartsInner1.hashCode(), arrayOfContentPartsInner2.hashCode());
        System.assertEquals(arrayOfContentPartsInner3.hashCode(), arrayOfContentPartsInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASArrayOfContentPartsInner arrayOfContentPartsInner = new OASArrayOfContentPartsInner();
        Map<String, String> x-property-mappings = arrayOfContentPartsInner.getx-property-mappings();
        System.assertEquals('imageFile', x-property-mappings.get('image_file'));
        System.assertEquals('imageUrl', x-property-mappings.get('image_url'));
    }
}
