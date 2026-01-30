# AuditLogApiKeyCreated

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **string** | The tracking ID of the API key. | [optional] 
**Data** | Pointer to [**AuditLogApiKeyCreatedData**](AuditLogApiKeyCreatedData.md) |  | [optional] 

## Methods

### NewAuditLogApiKeyCreated

`func NewAuditLogApiKeyCreated() *AuditLogApiKeyCreated`

NewAuditLogApiKeyCreated instantiates a new AuditLogApiKeyCreated object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAuditLogApiKeyCreatedWithDefaults

`func NewAuditLogApiKeyCreatedWithDefaults() *AuditLogApiKeyCreated`

NewAuditLogApiKeyCreatedWithDefaults instantiates a new AuditLogApiKeyCreated object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *AuditLogApiKeyCreated) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *AuditLogApiKeyCreated) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *AuditLogApiKeyCreated) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *AuditLogApiKeyCreated) HasId() bool`

HasId returns a boolean if a field has been set.

### GetData

`func (o *AuditLogApiKeyCreated) GetData() AuditLogApiKeyCreatedData`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *AuditLogApiKeyCreated) GetDataOk() (*AuditLogApiKeyCreatedData, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *AuditLogApiKeyCreated) SetData(v AuditLogApiKeyCreatedData)`

SetData sets Data field to given value.

### HasData

`func (o *AuditLogApiKeyCreated) HasData() bool`

HasData returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


