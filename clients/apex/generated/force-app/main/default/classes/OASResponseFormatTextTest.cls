@isTest
private class OASResponseFormatTextTest {
    @isTest
    private static void equalsSameInstance() {
        OASResponseFormatText responseFormatText1 = OASResponseFormatText.getExample();
        OASResponseFormatText responseFormatText2 = responseFormatText1;
        OASResponseFormatText responseFormatText3 = new OASResponseFormatText();
        OASResponseFormatText responseFormatText4 = responseFormatText3;

        System.assert(responseFormatText1.equals(responseFormatText2));
        System.assert(responseFormatText2.equals(responseFormatText1));
        System.assert(responseFormatText1.equals(responseFormatText1));
        System.assert(responseFormatText3.equals(responseFormatText4));
        System.assert(responseFormatText4.equals(responseFormatText3));
        System.assert(responseFormatText3.equals(responseFormatText3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASResponseFormatText responseFormatText1 = OASResponseFormatText.getExample();
        OASResponseFormatText responseFormatText2 = OASResponseFormatText.getExample();
        OASResponseFormatText responseFormatText3 = new OASResponseFormatText();
        OASResponseFormatText responseFormatText4 = new OASResponseFormatText();

        System.assert(responseFormatText1.equals(responseFormatText2));
        System.assert(responseFormatText2.equals(responseFormatText1));
        System.assert(responseFormatText3.equals(responseFormatText4));
        System.assert(responseFormatText4.equals(responseFormatText3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASResponseFormatText responseFormatText1 = OASResponseFormatText.getExample();
        OASResponseFormatText responseFormatText2 = new OASResponseFormatText();

        System.assertEquals(false, responseFormatText1.equals('foo'));
        System.assertEquals(false, responseFormatText2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASResponseFormatText responseFormatText1 = OASResponseFormatText.getExample();
        OASResponseFormatText responseFormatText2 = new OASResponseFormatText();
        OASResponseFormatText responseFormatText3;

        System.assertEquals(false, responseFormatText1.equals(responseFormatText3));
        System.assertEquals(false, responseFormatText2.equals(responseFormatText3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASResponseFormatText responseFormatText1 = OASResponseFormatText.getExample();
        OASResponseFormatText responseFormatText2 = new OASResponseFormatText();

        System.assertEquals(responseFormatText1.hashCode(), responseFormatText1.hashCode());
        System.assertEquals(responseFormatText2.hashCode(), responseFormatText2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASResponseFormatText responseFormatText1 = OASResponseFormatText.getExample();
        OASResponseFormatText responseFormatText2 = OASResponseFormatText.getExample();
        OASResponseFormatText responseFormatText3 = new OASResponseFormatText();
        OASResponseFormatText responseFormatText4 = new OASResponseFormatText();

        System.assert(responseFormatText1.equals(responseFormatText2));
        System.assert(responseFormatText3.equals(responseFormatText4));
        System.assertEquals(responseFormatText1.hashCode(), responseFormatText2.hashCode());
        System.assertEquals(responseFormatText3.hashCode(), responseFormatText4.hashCode());
    }
}
