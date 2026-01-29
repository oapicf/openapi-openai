# Org.OpenAPITools.Model.TranscriptionSegment

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int** | Unique identifier of the segment. | 
**Seek** | **int** | Seek offset of the segment. | 
**Start** | **float** | Start time of the segment in seconds. | 
**End** | **float** | End time of the segment in seconds. | 
**Text** | **string** | Text content of the segment. | 
**Tokens** | **List&lt;int&gt;** | Array of token IDs for the text content. | 
**Temperature** | **float** | Temperature parameter used for generating the segment. | 
**AvgLogprob** | **float** | Average logprob of the segment. If the value is lower than -1, consider the logprobs failed. | 
**CompressionRatio** | **float** | Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed. | 
**NoSpeechProb** | **float** | Probability of no speech in the segment. If the value is higher than 1.0 and the &#x60;avg_logprob&#x60; is below -1, consider this segment silent. | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

