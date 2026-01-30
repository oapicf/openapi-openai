# CompletionUsage

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CompletionTokens** | **int32** | Number of tokens in the generated completion. | 
**PromptTokens** | **int32** | Number of tokens in the prompt. | 
**TotalTokens** | **int32** | Total number of tokens used in the request (prompt + completion). | 
**CompletionTokensDetails** | Pointer to [**CompletionUsageCompletionTokensDetails**](CompletionUsageCompletionTokensDetails.md) |  | [optional] 
**PromptTokensDetails** | Pointer to [**CompletionUsagePromptTokensDetails**](CompletionUsagePromptTokensDetails.md) |  | [optional] 

## Methods

### NewCompletionUsage

`func NewCompletionUsage(completionTokens int32, promptTokens int32, totalTokens int32, ) *CompletionUsage`

NewCompletionUsage instantiates a new CompletionUsage object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCompletionUsageWithDefaults

`func NewCompletionUsageWithDefaults() *CompletionUsage`

NewCompletionUsageWithDefaults instantiates a new CompletionUsage object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCompletionTokens

`func (o *CompletionUsage) GetCompletionTokens() int32`

GetCompletionTokens returns the CompletionTokens field if non-nil, zero value otherwise.

### GetCompletionTokensOk

`func (o *CompletionUsage) GetCompletionTokensOk() (*int32, bool)`

GetCompletionTokensOk returns a tuple with the CompletionTokens field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompletionTokens

`func (o *CompletionUsage) SetCompletionTokens(v int32)`

SetCompletionTokens sets CompletionTokens field to given value.


### GetPromptTokens

`func (o *CompletionUsage) GetPromptTokens() int32`

GetPromptTokens returns the PromptTokens field if non-nil, zero value otherwise.

### GetPromptTokensOk

`func (o *CompletionUsage) GetPromptTokensOk() (*int32, bool)`

GetPromptTokensOk returns a tuple with the PromptTokens field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPromptTokens

`func (o *CompletionUsage) SetPromptTokens(v int32)`

SetPromptTokens sets PromptTokens field to given value.


### GetTotalTokens

`func (o *CompletionUsage) GetTotalTokens() int32`

GetTotalTokens returns the TotalTokens field if non-nil, zero value otherwise.

### GetTotalTokensOk

`func (o *CompletionUsage) GetTotalTokensOk() (*int32, bool)`

GetTotalTokensOk returns a tuple with the TotalTokens field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalTokens

`func (o *CompletionUsage) SetTotalTokens(v int32)`

SetTotalTokens sets TotalTokens field to given value.


### GetCompletionTokensDetails

`func (o *CompletionUsage) GetCompletionTokensDetails() CompletionUsageCompletionTokensDetails`

GetCompletionTokensDetails returns the CompletionTokensDetails field if non-nil, zero value otherwise.

### GetCompletionTokensDetailsOk

`func (o *CompletionUsage) GetCompletionTokensDetailsOk() (*CompletionUsageCompletionTokensDetails, bool)`

GetCompletionTokensDetailsOk returns a tuple with the CompletionTokensDetails field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompletionTokensDetails

`func (o *CompletionUsage) SetCompletionTokensDetails(v CompletionUsageCompletionTokensDetails)`

SetCompletionTokensDetails sets CompletionTokensDetails field to given value.

### HasCompletionTokensDetails

`func (o *CompletionUsage) HasCompletionTokensDetails() bool`

HasCompletionTokensDetails returns a boolean if a field has been set.

### GetPromptTokensDetails

`func (o *CompletionUsage) GetPromptTokensDetails() CompletionUsagePromptTokensDetails`

GetPromptTokensDetails returns the PromptTokensDetails field if non-nil, zero value otherwise.

### GetPromptTokensDetailsOk

`func (o *CompletionUsage) GetPromptTokensDetailsOk() (*CompletionUsagePromptTokensDetails, bool)`

GetPromptTokensDetailsOk returns a tuple with the PromptTokensDetails field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPromptTokensDetails

`func (o *CompletionUsage) SetPromptTokensDetails(v CompletionUsagePromptTokensDetails)`

SetPromptTokensDetails sets PromptTokensDetails field to given value.

### HasPromptTokensDetails

`func (o *CompletionUsage) HasPromptTokensDetails() bool`

HasPromptTokensDetails returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


