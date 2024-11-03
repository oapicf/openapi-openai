@isTest
private class OASMessageStreamEventOneOfTest {
    @isTest
    private static void equalsSameInstance() {
        OASMessageStreamEventOneOf messageStreamEventOneOf1 = OASMessageStreamEventOneOf.getExample();
        OASMessageStreamEventOneOf messageStreamEventOneOf2 = messageStreamEventOneOf1;
        OASMessageStreamEventOneOf messageStreamEventOneOf3 = new OASMessageStreamEventOneOf();
        OASMessageStreamEventOneOf messageStreamEventOneOf4 = messageStreamEventOneOf3;

        System.assert(messageStreamEventOneOf1.equals(messageStreamEventOneOf2));
        System.assert(messageStreamEventOneOf2.equals(messageStreamEventOneOf1));
        System.assert(messageStreamEventOneOf1.equals(messageStreamEventOneOf1));
        System.assert(messageStreamEventOneOf3.equals(messageStreamEventOneOf4));
        System.assert(messageStreamEventOneOf4.equals(messageStreamEventOneOf3));
        System.assert(messageStreamEventOneOf3.equals(messageStreamEventOneOf3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMessageStreamEventOneOf messageStreamEventOneOf1 = OASMessageStreamEventOneOf.getExample();
        OASMessageStreamEventOneOf messageStreamEventOneOf2 = OASMessageStreamEventOneOf.getExample();
        OASMessageStreamEventOneOf messageStreamEventOneOf3 = new OASMessageStreamEventOneOf();
        OASMessageStreamEventOneOf messageStreamEventOneOf4 = new OASMessageStreamEventOneOf();

        System.assert(messageStreamEventOneOf1.equals(messageStreamEventOneOf2));
        System.assert(messageStreamEventOneOf2.equals(messageStreamEventOneOf1));
        System.assert(messageStreamEventOneOf3.equals(messageStreamEventOneOf4));
        System.assert(messageStreamEventOneOf4.equals(messageStreamEventOneOf3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMessageStreamEventOneOf messageStreamEventOneOf1 = OASMessageStreamEventOneOf.getExample();
        OASMessageStreamEventOneOf messageStreamEventOneOf2 = new OASMessageStreamEventOneOf();

        System.assertEquals(false, messageStreamEventOneOf1.equals('foo'));
        System.assertEquals(false, messageStreamEventOneOf2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMessageStreamEventOneOf messageStreamEventOneOf1 = OASMessageStreamEventOneOf.getExample();
        OASMessageStreamEventOneOf messageStreamEventOneOf2 = new OASMessageStreamEventOneOf();
        OASMessageStreamEventOneOf messageStreamEventOneOf3;

        System.assertEquals(false, messageStreamEventOneOf1.equals(messageStreamEventOneOf3));
        System.assertEquals(false, messageStreamEventOneOf2.equals(messageStreamEventOneOf3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMessageStreamEventOneOf messageStreamEventOneOf1 = OASMessageStreamEventOneOf.getExample();
        OASMessageStreamEventOneOf messageStreamEventOneOf2 = new OASMessageStreamEventOneOf();

        System.assertEquals(messageStreamEventOneOf1.hashCode(), messageStreamEventOneOf1.hashCode());
        System.assertEquals(messageStreamEventOneOf2.hashCode(), messageStreamEventOneOf2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMessageStreamEventOneOf messageStreamEventOneOf1 = OASMessageStreamEventOneOf.getExample();
        OASMessageStreamEventOneOf messageStreamEventOneOf2 = OASMessageStreamEventOneOf.getExample();
        OASMessageStreamEventOneOf messageStreamEventOneOf3 = new OASMessageStreamEventOneOf();
        OASMessageStreamEventOneOf messageStreamEventOneOf4 = new OASMessageStreamEventOneOf();

        System.assert(messageStreamEventOneOf1.equals(messageStreamEventOneOf2));
        System.assert(messageStreamEventOneOf3.equals(messageStreamEventOneOf4));
        System.assertEquals(messageStreamEventOneOf1.hashCode(), messageStreamEventOneOf2.hashCode());
        System.assertEquals(messageStreamEventOneOf3.hashCode(), messageStreamEventOneOf4.hashCode());
    }
}
