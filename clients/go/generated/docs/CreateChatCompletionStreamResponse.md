# CreateChatCompletionStreamResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | A unique identifier for the chat completion. Each chunk has the same ID. | 
**Choices** | [**[]CreateChatCompletionStreamResponseChoicesInner**](CreateChatCompletionStreamResponseChoicesInner.md) | A list of chat completion choices. Can be more than one if &#x60;n&#x60; is greater than 1. | 
**Created** | **int32** | The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp. | 
**Model** | **string** | The model to generate the completion. | 
**SystemFingerprint** | Pointer to **string** | This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism.  | [optional] 
**Object** | **string** | The object type, which is always &#x60;chat.completion.chunk&#x60;. | 

## Methods

### NewCreateChatCompletionStreamResponse

`func NewCreateChatCompletionStreamResponse(id string, choices []CreateChatCompletionStreamResponseChoicesInner, created int32, model string, object string, ) *CreateChatCompletionStreamResponse`

NewCreateChatCompletionStreamResponse instantiates a new CreateChatCompletionStreamResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateChatCompletionStreamResponseWithDefaults

`func NewCreateChatCompletionStreamResponseWithDefaults() *CreateChatCompletionStreamResponse`

NewCreateChatCompletionStreamResponseWithDefaults instantiates a new CreateChatCompletionStreamResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *CreateChatCompletionStreamResponse) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CreateChatCompletionStreamResponse) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CreateChatCompletionStreamResponse) SetId(v string)`

SetId sets Id field to given value.


### GetChoices

`func (o *CreateChatCompletionStreamResponse) GetChoices() []CreateChatCompletionStreamResponseChoicesInner`

GetChoices returns the Choices field if non-nil, zero value otherwise.

### GetChoicesOk

`func (o *CreateChatCompletionStreamResponse) GetChoicesOk() (*[]CreateChatCompletionStreamResponseChoicesInner, bool)`

GetChoicesOk returns a tuple with the Choices field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChoices

`func (o *CreateChatCompletionStreamResponse) SetChoices(v []CreateChatCompletionStreamResponseChoicesInner)`

SetChoices sets Choices field to given value.


### GetCreated

`func (o *CreateChatCompletionStreamResponse) GetCreated() int32`

GetCreated returns the Created field if non-nil, zero value otherwise.

### GetCreatedOk

`func (o *CreateChatCompletionStreamResponse) GetCreatedOk() (*int32, bool)`

GetCreatedOk returns a tuple with the Created field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreated

`func (o *CreateChatCompletionStreamResponse) SetCreated(v int32)`

SetCreated sets Created field to given value.


### GetModel

`func (o *CreateChatCompletionStreamResponse) GetModel() string`

GetModel returns the Model field if non-nil, zero value otherwise.

### GetModelOk

`func (o *CreateChatCompletionStreamResponse) GetModelOk() (*string, bool)`

GetModelOk returns a tuple with the Model field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModel

`func (o *CreateChatCompletionStreamResponse) SetModel(v string)`

SetModel sets Model field to given value.


### GetSystemFingerprint

`func (o *CreateChatCompletionStreamResponse) GetSystemFingerprint() string`

GetSystemFingerprint returns the SystemFingerprint field if non-nil, zero value otherwise.

### GetSystemFingerprintOk

`func (o *CreateChatCompletionStreamResponse) GetSystemFingerprintOk() (*string, bool)`

GetSystemFingerprintOk returns a tuple with the SystemFingerprint field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSystemFingerprint

`func (o *CreateChatCompletionStreamResponse) SetSystemFingerprint(v string)`

SetSystemFingerprint sets SystemFingerprint field to given value.

### HasSystemFingerprint

`func (o *CreateChatCompletionStreamResponse) HasSystemFingerprint() bool`

HasSystemFingerprint returns a boolean if a field has been set.

### GetObject

`func (o *CreateChatCompletionStreamResponse) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *CreateChatCompletionStreamResponse) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *CreateChatCompletionStreamResponse) SetObject(v string)`

SetObject sets Object field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


