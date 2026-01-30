# UsageImagesResult
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **String** |  | 
**Images** | **Int32** | The number of images processed. | 
**NumModelRequests** | **Int32** | The count of requests made to the model. | 
**Source** | **String** | When &#x60;group_by&#x3D;source&#x60;, this field provides the source of the grouped usage result, possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60;. | [optional] 
**Size** | **String** | When &#x60;group_by&#x3D;size&#x60;, this field provides the image size of the grouped usage result. | [optional] 
**ProjectId** | **String** | When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result. | [optional] 
**UserId** | **String** | When &#x60;group_by&#x3D;user_id&#x60;, this field provides the user ID of the grouped usage result. | [optional] 
**ApiKeyId** | **String** | When &#x60;group_by&#x3D;api_key_id&#x60;, this field provides the API key ID of the grouped usage result. | [optional] 
**Model** | **String** | When &#x60;group_by&#x3D;model&#x60;, this field provides the model name of the grouped usage result. | [optional] 

## Examples

- Prepare the resource
```powershell
$UsageImagesResult = Initialize-PSOpenAPIToolsUsageImagesResult  -Object null `
 -Images null `
 -NumModelRequests null `
 -Source null `
 -Size null `
 -ProjectId null `
 -UserId null `
 -ApiKeyId null `
 -Model null
```

- Convert the resource to JSON
```powershell
$UsageImagesResult | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

