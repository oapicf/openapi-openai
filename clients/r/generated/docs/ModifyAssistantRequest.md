# openapi::ModifyAssistantRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**model** | **character** |  | [optional] 
**name** | **character** | The name of the assistant. The maximum length is 256 characters.  | [optional] [Max. length: 256] 
**description** | **character** | The description of the assistant. The maximum length is 512 characters.  | [optional] [Max. length: 512] 
**instructions** | **character** | The system instructions that the assistant uses. The maximum length is 256,000 characters.  | [optional] [Max. length: 256000] 
**tools** | [**array[AssistantObjectToolsInner]**](AssistantObject_tools_inner.md) | A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types &#x60;code_interpreter&#x60;, &#x60;file_search&#x60;, or &#x60;function&#x60;.  | [optional] [default to []] [Max. items: 128] 
**tool_resources** | [**ModifyAssistantRequestToolResources**](ModifyAssistantRequest_tool_resources.md) |  | [optional] 
**metadata** | **object** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [optional] 
**temperature** | **numeric** | What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  | [optional] [default to 1] [Max: 2] [Min: 0] 
**top_p** | **numeric** | An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both.  | [optional] [default to 1] [Max: 1] [Min: 0] 
**response_format** | [**AssistantsApiResponseFormatOption**](AssistantsApiResponseFormatOption.md) |  | [optional] 


