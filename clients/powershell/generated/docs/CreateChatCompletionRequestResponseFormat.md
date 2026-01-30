# CreateChatCompletionRequestResponseFormat
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **String** | The type of response format being defined: &#x60;text&#x60; | 
**JsonSchema** | [**ResponseFormatJsonSchemaJsonSchema**](ResponseFormatJsonSchemaJsonSchema.md) |  | 

## Examples

- Prepare the resource
```powershell
$CreateChatCompletionRequestResponseFormat = Initialize-PSOpenAPIToolsCreateChatCompletionRequestResponseFormat  -Type null `
 -JsonSchema null
```

- Convert the resource to JSON
```powershell
$CreateChatCompletionRequestResponseFormat | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

