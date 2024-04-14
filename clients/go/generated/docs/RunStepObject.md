# RunStepObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | The identifier of the run step, which can be referenced in API endpoints. | 
**Object** | **string** | The object type, which is always &#x60;thread.run.step&#x60;. | 
**CreatedAt** | **int32** | The Unix timestamp (in seconds) for when the run step was created. | 
**AssistantId** | **string** | The ID of the [assistant](/docs/api-reference/assistants) associated with the run step. | 
**ThreadId** | **string** | The ID of the [thread](/docs/api-reference/threads) that was run. | 
**RunId** | **string** | The ID of the [run](/docs/api-reference/runs) that this run step is a part of. | 
**Type** | **string** | The type of run step, which can be either &#x60;message_creation&#x60; or &#x60;tool_calls&#x60;. | 
**Status** | **string** | The status of the run step, which can be either &#x60;in_progress&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, or &#x60;expired&#x60;. | 
**StepDetails** | [**RunStepObjectStepDetails**](RunStepObjectStepDetails.md) |  | 
**LastError** | [**NullableRunStepObjectLastError**](RunStepObjectLastError.md) |  | 
**ExpiredAt** | **NullableInt32** | The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired. | 
**CancelledAt** | **NullableInt32** | The Unix timestamp (in seconds) for when the run step was cancelled. | 
**FailedAt** | **NullableInt32** | The Unix timestamp (in seconds) for when the run step failed. | 
**CompletedAt** | **NullableInt32** | The Unix timestamp (in seconds) for when the run step completed. | 
**Metadata** | **map[string]interface{}** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  | 
**Usage** | [**NullableRunStepCompletionUsage**](RunStepCompletionUsage.md) |  | 

## Methods

### NewRunStepObject

`func NewRunStepObject(id string, object string, createdAt int32, assistantId string, threadId string, runId string, type_ string, status string, stepDetails RunStepObjectStepDetails, lastError NullableRunStepObjectLastError, expiredAt NullableInt32, cancelledAt NullableInt32, failedAt NullableInt32, completedAt NullableInt32, metadata map[string]interface{}, usage NullableRunStepCompletionUsage, ) *RunStepObject`

NewRunStepObject instantiates a new RunStepObject object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRunStepObjectWithDefaults

`func NewRunStepObjectWithDefaults() *RunStepObject`

NewRunStepObjectWithDefaults instantiates a new RunStepObject object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *RunStepObject) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *RunStepObject) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *RunStepObject) SetId(v string)`

SetId sets Id field to given value.


### GetObject

`func (o *RunStepObject) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *RunStepObject) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *RunStepObject) SetObject(v string)`

SetObject sets Object field to given value.


### GetCreatedAt

`func (o *RunStepObject) GetCreatedAt() int32`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *RunStepObject) GetCreatedAtOk() (*int32, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *RunStepObject) SetCreatedAt(v int32)`

SetCreatedAt sets CreatedAt field to given value.


### GetAssistantId

`func (o *RunStepObject) GetAssistantId() string`

GetAssistantId returns the AssistantId field if non-nil, zero value otherwise.

### GetAssistantIdOk

`func (o *RunStepObject) GetAssistantIdOk() (*string, bool)`

GetAssistantIdOk returns a tuple with the AssistantId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssistantId

`func (o *RunStepObject) SetAssistantId(v string)`

SetAssistantId sets AssistantId field to given value.


### GetThreadId

`func (o *RunStepObject) GetThreadId() string`

GetThreadId returns the ThreadId field if non-nil, zero value otherwise.

### GetThreadIdOk

`func (o *RunStepObject) GetThreadIdOk() (*string, bool)`

GetThreadIdOk returns a tuple with the ThreadId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetThreadId

`func (o *RunStepObject) SetThreadId(v string)`

SetThreadId sets ThreadId field to given value.


### GetRunId

`func (o *RunStepObject) GetRunId() string`

GetRunId returns the RunId field if non-nil, zero value otherwise.

### GetRunIdOk

`func (o *RunStepObject) GetRunIdOk() (*string, bool)`

GetRunIdOk returns a tuple with the RunId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRunId

`func (o *RunStepObject) SetRunId(v string)`

SetRunId sets RunId field to given value.


### GetType

`func (o *RunStepObject) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *RunStepObject) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *RunStepObject) SetType(v string)`

SetType sets Type field to given value.


### GetStatus

`func (o *RunStepObject) GetStatus() string`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *RunStepObject) GetStatusOk() (*string, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *RunStepObject) SetStatus(v string)`

SetStatus sets Status field to given value.


### GetStepDetails

`func (o *RunStepObject) GetStepDetails() RunStepObjectStepDetails`

GetStepDetails returns the StepDetails field if non-nil, zero value otherwise.

### GetStepDetailsOk

`func (o *RunStepObject) GetStepDetailsOk() (*RunStepObjectStepDetails, bool)`

GetStepDetailsOk returns a tuple with the StepDetails field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStepDetails

`func (o *RunStepObject) SetStepDetails(v RunStepObjectStepDetails)`

SetStepDetails sets StepDetails field to given value.


### GetLastError

`func (o *RunStepObject) GetLastError() RunStepObjectLastError`

GetLastError returns the LastError field if non-nil, zero value otherwise.

### GetLastErrorOk

`func (o *RunStepObject) GetLastErrorOk() (*RunStepObjectLastError, bool)`

GetLastErrorOk returns a tuple with the LastError field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastError

`func (o *RunStepObject) SetLastError(v RunStepObjectLastError)`

SetLastError sets LastError field to given value.


### SetLastErrorNil

`func (o *RunStepObject) SetLastErrorNil(b bool)`

 SetLastErrorNil sets the value for LastError to be an explicit nil

### UnsetLastError
`func (o *RunStepObject) UnsetLastError()`

UnsetLastError ensures that no value is present for LastError, not even an explicit nil
### GetExpiredAt

`func (o *RunStepObject) GetExpiredAt() int32`

GetExpiredAt returns the ExpiredAt field if non-nil, zero value otherwise.

### GetExpiredAtOk

`func (o *RunStepObject) GetExpiredAtOk() (*int32, bool)`

GetExpiredAtOk returns a tuple with the ExpiredAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExpiredAt

`func (o *RunStepObject) SetExpiredAt(v int32)`

SetExpiredAt sets ExpiredAt field to given value.


### SetExpiredAtNil

`func (o *RunStepObject) SetExpiredAtNil(b bool)`

 SetExpiredAtNil sets the value for ExpiredAt to be an explicit nil

### UnsetExpiredAt
`func (o *RunStepObject) UnsetExpiredAt()`

UnsetExpiredAt ensures that no value is present for ExpiredAt, not even an explicit nil
### GetCancelledAt

`func (o *RunStepObject) GetCancelledAt() int32`

GetCancelledAt returns the CancelledAt field if non-nil, zero value otherwise.

### GetCancelledAtOk

`func (o *RunStepObject) GetCancelledAtOk() (*int32, bool)`

GetCancelledAtOk returns a tuple with the CancelledAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCancelledAt

`func (o *RunStepObject) SetCancelledAt(v int32)`

SetCancelledAt sets CancelledAt field to given value.


### SetCancelledAtNil

`func (o *RunStepObject) SetCancelledAtNil(b bool)`

 SetCancelledAtNil sets the value for CancelledAt to be an explicit nil

### UnsetCancelledAt
`func (o *RunStepObject) UnsetCancelledAt()`

UnsetCancelledAt ensures that no value is present for CancelledAt, not even an explicit nil
### GetFailedAt

`func (o *RunStepObject) GetFailedAt() int32`

GetFailedAt returns the FailedAt field if non-nil, zero value otherwise.

### GetFailedAtOk

`func (o *RunStepObject) GetFailedAtOk() (*int32, bool)`

GetFailedAtOk returns a tuple with the FailedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFailedAt

`func (o *RunStepObject) SetFailedAt(v int32)`

SetFailedAt sets FailedAt field to given value.


### SetFailedAtNil

`func (o *RunStepObject) SetFailedAtNil(b bool)`

 SetFailedAtNil sets the value for FailedAt to be an explicit nil

### UnsetFailedAt
`func (o *RunStepObject) UnsetFailedAt()`

UnsetFailedAt ensures that no value is present for FailedAt, not even an explicit nil
### GetCompletedAt

`func (o *RunStepObject) GetCompletedAt() int32`

GetCompletedAt returns the CompletedAt field if non-nil, zero value otherwise.

### GetCompletedAtOk

`func (o *RunStepObject) GetCompletedAtOk() (*int32, bool)`

GetCompletedAtOk returns a tuple with the CompletedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompletedAt

`func (o *RunStepObject) SetCompletedAt(v int32)`

SetCompletedAt sets CompletedAt field to given value.


### SetCompletedAtNil

`func (o *RunStepObject) SetCompletedAtNil(b bool)`

 SetCompletedAtNil sets the value for CompletedAt to be an explicit nil

### UnsetCompletedAt
`func (o *RunStepObject) UnsetCompletedAt()`

UnsetCompletedAt ensures that no value is present for CompletedAt, not even an explicit nil
### GetMetadata

`func (o *RunStepObject) GetMetadata() map[string]interface{}`

GetMetadata returns the Metadata field if non-nil, zero value otherwise.

### GetMetadataOk

`func (o *RunStepObject) GetMetadataOk() (*map[string]interface{}, bool)`

GetMetadataOk returns a tuple with the Metadata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMetadata

`func (o *RunStepObject) SetMetadata(v map[string]interface{})`

SetMetadata sets Metadata field to given value.


### SetMetadataNil

`func (o *RunStepObject) SetMetadataNil(b bool)`

 SetMetadataNil sets the value for Metadata to be an explicit nil

### UnsetMetadata
`func (o *RunStepObject) UnsetMetadata()`

UnsetMetadata ensures that no value is present for Metadata, not even an explicit nil
### GetUsage

`func (o *RunStepObject) GetUsage() RunStepCompletionUsage`

GetUsage returns the Usage field if non-nil, zero value otherwise.

### GetUsageOk

`func (o *RunStepObject) GetUsageOk() (*RunStepCompletionUsage, bool)`

GetUsageOk returns a tuple with the Usage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsage

`func (o *RunStepObject) SetUsage(v RunStepCompletionUsage)`

SetUsage sets Usage field to given value.


### SetUsageNil

`func (o *RunStepObject) SetUsageNil(b bool)`

 SetUsageNil sets the value for Usage to be an explicit nil

### UnsetUsage
`func (o *RunStepObject) UnsetUsage()`

UnsetUsage ensures that no value is present for Usage, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


