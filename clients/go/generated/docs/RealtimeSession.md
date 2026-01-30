# RealtimeSession

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **string** | Unique identifier for the session object.  | [optional] 
**Modalities** | Pointer to **[]string** | The set of modalities the model can respond with. To disable audio, set this to [\&quot;text\&quot;].  | [optional] 
**Model** | Pointer to [**RealtimeSessionModel**](RealtimeSessionModel.md) |  | [optional] 
**Instructions** | Pointer to **string** | The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \&quot;be extremely succinct\&quot;, \&quot;act friendly\&quot;, \&quot;here are examples of good  responses\&quot;) and on audio behavior (e.g. \&quot;talk quickly\&quot;, \&quot;inject emotion  into your voice\&quot;, \&quot;laugh frequently\&quot;). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the &#x60;session.created&#x60; event at the  start of the session.  | [optional] 
**Voice** | Pointer to **string** | The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are &#x60;alloy&#x60;, &#x60;ash&#x60;, &#x60;ballad&#x60;, &#x60;coral&#x60;, &#x60;echo&#x60; &#x60;sage&#x60;,  &#x60;shimmer&#x60; and &#x60;verse&#x60;.  | [optional] 
**InputAudioFormat** | Pointer to **string** | The format of input audio. Options are &#x60;pcm16&#x60;, &#x60;g711_ulaw&#x60;, or &#x60;g711_alaw&#x60;.  | [optional] 
**OutputAudioFormat** | Pointer to **string** | The format of output audio. Options are &#x60;pcm16&#x60;, &#x60;g711_ulaw&#x60;, or &#x60;g711_alaw&#x60;.  | [optional] 
**InputAudioTranscription** | Pointer to [**RealtimeSessionInputAudioTranscription**](RealtimeSessionInputAudioTranscription.md) |  | [optional] 
**TurnDetection** | Pointer to [**NullableRealtimeSessionTurnDetection**](RealtimeSessionTurnDetection.md) |  | [optional] 
**Tools** | Pointer to [**[]RealtimeResponseCreateParamsToolsInner**](RealtimeResponseCreateParamsToolsInner.md) | Tools (functions) available to the model. | [optional] 
**ToolChoice** | Pointer to **string** | How the model chooses tools. Options are &#x60;auto&#x60;, &#x60;none&#x60;, &#x60;required&#x60;, or  specify a function.  | [optional] 
**Temperature** | Pointer to **float32** | Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8.  | [optional] 
**MaxResponseOutputTokens** | Pointer to [**RealtimeResponseCreateParamsMaxResponseOutputTokens**](RealtimeResponseCreateParamsMaxResponseOutputTokens.md) |  | [optional] 

## Methods

### NewRealtimeSession

`func NewRealtimeSession() *RealtimeSession`

NewRealtimeSession instantiates a new RealtimeSession object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRealtimeSessionWithDefaults

`func NewRealtimeSessionWithDefaults() *RealtimeSession`

NewRealtimeSessionWithDefaults instantiates a new RealtimeSession object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *RealtimeSession) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *RealtimeSession) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *RealtimeSession) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *RealtimeSession) HasId() bool`

HasId returns a boolean if a field has been set.

### GetModalities

`func (o *RealtimeSession) GetModalities() []string`

GetModalities returns the Modalities field if non-nil, zero value otherwise.

### GetModalitiesOk

`func (o *RealtimeSession) GetModalitiesOk() (*[]string, bool)`

GetModalitiesOk returns a tuple with the Modalities field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModalities

`func (o *RealtimeSession) SetModalities(v []string)`

SetModalities sets Modalities field to given value.

### HasModalities

`func (o *RealtimeSession) HasModalities() bool`

HasModalities returns a boolean if a field has been set.

### GetModel

`func (o *RealtimeSession) GetModel() RealtimeSessionModel`

GetModel returns the Model field if non-nil, zero value otherwise.

### GetModelOk

`func (o *RealtimeSession) GetModelOk() (*RealtimeSessionModel, bool)`

GetModelOk returns a tuple with the Model field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModel

`func (o *RealtimeSession) SetModel(v RealtimeSessionModel)`

SetModel sets Model field to given value.

### HasModel

`func (o *RealtimeSession) HasModel() bool`

HasModel returns a boolean if a field has been set.

### GetInstructions

`func (o *RealtimeSession) GetInstructions() string`

GetInstructions returns the Instructions field if non-nil, zero value otherwise.

### GetInstructionsOk

`func (o *RealtimeSession) GetInstructionsOk() (*string, bool)`

GetInstructionsOk returns a tuple with the Instructions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstructions

`func (o *RealtimeSession) SetInstructions(v string)`

SetInstructions sets Instructions field to given value.

### HasInstructions

`func (o *RealtimeSession) HasInstructions() bool`

HasInstructions returns a boolean if a field has been set.

### GetVoice

`func (o *RealtimeSession) GetVoice() string`

GetVoice returns the Voice field if non-nil, zero value otherwise.

### GetVoiceOk

`func (o *RealtimeSession) GetVoiceOk() (*string, bool)`

GetVoiceOk returns a tuple with the Voice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVoice

`func (o *RealtimeSession) SetVoice(v string)`

SetVoice sets Voice field to given value.

### HasVoice

`func (o *RealtimeSession) HasVoice() bool`

HasVoice returns a boolean if a field has been set.

### GetInputAudioFormat

`func (o *RealtimeSession) GetInputAudioFormat() string`

GetInputAudioFormat returns the InputAudioFormat field if non-nil, zero value otherwise.

### GetInputAudioFormatOk

`func (o *RealtimeSession) GetInputAudioFormatOk() (*string, bool)`

GetInputAudioFormatOk returns a tuple with the InputAudioFormat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInputAudioFormat

`func (o *RealtimeSession) SetInputAudioFormat(v string)`

SetInputAudioFormat sets InputAudioFormat field to given value.

### HasInputAudioFormat

`func (o *RealtimeSession) HasInputAudioFormat() bool`

HasInputAudioFormat returns a boolean if a field has been set.

### GetOutputAudioFormat

`func (o *RealtimeSession) GetOutputAudioFormat() string`

GetOutputAudioFormat returns the OutputAudioFormat field if non-nil, zero value otherwise.

### GetOutputAudioFormatOk

`func (o *RealtimeSession) GetOutputAudioFormatOk() (*string, bool)`

GetOutputAudioFormatOk returns a tuple with the OutputAudioFormat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOutputAudioFormat

`func (o *RealtimeSession) SetOutputAudioFormat(v string)`

SetOutputAudioFormat sets OutputAudioFormat field to given value.

### HasOutputAudioFormat

`func (o *RealtimeSession) HasOutputAudioFormat() bool`

HasOutputAudioFormat returns a boolean if a field has been set.

### GetInputAudioTranscription

`func (o *RealtimeSession) GetInputAudioTranscription() RealtimeSessionInputAudioTranscription`

GetInputAudioTranscription returns the InputAudioTranscription field if non-nil, zero value otherwise.

### GetInputAudioTranscriptionOk

`func (o *RealtimeSession) GetInputAudioTranscriptionOk() (*RealtimeSessionInputAudioTranscription, bool)`

GetInputAudioTranscriptionOk returns a tuple with the InputAudioTranscription field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInputAudioTranscription

`func (o *RealtimeSession) SetInputAudioTranscription(v RealtimeSessionInputAudioTranscription)`

SetInputAudioTranscription sets InputAudioTranscription field to given value.

### HasInputAudioTranscription

`func (o *RealtimeSession) HasInputAudioTranscription() bool`

HasInputAudioTranscription returns a boolean if a field has been set.

### GetTurnDetection

`func (o *RealtimeSession) GetTurnDetection() RealtimeSessionTurnDetection`

GetTurnDetection returns the TurnDetection field if non-nil, zero value otherwise.

### GetTurnDetectionOk

`func (o *RealtimeSession) GetTurnDetectionOk() (*RealtimeSessionTurnDetection, bool)`

GetTurnDetectionOk returns a tuple with the TurnDetection field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTurnDetection

`func (o *RealtimeSession) SetTurnDetection(v RealtimeSessionTurnDetection)`

SetTurnDetection sets TurnDetection field to given value.

### HasTurnDetection

`func (o *RealtimeSession) HasTurnDetection() bool`

HasTurnDetection returns a boolean if a field has been set.

### SetTurnDetectionNil

`func (o *RealtimeSession) SetTurnDetectionNil(b bool)`

 SetTurnDetectionNil sets the value for TurnDetection to be an explicit nil

### UnsetTurnDetection
`func (o *RealtimeSession) UnsetTurnDetection()`

UnsetTurnDetection ensures that no value is present for TurnDetection, not even an explicit nil
### GetTools

`func (o *RealtimeSession) GetTools() []RealtimeResponseCreateParamsToolsInner`

GetTools returns the Tools field if non-nil, zero value otherwise.

### GetToolsOk

`func (o *RealtimeSession) GetToolsOk() (*[]RealtimeResponseCreateParamsToolsInner, bool)`

GetToolsOk returns a tuple with the Tools field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTools

`func (o *RealtimeSession) SetTools(v []RealtimeResponseCreateParamsToolsInner)`

SetTools sets Tools field to given value.

### HasTools

`func (o *RealtimeSession) HasTools() bool`

HasTools returns a boolean if a field has been set.

### GetToolChoice

`func (o *RealtimeSession) GetToolChoice() string`

GetToolChoice returns the ToolChoice field if non-nil, zero value otherwise.

### GetToolChoiceOk

`func (o *RealtimeSession) GetToolChoiceOk() (*string, bool)`

GetToolChoiceOk returns a tuple with the ToolChoice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToolChoice

`func (o *RealtimeSession) SetToolChoice(v string)`

SetToolChoice sets ToolChoice field to given value.

### HasToolChoice

`func (o *RealtimeSession) HasToolChoice() bool`

HasToolChoice returns a boolean if a field has been set.

### GetTemperature

`func (o *RealtimeSession) GetTemperature() float32`

GetTemperature returns the Temperature field if non-nil, zero value otherwise.

### GetTemperatureOk

`func (o *RealtimeSession) GetTemperatureOk() (*float32, bool)`

GetTemperatureOk returns a tuple with the Temperature field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTemperature

`func (o *RealtimeSession) SetTemperature(v float32)`

SetTemperature sets Temperature field to given value.

### HasTemperature

`func (o *RealtimeSession) HasTemperature() bool`

HasTemperature returns a boolean if a field has been set.

### GetMaxResponseOutputTokens

`func (o *RealtimeSession) GetMaxResponseOutputTokens() RealtimeResponseCreateParamsMaxResponseOutputTokens`

GetMaxResponseOutputTokens returns the MaxResponseOutputTokens field if non-nil, zero value otherwise.

### GetMaxResponseOutputTokensOk

`func (o *RealtimeSession) GetMaxResponseOutputTokensOk() (*RealtimeResponseCreateParamsMaxResponseOutputTokens, bool)`

GetMaxResponseOutputTokensOk returns a tuple with the MaxResponseOutputTokens field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxResponseOutputTokens

`func (o *RealtimeSession) SetMaxResponseOutputTokens(v RealtimeResponseCreateParamsMaxResponseOutputTokens)`

SetMaxResponseOutputTokens sets MaxResponseOutputTokens field to given value.

### HasMaxResponseOutputTokens

`func (o *RealtimeSession) HasMaxResponseOutputTokens() bool`

HasMaxResponseOutputTokens returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


