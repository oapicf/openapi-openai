@isTest
private class OASRealtimeSessionCreateResponseClieTest {
    @isTest
    private static void equalsSameInstance() {
        OASRealtimeSessionCreateResponseClie realtimeSessionCreateResponseClientSecret1 = OASRealtimeSessionCreateResponseClie.getExample();
        OASRealtimeSessionCreateResponseClie realtimeSessionCreateResponseClientSecret2 = realtimeSessionCreateResponseClientSecret1;
        OASRealtimeSessionCreateResponseClie realtimeSessionCreateResponseClientSecret3 = new OASRealtimeSessionCreateResponseClie();
        OASRealtimeSessionCreateResponseClie realtimeSessionCreateResponseClientSecret4 = realtimeSessionCreateResponseClientSecret3;

        System.assert(realtimeSessionCreateResponseClientSecret1.equals(realtimeSessionCreateResponseClientSecret2));
        System.assert(realtimeSessionCreateResponseClientSecret2.equals(realtimeSessionCreateResponseClientSecret1));
        System.assert(realtimeSessionCreateResponseClientSecret1.equals(realtimeSessionCreateResponseClientSecret1));
        System.assert(realtimeSessionCreateResponseClientSecret3.equals(realtimeSessionCreateResponseClientSecret4));
        System.assert(realtimeSessionCreateResponseClientSecret4.equals(realtimeSessionCreateResponseClientSecret3));
        System.assert(realtimeSessionCreateResponseClientSecret3.equals(realtimeSessionCreateResponseClientSecret3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRealtimeSessionCreateResponseClie realtimeSessionCreateResponseClientSecret1 = OASRealtimeSessionCreateResponseClie.getExample();
        OASRealtimeSessionCreateResponseClie realtimeSessionCreateResponseClientSecret2 = OASRealtimeSessionCreateResponseClie.getExample();
        OASRealtimeSessionCreateResponseClie realtimeSessionCreateResponseClientSecret3 = new OASRealtimeSessionCreateResponseClie();
        OASRealtimeSessionCreateResponseClie realtimeSessionCreateResponseClientSecret4 = new OASRealtimeSessionCreateResponseClie();

        System.assert(realtimeSessionCreateResponseClientSecret1.equals(realtimeSessionCreateResponseClientSecret2));
        System.assert(realtimeSessionCreateResponseClientSecret2.equals(realtimeSessionCreateResponseClientSecret1));
        System.assert(realtimeSessionCreateResponseClientSecret3.equals(realtimeSessionCreateResponseClientSecret4));
        System.assert(realtimeSessionCreateResponseClientSecret4.equals(realtimeSessionCreateResponseClientSecret3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRealtimeSessionCreateResponseClie realtimeSessionCreateResponseClientSecret1 = OASRealtimeSessionCreateResponseClie.getExample();
        OASRealtimeSessionCreateResponseClie realtimeSessionCreateResponseClientSecret2 = new OASRealtimeSessionCreateResponseClie();

        System.assertEquals(false, realtimeSessionCreateResponseClientSecret1.equals('foo'));
        System.assertEquals(false, realtimeSessionCreateResponseClientSecret2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRealtimeSessionCreateResponseClie realtimeSessionCreateResponseClientSecret1 = OASRealtimeSessionCreateResponseClie.getExample();
        OASRealtimeSessionCreateResponseClie realtimeSessionCreateResponseClientSecret2 = new OASRealtimeSessionCreateResponseClie();
        OASRealtimeSessionCreateResponseClie realtimeSessionCreateResponseClientSecret3;

        System.assertEquals(false, realtimeSessionCreateResponseClientSecret1.equals(realtimeSessionCreateResponseClientSecret3));
        System.assertEquals(false, realtimeSessionCreateResponseClientSecret2.equals(realtimeSessionCreateResponseClientSecret3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRealtimeSessionCreateResponseClie realtimeSessionCreateResponseClientSecret1 = OASRealtimeSessionCreateResponseClie.getExample();
        OASRealtimeSessionCreateResponseClie realtimeSessionCreateResponseClientSecret2 = new OASRealtimeSessionCreateResponseClie();

        System.assertEquals(realtimeSessionCreateResponseClientSecret1.hashCode(), realtimeSessionCreateResponseClientSecret1.hashCode());
        System.assertEquals(realtimeSessionCreateResponseClientSecret2.hashCode(), realtimeSessionCreateResponseClientSecret2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRealtimeSessionCreateResponseClie realtimeSessionCreateResponseClientSecret1 = OASRealtimeSessionCreateResponseClie.getExample();
        OASRealtimeSessionCreateResponseClie realtimeSessionCreateResponseClientSecret2 = OASRealtimeSessionCreateResponseClie.getExample();
        OASRealtimeSessionCreateResponseClie realtimeSessionCreateResponseClientSecret3 = new OASRealtimeSessionCreateResponseClie();
        OASRealtimeSessionCreateResponseClie realtimeSessionCreateResponseClientSecret4 = new OASRealtimeSessionCreateResponseClie();

        System.assert(realtimeSessionCreateResponseClientSecret1.equals(realtimeSessionCreateResponseClientSecret2));
        System.assert(realtimeSessionCreateResponseClientSecret3.equals(realtimeSessionCreateResponseClientSecret4));
        System.assertEquals(realtimeSessionCreateResponseClientSecret1.hashCode(), realtimeSessionCreateResponseClientSecret2.hashCode());
        System.assertEquals(realtimeSessionCreateResponseClientSecret3.hashCode(), realtimeSessionCreateResponseClientSecret4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRealtimeSessionCreateResponseClie realtimeSessionCreateResponseClientSecret = new OASRealtimeSessionCreateResponseClie();
        Map<String, String> x-property-mappings = realtimeSessionCreateResponseClientSecret.getx-property-mappings();
        System.assertEquals('expiresAt', x-property-mappings.get('expires_at'));
    }
}
