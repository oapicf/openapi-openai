@isTest
private class OASAudioResponseFormatTest {
    @isTest
    private static void allowableValues() {
        Set<OASAudioResponseFormat> expected = new Set<OASAudioResponseFormat>{
            OASAudioResponseFormat.JSON,
            OASAudioResponseFormat.TEXT,
            OASAudioResponseFormat.SRT,
            OASAudioResponseFormat.VERBOSE_JSON,
            OASAudioResponseFormat.VTT
        };
        Set<OASAudioResponseFormat> actual  = new Set<OASAudioResponseFormat>(OASAudioResponseFormat.values());
        System.assertEquals(expected, actual);
    }
}
