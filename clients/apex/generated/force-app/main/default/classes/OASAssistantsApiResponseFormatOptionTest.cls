@isTest
private class OASAssistantsApiResponseFormatOptionTest {
    @isTest
    private static void equalsSameInstance() {
        OASAssistantsApiResponseFormatOption assistantsApiResponseFormatOption1 = OASAssistantsApiResponseFormatOption.getExample();
        OASAssistantsApiResponseFormatOption assistantsApiResponseFormatOption2 = assistantsApiResponseFormatOption1;
        OASAssistantsApiResponseFormatOption assistantsApiResponseFormatOption3 = new OASAssistantsApiResponseFormatOption();
        OASAssistantsApiResponseFormatOption assistantsApiResponseFormatOption4 = assistantsApiResponseFormatOption3;

        System.assert(assistantsApiResponseFormatOption1.equals(assistantsApiResponseFormatOption2));
        System.assert(assistantsApiResponseFormatOption2.equals(assistantsApiResponseFormatOption1));
        System.assert(assistantsApiResponseFormatOption1.equals(assistantsApiResponseFormatOption1));
        System.assert(assistantsApiResponseFormatOption3.equals(assistantsApiResponseFormatOption4));
        System.assert(assistantsApiResponseFormatOption4.equals(assistantsApiResponseFormatOption3));
        System.assert(assistantsApiResponseFormatOption3.equals(assistantsApiResponseFormatOption3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAssistantsApiResponseFormatOption assistantsApiResponseFormatOption1 = OASAssistantsApiResponseFormatOption.getExample();
        OASAssistantsApiResponseFormatOption assistantsApiResponseFormatOption2 = OASAssistantsApiResponseFormatOption.getExample();
        OASAssistantsApiResponseFormatOption assistantsApiResponseFormatOption3 = new OASAssistantsApiResponseFormatOption();
        OASAssistantsApiResponseFormatOption assistantsApiResponseFormatOption4 = new OASAssistantsApiResponseFormatOption();

        System.assert(assistantsApiResponseFormatOption1.equals(assistantsApiResponseFormatOption2));
        System.assert(assistantsApiResponseFormatOption2.equals(assistantsApiResponseFormatOption1));
        System.assert(assistantsApiResponseFormatOption3.equals(assistantsApiResponseFormatOption4));
        System.assert(assistantsApiResponseFormatOption4.equals(assistantsApiResponseFormatOption3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAssistantsApiResponseFormatOption assistantsApiResponseFormatOption1 = OASAssistantsApiResponseFormatOption.getExample();
        OASAssistantsApiResponseFormatOption assistantsApiResponseFormatOption2 = new OASAssistantsApiResponseFormatOption();

        System.assertEquals(false, assistantsApiResponseFormatOption1.equals('foo'));
        System.assertEquals(false, assistantsApiResponseFormatOption2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAssistantsApiResponseFormatOption assistantsApiResponseFormatOption1 = OASAssistantsApiResponseFormatOption.getExample();
        OASAssistantsApiResponseFormatOption assistantsApiResponseFormatOption2 = new OASAssistantsApiResponseFormatOption();
        OASAssistantsApiResponseFormatOption assistantsApiResponseFormatOption3;

        System.assertEquals(false, assistantsApiResponseFormatOption1.equals(assistantsApiResponseFormatOption3));
        System.assertEquals(false, assistantsApiResponseFormatOption2.equals(assistantsApiResponseFormatOption3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAssistantsApiResponseFormatOption assistantsApiResponseFormatOption1 = OASAssistantsApiResponseFormatOption.getExample();
        OASAssistantsApiResponseFormatOption assistantsApiResponseFormatOption2 = new OASAssistantsApiResponseFormatOption();

        System.assertEquals(assistantsApiResponseFormatOption1.hashCode(), assistantsApiResponseFormatOption1.hashCode());
        System.assertEquals(assistantsApiResponseFormatOption2.hashCode(), assistantsApiResponseFormatOption2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAssistantsApiResponseFormatOption assistantsApiResponseFormatOption1 = OASAssistantsApiResponseFormatOption.getExample();
        OASAssistantsApiResponseFormatOption assistantsApiResponseFormatOption2 = OASAssistantsApiResponseFormatOption.getExample();
        OASAssistantsApiResponseFormatOption assistantsApiResponseFormatOption3 = new OASAssistantsApiResponseFormatOption();
        OASAssistantsApiResponseFormatOption assistantsApiResponseFormatOption4 = new OASAssistantsApiResponseFormatOption();

        System.assert(assistantsApiResponseFormatOption1.equals(assistantsApiResponseFormatOption2));
        System.assert(assistantsApiResponseFormatOption3.equals(assistantsApiResponseFormatOption4));
        System.assertEquals(assistantsApiResponseFormatOption1.hashCode(), assistantsApiResponseFormatOption2.hashCode());
        System.assertEquals(assistantsApiResponseFormatOption3.hashCode(), assistantsApiResponseFormatOption4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAssistantsApiResponseFormatOption assistantsApiResponseFormatOption = new OASAssistantsApiResponseFormatOption();
        System.assertEquals(TypeEnum.TEXT, assistantsApiResponseFormatOption.type);
    }
}
