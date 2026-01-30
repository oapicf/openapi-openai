# AuditLogServiceAccountCreatedData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Role** | Pointer to **string** | The role of the service account. Is either &#x60;owner&#x60; or &#x60;member&#x60;. | [optional] 

## Methods

### NewAuditLogServiceAccountCreatedData

`func NewAuditLogServiceAccountCreatedData() *AuditLogServiceAccountCreatedData`

NewAuditLogServiceAccountCreatedData instantiates a new AuditLogServiceAccountCreatedData object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAuditLogServiceAccountCreatedDataWithDefaults

`func NewAuditLogServiceAccountCreatedDataWithDefaults() *AuditLogServiceAccountCreatedData`

NewAuditLogServiceAccountCreatedDataWithDefaults instantiates a new AuditLogServiceAccountCreatedData object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetRole

`func (o *AuditLogServiceAccountCreatedData) GetRole() string`

GetRole returns the Role field if non-nil, zero value otherwise.

### GetRoleOk

`func (o *AuditLogServiceAccountCreatedData) GetRoleOk() (*string, bool)`

GetRoleOk returns a tuple with the Role field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRole

`func (o *AuditLogServiceAccountCreatedData) SetRole(v string)`

SetRole sets Role field to given value.

### HasRole

`func (o *AuditLogServiceAccountCreatedData) HasRole() bool`

HasRole returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


