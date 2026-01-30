@isTest
private class OASUploadPartTest {
    @isTest
    private static void equalsSameInstance() {
        OASUploadPart uploadPart1 = OASUploadPart.getExample();
        OASUploadPart uploadPart2 = uploadPart1;
        OASUploadPart uploadPart3 = new OASUploadPart();
        OASUploadPart uploadPart4 = uploadPart3;

        System.assert(uploadPart1.equals(uploadPart2));
        System.assert(uploadPart2.equals(uploadPart1));
        System.assert(uploadPart1.equals(uploadPart1));
        System.assert(uploadPart3.equals(uploadPart4));
        System.assert(uploadPart4.equals(uploadPart3));
        System.assert(uploadPart3.equals(uploadPart3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUploadPart uploadPart1 = OASUploadPart.getExample();
        OASUploadPart uploadPart2 = OASUploadPart.getExample();
        OASUploadPart uploadPart3 = new OASUploadPart();
        OASUploadPart uploadPart4 = new OASUploadPart();

        System.assert(uploadPart1.equals(uploadPart2));
        System.assert(uploadPart2.equals(uploadPart1));
        System.assert(uploadPart3.equals(uploadPart4));
        System.assert(uploadPart4.equals(uploadPart3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUploadPart uploadPart1 = OASUploadPart.getExample();
        OASUploadPart uploadPart2 = new OASUploadPart();

        System.assertEquals(false, uploadPart1.equals('foo'));
        System.assertEquals(false, uploadPart2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUploadPart uploadPart1 = OASUploadPart.getExample();
        OASUploadPart uploadPart2 = new OASUploadPart();
        OASUploadPart uploadPart3;

        System.assertEquals(false, uploadPart1.equals(uploadPart3));
        System.assertEquals(false, uploadPart2.equals(uploadPart3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUploadPart uploadPart1 = OASUploadPart.getExample();
        OASUploadPart uploadPart2 = new OASUploadPart();

        System.assertEquals(uploadPart1.hashCode(), uploadPart1.hashCode());
        System.assertEquals(uploadPart2.hashCode(), uploadPart2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUploadPart uploadPart1 = OASUploadPart.getExample();
        OASUploadPart uploadPart2 = OASUploadPart.getExample();
        OASUploadPart uploadPart3 = new OASUploadPart();
        OASUploadPart uploadPart4 = new OASUploadPart();

        System.assert(uploadPart1.equals(uploadPart2));
        System.assert(uploadPart3.equals(uploadPart4));
        System.assertEquals(uploadPart1.hashCode(), uploadPart2.hashCode());
        System.assertEquals(uploadPart3.hashCode(), uploadPart4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASUploadPart uploadPart = new OASUploadPart();
        Map<String, String> x-property-mappings = uploadPart.getx-property-mappings();
        System.assertEquals('createdAt', x-property-mappings.get('created_at'));
        System.assertEquals('uploadId', x-property-mappings.get('upload_id'));
        System.assertEquals('r_object', x-property-mappings.get('object'));
    }
}
