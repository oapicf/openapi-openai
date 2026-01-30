# ListBatchesResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Data** | [**[]Batch**](Batch.md) |  | 
**FirstId** | Pointer to **string** |  | [optional] 
**LastId** | Pointer to **string** |  | [optional] 
**HasMore** | **bool** |  | 
**Object** | **string** |  | 

## Methods

### NewListBatchesResponse

`func NewListBatchesResponse(data []Batch, hasMore bool, object string, ) *ListBatchesResponse`

NewListBatchesResponse instantiates a new ListBatchesResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewListBatchesResponseWithDefaults

`func NewListBatchesResponseWithDefaults() *ListBatchesResponse`

NewListBatchesResponseWithDefaults instantiates a new ListBatchesResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetData

`func (o *ListBatchesResponse) GetData() []Batch`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *ListBatchesResponse) GetDataOk() (*[]Batch, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *ListBatchesResponse) SetData(v []Batch)`

SetData sets Data field to given value.


### GetFirstId

`func (o *ListBatchesResponse) GetFirstId() string`

GetFirstId returns the FirstId field if non-nil, zero value otherwise.

### GetFirstIdOk

`func (o *ListBatchesResponse) GetFirstIdOk() (*string, bool)`

GetFirstIdOk returns a tuple with the FirstId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFirstId

`func (o *ListBatchesResponse) SetFirstId(v string)`

SetFirstId sets FirstId field to given value.

### HasFirstId

`func (o *ListBatchesResponse) HasFirstId() bool`

HasFirstId returns a boolean if a field has been set.

### GetLastId

`func (o *ListBatchesResponse) GetLastId() string`

GetLastId returns the LastId field if non-nil, zero value otherwise.

### GetLastIdOk

`func (o *ListBatchesResponse) GetLastIdOk() (*string, bool)`

GetLastIdOk returns a tuple with the LastId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastId

`func (o *ListBatchesResponse) SetLastId(v string)`

SetLastId sets LastId field to given value.

### HasLastId

`func (o *ListBatchesResponse) HasLastId() bool`

HasLastId returns a boolean if a field has been set.

### GetHasMore

`func (o *ListBatchesResponse) GetHasMore() bool`

GetHasMore returns the HasMore field if non-nil, zero value otherwise.

### GetHasMoreOk

`func (o *ListBatchesResponse) GetHasMoreOk() (*bool, bool)`

GetHasMoreOk returns a tuple with the HasMore field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHasMore

`func (o *ListBatchesResponse) SetHasMore(v bool)`

SetHasMore sets HasMore field to given value.


### GetObject

`func (o *ListBatchesResponse) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *ListBatchesResponse) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *ListBatchesResponse) SetObject(v string)`

SetObject sets Object field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


