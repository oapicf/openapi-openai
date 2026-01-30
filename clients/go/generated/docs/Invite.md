# Invite

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **string** | The object type, which is always &#x60;organization.invite&#x60; | 
**Id** | **string** | The identifier, which can be referenced in API endpoints | 
**Email** | **string** | The email address of the individual to whom the invite was sent | 
**Role** | **string** | &#x60;owner&#x60; or &#x60;reader&#x60; | 
**Status** | **string** | &#x60;accepted&#x60;,&#x60;expired&#x60;, or &#x60;pending&#x60; | 
**InvitedAt** | **int32** | The Unix timestamp (in seconds) of when the invite was sent. | 
**ExpiresAt** | **int32** | The Unix timestamp (in seconds) of when the invite expires. | 
**AcceptedAt** | Pointer to **int32** | The Unix timestamp (in seconds) of when the invite was accepted. | [optional] 
**Projects** | Pointer to [**[]InviteProjectsInner**](InviteProjectsInner.md) | The projects that were granted membership upon acceptance of the invite. | [optional] 

## Methods

### NewInvite

`func NewInvite(object string, id string, email string, role string, status string, invitedAt int32, expiresAt int32, ) *Invite`

NewInvite instantiates a new Invite object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewInviteWithDefaults

`func NewInviteWithDefaults() *Invite`

NewInviteWithDefaults instantiates a new Invite object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetObject

`func (o *Invite) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *Invite) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *Invite) SetObject(v string)`

SetObject sets Object field to given value.


### GetId

`func (o *Invite) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *Invite) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *Invite) SetId(v string)`

SetId sets Id field to given value.


### GetEmail

`func (o *Invite) GetEmail() string`

GetEmail returns the Email field if non-nil, zero value otherwise.

### GetEmailOk

`func (o *Invite) GetEmailOk() (*string, bool)`

GetEmailOk returns a tuple with the Email field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmail

`func (o *Invite) SetEmail(v string)`

SetEmail sets Email field to given value.


### GetRole

`func (o *Invite) GetRole() string`

GetRole returns the Role field if non-nil, zero value otherwise.

### GetRoleOk

`func (o *Invite) GetRoleOk() (*string, bool)`

GetRoleOk returns a tuple with the Role field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRole

`func (o *Invite) SetRole(v string)`

SetRole sets Role field to given value.


### GetStatus

`func (o *Invite) GetStatus() string`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *Invite) GetStatusOk() (*string, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *Invite) SetStatus(v string)`

SetStatus sets Status field to given value.


### GetInvitedAt

`func (o *Invite) GetInvitedAt() int32`

GetInvitedAt returns the InvitedAt field if non-nil, zero value otherwise.

### GetInvitedAtOk

`func (o *Invite) GetInvitedAtOk() (*int32, bool)`

GetInvitedAtOk returns a tuple with the InvitedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInvitedAt

`func (o *Invite) SetInvitedAt(v int32)`

SetInvitedAt sets InvitedAt field to given value.


### GetExpiresAt

`func (o *Invite) GetExpiresAt() int32`

GetExpiresAt returns the ExpiresAt field if non-nil, zero value otherwise.

### GetExpiresAtOk

`func (o *Invite) GetExpiresAtOk() (*int32, bool)`

GetExpiresAtOk returns a tuple with the ExpiresAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExpiresAt

`func (o *Invite) SetExpiresAt(v int32)`

SetExpiresAt sets ExpiresAt field to given value.


### GetAcceptedAt

`func (o *Invite) GetAcceptedAt() int32`

GetAcceptedAt returns the AcceptedAt field if non-nil, zero value otherwise.

### GetAcceptedAtOk

`func (o *Invite) GetAcceptedAtOk() (*int32, bool)`

GetAcceptedAtOk returns a tuple with the AcceptedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAcceptedAt

`func (o *Invite) SetAcceptedAt(v int32)`

SetAcceptedAt sets AcceptedAt field to given value.

### HasAcceptedAt

`func (o *Invite) HasAcceptedAt() bool`

HasAcceptedAt returns a boolean if a field has been set.

### GetProjects

`func (o *Invite) GetProjects() []InviteProjectsInner`

GetProjects returns the Projects field if non-nil, zero value otherwise.

### GetProjectsOk

`func (o *Invite) GetProjectsOk() (*[]InviteProjectsInner, bool)`

GetProjectsOk returns a tuple with the Projects field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProjects

`func (o *Invite) SetProjects(v []InviteProjectsInner)`

SetProjects sets Projects field to given value.

### HasProjects

`func (o *Invite) HasProjects() bool`

HasProjects returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


