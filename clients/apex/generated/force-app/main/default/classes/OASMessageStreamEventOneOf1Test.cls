@isTest
private class OASMessageStreamEventOneOf1Test {
    @isTest
    private static void equalsSameInstance() {
        OASMessageStreamEventOneOf1 messageStreamEventOneOf11 = OASMessageStreamEventOneOf1.getExample();
        OASMessageStreamEventOneOf1 messageStreamEventOneOf12 = messageStreamEventOneOf11;
        OASMessageStreamEventOneOf1 messageStreamEventOneOf13 = new OASMessageStreamEventOneOf1();
        OASMessageStreamEventOneOf1 messageStreamEventOneOf14 = messageStreamEventOneOf13;

        System.assert(messageStreamEventOneOf11.equals(messageStreamEventOneOf12));
        System.assert(messageStreamEventOneOf12.equals(messageStreamEventOneOf11));
        System.assert(messageStreamEventOneOf11.equals(messageStreamEventOneOf11));
        System.assert(messageStreamEventOneOf13.equals(messageStreamEventOneOf14));
        System.assert(messageStreamEventOneOf14.equals(messageStreamEventOneOf13));
        System.assert(messageStreamEventOneOf13.equals(messageStreamEventOneOf13));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMessageStreamEventOneOf1 messageStreamEventOneOf11 = OASMessageStreamEventOneOf1.getExample();
        OASMessageStreamEventOneOf1 messageStreamEventOneOf12 = OASMessageStreamEventOneOf1.getExample();
        OASMessageStreamEventOneOf1 messageStreamEventOneOf13 = new OASMessageStreamEventOneOf1();
        OASMessageStreamEventOneOf1 messageStreamEventOneOf14 = new OASMessageStreamEventOneOf1();

        System.assert(messageStreamEventOneOf11.equals(messageStreamEventOneOf12));
        System.assert(messageStreamEventOneOf12.equals(messageStreamEventOneOf11));
        System.assert(messageStreamEventOneOf13.equals(messageStreamEventOneOf14));
        System.assert(messageStreamEventOneOf14.equals(messageStreamEventOneOf13));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMessageStreamEventOneOf1 messageStreamEventOneOf11 = OASMessageStreamEventOneOf1.getExample();
        OASMessageStreamEventOneOf1 messageStreamEventOneOf12 = new OASMessageStreamEventOneOf1();

        System.assertEquals(false, messageStreamEventOneOf11.equals('foo'));
        System.assertEquals(false, messageStreamEventOneOf12.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMessageStreamEventOneOf1 messageStreamEventOneOf11 = OASMessageStreamEventOneOf1.getExample();
        OASMessageStreamEventOneOf1 messageStreamEventOneOf12 = new OASMessageStreamEventOneOf1();
        OASMessageStreamEventOneOf1 messageStreamEventOneOf13;

        System.assertEquals(false, messageStreamEventOneOf11.equals(messageStreamEventOneOf13));
        System.assertEquals(false, messageStreamEventOneOf12.equals(messageStreamEventOneOf13));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMessageStreamEventOneOf1 messageStreamEventOneOf11 = OASMessageStreamEventOneOf1.getExample();
        OASMessageStreamEventOneOf1 messageStreamEventOneOf12 = new OASMessageStreamEventOneOf1();

        System.assertEquals(messageStreamEventOneOf11.hashCode(), messageStreamEventOneOf11.hashCode());
        System.assertEquals(messageStreamEventOneOf12.hashCode(), messageStreamEventOneOf12.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMessageStreamEventOneOf1 messageStreamEventOneOf11 = OASMessageStreamEventOneOf1.getExample();
        OASMessageStreamEventOneOf1 messageStreamEventOneOf12 = OASMessageStreamEventOneOf1.getExample();
        OASMessageStreamEventOneOf1 messageStreamEventOneOf13 = new OASMessageStreamEventOneOf1();
        OASMessageStreamEventOneOf1 messageStreamEventOneOf14 = new OASMessageStreamEventOneOf1();

        System.assert(messageStreamEventOneOf11.equals(messageStreamEventOneOf12));
        System.assert(messageStreamEventOneOf13.equals(messageStreamEventOneOf14));
        System.assertEquals(messageStreamEventOneOf11.hashCode(), messageStreamEventOneOf12.hashCode());
        System.assertEquals(messageStreamEventOneOf13.hashCode(), messageStreamEventOneOf14.hashCode());
    }
}
