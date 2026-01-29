@isTest
private class OASMessageDeltaContentTextObjectTextTest {
    @isTest
    private static void equalsSameInstance() {
        OASMessageDeltaContentTextObjectText messageDeltaContentTextObjectText1 = OASMessageDeltaContentTextObjectText.getExample();
        OASMessageDeltaContentTextObjectText messageDeltaContentTextObjectText2 = messageDeltaContentTextObjectText1;
        OASMessageDeltaContentTextObjectText messageDeltaContentTextObjectText3 = new OASMessageDeltaContentTextObjectText();
        OASMessageDeltaContentTextObjectText messageDeltaContentTextObjectText4 = messageDeltaContentTextObjectText3;

        System.assert(messageDeltaContentTextObjectText1.equals(messageDeltaContentTextObjectText2));
        System.assert(messageDeltaContentTextObjectText2.equals(messageDeltaContentTextObjectText1));
        System.assert(messageDeltaContentTextObjectText1.equals(messageDeltaContentTextObjectText1));
        System.assert(messageDeltaContentTextObjectText3.equals(messageDeltaContentTextObjectText4));
        System.assert(messageDeltaContentTextObjectText4.equals(messageDeltaContentTextObjectText3));
        System.assert(messageDeltaContentTextObjectText3.equals(messageDeltaContentTextObjectText3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMessageDeltaContentTextObjectText messageDeltaContentTextObjectText1 = OASMessageDeltaContentTextObjectText.getExample();
        OASMessageDeltaContentTextObjectText messageDeltaContentTextObjectText2 = OASMessageDeltaContentTextObjectText.getExample();
        OASMessageDeltaContentTextObjectText messageDeltaContentTextObjectText3 = new OASMessageDeltaContentTextObjectText();
        OASMessageDeltaContentTextObjectText messageDeltaContentTextObjectText4 = new OASMessageDeltaContentTextObjectText();

        System.assert(messageDeltaContentTextObjectText1.equals(messageDeltaContentTextObjectText2));
        System.assert(messageDeltaContentTextObjectText2.equals(messageDeltaContentTextObjectText1));
        System.assert(messageDeltaContentTextObjectText3.equals(messageDeltaContentTextObjectText4));
        System.assert(messageDeltaContentTextObjectText4.equals(messageDeltaContentTextObjectText3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMessageDeltaContentTextObjectText messageDeltaContentTextObjectText1 = OASMessageDeltaContentTextObjectText.getExample();
        OASMessageDeltaContentTextObjectText messageDeltaContentTextObjectText2 = new OASMessageDeltaContentTextObjectText();

        System.assertEquals(false, messageDeltaContentTextObjectText1.equals('foo'));
        System.assertEquals(false, messageDeltaContentTextObjectText2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMessageDeltaContentTextObjectText messageDeltaContentTextObjectText1 = OASMessageDeltaContentTextObjectText.getExample();
        OASMessageDeltaContentTextObjectText messageDeltaContentTextObjectText2 = new OASMessageDeltaContentTextObjectText();
        OASMessageDeltaContentTextObjectText messageDeltaContentTextObjectText3;

        System.assertEquals(false, messageDeltaContentTextObjectText1.equals(messageDeltaContentTextObjectText3));
        System.assertEquals(false, messageDeltaContentTextObjectText2.equals(messageDeltaContentTextObjectText3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMessageDeltaContentTextObjectText messageDeltaContentTextObjectText1 = OASMessageDeltaContentTextObjectText.getExample();
        OASMessageDeltaContentTextObjectText messageDeltaContentTextObjectText2 = new OASMessageDeltaContentTextObjectText();

        System.assertEquals(messageDeltaContentTextObjectText1.hashCode(), messageDeltaContentTextObjectText1.hashCode());
        System.assertEquals(messageDeltaContentTextObjectText2.hashCode(), messageDeltaContentTextObjectText2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMessageDeltaContentTextObjectText messageDeltaContentTextObjectText1 = OASMessageDeltaContentTextObjectText.getExample();
        OASMessageDeltaContentTextObjectText messageDeltaContentTextObjectText2 = OASMessageDeltaContentTextObjectText.getExample();
        OASMessageDeltaContentTextObjectText messageDeltaContentTextObjectText3 = new OASMessageDeltaContentTextObjectText();
        OASMessageDeltaContentTextObjectText messageDeltaContentTextObjectText4 = new OASMessageDeltaContentTextObjectText();

        System.assert(messageDeltaContentTextObjectText1.equals(messageDeltaContentTextObjectText2));
        System.assert(messageDeltaContentTextObjectText3.equals(messageDeltaContentTextObjectText4));
        System.assertEquals(messageDeltaContentTextObjectText1.hashCode(), messageDeltaContentTextObjectText2.hashCode());
        System.assertEquals(messageDeltaContentTextObjectText3.hashCode(), messageDeltaContentTextObjectText4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASMessageDeltaContentTextObjectText messageDeltaContentTextObjectText = new OASMessageDeltaContentTextObjectText();
        System.assertEquals(new List<OASMessageDeltaContentTextObjectText>(), messageDeltaContentTextObjectText.annotations);
        System.assertEquals(null, messageDeltaContentTextObjectText.value);
    }
}
