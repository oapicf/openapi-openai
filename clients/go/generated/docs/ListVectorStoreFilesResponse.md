# ListVectorStoreFilesResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **string** |  | 
**Data** | [**[]VectorStoreFileObject**](VectorStoreFileObject.md) |  | 
**FirstId** | **string** |  | 
**LastId** | **string** |  | 
**HasMore** | **bool** |  | 

## Methods

### NewListVectorStoreFilesResponse

`func NewListVectorStoreFilesResponse(object string, data []VectorStoreFileObject, firstId string, lastId string, hasMore bool, ) *ListVectorStoreFilesResponse`

NewListVectorStoreFilesResponse instantiates a new ListVectorStoreFilesResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewListVectorStoreFilesResponseWithDefaults

`func NewListVectorStoreFilesResponseWithDefaults() *ListVectorStoreFilesResponse`

NewListVectorStoreFilesResponseWithDefaults instantiates a new ListVectorStoreFilesResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetObject

`func (o *ListVectorStoreFilesResponse) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *ListVectorStoreFilesResponse) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *ListVectorStoreFilesResponse) SetObject(v string)`

SetObject sets Object field to given value.


### GetData

`func (o *ListVectorStoreFilesResponse) GetData() []VectorStoreFileObject`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *ListVectorStoreFilesResponse) GetDataOk() (*[]VectorStoreFileObject, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *ListVectorStoreFilesResponse) SetData(v []VectorStoreFileObject)`

SetData sets Data field to given value.


### GetFirstId

`func (o *ListVectorStoreFilesResponse) GetFirstId() string`

GetFirstId returns the FirstId field if non-nil, zero value otherwise.

### GetFirstIdOk

`func (o *ListVectorStoreFilesResponse) GetFirstIdOk() (*string, bool)`

GetFirstIdOk returns a tuple with the FirstId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFirstId

`func (o *ListVectorStoreFilesResponse) SetFirstId(v string)`

SetFirstId sets FirstId field to given value.


### GetLastId

`func (o *ListVectorStoreFilesResponse) GetLastId() string`

GetLastId returns the LastId field if non-nil, zero value otherwise.

### GetLastIdOk

`func (o *ListVectorStoreFilesResponse) GetLastIdOk() (*string, bool)`

GetLastIdOk returns a tuple with the LastId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastId

`func (o *ListVectorStoreFilesResponse) SetLastId(v string)`

SetLastId sets LastId field to given value.


### GetHasMore

`func (o *ListVectorStoreFilesResponse) GetHasMore() bool`

GetHasMore returns the HasMore field if non-nil, zero value otherwise.

### GetHasMoreOk

`func (o *ListVectorStoreFilesResponse) GetHasMoreOk() (*bool, bool)`

GetHasMoreOk returns a tuple with the HasMore field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHasMore

`func (o *ListVectorStoreFilesResponse) SetHasMore(v bool)`

SetHasMore sets HasMore field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


