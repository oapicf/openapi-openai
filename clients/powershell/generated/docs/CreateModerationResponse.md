# CreateModerationResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | The unique identifier for the moderation request. | 
**Model** | **String** | The model used to generate the moderation results. | 
**Results** | [**CreateModerationResponseResultsInner[]**](CreateModerationResponseResultsInner.md) | A list of moderation objects. | 

## Examples

- Prepare the resource
```powershell
$CreateModerationResponse = Initialize-PSOpenAPIToolsCreateModerationResponse  -Id null `
 -Model null `
 -Results null
```

- Convert the resource to JSON
```powershell
$CreateModerationResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

