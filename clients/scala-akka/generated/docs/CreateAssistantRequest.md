

# CreateAssistantRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**model** | [**CreateAssistantRequestModel**](CreateAssistantRequestModel.md) |  | 
**name** | **String** | The name of the assistant. The maximum length is 256 characters.  |  [optional]
**description** | **String** | The description of the assistant. The maximum length is 512 characters.  |  [optional]
**instructions** | **String** | The system instructions that the assistant uses. The maximum length is 256,000 characters.  |  [optional]
**tools** | [**Seq&lt;AssistantObjectToolsInner&gt;**](AssistantObjectToolsInner.md) | A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types &#x60;code_interpreter&#x60;, &#x60;retrieval&#x60;, or &#x60;function&#x60;.  |  [optional]
**fileIds** | **Seq&lt;String&gt;** | A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order.  |  [optional]
**metadata** | **Any** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  |  [optional]



