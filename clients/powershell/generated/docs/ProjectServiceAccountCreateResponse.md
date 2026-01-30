# ProjectServiceAccountCreateResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **String** |  | 
**Id** | **String** |  | 
**Name** | **String** |  | 
**Role** | **String** | Service accounts can only have one role of type &#x60;member&#x60; | 
**CreatedAt** | **Int32** |  | 
**ApiKey** | [**ProjectServiceAccountApiKey**](ProjectServiceAccountApiKey.md) |  | 

## Examples

- Prepare the resource
```powershell
$ProjectServiceAccountCreateResponse = Initialize-PSOpenAPIToolsProjectServiceAccountCreateResponse  -Object null `
 -Id null `
 -Name null `
 -Role null `
 -CreatedAt null `
 -ApiKey null
```

- Convert the resource to JSON
```powershell
$ProjectServiceAccountCreateResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

