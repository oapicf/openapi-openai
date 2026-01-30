# VectorStoreObjectFileCounts

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**InProgress** | **int32** | The number of files that are currently being processed. | 
**Completed** | **int32** | The number of files that have been successfully processed. | 
**Failed** | **int32** | The number of files that have failed to process. | 
**Cancelled** | **int32** | The number of files that were cancelled. | 
**Total** | **int32** | The total number of files. | 

## Methods

### NewVectorStoreObjectFileCounts

`func NewVectorStoreObjectFileCounts(inProgress int32, completed int32, failed int32, cancelled int32, total int32, ) *VectorStoreObjectFileCounts`

NewVectorStoreObjectFileCounts instantiates a new VectorStoreObjectFileCounts object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewVectorStoreObjectFileCountsWithDefaults

`func NewVectorStoreObjectFileCountsWithDefaults() *VectorStoreObjectFileCounts`

NewVectorStoreObjectFileCountsWithDefaults instantiates a new VectorStoreObjectFileCounts object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetInProgress

`func (o *VectorStoreObjectFileCounts) GetInProgress() int32`

GetInProgress returns the InProgress field if non-nil, zero value otherwise.

### GetInProgressOk

`func (o *VectorStoreObjectFileCounts) GetInProgressOk() (*int32, bool)`

GetInProgressOk returns a tuple with the InProgress field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInProgress

`func (o *VectorStoreObjectFileCounts) SetInProgress(v int32)`

SetInProgress sets InProgress field to given value.


### GetCompleted

`func (o *VectorStoreObjectFileCounts) GetCompleted() int32`

GetCompleted returns the Completed field if non-nil, zero value otherwise.

### GetCompletedOk

`func (o *VectorStoreObjectFileCounts) GetCompletedOk() (*int32, bool)`

GetCompletedOk returns a tuple with the Completed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompleted

`func (o *VectorStoreObjectFileCounts) SetCompleted(v int32)`

SetCompleted sets Completed field to given value.


### GetFailed

`func (o *VectorStoreObjectFileCounts) GetFailed() int32`

GetFailed returns the Failed field if non-nil, zero value otherwise.

### GetFailedOk

`func (o *VectorStoreObjectFileCounts) GetFailedOk() (*int32, bool)`

GetFailedOk returns a tuple with the Failed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFailed

`func (o *VectorStoreObjectFileCounts) SetFailed(v int32)`

SetFailed sets Failed field to given value.


### GetCancelled

`func (o *VectorStoreObjectFileCounts) GetCancelled() int32`

GetCancelled returns the Cancelled field if non-nil, zero value otherwise.

### GetCancelledOk

`func (o *VectorStoreObjectFileCounts) GetCancelledOk() (*int32, bool)`

GetCancelledOk returns a tuple with the Cancelled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCancelled

`func (o *VectorStoreObjectFileCounts) SetCancelled(v int32)`

SetCancelled sets Cancelled field to given value.


### GetTotal

`func (o *VectorStoreObjectFileCounts) GetTotal() int32`

GetTotal returns the Total field if non-nil, zero value otherwise.

### GetTotalOk

`func (o *VectorStoreObjectFileCounts) GetTotalOk() (*int32, bool)`

GetTotalOk returns a tuple with the Total field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotal

`func (o *VectorStoreObjectFileCounts) SetTotal(v int32)`

SetTotal sets Total field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


