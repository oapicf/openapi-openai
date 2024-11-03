# CreateEmbeddingRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Input** | [**CreateEmbeddingRequestInput**](CreateEmbeddingRequestInput.md) |  | 
**Model** | [**CreateEmbeddingRequestModel**](CreateEmbeddingRequestModel.md) |  | 
**EncodingFormat** | Pointer to **string** | The format to return the embeddings in. Can be either &#x60;float&#x60; or [&#x60;base64&#x60;](https://pypi.org/project/pybase64/). | [optional] [default to "float"]
**Dimensions** | Pointer to **int32** | The number of dimensions the resulting output embeddings should have. Only supported in &#x60;text-embedding-3&#x60; and later models.  | [optional] 
**User** | Pointer to **string** | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional] 

## Methods

### NewCreateEmbeddingRequest

`func NewCreateEmbeddingRequest(input CreateEmbeddingRequestInput, model CreateEmbeddingRequestModel, ) *CreateEmbeddingRequest`

NewCreateEmbeddingRequest instantiates a new CreateEmbeddingRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateEmbeddingRequestWithDefaults

`func NewCreateEmbeddingRequestWithDefaults() *CreateEmbeddingRequest`

NewCreateEmbeddingRequestWithDefaults instantiates a new CreateEmbeddingRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetInput

`func (o *CreateEmbeddingRequest) GetInput() CreateEmbeddingRequestInput`

GetInput returns the Input field if non-nil, zero value otherwise.

### GetInputOk

`func (o *CreateEmbeddingRequest) GetInputOk() (*CreateEmbeddingRequestInput, bool)`

GetInputOk returns a tuple with the Input field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInput

`func (o *CreateEmbeddingRequest) SetInput(v CreateEmbeddingRequestInput)`

SetInput sets Input field to given value.


### GetModel

`func (o *CreateEmbeddingRequest) GetModel() CreateEmbeddingRequestModel`

GetModel returns the Model field if non-nil, zero value otherwise.

### GetModelOk

`func (o *CreateEmbeddingRequest) GetModelOk() (*CreateEmbeddingRequestModel, bool)`

GetModelOk returns a tuple with the Model field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModel

`func (o *CreateEmbeddingRequest) SetModel(v CreateEmbeddingRequestModel)`

SetModel sets Model field to given value.


### GetEncodingFormat

`func (o *CreateEmbeddingRequest) GetEncodingFormat() string`

GetEncodingFormat returns the EncodingFormat field if non-nil, zero value otherwise.

### GetEncodingFormatOk

`func (o *CreateEmbeddingRequest) GetEncodingFormatOk() (*string, bool)`

GetEncodingFormatOk returns a tuple with the EncodingFormat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEncodingFormat

`func (o *CreateEmbeddingRequest) SetEncodingFormat(v string)`

SetEncodingFormat sets EncodingFormat field to given value.

### HasEncodingFormat

`func (o *CreateEmbeddingRequest) HasEncodingFormat() bool`

HasEncodingFormat returns a boolean if a field has been set.

### GetDimensions

`func (o *CreateEmbeddingRequest) GetDimensions() int32`

GetDimensions returns the Dimensions field if non-nil, zero value otherwise.

### GetDimensionsOk

`func (o *CreateEmbeddingRequest) GetDimensionsOk() (*int32, bool)`

GetDimensionsOk returns a tuple with the Dimensions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDimensions

`func (o *CreateEmbeddingRequest) SetDimensions(v int32)`

SetDimensions sets Dimensions field to given value.

### HasDimensions

`func (o *CreateEmbeddingRequest) HasDimensions() bool`

HasDimensions returns a boolean if a field has been set.

### GetUser

`func (o *CreateEmbeddingRequest) GetUser() string`

GetUser returns the User field if non-nil, zero value otherwise.

### GetUserOk

`func (o *CreateEmbeddingRequest) GetUserOk() (*string, bool)`

GetUserOk returns a tuple with the User field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUser

`func (o *CreateEmbeddingRequest) SetUser(v string)`

SetUser sets User field to given value.

### HasUser

`func (o *CreateEmbeddingRequest) HasUser() bool`

HasUser returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


