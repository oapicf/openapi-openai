# ChatCompletionRequestDeveloperMessage
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Content** | [**ChatCompletionRequestDeveloperMessageContent**](ChatCompletionRequestDeveloperMessageContent.md) |  | 
**Role** | **String** | The role of the messages author, in this case &#x60;developer&#x60;. | 
**Name** | **String** | An optional name for the participant. Provides the model information to differentiate between participants of the same role. | [optional] 

## Examples

- Prepare the resource
```powershell
$ChatCompletionRequestDeveloperMessage = Initialize-PSOpenAPIToolsChatCompletionRequestDeveloperMessage  -Content null `
 -Role null `
 -Name null
```

- Convert the resource to JSON
```powershell
$ChatCompletionRequestDeveloperMessage | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

