# CompletionUsagePromptTokensDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AudioTokens** | Pointer to **int32** | Audio input tokens present in the prompt. | [optional] 
**CachedTokens** | Pointer to **int32** | Cached tokens present in the prompt. | [optional] 

## Methods

### NewCompletionUsagePromptTokensDetails

`func NewCompletionUsagePromptTokensDetails() *CompletionUsagePromptTokensDetails`

NewCompletionUsagePromptTokensDetails instantiates a new CompletionUsagePromptTokensDetails object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCompletionUsagePromptTokensDetailsWithDefaults

`func NewCompletionUsagePromptTokensDetailsWithDefaults() *CompletionUsagePromptTokensDetails`

NewCompletionUsagePromptTokensDetailsWithDefaults instantiates a new CompletionUsagePromptTokensDetails object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAudioTokens

`func (o *CompletionUsagePromptTokensDetails) GetAudioTokens() int32`

GetAudioTokens returns the AudioTokens field if non-nil, zero value otherwise.

### GetAudioTokensOk

`func (o *CompletionUsagePromptTokensDetails) GetAudioTokensOk() (*int32, bool)`

GetAudioTokensOk returns a tuple with the AudioTokens field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAudioTokens

`func (o *CompletionUsagePromptTokensDetails) SetAudioTokens(v int32)`

SetAudioTokens sets AudioTokens field to given value.

### HasAudioTokens

`func (o *CompletionUsagePromptTokensDetails) HasAudioTokens() bool`

HasAudioTokens returns a boolean if a field has been set.

### GetCachedTokens

`func (o *CompletionUsagePromptTokensDetails) GetCachedTokens() int32`

GetCachedTokens returns the CachedTokens field if non-nil, zero value otherwise.

### GetCachedTokensOk

`func (o *CompletionUsagePromptTokensDetails) GetCachedTokensOk() (*int32, bool)`

GetCachedTokensOk returns a tuple with the CachedTokens field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCachedTokens

`func (o *CompletionUsagePromptTokensDetails) SetCachedTokens(v int32)`

SetCachedTokens sets CachedTokens field to given value.

### HasCachedTokens

`func (o *CompletionUsagePromptTokensDetails) HasCachedTokens() bool`

HasCachedTokens returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


