# MessageContentRefusalObject
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **String** | Always &#x60;refusal&#x60;. | 
**Refusal** | **String** |  | 

## Examples

- Prepare the resource
```powershell
$MessageContentRefusalObject = Initialize-PSOpenAPIToolsMessageContentRefusalObject  -Type null `
 -Refusal null
```

- Convert the resource to JSON
```powershell
$MessageContentRefusalObject | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

