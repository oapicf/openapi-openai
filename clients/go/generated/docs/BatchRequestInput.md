# BatchRequestInput

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CustomId** | Pointer to **string** | A developer-provided per-request id that will be used to match outputs to inputs. Must be unique for each request in a batch. | [optional] 
**Method** | Pointer to **string** | The HTTP method to be used for the request. Currently only &#x60;POST&#x60; is supported. | [optional] 
**Url** | Pointer to **string** | The OpenAI API relative URL to be used for the request. Currently &#x60;/v1/chat/completions&#x60;, &#x60;/v1/embeddings&#x60;, and &#x60;/v1/completions&#x60; are supported. | [optional] 

## Methods

### NewBatchRequestInput

`func NewBatchRequestInput() *BatchRequestInput`

NewBatchRequestInput instantiates a new BatchRequestInput object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBatchRequestInputWithDefaults

`func NewBatchRequestInputWithDefaults() *BatchRequestInput`

NewBatchRequestInputWithDefaults instantiates a new BatchRequestInput object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCustomId

`func (o *BatchRequestInput) GetCustomId() string`

GetCustomId returns the CustomId field if non-nil, zero value otherwise.

### GetCustomIdOk

`func (o *BatchRequestInput) GetCustomIdOk() (*string, bool)`

GetCustomIdOk returns a tuple with the CustomId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomId

`func (o *BatchRequestInput) SetCustomId(v string)`

SetCustomId sets CustomId field to given value.

### HasCustomId

`func (o *BatchRequestInput) HasCustomId() bool`

HasCustomId returns a boolean if a field has been set.

### GetMethod

`func (o *BatchRequestInput) GetMethod() string`

GetMethod returns the Method field if non-nil, zero value otherwise.

### GetMethodOk

`func (o *BatchRequestInput) GetMethodOk() (*string, bool)`

GetMethodOk returns a tuple with the Method field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMethod

`func (o *BatchRequestInput) SetMethod(v string)`

SetMethod sets Method field to given value.

### HasMethod

`func (o *BatchRequestInput) HasMethod() bool`

HasMethod returns a boolean if a field has been set.

### GetUrl

`func (o *BatchRequestInput) GetUrl() string`

GetUrl returns the Url field if non-nil, zero value otherwise.

### GetUrlOk

`func (o *BatchRequestInput) GetUrlOk() (*string, bool)`

GetUrlOk returns a tuple with the Url field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrl

`func (o *BatchRequestInput) SetUrl(v string)`

SetUrl sets Url field to given value.

### HasUrl

`func (o *BatchRequestInput) HasUrl() bool`

HasUrl returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


