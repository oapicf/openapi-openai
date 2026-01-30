# ListVectorStoresResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **string** |  | 
**Data** | [**[]VectorStoreObject**](VectorStoreObject.md) |  | 
**FirstId** | **string** |  | 
**LastId** | **string** |  | 
**HasMore** | **bool** |  | 

## Methods

### NewListVectorStoresResponse

`func NewListVectorStoresResponse(object string, data []VectorStoreObject, firstId string, lastId string, hasMore bool, ) *ListVectorStoresResponse`

NewListVectorStoresResponse instantiates a new ListVectorStoresResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewListVectorStoresResponseWithDefaults

`func NewListVectorStoresResponseWithDefaults() *ListVectorStoresResponse`

NewListVectorStoresResponseWithDefaults instantiates a new ListVectorStoresResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetObject

`func (o *ListVectorStoresResponse) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *ListVectorStoresResponse) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *ListVectorStoresResponse) SetObject(v string)`

SetObject sets Object field to given value.


### GetData

`func (o *ListVectorStoresResponse) GetData() []VectorStoreObject`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *ListVectorStoresResponse) GetDataOk() (*[]VectorStoreObject, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *ListVectorStoresResponse) SetData(v []VectorStoreObject)`

SetData sets Data field to given value.


### GetFirstId

`func (o *ListVectorStoresResponse) GetFirstId() string`

GetFirstId returns the FirstId field if non-nil, zero value otherwise.

### GetFirstIdOk

`func (o *ListVectorStoresResponse) GetFirstIdOk() (*string, bool)`

GetFirstIdOk returns a tuple with the FirstId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFirstId

`func (o *ListVectorStoresResponse) SetFirstId(v string)`

SetFirstId sets FirstId field to given value.


### GetLastId

`func (o *ListVectorStoresResponse) GetLastId() string`

GetLastId returns the LastId field if non-nil, zero value otherwise.

### GetLastIdOk

`func (o *ListVectorStoresResponse) GetLastIdOk() (*string, bool)`

GetLastIdOk returns a tuple with the LastId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastId

`func (o *ListVectorStoresResponse) SetLastId(v string)`

SetLastId sets LastId field to given value.


### GetHasMore

`func (o *ListVectorStoresResponse) GetHasMore() bool`

GetHasMore returns the HasMore field if non-nil, zero value otherwise.

### GetHasMoreOk

`func (o *ListVectorStoresResponse) GetHasMoreOk() (*bool, bool)`

GetHasMoreOk returns a tuple with the HasMore field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHasMore

`func (o *ListVectorStoresResponse) SetHasMore(v bool)`

SetHasMore sets HasMore field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


