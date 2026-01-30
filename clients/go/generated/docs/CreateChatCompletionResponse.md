# CreateChatCompletionResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | A unique identifier for the chat completion. | 
**Choices** | [**[]CreateChatCompletionResponseChoicesInner**](CreateChatCompletionResponseChoicesInner.md) | A list of chat completion choices. Can be more than one if &#x60;n&#x60; is greater than 1. | 
**Created** | **int32** | The Unix timestamp (in seconds) of when the chat completion was created. | 
**Model** | **string** | The model used for the chat completion. | 
**ServiceTier** | Pointer to **NullableString** | The service tier used for processing the request. This field is only included if the &#x60;service_tier&#x60; parameter is specified in the request. | [optional] 
**SystemFingerprint** | Pointer to **string** | This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism.  | [optional] 
**Object** | **string** | The object type, which is always &#x60;chat.completion&#x60;. | 
**Usage** | Pointer to [**CompletionUsage**](CompletionUsage.md) |  | [optional] 

## Methods

### NewCreateChatCompletionResponse

`func NewCreateChatCompletionResponse(id string, choices []CreateChatCompletionResponseChoicesInner, created int32, model string, object string, ) *CreateChatCompletionResponse`

NewCreateChatCompletionResponse instantiates a new CreateChatCompletionResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateChatCompletionResponseWithDefaults

`func NewCreateChatCompletionResponseWithDefaults() *CreateChatCompletionResponse`

NewCreateChatCompletionResponseWithDefaults instantiates a new CreateChatCompletionResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *CreateChatCompletionResponse) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CreateChatCompletionResponse) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CreateChatCompletionResponse) SetId(v string)`

SetId sets Id field to given value.


### GetChoices

`func (o *CreateChatCompletionResponse) GetChoices() []CreateChatCompletionResponseChoicesInner`

GetChoices returns the Choices field if non-nil, zero value otherwise.

### GetChoicesOk

`func (o *CreateChatCompletionResponse) GetChoicesOk() (*[]CreateChatCompletionResponseChoicesInner, bool)`

GetChoicesOk returns a tuple with the Choices field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChoices

`func (o *CreateChatCompletionResponse) SetChoices(v []CreateChatCompletionResponseChoicesInner)`

SetChoices sets Choices field to given value.


### GetCreated

`func (o *CreateChatCompletionResponse) GetCreated() int32`

GetCreated returns the Created field if non-nil, zero value otherwise.

### GetCreatedOk

`func (o *CreateChatCompletionResponse) GetCreatedOk() (*int32, bool)`

GetCreatedOk returns a tuple with the Created field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreated

`func (o *CreateChatCompletionResponse) SetCreated(v int32)`

SetCreated sets Created field to given value.


### GetModel

`func (o *CreateChatCompletionResponse) GetModel() string`

GetModel returns the Model field if non-nil, zero value otherwise.

### GetModelOk

`func (o *CreateChatCompletionResponse) GetModelOk() (*string, bool)`

GetModelOk returns a tuple with the Model field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModel

`func (o *CreateChatCompletionResponse) SetModel(v string)`

SetModel sets Model field to given value.


### GetServiceTier

`func (o *CreateChatCompletionResponse) GetServiceTier() string`

GetServiceTier returns the ServiceTier field if non-nil, zero value otherwise.

### GetServiceTierOk

`func (o *CreateChatCompletionResponse) GetServiceTierOk() (*string, bool)`

GetServiceTierOk returns a tuple with the ServiceTier field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetServiceTier

`func (o *CreateChatCompletionResponse) SetServiceTier(v string)`

SetServiceTier sets ServiceTier field to given value.

### HasServiceTier

`func (o *CreateChatCompletionResponse) HasServiceTier() bool`

HasServiceTier returns a boolean if a field has been set.

### SetServiceTierNil

`func (o *CreateChatCompletionResponse) SetServiceTierNil(b bool)`

 SetServiceTierNil sets the value for ServiceTier to be an explicit nil

### UnsetServiceTier
`func (o *CreateChatCompletionResponse) UnsetServiceTier()`

UnsetServiceTier ensures that no value is present for ServiceTier, not even an explicit nil
### GetSystemFingerprint

`func (o *CreateChatCompletionResponse) GetSystemFingerprint() string`

GetSystemFingerprint returns the SystemFingerprint field if non-nil, zero value otherwise.

### GetSystemFingerprintOk

`func (o *CreateChatCompletionResponse) GetSystemFingerprintOk() (*string, bool)`

GetSystemFingerprintOk returns a tuple with the SystemFingerprint field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSystemFingerprint

`func (o *CreateChatCompletionResponse) SetSystemFingerprint(v string)`

SetSystemFingerprint sets SystemFingerprint field to given value.

### HasSystemFingerprint

`func (o *CreateChatCompletionResponse) HasSystemFingerprint() bool`

HasSystemFingerprint returns a boolean if a field has been set.

### GetObject

`func (o *CreateChatCompletionResponse) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *CreateChatCompletionResponse) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *CreateChatCompletionResponse) SetObject(v string)`

SetObject sets Object field to given value.


### GetUsage

`func (o *CreateChatCompletionResponse) GetUsage() CompletionUsage`

GetUsage returns the Usage field if non-nil, zero value otherwise.

### GetUsageOk

`func (o *CreateChatCompletionResponse) GetUsageOk() (*CompletionUsage, bool)`

GetUsageOk returns a tuple with the Usage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsage

`func (o *CreateChatCompletionResponse) SetUsage(v CompletionUsage)`

SetUsage sets Usage field to given value.

### HasUsage

`func (o *CreateChatCompletionResponse) HasUsage() bool`

HasUsage returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


