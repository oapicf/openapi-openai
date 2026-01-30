# RealtimeSessionCreateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Modalities** | Pointer to **[]string** | The set of modalities the model can respond with. To disable audio, set this to [\&quot;text\&quot;].  | [optional] 
**Model** | **string** | The Realtime model used for this session.  | 
**Instructions** | Pointer to **string** | The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \&quot;be extremely succinct\&quot;, \&quot;act friendly\&quot;, \&quot;here are examples of good  responses\&quot;) and on audio behavior (e.g. \&quot;talk quickly\&quot;, \&quot;inject emotion  into your voice\&quot;, \&quot;laugh frequently\&quot;). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the &#x60;session.created&#x60; event at the  start of the session.  | [optional] 
**Voice** | Pointer to **string** | The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are &#x60;alloy&#x60;, &#x60;ash&#x60;, &#x60;ballad&#x60;, &#x60;coral&#x60;, &#x60;echo&#x60; &#x60;sage&#x60;,  &#x60;shimmer&#x60; and &#x60;verse&#x60;.  | [optional] 
**InputAudioFormat** | Pointer to **string** | The format of input audio. Options are &#x60;pcm16&#x60;, &#x60;g711_ulaw&#x60;, or &#x60;g711_alaw&#x60;.  | [optional] 
**OutputAudioFormat** | Pointer to **string** | The format of output audio. Options are &#x60;pcm16&#x60;, &#x60;g711_ulaw&#x60;, or &#x60;g711_alaw&#x60;.  | [optional] 
**InputAudioTranscription** | Pointer to [**RealtimeSessionInputAudioTranscription**](RealtimeSessionInputAudioTranscription.md) |  | [optional] 
**TurnDetection** | Pointer to [**RealtimeSessionCreateRequestTurnDetection**](RealtimeSessionCreateRequestTurnDetection.md) |  | [optional] 
**Tools** | Pointer to [**[]RealtimeResponseCreateParamsToolsInner**](RealtimeResponseCreateParamsToolsInner.md) | Tools (functions) available to the model. | [optional] 
**ToolChoice** | Pointer to **string** | How the model chooses tools. Options are &#x60;auto&#x60;, &#x60;none&#x60;, &#x60;required&#x60;, or  specify a function.  | [optional] 
**Temperature** | Pointer to **float32** | Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8.  | [optional] 
**MaxResponseOutputTokens** | Pointer to [**RealtimeResponseCreateParamsMaxResponseOutputTokens**](RealtimeResponseCreateParamsMaxResponseOutputTokens.md) |  | [optional] 

## Methods

### NewRealtimeSessionCreateRequest

`func NewRealtimeSessionCreateRequest(model string, ) *RealtimeSessionCreateRequest`

NewRealtimeSessionCreateRequest instantiates a new RealtimeSessionCreateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRealtimeSessionCreateRequestWithDefaults

`func NewRealtimeSessionCreateRequestWithDefaults() *RealtimeSessionCreateRequest`

NewRealtimeSessionCreateRequestWithDefaults instantiates a new RealtimeSessionCreateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetModalities

`func (o *RealtimeSessionCreateRequest) GetModalities() []string`

GetModalities returns the Modalities field if non-nil, zero value otherwise.

### GetModalitiesOk

`func (o *RealtimeSessionCreateRequest) GetModalitiesOk() (*[]string, bool)`

GetModalitiesOk returns a tuple with the Modalities field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModalities

`func (o *RealtimeSessionCreateRequest) SetModalities(v []string)`

SetModalities sets Modalities field to given value.

### HasModalities

`func (o *RealtimeSessionCreateRequest) HasModalities() bool`

HasModalities returns a boolean if a field has been set.

### GetModel

`func (o *RealtimeSessionCreateRequest) GetModel() string`

GetModel returns the Model field if non-nil, zero value otherwise.

### GetModelOk

`func (o *RealtimeSessionCreateRequest) GetModelOk() (*string, bool)`

GetModelOk returns a tuple with the Model field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModel

`func (o *RealtimeSessionCreateRequest) SetModel(v string)`

SetModel sets Model field to given value.


### GetInstructions

`func (o *RealtimeSessionCreateRequest) GetInstructions() string`

GetInstructions returns the Instructions field if non-nil, zero value otherwise.

### GetInstructionsOk

`func (o *RealtimeSessionCreateRequest) GetInstructionsOk() (*string, bool)`

GetInstructionsOk returns a tuple with the Instructions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstructions

`func (o *RealtimeSessionCreateRequest) SetInstructions(v string)`

SetInstructions sets Instructions field to given value.

### HasInstructions

`func (o *RealtimeSessionCreateRequest) HasInstructions() bool`

HasInstructions returns a boolean if a field has been set.

### GetVoice

`func (o *RealtimeSessionCreateRequest) GetVoice() string`

GetVoice returns the Voice field if non-nil, zero value otherwise.

### GetVoiceOk

`func (o *RealtimeSessionCreateRequest) GetVoiceOk() (*string, bool)`

GetVoiceOk returns a tuple with the Voice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVoice

`func (o *RealtimeSessionCreateRequest) SetVoice(v string)`

SetVoice sets Voice field to given value.

### HasVoice

`func (o *RealtimeSessionCreateRequest) HasVoice() bool`

HasVoice returns a boolean if a field has been set.

### GetInputAudioFormat

`func (o *RealtimeSessionCreateRequest) GetInputAudioFormat() string`

GetInputAudioFormat returns the InputAudioFormat field if non-nil, zero value otherwise.

### GetInputAudioFormatOk

`func (o *RealtimeSessionCreateRequest) GetInputAudioFormatOk() (*string, bool)`

GetInputAudioFormatOk returns a tuple with the InputAudioFormat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInputAudioFormat

`func (o *RealtimeSessionCreateRequest) SetInputAudioFormat(v string)`

SetInputAudioFormat sets InputAudioFormat field to given value.

### HasInputAudioFormat

`func (o *RealtimeSessionCreateRequest) HasInputAudioFormat() bool`

HasInputAudioFormat returns a boolean if a field has been set.

### GetOutputAudioFormat

`func (o *RealtimeSessionCreateRequest) GetOutputAudioFormat() string`

GetOutputAudioFormat returns the OutputAudioFormat field if non-nil, zero value otherwise.

### GetOutputAudioFormatOk

`func (o *RealtimeSessionCreateRequest) GetOutputAudioFormatOk() (*string, bool)`

GetOutputAudioFormatOk returns a tuple with the OutputAudioFormat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOutputAudioFormat

`func (o *RealtimeSessionCreateRequest) SetOutputAudioFormat(v string)`

SetOutputAudioFormat sets OutputAudioFormat field to given value.

### HasOutputAudioFormat

`func (o *RealtimeSessionCreateRequest) HasOutputAudioFormat() bool`

HasOutputAudioFormat returns a boolean if a field has been set.

### GetInputAudioTranscription

`func (o *RealtimeSessionCreateRequest) GetInputAudioTranscription() RealtimeSessionInputAudioTranscription`

GetInputAudioTranscription returns the InputAudioTranscription field if non-nil, zero value otherwise.

### GetInputAudioTranscriptionOk

`func (o *RealtimeSessionCreateRequest) GetInputAudioTranscriptionOk() (*RealtimeSessionInputAudioTranscription, bool)`

GetInputAudioTranscriptionOk returns a tuple with the InputAudioTranscription field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInputAudioTranscription

`func (o *RealtimeSessionCreateRequest) SetInputAudioTranscription(v RealtimeSessionInputAudioTranscription)`

SetInputAudioTranscription sets InputAudioTranscription field to given value.

### HasInputAudioTranscription

`func (o *RealtimeSessionCreateRequest) HasInputAudioTranscription() bool`

HasInputAudioTranscription returns a boolean if a field has been set.

### GetTurnDetection

`func (o *RealtimeSessionCreateRequest) GetTurnDetection() RealtimeSessionCreateRequestTurnDetection`

GetTurnDetection returns the TurnDetection field if non-nil, zero value otherwise.

### GetTurnDetectionOk

`func (o *RealtimeSessionCreateRequest) GetTurnDetectionOk() (*RealtimeSessionCreateRequestTurnDetection, bool)`

GetTurnDetectionOk returns a tuple with the TurnDetection field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTurnDetection

`func (o *RealtimeSessionCreateRequest) SetTurnDetection(v RealtimeSessionCreateRequestTurnDetection)`

SetTurnDetection sets TurnDetection field to given value.

### HasTurnDetection

`func (o *RealtimeSessionCreateRequest) HasTurnDetection() bool`

HasTurnDetection returns a boolean if a field has been set.

### GetTools

`func (o *RealtimeSessionCreateRequest) GetTools() []RealtimeResponseCreateParamsToolsInner`

GetTools returns the Tools field if non-nil, zero value otherwise.

### GetToolsOk

`func (o *RealtimeSessionCreateRequest) GetToolsOk() (*[]RealtimeResponseCreateParamsToolsInner, bool)`

GetToolsOk returns a tuple with the Tools field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTools

`func (o *RealtimeSessionCreateRequest) SetTools(v []RealtimeResponseCreateParamsToolsInner)`

SetTools sets Tools field to given value.

### HasTools

`func (o *RealtimeSessionCreateRequest) HasTools() bool`

HasTools returns a boolean if a field has been set.

### GetToolChoice

`func (o *RealtimeSessionCreateRequest) GetToolChoice() string`

GetToolChoice returns the ToolChoice field if non-nil, zero value otherwise.

### GetToolChoiceOk

`func (o *RealtimeSessionCreateRequest) GetToolChoiceOk() (*string, bool)`

GetToolChoiceOk returns a tuple with the ToolChoice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToolChoice

`func (o *RealtimeSessionCreateRequest) SetToolChoice(v string)`

SetToolChoice sets ToolChoice field to given value.

### HasToolChoice

`func (o *RealtimeSessionCreateRequest) HasToolChoice() bool`

HasToolChoice returns a boolean if a field has been set.

### GetTemperature

`func (o *RealtimeSessionCreateRequest) GetTemperature() float32`

GetTemperature returns the Temperature field if non-nil, zero value otherwise.

### GetTemperatureOk

`func (o *RealtimeSessionCreateRequest) GetTemperatureOk() (*float32, bool)`

GetTemperatureOk returns a tuple with the Temperature field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTemperature

`func (o *RealtimeSessionCreateRequest) SetTemperature(v float32)`

SetTemperature sets Temperature field to given value.

### HasTemperature

`func (o *RealtimeSessionCreateRequest) HasTemperature() bool`

HasTemperature returns a boolean if a field has been set.

### GetMaxResponseOutputTokens

`func (o *RealtimeSessionCreateRequest) GetMaxResponseOutputTokens() RealtimeResponseCreateParamsMaxResponseOutputTokens`

GetMaxResponseOutputTokens returns the MaxResponseOutputTokens field if non-nil, zero value otherwise.

### GetMaxResponseOutputTokensOk

`func (o *RealtimeSessionCreateRequest) GetMaxResponseOutputTokensOk() (*RealtimeResponseCreateParamsMaxResponseOutputTokens, bool)`

GetMaxResponseOutputTokensOk returns a tuple with the MaxResponseOutputTokens field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxResponseOutputTokens

`func (o *RealtimeSessionCreateRequest) SetMaxResponseOutputTokens(v RealtimeResponseCreateParamsMaxResponseOutputTokens)`

SetMaxResponseOutputTokens sets MaxResponseOutputTokens field to given value.

### HasMaxResponseOutputTokens

`func (o *RealtimeSessionCreateRequest) HasMaxResponseOutputTokens() bool`

HasMaxResponseOutputTokens returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


