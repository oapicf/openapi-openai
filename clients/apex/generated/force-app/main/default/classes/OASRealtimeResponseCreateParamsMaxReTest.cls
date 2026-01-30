@isTest
private class OASRealtimeResponseCreateParamsMaxReTest {
    @isTest
    private static void equalsSameInstance() {
        OASRealtimeResponseCreateParamsMaxRe realtimeResponseCreateParamsMaxResponseOutputTokens1 = OASRealtimeResponseCreateParamsMaxRe.getExample();
        OASRealtimeResponseCreateParamsMaxRe realtimeResponseCreateParamsMaxResponseOutputTokens2 = realtimeResponseCreateParamsMaxResponseOutputTokens1;
        OASRealtimeResponseCreateParamsMaxRe realtimeResponseCreateParamsMaxResponseOutputTokens3 = new OASRealtimeResponseCreateParamsMaxRe();
        OASRealtimeResponseCreateParamsMaxRe realtimeResponseCreateParamsMaxResponseOutputTokens4 = realtimeResponseCreateParamsMaxResponseOutputTokens3;

        System.assert(realtimeResponseCreateParamsMaxResponseOutputTokens1.equals(realtimeResponseCreateParamsMaxResponseOutputTokens2));
        System.assert(realtimeResponseCreateParamsMaxResponseOutputTokens2.equals(realtimeResponseCreateParamsMaxResponseOutputTokens1));
        System.assert(realtimeResponseCreateParamsMaxResponseOutputTokens1.equals(realtimeResponseCreateParamsMaxResponseOutputTokens1));
        System.assert(realtimeResponseCreateParamsMaxResponseOutputTokens3.equals(realtimeResponseCreateParamsMaxResponseOutputTokens4));
        System.assert(realtimeResponseCreateParamsMaxResponseOutputTokens4.equals(realtimeResponseCreateParamsMaxResponseOutputTokens3));
        System.assert(realtimeResponseCreateParamsMaxResponseOutputTokens3.equals(realtimeResponseCreateParamsMaxResponseOutputTokens3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRealtimeResponseCreateParamsMaxRe realtimeResponseCreateParamsMaxResponseOutputTokens1 = OASRealtimeResponseCreateParamsMaxRe.getExample();
        OASRealtimeResponseCreateParamsMaxRe realtimeResponseCreateParamsMaxResponseOutputTokens2 = OASRealtimeResponseCreateParamsMaxRe.getExample();
        OASRealtimeResponseCreateParamsMaxRe realtimeResponseCreateParamsMaxResponseOutputTokens3 = new OASRealtimeResponseCreateParamsMaxRe();
        OASRealtimeResponseCreateParamsMaxRe realtimeResponseCreateParamsMaxResponseOutputTokens4 = new OASRealtimeResponseCreateParamsMaxRe();

        System.assert(realtimeResponseCreateParamsMaxResponseOutputTokens1.equals(realtimeResponseCreateParamsMaxResponseOutputTokens2));
        System.assert(realtimeResponseCreateParamsMaxResponseOutputTokens2.equals(realtimeResponseCreateParamsMaxResponseOutputTokens1));
        System.assert(realtimeResponseCreateParamsMaxResponseOutputTokens3.equals(realtimeResponseCreateParamsMaxResponseOutputTokens4));
        System.assert(realtimeResponseCreateParamsMaxResponseOutputTokens4.equals(realtimeResponseCreateParamsMaxResponseOutputTokens3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRealtimeResponseCreateParamsMaxRe realtimeResponseCreateParamsMaxResponseOutputTokens1 = OASRealtimeResponseCreateParamsMaxRe.getExample();
        OASRealtimeResponseCreateParamsMaxRe realtimeResponseCreateParamsMaxResponseOutputTokens2 = new OASRealtimeResponseCreateParamsMaxRe();

        System.assertEquals(false, realtimeResponseCreateParamsMaxResponseOutputTokens1.equals('foo'));
        System.assertEquals(false, realtimeResponseCreateParamsMaxResponseOutputTokens2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRealtimeResponseCreateParamsMaxRe realtimeResponseCreateParamsMaxResponseOutputTokens1 = OASRealtimeResponseCreateParamsMaxRe.getExample();
        OASRealtimeResponseCreateParamsMaxRe realtimeResponseCreateParamsMaxResponseOutputTokens2 = new OASRealtimeResponseCreateParamsMaxRe();
        OASRealtimeResponseCreateParamsMaxRe realtimeResponseCreateParamsMaxResponseOutputTokens3;

        System.assertEquals(false, realtimeResponseCreateParamsMaxResponseOutputTokens1.equals(realtimeResponseCreateParamsMaxResponseOutputTokens3));
        System.assertEquals(false, realtimeResponseCreateParamsMaxResponseOutputTokens2.equals(realtimeResponseCreateParamsMaxResponseOutputTokens3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRealtimeResponseCreateParamsMaxRe realtimeResponseCreateParamsMaxResponseOutputTokens1 = OASRealtimeResponseCreateParamsMaxRe.getExample();
        OASRealtimeResponseCreateParamsMaxRe realtimeResponseCreateParamsMaxResponseOutputTokens2 = new OASRealtimeResponseCreateParamsMaxRe();

        System.assertEquals(realtimeResponseCreateParamsMaxResponseOutputTokens1.hashCode(), realtimeResponseCreateParamsMaxResponseOutputTokens1.hashCode());
        System.assertEquals(realtimeResponseCreateParamsMaxResponseOutputTokens2.hashCode(), realtimeResponseCreateParamsMaxResponseOutputTokens2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRealtimeResponseCreateParamsMaxRe realtimeResponseCreateParamsMaxResponseOutputTokens1 = OASRealtimeResponseCreateParamsMaxRe.getExample();
        OASRealtimeResponseCreateParamsMaxRe realtimeResponseCreateParamsMaxResponseOutputTokens2 = OASRealtimeResponseCreateParamsMaxRe.getExample();
        OASRealtimeResponseCreateParamsMaxRe realtimeResponseCreateParamsMaxResponseOutputTokens3 = new OASRealtimeResponseCreateParamsMaxRe();
        OASRealtimeResponseCreateParamsMaxRe realtimeResponseCreateParamsMaxResponseOutputTokens4 = new OASRealtimeResponseCreateParamsMaxRe();

        System.assert(realtimeResponseCreateParamsMaxResponseOutputTokens1.equals(realtimeResponseCreateParamsMaxResponseOutputTokens2));
        System.assert(realtimeResponseCreateParamsMaxResponseOutputTokens3.equals(realtimeResponseCreateParamsMaxResponseOutputTokens4));
        System.assertEquals(realtimeResponseCreateParamsMaxResponseOutputTokens1.hashCode(), realtimeResponseCreateParamsMaxResponseOutputTokens2.hashCode());
        System.assertEquals(realtimeResponseCreateParamsMaxResponseOutputTokens3.hashCode(), realtimeResponseCreateParamsMaxResponseOutputTokens4.hashCode());
    }
}
