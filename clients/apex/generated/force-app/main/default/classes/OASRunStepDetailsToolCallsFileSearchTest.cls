@isTest
private class OASRunStepDetailsToolCallsFileSearchTest {
    @isTest
    private static void equalsSameInstance() {
        OASRunStepDetailsToolCallsFileSearch runStepDetailsToolCallsFileSearchResultObjectContentInner1 = OASRunStepDetailsToolCallsFileSearch.getExample();
        OASRunStepDetailsToolCallsFileSearch runStepDetailsToolCallsFileSearchResultObjectContentInner2 = runStepDetailsToolCallsFileSearchResultObjectContentInner1;
        OASRunStepDetailsToolCallsFileSearch runStepDetailsToolCallsFileSearchResultObjectContentInner3 = new OASRunStepDetailsToolCallsFileSearch();
        OASRunStepDetailsToolCallsFileSearch runStepDetailsToolCallsFileSearchResultObjectContentInner4 = runStepDetailsToolCallsFileSearchResultObjectContentInner3;

        System.assert(runStepDetailsToolCallsFileSearchResultObjectContentInner1.equals(runStepDetailsToolCallsFileSearchResultObjectContentInner2));
        System.assert(runStepDetailsToolCallsFileSearchResultObjectContentInner2.equals(runStepDetailsToolCallsFileSearchResultObjectContentInner1));
        System.assert(runStepDetailsToolCallsFileSearchResultObjectContentInner1.equals(runStepDetailsToolCallsFileSearchResultObjectContentInner1));
        System.assert(runStepDetailsToolCallsFileSearchResultObjectContentInner3.equals(runStepDetailsToolCallsFileSearchResultObjectContentInner4));
        System.assert(runStepDetailsToolCallsFileSearchResultObjectContentInner4.equals(runStepDetailsToolCallsFileSearchResultObjectContentInner3));
        System.assert(runStepDetailsToolCallsFileSearchResultObjectContentInner3.equals(runStepDetailsToolCallsFileSearchResultObjectContentInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRunStepDetailsToolCallsFileSearch runStepDetailsToolCallsFileSearchResultObjectContentInner1 = OASRunStepDetailsToolCallsFileSearch.getExample();
        OASRunStepDetailsToolCallsFileSearch runStepDetailsToolCallsFileSearchResultObjectContentInner2 = OASRunStepDetailsToolCallsFileSearch.getExample();
        OASRunStepDetailsToolCallsFileSearch runStepDetailsToolCallsFileSearchResultObjectContentInner3 = new OASRunStepDetailsToolCallsFileSearch();
        OASRunStepDetailsToolCallsFileSearch runStepDetailsToolCallsFileSearchResultObjectContentInner4 = new OASRunStepDetailsToolCallsFileSearch();

        System.assert(runStepDetailsToolCallsFileSearchResultObjectContentInner1.equals(runStepDetailsToolCallsFileSearchResultObjectContentInner2));
        System.assert(runStepDetailsToolCallsFileSearchResultObjectContentInner2.equals(runStepDetailsToolCallsFileSearchResultObjectContentInner1));
        System.assert(runStepDetailsToolCallsFileSearchResultObjectContentInner3.equals(runStepDetailsToolCallsFileSearchResultObjectContentInner4));
        System.assert(runStepDetailsToolCallsFileSearchResultObjectContentInner4.equals(runStepDetailsToolCallsFileSearchResultObjectContentInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRunStepDetailsToolCallsFileSearch runStepDetailsToolCallsFileSearchResultObjectContentInner1 = OASRunStepDetailsToolCallsFileSearch.getExample();
        OASRunStepDetailsToolCallsFileSearch runStepDetailsToolCallsFileSearchResultObjectContentInner2 = new OASRunStepDetailsToolCallsFileSearch();

        System.assertEquals(false, runStepDetailsToolCallsFileSearchResultObjectContentInner1.equals('foo'));
        System.assertEquals(false, runStepDetailsToolCallsFileSearchResultObjectContentInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRunStepDetailsToolCallsFileSearch runStepDetailsToolCallsFileSearchResultObjectContentInner1 = OASRunStepDetailsToolCallsFileSearch.getExample();
        OASRunStepDetailsToolCallsFileSearch runStepDetailsToolCallsFileSearchResultObjectContentInner2 = new OASRunStepDetailsToolCallsFileSearch();
        OASRunStepDetailsToolCallsFileSearch runStepDetailsToolCallsFileSearchResultObjectContentInner3;

        System.assertEquals(false, runStepDetailsToolCallsFileSearchResultObjectContentInner1.equals(runStepDetailsToolCallsFileSearchResultObjectContentInner3));
        System.assertEquals(false, runStepDetailsToolCallsFileSearchResultObjectContentInner2.equals(runStepDetailsToolCallsFileSearchResultObjectContentInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRunStepDetailsToolCallsFileSearch runStepDetailsToolCallsFileSearchResultObjectContentInner1 = OASRunStepDetailsToolCallsFileSearch.getExample();
        OASRunStepDetailsToolCallsFileSearch runStepDetailsToolCallsFileSearchResultObjectContentInner2 = new OASRunStepDetailsToolCallsFileSearch();

        System.assertEquals(runStepDetailsToolCallsFileSearchResultObjectContentInner1.hashCode(), runStepDetailsToolCallsFileSearchResultObjectContentInner1.hashCode());
        System.assertEquals(runStepDetailsToolCallsFileSearchResultObjectContentInner2.hashCode(), runStepDetailsToolCallsFileSearchResultObjectContentInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRunStepDetailsToolCallsFileSearch runStepDetailsToolCallsFileSearchResultObjectContentInner1 = OASRunStepDetailsToolCallsFileSearch.getExample();
        OASRunStepDetailsToolCallsFileSearch runStepDetailsToolCallsFileSearchResultObjectContentInner2 = OASRunStepDetailsToolCallsFileSearch.getExample();
        OASRunStepDetailsToolCallsFileSearch runStepDetailsToolCallsFileSearchResultObjectContentInner3 = new OASRunStepDetailsToolCallsFileSearch();
        OASRunStepDetailsToolCallsFileSearch runStepDetailsToolCallsFileSearchResultObjectContentInner4 = new OASRunStepDetailsToolCallsFileSearch();

        System.assert(runStepDetailsToolCallsFileSearchResultObjectContentInner1.equals(runStepDetailsToolCallsFileSearchResultObjectContentInner2));
        System.assert(runStepDetailsToolCallsFileSearchResultObjectContentInner3.equals(runStepDetailsToolCallsFileSearchResultObjectContentInner4));
        System.assertEquals(runStepDetailsToolCallsFileSearchResultObjectContentInner1.hashCode(), runStepDetailsToolCallsFileSearchResultObjectContentInner2.hashCode());
        System.assertEquals(runStepDetailsToolCallsFileSearchResultObjectContentInner3.hashCode(), runStepDetailsToolCallsFileSearchResultObjectContentInner4.hashCode());
    }
}
