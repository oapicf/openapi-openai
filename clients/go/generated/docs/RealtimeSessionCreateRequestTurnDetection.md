# RealtimeSessionCreateRequestTurnDetection

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | Pointer to **string** | Type of turn detection, only &#x60;server_vad&#x60; is currently supported.  | [optional] 
**Threshold** | Pointer to **float32** | Activation threshold for VAD (0.0 to 1.0), this defaults to 0.5. A  higher threshold will require louder audio to activate the model, and  thus might perform better in noisy environments.  | [optional] 
**PrefixPaddingMs** | Pointer to **int32** | Amount of audio to include before the VAD detected speech (in  milliseconds). Defaults to 300ms.  | [optional] 
**SilenceDurationMs** | Pointer to **int32** | Duration of silence to detect speech stop (in milliseconds). Defaults  to 500ms. With shorter values the model will respond more quickly,  but may jump in on short pauses from the user.  | [optional] 
**CreateResponse** | Pointer to **bool** | Whether or not to automatically generate a response when VAD is enabled. &#x60;true&#x60; by default.  | [optional] [default to true]

## Methods

### NewRealtimeSessionCreateRequestTurnDetection

`func NewRealtimeSessionCreateRequestTurnDetection() *RealtimeSessionCreateRequestTurnDetection`

NewRealtimeSessionCreateRequestTurnDetection instantiates a new RealtimeSessionCreateRequestTurnDetection object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRealtimeSessionCreateRequestTurnDetectionWithDefaults

`func NewRealtimeSessionCreateRequestTurnDetectionWithDefaults() *RealtimeSessionCreateRequestTurnDetection`

NewRealtimeSessionCreateRequestTurnDetectionWithDefaults instantiates a new RealtimeSessionCreateRequestTurnDetection object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *RealtimeSessionCreateRequestTurnDetection) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *RealtimeSessionCreateRequestTurnDetection) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *RealtimeSessionCreateRequestTurnDetection) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *RealtimeSessionCreateRequestTurnDetection) HasType() bool`

HasType returns a boolean if a field has been set.

### GetThreshold

`func (o *RealtimeSessionCreateRequestTurnDetection) GetThreshold() float32`

GetThreshold returns the Threshold field if non-nil, zero value otherwise.

### GetThresholdOk

`func (o *RealtimeSessionCreateRequestTurnDetection) GetThresholdOk() (*float32, bool)`

GetThresholdOk returns a tuple with the Threshold field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetThreshold

`func (o *RealtimeSessionCreateRequestTurnDetection) SetThreshold(v float32)`

SetThreshold sets Threshold field to given value.

### HasThreshold

`func (o *RealtimeSessionCreateRequestTurnDetection) HasThreshold() bool`

HasThreshold returns a boolean if a field has been set.

### GetPrefixPaddingMs

`func (o *RealtimeSessionCreateRequestTurnDetection) GetPrefixPaddingMs() int32`

GetPrefixPaddingMs returns the PrefixPaddingMs field if non-nil, zero value otherwise.

### GetPrefixPaddingMsOk

`func (o *RealtimeSessionCreateRequestTurnDetection) GetPrefixPaddingMsOk() (*int32, bool)`

GetPrefixPaddingMsOk returns a tuple with the PrefixPaddingMs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrefixPaddingMs

`func (o *RealtimeSessionCreateRequestTurnDetection) SetPrefixPaddingMs(v int32)`

SetPrefixPaddingMs sets PrefixPaddingMs field to given value.

### HasPrefixPaddingMs

`func (o *RealtimeSessionCreateRequestTurnDetection) HasPrefixPaddingMs() bool`

HasPrefixPaddingMs returns a boolean if a field has been set.

### GetSilenceDurationMs

`func (o *RealtimeSessionCreateRequestTurnDetection) GetSilenceDurationMs() int32`

GetSilenceDurationMs returns the SilenceDurationMs field if non-nil, zero value otherwise.

### GetSilenceDurationMsOk

`func (o *RealtimeSessionCreateRequestTurnDetection) GetSilenceDurationMsOk() (*int32, bool)`

GetSilenceDurationMsOk returns a tuple with the SilenceDurationMs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSilenceDurationMs

`func (o *RealtimeSessionCreateRequestTurnDetection) SetSilenceDurationMs(v int32)`

SetSilenceDurationMs sets SilenceDurationMs field to given value.

### HasSilenceDurationMs

`func (o *RealtimeSessionCreateRequestTurnDetection) HasSilenceDurationMs() bool`

HasSilenceDurationMs returns a boolean if a field has been set.

### GetCreateResponse

`func (o *RealtimeSessionCreateRequestTurnDetection) GetCreateResponse() bool`

GetCreateResponse returns the CreateResponse field if non-nil, zero value otherwise.

### GetCreateResponseOk

`func (o *RealtimeSessionCreateRequestTurnDetection) GetCreateResponseOk() (*bool, bool)`

GetCreateResponseOk returns a tuple with the CreateResponse field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreateResponse

`func (o *RealtimeSessionCreateRequestTurnDetection) SetCreateResponse(v bool)`

SetCreateResponse sets CreateResponse field to given value.

### HasCreateResponse

`func (o *RealtimeSessionCreateRequestTurnDetection) HasCreateResponse() bool`

HasCreateResponse returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


