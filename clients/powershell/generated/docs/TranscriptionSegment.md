# TranscriptionSegment
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** | Unique identifier of the segment. | 
**Seek** | **Int32** | Seek offset of the segment. | 
**Start** | **Double** | Start time of the segment in seconds. | 
**VarEnd** | **Double** | End time of the segment in seconds. | 
**Text** | **String** | Text content of the segment. | 
**Tokens** | **Int32[]** | Array of token IDs for the text content. | 
**Temperature** | **Double** | Temperature parameter used for generating the segment. | 
**AvgLogprob** | **Double** | Average logprob of the segment. If the value is lower than -1, consider the logprobs failed. | 
**CompressionRatio** | **Double** | Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed. | 
**NoSpeechProb** | **Double** | Probability of no speech in the segment. If the value is higher than 1.0 and the &#x60;avg_logprob&#x60; is below -1, consider this segment silent. | 

## Examples

- Prepare the resource
```powershell
$TranscriptionSegment = Initialize-PSOpenAPIToolsTranscriptionSegment  -Id null `
 -Seek null `
 -Start null `
 -VarEnd null `
 -Text null `
 -Tokens null `
 -Temperature null `
 -AvgLogprob null `
 -CompressionRatio null `
 -NoSpeechProb null
```

- Convert the resource to JSON
```powershell
$TranscriptionSegment | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

