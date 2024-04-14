@isTest
private class OASThreadStreamEventOneOfTest {
    @isTest
    private static void equalsSameInstance() {
        OASThreadStreamEventOneOf threadStreamEventOneOf1 = OASThreadStreamEventOneOf.getExample();
        OASThreadStreamEventOneOf threadStreamEventOneOf2 = threadStreamEventOneOf1;
        OASThreadStreamEventOneOf threadStreamEventOneOf3 = new OASThreadStreamEventOneOf();
        OASThreadStreamEventOneOf threadStreamEventOneOf4 = threadStreamEventOneOf3;

        System.assert(threadStreamEventOneOf1.equals(threadStreamEventOneOf2));
        System.assert(threadStreamEventOneOf2.equals(threadStreamEventOneOf1));
        System.assert(threadStreamEventOneOf1.equals(threadStreamEventOneOf1));
        System.assert(threadStreamEventOneOf3.equals(threadStreamEventOneOf4));
        System.assert(threadStreamEventOneOf4.equals(threadStreamEventOneOf3));
        System.assert(threadStreamEventOneOf3.equals(threadStreamEventOneOf3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASThreadStreamEventOneOf threadStreamEventOneOf1 = OASThreadStreamEventOneOf.getExample();
        OASThreadStreamEventOneOf threadStreamEventOneOf2 = OASThreadStreamEventOneOf.getExample();
        OASThreadStreamEventOneOf threadStreamEventOneOf3 = new OASThreadStreamEventOneOf();
        OASThreadStreamEventOneOf threadStreamEventOneOf4 = new OASThreadStreamEventOneOf();

        System.assert(threadStreamEventOneOf1.equals(threadStreamEventOneOf2));
        System.assert(threadStreamEventOneOf2.equals(threadStreamEventOneOf1));
        System.assert(threadStreamEventOneOf3.equals(threadStreamEventOneOf4));
        System.assert(threadStreamEventOneOf4.equals(threadStreamEventOneOf3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASThreadStreamEventOneOf threadStreamEventOneOf1 = OASThreadStreamEventOneOf.getExample();
        OASThreadStreamEventOneOf threadStreamEventOneOf2 = new OASThreadStreamEventOneOf();

        System.assertEquals(false, threadStreamEventOneOf1.equals('foo'));
        System.assertEquals(false, threadStreamEventOneOf2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASThreadStreamEventOneOf threadStreamEventOneOf1 = OASThreadStreamEventOneOf.getExample();
        OASThreadStreamEventOneOf threadStreamEventOneOf2 = new OASThreadStreamEventOneOf();
        OASThreadStreamEventOneOf threadStreamEventOneOf3;

        System.assertEquals(false, threadStreamEventOneOf1.equals(threadStreamEventOneOf3));
        System.assertEquals(false, threadStreamEventOneOf2.equals(threadStreamEventOneOf3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASThreadStreamEventOneOf threadStreamEventOneOf1 = OASThreadStreamEventOneOf.getExample();
        OASThreadStreamEventOneOf threadStreamEventOneOf2 = new OASThreadStreamEventOneOf();

        System.assertEquals(threadStreamEventOneOf1.hashCode(), threadStreamEventOneOf1.hashCode());
        System.assertEquals(threadStreamEventOneOf2.hashCode(), threadStreamEventOneOf2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASThreadStreamEventOneOf threadStreamEventOneOf1 = OASThreadStreamEventOneOf.getExample();
        OASThreadStreamEventOneOf threadStreamEventOneOf2 = OASThreadStreamEventOneOf.getExample();
        OASThreadStreamEventOneOf threadStreamEventOneOf3 = new OASThreadStreamEventOneOf();
        OASThreadStreamEventOneOf threadStreamEventOneOf4 = new OASThreadStreamEventOneOf();

        System.assert(threadStreamEventOneOf1.equals(threadStreamEventOneOf2));
        System.assert(threadStreamEventOneOf3.equals(threadStreamEventOneOf4));
        System.assertEquals(threadStreamEventOneOf1.hashCode(), threadStreamEventOneOf2.hashCode());
        System.assertEquals(threadStreamEventOneOf3.hashCode(), threadStreamEventOneOf4.hashCode());
    }
}
