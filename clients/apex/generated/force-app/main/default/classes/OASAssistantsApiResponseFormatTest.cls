@isTest
private class OASAssistantsApiResponseFormatTest {
    @isTest
    private static void equalsSameInstance() {
        OASAssistantsApiResponseFormat assistantsApiResponseFormat1 = OASAssistantsApiResponseFormat.getExample();
        OASAssistantsApiResponseFormat assistantsApiResponseFormat2 = assistantsApiResponseFormat1;
        OASAssistantsApiResponseFormat assistantsApiResponseFormat3 = new OASAssistantsApiResponseFormat();
        OASAssistantsApiResponseFormat assistantsApiResponseFormat4 = assistantsApiResponseFormat3;

        System.assert(assistantsApiResponseFormat1.equals(assistantsApiResponseFormat2));
        System.assert(assistantsApiResponseFormat2.equals(assistantsApiResponseFormat1));
        System.assert(assistantsApiResponseFormat1.equals(assistantsApiResponseFormat1));
        System.assert(assistantsApiResponseFormat3.equals(assistantsApiResponseFormat4));
        System.assert(assistantsApiResponseFormat4.equals(assistantsApiResponseFormat3));
        System.assert(assistantsApiResponseFormat3.equals(assistantsApiResponseFormat3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAssistantsApiResponseFormat assistantsApiResponseFormat1 = OASAssistantsApiResponseFormat.getExample();
        OASAssistantsApiResponseFormat assistantsApiResponseFormat2 = OASAssistantsApiResponseFormat.getExample();
        OASAssistantsApiResponseFormat assistantsApiResponseFormat3 = new OASAssistantsApiResponseFormat();
        OASAssistantsApiResponseFormat assistantsApiResponseFormat4 = new OASAssistantsApiResponseFormat();

        System.assert(assistantsApiResponseFormat1.equals(assistantsApiResponseFormat2));
        System.assert(assistantsApiResponseFormat2.equals(assistantsApiResponseFormat1));
        System.assert(assistantsApiResponseFormat3.equals(assistantsApiResponseFormat4));
        System.assert(assistantsApiResponseFormat4.equals(assistantsApiResponseFormat3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAssistantsApiResponseFormat assistantsApiResponseFormat1 = OASAssistantsApiResponseFormat.getExample();
        OASAssistantsApiResponseFormat assistantsApiResponseFormat2 = new OASAssistantsApiResponseFormat();

        System.assertEquals(false, assistantsApiResponseFormat1.equals('foo'));
        System.assertEquals(false, assistantsApiResponseFormat2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAssistantsApiResponseFormat assistantsApiResponseFormat1 = OASAssistantsApiResponseFormat.getExample();
        OASAssistantsApiResponseFormat assistantsApiResponseFormat2 = new OASAssistantsApiResponseFormat();
        OASAssistantsApiResponseFormat assistantsApiResponseFormat3;

        System.assertEquals(false, assistantsApiResponseFormat1.equals(assistantsApiResponseFormat3));
        System.assertEquals(false, assistantsApiResponseFormat2.equals(assistantsApiResponseFormat3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAssistantsApiResponseFormat assistantsApiResponseFormat1 = OASAssistantsApiResponseFormat.getExample();
        OASAssistantsApiResponseFormat assistantsApiResponseFormat2 = new OASAssistantsApiResponseFormat();

        System.assertEquals(assistantsApiResponseFormat1.hashCode(), assistantsApiResponseFormat1.hashCode());
        System.assertEquals(assistantsApiResponseFormat2.hashCode(), assistantsApiResponseFormat2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAssistantsApiResponseFormat assistantsApiResponseFormat1 = OASAssistantsApiResponseFormat.getExample();
        OASAssistantsApiResponseFormat assistantsApiResponseFormat2 = OASAssistantsApiResponseFormat.getExample();
        OASAssistantsApiResponseFormat assistantsApiResponseFormat3 = new OASAssistantsApiResponseFormat();
        OASAssistantsApiResponseFormat assistantsApiResponseFormat4 = new OASAssistantsApiResponseFormat();

        System.assert(assistantsApiResponseFormat1.equals(assistantsApiResponseFormat2));
        System.assert(assistantsApiResponseFormat3.equals(assistantsApiResponseFormat4));
        System.assertEquals(assistantsApiResponseFormat1.hashCode(), assistantsApiResponseFormat2.hashCode());
        System.assertEquals(assistantsApiResponseFormat3.hashCode(), assistantsApiResponseFormat4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAssistantsApiResponseFormat assistantsApiResponseFormat = new OASAssistantsApiResponseFormat();
        System.assertEquals(TypeEnum.TEXT, assistantsApiResponseFormat.type);
    }
}
