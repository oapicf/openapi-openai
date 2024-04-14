# AssistantObject
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | The identifier, which can be referenced in API endpoints. | 
**Object** | **String** | The object type, which is always &#x60;assistant&#x60;. | 
**CreatedAt** | **Int32** | The Unix timestamp (in seconds) for when the assistant was created. | 
**Name** | **String** | The name of the assistant. The maximum length is 256 characters.  | 
**Description** | **String** | The description of the assistant. The maximum length is 512 characters.  | 
**Model** | **String** | ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them.  | 
**Instructions** | **String** | The system instructions that the assistant uses. The maximum length is 256,000 characters.  | 
**Tools** | [**AssistantObjectToolsInner[]**](AssistantObjectToolsInner.md) | A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types &#x60;code_interpreter&#x60;, &#x60;retrieval&#x60;, or &#x60;function&#x60;.  | 
**FileIds** | **String[]** | A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order.  | 
**Metadata** | [**SystemCollectionsHashtable**](.md) | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  | 

## Examples

- Prepare the resource
```powershell
$AssistantObject = Initialize-PSOpenAPIToolsAssistantObject  -Id null `
 -Object null `
 -CreatedAt null `
 -Name null `
 -Description null `
 -Model null `
 -Instructions null `
 -Tools null `
 -FileIds null `
 -Metadata null
```

- Convert the resource to JSON
```powershell
$AssistantObject | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

