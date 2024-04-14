# ChatCompletionRequestToolMessage
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Role** | **String** | The role of the messages author, in this case &#x60;tool&#x60;. | 
**Content** | **String** | The contents of the tool message. | 
**ToolCallId** | **String** | Tool call that this message is responding to. | 

## Examples

- Prepare the resource
```powershell
$ChatCompletionRequestToolMessage = Initialize-PSOpenAPIToolsChatCompletionRequestToolMessage  -Role null `
 -Content null `
 -ToolCallId null
```

- Convert the resource to JSON
```powershell
$ChatCompletionRequestToolMessage | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

