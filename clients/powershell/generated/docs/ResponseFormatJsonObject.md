# ResponseFormatJsonObject
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **String** | The type of response format being defined: &#x60;json_object&#x60; | 

## Examples

- Prepare the resource
```powershell
$ResponseFormatJsonObject = Initialize-PSOpenAPIToolsResponseFormatJsonObject  -Type null
```

- Convert the resource to JSON
```powershell
$ResponseFormatJsonObject | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

