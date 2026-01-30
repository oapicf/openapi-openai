# InviteRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Email** | **string** | Send an email to this address | 
**Role** | **string** | &#x60;owner&#x60; or &#x60;reader&#x60; | 
**Projects** | Pointer to [**[]InviteRequestProjectsInner**](InviteRequestProjectsInner.md) | An array of projects to which membership is granted at the same time the org invite is accepted. If omitted, the user will be invited to the default project for compatibility with legacy behavior. | [optional] 

## Methods

### NewInviteRequest

`func NewInviteRequest(email string, role string, ) *InviteRequest`

NewInviteRequest instantiates a new InviteRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewInviteRequestWithDefaults

`func NewInviteRequestWithDefaults() *InviteRequest`

NewInviteRequestWithDefaults instantiates a new InviteRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEmail

`func (o *InviteRequest) GetEmail() string`

GetEmail returns the Email field if non-nil, zero value otherwise.

### GetEmailOk

`func (o *InviteRequest) GetEmailOk() (*string, bool)`

GetEmailOk returns a tuple with the Email field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmail

`func (o *InviteRequest) SetEmail(v string)`

SetEmail sets Email field to given value.


### GetRole

`func (o *InviteRequest) GetRole() string`

GetRole returns the Role field if non-nil, zero value otherwise.

### GetRoleOk

`func (o *InviteRequest) GetRoleOk() (*string, bool)`

GetRoleOk returns a tuple with the Role field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRole

`func (o *InviteRequest) SetRole(v string)`

SetRole sets Role field to given value.


### GetProjects

`func (o *InviteRequest) GetProjects() []InviteRequestProjectsInner`

GetProjects returns the Projects field if non-nil, zero value otherwise.

### GetProjectsOk

`func (o *InviteRequest) GetProjectsOk() (*[]InviteRequestProjectsInner, bool)`

GetProjectsOk returns a tuple with the Projects field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProjects

`func (o *InviteRequest) SetProjects(v []InviteRequestProjectsInner)`

SetProjects sets Projects field to given value.

### HasProjects

`func (o *InviteRequest) HasProjects() bool`

HasProjects returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


