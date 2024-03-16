# ChatCompletionFunctions
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **String** | The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64. | 
**Description** | **String** | The description of what the function does. | [optional] 
**Parameters** | [**System.Collections.Hashtable**](AnyType.md) | The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/gpt/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format. | [optional] 

## Examples

- Prepare the resource
```powershell
$ChatCompletionFunctions = Initialize-PSOpenAPIToolsChatCompletionFunctions  -Name null `
 -Description null `
 -Parameters null
```

- Convert the resource to JSON
```powershell
$ChatCompletionFunctions | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

