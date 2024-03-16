@isTest
private class OASCreateEditRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateEditRequest createEditRequest1 = OASCreateEditRequest.getExample();
        OASCreateEditRequest createEditRequest2 = createEditRequest1;
        OASCreateEditRequest createEditRequest3 = new OASCreateEditRequest();
        OASCreateEditRequest createEditRequest4 = createEditRequest3;

        System.assert(createEditRequest1.equals(createEditRequest2));
        System.assert(createEditRequest2.equals(createEditRequest1));
        System.assert(createEditRequest1.equals(createEditRequest1));
        System.assert(createEditRequest3.equals(createEditRequest4));
        System.assert(createEditRequest4.equals(createEditRequest3));
        System.assert(createEditRequest3.equals(createEditRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateEditRequest createEditRequest1 = OASCreateEditRequest.getExample();
        OASCreateEditRequest createEditRequest2 = OASCreateEditRequest.getExample();
        OASCreateEditRequest createEditRequest3 = new OASCreateEditRequest();
        OASCreateEditRequest createEditRequest4 = new OASCreateEditRequest();

        System.assert(createEditRequest1.equals(createEditRequest2));
        System.assert(createEditRequest2.equals(createEditRequest1));
        System.assert(createEditRequest3.equals(createEditRequest4));
        System.assert(createEditRequest4.equals(createEditRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateEditRequest createEditRequest1 = OASCreateEditRequest.getExample();
        OASCreateEditRequest createEditRequest2 = new OASCreateEditRequest();

        System.assertEquals(false, createEditRequest1.equals('foo'));
        System.assertEquals(false, createEditRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateEditRequest createEditRequest1 = OASCreateEditRequest.getExample();
        OASCreateEditRequest createEditRequest2 = new OASCreateEditRequest();
        OASCreateEditRequest createEditRequest3;

        System.assertEquals(false, createEditRequest1.equals(createEditRequest3));
        System.assertEquals(false, createEditRequest2.equals(createEditRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateEditRequest createEditRequest1 = OASCreateEditRequest.getExample();
        OASCreateEditRequest createEditRequest2 = new OASCreateEditRequest();

        System.assertEquals(createEditRequest1.hashCode(), createEditRequest1.hashCode());
        System.assertEquals(createEditRequest2.hashCode(), createEditRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateEditRequest createEditRequest1 = OASCreateEditRequest.getExample();
        OASCreateEditRequest createEditRequest2 = OASCreateEditRequest.getExample();
        OASCreateEditRequest createEditRequest3 = new OASCreateEditRequest();
        OASCreateEditRequest createEditRequest4 = new OASCreateEditRequest();

        System.assert(createEditRequest1.equals(createEditRequest2));
        System.assert(createEditRequest3.equals(createEditRequest4));
        System.assertEquals(createEditRequest1.hashCode(), createEditRequest2.hashCode());
        System.assertEquals(createEditRequest3.hashCode(), createEditRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCreateEditRequest createEditRequest = new OASCreateEditRequest();
        Map<String, String> x-property-mappings = createEditRequest.getx-property-mappings();
        System.assertEquals('topP', x-property-mappings.get('top_p'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCreateEditRequest createEditRequest = new OASCreateEditRequest();
        System.assertEquals('', createEditRequest.input);
        System.assertEquals(1, createEditRequest.n);
        System.assertEquals(1, createEditRequest.temperature);
        System.assertEquals(1, createEditRequest.topP);
        System.assertEquals(null, createEditRequest.model);
        System.assertEquals(null, createEditRequest.instruction);
    }
}
