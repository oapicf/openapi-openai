@isTest
private class OASUploadTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpload upload1 = OASUpload.getExample();
        OASUpload upload2 = upload1;
        OASUpload upload3 = new OASUpload();
        OASUpload upload4 = upload3;

        System.assert(upload1.equals(upload2));
        System.assert(upload2.equals(upload1));
        System.assert(upload1.equals(upload1));
        System.assert(upload3.equals(upload4));
        System.assert(upload4.equals(upload3));
        System.assert(upload3.equals(upload3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpload upload1 = OASUpload.getExample();
        OASUpload upload2 = OASUpload.getExample();
        OASUpload upload3 = new OASUpload();
        OASUpload upload4 = new OASUpload();

        System.assert(upload1.equals(upload2));
        System.assert(upload2.equals(upload1));
        System.assert(upload3.equals(upload4));
        System.assert(upload4.equals(upload3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpload upload1 = OASUpload.getExample();
        OASUpload upload2 = new OASUpload();

        System.assertEquals(false, upload1.equals('foo'));
        System.assertEquals(false, upload2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpload upload1 = OASUpload.getExample();
        OASUpload upload2 = new OASUpload();
        OASUpload upload3;

        System.assertEquals(false, upload1.equals(upload3));
        System.assertEquals(false, upload2.equals(upload3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpload upload1 = OASUpload.getExample();
        OASUpload upload2 = new OASUpload();

        System.assertEquals(upload1.hashCode(), upload1.hashCode());
        System.assertEquals(upload2.hashCode(), upload2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpload upload1 = OASUpload.getExample();
        OASUpload upload2 = OASUpload.getExample();
        OASUpload upload3 = new OASUpload();
        OASUpload upload4 = new OASUpload();

        System.assert(upload1.equals(upload2));
        System.assert(upload3.equals(upload4));
        System.assertEquals(upload1.hashCode(), upload2.hashCode());
        System.assertEquals(upload3.hashCode(), upload4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASUpload upload = new OASUpload();
        Map<String, String> x-property-mappings = upload.getx-property-mappings();
        System.assertEquals('createdAt', x-property-mappings.get('created_at'));
        System.assertEquals('expiresAt', x-property-mappings.get('expires_at'));
        System.assertEquals('r_object', x-property-mappings.get('object'));
    }
}
