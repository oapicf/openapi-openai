@isTest
private class OASRealtimeServerEventRateLimitsUpdaTest {
    @isTest
    private static void equalsSameInstance() {
        OASRealtimeServerEventRateLimitsUpda realtimeServerEventRateLimitsUpdatedRateLimitsInner1 = OASRealtimeServerEventRateLimitsUpda.getExample();
        OASRealtimeServerEventRateLimitsUpda realtimeServerEventRateLimitsUpdatedRateLimitsInner2 = realtimeServerEventRateLimitsUpdatedRateLimitsInner1;
        OASRealtimeServerEventRateLimitsUpda realtimeServerEventRateLimitsUpdatedRateLimitsInner3 = new OASRealtimeServerEventRateLimitsUpda();
        OASRealtimeServerEventRateLimitsUpda realtimeServerEventRateLimitsUpdatedRateLimitsInner4 = realtimeServerEventRateLimitsUpdatedRateLimitsInner3;

        System.assert(realtimeServerEventRateLimitsUpdatedRateLimitsInner1.equals(realtimeServerEventRateLimitsUpdatedRateLimitsInner2));
        System.assert(realtimeServerEventRateLimitsUpdatedRateLimitsInner2.equals(realtimeServerEventRateLimitsUpdatedRateLimitsInner1));
        System.assert(realtimeServerEventRateLimitsUpdatedRateLimitsInner1.equals(realtimeServerEventRateLimitsUpdatedRateLimitsInner1));
        System.assert(realtimeServerEventRateLimitsUpdatedRateLimitsInner3.equals(realtimeServerEventRateLimitsUpdatedRateLimitsInner4));
        System.assert(realtimeServerEventRateLimitsUpdatedRateLimitsInner4.equals(realtimeServerEventRateLimitsUpdatedRateLimitsInner3));
        System.assert(realtimeServerEventRateLimitsUpdatedRateLimitsInner3.equals(realtimeServerEventRateLimitsUpdatedRateLimitsInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRealtimeServerEventRateLimitsUpda realtimeServerEventRateLimitsUpdatedRateLimitsInner1 = OASRealtimeServerEventRateLimitsUpda.getExample();
        OASRealtimeServerEventRateLimitsUpda realtimeServerEventRateLimitsUpdatedRateLimitsInner2 = OASRealtimeServerEventRateLimitsUpda.getExample();
        OASRealtimeServerEventRateLimitsUpda realtimeServerEventRateLimitsUpdatedRateLimitsInner3 = new OASRealtimeServerEventRateLimitsUpda();
        OASRealtimeServerEventRateLimitsUpda realtimeServerEventRateLimitsUpdatedRateLimitsInner4 = new OASRealtimeServerEventRateLimitsUpda();

        System.assert(realtimeServerEventRateLimitsUpdatedRateLimitsInner1.equals(realtimeServerEventRateLimitsUpdatedRateLimitsInner2));
        System.assert(realtimeServerEventRateLimitsUpdatedRateLimitsInner2.equals(realtimeServerEventRateLimitsUpdatedRateLimitsInner1));
        System.assert(realtimeServerEventRateLimitsUpdatedRateLimitsInner3.equals(realtimeServerEventRateLimitsUpdatedRateLimitsInner4));
        System.assert(realtimeServerEventRateLimitsUpdatedRateLimitsInner4.equals(realtimeServerEventRateLimitsUpdatedRateLimitsInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRealtimeServerEventRateLimitsUpda realtimeServerEventRateLimitsUpdatedRateLimitsInner1 = OASRealtimeServerEventRateLimitsUpda.getExample();
        OASRealtimeServerEventRateLimitsUpda realtimeServerEventRateLimitsUpdatedRateLimitsInner2 = new OASRealtimeServerEventRateLimitsUpda();

        System.assertEquals(false, realtimeServerEventRateLimitsUpdatedRateLimitsInner1.equals('foo'));
        System.assertEquals(false, realtimeServerEventRateLimitsUpdatedRateLimitsInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRealtimeServerEventRateLimitsUpda realtimeServerEventRateLimitsUpdatedRateLimitsInner1 = OASRealtimeServerEventRateLimitsUpda.getExample();
        OASRealtimeServerEventRateLimitsUpda realtimeServerEventRateLimitsUpdatedRateLimitsInner2 = new OASRealtimeServerEventRateLimitsUpda();
        OASRealtimeServerEventRateLimitsUpda realtimeServerEventRateLimitsUpdatedRateLimitsInner3;

        System.assertEquals(false, realtimeServerEventRateLimitsUpdatedRateLimitsInner1.equals(realtimeServerEventRateLimitsUpdatedRateLimitsInner3));
        System.assertEquals(false, realtimeServerEventRateLimitsUpdatedRateLimitsInner2.equals(realtimeServerEventRateLimitsUpdatedRateLimitsInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRealtimeServerEventRateLimitsUpda realtimeServerEventRateLimitsUpdatedRateLimitsInner1 = OASRealtimeServerEventRateLimitsUpda.getExample();
        OASRealtimeServerEventRateLimitsUpda realtimeServerEventRateLimitsUpdatedRateLimitsInner2 = new OASRealtimeServerEventRateLimitsUpda();

        System.assertEquals(realtimeServerEventRateLimitsUpdatedRateLimitsInner1.hashCode(), realtimeServerEventRateLimitsUpdatedRateLimitsInner1.hashCode());
        System.assertEquals(realtimeServerEventRateLimitsUpdatedRateLimitsInner2.hashCode(), realtimeServerEventRateLimitsUpdatedRateLimitsInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRealtimeServerEventRateLimitsUpda realtimeServerEventRateLimitsUpdatedRateLimitsInner1 = OASRealtimeServerEventRateLimitsUpda.getExample();
        OASRealtimeServerEventRateLimitsUpda realtimeServerEventRateLimitsUpdatedRateLimitsInner2 = OASRealtimeServerEventRateLimitsUpda.getExample();
        OASRealtimeServerEventRateLimitsUpda realtimeServerEventRateLimitsUpdatedRateLimitsInner3 = new OASRealtimeServerEventRateLimitsUpda();
        OASRealtimeServerEventRateLimitsUpda realtimeServerEventRateLimitsUpdatedRateLimitsInner4 = new OASRealtimeServerEventRateLimitsUpda();

        System.assert(realtimeServerEventRateLimitsUpdatedRateLimitsInner1.equals(realtimeServerEventRateLimitsUpdatedRateLimitsInner2));
        System.assert(realtimeServerEventRateLimitsUpdatedRateLimitsInner3.equals(realtimeServerEventRateLimitsUpdatedRateLimitsInner4));
        System.assertEquals(realtimeServerEventRateLimitsUpdatedRateLimitsInner1.hashCode(), realtimeServerEventRateLimitsUpdatedRateLimitsInner2.hashCode());
        System.assertEquals(realtimeServerEventRateLimitsUpdatedRateLimitsInner3.hashCode(), realtimeServerEventRateLimitsUpdatedRateLimitsInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRealtimeServerEventRateLimitsUpda realtimeServerEventRateLimitsUpdatedRateLimitsInner = new OASRealtimeServerEventRateLimitsUpda();
        Map<String, String> x-property-mappings = realtimeServerEventRateLimitsUpdatedRateLimitsInner.getx-property-mappings();
        System.assertEquals('r_limit', x-property-mappings.get('limit'));
        System.assertEquals('resetSeconds', x-property-mappings.get('reset_seconds'));
    }
}
