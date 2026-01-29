# # TranscriptionSegment

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Unique identifier of the segment. |
**seek** | **int** | Seek offset of the segment. |
**start** | **float** | Start time of the segment in seconds. |
**end** | **float** | End time of the segment in seconds. |
**text** | **string** | Text content of the segment. |
**tokens** | **int[]** | Array of token IDs for the text content. |
**temperature** | **float** | Temperature parameter used for generating the segment. |
**avg_logprob** | **float** | Average logprob of the segment. If the value is lower than -1, consider the logprobs failed. |
**compression_ratio** | **float** | Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed. |
**no_speech_prob** | **float** | Probability of no speech in the segment. If the value is higher than 1.0 and the &#x60;avg_logprob&#x60; is below -1, consider this segment silent. |

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
