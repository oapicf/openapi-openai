# openapi::ModifyAssistantRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**model** | **character** |  | [optional] 
**name** | **character** | The name of the assistant. The maximum length is 256 characters.  | [optional] [Max. length: 256] 
**description** | **character** | The description of the assistant. The maximum length is 512 characters.  | [optional] [Max. length: 512] 
**instructions** | **character** | The system instructions that the assistant uses. The maximum length is 256,000 characters.  | [optional] [Max. length: 256000] 
**tools** | [**array[AssistantObjectToolsInner]**](AssistantObject_tools_inner.md) | A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types &#x60;code_interpreter&#x60;, &#x60;retrieval&#x60;, or &#x60;function&#x60;.  | [optional] [default to []] [Max. items: 128] 
**file_ids** | **array[character]** | A list of [File](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. If a file was previously attached to the list but does not show up in the list, it will be deleted from the assistant.  | [optional] [default to []] [Max. items: 20] 
**metadata** | **object** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  | [optional] 


