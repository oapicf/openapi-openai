# # ModifyAssistantRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**model** | **string** |  | [optional]
**name** | **string** | The name of the assistant. The maximum length is 256 characters. | [optional]
**description** | **string** | The description of the assistant. The maximum length is 512 characters. | [optional]
**instructions** | **string** | The system instructions that the assistant uses. The maximum length is 256,000 characters. | [optional]
**tools** | [**\OpenAPI\Client\Model\AssistantObjectToolsInner[]**](AssistantObjectToolsInner.md) | A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types &#x60;code_interpreter&#x60;, &#x60;retrieval&#x60;, or &#x60;function&#x60;. | [optional]
**file_ids** | **string[]** | A list of [File](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. If a file was previously attached to the list but does not show up in the list, it will be deleted from the assistant. | [optional]
**metadata** | **object** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
