# FineTuneMethod

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | Pointer to **string** | The type of method. Is either &#x60;supervised&#x60; or &#x60;dpo&#x60;. | [optional] 
**Supervised** | Pointer to [**FineTuneSupervisedMethod**](FineTuneSupervisedMethod.md) |  | [optional] 
**Dpo** | Pointer to [**FineTuneDPOMethod**](FineTuneDPOMethod.md) |  | [optional] 

## Methods

### NewFineTuneMethod

`func NewFineTuneMethod() *FineTuneMethod`

NewFineTuneMethod instantiates a new FineTuneMethod object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFineTuneMethodWithDefaults

`func NewFineTuneMethodWithDefaults() *FineTuneMethod`

NewFineTuneMethodWithDefaults instantiates a new FineTuneMethod object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *FineTuneMethod) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *FineTuneMethod) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *FineTuneMethod) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *FineTuneMethod) HasType() bool`

HasType returns a boolean if a field has been set.

### GetSupervised

`func (o *FineTuneMethod) GetSupervised() FineTuneSupervisedMethod`

GetSupervised returns the Supervised field if non-nil, zero value otherwise.

### GetSupervisedOk

`func (o *FineTuneMethod) GetSupervisedOk() (*FineTuneSupervisedMethod, bool)`

GetSupervisedOk returns a tuple with the Supervised field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSupervised

`func (o *FineTuneMethod) SetSupervised(v FineTuneSupervisedMethod)`

SetSupervised sets Supervised field to given value.

### HasSupervised

`func (o *FineTuneMethod) HasSupervised() bool`

HasSupervised returns a boolean if a field has been set.

### GetDpo

`func (o *FineTuneMethod) GetDpo() FineTuneDPOMethod`

GetDpo returns the Dpo field if non-nil, zero value otherwise.

### GetDpoOk

`func (o *FineTuneMethod) GetDpoOk() (*FineTuneDPOMethod, bool)`

GetDpoOk returns a tuple with the Dpo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDpo

`func (o *FineTuneMethod) SetDpo(v FineTuneDPOMethod)`

SetDpo sets Dpo field to given value.

### HasDpo

`func (o *FineTuneMethod) HasDpo() bool`

HasDpo returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


