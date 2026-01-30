# AuditLogUserUpdated

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **string** | The project ID. | [optional] 
**ChangesRequested** | Pointer to [**AuditLogUserUpdatedChangesRequested**](AuditLogUserUpdatedChangesRequested.md) |  | [optional] 

## Methods

### NewAuditLogUserUpdated

`func NewAuditLogUserUpdated() *AuditLogUserUpdated`

NewAuditLogUserUpdated instantiates a new AuditLogUserUpdated object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAuditLogUserUpdatedWithDefaults

`func NewAuditLogUserUpdatedWithDefaults() *AuditLogUserUpdated`

NewAuditLogUserUpdatedWithDefaults instantiates a new AuditLogUserUpdated object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *AuditLogUserUpdated) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *AuditLogUserUpdated) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *AuditLogUserUpdated) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *AuditLogUserUpdated) HasId() bool`

HasId returns a boolean if a field has been set.

### GetChangesRequested

`func (o *AuditLogUserUpdated) GetChangesRequested() AuditLogUserUpdatedChangesRequested`

GetChangesRequested returns the ChangesRequested field if non-nil, zero value otherwise.

### GetChangesRequestedOk

`func (o *AuditLogUserUpdated) GetChangesRequestedOk() (*AuditLogUserUpdatedChangesRequested, bool)`

GetChangesRequestedOk returns a tuple with the ChangesRequested field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChangesRequested

`func (o *AuditLogUserUpdated) SetChangesRequested(v AuditLogUserUpdatedChangesRequested)`

SetChangesRequested sets ChangesRequested field to given value.

### HasChangesRequested

`func (o *AuditLogUserUpdated) HasChangesRequested() bool`

HasChangesRequested returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


