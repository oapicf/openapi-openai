# RealtimeResponseUsageOutputTokenDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TextTokens** | Pointer to **int32** | The number of text tokens used in the Response. | [optional] 
**AudioTokens** | Pointer to **int32** | The number of audio tokens used in the Response. | [optional] 

## Methods

### NewRealtimeResponseUsageOutputTokenDetails

`func NewRealtimeResponseUsageOutputTokenDetails() *RealtimeResponseUsageOutputTokenDetails`

NewRealtimeResponseUsageOutputTokenDetails instantiates a new RealtimeResponseUsageOutputTokenDetails object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRealtimeResponseUsageOutputTokenDetailsWithDefaults

`func NewRealtimeResponseUsageOutputTokenDetailsWithDefaults() *RealtimeResponseUsageOutputTokenDetails`

NewRealtimeResponseUsageOutputTokenDetailsWithDefaults instantiates a new RealtimeResponseUsageOutputTokenDetails object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetTextTokens

`func (o *RealtimeResponseUsageOutputTokenDetails) GetTextTokens() int32`

GetTextTokens returns the TextTokens field if non-nil, zero value otherwise.

### GetTextTokensOk

`func (o *RealtimeResponseUsageOutputTokenDetails) GetTextTokensOk() (*int32, bool)`

GetTextTokensOk returns a tuple with the TextTokens field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTextTokens

`func (o *RealtimeResponseUsageOutputTokenDetails) SetTextTokens(v int32)`

SetTextTokens sets TextTokens field to given value.

### HasTextTokens

`func (o *RealtimeResponseUsageOutputTokenDetails) HasTextTokens() bool`

HasTextTokens returns a boolean if a field has been set.

### GetAudioTokens

`func (o *RealtimeResponseUsageOutputTokenDetails) GetAudioTokens() int32`

GetAudioTokens returns the AudioTokens field if non-nil, zero value otherwise.

### GetAudioTokensOk

`func (o *RealtimeResponseUsageOutputTokenDetails) GetAudioTokensOk() (*int32, bool)`

GetAudioTokensOk returns a tuple with the AudioTokens field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAudioTokens

`func (o *RealtimeResponseUsageOutputTokenDetails) SetAudioTokens(v int32)`

SetAudioTokens sets AudioTokens field to given value.

### HasAudioTokens

`func (o *RealtimeResponseUsageOutputTokenDetails) HasAudioTokens() bool`

HasAudioTokens returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


