@isTest
private class OASAssistantsApiToolChoiceOptionTest {
    @isTest
    private static void equalsSameInstance() {
        OASAssistantsApiToolChoiceOption assistantsApiToolChoiceOption1 = OASAssistantsApiToolChoiceOption.getExample();
        OASAssistantsApiToolChoiceOption assistantsApiToolChoiceOption2 = assistantsApiToolChoiceOption1;
        OASAssistantsApiToolChoiceOption assistantsApiToolChoiceOption3 = new OASAssistantsApiToolChoiceOption();
        OASAssistantsApiToolChoiceOption assistantsApiToolChoiceOption4 = assistantsApiToolChoiceOption3;

        System.assert(assistantsApiToolChoiceOption1.equals(assistantsApiToolChoiceOption2));
        System.assert(assistantsApiToolChoiceOption2.equals(assistantsApiToolChoiceOption1));
        System.assert(assistantsApiToolChoiceOption1.equals(assistantsApiToolChoiceOption1));
        System.assert(assistantsApiToolChoiceOption3.equals(assistantsApiToolChoiceOption4));
        System.assert(assistantsApiToolChoiceOption4.equals(assistantsApiToolChoiceOption3));
        System.assert(assistantsApiToolChoiceOption3.equals(assistantsApiToolChoiceOption3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAssistantsApiToolChoiceOption assistantsApiToolChoiceOption1 = OASAssistantsApiToolChoiceOption.getExample();
        OASAssistantsApiToolChoiceOption assistantsApiToolChoiceOption2 = OASAssistantsApiToolChoiceOption.getExample();
        OASAssistantsApiToolChoiceOption assistantsApiToolChoiceOption3 = new OASAssistantsApiToolChoiceOption();
        OASAssistantsApiToolChoiceOption assistantsApiToolChoiceOption4 = new OASAssistantsApiToolChoiceOption();

        System.assert(assistantsApiToolChoiceOption1.equals(assistantsApiToolChoiceOption2));
        System.assert(assistantsApiToolChoiceOption2.equals(assistantsApiToolChoiceOption1));
        System.assert(assistantsApiToolChoiceOption3.equals(assistantsApiToolChoiceOption4));
        System.assert(assistantsApiToolChoiceOption4.equals(assistantsApiToolChoiceOption3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAssistantsApiToolChoiceOption assistantsApiToolChoiceOption1 = OASAssistantsApiToolChoiceOption.getExample();
        OASAssistantsApiToolChoiceOption assistantsApiToolChoiceOption2 = new OASAssistantsApiToolChoiceOption();

        System.assertEquals(false, assistantsApiToolChoiceOption1.equals('foo'));
        System.assertEquals(false, assistantsApiToolChoiceOption2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAssistantsApiToolChoiceOption assistantsApiToolChoiceOption1 = OASAssistantsApiToolChoiceOption.getExample();
        OASAssistantsApiToolChoiceOption assistantsApiToolChoiceOption2 = new OASAssistantsApiToolChoiceOption();
        OASAssistantsApiToolChoiceOption assistantsApiToolChoiceOption3;

        System.assertEquals(false, assistantsApiToolChoiceOption1.equals(assistantsApiToolChoiceOption3));
        System.assertEquals(false, assistantsApiToolChoiceOption2.equals(assistantsApiToolChoiceOption3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAssistantsApiToolChoiceOption assistantsApiToolChoiceOption1 = OASAssistantsApiToolChoiceOption.getExample();
        OASAssistantsApiToolChoiceOption assistantsApiToolChoiceOption2 = new OASAssistantsApiToolChoiceOption();

        System.assertEquals(assistantsApiToolChoiceOption1.hashCode(), assistantsApiToolChoiceOption1.hashCode());
        System.assertEquals(assistantsApiToolChoiceOption2.hashCode(), assistantsApiToolChoiceOption2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAssistantsApiToolChoiceOption assistantsApiToolChoiceOption1 = OASAssistantsApiToolChoiceOption.getExample();
        OASAssistantsApiToolChoiceOption assistantsApiToolChoiceOption2 = OASAssistantsApiToolChoiceOption.getExample();
        OASAssistantsApiToolChoiceOption assistantsApiToolChoiceOption3 = new OASAssistantsApiToolChoiceOption();
        OASAssistantsApiToolChoiceOption assistantsApiToolChoiceOption4 = new OASAssistantsApiToolChoiceOption();

        System.assert(assistantsApiToolChoiceOption1.equals(assistantsApiToolChoiceOption2));
        System.assert(assistantsApiToolChoiceOption3.equals(assistantsApiToolChoiceOption4));
        System.assertEquals(assistantsApiToolChoiceOption1.hashCode(), assistantsApiToolChoiceOption2.hashCode());
        System.assertEquals(assistantsApiToolChoiceOption3.hashCode(), assistantsApiToolChoiceOption4.hashCode());
    }
}
