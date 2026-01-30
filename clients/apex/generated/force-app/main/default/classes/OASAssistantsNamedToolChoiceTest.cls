@isTest
private class OASAssistantsNamedToolChoiceTest {
    @isTest
    private static void equalsSameInstance() {
        OASAssistantsNamedToolChoice assistantsNamedToolChoice1 = OASAssistantsNamedToolChoice.getExample();
        OASAssistantsNamedToolChoice assistantsNamedToolChoice2 = assistantsNamedToolChoice1;
        OASAssistantsNamedToolChoice assistantsNamedToolChoice3 = new OASAssistantsNamedToolChoice();
        OASAssistantsNamedToolChoice assistantsNamedToolChoice4 = assistantsNamedToolChoice3;

        System.assert(assistantsNamedToolChoice1.equals(assistantsNamedToolChoice2));
        System.assert(assistantsNamedToolChoice2.equals(assistantsNamedToolChoice1));
        System.assert(assistantsNamedToolChoice1.equals(assistantsNamedToolChoice1));
        System.assert(assistantsNamedToolChoice3.equals(assistantsNamedToolChoice4));
        System.assert(assistantsNamedToolChoice4.equals(assistantsNamedToolChoice3));
        System.assert(assistantsNamedToolChoice3.equals(assistantsNamedToolChoice3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAssistantsNamedToolChoice assistantsNamedToolChoice1 = OASAssistantsNamedToolChoice.getExample();
        OASAssistantsNamedToolChoice assistantsNamedToolChoice2 = OASAssistantsNamedToolChoice.getExample();
        OASAssistantsNamedToolChoice assistantsNamedToolChoice3 = new OASAssistantsNamedToolChoice();
        OASAssistantsNamedToolChoice assistantsNamedToolChoice4 = new OASAssistantsNamedToolChoice();

        System.assert(assistantsNamedToolChoice1.equals(assistantsNamedToolChoice2));
        System.assert(assistantsNamedToolChoice2.equals(assistantsNamedToolChoice1));
        System.assert(assistantsNamedToolChoice3.equals(assistantsNamedToolChoice4));
        System.assert(assistantsNamedToolChoice4.equals(assistantsNamedToolChoice3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAssistantsNamedToolChoice assistantsNamedToolChoice1 = OASAssistantsNamedToolChoice.getExample();
        OASAssistantsNamedToolChoice assistantsNamedToolChoice2 = new OASAssistantsNamedToolChoice();

        System.assertEquals(false, assistantsNamedToolChoice1.equals('foo'));
        System.assertEquals(false, assistantsNamedToolChoice2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAssistantsNamedToolChoice assistantsNamedToolChoice1 = OASAssistantsNamedToolChoice.getExample();
        OASAssistantsNamedToolChoice assistantsNamedToolChoice2 = new OASAssistantsNamedToolChoice();
        OASAssistantsNamedToolChoice assistantsNamedToolChoice3;

        System.assertEquals(false, assistantsNamedToolChoice1.equals(assistantsNamedToolChoice3));
        System.assertEquals(false, assistantsNamedToolChoice2.equals(assistantsNamedToolChoice3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAssistantsNamedToolChoice assistantsNamedToolChoice1 = OASAssistantsNamedToolChoice.getExample();
        OASAssistantsNamedToolChoice assistantsNamedToolChoice2 = new OASAssistantsNamedToolChoice();

        System.assertEquals(assistantsNamedToolChoice1.hashCode(), assistantsNamedToolChoice1.hashCode());
        System.assertEquals(assistantsNamedToolChoice2.hashCode(), assistantsNamedToolChoice2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAssistantsNamedToolChoice assistantsNamedToolChoice1 = OASAssistantsNamedToolChoice.getExample();
        OASAssistantsNamedToolChoice assistantsNamedToolChoice2 = OASAssistantsNamedToolChoice.getExample();
        OASAssistantsNamedToolChoice assistantsNamedToolChoice3 = new OASAssistantsNamedToolChoice();
        OASAssistantsNamedToolChoice assistantsNamedToolChoice4 = new OASAssistantsNamedToolChoice();

        System.assert(assistantsNamedToolChoice1.equals(assistantsNamedToolChoice2));
        System.assert(assistantsNamedToolChoice3.equals(assistantsNamedToolChoice4));
        System.assertEquals(assistantsNamedToolChoice1.hashCode(), assistantsNamedToolChoice2.hashCode());
        System.assertEquals(assistantsNamedToolChoice3.hashCode(), assistantsNamedToolChoice4.hashCode());
    }
}
