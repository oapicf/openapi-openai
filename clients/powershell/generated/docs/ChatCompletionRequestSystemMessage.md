# ChatCompletionRequestSystemMessage
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Content** | [**ChatCompletionRequestSystemMessageContent**](ChatCompletionRequestSystemMessageContent.md) |  | 
**Role** | **String** | The role of the messages author, in this case &#x60;system&#x60;. | 
**Name** | **String** | An optional name for the participant. Provides the model information to differentiate between participants of the same role. | [optional] 

## Examples

- Prepare the resource
```powershell
$ChatCompletionRequestSystemMessage = Initialize-PSOpenAPIToolsChatCompletionRequestSystemMessage  -Content null `
 -Role null `
 -Name null
```

- Convert the resource to JSON
```powershell
$ChatCompletionRequestSystemMessage | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

