# RunObject
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **String** | The identifier, which can be referenced in API endpoints. | [default to null] |
| **object** | **String** | The object type, which is always &#x60;thread.run&#x60;. | [default to null] |
| **created\_at** | **Integer** | The Unix timestamp (in seconds) for when the run was created. | [default to null] |
| **thread\_id** | **String** | The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run. | [default to null] |
| **assistant\_id** | **String** | The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run. | [default to null] |
| **status** | **String** | The status of the run, which can be either &#x60;queued&#x60;, &#x60;in_progress&#x60;, &#x60;requires_action&#x60;, &#x60;cancelling&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, or &#x60;expired&#x60;. | [default to null] |
| **required\_action** | [**RunObject_required_action**](RunObject_required_action.md) |  | [default to null] |
| **last\_error** | [**RunObject_last_error**](RunObject_last_error.md) |  | [default to null] |
| **expires\_at** | **Integer** | The Unix timestamp (in seconds) for when the run will expire. | [default to null] |
| **started\_at** | **Integer** | The Unix timestamp (in seconds) for when the run was started. | [default to null] |
| **cancelled\_at** | **Integer** | The Unix timestamp (in seconds) for when the run was cancelled. | [default to null] |
| **failed\_at** | **Integer** | The Unix timestamp (in seconds) for when the run failed. | [default to null] |
| **completed\_at** | **Integer** | The Unix timestamp (in seconds) for when the run was completed. | [default to null] |
| **incomplete\_details** | [**RunObject_incomplete_details**](RunObject_incomplete_details.md) |  | [default to null] |
| **model** | **String** | The model that the [assistant](/docs/api-reference/assistants) used for this run. | [default to null] |
| **instructions** | **String** | The instructions that the [assistant](/docs/api-reference/assistants) used for this run. | [default to null] |
| **tools** | [**List**](AssistantObject_tools_inner.md) | The list of tools that the [assistant](/docs/api-reference/assistants) used for this run. | [default to []] |
| **file\_ids** | **List** | The list of [File](/docs/api-reference/files) IDs the [assistant](/docs/api-reference/assistants) used for this run. | [default to []] |
| **metadata** | [**Object**](.md) | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  | [default to null] |
| **usage** | [**RunCompletionUsage**](RunCompletionUsage.md) |  | [default to null] |
| **temperature** | **BigDecimal** | The sampling temperature used for this run. If not set, defaults to 1. | [optional] [default to null] |
| **max\_prompt\_tokens** | **Integer** | The maximum number of prompt tokens specified to have been used over the course of the run.  | [default to null] |
| **max\_completion\_tokens** | **Integer** | The maximum number of completion tokens specified to have been used over the course of the run.  | [default to null] |
| **truncation\_strategy** | [**TruncationObject**](TruncationObject.md) |  | [default to null] |
| **tool\_choice** | [**AssistantsApiToolChoiceOption**](AssistantsApiToolChoiceOption.md) |  | [default to null] |
| **response\_format** | [**AssistantsApiResponseFormatOption**](AssistantsApiResponseFormatOption.md) |  | [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

