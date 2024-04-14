# CreateCompletionResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | A unique identifier for the completion. | 
**Choices** | [**[]CreateCompletionResponseChoicesInner**](CreateCompletionResponseChoicesInner.md) | The list of completion choices the model generated for the input prompt. | 
**Created** | **int32** | The Unix timestamp (in seconds) of when the completion was created. | 
**Model** | **string** | The model used for completion. | 
**SystemFingerprint** | Pointer to **string** | This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism.  | [optional] 
**Object** | **string** | The object type, which is always \&quot;text_completion\&quot; | 
**Usage** | Pointer to [**CompletionUsage**](CompletionUsage.md) |  | [optional] 

## Methods

### NewCreateCompletionResponse

`func NewCreateCompletionResponse(id string, choices []CreateCompletionResponseChoicesInner, created int32, model string, object string, ) *CreateCompletionResponse`

NewCreateCompletionResponse instantiates a new CreateCompletionResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateCompletionResponseWithDefaults

`func NewCreateCompletionResponseWithDefaults() *CreateCompletionResponse`

NewCreateCompletionResponseWithDefaults instantiates a new CreateCompletionResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *CreateCompletionResponse) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CreateCompletionResponse) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CreateCompletionResponse) SetId(v string)`

SetId sets Id field to given value.


### GetChoices

`func (o *CreateCompletionResponse) GetChoices() []CreateCompletionResponseChoicesInner`

GetChoices returns the Choices field if non-nil, zero value otherwise.

### GetChoicesOk

`func (o *CreateCompletionResponse) GetChoicesOk() (*[]CreateCompletionResponseChoicesInner, bool)`

GetChoicesOk returns a tuple with the Choices field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChoices

`func (o *CreateCompletionResponse) SetChoices(v []CreateCompletionResponseChoicesInner)`

SetChoices sets Choices field to given value.


### GetCreated

`func (o *CreateCompletionResponse) GetCreated() int32`

GetCreated returns the Created field if non-nil, zero value otherwise.

### GetCreatedOk

`func (o *CreateCompletionResponse) GetCreatedOk() (*int32, bool)`

GetCreatedOk returns a tuple with the Created field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreated

`func (o *CreateCompletionResponse) SetCreated(v int32)`

SetCreated sets Created field to given value.


### GetModel

`func (o *CreateCompletionResponse) GetModel() string`

GetModel returns the Model field if non-nil, zero value otherwise.

### GetModelOk

`func (o *CreateCompletionResponse) GetModelOk() (*string, bool)`

GetModelOk returns a tuple with the Model field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModel

`func (o *CreateCompletionResponse) SetModel(v string)`

SetModel sets Model field to given value.


### GetSystemFingerprint

`func (o *CreateCompletionResponse) GetSystemFingerprint() string`

GetSystemFingerprint returns the SystemFingerprint field if non-nil, zero value otherwise.

### GetSystemFingerprintOk

`func (o *CreateCompletionResponse) GetSystemFingerprintOk() (*string, bool)`

GetSystemFingerprintOk returns a tuple with the SystemFingerprint field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSystemFingerprint

`func (o *CreateCompletionResponse) SetSystemFingerprint(v string)`

SetSystemFingerprint sets SystemFingerprint field to given value.

### HasSystemFingerprint

`func (o *CreateCompletionResponse) HasSystemFingerprint() bool`

HasSystemFingerprint returns a boolean if a field has been set.

### GetObject

`func (o *CreateCompletionResponse) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *CreateCompletionResponse) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *CreateCompletionResponse) SetObject(v string)`

SetObject sets Object field to given value.


### GetUsage

`func (o *CreateCompletionResponse) GetUsage() CompletionUsage`

GetUsage returns the Usage field if non-nil, zero value otherwise.

### GetUsageOk

`func (o *CreateCompletionResponse) GetUsageOk() (*CompletionUsage, bool)`

GetUsageOk returns a tuple with the Usage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsage

`func (o *CreateCompletionResponse) SetUsage(v CompletionUsage)`

SetUsage sets Usage field to given value.

### HasUsage

`func (o *CreateCompletionResponse) HasUsage() bool`

HasUsage returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


