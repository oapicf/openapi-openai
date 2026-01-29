# TranscriptionSegment
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **Integer** | Unique identifier of the segment. | [default to null] |
| **seek** | **Integer** | Seek offset of the segment. | [default to null] |
| **start** | **Float** | Start time of the segment in seconds. | [default to null] |
| **end** | **Float** | End time of the segment in seconds. | [default to null] |
| **text** | **String** | Text content of the segment. | [default to null] |
| **tokens** | **List** | Array of token IDs for the text content. | [default to null] |
| **temperature** | **Float** | Temperature parameter used for generating the segment. | [default to null] |
| **avg\_logprob** | **Float** | Average logprob of the segment. If the value is lower than -1, consider the logprobs failed. | [default to null] |
| **compression\_ratio** | **Float** | Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed. | [default to null] |
| **no\_speech\_prob** | **Float** | Probability of no speech in the segment. If the value is higher than 1.0 and the &#x60;avg_logprob&#x60; is below -1, consider this segment silent. | [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

