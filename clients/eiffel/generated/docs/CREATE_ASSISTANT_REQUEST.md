# CREATE_ASSISTANT_REQUEST

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**model** | [**CREATE_ASSISTANT_REQUEST_MODEL**](CreateAssistantRequest_model.md) |  | [default to null]
**name** | [**STRING_32**](STRING_32.md) | The name of the assistant. The maximum length is 256 characters.  | [optional] [default to null]
**description** | [**STRING_32**](STRING_32.md) | The description of the assistant. The maximum length is 512 characters.  | [optional] [default to null]
**instructions** | [**STRING_32**](STRING_32.md) | The system instructions that the assistant uses. The maximum length is 256,000 characters.  | [optional] [default to null]
**tools** | [**LIST [ASSISTANT_OBJECT_TOOLS_INNER]**](AssistantObject_tools_inner.md) | A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types &#x60;code_interpreter&#x60;, &#x60;retrieval&#x60;, or &#x60;function&#x60;.  | [optional] [default to []]
**file_ids** | [**LIST [STRING_32]**](STRING_32.md) | A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order.  | [optional] [default to []]
**metadata** | [**ANY**](.md) | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


