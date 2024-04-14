# CreateImageRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Prompt** | **string** | A text description of the desired image(s). The maximum length is 1000 characters for &#x60;dall-e-2&#x60; and 4000 characters for &#x60;dall-e-3&#x60;. | 
**Model** | Pointer to [**NullableCreateImageRequestModel**](CreateImageRequestModel.md) |  | [optional] [default to dall-e-2]
**N** | Pointer to **NullableInt32** | The number of images to generate. Must be between 1 and 10. For &#x60;dall-e-3&#x60;, only &#x60;n&#x3D;1&#x60; is supported. | [optional] [default to 1]
**Quality** | Pointer to **string** | The quality of the image that will be generated. &#x60;hd&#x60; creates images with finer details and greater consistency across the image. This param is only supported for &#x60;dall-e-3&#x60;. | [optional] [default to "standard"]
**ResponseFormat** | Pointer to **NullableString** | The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated. | [optional] [default to "url"]
**Size** | Pointer to **NullableString** | The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60; for &#x60;dall-e-2&#x60;. Must be one of &#x60;1024x1024&#x60;, &#x60;1792x1024&#x60;, or &#x60;1024x1792&#x60; for &#x60;dall-e-3&#x60; models. | [optional] [default to "1024x1024"]
**Style** | Pointer to **NullableString** | The style of the generated images. Must be one of &#x60;vivid&#x60; or &#x60;natural&#x60;. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for &#x60;dall-e-3&#x60;. | [optional] [default to "vivid"]
**User** | Pointer to **string** | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional] 

## Methods

### NewCreateImageRequest

`func NewCreateImageRequest(prompt string, ) *CreateImageRequest`

NewCreateImageRequest instantiates a new CreateImageRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateImageRequestWithDefaults

`func NewCreateImageRequestWithDefaults() *CreateImageRequest`

NewCreateImageRequestWithDefaults instantiates a new CreateImageRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPrompt

`func (o *CreateImageRequest) GetPrompt() string`

GetPrompt returns the Prompt field if non-nil, zero value otherwise.

### GetPromptOk

`func (o *CreateImageRequest) GetPromptOk() (*string, bool)`

GetPromptOk returns a tuple with the Prompt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrompt

`func (o *CreateImageRequest) SetPrompt(v string)`

SetPrompt sets Prompt field to given value.


### GetModel

`func (o *CreateImageRequest) GetModel() CreateImageRequestModel`

GetModel returns the Model field if non-nil, zero value otherwise.

### GetModelOk

`func (o *CreateImageRequest) GetModelOk() (*CreateImageRequestModel, bool)`

GetModelOk returns a tuple with the Model field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModel

`func (o *CreateImageRequest) SetModel(v CreateImageRequestModel)`

SetModel sets Model field to given value.

### HasModel

`func (o *CreateImageRequest) HasModel() bool`

HasModel returns a boolean if a field has been set.

### SetModelNil

`func (o *CreateImageRequest) SetModelNil(b bool)`

 SetModelNil sets the value for Model to be an explicit nil

### UnsetModel
`func (o *CreateImageRequest) UnsetModel()`

UnsetModel ensures that no value is present for Model, not even an explicit nil
### GetN

`func (o *CreateImageRequest) GetN() int32`

GetN returns the N field if non-nil, zero value otherwise.

### GetNOk

`func (o *CreateImageRequest) GetNOk() (*int32, bool)`

GetNOk returns a tuple with the N field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetN

`func (o *CreateImageRequest) SetN(v int32)`

SetN sets N field to given value.

### HasN

`func (o *CreateImageRequest) HasN() bool`

HasN returns a boolean if a field has been set.

### SetNNil

`func (o *CreateImageRequest) SetNNil(b bool)`

 SetNNil sets the value for N to be an explicit nil

### UnsetN
`func (o *CreateImageRequest) UnsetN()`

UnsetN ensures that no value is present for N, not even an explicit nil
### GetQuality

`func (o *CreateImageRequest) GetQuality() string`

GetQuality returns the Quality field if non-nil, zero value otherwise.

### GetQualityOk

`func (o *CreateImageRequest) GetQualityOk() (*string, bool)`

GetQualityOk returns a tuple with the Quality field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuality

`func (o *CreateImageRequest) SetQuality(v string)`

SetQuality sets Quality field to given value.

### HasQuality

`func (o *CreateImageRequest) HasQuality() bool`

HasQuality returns a boolean if a field has been set.

### GetResponseFormat

`func (o *CreateImageRequest) GetResponseFormat() string`

GetResponseFormat returns the ResponseFormat field if non-nil, zero value otherwise.

### GetResponseFormatOk

`func (o *CreateImageRequest) GetResponseFormatOk() (*string, bool)`

GetResponseFormatOk returns a tuple with the ResponseFormat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponseFormat

`func (o *CreateImageRequest) SetResponseFormat(v string)`

SetResponseFormat sets ResponseFormat field to given value.

### HasResponseFormat

`func (o *CreateImageRequest) HasResponseFormat() bool`

HasResponseFormat returns a boolean if a field has been set.

### SetResponseFormatNil

`func (o *CreateImageRequest) SetResponseFormatNil(b bool)`

 SetResponseFormatNil sets the value for ResponseFormat to be an explicit nil

### UnsetResponseFormat
`func (o *CreateImageRequest) UnsetResponseFormat()`

UnsetResponseFormat ensures that no value is present for ResponseFormat, not even an explicit nil
### GetSize

`func (o *CreateImageRequest) GetSize() string`

GetSize returns the Size field if non-nil, zero value otherwise.

### GetSizeOk

`func (o *CreateImageRequest) GetSizeOk() (*string, bool)`

GetSizeOk returns a tuple with the Size field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSize

`func (o *CreateImageRequest) SetSize(v string)`

SetSize sets Size field to given value.

### HasSize

`func (o *CreateImageRequest) HasSize() bool`

HasSize returns a boolean if a field has been set.

### SetSizeNil

`func (o *CreateImageRequest) SetSizeNil(b bool)`

 SetSizeNil sets the value for Size to be an explicit nil

### UnsetSize
`func (o *CreateImageRequest) UnsetSize()`

UnsetSize ensures that no value is present for Size, not even an explicit nil
### GetStyle

`func (o *CreateImageRequest) GetStyle() string`

GetStyle returns the Style field if non-nil, zero value otherwise.

### GetStyleOk

`func (o *CreateImageRequest) GetStyleOk() (*string, bool)`

GetStyleOk returns a tuple with the Style field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStyle

`func (o *CreateImageRequest) SetStyle(v string)`

SetStyle sets Style field to given value.

### HasStyle

`func (o *CreateImageRequest) HasStyle() bool`

HasStyle returns a boolean if a field has been set.

### SetStyleNil

`func (o *CreateImageRequest) SetStyleNil(b bool)`

 SetStyleNil sets the value for Style to be an explicit nil

### UnsetStyle
`func (o *CreateImageRequest) UnsetStyle()`

UnsetStyle ensures that no value is present for Style, not even an explicit nil
### GetUser

`func (o *CreateImageRequest) GetUser() string`

GetUser returns the User field if non-nil, zero value otherwise.

### GetUserOk

`func (o *CreateImageRequest) GetUserOk() (*string, bool)`

GetUserOk returns a tuple with the User field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUser

`func (o *CreateImageRequest) SetUser(v string)`

SetUser sets User field to given value.

### HasUser

`func (o *CreateImageRequest) HasUser() bool`

HasUser returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


