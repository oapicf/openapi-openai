# CostsResultAmount

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Value** | Pointer to **float32** | The numeric value of the cost. | [optional] 
**Currency** | Pointer to **string** | Lowercase ISO-4217 currency e.g. \&quot;usd\&quot; | [optional] 

## Methods

### NewCostsResultAmount

`func NewCostsResultAmount() *CostsResultAmount`

NewCostsResultAmount instantiates a new CostsResultAmount object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCostsResultAmountWithDefaults

`func NewCostsResultAmountWithDefaults() *CostsResultAmount`

NewCostsResultAmountWithDefaults instantiates a new CostsResultAmount object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetValue

`func (o *CostsResultAmount) GetValue() float32`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *CostsResultAmount) GetValueOk() (*float32, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *CostsResultAmount) SetValue(v float32)`

SetValue sets Value field to given value.

### HasValue

`func (o *CostsResultAmount) HasValue() bool`

HasValue returns a boolean if a field has been set.

### GetCurrency

`func (o *CostsResultAmount) GetCurrency() string`

GetCurrency returns the Currency field if non-nil, zero value otherwise.

### GetCurrencyOk

`func (o *CostsResultAmount) GetCurrencyOk() (*string, bool)`

GetCurrencyOk returns a tuple with the Currency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrency

`func (o *CostsResultAmount) SetCurrency(v string)`

SetCurrency sets Currency field to given value.

### HasCurrency

`func (o *CostsResultAmount) HasCurrency() bool`

HasCurrency returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


