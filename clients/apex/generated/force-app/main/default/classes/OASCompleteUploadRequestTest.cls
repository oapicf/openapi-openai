@isTest
private class OASCompleteUploadRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASCompleteUploadRequest completeUploadRequest1 = OASCompleteUploadRequest.getExample();
        OASCompleteUploadRequest completeUploadRequest2 = completeUploadRequest1;
        OASCompleteUploadRequest completeUploadRequest3 = new OASCompleteUploadRequest();
        OASCompleteUploadRequest completeUploadRequest4 = completeUploadRequest3;

        System.assert(completeUploadRequest1.equals(completeUploadRequest2));
        System.assert(completeUploadRequest2.equals(completeUploadRequest1));
        System.assert(completeUploadRequest1.equals(completeUploadRequest1));
        System.assert(completeUploadRequest3.equals(completeUploadRequest4));
        System.assert(completeUploadRequest4.equals(completeUploadRequest3));
        System.assert(completeUploadRequest3.equals(completeUploadRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCompleteUploadRequest completeUploadRequest1 = OASCompleteUploadRequest.getExample();
        OASCompleteUploadRequest completeUploadRequest2 = OASCompleteUploadRequest.getExample();
        OASCompleteUploadRequest completeUploadRequest3 = new OASCompleteUploadRequest();
        OASCompleteUploadRequest completeUploadRequest4 = new OASCompleteUploadRequest();

        System.assert(completeUploadRequest1.equals(completeUploadRequest2));
        System.assert(completeUploadRequest2.equals(completeUploadRequest1));
        System.assert(completeUploadRequest3.equals(completeUploadRequest4));
        System.assert(completeUploadRequest4.equals(completeUploadRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCompleteUploadRequest completeUploadRequest1 = OASCompleteUploadRequest.getExample();
        OASCompleteUploadRequest completeUploadRequest2 = new OASCompleteUploadRequest();

        System.assertEquals(false, completeUploadRequest1.equals('foo'));
        System.assertEquals(false, completeUploadRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCompleteUploadRequest completeUploadRequest1 = OASCompleteUploadRequest.getExample();
        OASCompleteUploadRequest completeUploadRequest2 = new OASCompleteUploadRequest();
        OASCompleteUploadRequest completeUploadRequest3;

        System.assertEquals(false, completeUploadRequest1.equals(completeUploadRequest3));
        System.assertEquals(false, completeUploadRequest2.equals(completeUploadRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCompleteUploadRequest completeUploadRequest1 = OASCompleteUploadRequest.getExample();
        OASCompleteUploadRequest completeUploadRequest2 = new OASCompleteUploadRequest();

        System.assertEquals(completeUploadRequest1.hashCode(), completeUploadRequest1.hashCode());
        System.assertEquals(completeUploadRequest2.hashCode(), completeUploadRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCompleteUploadRequest completeUploadRequest1 = OASCompleteUploadRequest.getExample();
        OASCompleteUploadRequest completeUploadRequest2 = OASCompleteUploadRequest.getExample();
        OASCompleteUploadRequest completeUploadRequest3 = new OASCompleteUploadRequest();
        OASCompleteUploadRequest completeUploadRequest4 = new OASCompleteUploadRequest();

        System.assert(completeUploadRequest1.equals(completeUploadRequest2));
        System.assert(completeUploadRequest3.equals(completeUploadRequest4));
        System.assertEquals(completeUploadRequest1.hashCode(), completeUploadRequest2.hashCode());
        System.assertEquals(completeUploadRequest3.hashCode(), completeUploadRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCompleteUploadRequest completeUploadRequest = new OASCompleteUploadRequest();
        Map<String, String> x-property-mappings = completeUploadRequest.getx-property-mappings();
        System.assertEquals('partIds', x-property-mappings.get('part_ids'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCompleteUploadRequest completeUploadRequest = new OASCompleteUploadRequest();
        System.assertEquals(new List<String>(), completeUploadRequest.partIds);
        System.assertEquals(null, completeUploadRequest.md5);
    }
}
