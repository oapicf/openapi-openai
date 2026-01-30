# ProjectServiceAccount

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **string** | The object type, which is always &#x60;organization.project.service_account&#x60; | 
**Id** | **string** | The identifier, which can be referenced in API endpoints | 
**Name** | **string** | The name of the service account | 
**Role** | **string** | &#x60;owner&#x60; or &#x60;member&#x60; | 
**CreatedAt** | **int32** | The Unix timestamp (in seconds) of when the service account was created | 

## Methods

### NewProjectServiceAccount

`func NewProjectServiceAccount(object string, id string, name string, role string, createdAt int32, ) *ProjectServiceAccount`

NewProjectServiceAccount instantiates a new ProjectServiceAccount object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewProjectServiceAccountWithDefaults

`func NewProjectServiceAccountWithDefaults() *ProjectServiceAccount`

NewProjectServiceAccountWithDefaults instantiates a new ProjectServiceAccount object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetObject

`func (o *ProjectServiceAccount) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *ProjectServiceAccount) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *ProjectServiceAccount) SetObject(v string)`

SetObject sets Object field to given value.


### GetId

`func (o *ProjectServiceAccount) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ProjectServiceAccount) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ProjectServiceAccount) SetId(v string)`

SetId sets Id field to given value.


### GetName

`func (o *ProjectServiceAccount) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ProjectServiceAccount) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ProjectServiceAccount) SetName(v string)`

SetName sets Name field to given value.


### GetRole

`func (o *ProjectServiceAccount) GetRole() string`

GetRole returns the Role field if non-nil, zero value otherwise.

### GetRoleOk

`func (o *ProjectServiceAccount) GetRoleOk() (*string, bool)`

GetRoleOk returns a tuple with the Role field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRole

`func (o *ProjectServiceAccount) SetRole(v string)`

SetRole sets Role field to given value.


### GetCreatedAt

`func (o *ProjectServiceAccount) GetCreatedAt() int32`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *ProjectServiceAccount) GetCreatedAtOk() (*int32, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *ProjectServiceAccount) SetCreatedAt(v int32)`

SetCreatedAt sets CreatedAt field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


