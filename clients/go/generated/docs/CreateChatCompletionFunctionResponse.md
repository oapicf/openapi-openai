# CreateChatCompletionFunctionResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | A unique identifier for the chat completion. | 
**Choices** | [**[]CreateChatCompletionFunctionResponseChoicesInner**](CreateChatCompletionFunctionResponseChoicesInner.md) | A list of chat completion choices. Can be more than one if &#x60;n&#x60; is greater than 1. | 
**Created** | **int32** | The Unix timestamp (in seconds) of when the chat completion was created. | 
**Model** | **string** | The model used for the chat completion. | 
**SystemFingerprint** | Pointer to **string** | This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism.  | [optional] 
**Object** | **string** | The object type, which is always &#x60;chat.completion&#x60;. | 
**Usage** | Pointer to [**CompletionUsage**](CompletionUsage.md) |  | [optional] 

## Methods

### NewCreateChatCompletionFunctionResponse

`func NewCreateChatCompletionFunctionResponse(id string, choices []CreateChatCompletionFunctionResponseChoicesInner, created int32, model string, object string, ) *CreateChatCompletionFunctionResponse`

NewCreateChatCompletionFunctionResponse instantiates a new CreateChatCompletionFunctionResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateChatCompletionFunctionResponseWithDefaults

`func NewCreateChatCompletionFunctionResponseWithDefaults() *CreateChatCompletionFunctionResponse`

NewCreateChatCompletionFunctionResponseWithDefaults instantiates a new CreateChatCompletionFunctionResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *CreateChatCompletionFunctionResponse) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CreateChatCompletionFunctionResponse) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CreateChatCompletionFunctionResponse) SetId(v string)`

SetId sets Id field to given value.


### GetChoices

`func (o *CreateChatCompletionFunctionResponse) GetChoices() []CreateChatCompletionFunctionResponseChoicesInner`

GetChoices returns the Choices field if non-nil, zero value otherwise.

### GetChoicesOk

`func (o *CreateChatCompletionFunctionResponse) GetChoicesOk() (*[]CreateChatCompletionFunctionResponseChoicesInner, bool)`

GetChoicesOk returns a tuple with the Choices field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChoices

`func (o *CreateChatCompletionFunctionResponse) SetChoices(v []CreateChatCompletionFunctionResponseChoicesInner)`

SetChoices sets Choices field to given value.


### GetCreated

`func (o *CreateChatCompletionFunctionResponse) GetCreated() int32`

GetCreated returns the Created field if non-nil, zero value otherwise.

### GetCreatedOk

`func (o *CreateChatCompletionFunctionResponse) GetCreatedOk() (*int32, bool)`

GetCreatedOk returns a tuple with the Created field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreated

`func (o *CreateChatCompletionFunctionResponse) SetCreated(v int32)`

SetCreated sets Created field to given value.


### GetModel

`func (o *CreateChatCompletionFunctionResponse) GetModel() string`

GetModel returns the Model field if non-nil, zero value otherwise.

### GetModelOk

`func (o *CreateChatCompletionFunctionResponse) GetModelOk() (*string, bool)`

GetModelOk returns a tuple with the Model field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModel

`func (o *CreateChatCompletionFunctionResponse) SetModel(v string)`

SetModel sets Model field to given value.


### GetSystemFingerprint

`func (o *CreateChatCompletionFunctionResponse) GetSystemFingerprint() string`

GetSystemFingerprint returns the SystemFingerprint field if non-nil, zero value otherwise.

### GetSystemFingerprintOk

`func (o *CreateChatCompletionFunctionResponse) GetSystemFingerprintOk() (*string, bool)`

GetSystemFingerprintOk returns a tuple with the SystemFingerprint field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSystemFingerprint

`func (o *CreateChatCompletionFunctionResponse) SetSystemFingerprint(v string)`

SetSystemFingerprint sets SystemFingerprint field to given value.

### HasSystemFingerprint

`func (o *CreateChatCompletionFunctionResponse) HasSystemFingerprint() bool`

HasSystemFingerprint returns a boolean if a field has been set.

### GetObject

`func (o *CreateChatCompletionFunctionResponse) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *CreateChatCompletionFunctionResponse) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *CreateChatCompletionFunctionResponse) SetObject(v string)`

SetObject sets Object field to given value.


### GetUsage

`func (o *CreateChatCompletionFunctionResponse) GetUsage() CompletionUsage`

GetUsage returns the Usage field if non-nil, zero value otherwise.

### GetUsageOk

`func (o *CreateChatCompletionFunctionResponse) GetUsageOk() (*CompletionUsage, bool)`

GetUsageOk returns a tuple with the Usage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsage

`func (o *CreateChatCompletionFunctionResponse) SetUsage(v CompletionUsage)`

SetUsage sets Usage field to given value.

### HasUsage

`func (o *CreateChatCompletionFunctionResponse) HasUsage() bool`

HasUsage returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


