# TranscriptionSegment


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`id`** | **`Int64`** | Unique identifier of the segment. | [default to nothing]
**`seek`** | **`Int64`** | Seek offset of the segment. | [default to nothing]
**`start`** | **`Float32`** | Start time of the segment in seconds. | [default to nothing]
**`var&quot;end&quot;`** | **`Float32`** | End time of the segment in seconds. | [default to nothing]
**`text`** | **`String`** | Text content of the segment. | [default to nothing]
**`tokens`** | **`Vector{Int64}`** | Array of token IDs for the text content. | [default to nothing]
**`temperature`** | **`Float32`** | Temperature parameter used for generating the segment. | [default to nothing]
**`avg_logprob`** | **`Float32`** | Average logprob of the segment. If the value is lower than -1, consider the logprobs failed. | [default to nothing]
**`compression_ratio`** | **`Float32`** | Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed. | [default to nothing]
**`no_speech_prob`** | **`Float32`** | Probability of no speech in the segment. If the value is higher than 1.0 and the &#x60;avg_logprob&#x60; is below -1, consider this segment silent. | [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


