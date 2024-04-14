@isTest
private class OASAssistantsApiNamedToolChoiceTest {
    @isTest
    private static void equalsSameInstance() {
        OASAssistantsApiNamedToolChoice assistantsApiNamedToolChoice1 = OASAssistantsApiNamedToolChoice.getExample();
        OASAssistantsApiNamedToolChoice assistantsApiNamedToolChoice2 = assistantsApiNamedToolChoice1;
        OASAssistantsApiNamedToolChoice assistantsApiNamedToolChoice3 = new OASAssistantsApiNamedToolChoice();
        OASAssistantsApiNamedToolChoice assistantsApiNamedToolChoice4 = assistantsApiNamedToolChoice3;

        System.assert(assistantsApiNamedToolChoice1.equals(assistantsApiNamedToolChoice2));
        System.assert(assistantsApiNamedToolChoice2.equals(assistantsApiNamedToolChoice1));
        System.assert(assistantsApiNamedToolChoice1.equals(assistantsApiNamedToolChoice1));
        System.assert(assistantsApiNamedToolChoice3.equals(assistantsApiNamedToolChoice4));
        System.assert(assistantsApiNamedToolChoice4.equals(assistantsApiNamedToolChoice3));
        System.assert(assistantsApiNamedToolChoice3.equals(assistantsApiNamedToolChoice3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAssistantsApiNamedToolChoice assistantsApiNamedToolChoice1 = OASAssistantsApiNamedToolChoice.getExample();
        OASAssistantsApiNamedToolChoice assistantsApiNamedToolChoice2 = OASAssistantsApiNamedToolChoice.getExample();
        OASAssistantsApiNamedToolChoice assistantsApiNamedToolChoice3 = new OASAssistantsApiNamedToolChoice();
        OASAssistantsApiNamedToolChoice assistantsApiNamedToolChoice4 = new OASAssistantsApiNamedToolChoice();

        System.assert(assistantsApiNamedToolChoice1.equals(assistantsApiNamedToolChoice2));
        System.assert(assistantsApiNamedToolChoice2.equals(assistantsApiNamedToolChoice1));
        System.assert(assistantsApiNamedToolChoice3.equals(assistantsApiNamedToolChoice4));
        System.assert(assistantsApiNamedToolChoice4.equals(assistantsApiNamedToolChoice3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAssistantsApiNamedToolChoice assistantsApiNamedToolChoice1 = OASAssistantsApiNamedToolChoice.getExample();
        OASAssistantsApiNamedToolChoice assistantsApiNamedToolChoice2 = new OASAssistantsApiNamedToolChoice();

        System.assertEquals(false, assistantsApiNamedToolChoice1.equals('foo'));
        System.assertEquals(false, assistantsApiNamedToolChoice2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAssistantsApiNamedToolChoice assistantsApiNamedToolChoice1 = OASAssistantsApiNamedToolChoice.getExample();
        OASAssistantsApiNamedToolChoice assistantsApiNamedToolChoice2 = new OASAssistantsApiNamedToolChoice();
        OASAssistantsApiNamedToolChoice assistantsApiNamedToolChoice3;

        System.assertEquals(false, assistantsApiNamedToolChoice1.equals(assistantsApiNamedToolChoice3));
        System.assertEquals(false, assistantsApiNamedToolChoice2.equals(assistantsApiNamedToolChoice3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAssistantsApiNamedToolChoice assistantsApiNamedToolChoice1 = OASAssistantsApiNamedToolChoice.getExample();
        OASAssistantsApiNamedToolChoice assistantsApiNamedToolChoice2 = new OASAssistantsApiNamedToolChoice();

        System.assertEquals(assistantsApiNamedToolChoice1.hashCode(), assistantsApiNamedToolChoice1.hashCode());
        System.assertEquals(assistantsApiNamedToolChoice2.hashCode(), assistantsApiNamedToolChoice2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAssistantsApiNamedToolChoice assistantsApiNamedToolChoice1 = OASAssistantsApiNamedToolChoice.getExample();
        OASAssistantsApiNamedToolChoice assistantsApiNamedToolChoice2 = OASAssistantsApiNamedToolChoice.getExample();
        OASAssistantsApiNamedToolChoice assistantsApiNamedToolChoice3 = new OASAssistantsApiNamedToolChoice();
        OASAssistantsApiNamedToolChoice assistantsApiNamedToolChoice4 = new OASAssistantsApiNamedToolChoice();

        System.assert(assistantsApiNamedToolChoice1.equals(assistantsApiNamedToolChoice2));
        System.assert(assistantsApiNamedToolChoice3.equals(assistantsApiNamedToolChoice4));
        System.assertEquals(assistantsApiNamedToolChoice1.hashCode(), assistantsApiNamedToolChoice2.hashCode());
        System.assertEquals(assistantsApiNamedToolChoice3.hashCode(), assistantsApiNamedToolChoice4.hashCode());
    }
}
