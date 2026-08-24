# OpenapiOpenai.CreateAssistantRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**model** | **String** |  | 
**name** | **String** | The name of the assistant. The maximum length is 256 characters.  | [optional] 
**description** | **String** | The description of the assistant. The maximum length is 512 characters.  | [optional] 
**instructions** | **String** | The system instructions that the assistant uses. The maximum length is 256,000 characters.  | [optional] 
**tools** | [**[AssistantObjectToolsInner]**](AssistantObjectToolsInner.md) | A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types &#x60;code_interpreter&#x60;, &#x60;file_search&#x60;, or &#x60;function&#x60;.  | [optional] 
**toolResources** | [**CreateAssistantRequestToolResources**](CreateAssistantRequestToolResources.md) |  | [optional] 
**metadata** | **Object** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [optional] 
**temperature** | **Number** | What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  | [optional] [default to 1]
**topP** | **Number** | An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both.  | [optional] [default to 1]
**responseFormat** | [**AssistantsApiResponseFormatOption**](AssistantsApiResponseFormatOption.md) |  | [optional] 



## Enum: ModelEnum


* `gpt-4o` (value: `"gpt-4o"`)

* `gpt-4o-2024-11-20` (value: `"gpt-4o-2024-11-20"`)

* `gpt-4o-2024-08-06` (value: `"gpt-4o-2024-08-06"`)

* `gpt-4o-2024-05-13` (value: `"gpt-4o-2024-05-13"`)

* `gpt-4o-mini` (value: `"gpt-4o-mini"`)

* `gpt-4o-mini-2024-07-18` (value: `"gpt-4o-mini-2024-07-18"`)

* `gpt-4-turbo` (value: `"gpt-4-turbo"`)

* `gpt-4-turbo-2024-04-09` (value: `"gpt-4-turbo-2024-04-09"`)

* `gpt-4-0125-preview` (value: `"gpt-4-0125-preview"`)

* `gpt-4-turbo-preview` (value: `"gpt-4-turbo-preview"`)

* `gpt-4-1106-preview` (value: `"gpt-4-1106-preview"`)

* `gpt-4-vision-preview` (value: `"gpt-4-vision-preview"`)

* `gpt-4` (value: `"gpt-4"`)

* `gpt-4-0314` (value: `"gpt-4-0314"`)

* `gpt-4-0613` (value: `"gpt-4-0613"`)

* `gpt-4-32k` (value: `"gpt-4-32k"`)

* `gpt-4-32k-0314` (value: `"gpt-4-32k-0314"`)

* `gpt-4-32k-0613` (value: `"gpt-4-32k-0613"`)

* `gpt-3.5-turbo` (value: `"gpt-3.5-turbo"`)

* `gpt-3.5-turbo-16k` (value: `"gpt-3.5-turbo-16k"`)

* `gpt-3.5-turbo-0613` (value: `"gpt-3.5-turbo-0613"`)

* `gpt-3.5-turbo-1106` (value: `"gpt-3.5-turbo-1106"`)

* `gpt-3.5-turbo-0125` (value: `"gpt-3.5-turbo-0125"`)

* `gpt-3.5-turbo-16k-0613` (value: `"gpt-3.5-turbo-16k-0613"`)




