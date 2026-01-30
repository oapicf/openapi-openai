# OAICreateAssistantRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**model** | [**OAICreateAssistantRequestModel***](OAICreateAssistantRequestModel.md) |  | 
**name** | **NSString*** | The name of the assistant. The maximum length is 256 characters.  | [optional] 
**_description** | **NSString*** | The description of the assistant. The maximum length is 512 characters.  | [optional] 
**instructions** | **NSString*** | The system instructions that the assistant uses. The maximum length is 256,000 characters.  | [optional] 
**tools** | [**NSArray&lt;OAIAssistantObjectToolsInner&gt;***](OAIAssistantObjectToolsInner.md) | A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types &#x60;code_interpreter&#x60;, &#x60;file_search&#x60;, or &#x60;function&#x60;.  | [optional] 
**toolResources** | [**OAICreateAssistantRequestToolResources***](OAICreateAssistantRequestToolResources.md) |  | [optional] 
**metadata** | [**NSObject***](.md) | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [optional] 
**temperature** | **NSNumber*** | What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  | [optional] [default to @1]
**topP** | **NSNumber*** | An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both.  | [optional] [default to @1]
**responseFormat** | [**OAIAssistantsApiResponseFormatOption***](OAIAssistantsApiResponseFormatOption.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


