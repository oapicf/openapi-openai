# ProjectApiKey
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **String** | The object type, which is always &#x60;organization.project.api_key&#x60; | 
**RedactedValue** | **String** | The redacted value of the API key | 
**Name** | **String** | The name of the API key | 
**CreatedAt** | **Int32** | The Unix timestamp (in seconds) of when the API key was created | 
**Id** | **String** | The identifier, which can be referenced in API endpoints | 
**Owner** | [**ProjectApiKeyOwner**](ProjectApiKeyOwner.md) |  | 

## Examples

- Prepare the resource
```powershell
$ProjectApiKey = Initialize-PSOpenAPIToolsProjectApiKey  -Object null `
 -RedactedValue null `
 -Name null `
 -CreatedAt null `
 -Id null `
 -Owner null
```

- Convert the resource to JSON
```powershell
$ProjectApiKey | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

