# ModifyAssistantRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**model** | Option<**String**> |  | [optional]
**name** | Option<**String**> | The name of the assistant. The maximum length is 256 characters.  | [optional]
**description** | Option<**String**> | The description of the assistant. The maximum length is 512 characters.  | [optional]
**instructions** | Option<**String**> | The system instructions that the assistant uses. The maximum length is 256,000 characters.  | [optional]
**tools** | Option<[**Vec<models::AssistantObjectToolsInner>**](AssistantObject_tools_inner.md)> | A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `file_search`, or `function`.  | [optional][default to []]
**tool_resources** | Option<[**models::ModifyAssistantRequestToolResources**](ModifyAssistantRequest_tool_resources.md)> |  | [optional]
**metadata** | Option<[**serde_json::Value**](.md)> | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [optional]
**temperature** | Option<**f64**> | What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  | [optional][default to 1]
**top_p** | Option<**f64**> | An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both.  | [optional][default to 1]
**response_format** | Option<[**models::AssistantsApiResponseFormatOption**](AssistantsApiResponseFormatOption.md)> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


