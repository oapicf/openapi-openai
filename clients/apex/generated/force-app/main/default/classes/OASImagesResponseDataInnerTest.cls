@isTest
private class OASImagesResponseDataInnerTest {
    @isTest
    private static void equalsSameInstance() {
        OASImagesResponseDataInner imagesResponseDataInner1 = OASImagesResponseDataInner.getExample();
        OASImagesResponseDataInner imagesResponseDataInner2 = imagesResponseDataInner1;
        OASImagesResponseDataInner imagesResponseDataInner3 = new OASImagesResponseDataInner();
        OASImagesResponseDataInner imagesResponseDataInner4 = imagesResponseDataInner3;

        System.assert(imagesResponseDataInner1.equals(imagesResponseDataInner2));
        System.assert(imagesResponseDataInner2.equals(imagesResponseDataInner1));
        System.assert(imagesResponseDataInner1.equals(imagesResponseDataInner1));
        System.assert(imagesResponseDataInner3.equals(imagesResponseDataInner4));
        System.assert(imagesResponseDataInner4.equals(imagesResponseDataInner3));
        System.assert(imagesResponseDataInner3.equals(imagesResponseDataInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASImagesResponseDataInner imagesResponseDataInner1 = OASImagesResponseDataInner.getExample();
        OASImagesResponseDataInner imagesResponseDataInner2 = OASImagesResponseDataInner.getExample();
        OASImagesResponseDataInner imagesResponseDataInner3 = new OASImagesResponseDataInner();
        OASImagesResponseDataInner imagesResponseDataInner4 = new OASImagesResponseDataInner();

        System.assert(imagesResponseDataInner1.equals(imagesResponseDataInner2));
        System.assert(imagesResponseDataInner2.equals(imagesResponseDataInner1));
        System.assert(imagesResponseDataInner3.equals(imagesResponseDataInner4));
        System.assert(imagesResponseDataInner4.equals(imagesResponseDataInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASImagesResponseDataInner imagesResponseDataInner1 = OASImagesResponseDataInner.getExample();
        OASImagesResponseDataInner imagesResponseDataInner2 = new OASImagesResponseDataInner();

        System.assertEquals(false, imagesResponseDataInner1.equals('foo'));
        System.assertEquals(false, imagesResponseDataInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASImagesResponseDataInner imagesResponseDataInner1 = OASImagesResponseDataInner.getExample();
        OASImagesResponseDataInner imagesResponseDataInner2 = new OASImagesResponseDataInner();
        OASImagesResponseDataInner imagesResponseDataInner3;

        System.assertEquals(false, imagesResponseDataInner1.equals(imagesResponseDataInner3));
        System.assertEquals(false, imagesResponseDataInner2.equals(imagesResponseDataInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASImagesResponseDataInner imagesResponseDataInner1 = OASImagesResponseDataInner.getExample();
        OASImagesResponseDataInner imagesResponseDataInner2 = new OASImagesResponseDataInner();

        System.assertEquals(imagesResponseDataInner1.hashCode(), imagesResponseDataInner1.hashCode());
        System.assertEquals(imagesResponseDataInner2.hashCode(), imagesResponseDataInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASImagesResponseDataInner imagesResponseDataInner1 = OASImagesResponseDataInner.getExample();
        OASImagesResponseDataInner imagesResponseDataInner2 = OASImagesResponseDataInner.getExample();
        OASImagesResponseDataInner imagesResponseDataInner3 = new OASImagesResponseDataInner();
        OASImagesResponseDataInner imagesResponseDataInner4 = new OASImagesResponseDataInner();

        System.assert(imagesResponseDataInner1.equals(imagesResponseDataInner2));
        System.assert(imagesResponseDataInner3.equals(imagesResponseDataInner4));
        System.assertEquals(imagesResponseDataInner1.hashCode(), imagesResponseDataInner2.hashCode());
        System.assertEquals(imagesResponseDataInner3.hashCode(), imagesResponseDataInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASImagesResponseDataInner imagesResponseDataInner = new OASImagesResponseDataInner();
        Map<String, String> x-property-mappings = imagesResponseDataInner.getx-property-mappings();
        System.assertEquals('b64Json', x-property-mappings.get('b64_json'));
    }
}
