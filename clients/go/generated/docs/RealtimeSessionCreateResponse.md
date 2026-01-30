# RealtimeSessionCreateResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ClientSecret** | Pointer to [**RealtimeSessionCreateResponseClientSecret**](RealtimeSessionCreateResponseClientSecret.md) |  | [optional] 
**Modalities** | Pointer to **[]string** | The set of modalities the model can respond with. To disable audio, set this to [\&quot;text\&quot;].  | [optional] 
**Instructions** | Pointer to **string** | The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \&quot;be extremely succinct\&quot;, \&quot;act friendly\&quot;, \&quot;here are examples of good  responses\&quot;) and on audio behavior (e.g. \&quot;talk quickly\&quot;, \&quot;inject emotion  into your voice\&quot;, \&quot;laugh frequently\&quot;). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the &#x60;session.created&#x60; event at the  start of the session.  | [optional] 
**Voice** | Pointer to **string** | The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are &#x60;alloy&#x60;, &#x60;ash&#x60;, &#x60;ballad&#x60;, &#x60;coral&#x60;, &#x60;echo&#x60; &#x60;sage&#x60;,  &#x60;shimmer&#x60; and &#x60;verse&#x60;.  | [optional] 
**InputAudioFormat** | Pointer to **string** | The format of input audio. Options are &#x60;pcm16&#x60;, &#x60;g711_ulaw&#x60;, or &#x60;g711_alaw&#x60;.  | [optional] 
**OutputAudioFormat** | Pointer to **string** | The format of output audio. Options are &#x60;pcm16&#x60;, &#x60;g711_ulaw&#x60;, or &#x60;g711_alaw&#x60;.  | [optional] 
**InputAudioTranscription** | Pointer to [**RealtimeSessionInputAudioTranscription**](RealtimeSessionInputAudioTranscription.md) |  | [optional] 
**TurnDetection** | Pointer to [**RealtimeSessionCreateResponseTurnDetection**](RealtimeSessionCreateResponseTurnDetection.md) |  | [optional] 
**Tools** | Pointer to [**[]RealtimeResponseCreateParamsToolsInner**](RealtimeResponseCreateParamsToolsInner.md) | Tools (functions) available to the model. | [optional] 
**ToolChoice** | Pointer to **string** | How the model chooses tools. Options are &#x60;auto&#x60;, &#x60;none&#x60;, &#x60;required&#x60;, or  specify a function.  | [optional] 
**Temperature** | Pointer to **float32** | Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8.  | [optional] 
**MaxResponseOutputTokens** | Pointer to [**RealtimeResponseCreateParamsMaxResponseOutputTokens**](RealtimeResponseCreateParamsMaxResponseOutputTokens.md) |  | [optional] 

## Methods

### NewRealtimeSessionCreateResponse

`func NewRealtimeSessionCreateResponse() *RealtimeSessionCreateResponse`

NewRealtimeSessionCreateResponse instantiates a new RealtimeSessionCreateResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRealtimeSessionCreateResponseWithDefaults

`func NewRealtimeSessionCreateResponseWithDefaults() *RealtimeSessionCreateResponse`

NewRealtimeSessionCreateResponseWithDefaults instantiates a new RealtimeSessionCreateResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetClientSecret

`func (o *RealtimeSessionCreateResponse) GetClientSecret() RealtimeSessionCreateResponseClientSecret`

GetClientSecret returns the ClientSecret field if non-nil, zero value otherwise.

### GetClientSecretOk

`func (o *RealtimeSessionCreateResponse) GetClientSecretOk() (*RealtimeSessionCreateResponseClientSecret, bool)`

GetClientSecretOk returns a tuple with the ClientSecret field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClientSecret

`func (o *RealtimeSessionCreateResponse) SetClientSecret(v RealtimeSessionCreateResponseClientSecret)`

SetClientSecret sets ClientSecret field to given value.

### HasClientSecret

`func (o *RealtimeSessionCreateResponse) HasClientSecret() bool`

HasClientSecret returns a boolean if a field has been set.

### GetModalities

`func (o *RealtimeSessionCreateResponse) GetModalities() []string`

GetModalities returns the Modalities field if non-nil, zero value otherwise.

### GetModalitiesOk

`func (o *RealtimeSessionCreateResponse) GetModalitiesOk() (*[]string, bool)`

GetModalitiesOk returns a tuple with the Modalities field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModalities

`func (o *RealtimeSessionCreateResponse) SetModalities(v []string)`

SetModalities sets Modalities field to given value.

### HasModalities

`func (o *RealtimeSessionCreateResponse) HasModalities() bool`

HasModalities returns a boolean if a field has been set.

### GetInstructions

`func (o *RealtimeSessionCreateResponse) GetInstructions() string`

GetInstructions returns the Instructions field if non-nil, zero value otherwise.

### GetInstructionsOk

`func (o *RealtimeSessionCreateResponse) GetInstructionsOk() (*string, bool)`

GetInstructionsOk returns a tuple with the Instructions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstructions

`func (o *RealtimeSessionCreateResponse) SetInstructions(v string)`

SetInstructions sets Instructions field to given value.

### HasInstructions

`func (o *RealtimeSessionCreateResponse) HasInstructions() bool`

HasInstructions returns a boolean if a field has been set.

### GetVoice

`func (o *RealtimeSessionCreateResponse) GetVoice() string`

GetVoice returns the Voice field if non-nil, zero value otherwise.

### GetVoiceOk

`func (o *RealtimeSessionCreateResponse) GetVoiceOk() (*string, bool)`

GetVoiceOk returns a tuple with the Voice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVoice

`func (o *RealtimeSessionCreateResponse) SetVoice(v string)`

SetVoice sets Voice field to given value.

### HasVoice

`func (o *RealtimeSessionCreateResponse) HasVoice() bool`

HasVoice returns a boolean if a field has been set.

### GetInputAudioFormat

`func (o *RealtimeSessionCreateResponse) GetInputAudioFormat() string`

GetInputAudioFormat returns the InputAudioFormat field if non-nil, zero value otherwise.

### GetInputAudioFormatOk

`func (o *RealtimeSessionCreateResponse) GetInputAudioFormatOk() (*string, bool)`

GetInputAudioFormatOk returns a tuple with the InputAudioFormat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInputAudioFormat

`func (o *RealtimeSessionCreateResponse) SetInputAudioFormat(v string)`

SetInputAudioFormat sets InputAudioFormat field to given value.

### HasInputAudioFormat

`func (o *RealtimeSessionCreateResponse) HasInputAudioFormat() bool`

HasInputAudioFormat returns a boolean if a field has been set.

### GetOutputAudioFormat

`func (o *RealtimeSessionCreateResponse) GetOutputAudioFormat() string`

GetOutputAudioFormat returns the OutputAudioFormat field if non-nil, zero value otherwise.

### GetOutputAudioFormatOk

`func (o *RealtimeSessionCreateResponse) GetOutputAudioFormatOk() (*string, bool)`

GetOutputAudioFormatOk returns a tuple with the OutputAudioFormat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOutputAudioFormat

`func (o *RealtimeSessionCreateResponse) SetOutputAudioFormat(v string)`

SetOutputAudioFormat sets OutputAudioFormat field to given value.

### HasOutputAudioFormat

`func (o *RealtimeSessionCreateResponse) HasOutputAudioFormat() bool`

HasOutputAudioFormat returns a boolean if a field has been set.

### GetInputAudioTranscription

`func (o *RealtimeSessionCreateResponse) GetInputAudioTranscription() RealtimeSessionInputAudioTranscription`

GetInputAudioTranscription returns the InputAudioTranscription field if non-nil, zero value otherwise.

### GetInputAudioTranscriptionOk

`func (o *RealtimeSessionCreateResponse) GetInputAudioTranscriptionOk() (*RealtimeSessionInputAudioTranscription, bool)`

GetInputAudioTranscriptionOk returns a tuple with the InputAudioTranscription field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInputAudioTranscription

`func (o *RealtimeSessionCreateResponse) SetInputAudioTranscription(v RealtimeSessionInputAudioTranscription)`

SetInputAudioTranscription sets InputAudioTranscription field to given value.

### HasInputAudioTranscription

`func (o *RealtimeSessionCreateResponse) HasInputAudioTranscription() bool`

HasInputAudioTranscription returns a boolean if a field has been set.

### GetTurnDetection

`func (o *RealtimeSessionCreateResponse) GetTurnDetection() RealtimeSessionCreateResponseTurnDetection`

GetTurnDetection returns the TurnDetection field if non-nil, zero value otherwise.

### GetTurnDetectionOk

`func (o *RealtimeSessionCreateResponse) GetTurnDetectionOk() (*RealtimeSessionCreateResponseTurnDetection, bool)`

GetTurnDetectionOk returns a tuple with the TurnDetection field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTurnDetection

`func (o *RealtimeSessionCreateResponse) SetTurnDetection(v RealtimeSessionCreateResponseTurnDetection)`

SetTurnDetection sets TurnDetection field to given value.

### HasTurnDetection

`func (o *RealtimeSessionCreateResponse) HasTurnDetection() bool`

HasTurnDetection returns a boolean if a field has been set.

### GetTools

`func (o *RealtimeSessionCreateResponse) GetTools() []RealtimeResponseCreateParamsToolsInner`

GetTools returns the Tools field if non-nil, zero value otherwise.

### GetToolsOk

`func (o *RealtimeSessionCreateResponse) GetToolsOk() (*[]RealtimeResponseCreateParamsToolsInner, bool)`

GetToolsOk returns a tuple with the Tools field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTools

`func (o *RealtimeSessionCreateResponse) SetTools(v []RealtimeResponseCreateParamsToolsInner)`

SetTools sets Tools field to given value.

### HasTools

`func (o *RealtimeSessionCreateResponse) HasTools() bool`

HasTools returns a boolean if a field has been set.

### GetToolChoice

`func (o *RealtimeSessionCreateResponse) GetToolChoice() string`

GetToolChoice returns the ToolChoice field if non-nil, zero value otherwise.

### GetToolChoiceOk

`func (o *RealtimeSessionCreateResponse) GetToolChoiceOk() (*string, bool)`

GetToolChoiceOk returns a tuple with the ToolChoice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToolChoice

`func (o *RealtimeSessionCreateResponse) SetToolChoice(v string)`

SetToolChoice sets ToolChoice field to given value.

### HasToolChoice

`func (o *RealtimeSessionCreateResponse) HasToolChoice() bool`

HasToolChoice returns a boolean if a field has been set.

### GetTemperature

`func (o *RealtimeSessionCreateResponse) GetTemperature() float32`

GetTemperature returns the Temperature field if non-nil, zero value otherwise.

### GetTemperatureOk

`func (o *RealtimeSessionCreateResponse) GetTemperatureOk() (*float32, bool)`

GetTemperatureOk returns a tuple with the Temperature field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTemperature

`func (o *RealtimeSessionCreateResponse) SetTemperature(v float32)`

SetTemperature sets Temperature field to given value.

### HasTemperature

`func (o *RealtimeSessionCreateResponse) HasTemperature() bool`

HasTemperature returns a boolean if a field has been set.

### GetMaxResponseOutputTokens

`func (o *RealtimeSessionCreateResponse) GetMaxResponseOutputTokens() RealtimeResponseCreateParamsMaxResponseOutputTokens`

GetMaxResponseOutputTokens returns the MaxResponseOutputTokens field if non-nil, zero value otherwise.

### GetMaxResponseOutputTokensOk

`func (o *RealtimeSessionCreateResponse) GetMaxResponseOutputTokensOk() (*RealtimeResponseCreateParamsMaxResponseOutputTokens, bool)`

GetMaxResponseOutputTokensOk returns a tuple with the MaxResponseOutputTokens field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxResponseOutputTokens

`func (o *RealtimeSessionCreateResponse) SetMaxResponseOutputTokens(v RealtimeResponseCreateParamsMaxResponseOutputTokens)`

SetMaxResponseOutputTokens sets MaxResponseOutputTokens field to given value.

### HasMaxResponseOutputTokens

`func (o *RealtimeSessionCreateResponse) HasMaxResponseOutputTokens() bool`

HasMaxResponseOutputTokens returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


