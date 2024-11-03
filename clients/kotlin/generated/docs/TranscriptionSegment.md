
# TranscriptionSegment

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int** | Unique identifier of the segment. |  |
| **seek** | **kotlin.Int** | Seek offset of the segment. |  |
| **start** | **kotlin.Float** | Start time of the segment in seconds. |  |
| **end** | **kotlin.Float** | End time of the segment in seconds. |  |
| **text** | **kotlin.String** | Text content of the segment. |  |
| **tokens** | **kotlin.collections.List&lt;kotlin.Int&gt;** | Array of token IDs for the text content. |  |
| **temperature** | **kotlin.Float** | Temperature parameter used for generating the segment. |  |
| **avgLogprob** | **kotlin.Float** | Average logprob of the segment. If the value is lower than -1, consider the logprobs failed. |  |
| **compressionRatio** | **kotlin.Float** | Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed. |  |
| **noSpeechProb** | **kotlin.Float** | Probability of no speech in the segment. If the value is higher than 1.0 and the &#x60;avg_logprob&#x60; is below -1, consider this segment silent. |  |



