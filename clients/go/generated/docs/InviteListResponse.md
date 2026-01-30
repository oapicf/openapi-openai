# InviteListResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **string** | The object type, which is always &#x60;list&#x60; | 
**Data** | [**[]Invite**](Invite.md) |  | 
**FirstId** | Pointer to **string** | The first &#x60;invite_id&#x60; in the retrieved &#x60;list&#x60; | [optional] 
**LastId** | Pointer to **string** | The last &#x60;invite_id&#x60; in the retrieved &#x60;list&#x60; | [optional] 
**HasMore** | Pointer to **bool** | The &#x60;has_more&#x60; property is used for pagination to indicate there are additional results. | [optional] 

## Methods

### NewInviteListResponse

`func NewInviteListResponse(object string, data []Invite, ) *InviteListResponse`

NewInviteListResponse instantiates a new InviteListResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewInviteListResponseWithDefaults

`func NewInviteListResponseWithDefaults() *InviteListResponse`

NewInviteListResponseWithDefaults instantiates a new InviteListResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetObject

`func (o *InviteListResponse) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *InviteListResponse) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *InviteListResponse) SetObject(v string)`

SetObject sets Object field to given value.


### GetData

`func (o *InviteListResponse) GetData() []Invite`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *InviteListResponse) GetDataOk() (*[]Invite, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *InviteListResponse) SetData(v []Invite)`

SetData sets Data field to given value.


### GetFirstId

`func (o *InviteListResponse) GetFirstId() string`

GetFirstId returns the FirstId field if non-nil, zero value otherwise.

### GetFirstIdOk

`func (o *InviteListResponse) GetFirstIdOk() (*string, bool)`

GetFirstIdOk returns a tuple with the FirstId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFirstId

`func (o *InviteListResponse) SetFirstId(v string)`

SetFirstId sets FirstId field to given value.

### HasFirstId

`func (o *InviteListResponse) HasFirstId() bool`

HasFirstId returns a boolean if a field has been set.

### GetLastId

`func (o *InviteListResponse) GetLastId() string`

GetLastId returns the LastId field if non-nil, zero value otherwise.

### GetLastIdOk

`func (o *InviteListResponse) GetLastIdOk() (*string, bool)`

GetLastIdOk returns a tuple with the LastId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastId

`func (o *InviteListResponse) SetLastId(v string)`

SetLastId sets LastId field to given value.

### HasLastId

`func (o *InviteListResponse) HasLastId() bool`

HasLastId returns a boolean if a field has been set.

### GetHasMore

`func (o *InviteListResponse) GetHasMore() bool`

GetHasMore returns the HasMore field if non-nil, zero value otherwise.

### GetHasMoreOk

`func (o *InviteListResponse) GetHasMoreOk() (*bool, bool)`

GetHasMoreOk returns a tuple with the HasMore field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHasMore

`func (o *InviteListResponse) SetHasMore(v bool)`

SetHasMore sets HasMore field to given value.

### HasHasMore

`func (o *InviteListResponse) HasHasMore() bool`

HasHasMore returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


