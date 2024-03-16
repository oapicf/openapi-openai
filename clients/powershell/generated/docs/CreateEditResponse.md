# CreateEditResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **String** |  | 
**Created** | **Int32** |  | 
**Choices** | [**CreateEditResponseChoicesInner[]**](CreateEditResponseChoicesInner.md) |  | 
**Usage** | [**CreateCompletionResponseUsage**](CreateCompletionResponseUsage.md) |  | 

## Examples

- Prepare the resource
```powershell
$CreateEditResponse = Initialize-PSOpenAPIToolsCreateEditResponse  -Object null `
 -Created null `
 -Choices null `
 -Usage null
```

- Convert the resource to JSON
```powershell
$CreateEditResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

