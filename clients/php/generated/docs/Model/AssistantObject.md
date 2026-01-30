# # AssistantObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | The identifier, which can be referenced in API endpoints. |
**object** | **string** | The object type, which is always &#x60;assistant&#x60;. |
**created_at** | **int** | The Unix timestamp (in seconds) for when the assistant was created. |
**name** | **string** | The name of the assistant. The maximum length is 256 characters. |
**description** | **string** | The description of the assistant. The maximum length is 512 characters. |
**model** | **string** | ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models) for descriptions of them. |
**instructions** | **string** | The system instructions that the assistant uses. The maximum length is 256,000 characters. |
**tools** | [**\OpenAPI\Client\Model\AssistantObjectToolsInner[]**](AssistantObjectToolsInner.md) | A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types &#x60;code_interpreter&#x60;, &#x60;file_search&#x60;, or &#x60;function&#x60;. |
**tool_resources** | [**\OpenAPI\Client\Model\AssistantObjectToolResources**](AssistantObjectToolResources.md) |  | [optional]
**metadata** | **object** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. |
**temperature** | **float** | What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. | [optional] [default to 1]
**top_p** | **float** | An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. | [optional] [default to 1]
**response_format** | [**\OpenAPI\Client\Model\AssistantsApiResponseFormatOption**](AssistantsApiResponseFormatOption.md) |  | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
