# ChatCompletionTokenLogprobTopLogprobsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Token** | **string** | The token. | 
**Logprob** | **float32** | The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value &#x60;-9999.0&#x60; is used to signify that the token is very unlikely. | 
**Bytes** | **[]int32** | A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be &#x60;null&#x60; if there is no bytes representation for the token. | 

## Methods

### NewChatCompletionTokenLogprobTopLogprobsInner

`func NewChatCompletionTokenLogprobTopLogprobsInner(token string, logprob float32, bytes []int32, ) *ChatCompletionTokenLogprobTopLogprobsInner`

NewChatCompletionTokenLogprobTopLogprobsInner instantiates a new ChatCompletionTokenLogprobTopLogprobsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewChatCompletionTokenLogprobTopLogprobsInnerWithDefaults

`func NewChatCompletionTokenLogprobTopLogprobsInnerWithDefaults() *ChatCompletionTokenLogprobTopLogprobsInner`

NewChatCompletionTokenLogprobTopLogprobsInnerWithDefaults instantiates a new ChatCompletionTokenLogprobTopLogprobsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetToken

`func (o *ChatCompletionTokenLogprobTopLogprobsInner) GetToken() string`

GetToken returns the Token field if non-nil, zero value otherwise.

### GetTokenOk

`func (o *ChatCompletionTokenLogprobTopLogprobsInner) GetTokenOk() (*string, bool)`

GetTokenOk returns a tuple with the Token field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToken

`func (o *ChatCompletionTokenLogprobTopLogprobsInner) SetToken(v string)`

SetToken sets Token field to given value.


### GetLogprob

`func (o *ChatCompletionTokenLogprobTopLogprobsInner) GetLogprob() float32`

GetLogprob returns the Logprob field if non-nil, zero value otherwise.

### GetLogprobOk

`func (o *ChatCompletionTokenLogprobTopLogprobsInner) GetLogprobOk() (*float32, bool)`

GetLogprobOk returns a tuple with the Logprob field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLogprob

`func (o *ChatCompletionTokenLogprobTopLogprobsInner) SetLogprob(v float32)`

SetLogprob sets Logprob field to given value.


### GetBytes

`func (o *ChatCompletionTokenLogprobTopLogprobsInner) GetBytes() []int32`

GetBytes returns the Bytes field if non-nil, zero value otherwise.

### GetBytesOk

`func (o *ChatCompletionTokenLogprobTopLogprobsInner) GetBytesOk() (*[]int32, bool)`

GetBytesOk returns a tuple with the Bytes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBytes

`func (o *ChatCompletionTokenLogprobTopLogprobsInner) SetBytes(v []int32)`

SetBytes sets Bytes field to given value.


### SetBytesNil

`func (o *ChatCompletionTokenLogprobTopLogprobsInner) SetBytesNil(b bool)`

 SetBytesNil sets the value for Bytes to be an explicit nil

### UnsetBytes
`func (o *ChatCompletionTokenLogprobTopLogprobsInner) UnsetBytes()`

UnsetBytes ensures that no value is present for Bytes, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


