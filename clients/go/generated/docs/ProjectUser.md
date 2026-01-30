# ProjectUser

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **string** | The object type, which is always &#x60;organization.project.user&#x60; | 
**Id** | **string** | The identifier, which can be referenced in API endpoints | 
**Name** | **string** | The name of the user | 
**Email** | **string** | The email address of the user | 
**Role** | **string** | &#x60;owner&#x60; or &#x60;member&#x60; | 
**AddedAt** | **int32** | The Unix timestamp (in seconds) of when the project was added. | 

## Methods

### NewProjectUser

`func NewProjectUser(object string, id string, name string, email string, role string, addedAt int32, ) *ProjectUser`

NewProjectUser instantiates a new ProjectUser object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewProjectUserWithDefaults

`func NewProjectUserWithDefaults() *ProjectUser`

NewProjectUserWithDefaults instantiates a new ProjectUser object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetObject

`func (o *ProjectUser) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *ProjectUser) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *ProjectUser) SetObject(v string)`

SetObject sets Object field to given value.


### GetId

`func (o *ProjectUser) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ProjectUser) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ProjectUser) SetId(v string)`

SetId sets Id field to given value.


### GetName

`func (o *ProjectUser) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ProjectUser) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ProjectUser) SetName(v string)`

SetName sets Name field to given value.


### GetEmail

`func (o *ProjectUser) GetEmail() string`

GetEmail returns the Email field if non-nil, zero value otherwise.

### GetEmailOk

`func (o *ProjectUser) GetEmailOk() (*string, bool)`

GetEmailOk returns a tuple with the Email field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmail

`func (o *ProjectUser) SetEmail(v string)`

SetEmail sets Email field to given value.


### GetRole

`func (o *ProjectUser) GetRole() string`

GetRole returns the Role field if non-nil, zero value otherwise.

### GetRoleOk

`func (o *ProjectUser) GetRoleOk() (*string, bool)`

GetRoleOk returns a tuple with the Role field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRole

`func (o *ProjectUser) SetRole(v string)`

SetRole sets Role field to given value.


### GetAddedAt

`func (o *ProjectUser) GetAddedAt() int32`

GetAddedAt returns the AddedAt field if non-nil, zero value otherwise.

### GetAddedAtOk

`func (o *ProjectUser) GetAddedAtOk() (*int32, bool)`

GetAddedAtOk returns a tuple with the AddedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAddedAt

`func (o *ProjectUser) SetAddedAt(v int32)`

SetAddedAt sets AddedAt field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


