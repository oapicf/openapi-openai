# AdminApiKey

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | Pointer to **string** |  | [optional] 
**Id** | Pointer to **string** |  | [optional] 
**Name** | Pointer to **string** |  | [optional] 
**RedactedValue** | Pointer to **string** |  | [optional] 
**Value** | Pointer to **string** |  | [optional] 
**CreatedAt** | Pointer to **int64** |  | [optional] 
**Owner** | Pointer to [**AdminApiKeyOwner**](AdminApiKeyOwner.md) |  | [optional] 

## Methods

### NewAdminApiKey

`func NewAdminApiKey() *AdminApiKey`

NewAdminApiKey instantiates a new AdminApiKey object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdminApiKeyWithDefaults

`func NewAdminApiKeyWithDefaults() *AdminApiKey`

NewAdminApiKeyWithDefaults instantiates a new AdminApiKey object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetObject

`func (o *AdminApiKey) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *AdminApiKey) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *AdminApiKey) SetObject(v string)`

SetObject sets Object field to given value.

### HasObject

`func (o *AdminApiKey) HasObject() bool`

HasObject returns a boolean if a field has been set.

### GetId

`func (o *AdminApiKey) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *AdminApiKey) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *AdminApiKey) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *AdminApiKey) HasId() bool`

HasId returns a boolean if a field has been set.

### GetName

`func (o *AdminApiKey) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *AdminApiKey) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *AdminApiKey) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *AdminApiKey) HasName() bool`

HasName returns a boolean if a field has been set.

### GetRedactedValue

`func (o *AdminApiKey) GetRedactedValue() string`

GetRedactedValue returns the RedactedValue field if non-nil, zero value otherwise.

### GetRedactedValueOk

`func (o *AdminApiKey) GetRedactedValueOk() (*string, bool)`

GetRedactedValueOk returns a tuple with the RedactedValue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRedactedValue

`func (o *AdminApiKey) SetRedactedValue(v string)`

SetRedactedValue sets RedactedValue field to given value.

### HasRedactedValue

`func (o *AdminApiKey) HasRedactedValue() bool`

HasRedactedValue returns a boolean if a field has been set.

### GetValue

`func (o *AdminApiKey) GetValue() string`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *AdminApiKey) GetValueOk() (*string, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *AdminApiKey) SetValue(v string)`

SetValue sets Value field to given value.

### HasValue

`func (o *AdminApiKey) HasValue() bool`

HasValue returns a boolean if a field has been set.

### GetCreatedAt

`func (o *AdminApiKey) GetCreatedAt() int64`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *AdminApiKey) GetCreatedAtOk() (*int64, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *AdminApiKey) SetCreatedAt(v int64)`

SetCreatedAt sets CreatedAt field to given value.

### HasCreatedAt

`func (o *AdminApiKey) HasCreatedAt() bool`

HasCreatedAt returns a boolean if a field has been set.

### GetOwner

`func (o *AdminApiKey) GetOwner() AdminApiKeyOwner`

GetOwner returns the Owner field if non-nil, zero value otherwise.

### GetOwnerOk

`func (o *AdminApiKey) GetOwnerOk() (*AdminApiKeyOwner, bool)`

GetOwnerOk returns a tuple with the Owner field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOwner

`func (o *AdminApiKey) SetOwner(v AdminApiKeyOwner)`

SetOwner sets Owner field to given value.

### HasOwner

`func (o *AdminApiKey) HasOwner() bool`

HasOwner returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


