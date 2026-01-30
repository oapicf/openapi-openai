# Batch

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** |  | 
**Object** | **string** | The object type, which is always &#x60;batch&#x60;. | 
**Endpoint** | **string** | The OpenAI API endpoint used by the batch. | 
**Errors** | Pointer to [**BatchErrors**](BatchErrors.md) |  | [optional] 
**InputFileId** | **string** | The ID of the input file for the batch. | 
**CompletionWindow** | **string** | The time frame within which the batch should be processed. | 
**Status** | **string** | The current status of the batch. | 
**OutputFileId** | Pointer to **string** | The ID of the file containing the outputs of successfully executed requests. | [optional] 
**ErrorFileId** | Pointer to **string** | The ID of the file containing the outputs of requests with errors. | [optional] 
**CreatedAt** | **int32** | The Unix timestamp (in seconds) for when the batch was created. | 
**InProgressAt** | Pointer to **int32** | The Unix timestamp (in seconds) for when the batch started processing. | [optional] 
**ExpiresAt** | Pointer to **int32** | The Unix timestamp (in seconds) for when the batch will expire. | [optional] 
**FinalizingAt** | Pointer to **int32** | The Unix timestamp (in seconds) for when the batch started finalizing. | [optional] 
**CompletedAt** | Pointer to **int32** | The Unix timestamp (in seconds) for when the batch was completed. | [optional] 
**FailedAt** | Pointer to **int32** | The Unix timestamp (in seconds) for when the batch failed. | [optional] 
**ExpiredAt** | Pointer to **int32** | The Unix timestamp (in seconds) for when the batch expired. | [optional] 
**CancellingAt** | Pointer to **int32** | The Unix timestamp (in seconds) for when the batch started cancelling. | [optional] 
**CancelledAt** | Pointer to **int32** | The Unix timestamp (in seconds) for when the batch was cancelled. | [optional] 
**RequestCounts** | Pointer to [**BatchRequestCounts**](BatchRequestCounts.md) |  | [optional] 
**Metadata** | Pointer to **map[string]interface{}** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [optional] 

## Methods

### NewBatch

`func NewBatch(id string, object string, endpoint string, inputFileId string, completionWindow string, status string, createdAt int32, ) *Batch`

NewBatch instantiates a new Batch object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBatchWithDefaults

`func NewBatchWithDefaults() *Batch`

NewBatchWithDefaults instantiates a new Batch object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *Batch) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *Batch) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *Batch) SetId(v string)`

SetId sets Id field to given value.


### GetObject

`func (o *Batch) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *Batch) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *Batch) SetObject(v string)`

SetObject sets Object field to given value.


### GetEndpoint

`func (o *Batch) GetEndpoint() string`

GetEndpoint returns the Endpoint field if non-nil, zero value otherwise.

### GetEndpointOk

`func (o *Batch) GetEndpointOk() (*string, bool)`

GetEndpointOk returns a tuple with the Endpoint field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndpoint

`func (o *Batch) SetEndpoint(v string)`

SetEndpoint sets Endpoint field to given value.


### GetErrors

`func (o *Batch) GetErrors() BatchErrors`

GetErrors returns the Errors field if non-nil, zero value otherwise.

### GetErrorsOk

`func (o *Batch) GetErrorsOk() (*BatchErrors, bool)`

GetErrorsOk returns a tuple with the Errors field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetErrors

`func (o *Batch) SetErrors(v BatchErrors)`

SetErrors sets Errors field to given value.

### HasErrors

`func (o *Batch) HasErrors() bool`

HasErrors returns a boolean if a field has been set.

### GetInputFileId

`func (o *Batch) GetInputFileId() string`

GetInputFileId returns the InputFileId field if non-nil, zero value otherwise.

### GetInputFileIdOk

`func (o *Batch) GetInputFileIdOk() (*string, bool)`

GetInputFileIdOk returns a tuple with the InputFileId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInputFileId

`func (o *Batch) SetInputFileId(v string)`

SetInputFileId sets InputFileId field to given value.


### GetCompletionWindow

`func (o *Batch) GetCompletionWindow() string`

GetCompletionWindow returns the CompletionWindow field if non-nil, zero value otherwise.

### GetCompletionWindowOk

`func (o *Batch) GetCompletionWindowOk() (*string, bool)`

GetCompletionWindowOk returns a tuple with the CompletionWindow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompletionWindow

`func (o *Batch) SetCompletionWindow(v string)`

SetCompletionWindow sets CompletionWindow field to given value.


### GetStatus

`func (o *Batch) GetStatus() string`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *Batch) GetStatusOk() (*string, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *Batch) SetStatus(v string)`

SetStatus sets Status field to given value.


### GetOutputFileId

`func (o *Batch) GetOutputFileId() string`

GetOutputFileId returns the OutputFileId field if non-nil, zero value otherwise.

### GetOutputFileIdOk

`func (o *Batch) GetOutputFileIdOk() (*string, bool)`

GetOutputFileIdOk returns a tuple with the OutputFileId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOutputFileId

`func (o *Batch) SetOutputFileId(v string)`

SetOutputFileId sets OutputFileId field to given value.

### HasOutputFileId

`func (o *Batch) HasOutputFileId() bool`

HasOutputFileId returns a boolean if a field has been set.

### GetErrorFileId

`func (o *Batch) GetErrorFileId() string`

GetErrorFileId returns the ErrorFileId field if non-nil, zero value otherwise.

### GetErrorFileIdOk

`func (o *Batch) GetErrorFileIdOk() (*string, bool)`

GetErrorFileIdOk returns a tuple with the ErrorFileId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetErrorFileId

`func (o *Batch) SetErrorFileId(v string)`

SetErrorFileId sets ErrorFileId field to given value.

### HasErrorFileId

`func (o *Batch) HasErrorFileId() bool`

HasErrorFileId returns a boolean if a field has been set.

### GetCreatedAt

`func (o *Batch) GetCreatedAt() int32`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *Batch) GetCreatedAtOk() (*int32, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *Batch) SetCreatedAt(v int32)`

SetCreatedAt sets CreatedAt field to given value.


### GetInProgressAt

`func (o *Batch) GetInProgressAt() int32`

GetInProgressAt returns the InProgressAt field if non-nil, zero value otherwise.

### GetInProgressAtOk

`func (o *Batch) GetInProgressAtOk() (*int32, bool)`

GetInProgressAtOk returns a tuple with the InProgressAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInProgressAt

`func (o *Batch) SetInProgressAt(v int32)`

SetInProgressAt sets InProgressAt field to given value.

### HasInProgressAt

`func (o *Batch) HasInProgressAt() bool`

HasInProgressAt returns a boolean if a field has been set.

### GetExpiresAt

`func (o *Batch) GetExpiresAt() int32`

GetExpiresAt returns the ExpiresAt field if non-nil, zero value otherwise.

### GetExpiresAtOk

`func (o *Batch) GetExpiresAtOk() (*int32, bool)`

GetExpiresAtOk returns a tuple with the ExpiresAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExpiresAt

`func (o *Batch) SetExpiresAt(v int32)`

SetExpiresAt sets ExpiresAt field to given value.

### HasExpiresAt

`func (o *Batch) HasExpiresAt() bool`

HasExpiresAt returns a boolean if a field has been set.

### GetFinalizingAt

`func (o *Batch) GetFinalizingAt() int32`

GetFinalizingAt returns the FinalizingAt field if non-nil, zero value otherwise.

### GetFinalizingAtOk

`func (o *Batch) GetFinalizingAtOk() (*int32, bool)`

GetFinalizingAtOk returns a tuple with the FinalizingAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFinalizingAt

`func (o *Batch) SetFinalizingAt(v int32)`

SetFinalizingAt sets FinalizingAt field to given value.

### HasFinalizingAt

`func (o *Batch) HasFinalizingAt() bool`

HasFinalizingAt returns a boolean if a field has been set.

### GetCompletedAt

`func (o *Batch) GetCompletedAt() int32`

GetCompletedAt returns the CompletedAt field if non-nil, zero value otherwise.

### GetCompletedAtOk

`func (o *Batch) GetCompletedAtOk() (*int32, bool)`

GetCompletedAtOk returns a tuple with the CompletedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompletedAt

`func (o *Batch) SetCompletedAt(v int32)`

SetCompletedAt sets CompletedAt field to given value.

### HasCompletedAt

`func (o *Batch) HasCompletedAt() bool`

HasCompletedAt returns a boolean if a field has been set.

### GetFailedAt

`func (o *Batch) GetFailedAt() int32`

GetFailedAt returns the FailedAt field if non-nil, zero value otherwise.

### GetFailedAtOk

`func (o *Batch) GetFailedAtOk() (*int32, bool)`

GetFailedAtOk returns a tuple with the FailedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFailedAt

`func (o *Batch) SetFailedAt(v int32)`

SetFailedAt sets FailedAt field to given value.

### HasFailedAt

`func (o *Batch) HasFailedAt() bool`

HasFailedAt returns a boolean if a field has been set.

### GetExpiredAt

`func (o *Batch) GetExpiredAt() int32`

GetExpiredAt returns the ExpiredAt field if non-nil, zero value otherwise.

### GetExpiredAtOk

`func (o *Batch) GetExpiredAtOk() (*int32, bool)`

GetExpiredAtOk returns a tuple with the ExpiredAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExpiredAt

`func (o *Batch) SetExpiredAt(v int32)`

SetExpiredAt sets ExpiredAt field to given value.

### HasExpiredAt

`func (o *Batch) HasExpiredAt() bool`

HasExpiredAt returns a boolean if a field has been set.

### GetCancellingAt

`func (o *Batch) GetCancellingAt() int32`

GetCancellingAt returns the CancellingAt field if non-nil, zero value otherwise.

### GetCancellingAtOk

`func (o *Batch) GetCancellingAtOk() (*int32, bool)`

GetCancellingAtOk returns a tuple with the CancellingAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCancellingAt

`func (o *Batch) SetCancellingAt(v int32)`

SetCancellingAt sets CancellingAt field to given value.

### HasCancellingAt

`func (o *Batch) HasCancellingAt() bool`

HasCancellingAt returns a boolean if a field has been set.

### GetCancelledAt

`func (o *Batch) GetCancelledAt() int32`

GetCancelledAt returns the CancelledAt field if non-nil, zero value otherwise.

### GetCancelledAtOk

`func (o *Batch) GetCancelledAtOk() (*int32, bool)`

GetCancelledAtOk returns a tuple with the CancelledAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCancelledAt

`func (o *Batch) SetCancelledAt(v int32)`

SetCancelledAt sets CancelledAt field to given value.

### HasCancelledAt

`func (o *Batch) HasCancelledAt() bool`

HasCancelledAt returns a boolean if a field has been set.

### GetRequestCounts

`func (o *Batch) GetRequestCounts() BatchRequestCounts`

GetRequestCounts returns the RequestCounts field if non-nil, zero value otherwise.

### GetRequestCountsOk

`func (o *Batch) GetRequestCountsOk() (*BatchRequestCounts, bool)`

GetRequestCountsOk returns a tuple with the RequestCounts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRequestCounts

`func (o *Batch) SetRequestCounts(v BatchRequestCounts)`

SetRequestCounts sets RequestCounts field to given value.

### HasRequestCounts

`func (o *Batch) HasRequestCounts() bool`

HasRequestCounts returns a boolean if a field has been set.

### GetMetadata

`func (o *Batch) GetMetadata() map[string]interface{}`

GetMetadata returns the Metadata field if non-nil, zero value otherwise.

### GetMetadataOk

`func (o *Batch) GetMetadataOk() (*map[string]interface{}, bool)`

GetMetadataOk returns a tuple with the Metadata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMetadata

`func (o *Batch) SetMetadata(v map[string]interface{})`

SetMetadata sets Metadata field to given value.

### HasMetadata

`func (o *Batch) HasMetadata() bool`

HasMetadata returns a boolean if a field has been set.

### SetMetadataNil

`func (o *Batch) SetMetadataNil(b bool)`

 SetMetadataNil sets the value for Metadata to be an explicit nil

### UnsetMetadata
`func (o *Batch) UnsetMetadata()`

UnsetMetadata ensures that no value is present for Metadata, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


