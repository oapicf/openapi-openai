# AuditLogServiceAccountCreated

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **string** | The service account ID. | [optional] 
**Data** | Pointer to [**AuditLogServiceAccountCreatedData**](AuditLogServiceAccountCreatedData.md) |  | [optional] 

## Methods

### NewAuditLogServiceAccountCreated

`func NewAuditLogServiceAccountCreated() *AuditLogServiceAccountCreated`

NewAuditLogServiceAccountCreated instantiates a new AuditLogServiceAccountCreated object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAuditLogServiceAccountCreatedWithDefaults

`func NewAuditLogServiceAccountCreatedWithDefaults() *AuditLogServiceAccountCreated`

NewAuditLogServiceAccountCreatedWithDefaults instantiates a new AuditLogServiceAccountCreated object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *AuditLogServiceAccountCreated) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *AuditLogServiceAccountCreated) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *AuditLogServiceAccountCreated) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *AuditLogServiceAccountCreated) HasId() bool`

HasId returns a boolean if a field has been set.

### GetData

`func (o *AuditLogServiceAccountCreated) GetData() AuditLogServiceAccountCreatedData`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *AuditLogServiceAccountCreated) GetDataOk() (*AuditLogServiceAccountCreatedData, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *AuditLogServiceAccountCreated) SetData(v AuditLogServiceAccountCreatedData)`

SetData sets Data field to given value.

### HasData

`func (o *AuditLogServiceAccountCreated) HasData() bool`

HasData returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


