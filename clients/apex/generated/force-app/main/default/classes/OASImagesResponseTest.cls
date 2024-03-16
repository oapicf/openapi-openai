@isTest
private class OASImagesResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASImagesResponse imagesResponse1 = OASImagesResponse.getExample();
        OASImagesResponse imagesResponse2 = imagesResponse1;
        OASImagesResponse imagesResponse3 = new OASImagesResponse();
        OASImagesResponse imagesResponse4 = imagesResponse3;

        System.assert(imagesResponse1.equals(imagesResponse2));
        System.assert(imagesResponse2.equals(imagesResponse1));
        System.assert(imagesResponse1.equals(imagesResponse1));
        System.assert(imagesResponse3.equals(imagesResponse4));
        System.assert(imagesResponse4.equals(imagesResponse3));
        System.assert(imagesResponse3.equals(imagesResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASImagesResponse imagesResponse1 = OASImagesResponse.getExample();
        OASImagesResponse imagesResponse2 = OASImagesResponse.getExample();
        OASImagesResponse imagesResponse3 = new OASImagesResponse();
        OASImagesResponse imagesResponse4 = new OASImagesResponse();

        System.assert(imagesResponse1.equals(imagesResponse2));
        System.assert(imagesResponse2.equals(imagesResponse1));
        System.assert(imagesResponse3.equals(imagesResponse4));
        System.assert(imagesResponse4.equals(imagesResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASImagesResponse imagesResponse1 = OASImagesResponse.getExample();
        OASImagesResponse imagesResponse2 = new OASImagesResponse();

        System.assertEquals(false, imagesResponse1.equals('foo'));
        System.assertEquals(false, imagesResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASImagesResponse imagesResponse1 = OASImagesResponse.getExample();
        OASImagesResponse imagesResponse2 = new OASImagesResponse();
        OASImagesResponse imagesResponse3;

        System.assertEquals(false, imagesResponse1.equals(imagesResponse3));
        System.assertEquals(false, imagesResponse2.equals(imagesResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASImagesResponse imagesResponse1 = OASImagesResponse.getExample();
        OASImagesResponse imagesResponse2 = new OASImagesResponse();

        System.assertEquals(imagesResponse1.hashCode(), imagesResponse1.hashCode());
        System.assertEquals(imagesResponse2.hashCode(), imagesResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASImagesResponse imagesResponse1 = OASImagesResponse.getExample();
        OASImagesResponse imagesResponse2 = OASImagesResponse.getExample();
        OASImagesResponse imagesResponse3 = new OASImagesResponse();
        OASImagesResponse imagesResponse4 = new OASImagesResponse();

        System.assert(imagesResponse1.equals(imagesResponse2));
        System.assert(imagesResponse3.equals(imagesResponse4));
        System.assertEquals(imagesResponse1.hashCode(), imagesResponse2.hashCode());
        System.assertEquals(imagesResponse3.hashCode(), imagesResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASImagesResponse imagesResponse = new OASImagesResponse();
        System.assertEquals(new List<OASImagesResponseDataInner>(), imagesResponse.data);
        System.assertEquals(null, imagesResponse.created);
    }
}
