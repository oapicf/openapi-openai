# Image

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**B64Json** | Pointer to **string** | The base64-encoded JSON of the generated image, if &#x60;response_format&#x60; is &#x60;b64_json&#x60;. | [optional] 
**Url** | Pointer to **string** | The URL of the generated image, if &#x60;response_format&#x60; is &#x60;url&#x60; (default). | [optional] 
**RevisedPrompt** | Pointer to **string** | The prompt that was used to generate the image, if there was any revision to the prompt. | [optional] 

## Methods

### NewImage

`func NewImage() *Image`

NewImage instantiates a new Image object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewImageWithDefaults

`func NewImageWithDefaults() *Image`

NewImageWithDefaults instantiates a new Image object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetB64Json

`func (o *Image) GetB64Json() string`

GetB64Json returns the B64Json field if non-nil, zero value otherwise.

### GetB64JsonOk

`func (o *Image) GetB64JsonOk() (*string, bool)`

GetB64JsonOk returns a tuple with the B64Json field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetB64Json

`func (o *Image) SetB64Json(v string)`

SetB64Json sets B64Json field to given value.

### HasB64Json

`func (o *Image) HasB64Json() bool`

HasB64Json returns a boolean if a field has been set.

### GetUrl

`func (o *Image) GetUrl() string`

GetUrl returns the Url field if non-nil, zero value otherwise.

### GetUrlOk

`func (o *Image) GetUrlOk() (*string, bool)`

GetUrlOk returns a tuple with the Url field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrl

`func (o *Image) SetUrl(v string)`

SetUrl sets Url field to given value.

### HasUrl

`func (o *Image) HasUrl() bool`

HasUrl returns a boolean if a field has been set.

### GetRevisedPrompt

`func (o *Image) GetRevisedPrompt() string`

GetRevisedPrompt returns the RevisedPrompt field if non-nil, zero value otherwise.

### GetRevisedPromptOk

`func (o *Image) GetRevisedPromptOk() (*string, bool)`

GetRevisedPromptOk returns a tuple with the RevisedPrompt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRevisedPrompt

`func (o *Image) SetRevisedPrompt(v string)`

SetRevisedPrompt sets RevisedPrompt field to given value.

### HasRevisedPrompt

`func (o *Image) HasRevisedPrompt() bool`

HasRevisedPrompt returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


