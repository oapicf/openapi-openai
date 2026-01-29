@isTest
private class OASMessageStreamEventOneOf4Test {
    @isTest
    private static void equalsSameInstance() {
        OASMessageStreamEventOneOf4 messageStreamEventOneOf41 = OASMessageStreamEventOneOf4.getExample();
        OASMessageStreamEventOneOf4 messageStreamEventOneOf42 = messageStreamEventOneOf41;
        OASMessageStreamEventOneOf4 messageStreamEventOneOf43 = new OASMessageStreamEventOneOf4();
        OASMessageStreamEventOneOf4 messageStreamEventOneOf44 = messageStreamEventOneOf43;

        System.assert(messageStreamEventOneOf41.equals(messageStreamEventOneOf42));
        System.assert(messageStreamEventOneOf42.equals(messageStreamEventOneOf41));
        System.assert(messageStreamEventOneOf41.equals(messageStreamEventOneOf41));
        System.assert(messageStreamEventOneOf43.equals(messageStreamEventOneOf44));
        System.assert(messageStreamEventOneOf44.equals(messageStreamEventOneOf43));
        System.assert(messageStreamEventOneOf43.equals(messageStreamEventOneOf43));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMessageStreamEventOneOf4 messageStreamEventOneOf41 = OASMessageStreamEventOneOf4.getExample();
        OASMessageStreamEventOneOf4 messageStreamEventOneOf42 = OASMessageStreamEventOneOf4.getExample();
        OASMessageStreamEventOneOf4 messageStreamEventOneOf43 = new OASMessageStreamEventOneOf4();
        OASMessageStreamEventOneOf4 messageStreamEventOneOf44 = new OASMessageStreamEventOneOf4();

        System.assert(messageStreamEventOneOf41.equals(messageStreamEventOneOf42));
        System.assert(messageStreamEventOneOf42.equals(messageStreamEventOneOf41));
        System.assert(messageStreamEventOneOf43.equals(messageStreamEventOneOf44));
        System.assert(messageStreamEventOneOf44.equals(messageStreamEventOneOf43));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMessageStreamEventOneOf4 messageStreamEventOneOf41 = OASMessageStreamEventOneOf4.getExample();
        OASMessageStreamEventOneOf4 messageStreamEventOneOf42 = new OASMessageStreamEventOneOf4();

        System.assertEquals(false, messageStreamEventOneOf41.equals('foo'));
        System.assertEquals(false, messageStreamEventOneOf42.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMessageStreamEventOneOf4 messageStreamEventOneOf41 = OASMessageStreamEventOneOf4.getExample();
        OASMessageStreamEventOneOf4 messageStreamEventOneOf42 = new OASMessageStreamEventOneOf4();
        OASMessageStreamEventOneOf4 messageStreamEventOneOf43;

        System.assertEquals(false, messageStreamEventOneOf41.equals(messageStreamEventOneOf43));
        System.assertEquals(false, messageStreamEventOneOf42.equals(messageStreamEventOneOf43));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMessageStreamEventOneOf4 messageStreamEventOneOf41 = OASMessageStreamEventOneOf4.getExample();
        OASMessageStreamEventOneOf4 messageStreamEventOneOf42 = new OASMessageStreamEventOneOf4();

        System.assertEquals(messageStreamEventOneOf41.hashCode(), messageStreamEventOneOf41.hashCode());
        System.assertEquals(messageStreamEventOneOf42.hashCode(), messageStreamEventOneOf42.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMessageStreamEventOneOf4 messageStreamEventOneOf41 = OASMessageStreamEventOneOf4.getExample();
        OASMessageStreamEventOneOf4 messageStreamEventOneOf42 = OASMessageStreamEventOneOf4.getExample();
        OASMessageStreamEventOneOf4 messageStreamEventOneOf43 = new OASMessageStreamEventOneOf4();
        OASMessageStreamEventOneOf4 messageStreamEventOneOf44 = new OASMessageStreamEventOneOf4();

        System.assert(messageStreamEventOneOf41.equals(messageStreamEventOneOf42));
        System.assert(messageStreamEventOneOf43.equals(messageStreamEventOneOf44));
        System.assertEquals(messageStreamEventOneOf41.hashCode(), messageStreamEventOneOf42.hashCode());
        System.assertEquals(messageStreamEventOneOf43.hashCode(), messageStreamEventOneOf44.hashCode());
    }
}
