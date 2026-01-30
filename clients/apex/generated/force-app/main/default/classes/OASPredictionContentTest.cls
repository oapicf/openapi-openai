@isTest
private class OASPredictionContentTest {
    @isTest
    private static void equalsSameInstance() {
        OASPredictionContent predictionContent1 = OASPredictionContent.getExample();
        OASPredictionContent predictionContent2 = predictionContent1;
        OASPredictionContent predictionContent3 = new OASPredictionContent();
        OASPredictionContent predictionContent4 = predictionContent3;

        System.assert(predictionContent1.equals(predictionContent2));
        System.assert(predictionContent2.equals(predictionContent1));
        System.assert(predictionContent1.equals(predictionContent1));
        System.assert(predictionContent3.equals(predictionContent4));
        System.assert(predictionContent4.equals(predictionContent3));
        System.assert(predictionContent3.equals(predictionContent3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPredictionContent predictionContent1 = OASPredictionContent.getExample();
        OASPredictionContent predictionContent2 = OASPredictionContent.getExample();
        OASPredictionContent predictionContent3 = new OASPredictionContent();
        OASPredictionContent predictionContent4 = new OASPredictionContent();

        System.assert(predictionContent1.equals(predictionContent2));
        System.assert(predictionContent2.equals(predictionContent1));
        System.assert(predictionContent3.equals(predictionContent4));
        System.assert(predictionContent4.equals(predictionContent3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPredictionContent predictionContent1 = OASPredictionContent.getExample();
        OASPredictionContent predictionContent2 = new OASPredictionContent();

        System.assertEquals(false, predictionContent1.equals('foo'));
        System.assertEquals(false, predictionContent2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPredictionContent predictionContent1 = OASPredictionContent.getExample();
        OASPredictionContent predictionContent2 = new OASPredictionContent();
        OASPredictionContent predictionContent3;

        System.assertEquals(false, predictionContent1.equals(predictionContent3));
        System.assertEquals(false, predictionContent2.equals(predictionContent3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPredictionContent predictionContent1 = OASPredictionContent.getExample();
        OASPredictionContent predictionContent2 = new OASPredictionContent();

        System.assertEquals(predictionContent1.hashCode(), predictionContent1.hashCode());
        System.assertEquals(predictionContent2.hashCode(), predictionContent2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPredictionContent predictionContent1 = OASPredictionContent.getExample();
        OASPredictionContent predictionContent2 = OASPredictionContent.getExample();
        OASPredictionContent predictionContent3 = new OASPredictionContent();
        OASPredictionContent predictionContent4 = new OASPredictionContent();

        System.assert(predictionContent1.equals(predictionContent2));
        System.assert(predictionContent3.equals(predictionContent4));
        System.assertEquals(predictionContent1.hashCode(), predictionContent2.hashCode());
        System.assertEquals(predictionContent3.hashCode(), predictionContent4.hashCode());
    }
}
