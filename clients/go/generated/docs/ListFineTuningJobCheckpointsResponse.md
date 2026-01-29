# ListFineTuningJobCheckpointsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Data** | [**[]FineTuningJobCheckpoint**](FineTuningJobCheckpoint.md) |  | 
**Object** | **string** |  | 
**FirstId** | Pointer to **NullableString** |  | [optional] 
**LastId** | Pointer to **NullableString** |  | [optional] 
**HasMore** | **bool** |  | 

## Methods

### NewListFineTuningJobCheckpointsResponse

`func NewListFineTuningJobCheckpointsResponse(data []FineTuningJobCheckpoint, object string, hasMore bool, ) *ListFineTuningJobCheckpointsResponse`

NewListFineTuningJobCheckpointsResponse instantiates a new ListFineTuningJobCheckpointsResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewListFineTuningJobCheckpointsResponseWithDefaults

`func NewListFineTuningJobCheckpointsResponseWithDefaults() *ListFineTuningJobCheckpointsResponse`

NewListFineTuningJobCheckpointsResponseWithDefaults instantiates a new ListFineTuningJobCheckpointsResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetData

`func (o *ListFineTuningJobCheckpointsResponse) GetData() []FineTuningJobCheckpoint`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *ListFineTuningJobCheckpointsResponse) GetDataOk() (*[]FineTuningJobCheckpoint, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *ListFineTuningJobCheckpointsResponse) SetData(v []FineTuningJobCheckpoint)`

SetData sets Data field to given value.


### GetObject

`func (o *ListFineTuningJobCheckpointsResponse) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *ListFineTuningJobCheckpointsResponse) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *ListFineTuningJobCheckpointsResponse) SetObject(v string)`

SetObject sets Object field to given value.


### GetFirstId

`func (o *ListFineTuningJobCheckpointsResponse) GetFirstId() string`

GetFirstId returns the FirstId field if non-nil, zero value otherwise.

### GetFirstIdOk

`func (o *ListFineTuningJobCheckpointsResponse) GetFirstIdOk() (*string, bool)`

GetFirstIdOk returns a tuple with the FirstId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFirstId

`func (o *ListFineTuningJobCheckpointsResponse) SetFirstId(v string)`

SetFirstId sets FirstId field to given value.

### HasFirstId

`func (o *ListFineTuningJobCheckpointsResponse) HasFirstId() bool`

HasFirstId returns a boolean if a field has been set.

### SetFirstIdNil

`func (o *ListFineTuningJobCheckpointsResponse) SetFirstIdNil(b bool)`

 SetFirstIdNil sets the value for FirstId to be an explicit nil

### UnsetFirstId
`func (o *ListFineTuningJobCheckpointsResponse) UnsetFirstId()`

UnsetFirstId ensures that no value is present for FirstId, not even an explicit nil
### GetLastId

`func (o *ListFineTuningJobCheckpointsResponse) GetLastId() string`

GetLastId returns the LastId field if non-nil, zero value otherwise.

### GetLastIdOk

`func (o *ListFineTuningJobCheckpointsResponse) GetLastIdOk() (*string, bool)`

GetLastIdOk returns a tuple with the LastId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastId

`func (o *ListFineTuningJobCheckpointsResponse) SetLastId(v string)`

SetLastId sets LastId field to given value.

### HasLastId

`func (o *ListFineTuningJobCheckpointsResponse) HasLastId() bool`

HasLastId returns a boolean if a field has been set.

### SetLastIdNil

`func (o *ListFineTuningJobCheckpointsResponse) SetLastIdNil(b bool)`

 SetLastIdNil sets the value for LastId to be an explicit nil

### UnsetLastId
`func (o *ListFineTuningJobCheckpointsResponse) UnsetLastId()`

UnsetLastId ensures that no value is present for LastId, not even an explicit nil
### GetHasMore

`func (o *ListFineTuningJobCheckpointsResponse) GetHasMore() bool`

GetHasMore returns the HasMore field if non-nil, zero value otherwise.

### GetHasMoreOk

`func (o *ListFineTuningJobCheckpointsResponse) GetHasMoreOk() (*bool, bool)`

GetHasMoreOk returns a tuple with the HasMore field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHasMore

`func (o *ListFineTuningJobCheckpointsResponse) SetHasMore(v bool)`

SetHasMore sets HasMore field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


