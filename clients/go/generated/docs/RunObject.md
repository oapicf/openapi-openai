# RunObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | The identifier, which can be referenced in API endpoints. | 
**Object** | **string** | The object type, which is always &#x60;thread.run&#x60;. | 
**CreatedAt** | **int32** | The Unix timestamp (in seconds) for when the run was created. | 
**ThreadId** | **string** | The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run. | 
**AssistantId** | **string** | The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run. | 
**Status** | **string** | The status of the run, which can be either &#x60;queued&#x60;, &#x60;in_progress&#x60;, &#x60;requires_action&#x60;, &#x60;cancelling&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, &#x60;incomplete&#x60;, or &#x60;expired&#x60;. | 
**RequiredAction** | [**NullableRunObjectRequiredAction**](RunObjectRequiredAction.md) |  | 
**LastError** | [**NullableRunObjectLastError**](RunObjectLastError.md) |  | 
**ExpiresAt** | **NullableInt32** | The Unix timestamp (in seconds) for when the run will expire. | 
**StartedAt** | **NullableInt32** | The Unix timestamp (in seconds) for when the run was started. | 
**CancelledAt** | **NullableInt32** | The Unix timestamp (in seconds) for when the run was cancelled. | 
**FailedAt** | **NullableInt32** | The Unix timestamp (in seconds) for when the run failed. | 
**CompletedAt** | **NullableInt32** | The Unix timestamp (in seconds) for when the run was completed. | 
**IncompleteDetails** | [**NullableRunObjectIncompleteDetails**](RunObjectIncompleteDetails.md) |  | 
**Model** | **string** | The model that the [assistant](/docs/api-reference/assistants) used for this run. | 
**Instructions** | **string** | The instructions that the [assistant](/docs/api-reference/assistants) used for this run. | 
**Tools** | [**[]AssistantObjectToolsInner**](AssistantObjectToolsInner.md) | The list of tools that the [assistant](/docs/api-reference/assistants) used for this run. | [default to {}]
**Metadata** | **map[string]interface{}** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | 
**Usage** | [**NullableRunCompletionUsage**](RunCompletionUsage.md) |  | 
**Temperature** | Pointer to **NullableFloat32** | The sampling temperature used for this run. If not set, defaults to 1. | [optional] 
**TopP** | Pointer to **NullableFloat32** | The nucleus sampling value used for this run. If not set, defaults to 1. | [optional] 
**MaxPromptTokens** | **NullableInt32** | The maximum number of prompt tokens specified to have been used over the course of the run.  | 
**MaxCompletionTokens** | **NullableInt32** | The maximum number of completion tokens specified to have been used over the course of the run.  | 
**TruncationStrategy** | [**TruncationObject**](TruncationObject.md) |  | 
**ToolChoice** | [**AssistantsApiToolChoiceOption**](AssistantsApiToolChoiceOption.md) |  | 
**ParallelToolCalls** | **bool** | Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use. | [default to true]
**ResponseFormat** | [**AssistantsApiResponseFormatOption**](AssistantsApiResponseFormatOption.md) |  | 

## Methods

### NewRunObject

`func NewRunObject(id string, object string, createdAt int32, threadId string, assistantId string, status string, requiredAction NullableRunObjectRequiredAction, lastError NullableRunObjectLastError, expiresAt NullableInt32, startedAt NullableInt32, cancelledAt NullableInt32, failedAt NullableInt32, completedAt NullableInt32, incompleteDetails NullableRunObjectIncompleteDetails, model string, instructions string, tools []AssistantObjectToolsInner, metadata map[string]interface{}, usage NullableRunCompletionUsage, maxPromptTokens NullableInt32, maxCompletionTokens NullableInt32, truncationStrategy TruncationObject, toolChoice AssistantsApiToolChoiceOption, parallelToolCalls bool, responseFormat AssistantsApiResponseFormatOption, ) *RunObject`

NewRunObject instantiates a new RunObject object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRunObjectWithDefaults

`func NewRunObjectWithDefaults() *RunObject`

NewRunObjectWithDefaults instantiates a new RunObject object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *RunObject) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *RunObject) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *RunObject) SetId(v string)`

SetId sets Id field to given value.


### GetObject

`func (o *RunObject) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *RunObject) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *RunObject) SetObject(v string)`

SetObject sets Object field to given value.


### GetCreatedAt

`func (o *RunObject) GetCreatedAt() int32`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *RunObject) GetCreatedAtOk() (*int32, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *RunObject) SetCreatedAt(v int32)`

SetCreatedAt sets CreatedAt field to given value.


### GetThreadId

`func (o *RunObject) GetThreadId() string`

GetThreadId returns the ThreadId field if non-nil, zero value otherwise.

### GetThreadIdOk

`func (o *RunObject) GetThreadIdOk() (*string, bool)`

GetThreadIdOk returns a tuple with the ThreadId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetThreadId

`func (o *RunObject) SetThreadId(v string)`

SetThreadId sets ThreadId field to given value.


### GetAssistantId

`func (o *RunObject) GetAssistantId() string`

GetAssistantId returns the AssistantId field if non-nil, zero value otherwise.

### GetAssistantIdOk

`func (o *RunObject) GetAssistantIdOk() (*string, bool)`

GetAssistantIdOk returns a tuple with the AssistantId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssistantId

`func (o *RunObject) SetAssistantId(v string)`

SetAssistantId sets AssistantId field to given value.


### GetStatus

`func (o *RunObject) GetStatus() string`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *RunObject) GetStatusOk() (*string, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *RunObject) SetStatus(v string)`

SetStatus sets Status field to given value.


### GetRequiredAction

`func (o *RunObject) GetRequiredAction() RunObjectRequiredAction`

GetRequiredAction returns the RequiredAction field if non-nil, zero value otherwise.

### GetRequiredActionOk

`func (o *RunObject) GetRequiredActionOk() (*RunObjectRequiredAction, bool)`

GetRequiredActionOk returns a tuple with the RequiredAction field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRequiredAction

`func (o *RunObject) SetRequiredAction(v RunObjectRequiredAction)`

SetRequiredAction sets RequiredAction field to given value.


### SetRequiredActionNil

`func (o *RunObject) SetRequiredActionNil(b bool)`

 SetRequiredActionNil sets the value for RequiredAction to be an explicit nil

### UnsetRequiredAction
`func (o *RunObject) UnsetRequiredAction()`

UnsetRequiredAction ensures that no value is present for RequiredAction, not even an explicit nil
### GetLastError

`func (o *RunObject) GetLastError() RunObjectLastError`

GetLastError returns the LastError field if non-nil, zero value otherwise.

### GetLastErrorOk

`func (o *RunObject) GetLastErrorOk() (*RunObjectLastError, bool)`

GetLastErrorOk returns a tuple with the LastError field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastError

`func (o *RunObject) SetLastError(v RunObjectLastError)`

SetLastError sets LastError field to given value.


### SetLastErrorNil

`func (o *RunObject) SetLastErrorNil(b bool)`

 SetLastErrorNil sets the value for LastError to be an explicit nil

### UnsetLastError
`func (o *RunObject) UnsetLastError()`

UnsetLastError ensures that no value is present for LastError, not even an explicit nil
### GetExpiresAt

`func (o *RunObject) GetExpiresAt() int32`

GetExpiresAt returns the ExpiresAt field if non-nil, zero value otherwise.

### GetExpiresAtOk

`func (o *RunObject) GetExpiresAtOk() (*int32, bool)`

GetExpiresAtOk returns a tuple with the ExpiresAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExpiresAt

`func (o *RunObject) SetExpiresAt(v int32)`

SetExpiresAt sets ExpiresAt field to given value.


### SetExpiresAtNil

`func (o *RunObject) SetExpiresAtNil(b bool)`

 SetExpiresAtNil sets the value for ExpiresAt to be an explicit nil

### UnsetExpiresAt
`func (o *RunObject) UnsetExpiresAt()`

UnsetExpiresAt ensures that no value is present for ExpiresAt, not even an explicit nil
### GetStartedAt

`func (o *RunObject) GetStartedAt() int32`

GetStartedAt returns the StartedAt field if non-nil, zero value otherwise.

### GetStartedAtOk

`func (o *RunObject) GetStartedAtOk() (*int32, bool)`

GetStartedAtOk returns a tuple with the StartedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartedAt

`func (o *RunObject) SetStartedAt(v int32)`

SetStartedAt sets StartedAt field to given value.


### SetStartedAtNil

`func (o *RunObject) SetStartedAtNil(b bool)`

 SetStartedAtNil sets the value for StartedAt to be an explicit nil

### UnsetStartedAt
`func (o *RunObject) UnsetStartedAt()`

UnsetStartedAt ensures that no value is present for StartedAt, not even an explicit nil
### GetCancelledAt

`func (o *RunObject) GetCancelledAt() int32`

GetCancelledAt returns the CancelledAt field if non-nil, zero value otherwise.

### GetCancelledAtOk

`func (o *RunObject) GetCancelledAtOk() (*int32, bool)`

GetCancelledAtOk returns a tuple with the CancelledAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCancelledAt

`func (o *RunObject) SetCancelledAt(v int32)`

SetCancelledAt sets CancelledAt field to given value.


### SetCancelledAtNil

`func (o *RunObject) SetCancelledAtNil(b bool)`

 SetCancelledAtNil sets the value for CancelledAt to be an explicit nil

### UnsetCancelledAt
`func (o *RunObject) UnsetCancelledAt()`

UnsetCancelledAt ensures that no value is present for CancelledAt, not even an explicit nil
### GetFailedAt

`func (o *RunObject) GetFailedAt() int32`

GetFailedAt returns the FailedAt field if non-nil, zero value otherwise.

### GetFailedAtOk

`func (o *RunObject) GetFailedAtOk() (*int32, bool)`

GetFailedAtOk returns a tuple with the FailedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFailedAt

`func (o *RunObject) SetFailedAt(v int32)`

SetFailedAt sets FailedAt field to given value.


### SetFailedAtNil

`func (o *RunObject) SetFailedAtNil(b bool)`

 SetFailedAtNil sets the value for FailedAt to be an explicit nil

### UnsetFailedAt
`func (o *RunObject) UnsetFailedAt()`

UnsetFailedAt ensures that no value is present for FailedAt, not even an explicit nil
### GetCompletedAt

`func (o *RunObject) GetCompletedAt() int32`

GetCompletedAt returns the CompletedAt field if non-nil, zero value otherwise.

### GetCompletedAtOk

`func (o *RunObject) GetCompletedAtOk() (*int32, bool)`

GetCompletedAtOk returns a tuple with the CompletedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompletedAt

`func (o *RunObject) SetCompletedAt(v int32)`

SetCompletedAt sets CompletedAt field to given value.


### SetCompletedAtNil

`func (o *RunObject) SetCompletedAtNil(b bool)`

 SetCompletedAtNil sets the value for CompletedAt to be an explicit nil

### UnsetCompletedAt
`func (o *RunObject) UnsetCompletedAt()`

UnsetCompletedAt ensures that no value is present for CompletedAt, not even an explicit nil
### GetIncompleteDetails

`func (o *RunObject) GetIncompleteDetails() RunObjectIncompleteDetails`

GetIncompleteDetails returns the IncompleteDetails field if non-nil, zero value otherwise.

### GetIncompleteDetailsOk

`func (o *RunObject) GetIncompleteDetailsOk() (*RunObjectIncompleteDetails, bool)`

GetIncompleteDetailsOk returns a tuple with the IncompleteDetails field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIncompleteDetails

`func (o *RunObject) SetIncompleteDetails(v RunObjectIncompleteDetails)`

SetIncompleteDetails sets IncompleteDetails field to given value.


### SetIncompleteDetailsNil

`func (o *RunObject) SetIncompleteDetailsNil(b bool)`

 SetIncompleteDetailsNil sets the value for IncompleteDetails to be an explicit nil

### UnsetIncompleteDetails
`func (o *RunObject) UnsetIncompleteDetails()`

UnsetIncompleteDetails ensures that no value is present for IncompleteDetails, not even an explicit nil
### GetModel

`func (o *RunObject) GetModel() string`

GetModel returns the Model field if non-nil, zero value otherwise.

### GetModelOk

`func (o *RunObject) GetModelOk() (*string, bool)`

GetModelOk returns a tuple with the Model field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModel

`func (o *RunObject) SetModel(v string)`

SetModel sets Model field to given value.


### GetInstructions

`func (o *RunObject) GetInstructions() string`

GetInstructions returns the Instructions field if non-nil, zero value otherwise.

### GetInstructionsOk

`func (o *RunObject) GetInstructionsOk() (*string, bool)`

GetInstructionsOk returns a tuple with the Instructions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstructions

`func (o *RunObject) SetInstructions(v string)`

SetInstructions sets Instructions field to given value.


### GetTools

`func (o *RunObject) GetTools() []AssistantObjectToolsInner`

GetTools returns the Tools field if non-nil, zero value otherwise.

### GetToolsOk

`func (o *RunObject) GetToolsOk() (*[]AssistantObjectToolsInner, bool)`

GetToolsOk returns a tuple with the Tools field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTools

`func (o *RunObject) SetTools(v []AssistantObjectToolsInner)`

SetTools sets Tools field to given value.


### GetMetadata

`func (o *RunObject) GetMetadata() map[string]interface{}`

GetMetadata returns the Metadata field if non-nil, zero value otherwise.

### GetMetadataOk

`func (o *RunObject) GetMetadataOk() (*map[string]interface{}, bool)`

GetMetadataOk returns a tuple with the Metadata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMetadata

`func (o *RunObject) SetMetadata(v map[string]interface{})`

SetMetadata sets Metadata field to given value.


### SetMetadataNil

`func (o *RunObject) SetMetadataNil(b bool)`

 SetMetadataNil sets the value for Metadata to be an explicit nil

### UnsetMetadata
`func (o *RunObject) UnsetMetadata()`

UnsetMetadata ensures that no value is present for Metadata, not even an explicit nil
### GetUsage

`func (o *RunObject) GetUsage() RunCompletionUsage`

GetUsage returns the Usage field if non-nil, zero value otherwise.

### GetUsageOk

`func (o *RunObject) GetUsageOk() (*RunCompletionUsage, bool)`

GetUsageOk returns a tuple with the Usage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsage

`func (o *RunObject) SetUsage(v RunCompletionUsage)`

SetUsage sets Usage field to given value.


### SetUsageNil

`func (o *RunObject) SetUsageNil(b bool)`

 SetUsageNil sets the value for Usage to be an explicit nil

### UnsetUsage
`func (o *RunObject) UnsetUsage()`

UnsetUsage ensures that no value is present for Usage, not even an explicit nil
### GetTemperature

`func (o *RunObject) GetTemperature() float32`

GetTemperature returns the Temperature field if non-nil, zero value otherwise.

### GetTemperatureOk

`func (o *RunObject) GetTemperatureOk() (*float32, bool)`

GetTemperatureOk returns a tuple with the Temperature field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTemperature

`func (o *RunObject) SetTemperature(v float32)`

SetTemperature sets Temperature field to given value.

### HasTemperature

`func (o *RunObject) HasTemperature() bool`

HasTemperature returns a boolean if a field has been set.

### SetTemperatureNil

`func (o *RunObject) SetTemperatureNil(b bool)`

 SetTemperatureNil sets the value for Temperature to be an explicit nil

### UnsetTemperature
`func (o *RunObject) UnsetTemperature()`

UnsetTemperature ensures that no value is present for Temperature, not even an explicit nil
### GetTopP

`func (o *RunObject) GetTopP() float32`

GetTopP returns the TopP field if non-nil, zero value otherwise.

### GetTopPOk

`func (o *RunObject) GetTopPOk() (*float32, bool)`

GetTopPOk returns a tuple with the TopP field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTopP

`func (o *RunObject) SetTopP(v float32)`

SetTopP sets TopP field to given value.

### HasTopP

`func (o *RunObject) HasTopP() bool`

HasTopP returns a boolean if a field has been set.

### SetTopPNil

`func (o *RunObject) SetTopPNil(b bool)`

 SetTopPNil sets the value for TopP to be an explicit nil

### UnsetTopP
`func (o *RunObject) UnsetTopP()`

UnsetTopP ensures that no value is present for TopP, not even an explicit nil
### GetMaxPromptTokens

`func (o *RunObject) GetMaxPromptTokens() int32`

GetMaxPromptTokens returns the MaxPromptTokens field if non-nil, zero value otherwise.

### GetMaxPromptTokensOk

`func (o *RunObject) GetMaxPromptTokensOk() (*int32, bool)`

GetMaxPromptTokensOk returns a tuple with the MaxPromptTokens field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxPromptTokens

`func (o *RunObject) SetMaxPromptTokens(v int32)`

SetMaxPromptTokens sets MaxPromptTokens field to given value.


### SetMaxPromptTokensNil

`func (o *RunObject) SetMaxPromptTokensNil(b bool)`

 SetMaxPromptTokensNil sets the value for MaxPromptTokens to be an explicit nil

### UnsetMaxPromptTokens
`func (o *RunObject) UnsetMaxPromptTokens()`

UnsetMaxPromptTokens ensures that no value is present for MaxPromptTokens, not even an explicit nil
### GetMaxCompletionTokens

`func (o *RunObject) GetMaxCompletionTokens() int32`

GetMaxCompletionTokens returns the MaxCompletionTokens field if non-nil, zero value otherwise.

### GetMaxCompletionTokensOk

`func (o *RunObject) GetMaxCompletionTokensOk() (*int32, bool)`

GetMaxCompletionTokensOk returns a tuple with the MaxCompletionTokens field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxCompletionTokens

`func (o *RunObject) SetMaxCompletionTokens(v int32)`

SetMaxCompletionTokens sets MaxCompletionTokens field to given value.


### SetMaxCompletionTokensNil

`func (o *RunObject) SetMaxCompletionTokensNil(b bool)`

 SetMaxCompletionTokensNil sets the value for MaxCompletionTokens to be an explicit nil

### UnsetMaxCompletionTokens
`func (o *RunObject) UnsetMaxCompletionTokens()`

UnsetMaxCompletionTokens ensures that no value is present for MaxCompletionTokens, not even an explicit nil
### GetTruncationStrategy

`func (o *RunObject) GetTruncationStrategy() TruncationObject`

GetTruncationStrategy returns the TruncationStrategy field if non-nil, zero value otherwise.

### GetTruncationStrategyOk

`func (o *RunObject) GetTruncationStrategyOk() (*TruncationObject, bool)`

GetTruncationStrategyOk returns a tuple with the TruncationStrategy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTruncationStrategy

`func (o *RunObject) SetTruncationStrategy(v TruncationObject)`

SetTruncationStrategy sets TruncationStrategy field to given value.


### GetToolChoice

`func (o *RunObject) GetToolChoice() AssistantsApiToolChoiceOption`

GetToolChoice returns the ToolChoice field if non-nil, zero value otherwise.

### GetToolChoiceOk

`func (o *RunObject) GetToolChoiceOk() (*AssistantsApiToolChoiceOption, bool)`

GetToolChoiceOk returns a tuple with the ToolChoice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToolChoice

`func (o *RunObject) SetToolChoice(v AssistantsApiToolChoiceOption)`

SetToolChoice sets ToolChoice field to given value.


### GetParallelToolCalls

`func (o *RunObject) GetParallelToolCalls() bool`

GetParallelToolCalls returns the ParallelToolCalls field if non-nil, zero value otherwise.

### GetParallelToolCallsOk

`func (o *RunObject) GetParallelToolCallsOk() (*bool, bool)`

GetParallelToolCallsOk returns a tuple with the ParallelToolCalls field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParallelToolCalls

`func (o *RunObject) SetParallelToolCalls(v bool)`

SetParallelToolCalls sets ParallelToolCalls field to given value.


### GetResponseFormat

`func (o *RunObject) GetResponseFormat() AssistantsApiResponseFormatOption`

GetResponseFormat returns the ResponseFormat field if non-nil, zero value otherwise.

### GetResponseFormatOk

`func (o *RunObject) GetResponseFormatOk() (*AssistantsApiResponseFormatOption, bool)`

GetResponseFormatOk returns a tuple with the ResponseFormat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponseFormat

`func (o *RunObject) SetResponseFormat(v AssistantsApiResponseFormatOption)`

SetResponseFormat sets ResponseFormat field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


