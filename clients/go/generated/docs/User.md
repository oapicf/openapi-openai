# User

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **string** | The object type, which is always &#x60;organization.user&#x60; | 
**Id** | **string** | The identifier, which can be referenced in API endpoints | 
**Name** | **string** | The name of the user | 
**Email** | **string** | The email address of the user | 
**Role** | **string** | &#x60;owner&#x60; or &#x60;reader&#x60; | 
**AddedAt** | **int32** | The Unix timestamp (in seconds) of when the user was added. | 

## Methods

### NewUser

`func NewUser(object string, id string, name string, email string, role string, addedAt int32, ) *User`

NewUser instantiates a new User object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUserWithDefaults

`func NewUserWithDefaults() *User`

NewUserWithDefaults instantiates a new User object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetObject

`func (o *User) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *User) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *User) SetObject(v string)`

SetObject sets Object field to given value.


### GetId

`func (o *User) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *User) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *User) SetId(v string)`

SetId sets Id field to given value.


### GetName

`func (o *User) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *User) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *User) SetName(v string)`

SetName sets Name field to given value.


### GetEmail

`func (o *User) GetEmail() string`

GetEmail returns the Email field if non-nil, zero value otherwise.

### GetEmailOk

`func (o *User) GetEmailOk() (*string, bool)`

GetEmailOk returns a tuple with the Email field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmail

`func (o *User) SetEmail(v string)`

SetEmail sets Email field to given value.


### GetRole

`func (o *User) GetRole() string`

GetRole returns the Role field if non-nil, zero value otherwise.

### GetRoleOk

`func (o *User) GetRoleOk() (*string, bool)`

GetRoleOk returns a tuple with the Role field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRole

`func (o *User) SetRole(v string)`

SetRole sets Role field to given value.


### GetAddedAt

`func (o *User) GetAddedAt() int32`

GetAddedAt returns the AddedAt field if non-nil, zero value otherwise.

### GetAddedAtOk

`func (o *User) GetAddedAtOk() (*int32, bool)`

GetAddedAtOk returns a tuple with the AddedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAddedAt

`func (o *User) SetAddedAt(v int32)`

SetAddedAt sets AddedAt field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


