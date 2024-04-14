@isTest
private class OASImageTest {
    @isTest
    private static void equalsSameInstance() {
        OASImage image1 = OASImage.getExample();
        OASImage image2 = image1;
        OASImage image3 = new OASImage();
        OASImage image4 = image3;

        System.assert(image1.equals(image2));
        System.assert(image2.equals(image1));
        System.assert(image1.equals(image1));
        System.assert(image3.equals(image4));
        System.assert(image4.equals(image3));
        System.assert(image3.equals(image3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASImage image1 = OASImage.getExample();
        OASImage image2 = OASImage.getExample();
        OASImage image3 = new OASImage();
        OASImage image4 = new OASImage();

        System.assert(image1.equals(image2));
        System.assert(image2.equals(image1));
        System.assert(image3.equals(image4));
        System.assert(image4.equals(image3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASImage image1 = OASImage.getExample();
        OASImage image2 = new OASImage();

        System.assertEquals(false, image1.equals('foo'));
        System.assertEquals(false, image2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASImage image1 = OASImage.getExample();
        OASImage image2 = new OASImage();
        OASImage image3;

        System.assertEquals(false, image1.equals(image3));
        System.assertEquals(false, image2.equals(image3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASImage image1 = OASImage.getExample();
        OASImage image2 = new OASImage();

        System.assertEquals(image1.hashCode(), image1.hashCode());
        System.assertEquals(image2.hashCode(), image2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASImage image1 = OASImage.getExample();
        OASImage image2 = OASImage.getExample();
        OASImage image3 = new OASImage();
        OASImage image4 = new OASImage();

        System.assert(image1.equals(image2));
        System.assert(image3.equals(image4));
        System.assertEquals(image1.hashCode(), image2.hashCode());
        System.assertEquals(image3.hashCode(), image4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASImage image = new OASImage();
        Map<String, String> x-property-mappings = image.getx-property-mappings();
        System.assertEquals('b64Json', x-property-mappings.get('b64_json'));
        System.assertEquals('revisedPrompt', x-property-mappings.get('revised_prompt'));
    }
}
