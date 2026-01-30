@isTest
private class OASCostsResultTest {
    @isTest
    private static void equalsSameInstance() {
        OASCostsResult costsResult1 = OASCostsResult.getExample();
        OASCostsResult costsResult2 = costsResult1;
        OASCostsResult costsResult3 = new OASCostsResult();
        OASCostsResult costsResult4 = costsResult3;

        System.assert(costsResult1.equals(costsResult2));
        System.assert(costsResult2.equals(costsResult1));
        System.assert(costsResult1.equals(costsResult1));
        System.assert(costsResult3.equals(costsResult4));
        System.assert(costsResult4.equals(costsResult3));
        System.assert(costsResult3.equals(costsResult3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCostsResult costsResult1 = OASCostsResult.getExample();
        OASCostsResult costsResult2 = OASCostsResult.getExample();
        OASCostsResult costsResult3 = new OASCostsResult();
        OASCostsResult costsResult4 = new OASCostsResult();

        System.assert(costsResult1.equals(costsResult2));
        System.assert(costsResult2.equals(costsResult1));
        System.assert(costsResult3.equals(costsResult4));
        System.assert(costsResult4.equals(costsResult3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCostsResult costsResult1 = OASCostsResult.getExample();
        OASCostsResult costsResult2 = new OASCostsResult();

        System.assertEquals(false, costsResult1.equals('foo'));
        System.assertEquals(false, costsResult2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCostsResult costsResult1 = OASCostsResult.getExample();
        OASCostsResult costsResult2 = new OASCostsResult();
        OASCostsResult costsResult3;

        System.assertEquals(false, costsResult1.equals(costsResult3));
        System.assertEquals(false, costsResult2.equals(costsResult3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCostsResult costsResult1 = OASCostsResult.getExample();
        OASCostsResult costsResult2 = new OASCostsResult();

        System.assertEquals(costsResult1.hashCode(), costsResult1.hashCode());
        System.assertEquals(costsResult2.hashCode(), costsResult2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCostsResult costsResult1 = OASCostsResult.getExample();
        OASCostsResult costsResult2 = OASCostsResult.getExample();
        OASCostsResult costsResult3 = new OASCostsResult();
        OASCostsResult costsResult4 = new OASCostsResult();

        System.assert(costsResult1.equals(costsResult2));
        System.assert(costsResult3.equals(costsResult4));
        System.assertEquals(costsResult1.hashCode(), costsResult2.hashCode());
        System.assertEquals(costsResult3.hashCode(), costsResult4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCostsResult costsResult = new OASCostsResult();
        Map<String, String> x-property-mappings = costsResult.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('lineItem', x-property-mappings.get('line_item'));
        System.assertEquals('projectId', x-property-mappings.get('project_id'));
    }
}
