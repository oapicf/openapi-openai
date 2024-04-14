# CreateThreadAndRunRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssistantId** | **String** | The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run. | 
**Thread** | [**CreateThreadRequest**](CreateThreadRequest.md) |  | [optional] 
**Model** | [**CreateRunRequestModel**](CreateRunRequestModel.md) |  | [optional] 
**Instructions** | **String** | Override the default system message of the assistant. This is useful for modifying the behavior on a per-run basis. | [optional] 
**Tools** | [**CreateThreadAndRunRequestToolsInner[]**](CreateThreadAndRunRequestToolsInner.md) | Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis. | [optional] 
**Metadata** | [**SystemCollectionsHashtable**](.md) | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  | [optional] 
**Temperature** | **Decimal** | What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  | [optional] [default to 1]
**Stream** | **Boolean** | If &#x60;true&#x60;, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a &#x60;data: [DONE]&#x60; message.  | [optional] 
**MaxPromptTokens** | **Int32** | The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status &#x60;complete&#x60;. See &#x60;incomplete_details&#x60; for more info.  | [optional] 
**MaxCompletionTokens** | **Int32** | The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status &#x60;incomplete&#x60;. See &#x60;incomplete_details&#x60; for more info.  | [optional] 
**TruncationStrategy** | [**TruncationObject**](TruncationObject.md) |  | [optional] 
**ToolChoice** | [**AssistantsApiToolChoiceOption**](AssistantsApiToolChoiceOption.md) |  | [optional] 
**ResponseFormat** | [**AssistantsApiResponseFormatOption**](AssistantsApiResponseFormatOption.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CreateThreadAndRunRequest = Initialize-PSOpenAPIToolsCreateThreadAndRunRequest  -AssistantId null `
 -Thread null `
 -Model null `
 -Instructions null `
 -Tools null `
 -Metadata null `
 -Temperature 1 `
 -Stream null `
 -MaxPromptTokens null `
 -MaxCompletionTokens null `
 -TruncationStrategy null `
 -ToolChoice null `
 -ResponseFormat null
```

- Convert the resource to JSON
```powershell
$CreateThreadAndRunRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

