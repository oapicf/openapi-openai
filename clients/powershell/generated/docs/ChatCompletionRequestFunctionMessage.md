# ChatCompletionRequestFunctionMessage
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Role** | **String** | The role of the messages author, in this case &#x60;function&#x60;. | 
**Content** | **String** | The contents of the function message. | 
**Name** | **String** | The name of the function to call. | 

## Examples

- Prepare the resource
```powershell
$ChatCompletionRequestFunctionMessage = Initialize-PSOpenAPIToolsChatCompletionRequestFunctionMessage  -Role null `
 -Content null `
 -Name null
```

- Convert the resource to JSON
```powershell
$ChatCompletionRequestFunctionMessage | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

