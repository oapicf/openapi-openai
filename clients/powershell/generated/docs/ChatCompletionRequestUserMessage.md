# ChatCompletionRequestUserMessage
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Content** | [**ChatCompletionRequestUserMessageContent**](ChatCompletionRequestUserMessageContent.md) |  | 
**Role** | **String** | The role of the messages author, in this case &#x60;user&#x60;. | 
**Name** | **String** | An optional name for the participant. Provides the model information to differentiate between participants of the same role. | [optional] 

## Examples

- Prepare the resource
```powershell
$ChatCompletionRequestUserMessage = Initialize-PSOpenAPIToolsChatCompletionRequestUserMessage  -Content null `
 -Role null `
 -Name null
```

- Convert the resource to JSON
```powershell
$ChatCompletionRequestUserMessage | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

