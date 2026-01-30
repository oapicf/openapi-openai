@isTest
private class OASRealtimeResponseCreateParamsToolsTest {
    @isTest
    private static void equalsSameInstance() {
        OASRealtimeResponseCreateParamsTools realtimeResponseCreateParamsToolsInner1 = OASRealtimeResponseCreateParamsTools.getExample();
        OASRealtimeResponseCreateParamsTools realtimeResponseCreateParamsToolsInner2 = realtimeResponseCreateParamsToolsInner1;
        OASRealtimeResponseCreateParamsTools realtimeResponseCreateParamsToolsInner3 = new OASRealtimeResponseCreateParamsTools();
        OASRealtimeResponseCreateParamsTools realtimeResponseCreateParamsToolsInner4 = realtimeResponseCreateParamsToolsInner3;

        System.assert(realtimeResponseCreateParamsToolsInner1.equals(realtimeResponseCreateParamsToolsInner2));
        System.assert(realtimeResponseCreateParamsToolsInner2.equals(realtimeResponseCreateParamsToolsInner1));
        System.assert(realtimeResponseCreateParamsToolsInner1.equals(realtimeResponseCreateParamsToolsInner1));
        System.assert(realtimeResponseCreateParamsToolsInner3.equals(realtimeResponseCreateParamsToolsInner4));
        System.assert(realtimeResponseCreateParamsToolsInner4.equals(realtimeResponseCreateParamsToolsInner3));
        System.assert(realtimeResponseCreateParamsToolsInner3.equals(realtimeResponseCreateParamsToolsInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRealtimeResponseCreateParamsTools realtimeResponseCreateParamsToolsInner1 = OASRealtimeResponseCreateParamsTools.getExample();
        OASRealtimeResponseCreateParamsTools realtimeResponseCreateParamsToolsInner2 = OASRealtimeResponseCreateParamsTools.getExample();
        OASRealtimeResponseCreateParamsTools realtimeResponseCreateParamsToolsInner3 = new OASRealtimeResponseCreateParamsTools();
        OASRealtimeResponseCreateParamsTools realtimeResponseCreateParamsToolsInner4 = new OASRealtimeResponseCreateParamsTools();

        System.assert(realtimeResponseCreateParamsToolsInner1.equals(realtimeResponseCreateParamsToolsInner2));
        System.assert(realtimeResponseCreateParamsToolsInner2.equals(realtimeResponseCreateParamsToolsInner1));
        System.assert(realtimeResponseCreateParamsToolsInner3.equals(realtimeResponseCreateParamsToolsInner4));
        System.assert(realtimeResponseCreateParamsToolsInner4.equals(realtimeResponseCreateParamsToolsInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRealtimeResponseCreateParamsTools realtimeResponseCreateParamsToolsInner1 = OASRealtimeResponseCreateParamsTools.getExample();
        OASRealtimeResponseCreateParamsTools realtimeResponseCreateParamsToolsInner2 = new OASRealtimeResponseCreateParamsTools();

        System.assertEquals(false, realtimeResponseCreateParamsToolsInner1.equals('foo'));
        System.assertEquals(false, realtimeResponseCreateParamsToolsInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRealtimeResponseCreateParamsTools realtimeResponseCreateParamsToolsInner1 = OASRealtimeResponseCreateParamsTools.getExample();
        OASRealtimeResponseCreateParamsTools realtimeResponseCreateParamsToolsInner2 = new OASRealtimeResponseCreateParamsTools();
        OASRealtimeResponseCreateParamsTools realtimeResponseCreateParamsToolsInner3;

        System.assertEquals(false, realtimeResponseCreateParamsToolsInner1.equals(realtimeResponseCreateParamsToolsInner3));
        System.assertEquals(false, realtimeResponseCreateParamsToolsInner2.equals(realtimeResponseCreateParamsToolsInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRealtimeResponseCreateParamsTools realtimeResponseCreateParamsToolsInner1 = OASRealtimeResponseCreateParamsTools.getExample();
        OASRealtimeResponseCreateParamsTools realtimeResponseCreateParamsToolsInner2 = new OASRealtimeResponseCreateParamsTools();

        System.assertEquals(realtimeResponseCreateParamsToolsInner1.hashCode(), realtimeResponseCreateParamsToolsInner1.hashCode());
        System.assertEquals(realtimeResponseCreateParamsToolsInner2.hashCode(), realtimeResponseCreateParamsToolsInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRealtimeResponseCreateParamsTools realtimeResponseCreateParamsToolsInner1 = OASRealtimeResponseCreateParamsTools.getExample();
        OASRealtimeResponseCreateParamsTools realtimeResponseCreateParamsToolsInner2 = OASRealtimeResponseCreateParamsTools.getExample();
        OASRealtimeResponseCreateParamsTools realtimeResponseCreateParamsToolsInner3 = new OASRealtimeResponseCreateParamsTools();
        OASRealtimeResponseCreateParamsTools realtimeResponseCreateParamsToolsInner4 = new OASRealtimeResponseCreateParamsTools();

        System.assert(realtimeResponseCreateParamsToolsInner1.equals(realtimeResponseCreateParamsToolsInner2));
        System.assert(realtimeResponseCreateParamsToolsInner3.equals(realtimeResponseCreateParamsToolsInner4));
        System.assertEquals(realtimeResponseCreateParamsToolsInner1.hashCode(), realtimeResponseCreateParamsToolsInner2.hashCode());
        System.assertEquals(realtimeResponseCreateParamsToolsInner3.hashCode(), realtimeResponseCreateParamsToolsInner4.hashCode());
    }
}
