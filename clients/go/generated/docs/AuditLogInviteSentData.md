# AuditLogInviteSentData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Email** | Pointer to **string** | The email invited to the organization. | [optional] 
**Role** | Pointer to **string** | The role the email was invited to be. Is either &#x60;owner&#x60; or &#x60;member&#x60;. | [optional] 

## Methods

### NewAuditLogInviteSentData

`func NewAuditLogInviteSentData() *AuditLogInviteSentData`

NewAuditLogInviteSentData instantiates a new AuditLogInviteSentData object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAuditLogInviteSentDataWithDefaults

`func NewAuditLogInviteSentDataWithDefaults() *AuditLogInviteSentData`

NewAuditLogInviteSentDataWithDefaults instantiates a new AuditLogInviteSentData object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEmail

`func (o *AuditLogInviteSentData) GetEmail() string`

GetEmail returns the Email field if non-nil, zero value otherwise.

### GetEmailOk

`func (o *AuditLogInviteSentData) GetEmailOk() (*string, bool)`

GetEmailOk returns a tuple with the Email field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmail

`func (o *AuditLogInviteSentData) SetEmail(v string)`

SetEmail sets Email field to given value.

### HasEmail

`func (o *AuditLogInviteSentData) HasEmail() bool`

HasEmail returns a boolean if a field has been set.

### GetRole

`func (o *AuditLogInviteSentData) GetRole() string`

GetRole returns the Role field if non-nil, zero value otherwise.

### GetRoleOk

`func (o *AuditLogInviteSentData) GetRoleOk() (*string, bool)`

GetRoleOk returns a tuple with the Role field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRole

`func (o *AuditLogInviteSentData) SetRole(v string)`

SetRole sets Role field to given value.

### HasRole

`func (o *AuditLogInviteSentData) HasRole() bool`

HasRole returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


