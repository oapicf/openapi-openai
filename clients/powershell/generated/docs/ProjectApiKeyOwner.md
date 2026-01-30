# ProjectApiKeyOwner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **String** | &#x60;user&#x60; or &#x60;service_account&#x60; | [optional] 
**User** | [**ProjectUser**](ProjectUser.md) |  | [optional] 
**ServiceAccount** | [**ProjectServiceAccount**](ProjectServiceAccount.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ProjectApiKeyOwner = Initialize-PSOpenAPIToolsProjectApiKeyOwner  -Type null `
 -User null `
 -ServiceAccount null
```

- Convert the resource to JSON
```powershell
$ProjectApiKeyOwner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

