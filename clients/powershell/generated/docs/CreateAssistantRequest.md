# CreateAssistantRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Model** | [**CreateAssistantRequestModel**](CreateAssistantRequestModel.md) |  | 
**Name** | **String** | The name of the assistant. The maximum length is 256 characters.  | [optional] 
**Description** | **String** | The description of the assistant. The maximum length is 512 characters.  | [optional] 
**Instructions** | **String** | The system instructions that the assistant uses. The maximum length is 256,000 characters.  | [optional] 
**Tools** | [**AssistantObjectToolsInner[]**](AssistantObjectToolsInner.md) | A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types &#x60;code_interpreter&#x60;, &#x60;retrieval&#x60;, or &#x60;function&#x60;.  | [optional] 
**FileIds** | **String[]** | A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order.  | [optional] 
**Metadata** | [**SystemCollectionsHashtable**](.md) | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  | [optional] 

## Examples

- Prepare the resource
```powershell
$CreateAssistantRequest = Initialize-PSOpenAPIToolsCreateAssistantRequest  -Model null `
 -Name null `
 -Description null `
 -Instructions null `
 -Tools null `
 -FileIds null `
 -Metadata null
```

- Convert the resource to JSON
```powershell
$CreateAssistantRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

