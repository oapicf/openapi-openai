# TranscriptionSegment


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** | Unique identifier of the segment. | [default to undefined]
**seek** | **number** | Seek offset of the segment. | [default to undefined]
**start** | **number** | Start time of the segment in seconds. | [default to undefined]
**end** | **number** | End time of the segment in seconds. | [default to undefined]
**text** | **string** | Text content of the segment. | [default to undefined]
**tokens** | **Array&lt;number&gt;** | Array of token IDs for the text content. | [default to undefined]
**temperature** | **number** | Temperature parameter used for generating the segment. | [default to undefined]
**avg_logprob** | **number** | Average logprob of the segment. If the value is lower than -1, consider the logprobs failed. | [default to undefined]
**compression_ratio** | **number** | Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed. | [default to undefined]
**no_speech_prob** | **number** | Probability of no speech in the segment. If the value is higher than 1.0 and the &#x60;avg_logprob&#x60; is below -1, consider this segment silent. | [default to undefined]

## Example

```typescript
import { TranscriptionSegment } from './api';

const instance: TranscriptionSegment = {
    id,
    seek,
    start,
    end,
    text,
    tokens,
    temperature,
    avg_logprob,
    compression_ratio,
    no_speech_prob,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
