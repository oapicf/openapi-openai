# CreateCompletionResponseUsage

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PromptTokens** | **int32** |  | 
**CompletionTokens** | **int32** |  | 
**TotalTokens** | **int32** |  | 

## Methods

### NewCreateCompletionResponseUsage

`func NewCreateCompletionResponseUsage(promptTokens int32, completionTokens int32, totalTokens int32, ) *CreateCompletionResponseUsage`

NewCreateCompletionResponseUsage instantiates a new CreateCompletionResponseUsage object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateCompletionResponseUsageWithDefaults

`func NewCreateCompletionResponseUsageWithDefaults() *CreateCompletionResponseUsage`

NewCreateCompletionResponseUsageWithDefaults instantiates a new CreateCompletionResponseUsage object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPromptTokens

`func (o *CreateCompletionResponseUsage) GetPromptTokens() int32`

GetPromptTokens returns the PromptTokens field if non-nil, zero value otherwise.

### GetPromptTokensOk

`func (o *CreateCompletionResponseUsage) GetPromptTokensOk() (*int32, bool)`

GetPromptTokensOk returns a tuple with the PromptTokens field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPromptTokens

`func (o *CreateCompletionResponseUsage) SetPromptTokens(v int32)`

SetPromptTokens sets PromptTokens field to given value.


### GetCompletionTokens

`func (o *CreateCompletionResponseUsage) GetCompletionTokens() int32`

GetCompletionTokens returns the CompletionTokens field if non-nil, zero value otherwise.

### GetCompletionTokensOk

`func (o *CreateCompletionResponseUsage) GetCompletionTokensOk() (*int32, bool)`

GetCompletionTokensOk returns a tuple with the CompletionTokens field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompletionTokens

`func (o *CreateCompletionResponseUsage) SetCompletionTokens(v int32)`

SetCompletionTokens sets CompletionTokens field to given value.


### GetTotalTokens

`func (o *CreateCompletionResponseUsage) GetTotalTokens() int32`

GetTotalTokens returns the TotalTokens field if non-nil, zero value otherwise.

### GetTotalTokensOk

`func (o *CreateCompletionResponseUsage) GetTotalTokensOk() (*int32, bool)`

GetTotalTokensOk returns a tuple with the TotalTokens field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalTokens

`func (o *CreateCompletionResponseUsage) SetTotalTokens(v int32)`

SetTotalTokens sets TotalTokens field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


