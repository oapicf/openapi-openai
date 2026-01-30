# UsageTimeBucketResultInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **String** |  | 
**InputTokens** | **Int32** | The aggregated number of input tokens used. | 
**InputCachedTokens** | **Int32** | The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens. | [optional] 
**OutputTokens** | **Int32** | The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens. | 
**InputAudioTokens** | **Int32** | The aggregated number of audio input tokens used, including cached tokens. | [optional] 
**OutputAudioTokens** | **Int32** | The aggregated number of audio output tokens used. | [optional] 
**NumModelRequests** | **Int32** | The count of requests made to the model. | 
**ProjectId** | **String** | When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped costs result. | [optional] 
**UserId** | **String** | When &#x60;group_by&#x3D;user_id&#x60;, this field provides the user ID of the grouped usage result. | [optional] 
**ApiKeyId** | **String** | When &#x60;group_by&#x3D;api_key_id&#x60;, this field provides the API key ID of the grouped usage result. | [optional] 
**Model** | **String** | When &#x60;group_by&#x3D;model&#x60;, this field provides the model name of the grouped usage result. | [optional] 
**Batch** | **Boolean** | When &#x60;group_by&#x3D;batch&#x60;, this field tells whether the grouped usage result is batch or not. | [optional] 
**Images** | **Int32** | The number of images processed. | 
**Source** | **String** | When &#x60;group_by&#x3D;source&#x60;, this field provides the source of the grouped usage result, possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60;. | [optional] 
**Size** | **String** | When &#x60;group_by&#x3D;size&#x60;, this field provides the image size of the grouped usage result. | [optional] 
**Characters** | **Int32** | The number of characters processed. | 
**Seconds** | **Int32** | The number of seconds processed. | 
**UsageBytes** | **Int32** | The vector stores usage in bytes. | 
**Sessions** | **Int32** | The number of code interpreter sessions. | 
**Amount** | [**CostsResultAmount**](CostsResultAmount.md) |  | [optional] 
**LineItem** | **String** | When &#x60;group_by&#x3D;line_item&#x60;, this field provides the line item of the grouped costs result. | [optional] 

## Examples

- Prepare the resource
```powershell
$UsageTimeBucketResultInner = Initialize-PSOpenAPIToolsUsageTimeBucketResultInner  -Object null `
 -InputTokens null `
 -InputCachedTokens null `
 -OutputTokens null `
 -InputAudioTokens null `
 -OutputAudioTokens null `
 -NumModelRequests null `
 -ProjectId null `
 -UserId null `
 -ApiKeyId null `
 -Model null `
 -Batch null `
 -Images null `
 -Source null `
 -Size null `
 -Characters null `
 -Seconds null `
 -UsageBytes null `
 -Sessions null `
 -Amount null `
 -LineItem null
```

- Convert the resource to JSON
```powershell
$UsageTimeBucketResultInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

