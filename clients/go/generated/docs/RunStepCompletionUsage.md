# RunStepCompletionUsage

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CompletionTokens** | **int32** | Number of completion tokens used over the course of the run step. | 
**PromptTokens** | **int32** | Number of prompt tokens used over the course of the run step. | 
**TotalTokens** | **int32** | Total number of tokens used (prompt + completion). | 

## Methods

### NewRunStepCompletionUsage

`func NewRunStepCompletionUsage(completionTokens int32, promptTokens int32, totalTokens int32, ) *RunStepCompletionUsage`

NewRunStepCompletionUsage instantiates a new RunStepCompletionUsage object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRunStepCompletionUsageWithDefaults

`func NewRunStepCompletionUsageWithDefaults() *RunStepCompletionUsage`

NewRunStepCompletionUsageWithDefaults instantiates a new RunStepCompletionUsage object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCompletionTokens

`func (o *RunStepCompletionUsage) GetCompletionTokens() int32`

GetCompletionTokens returns the CompletionTokens field if non-nil, zero value otherwise.

### GetCompletionTokensOk

`func (o *RunStepCompletionUsage) GetCompletionTokensOk() (*int32, bool)`

GetCompletionTokensOk returns a tuple with the CompletionTokens field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompletionTokens

`func (o *RunStepCompletionUsage) SetCompletionTokens(v int32)`

SetCompletionTokens sets CompletionTokens field to given value.


### GetPromptTokens

`func (o *RunStepCompletionUsage) GetPromptTokens() int32`

GetPromptTokens returns the PromptTokens field if non-nil, zero value otherwise.

### GetPromptTokensOk

`func (o *RunStepCompletionUsage) GetPromptTokensOk() (*int32, bool)`

GetPromptTokensOk returns a tuple with the PromptTokens field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPromptTokens

`func (o *RunStepCompletionUsage) SetPromptTokens(v int32)`

SetPromptTokens sets PromptTokens field to given value.


### GetTotalTokens

`func (o *RunStepCompletionUsage) GetTotalTokens() int32`

GetTotalTokens returns the TotalTokens field if non-nil, zero value otherwise.

### GetTotalTokensOk

`func (o *RunStepCompletionUsage) GetTotalTokensOk() (*int32, bool)`

GetTotalTokensOk returns a tuple with the TotalTokens field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalTokens

`func (o *RunStepCompletionUsage) SetTotalTokens(v int32)`

SetTotalTokens sets TotalTokens field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


