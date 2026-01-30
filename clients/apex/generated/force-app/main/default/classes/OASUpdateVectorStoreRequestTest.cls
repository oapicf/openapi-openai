@isTest
private class OASUpdateVectorStoreRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdateVectorStoreRequest updateVectorStoreRequest1 = OASUpdateVectorStoreRequest.getExample();
        OASUpdateVectorStoreRequest updateVectorStoreRequest2 = updateVectorStoreRequest1;
        OASUpdateVectorStoreRequest updateVectorStoreRequest3 = new OASUpdateVectorStoreRequest();
        OASUpdateVectorStoreRequest updateVectorStoreRequest4 = updateVectorStoreRequest3;

        System.assert(updateVectorStoreRequest1.equals(updateVectorStoreRequest2));
        System.assert(updateVectorStoreRequest2.equals(updateVectorStoreRequest1));
        System.assert(updateVectorStoreRequest1.equals(updateVectorStoreRequest1));
        System.assert(updateVectorStoreRequest3.equals(updateVectorStoreRequest4));
        System.assert(updateVectorStoreRequest4.equals(updateVectorStoreRequest3));
        System.assert(updateVectorStoreRequest3.equals(updateVectorStoreRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdateVectorStoreRequest updateVectorStoreRequest1 = OASUpdateVectorStoreRequest.getExample();
        OASUpdateVectorStoreRequest updateVectorStoreRequest2 = OASUpdateVectorStoreRequest.getExample();
        OASUpdateVectorStoreRequest updateVectorStoreRequest3 = new OASUpdateVectorStoreRequest();
        OASUpdateVectorStoreRequest updateVectorStoreRequest4 = new OASUpdateVectorStoreRequest();

        System.assert(updateVectorStoreRequest1.equals(updateVectorStoreRequest2));
        System.assert(updateVectorStoreRequest2.equals(updateVectorStoreRequest1));
        System.assert(updateVectorStoreRequest3.equals(updateVectorStoreRequest4));
        System.assert(updateVectorStoreRequest4.equals(updateVectorStoreRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdateVectorStoreRequest updateVectorStoreRequest1 = OASUpdateVectorStoreRequest.getExample();
        OASUpdateVectorStoreRequest updateVectorStoreRequest2 = new OASUpdateVectorStoreRequest();

        System.assertEquals(false, updateVectorStoreRequest1.equals('foo'));
        System.assertEquals(false, updateVectorStoreRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdateVectorStoreRequest updateVectorStoreRequest1 = OASUpdateVectorStoreRequest.getExample();
        OASUpdateVectorStoreRequest updateVectorStoreRequest2 = new OASUpdateVectorStoreRequest();
        OASUpdateVectorStoreRequest updateVectorStoreRequest3;

        System.assertEquals(false, updateVectorStoreRequest1.equals(updateVectorStoreRequest3));
        System.assertEquals(false, updateVectorStoreRequest2.equals(updateVectorStoreRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdateVectorStoreRequest updateVectorStoreRequest1 = OASUpdateVectorStoreRequest.getExample();
        OASUpdateVectorStoreRequest updateVectorStoreRequest2 = new OASUpdateVectorStoreRequest();

        System.assertEquals(updateVectorStoreRequest1.hashCode(), updateVectorStoreRequest1.hashCode());
        System.assertEquals(updateVectorStoreRequest2.hashCode(), updateVectorStoreRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdateVectorStoreRequest updateVectorStoreRequest1 = OASUpdateVectorStoreRequest.getExample();
        OASUpdateVectorStoreRequest updateVectorStoreRequest2 = OASUpdateVectorStoreRequest.getExample();
        OASUpdateVectorStoreRequest updateVectorStoreRequest3 = new OASUpdateVectorStoreRequest();
        OASUpdateVectorStoreRequest updateVectorStoreRequest4 = new OASUpdateVectorStoreRequest();

        System.assert(updateVectorStoreRequest1.equals(updateVectorStoreRequest2));
        System.assert(updateVectorStoreRequest3.equals(updateVectorStoreRequest4));
        System.assertEquals(updateVectorStoreRequest1.hashCode(), updateVectorStoreRequest2.hashCode());
        System.assertEquals(updateVectorStoreRequest3.hashCode(), updateVectorStoreRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASUpdateVectorStoreRequest updateVectorStoreRequest = new OASUpdateVectorStoreRequest();
        Map<String, String> x-property-mappings = updateVectorStoreRequest.getx-property-mappings();
        System.assertEquals('expiresAfter', x-property-mappings.get('expires_after'));
    }
}
