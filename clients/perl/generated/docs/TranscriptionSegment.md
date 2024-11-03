# WWW::OpenAPIClient::Object::TranscriptionSegment

## Load the model package
```perl
use WWW::OpenAPIClient::Object::TranscriptionSegment;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Unique identifier of the segment. | 
**seek** | **int** | Seek offset of the segment. | 
**start** | **double** | Start time of the segment in seconds. | 
**end** | **double** | End time of the segment in seconds. | 
**text** | **string** | Text content of the segment. | 
**tokens** | **ARRAY[int]** | Array of token IDs for the text content. | 
**temperature** | **double** | Temperature parameter used for generating the segment. | 
**avg_logprob** | **double** | Average logprob of the segment. If the value is lower than -1, consider the logprobs failed. | 
**compression_ratio** | **double** | Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed. | 
**no_speech_prob** | **double** | Probability of no speech in the segment. If the value is higher than 1.0 and the &#x60;avg_logprob&#x60; is below -1, consider this segment silent. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


