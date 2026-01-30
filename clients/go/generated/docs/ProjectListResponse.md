# ProjectListResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **string** |  | 
**Data** | [**[]Project**](Project.md) |  | 
**FirstId** | **string** |  | 
**LastId** | **string** |  | 
**HasMore** | **bool** |  | 

## Methods

### NewProjectListResponse

`func NewProjectListResponse(object string, data []Project, firstId string, lastId string, hasMore bool, ) *ProjectListResponse`

NewProjectListResponse instantiates a new ProjectListResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewProjectListResponseWithDefaults

`func NewProjectListResponseWithDefaults() *ProjectListResponse`

NewProjectListResponseWithDefaults instantiates a new ProjectListResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetObject

`func (o *ProjectListResponse) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *ProjectListResponse) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *ProjectListResponse) SetObject(v string)`

SetObject sets Object field to given value.


### GetData

`func (o *ProjectListResponse) GetData() []Project`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *ProjectListResponse) GetDataOk() (*[]Project, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *ProjectListResponse) SetData(v []Project)`

SetData sets Data field to given value.


### GetFirstId

`func (o *ProjectListResponse) GetFirstId() string`

GetFirstId returns the FirstId field if non-nil, zero value otherwise.

### GetFirstIdOk

`func (o *ProjectListResponse) GetFirstIdOk() (*string, bool)`

GetFirstIdOk returns a tuple with the FirstId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFirstId

`func (o *ProjectListResponse) SetFirstId(v string)`

SetFirstId sets FirstId field to given value.


### GetLastId

`func (o *ProjectListResponse) GetLastId() string`

GetLastId returns the LastId field if non-nil, zero value otherwise.

### GetLastIdOk

`func (o *ProjectListResponse) GetLastIdOk() (*string, bool)`

GetLastIdOk returns a tuple with the LastId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastId

`func (o *ProjectListResponse) SetLastId(v string)`

SetLastId sets LastId field to given value.


### GetHasMore

`func (o *ProjectListResponse) GetHasMore() bool`

GetHasMore returns the HasMore field if non-nil, zero value otherwise.

### GetHasMoreOk

`func (o *ProjectListResponse) GetHasMoreOk() (*bool, bool)`

GetHasMoreOk returns a tuple with the HasMore field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHasMore

`func (o *ProjectListResponse) SetHasMore(v bool)`

SetHasMore sets HasMore field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


