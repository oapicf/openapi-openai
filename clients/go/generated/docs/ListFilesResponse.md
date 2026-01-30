# ListFilesResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **string** |  | 
**Data** | [**[]OpenAIFile**](OpenAIFile.md) |  | 
**FirstId** | **string** |  | 
**LastId** | **string** |  | 
**HasMore** | **bool** |  | 

## Methods

### NewListFilesResponse

`func NewListFilesResponse(object string, data []OpenAIFile, firstId string, lastId string, hasMore bool, ) *ListFilesResponse`

NewListFilesResponse instantiates a new ListFilesResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewListFilesResponseWithDefaults

`func NewListFilesResponseWithDefaults() *ListFilesResponse`

NewListFilesResponseWithDefaults instantiates a new ListFilesResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetObject

`func (o *ListFilesResponse) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *ListFilesResponse) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *ListFilesResponse) SetObject(v string)`

SetObject sets Object field to given value.


### GetData

`func (o *ListFilesResponse) GetData() []OpenAIFile`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *ListFilesResponse) GetDataOk() (*[]OpenAIFile, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *ListFilesResponse) SetData(v []OpenAIFile)`

SetData sets Data field to given value.


### GetFirstId

`func (o *ListFilesResponse) GetFirstId() string`

GetFirstId returns the FirstId field if non-nil, zero value otherwise.

### GetFirstIdOk

`func (o *ListFilesResponse) GetFirstIdOk() (*string, bool)`

GetFirstIdOk returns a tuple with the FirstId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFirstId

`func (o *ListFilesResponse) SetFirstId(v string)`

SetFirstId sets FirstId field to given value.


### GetLastId

`func (o *ListFilesResponse) GetLastId() string`

GetLastId returns the LastId field if non-nil, zero value otherwise.

### GetLastIdOk

`func (o *ListFilesResponse) GetLastIdOk() (*string, bool)`

GetLastIdOk returns a tuple with the LastId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastId

`func (o *ListFilesResponse) SetLastId(v string)`

SetLastId sets LastId field to given value.


### GetHasMore

`func (o *ListFilesResponse) GetHasMore() bool`

GetHasMore returns the HasMore field if non-nil, zero value otherwise.

### GetHasMoreOk

`func (o *ListFilesResponse) GetHasMoreOk() (*bool, bool)`

GetHasMoreOk returns a tuple with the HasMore field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHasMore

`func (o *ListFilesResponse) SetHasMore(v bool)`

SetHasMore sets HasMore field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


