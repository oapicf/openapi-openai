@isTest
private class OASCreateModerationResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateModerationResponse createModerationResponse1 = OASCreateModerationResponse.getExample();
        OASCreateModerationResponse createModerationResponse2 = createModerationResponse1;
        OASCreateModerationResponse createModerationResponse3 = new OASCreateModerationResponse();
        OASCreateModerationResponse createModerationResponse4 = createModerationResponse3;

        System.assert(createModerationResponse1.equals(createModerationResponse2));
        System.assert(createModerationResponse2.equals(createModerationResponse1));
        System.assert(createModerationResponse1.equals(createModerationResponse1));
        System.assert(createModerationResponse3.equals(createModerationResponse4));
        System.assert(createModerationResponse4.equals(createModerationResponse3));
        System.assert(createModerationResponse3.equals(createModerationResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateModerationResponse createModerationResponse1 = OASCreateModerationResponse.getExample();
        OASCreateModerationResponse createModerationResponse2 = OASCreateModerationResponse.getExample();
        OASCreateModerationResponse createModerationResponse3 = new OASCreateModerationResponse();
        OASCreateModerationResponse createModerationResponse4 = new OASCreateModerationResponse();

        System.assert(createModerationResponse1.equals(createModerationResponse2));
        System.assert(createModerationResponse2.equals(createModerationResponse1));
        System.assert(createModerationResponse3.equals(createModerationResponse4));
        System.assert(createModerationResponse4.equals(createModerationResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateModerationResponse createModerationResponse1 = OASCreateModerationResponse.getExample();
        OASCreateModerationResponse createModerationResponse2 = new OASCreateModerationResponse();

        System.assertEquals(false, createModerationResponse1.equals('foo'));
        System.assertEquals(false, createModerationResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateModerationResponse createModerationResponse1 = OASCreateModerationResponse.getExample();
        OASCreateModerationResponse createModerationResponse2 = new OASCreateModerationResponse();
        OASCreateModerationResponse createModerationResponse3;

        System.assertEquals(false, createModerationResponse1.equals(createModerationResponse3));
        System.assertEquals(false, createModerationResponse2.equals(createModerationResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateModerationResponse createModerationResponse1 = OASCreateModerationResponse.getExample();
        OASCreateModerationResponse createModerationResponse2 = new OASCreateModerationResponse();

        System.assertEquals(createModerationResponse1.hashCode(), createModerationResponse1.hashCode());
        System.assertEquals(createModerationResponse2.hashCode(), createModerationResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateModerationResponse createModerationResponse1 = OASCreateModerationResponse.getExample();
        OASCreateModerationResponse createModerationResponse2 = OASCreateModerationResponse.getExample();
        OASCreateModerationResponse createModerationResponse3 = new OASCreateModerationResponse();
        OASCreateModerationResponse createModerationResponse4 = new OASCreateModerationResponse();

        System.assert(createModerationResponse1.equals(createModerationResponse2));
        System.assert(createModerationResponse3.equals(createModerationResponse4));
        System.assertEquals(createModerationResponse1.hashCode(), createModerationResponse2.hashCode());
        System.assertEquals(createModerationResponse3.hashCode(), createModerationResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCreateModerationResponse createModerationResponse = new OASCreateModerationResponse();
        System.assertEquals(new List<OASCreateModerationResponseResultsIn>(), createModerationResponse.results);
        System.assertEquals(null, createModerationResponse.id);
        System.assertEquals(null, createModerationResponse.model);
    }
}
