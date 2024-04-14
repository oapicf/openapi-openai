@isTest
private class OASMessageStreamEventOneOf2Test {
    @isTest
    private static void equalsSameInstance() {
        OASMessageStreamEventOneOf2 messageStreamEventOneOf21 = OASMessageStreamEventOneOf2.getExample();
        OASMessageStreamEventOneOf2 messageStreamEventOneOf22 = messageStreamEventOneOf21;
        OASMessageStreamEventOneOf2 messageStreamEventOneOf23 = new OASMessageStreamEventOneOf2();
        OASMessageStreamEventOneOf2 messageStreamEventOneOf24 = messageStreamEventOneOf23;

        System.assert(messageStreamEventOneOf21.equals(messageStreamEventOneOf22));
        System.assert(messageStreamEventOneOf22.equals(messageStreamEventOneOf21));
        System.assert(messageStreamEventOneOf21.equals(messageStreamEventOneOf21));
        System.assert(messageStreamEventOneOf23.equals(messageStreamEventOneOf24));
        System.assert(messageStreamEventOneOf24.equals(messageStreamEventOneOf23));
        System.assert(messageStreamEventOneOf23.equals(messageStreamEventOneOf23));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMessageStreamEventOneOf2 messageStreamEventOneOf21 = OASMessageStreamEventOneOf2.getExample();
        OASMessageStreamEventOneOf2 messageStreamEventOneOf22 = OASMessageStreamEventOneOf2.getExample();
        OASMessageStreamEventOneOf2 messageStreamEventOneOf23 = new OASMessageStreamEventOneOf2();
        OASMessageStreamEventOneOf2 messageStreamEventOneOf24 = new OASMessageStreamEventOneOf2();

        System.assert(messageStreamEventOneOf21.equals(messageStreamEventOneOf22));
        System.assert(messageStreamEventOneOf22.equals(messageStreamEventOneOf21));
        System.assert(messageStreamEventOneOf23.equals(messageStreamEventOneOf24));
        System.assert(messageStreamEventOneOf24.equals(messageStreamEventOneOf23));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMessageStreamEventOneOf2 messageStreamEventOneOf21 = OASMessageStreamEventOneOf2.getExample();
        OASMessageStreamEventOneOf2 messageStreamEventOneOf22 = new OASMessageStreamEventOneOf2();

        System.assertEquals(false, messageStreamEventOneOf21.equals('foo'));
        System.assertEquals(false, messageStreamEventOneOf22.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMessageStreamEventOneOf2 messageStreamEventOneOf21 = OASMessageStreamEventOneOf2.getExample();
        OASMessageStreamEventOneOf2 messageStreamEventOneOf22 = new OASMessageStreamEventOneOf2();
        OASMessageStreamEventOneOf2 messageStreamEventOneOf23;

        System.assertEquals(false, messageStreamEventOneOf21.equals(messageStreamEventOneOf23));
        System.assertEquals(false, messageStreamEventOneOf22.equals(messageStreamEventOneOf23));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMessageStreamEventOneOf2 messageStreamEventOneOf21 = OASMessageStreamEventOneOf2.getExample();
        OASMessageStreamEventOneOf2 messageStreamEventOneOf22 = new OASMessageStreamEventOneOf2();

        System.assertEquals(messageStreamEventOneOf21.hashCode(), messageStreamEventOneOf21.hashCode());
        System.assertEquals(messageStreamEventOneOf22.hashCode(), messageStreamEventOneOf22.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMessageStreamEventOneOf2 messageStreamEventOneOf21 = OASMessageStreamEventOneOf2.getExample();
        OASMessageStreamEventOneOf2 messageStreamEventOneOf22 = OASMessageStreamEventOneOf2.getExample();
        OASMessageStreamEventOneOf2 messageStreamEventOneOf23 = new OASMessageStreamEventOneOf2();
        OASMessageStreamEventOneOf2 messageStreamEventOneOf24 = new OASMessageStreamEventOneOf2();

        System.assert(messageStreamEventOneOf21.equals(messageStreamEventOneOf22));
        System.assert(messageStreamEventOneOf23.equals(messageStreamEventOneOf24));
        System.assertEquals(messageStreamEventOneOf21.hashCode(), messageStreamEventOneOf22.hashCode());
        System.assertEquals(messageStreamEventOneOf23.hashCode(), messageStreamEventOneOf24.hashCode());
    }
}
