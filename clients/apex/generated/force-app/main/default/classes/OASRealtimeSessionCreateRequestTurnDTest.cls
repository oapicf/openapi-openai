@isTest
private class OASRealtimeSessionCreateRequestTurnDTest {
    @isTest
    private static void equalsSameInstance() {
        OASRealtimeSessionCreateRequestTurnD realtimeSessionCreateRequestTurnDetection1 = OASRealtimeSessionCreateRequestTurnD.getExample();
        OASRealtimeSessionCreateRequestTurnD realtimeSessionCreateRequestTurnDetection2 = realtimeSessionCreateRequestTurnDetection1;
        OASRealtimeSessionCreateRequestTurnD realtimeSessionCreateRequestTurnDetection3 = new OASRealtimeSessionCreateRequestTurnD();
        OASRealtimeSessionCreateRequestTurnD realtimeSessionCreateRequestTurnDetection4 = realtimeSessionCreateRequestTurnDetection3;

        System.assert(realtimeSessionCreateRequestTurnDetection1.equals(realtimeSessionCreateRequestTurnDetection2));
        System.assert(realtimeSessionCreateRequestTurnDetection2.equals(realtimeSessionCreateRequestTurnDetection1));
        System.assert(realtimeSessionCreateRequestTurnDetection1.equals(realtimeSessionCreateRequestTurnDetection1));
        System.assert(realtimeSessionCreateRequestTurnDetection3.equals(realtimeSessionCreateRequestTurnDetection4));
        System.assert(realtimeSessionCreateRequestTurnDetection4.equals(realtimeSessionCreateRequestTurnDetection3));
        System.assert(realtimeSessionCreateRequestTurnDetection3.equals(realtimeSessionCreateRequestTurnDetection3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRealtimeSessionCreateRequestTurnD realtimeSessionCreateRequestTurnDetection1 = OASRealtimeSessionCreateRequestTurnD.getExample();
        OASRealtimeSessionCreateRequestTurnD realtimeSessionCreateRequestTurnDetection2 = OASRealtimeSessionCreateRequestTurnD.getExample();
        OASRealtimeSessionCreateRequestTurnD realtimeSessionCreateRequestTurnDetection3 = new OASRealtimeSessionCreateRequestTurnD();
        OASRealtimeSessionCreateRequestTurnD realtimeSessionCreateRequestTurnDetection4 = new OASRealtimeSessionCreateRequestTurnD();

        System.assert(realtimeSessionCreateRequestTurnDetection1.equals(realtimeSessionCreateRequestTurnDetection2));
        System.assert(realtimeSessionCreateRequestTurnDetection2.equals(realtimeSessionCreateRequestTurnDetection1));
        System.assert(realtimeSessionCreateRequestTurnDetection3.equals(realtimeSessionCreateRequestTurnDetection4));
        System.assert(realtimeSessionCreateRequestTurnDetection4.equals(realtimeSessionCreateRequestTurnDetection3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRealtimeSessionCreateRequestTurnD realtimeSessionCreateRequestTurnDetection1 = OASRealtimeSessionCreateRequestTurnD.getExample();
        OASRealtimeSessionCreateRequestTurnD realtimeSessionCreateRequestTurnDetection2 = new OASRealtimeSessionCreateRequestTurnD();

        System.assertEquals(false, realtimeSessionCreateRequestTurnDetection1.equals('foo'));
        System.assertEquals(false, realtimeSessionCreateRequestTurnDetection2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRealtimeSessionCreateRequestTurnD realtimeSessionCreateRequestTurnDetection1 = OASRealtimeSessionCreateRequestTurnD.getExample();
        OASRealtimeSessionCreateRequestTurnD realtimeSessionCreateRequestTurnDetection2 = new OASRealtimeSessionCreateRequestTurnD();
        OASRealtimeSessionCreateRequestTurnD realtimeSessionCreateRequestTurnDetection3;

        System.assertEquals(false, realtimeSessionCreateRequestTurnDetection1.equals(realtimeSessionCreateRequestTurnDetection3));
        System.assertEquals(false, realtimeSessionCreateRequestTurnDetection2.equals(realtimeSessionCreateRequestTurnDetection3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRealtimeSessionCreateRequestTurnD realtimeSessionCreateRequestTurnDetection1 = OASRealtimeSessionCreateRequestTurnD.getExample();
        OASRealtimeSessionCreateRequestTurnD realtimeSessionCreateRequestTurnDetection2 = new OASRealtimeSessionCreateRequestTurnD();

        System.assertEquals(realtimeSessionCreateRequestTurnDetection1.hashCode(), realtimeSessionCreateRequestTurnDetection1.hashCode());
        System.assertEquals(realtimeSessionCreateRequestTurnDetection2.hashCode(), realtimeSessionCreateRequestTurnDetection2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRealtimeSessionCreateRequestTurnD realtimeSessionCreateRequestTurnDetection1 = OASRealtimeSessionCreateRequestTurnD.getExample();
        OASRealtimeSessionCreateRequestTurnD realtimeSessionCreateRequestTurnDetection2 = OASRealtimeSessionCreateRequestTurnD.getExample();
        OASRealtimeSessionCreateRequestTurnD realtimeSessionCreateRequestTurnDetection3 = new OASRealtimeSessionCreateRequestTurnD();
        OASRealtimeSessionCreateRequestTurnD realtimeSessionCreateRequestTurnDetection4 = new OASRealtimeSessionCreateRequestTurnD();

        System.assert(realtimeSessionCreateRequestTurnDetection1.equals(realtimeSessionCreateRequestTurnDetection2));
        System.assert(realtimeSessionCreateRequestTurnDetection3.equals(realtimeSessionCreateRequestTurnDetection4));
        System.assertEquals(realtimeSessionCreateRequestTurnDetection1.hashCode(), realtimeSessionCreateRequestTurnDetection2.hashCode());
        System.assertEquals(realtimeSessionCreateRequestTurnDetection3.hashCode(), realtimeSessionCreateRequestTurnDetection4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRealtimeSessionCreateRequestTurnD realtimeSessionCreateRequestTurnDetection = new OASRealtimeSessionCreateRequestTurnD();
        Map<String, String> x-property-mappings = realtimeSessionCreateRequestTurnDetection.getx-property-mappings();
        System.assertEquals('prefixPaddingMs', x-property-mappings.get('prefix_padding_ms'));
        System.assertEquals('silenceDurationMs', x-property-mappings.get('silence_duration_ms'));
        System.assertEquals('createResponse', x-property-mappings.get('create_response'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASRealtimeSessionCreateRequestTurnD realtimeSessionCreateRequestTurnDetection = new OASRealtimeSessionCreateRequestTurnD();
        System.assertEquals(true, realtimeSessionCreateRequestTurnDetection.createResponse);
        System.assertEquals(null, realtimeSessionCreateRequestTurnDetection.type);
        System.assertEquals(null, realtimeSessionCreateRequestTurnDetection.threshold);
        System.assertEquals(null, realtimeSessionCreateRequestTurnDetection.prefixPaddingMs);
        System.assertEquals(null, realtimeSessionCreateRequestTurnDetection.silenceDurationMs);
    }
}
