# OpenApiOpenAIClient::TranscriptionSegment

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | Unique identifier of the segment. |  |
| **seek** | **Integer** | Seek offset of the segment. |  |
| **start** | **Float** | Start time of the segment in seconds. |  |
| **_end** | **Float** | End time of the segment in seconds. |  |
| **text** | **String** | Text content of the segment. |  |
| **tokens** | **Array&lt;Integer&gt;** | Array of token IDs for the text content. |  |
| **temperature** | **Float** | Temperature parameter used for generating the segment. |  |
| **avg_logprob** | **Float** | Average logprob of the segment. If the value is lower than -1, consider the logprobs failed. |  |
| **compression_ratio** | **Float** | Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed. |  |
| **no_speech_prob** | **Float** | Probability of no speech in the segment. If the value is higher than 1.0 and the &#x60;avg_logprob&#x60; is below -1, consider this segment silent. |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::TranscriptionSegment.new(
  id: null,
  seek: null,
  start: null,
  _end: null,
  text: null,
  tokens: null,
  temperature: null,
  avg_logprob: null,
  compression_ratio: null,
  no_speech_prob: null
)
```

