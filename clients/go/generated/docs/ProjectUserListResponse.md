# ProjectUserListResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **string** |  | 
**Data** | [**[]ProjectUser**](ProjectUser.md) |  | 
**FirstId** | **string** |  | 
**LastId** | **string** |  | 
**HasMore** | **bool** |  | 

## Methods

### NewProjectUserListResponse

`func NewProjectUserListResponse(object string, data []ProjectUser, firstId string, lastId string, hasMore bool, ) *ProjectUserListResponse`

NewProjectUserListResponse instantiates a new ProjectUserListResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewProjectUserListResponseWithDefaults

`func NewProjectUserListResponseWithDefaults() *ProjectUserListResponse`

NewProjectUserListResponseWithDefaults instantiates a new ProjectUserListResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetObject

`func (o *ProjectUserListResponse) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *ProjectUserListResponse) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *ProjectUserListResponse) SetObject(v string)`

SetObject sets Object field to given value.


### GetData

`func (o *ProjectUserListResponse) GetData() []ProjectUser`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *ProjectUserListResponse) GetDataOk() (*[]ProjectUser, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *ProjectUserListResponse) SetData(v []ProjectUser)`

SetData sets Data field to given value.


### GetFirstId

`func (o *ProjectUserListResponse) GetFirstId() string`

GetFirstId returns the FirstId field if non-nil, zero value otherwise.

### GetFirstIdOk

`func (o *ProjectUserListResponse) GetFirstIdOk() (*string, bool)`

GetFirstIdOk returns a tuple with the FirstId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFirstId

`func (o *ProjectUserListResponse) SetFirstId(v string)`

SetFirstId sets FirstId field to given value.


### GetLastId

`func (o *ProjectUserListResponse) GetLastId() string`

GetLastId returns the LastId field if non-nil, zero value otherwise.

### GetLastIdOk

`func (o *ProjectUserListResponse) GetLastIdOk() (*string, bool)`

GetLastIdOk returns a tuple with the LastId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastId

`func (o *ProjectUserListResponse) SetLastId(v string)`

SetLastId sets LastId field to given value.


### GetHasMore

`func (o *ProjectUserListResponse) GetHasMore() bool`

GetHasMore returns the HasMore field if non-nil, zero value otherwise.

### GetHasMoreOk

`func (o *ProjectUserListResponse) GetHasMoreOk() (*bool, bool)`

GetHasMoreOk returns a tuple with the HasMore field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHasMore

`func (o *ProjectUserListResponse) SetHasMore(v bool)`

SetHasMore sets HasMore field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


