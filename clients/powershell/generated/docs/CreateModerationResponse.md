# CreateModerationResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** |  | 
**Model** | **String** |  | 
**Results** | [**CreateModerationResponseResultsInner[]**](CreateModerationResponseResultsInner.md) |  | 

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

