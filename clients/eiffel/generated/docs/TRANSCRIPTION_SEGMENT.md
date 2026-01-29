# TRANSCRIPTION_SEGMENT

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **INTEGER_32** | Unique identifier of the segment. | [default to null]
**seek** | **INTEGER_32** | Seek offset of the segment. | [default to null]
**start** | **REAL_32** | Start time of the segment in seconds. | [default to null]
**var_end** | **REAL_32** | End time of the segment in seconds. | [default to null]
**text** | [**STRING_32**](STRING_32.md) | Text content of the segment. | [default to null]
**tokens** | **LIST [INTEGER_32]** | Array of token IDs for the text content. | [default to null]
**temperature** | **REAL_32** | Temperature parameter used for generating the segment. | [default to null]
**avg_logprob** | **REAL_32** | Average logprob of the segment. If the value is lower than -1, consider the logprobs failed. | [default to null]
**compression_ratio** | **REAL_32** | Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed. | [default to null]
**no_speech_prob** | **REAL_32** | Probability of no speech in the segment. If the value is higher than 1.0 and the &#x60;avg_logprob&#x60; is below -1, consider this segment silent. | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


