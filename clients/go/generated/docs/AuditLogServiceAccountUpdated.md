# AuditLogServiceAccountUpdated

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **string** | The service account ID. | [optional] 
**ChangesRequested** | Pointer to [**AuditLogServiceAccountUpdatedChangesRequested**](AuditLogServiceAccountUpdatedChangesRequested.md) |  | [optional] 

## Methods

### NewAuditLogServiceAccountUpdated

`func NewAuditLogServiceAccountUpdated() *AuditLogServiceAccountUpdated`

NewAuditLogServiceAccountUpdated instantiates a new AuditLogServiceAccountUpdated object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAuditLogServiceAccountUpdatedWithDefaults

`func NewAuditLogServiceAccountUpdatedWithDefaults() *AuditLogServiceAccountUpdated`

NewAuditLogServiceAccountUpdatedWithDefaults instantiates a new AuditLogServiceAccountUpdated object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *AuditLogServiceAccountUpdated) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *AuditLogServiceAccountUpdated) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *AuditLogServiceAccountUpdated) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *AuditLogServiceAccountUpdated) HasId() bool`

HasId returns a boolean if a field has been set.

### GetChangesRequested

`func (o *AuditLogServiceAccountUpdated) GetChangesRequested() AuditLogServiceAccountUpdatedChangesRequested`

GetChangesRequested returns the ChangesRequested field if non-nil, zero value otherwise.

### GetChangesRequestedOk

`func (o *AuditLogServiceAccountUpdated) GetChangesRequestedOk() (*AuditLogServiceAccountUpdatedChangesRequested, bool)`

GetChangesRequestedOk returns a tuple with the ChangesRequested field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChangesRequested

`func (o *AuditLogServiceAccountUpdated) SetChangesRequested(v AuditLogServiceAccountUpdatedChangesRequested)`

SetChangesRequested sets ChangesRequested field to given value.

### HasChangesRequested

`func (o *AuditLogServiceAccountUpdated) HasChangesRequested() bool`

HasChangesRequested returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


