# CreateEmbeddingRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Model** | [**CreateEmbeddingRequestModel**](CreateEmbeddingRequestModel.md) |  | 
**Input** | [**CreateEmbeddingRequestInput**](CreateEmbeddingRequestInput.md) |  | 
**User** | Pointer to **string** | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional] 

## Methods

### NewCreateEmbeddingRequest

`func NewCreateEmbeddingRequest(model CreateEmbeddingRequestModel, input CreateEmbeddingRequestInput, ) *CreateEmbeddingRequest`

NewCreateEmbeddingRequest instantiates a new CreateEmbeddingRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateEmbeddingRequestWithDefaults

`func NewCreateEmbeddingRequestWithDefaults() *CreateEmbeddingRequest`

NewCreateEmbeddingRequestWithDefaults instantiates a new CreateEmbeddingRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

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


