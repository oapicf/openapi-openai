# BatchRequestCounts

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Total** | **int32** | Total number of requests in the batch. | 
**Completed** | **int32** | Number of requests that have been completed successfully. | 
**Failed** | **int32** | Number of requests that have failed. | 

## Methods

### NewBatchRequestCounts

`func NewBatchRequestCounts(total int32, completed int32, failed int32, ) *BatchRequestCounts`

NewBatchRequestCounts instantiates a new BatchRequestCounts object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBatchRequestCountsWithDefaults

`func NewBatchRequestCountsWithDefaults() *BatchRequestCounts`

NewBatchRequestCountsWithDefaults instantiates a new BatchRequestCounts object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetTotal

`func (o *BatchRequestCounts) GetTotal() int32`

GetTotal returns the Total field if non-nil, zero value otherwise.

### GetTotalOk

`func (o *BatchRequestCounts) GetTotalOk() (*int32, bool)`

GetTotalOk returns a tuple with the Total field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotal

`func (o *BatchRequestCounts) SetTotal(v int32)`

SetTotal sets Total field to given value.


### GetCompleted

`func (o *BatchRequestCounts) GetCompleted() int32`

GetCompleted returns the Completed field if non-nil, zero value otherwise.

### GetCompletedOk

`func (o *BatchRequestCounts) GetCompletedOk() (*int32, bool)`

GetCompletedOk returns a tuple with the Completed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompleted

`func (o *BatchRequestCounts) SetCompleted(v int32)`

SetCompleted sets Completed field to given value.


### GetFailed

`func (o *BatchRequestCounts) GetFailed() int32`

GetFailed returns the Failed field if non-nil, zero value otherwise.

### GetFailedOk

`func (o *BatchRequestCounts) GetFailedOk() (*int32, bool)`

GetFailedOk returns a tuple with the Failed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFailed

`func (o *BatchRequestCounts) SetFailed(v int32)`

SetFailed sets Failed field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


