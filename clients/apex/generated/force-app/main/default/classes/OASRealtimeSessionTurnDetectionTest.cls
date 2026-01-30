@isTest
private class OASRealtimeSessionTurnDetectionTest {
    @isTest
    private static void equalsSameInstance() {
        OASRealtimeSessionTurnDetection realtimeSessionTurnDetection1 = OASRealtimeSessionTurnDetection.getExample();
        OASRealtimeSessionTurnDetection realtimeSessionTurnDetection2 = realtimeSessionTurnDetection1;
        OASRealtimeSessionTurnDetection realtimeSessionTurnDetection3 = new OASRealtimeSessionTurnDetection();
        OASRealtimeSessionTurnDetection realtimeSessionTurnDetection4 = realtimeSessionTurnDetection3;

        System.assert(realtimeSessionTurnDetection1.equals(realtimeSessionTurnDetection2));
        System.assert(realtimeSessionTurnDetection2.equals(realtimeSessionTurnDetection1));
        System.assert(realtimeSessionTurnDetection1.equals(realtimeSessionTurnDetection1));
        System.assert(realtimeSessionTurnDetection3.equals(realtimeSessionTurnDetection4));
        System.assert(realtimeSessionTurnDetection4.equals(realtimeSessionTurnDetection3));
        System.assert(realtimeSessionTurnDetection3.equals(realtimeSessionTurnDetection3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRealtimeSessionTurnDetection realtimeSessionTurnDetection1 = OASRealtimeSessionTurnDetection.getExample();
        OASRealtimeSessionTurnDetection realtimeSessionTurnDetection2 = OASRealtimeSessionTurnDetection.getExample();
        OASRealtimeSessionTurnDetection realtimeSessionTurnDetection3 = new OASRealtimeSessionTurnDetection();
        OASRealtimeSessionTurnDetection realtimeSessionTurnDetection4 = new OASRealtimeSessionTurnDetection();

        System.assert(realtimeSessionTurnDetection1.equals(realtimeSessionTurnDetection2));
        System.assert(realtimeSessionTurnDetection2.equals(realtimeSessionTurnDetection1));
        System.assert(realtimeSessionTurnDetection3.equals(realtimeSessionTurnDetection4));
        System.assert(realtimeSessionTurnDetection4.equals(realtimeSessionTurnDetection3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRealtimeSessionTurnDetection realtimeSessionTurnDetection1 = OASRealtimeSessionTurnDetection.getExample();
        OASRealtimeSessionTurnDetection realtimeSessionTurnDetection2 = new OASRealtimeSessionTurnDetection();

        System.assertEquals(false, realtimeSessionTurnDetection1.equals('foo'));
        System.assertEquals(false, realtimeSessionTurnDetection2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRealtimeSessionTurnDetection realtimeSessionTurnDetection1 = OASRealtimeSessionTurnDetection.getExample();
        OASRealtimeSessionTurnDetection realtimeSessionTurnDetection2 = new OASRealtimeSessionTurnDetection();
        OASRealtimeSessionTurnDetection realtimeSessionTurnDetection3;

        System.assertEquals(false, realtimeSessionTurnDetection1.equals(realtimeSessionTurnDetection3));
        System.assertEquals(false, realtimeSessionTurnDetection2.equals(realtimeSessionTurnDetection3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRealtimeSessionTurnDetection realtimeSessionTurnDetection1 = OASRealtimeSessionTurnDetection.getExample();
        OASRealtimeSessionTurnDetection realtimeSessionTurnDetection2 = new OASRealtimeSessionTurnDetection();

        System.assertEquals(realtimeSessionTurnDetection1.hashCode(), realtimeSessionTurnDetection1.hashCode());
        System.assertEquals(realtimeSessionTurnDetection2.hashCode(), realtimeSessionTurnDetection2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRealtimeSessionTurnDetection realtimeSessionTurnDetection1 = OASRealtimeSessionTurnDetection.getExample();
        OASRealtimeSessionTurnDetection realtimeSessionTurnDetection2 = OASRealtimeSessionTurnDetection.getExample();
        OASRealtimeSessionTurnDetection realtimeSessionTurnDetection3 = new OASRealtimeSessionTurnDetection();
        OASRealtimeSessionTurnDetection realtimeSessionTurnDetection4 = new OASRealtimeSessionTurnDetection();

        System.assert(realtimeSessionTurnDetection1.equals(realtimeSessionTurnDetection2));
        System.assert(realtimeSessionTurnDetection3.equals(realtimeSessionTurnDetection4));
        System.assertEquals(realtimeSessionTurnDetection1.hashCode(), realtimeSessionTurnDetection2.hashCode());
        System.assertEquals(realtimeSessionTurnDetection3.hashCode(), realtimeSessionTurnDetection4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRealtimeSessionTurnDetection realtimeSessionTurnDetection = new OASRealtimeSessionTurnDetection();
        Map<String, String> x-property-mappings = realtimeSessionTurnDetection.getx-property-mappings();
        System.assertEquals('prefixPaddingMs', x-property-mappings.get('prefix_padding_ms'));
        System.assertEquals('silenceDurationMs', x-property-mappings.get('silence_duration_ms'));
    }
}
