# MessageDeltaObjectDelta
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Role** | **String** | The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;. | [optional] 
**Content** | [**MessageDeltaObjectDeltaContentInner[]**](MessageDeltaObjectDeltaContentInner.md) | The content of the message in array of text and/or images. | [optional] 
**FileIds** | **String[]** | A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message. | [optional] 

## Examples

- Prepare the resource
```powershell
$MessageDeltaObjectDelta = Initialize-PSOpenAPIToolsMessageDeltaObjectDelta  -Role null `
 -Content null `
 -FileIds null
```

- Convert the resource to JSON
```powershell
$MessageDeltaObjectDelta | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

