@isTest
private class OASMessageStreamEventOneOf3Test {
    @isTest
    private static void equalsSameInstance() {
        OASMessageStreamEventOneOf3 messageStreamEventOneOf31 = OASMessageStreamEventOneOf3.getExample();
        OASMessageStreamEventOneOf3 messageStreamEventOneOf32 = messageStreamEventOneOf31;
        OASMessageStreamEventOneOf3 messageStreamEventOneOf33 = new OASMessageStreamEventOneOf3();
        OASMessageStreamEventOneOf3 messageStreamEventOneOf34 = messageStreamEventOneOf33;

        System.assert(messageStreamEventOneOf31.equals(messageStreamEventOneOf32));
        System.assert(messageStreamEventOneOf32.equals(messageStreamEventOneOf31));
        System.assert(messageStreamEventOneOf31.equals(messageStreamEventOneOf31));
        System.assert(messageStreamEventOneOf33.equals(messageStreamEventOneOf34));
        System.assert(messageStreamEventOneOf34.equals(messageStreamEventOneOf33));
        System.assert(messageStreamEventOneOf33.equals(messageStreamEventOneOf33));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMessageStreamEventOneOf3 messageStreamEventOneOf31 = OASMessageStreamEventOneOf3.getExample();
        OASMessageStreamEventOneOf3 messageStreamEventOneOf32 = OASMessageStreamEventOneOf3.getExample();
        OASMessageStreamEventOneOf3 messageStreamEventOneOf33 = new OASMessageStreamEventOneOf3();
        OASMessageStreamEventOneOf3 messageStreamEventOneOf34 = new OASMessageStreamEventOneOf3();

        System.assert(messageStreamEventOneOf31.equals(messageStreamEventOneOf32));
        System.assert(messageStreamEventOneOf32.equals(messageStreamEventOneOf31));
        System.assert(messageStreamEventOneOf33.equals(messageStreamEventOneOf34));
        System.assert(messageStreamEventOneOf34.equals(messageStreamEventOneOf33));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMessageStreamEventOneOf3 messageStreamEventOneOf31 = OASMessageStreamEventOneOf3.getExample();
        OASMessageStreamEventOneOf3 messageStreamEventOneOf32 = new OASMessageStreamEventOneOf3();

        System.assertEquals(false, messageStreamEventOneOf31.equals('foo'));
        System.assertEquals(false, messageStreamEventOneOf32.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMessageStreamEventOneOf3 messageStreamEventOneOf31 = OASMessageStreamEventOneOf3.getExample();
        OASMessageStreamEventOneOf3 messageStreamEventOneOf32 = new OASMessageStreamEventOneOf3();
        OASMessageStreamEventOneOf3 messageStreamEventOneOf33;

        System.assertEquals(false, messageStreamEventOneOf31.equals(messageStreamEventOneOf33));
        System.assertEquals(false, messageStreamEventOneOf32.equals(messageStreamEventOneOf33));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMessageStreamEventOneOf3 messageStreamEventOneOf31 = OASMessageStreamEventOneOf3.getExample();
        OASMessageStreamEventOneOf3 messageStreamEventOneOf32 = new OASMessageStreamEventOneOf3();

        System.assertEquals(messageStreamEventOneOf31.hashCode(), messageStreamEventOneOf31.hashCode());
        System.assertEquals(messageStreamEventOneOf32.hashCode(), messageStreamEventOneOf32.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMessageStreamEventOneOf3 messageStreamEventOneOf31 = OASMessageStreamEventOneOf3.getExample();
        OASMessageStreamEventOneOf3 messageStreamEventOneOf32 = OASMessageStreamEventOneOf3.getExample();
        OASMessageStreamEventOneOf3 messageStreamEventOneOf33 = new OASMessageStreamEventOneOf3();
        OASMessageStreamEventOneOf3 messageStreamEventOneOf34 = new OASMessageStreamEventOneOf3();

        System.assert(messageStreamEventOneOf31.equals(messageStreamEventOneOf32));
        System.assert(messageStreamEventOneOf33.equals(messageStreamEventOneOf34));
        System.assertEquals(messageStreamEventOneOf31.hashCode(), messageStreamEventOneOf32.hashCode());
        System.assertEquals(messageStreamEventOneOf33.hashCode(), messageStreamEventOneOf34.hashCode());
    }
}
