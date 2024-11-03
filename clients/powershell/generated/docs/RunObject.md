# RunObject
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | The identifier, which can be referenced in API endpoints. | 
**Object** | **String** | The object type, which is always &#x60;thread.run&#x60;. | 
**CreatedAt** | **Int32** | The Unix timestamp (in seconds) for when the run was created. | 
**ThreadId** | **String** | The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run. | 
**AssistantId** | **String** | The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run. | 
**Status** | **String** | The status of the run, which can be either &#x60;queued&#x60;, &#x60;in_progress&#x60;, &#x60;requires_action&#x60;, &#x60;cancelling&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, or &#x60;expired&#x60;. | 
**RequiredAction** | [**RunObjectRequiredAction**](RunObjectRequiredAction.md) |  | 
**LastError** | [**RunObjectLastError**](RunObjectLastError.md) |  | 
**ExpiresAt** | **Int32** | The Unix timestamp (in seconds) for when the run will expire. | 
**StartedAt** | **Int32** | The Unix timestamp (in seconds) for when the run was started. | 
**CancelledAt** | **Int32** | The Unix timestamp (in seconds) for when the run was cancelled. | 
**FailedAt** | **Int32** | The Unix timestamp (in seconds) for when the run failed. | 
**CompletedAt** | **Int32** | The Unix timestamp (in seconds) for when the run was completed. | 
**IncompleteDetails** | [**RunObjectIncompleteDetails**](RunObjectIncompleteDetails.md) |  | 
**Model** | **String** | The model that the [assistant](/docs/api-reference/assistants) used for this run. | 
**Instructions** | **String** | The instructions that the [assistant](/docs/api-reference/assistants) used for this run. | 
**Tools** | [**AssistantObjectToolsInner[]**](AssistantObjectToolsInner.md) | The list of tools that the [assistant](/docs/api-reference/assistants) used for this run. | 
**FileIds** | **String[]** | The list of [File](/docs/api-reference/files) IDs the [assistant](/docs/api-reference/assistants) used for this run. | 
**Metadata** | [**SystemCollectionsHashtable**](.md) | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  | 
**Usage** | [**RunCompletionUsage**](RunCompletionUsage.md) |  | 
**Temperature** | **Decimal** | The sampling temperature used for this run. If not set, defaults to 1. | [optional] 
**MaxPromptTokens** | **Int32** | The maximum number of prompt tokens specified to have been used over the course of the run.  | 
**MaxCompletionTokens** | **Int32** | The maximum number of completion tokens specified to have been used over the course of the run.  | 
**TruncationStrategy** | [**TruncationObject**](TruncationObject.md) |  | 
**ToolChoice** | [**AssistantsApiToolChoiceOption**](AssistantsApiToolChoiceOption.md) |  | 
**ResponseFormat** | [**AssistantsApiResponseFormatOption**](AssistantsApiResponseFormatOption.md) |  | 

## Examples

- Prepare the resource
```powershell
$RunObject = Initialize-PSOpenAPIToolsRunObject  -Id null `
 -Object null `
 -CreatedAt null `
 -ThreadId null `
 -AssistantId null `
 -Status null `
 -RequiredAction null `
 -LastError null `
 -ExpiresAt null `
 -StartedAt null `
 -CancelledAt null `
 -FailedAt null `
 -CompletedAt null `
 -IncompleteDetails null `
 -Model null `
 -Instructions null `
 -Tools null `
 -FileIds null `
 -Metadata null `
 -Usage null `
 -Temperature null `
 -MaxPromptTokens null `
 -MaxCompletionTokens null `
 -TruncationStrategy null `
 -ToolChoice null `
 -ResponseFormat null
```

- Convert the resource to JSON
```powershell
$RunObject | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

