@isTest
private class OASRealtimeSessionModelTest {
    @isTest
    private static void equalsSameInstance() {
        OASRealtimeSessionModel realtimeSessionModel1 = OASRealtimeSessionModel.getExample();
        OASRealtimeSessionModel realtimeSessionModel2 = realtimeSessionModel1;
        OASRealtimeSessionModel realtimeSessionModel3 = new OASRealtimeSessionModel();
        OASRealtimeSessionModel realtimeSessionModel4 = realtimeSessionModel3;

        System.assert(realtimeSessionModel1.equals(realtimeSessionModel2));
        System.assert(realtimeSessionModel2.equals(realtimeSessionModel1));
        System.assert(realtimeSessionModel1.equals(realtimeSessionModel1));
        System.assert(realtimeSessionModel3.equals(realtimeSessionModel4));
        System.assert(realtimeSessionModel4.equals(realtimeSessionModel3));
        System.assert(realtimeSessionModel3.equals(realtimeSessionModel3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRealtimeSessionModel realtimeSessionModel1 = OASRealtimeSessionModel.getExample();
        OASRealtimeSessionModel realtimeSessionModel2 = OASRealtimeSessionModel.getExample();
        OASRealtimeSessionModel realtimeSessionModel3 = new OASRealtimeSessionModel();
        OASRealtimeSessionModel realtimeSessionModel4 = new OASRealtimeSessionModel();

        System.assert(realtimeSessionModel1.equals(realtimeSessionModel2));
        System.assert(realtimeSessionModel2.equals(realtimeSessionModel1));
        System.assert(realtimeSessionModel3.equals(realtimeSessionModel4));
        System.assert(realtimeSessionModel4.equals(realtimeSessionModel3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRealtimeSessionModel realtimeSessionModel1 = OASRealtimeSessionModel.getExample();
        OASRealtimeSessionModel realtimeSessionModel2 = new OASRealtimeSessionModel();

        System.assertEquals(false, realtimeSessionModel1.equals('foo'));
        System.assertEquals(false, realtimeSessionModel2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRealtimeSessionModel realtimeSessionModel1 = OASRealtimeSessionModel.getExample();
        OASRealtimeSessionModel realtimeSessionModel2 = new OASRealtimeSessionModel();
        OASRealtimeSessionModel realtimeSessionModel3;

        System.assertEquals(false, realtimeSessionModel1.equals(realtimeSessionModel3));
        System.assertEquals(false, realtimeSessionModel2.equals(realtimeSessionModel3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRealtimeSessionModel realtimeSessionModel1 = OASRealtimeSessionModel.getExample();
        OASRealtimeSessionModel realtimeSessionModel2 = new OASRealtimeSessionModel();

        System.assertEquals(realtimeSessionModel1.hashCode(), realtimeSessionModel1.hashCode());
        System.assertEquals(realtimeSessionModel2.hashCode(), realtimeSessionModel2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRealtimeSessionModel realtimeSessionModel1 = OASRealtimeSessionModel.getExample();
        OASRealtimeSessionModel realtimeSessionModel2 = OASRealtimeSessionModel.getExample();
        OASRealtimeSessionModel realtimeSessionModel3 = new OASRealtimeSessionModel();
        OASRealtimeSessionModel realtimeSessionModel4 = new OASRealtimeSessionModel();

        System.assert(realtimeSessionModel1.equals(realtimeSessionModel2));
        System.assert(realtimeSessionModel3.equals(realtimeSessionModel4));
        System.assertEquals(realtimeSessionModel1.hashCode(), realtimeSessionModel2.hashCode());
        System.assertEquals(realtimeSessionModel3.hashCode(), realtimeSessionModel4.hashCode());
    }
}
