# RunObject

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The identifier, which can be referenced in API endpoints. | 
**object** | [***models::RunObjectObject**](RunObject_object.md) |  | 
**created_at** | **i32** | The Unix timestamp (in seconds) for when the run was created. | 
**thread_id** | **String** | The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run. | 
**assistant_id** | **String** | The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run. | 
**status** | [***models::RunObjectStatus**](RunObject_status.md) |  | 
**required_action** | [***swagger::Nullable<models::RunObjectRequiredAction>**](RunObject_required_action.md) |  | 
**last_error** | [***swagger::Nullable<models::RunObjectLastError>**](RunObject_last_error.md) |  | 
**expires_at** | **i32** | The Unix timestamp (in seconds) for when the run will expire. | 
**started_at** | **i32** | The Unix timestamp (in seconds) for when the run was started. | 
**cancelled_at** | **i32** | The Unix timestamp (in seconds) for when the run was cancelled. | 
**failed_at** | **i32** | The Unix timestamp (in seconds) for when the run failed. | 
**completed_at** | **i32** | The Unix timestamp (in seconds) for when the run was completed. | 
**incomplete_details** | [***swagger::Nullable<models::RunObjectIncompleteDetails>**](RunObject_incomplete_details.md) |  | 
**model** | **String** | The model that the [assistant](/docs/api-reference/assistants) used for this run. | 
**instructions** | **String** | The instructions that the [assistant](/docs/api-reference/assistants) used for this run. | 
**tools** | [**Vec<models::AssistantObjectToolsInner>**](AssistantObject_tools_inner.md) | The list of tools that the [assistant](/docs/api-reference/assistants) used for this run. | 
**file_ids** | **Vec<String>** | The list of [File](/docs/api-reference/files) IDs the [assistant](/docs/api-reference/assistants) used for this run. | 
**metadata** | [***serde_json::Value**](.md) | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  | 
**usage** | [***swagger::Nullable<models::RunCompletionUsage>**](RunCompletionUsage.md) |  | 
**temperature** | **swagger::Nullable<f64>** | The sampling temperature used for this run. If not set, defaults to 1. | [optional] [default to None]
**max_prompt_tokens** | **u32** | The maximum number of prompt tokens specified to have been used over the course of the run.  | 
**max_completion_tokens** | **u32** | The maximum number of completion tokens specified to have been used over the course of the run.  | 
**truncation_strategy** | [***models::TruncationObject**](TruncationObject.md) |  | 
**tool_choice** | [***models::AssistantsApiToolChoiceOption**](AssistantsApiToolChoiceOption.md) |  | 
**response_format** | [***models::AssistantsApiResponseFormatOption**](AssistantsApiResponseFormatOption.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


