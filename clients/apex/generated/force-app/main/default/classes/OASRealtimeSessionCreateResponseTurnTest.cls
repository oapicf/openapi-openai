@isTest
private class OASRealtimeSessionCreateResponseTurnTest {
    @isTest
    private static void equalsSameInstance() {
        OASRealtimeSessionCreateResponseTurn realtimeSessionCreateResponseTurnDetection1 = OASRealtimeSessionCreateResponseTurn.getExample();
        OASRealtimeSessionCreateResponseTurn realtimeSessionCreateResponseTurnDetection2 = realtimeSessionCreateResponseTurnDetection1;
        OASRealtimeSessionCreateResponseTurn realtimeSessionCreateResponseTurnDetection3 = new OASRealtimeSessionCreateResponseTurn();
        OASRealtimeSessionCreateResponseTurn realtimeSessionCreateResponseTurnDetection4 = realtimeSessionCreateResponseTurnDetection3;

        System.assert(realtimeSessionCreateResponseTurnDetection1.equals(realtimeSessionCreateResponseTurnDetection2));
        System.assert(realtimeSessionCreateResponseTurnDetection2.equals(realtimeSessionCreateResponseTurnDetection1));
        System.assert(realtimeSessionCreateResponseTurnDetection1.equals(realtimeSessionCreateResponseTurnDetection1));
        System.assert(realtimeSessionCreateResponseTurnDetection3.equals(realtimeSessionCreateResponseTurnDetection4));
        System.assert(realtimeSessionCreateResponseTurnDetection4.equals(realtimeSessionCreateResponseTurnDetection3));
        System.assert(realtimeSessionCreateResponseTurnDetection3.equals(realtimeSessionCreateResponseTurnDetection3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRealtimeSessionCreateResponseTurn realtimeSessionCreateResponseTurnDetection1 = OASRealtimeSessionCreateResponseTurn.getExample();
        OASRealtimeSessionCreateResponseTurn realtimeSessionCreateResponseTurnDetection2 = OASRealtimeSessionCreateResponseTurn.getExample();
        OASRealtimeSessionCreateResponseTurn realtimeSessionCreateResponseTurnDetection3 = new OASRealtimeSessionCreateResponseTurn();
        OASRealtimeSessionCreateResponseTurn realtimeSessionCreateResponseTurnDetection4 = new OASRealtimeSessionCreateResponseTurn();

        System.assert(realtimeSessionCreateResponseTurnDetection1.equals(realtimeSessionCreateResponseTurnDetection2));
        System.assert(realtimeSessionCreateResponseTurnDetection2.equals(realtimeSessionCreateResponseTurnDetection1));
        System.assert(realtimeSessionCreateResponseTurnDetection3.equals(realtimeSessionCreateResponseTurnDetection4));
        System.assert(realtimeSessionCreateResponseTurnDetection4.equals(realtimeSessionCreateResponseTurnDetection3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRealtimeSessionCreateResponseTurn realtimeSessionCreateResponseTurnDetection1 = OASRealtimeSessionCreateResponseTurn.getExample();
        OASRealtimeSessionCreateResponseTurn realtimeSessionCreateResponseTurnDetection2 = new OASRealtimeSessionCreateResponseTurn();

        System.assertEquals(false, realtimeSessionCreateResponseTurnDetection1.equals('foo'));
        System.assertEquals(false, realtimeSessionCreateResponseTurnDetection2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRealtimeSessionCreateResponseTurn realtimeSessionCreateResponseTurnDetection1 = OASRealtimeSessionCreateResponseTurn.getExample();
        OASRealtimeSessionCreateResponseTurn realtimeSessionCreateResponseTurnDetection2 = new OASRealtimeSessionCreateResponseTurn();
        OASRealtimeSessionCreateResponseTurn realtimeSessionCreateResponseTurnDetection3;

        System.assertEquals(false, realtimeSessionCreateResponseTurnDetection1.equals(realtimeSessionCreateResponseTurnDetection3));
        System.assertEquals(false, realtimeSessionCreateResponseTurnDetection2.equals(realtimeSessionCreateResponseTurnDetection3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRealtimeSessionCreateResponseTurn realtimeSessionCreateResponseTurnDetection1 = OASRealtimeSessionCreateResponseTurn.getExample();
        OASRealtimeSessionCreateResponseTurn realtimeSessionCreateResponseTurnDetection2 = new OASRealtimeSessionCreateResponseTurn();

        System.assertEquals(realtimeSessionCreateResponseTurnDetection1.hashCode(), realtimeSessionCreateResponseTurnDetection1.hashCode());
        System.assertEquals(realtimeSessionCreateResponseTurnDetection2.hashCode(), realtimeSessionCreateResponseTurnDetection2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRealtimeSessionCreateResponseTurn realtimeSessionCreateResponseTurnDetection1 = OASRealtimeSessionCreateResponseTurn.getExample();
        OASRealtimeSessionCreateResponseTurn realtimeSessionCreateResponseTurnDetection2 = OASRealtimeSessionCreateResponseTurn.getExample();
        OASRealtimeSessionCreateResponseTurn realtimeSessionCreateResponseTurnDetection3 = new OASRealtimeSessionCreateResponseTurn();
        OASRealtimeSessionCreateResponseTurn realtimeSessionCreateResponseTurnDetection4 = new OASRealtimeSessionCreateResponseTurn();

        System.assert(realtimeSessionCreateResponseTurnDetection1.equals(realtimeSessionCreateResponseTurnDetection2));
        System.assert(realtimeSessionCreateResponseTurnDetection3.equals(realtimeSessionCreateResponseTurnDetection4));
        System.assertEquals(realtimeSessionCreateResponseTurnDetection1.hashCode(), realtimeSessionCreateResponseTurnDetection2.hashCode());
        System.assertEquals(realtimeSessionCreateResponseTurnDetection3.hashCode(), realtimeSessionCreateResponseTurnDetection4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRealtimeSessionCreateResponseTurn realtimeSessionCreateResponseTurnDetection = new OASRealtimeSessionCreateResponseTurn();
        Map<String, String> x-property-mappings = realtimeSessionCreateResponseTurnDetection.getx-property-mappings();
        System.assertEquals('prefixPaddingMs', x-property-mappings.get('prefix_padding_ms'));
        System.assertEquals('silenceDurationMs', x-property-mappings.get('silence_duration_ms'));
    }
}
