# ProjectApiKeyOwner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | Pointer to **string** | &#x60;user&#x60; or &#x60;service_account&#x60; | [optional] 
**User** | Pointer to [**ProjectUser**](ProjectUser.md) |  | [optional] 
**ServiceAccount** | Pointer to [**ProjectServiceAccount**](ProjectServiceAccount.md) |  | [optional] 

## Methods

### NewProjectApiKeyOwner

`func NewProjectApiKeyOwner() *ProjectApiKeyOwner`

NewProjectApiKeyOwner instantiates a new ProjectApiKeyOwner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewProjectApiKeyOwnerWithDefaults

`func NewProjectApiKeyOwnerWithDefaults() *ProjectApiKeyOwner`

NewProjectApiKeyOwnerWithDefaults instantiates a new ProjectApiKeyOwner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *ProjectApiKeyOwner) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *ProjectApiKeyOwner) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *ProjectApiKeyOwner) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *ProjectApiKeyOwner) HasType() bool`

HasType returns a boolean if a field has been set.

### GetUser

`func (o *ProjectApiKeyOwner) GetUser() ProjectUser`

GetUser returns the User field if non-nil, zero value otherwise.

### GetUserOk

`func (o *ProjectApiKeyOwner) GetUserOk() (*ProjectUser, bool)`

GetUserOk returns a tuple with the User field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUser

`func (o *ProjectApiKeyOwner) SetUser(v ProjectUser)`

SetUser sets User field to given value.

### HasUser

`func (o *ProjectApiKeyOwner) HasUser() bool`

HasUser returns a boolean if a field has been set.

### GetServiceAccount

`func (o *ProjectApiKeyOwner) GetServiceAccount() ProjectServiceAccount`

GetServiceAccount returns the ServiceAccount field if non-nil, zero value otherwise.

### GetServiceAccountOk

`func (o *ProjectApiKeyOwner) GetServiceAccountOk() (*ProjectServiceAccount, bool)`

GetServiceAccountOk returns a tuple with the ServiceAccount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetServiceAccount

`func (o *ProjectApiKeyOwner) SetServiceAccount(v ProjectServiceAccount)`

SetServiceAccount sets ServiceAccount field to given value.

### HasServiceAccount

`func (o *ProjectApiKeyOwner) HasServiceAccount() bool`

HasServiceAccount returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


