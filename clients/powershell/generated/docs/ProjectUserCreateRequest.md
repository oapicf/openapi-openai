# ProjectUserCreateRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**UserId** | **String** | The ID of the user. | 
**Role** | **String** | &#x60;owner&#x60; or &#x60;member&#x60; | 

## Examples

- Prepare the resource
```powershell
$ProjectUserCreateRequest = Initialize-PSOpenAPIToolsProjectUserCreateRequest  -UserId null `
 -Role null
```

- Convert the resource to JSON
```powershell
$ProjectUserCreateRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

