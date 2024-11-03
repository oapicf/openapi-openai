@isTest
private class OASMessageContentTextObjectTextTest {
    @isTest
    private static void equalsSameInstance() {
        OASMessageContentTextObjectText messageContentTextObjectText1 = OASMessageContentTextObjectText.getExample();
        OASMessageContentTextObjectText messageContentTextObjectText2 = messageContentTextObjectText1;
        OASMessageContentTextObjectText messageContentTextObjectText3 = new OASMessageContentTextObjectText();
        OASMessageContentTextObjectText messageContentTextObjectText4 = messageContentTextObjectText3;

        System.assert(messageContentTextObjectText1.equals(messageContentTextObjectText2));
        System.assert(messageContentTextObjectText2.equals(messageContentTextObjectText1));
        System.assert(messageContentTextObjectText1.equals(messageContentTextObjectText1));
        System.assert(messageContentTextObjectText3.equals(messageContentTextObjectText4));
        System.assert(messageContentTextObjectText4.equals(messageContentTextObjectText3));
        System.assert(messageContentTextObjectText3.equals(messageContentTextObjectText3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMessageContentTextObjectText messageContentTextObjectText1 = OASMessageContentTextObjectText.getExample();
        OASMessageContentTextObjectText messageContentTextObjectText2 = OASMessageContentTextObjectText.getExample();
        OASMessageContentTextObjectText messageContentTextObjectText3 = new OASMessageContentTextObjectText();
        OASMessageContentTextObjectText messageContentTextObjectText4 = new OASMessageContentTextObjectText();

        System.assert(messageContentTextObjectText1.equals(messageContentTextObjectText2));
        System.assert(messageContentTextObjectText2.equals(messageContentTextObjectText1));
        System.assert(messageContentTextObjectText3.equals(messageContentTextObjectText4));
        System.assert(messageContentTextObjectText4.equals(messageContentTextObjectText3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMessageContentTextObjectText messageContentTextObjectText1 = OASMessageContentTextObjectText.getExample();
        OASMessageContentTextObjectText messageContentTextObjectText2 = new OASMessageContentTextObjectText();

        System.assertEquals(false, messageContentTextObjectText1.equals('foo'));
        System.assertEquals(false, messageContentTextObjectText2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMessageContentTextObjectText messageContentTextObjectText1 = OASMessageContentTextObjectText.getExample();
        OASMessageContentTextObjectText messageContentTextObjectText2 = new OASMessageContentTextObjectText();
        OASMessageContentTextObjectText messageContentTextObjectText3;

        System.assertEquals(false, messageContentTextObjectText1.equals(messageContentTextObjectText3));
        System.assertEquals(false, messageContentTextObjectText2.equals(messageContentTextObjectText3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMessageContentTextObjectText messageContentTextObjectText1 = OASMessageContentTextObjectText.getExample();
        OASMessageContentTextObjectText messageContentTextObjectText2 = new OASMessageContentTextObjectText();

        System.assertEquals(messageContentTextObjectText1.hashCode(), messageContentTextObjectText1.hashCode());
        System.assertEquals(messageContentTextObjectText2.hashCode(), messageContentTextObjectText2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMessageContentTextObjectText messageContentTextObjectText1 = OASMessageContentTextObjectText.getExample();
        OASMessageContentTextObjectText messageContentTextObjectText2 = OASMessageContentTextObjectText.getExample();
        OASMessageContentTextObjectText messageContentTextObjectText3 = new OASMessageContentTextObjectText();
        OASMessageContentTextObjectText messageContentTextObjectText4 = new OASMessageContentTextObjectText();

        System.assert(messageContentTextObjectText1.equals(messageContentTextObjectText2));
        System.assert(messageContentTextObjectText3.equals(messageContentTextObjectText4));
        System.assertEquals(messageContentTextObjectText1.hashCode(), messageContentTextObjectText2.hashCode());
        System.assertEquals(messageContentTextObjectText3.hashCode(), messageContentTextObjectText4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASMessageContentTextObjectText messageContentTextObjectText = new OASMessageContentTextObjectText();
        System.assertEquals(new List<OASMessageContentTextObjectTextAnnot>(), messageContentTextObjectText.annotations);
        System.assertEquals(null, messageContentTextObjectText.value);
    }
}
