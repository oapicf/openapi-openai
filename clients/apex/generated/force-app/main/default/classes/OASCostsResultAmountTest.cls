@isTest
private class OASCostsResultAmountTest {
    @isTest
    private static void equalsSameInstance() {
        OASCostsResultAmount costsResultAmount1 = OASCostsResultAmount.getExample();
        OASCostsResultAmount costsResultAmount2 = costsResultAmount1;
        OASCostsResultAmount costsResultAmount3 = new OASCostsResultAmount();
        OASCostsResultAmount costsResultAmount4 = costsResultAmount3;

        System.assert(costsResultAmount1.equals(costsResultAmount2));
        System.assert(costsResultAmount2.equals(costsResultAmount1));
        System.assert(costsResultAmount1.equals(costsResultAmount1));
        System.assert(costsResultAmount3.equals(costsResultAmount4));
        System.assert(costsResultAmount4.equals(costsResultAmount3));
        System.assert(costsResultAmount3.equals(costsResultAmount3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCostsResultAmount costsResultAmount1 = OASCostsResultAmount.getExample();
        OASCostsResultAmount costsResultAmount2 = OASCostsResultAmount.getExample();
        OASCostsResultAmount costsResultAmount3 = new OASCostsResultAmount();
        OASCostsResultAmount costsResultAmount4 = new OASCostsResultAmount();

        System.assert(costsResultAmount1.equals(costsResultAmount2));
        System.assert(costsResultAmount2.equals(costsResultAmount1));
        System.assert(costsResultAmount3.equals(costsResultAmount4));
        System.assert(costsResultAmount4.equals(costsResultAmount3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCostsResultAmount costsResultAmount1 = OASCostsResultAmount.getExample();
        OASCostsResultAmount costsResultAmount2 = new OASCostsResultAmount();

        System.assertEquals(false, costsResultAmount1.equals('foo'));
        System.assertEquals(false, costsResultAmount2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCostsResultAmount costsResultAmount1 = OASCostsResultAmount.getExample();
        OASCostsResultAmount costsResultAmount2 = new OASCostsResultAmount();
        OASCostsResultAmount costsResultAmount3;

        System.assertEquals(false, costsResultAmount1.equals(costsResultAmount3));
        System.assertEquals(false, costsResultAmount2.equals(costsResultAmount3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCostsResultAmount costsResultAmount1 = OASCostsResultAmount.getExample();
        OASCostsResultAmount costsResultAmount2 = new OASCostsResultAmount();

        System.assertEquals(costsResultAmount1.hashCode(), costsResultAmount1.hashCode());
        System.assertEquals(costsResultAmount2.hashCode(), costsResultAmount2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCostsResultAmount costsResultAmount1 = OASCostsResultAmount.getExample();
        OASCostsResultAmount costsResultAmount2 = OASCostsResultAmount.getExample();
        OASCostsResultAmount costsResultAmount3 = new OASCostsResultAmount();
        OASCostsResultAmount costsResultAmount4 = new OASCostsResultAmount();

        System.assert(costsResultAmount1.equals(costsResultAmount2));
        System.assert(costsResultAmount3.equals(costsResultAmount4));
        System.assertEquals(costsResultAmount1.hashCode(), costsResultAmount2.hashCode());
        System.assertEquals(costsResultAmount3.hashCode(), costsResultAmount4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCostsResultAmount costsResultAmount = new OASCostsResultAmount();
        Map<String, String> x-property-mappings = costsResultAmount.getx-property-mappings();
        System.assertEquals('r_currency', x-property-mappings.get('currency'));
    }
}
