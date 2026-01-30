@isTest
private class OASPredictionContentContentTest {
    @isTest
    private static void equalsSameInstance() {
        OASPredictionContentContent predictionContentContent1 = OASPredictionContentContent.getExample();
        OASPredictionContentContent predictionContentContent2 = predictionContentContent1;
        OASPredictionContentContent predictionContentContent3 = new OASPredictionContentContent();
        OASPredictionContentContent predictionContentContent4 = predictionContentContent3;

        System.assert(predictionContentContent1.equals(predictionContentContent2));
        System.assert(predictionContentContent2.equals(predictionContentContent1));
        System.assert(predictionContentContent1.equals(predictionContentContent1));
        System.assert(predictionContentContent3.equals(predictionContentContent4));
        System.assert(predictionContentContent4.equals(predictionContentContent3));
        System.assert(predictionContentContent3.equals(predictionContentContent3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPredictionContentContent predictionContentContent1 = OASPredictionContentContent.getExample();
        OASPredictionContentContent predictionContentContent2 = OASPredictionContentContent.getExample();
        OASPredictionContentContent predictionContentContent3 = new OASPredictionContentContent();
        OASPredictionContentContent predictionContentContent4 = new OASPredictionContentContent();

        System.assert(predictionContentContent1.equals(predictionContentContent2));
        System.assert(predictionContentContent2.equals(predictionContentContent1));
        System.assert(predictionContentContent3.equals(predictionContentContent4));
        System.assert(predictionContentContent4.equals(predictionContentContent3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPredictionContentContent predictionContentContent1 = OASPredictionContentContent.getExample();
        OASPredictionContentContent predictionContentContent2 = new OASPredictionContentContent();

        System.assertEquals(false, predictionContentContent1.equals('foo'));
        System.assertEquals(false, predictionContentContent2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPredictionContentContent predictionContentContent1 = OASPredictionContentContent.getExample();
        OASPredictionContentContent predictionContentContent2 = new OASPredictionContentContent();
        OASPredictionContentContent predictionContentContent3;

        System.assertEquals(false, predictionContentContent1.equals(predictionContentContent3));
        System.assertEquals(false, predictionContentContent2.equals(predictionContentContent3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPredictionContentContent predictionContentContent1 = OASPredictionContentContent.getExample();
        OASPredictionContentContent predictionContentContent2 = new OASPredictionContentContent();

        System.assertEquals(predictionContentContent1.hashCode(), predictionContentContent1.hashCode());
        System.assertEquals(predictionContentContent2.hashCode(), predictionContentContent2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPredictionContentContent predictionContentContent1 = OASPredictionContentContent.getExample();
        OASPredictionContentContent predictionContentContent2 = OASPredictionContentContent.getExample();
        OASPredictionContentContent predictionContentContent3 = new OASPredictionContentContent();
        OASPredictionContentContent predictionContentContent4 = new OASPredictionContentContent();

        System.assert(predictionContentContent1.equals(predictionContentContent2));
        System.assert(predictionContentContent3.equals(predictionContentContent4));
        System.assertEquals(predictionContentContent1.hashCode(), predictionContentContent2.hashCode());
        System.assertEquals(predictionContentContent3.hashCode(), predictionContentContent4.hashCode());
    }
}
