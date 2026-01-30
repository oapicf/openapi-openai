# RealtimeSessionTurnDetection

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | Pointer to **string** | Type of turn detection, only &#x60;server_vad&#x60; is currently supported.  | [optional] 
**Threshold** | Pointer to **float32** | Activation threshold for VAD (0.0 to 1.0), this defaults to 0.5. A  higher threshold will require louder audio to activate the model, and  thus might perform better in noisy environments.  | [optional] 
**PrefixPaddingMs** | Pointer to **int32** | Amount of audio to include before the VAD detected speech (in  milliseconds). Defaults to 300ms.  | [optional] 
**SilenceDurationMs** | Pointer to **int32** | Duration of silence to detect speech stop (in milliseconds). Defaults  to 500ms. With shorter values the model will respond more quickly,  but may jump in on short pauses from the user.  | [optional] 

## Methods

### NewRealtimeSessionTurnDetection

`func NewRealtimeSessionTurnDetection() *RealtimeSessionTurnDetection`

NewRealtimeSessionTurnDetection instantiates a new RealtimeSessionTurnDetection object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRealtimeSessionTurnDetectionWithDefaults

`func NewRealtimeSessionTurnDetectionWithDefaults() *RealtimeSessionTurnDetection`

NewRealtimeSessionTurnDetectionWithDefaults instantiates a new RealtimeSessionTurnDetection object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *RealtimeSessionTurnDetection) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *RealtimeSessionTurnDetection) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *RealtimeSessionTurnDetection) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *RealtimeSessionTurnDetection) HasType() bool`

HasType returns a boolean if a field has been set.

### GetThreshold

`func (o *RealtimeSessionTurnDetection) GetThreshold() float32`

GetThreshold returns the Threshold field if non-nil, zero value otherwise.

### GetThresholdOk

`func (o *RealtimeSessionTurnDetection) GetThresholdOk() (*float32, bool)`

GetThresholdOk returns a tuple with the Threshold field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetThreshold

`func (o *RealtimeSessionTurnDetection) SetThreshold(v float32)`

SetThreshold sets Threshold field to given value.

### HasThreshold

`func (o *RealtimeSessionTurnDetection) HasThreshold() bool`

HasThreshold returns a boolean if a field has been set.

### GetPrefixPaddingMs

`func (o *RealtimeSessionTurnDetection) GetPrefixPaddingMs() int32`

GetPrefixPaddingMs returns the PrefixPaddingMs field if non-nil, zero value otherwise.

### GetPrefixPaddingMsOk

`func (o *RealtimeSessionTurnDetection) GetPrefixPaddingMsOk() (*int32, bool)`

GetPrefixPaddingMsOk returns a tuple with the PrefixPaddingMs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrefixPaddingMs

`func (o *RealtimeSessionTurnDetection) SetPrefixPaddingMs(v int32)`

SetPrefixPaddingMs sets PrefixPaddingMs field to given value.

### HasPrefixPaddingMs

`func (o *RealtimeSessionTurnDetection) HasPrefixPaddingMs() bool`

HasPrefixPaddingMs returns a boolean if a field has been set.

### GetSilenceDurationMs

`func (o *RealtimeSessionTurnDetection) GetSilenceDurationMs() int32`

GetSilenceDurationMs returns the SilenceDurationMs field if non-nil, zero value otherwise.

### GetSilenceDurationMsOk

`func (o *RealtimeSessionTurnDetection) GetSilenceDurationMsOk() (*int32, bool)`

GetSilenceDurationMsOk returns a tuple with the SilenceDurationMs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSilenceDurationMs

`func (o *RealtimeSessionTurnDetection) SetSilenceDurationMs(v int32)`

SetSilenceDurationMs sets SilenceDurationMs field to given value.

### HasSilenceDurationMs

`func (o *RealtimeSessionTurnDetection) HasSilenceDurationMs() bool`

HasSilenceDurationMs returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


