# UserRoleUpdateRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Role** | **String** | &#x60;owner&#x60; or &#x60;reader&#x60; | 

## Examples

- Prepare the resource
```powershell
$UserRoleUpdateRequest = Initialize-PSOpenAPIToolsUserRoleUpdateRequest  -Role null
```

- Convert the resource to JSON
```powershell
$UserRoleUpdateRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

