# CreateCompletionResponseChoicesInnerLogprobs

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Tokens** | Pointer to **[]string** |  | [optional] 
**TokenLogprobs** | Pointer to **[]float32** |  | [optional] 
**TopLogprobs** | Pointer to **[]map[string]interface{}** |  | [optional] 
**TextOffset** | Pointer to **[]int32** |  | [optional] 

## Methods

### NewCreateCompletionResponseChoicesInnerLogprobs

`func NewCreateCompletionResponseChoicesInnerLogprobs() *CreateCompletionResponseChoicesInnerLogprobs`

NewCreateCompletionResponseChoicesInnerLogprobs instantiates a new CreateCompletionResponseChoicesInnerLogprobs object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateCompletionResponseChoicesInnerLogprobsWithDefaults

`func NewCreateCompletionResponseChoicesInnerLogprobsWithDefaults() *CreateCompletionResponseChoicesInnerLogprobs`

NewCreateCompletionResponseChoicesInnerLogprobsWithDefaults instantiates a new CreateCompletionResponseChoicesInnerLogprobs object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetTokens

`func (o *CreateCompletionResponseChoicesInnerLogprobs) GetTokens() []string`

GetTokens returns the Tokens field if non-nil, zero value otherwise.

### GetTokensOk

`func (o *CreateCompletionResponseChoicesInnerLogprobs) GetTokensOk() (*[]string, bool)`

GetTokensOk returns a tuple with the Tokens field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTokens

`func (o *CreateCompletionResponseChoicesInnerLogprobs) SetTokens(v []string)`

SetTokens sets Tokens field to given value.

### HasTokens

`func (o *CreateCompletionResponseChoicesInnerLogprobs) HasTokens() bool`

HasTokens returns a boolean if a field has been set.

### GetTokenLogprobs

`func (o *CreateCompletionResponseChoicesInnerLogprobs) GetTokenLogprobs() []float32`

GetTokenLogprobs returns the TokenLogprobs field if non-nil, zero value otherwise.

### GetTokenLogprobsOk

`func (o *CreateCompletionResponseChoicesInnerLogprobs) GetTokenLogprobsOk() (*[]float32, bool)`

GetTokenLogprobsOk returns a tuple with the TokenLogprobs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTokenLogprobs

`func (o *CreateCompletionResponseChoicesInnerLogprobs) SetTokenLogprobs(v []float32)`

SetTokenLogprobs sets TokenLogprobs field to given value.

### HasTokenLogprobs

`func (o *CreateCompletionResponseChoicesInnerLogprobs) HasTokenLogprobs() bool`

HasTokenLogprobs returns a boolean if a field has been set.

### GetTopLogprobs

`func (o *CreateCompletionResponseChoicesInnerLogprobs) GetTopLogprobs() []map[string]interface{}`

GetTopLogprobs returns the TopLogprobs field if non-nil, zero value otherwise.

### GetTopLogprobsOk

`func (o *CreateCompletionResponseChoicesInnerLogprobs) GetTopLogprobsOk() (*[]map[string]interface{}, bool)`

GetTopLogprobsOk returns a tuple with the TopLogprobs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTopLogprobs

`func (o *CreateCompletionResponseChoicesInnerLogprobs) SetTopLogprobs(v []map[string]interface{})`

SetTopLogprobs sets TopLogprobs field to given value.

### HasTopLogprobs

`func (o *CreateCompletionResponseChoicesInnerLogprobs) HasTopLogprobs() bool`

HasTopLogprobs returns a boolean if a field has been set.

### GetTextOffset

`func (o *CreateCompletionResponseChoicesInnerLogprobs) GetTextOffset() []int32`

GetTextOffset returns the TextOffset field if non-nil, zero value otherwise.

### GetTextOffsetOk

`func (o *CreateCompletionResponseChoicesInnerLogprobs) GetTextOffsetOk() (*[]int32, bool)`

GetTextOffsetOk returns a tuple with the TextOffset field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTextOffset

`func (o *CreateCompletionResponseChoicesInnerLogprobs) SetTextOffset(v []int32)`

SetTextOffset sets TextOffset field to given value.

### HasTextOffset

`func (o *CreateCompletionResponseChoicesInnerLogprobs) HasTextOffset() bool`

HasTextOffset returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


