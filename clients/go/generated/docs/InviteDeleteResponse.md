# InviteDeleteResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **string** | The object type, which is always &#x60;organization.invite.deleted&#x60; | 
**Id** | **string** |  | 
**Deleted** | **bool** |  | 

## Methods

### NewInviteDeleteResponse

`func NewInviteDeleteResponse(object string, id string, deleted bool, ) *InviteDeleteResponse`

NewInviteDeleteResponse instantiates a new InviteDeleteResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewInviteDeleteResponseWithDefaults

`func NewInviteDeleteResponseWithDefaults() *InviteDeleteResponse`

NewInviteDeleteResponseWithDefaults instantiates a new InviteDeleteResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetObject

`func (o *InviteDeleteResponse) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *InviteDeleteResponse) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *InviteDeleteResponse) SetObject(v string)`

SetObject sets Object field to given value.


### GetId

`func (o *InviteDeleteResponse) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *InviteDeleteResponse) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *InviteDeleteResponse) SetId(v string)`

SetId sets Id field to given value.


### GetDeleted

`func (o *InviteDeleteResponse) GetDeleted() bool`

GetDeleted returns the Deleted field if non-nil, zero value otherwise.

### GetDeletedOk

`func (o *InviteDeleteResponse) GetDeletedOk() (*bool, bool)`

GetDeletedOk returns a tuple with the Deleted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeleted

`func (o *InviteDeleteResponse) SetDeleted(v bool)`

SetDeleted sets Deleted field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


