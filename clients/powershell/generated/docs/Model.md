# Model
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | The model identifier, which can be referenced in the API endpoints. | 
**Created** | **Int32** | The Unix timestamp (in seconds) when the model was created. | 
**Object** | **String** | The object type, which is always &quot;&quot;model&quot;&quot;. | 
**OwnedBy** | **String** | The organization that owns the model. | 

## Examples

- Prepare the resource
```powershell
$Model = Initialize-PSOpenAPIToolsModel  -Id null `
 -Created null `
 -Object null `
 -OwnedBy null
```

- Convert the resource to JSON
```powershell
$Model | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

