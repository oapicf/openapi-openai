# AuditLogUserAdded

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **string** | The user ID. | [optional] 
**Data** | Pointer to [**AuditLogUserAddedData**](AuditLogUserAddedData.md) |  | [optional] 

## Methods

### NewAuditLogUserAdded

`func NewAuditLogUserAdded() *AuditLogUserAdded`

NewAuditLogUserAdded instantiates a new AuditLogUserAdded object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAuditLogUserAddedWithDefaults

`func NewAuditLogUserAddedWithDefaults() *AuditLogUserAdded`

NewAuditLogUserAddedWithDefaults instantiates a new AuditLogUserAdded object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *AuditLogUserAdded) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *AuditLogUserAdded) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *AuditLogUserAdded) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *AuditLogUserAdded) HasId() bool`

HasId returns a boolean if a field has been set.

### GetData

`func (o *AuditLogUserAdded) GetData() AuditLogUserAddedData`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *AuditLogUserAdded) GetDataOk() (*AuditLogUserAddedData, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *AuditLogUserAdded) SetData(v AuditLogUserAddedData)`

SetData sets Data field to given value.

### HasData

`func (o *AuditLogUserAdded) HasData() bool`

HasData returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


