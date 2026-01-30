# ModifyAssistantRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**model** | **string** |  | [optional] [default to undefined]
**name** | **string** | The name of the assistant. The maximum length is 256 characters.  | [optional] [default to undefined]
**description** | **string** | The description of the assistant. The maximum length is 512 characters.  | [optional] [default to undefined]
**instructions** | **string** | The system instructions that the assistant uses. The maximum length is 256,000 characters.  | [optional] [default to undefined]
**tools** | [**Array&lt;AssistantObjectToolsInner&gt;**](AssistantObjectToolsInner.md) | A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types &#x60;code_interpreter&#x60;, &#x60;file_search&#x60;, or &#x60;function&#x60;.  | [optional] [default to undefined]
**tool_resources** | [**ModifyAssistantRequestToolResources**](ModifyAssistantRequestToolResources.md) |  | [optional] [default to undefined]
**metadata** | **object** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [optional] [default to undefined]
**temperature** | **number** | What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  | [optional] [default to 1]
**top_p** | **number** | An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both.  | [optional] [default to 1]
**response_format** | [**AssistantsApiResponseFormatOption**](AssistantsApiResponseFormatOption.md) |  | [optional] [default to undefined]

## Example

```typescript
import { ModifyAssistantRequest } from './api';

const instance: ModifyAssistantRequest = {
    model,
    name,
    description,
    instructions,
    tools,
    tool_resources,
    metadata,
    temperature,
    top_p,
    response_format,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
