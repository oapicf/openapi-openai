# MessageDeltaContentRefusalObject
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Index** | **Int32** | The index of the refusal part in the message. | 
**Type** | **String** | Always &#x60;refusal&#x60;. | 
**Refusal** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$MessageDeltaContentRefusalObject = Initialize-PSOpenAPIToolsMessageDeltaContentRefusalObject  -Index null `
 -Type null `
 -Refusal null
```

- Convert the resource to JSON
```powershell
$MessageDeltaContentRefusalObject | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

