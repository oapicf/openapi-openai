# RealtimeResponseCreateParams

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Modalities** | Pointer to **[]string** | The set of modalities the model can respond with. To disable audio, set this to [\&quot;text\&quot;].  | [optional] 
**Instructions** | Pointer to **string** | The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \&quot;be extremely succinct\&quot;, \&quot;act friendly\&quot;, \&quot;here are examples of good  responses\&quot;) and on audio behavior (e.g. \&quot;talk quickly\&quot;, \&quot;inject emotion  into your voice\&quot;, \&quot;laugh frequently\&quot;). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the &#x60;session.created&#x60; event at the  start of the session.  | [optional] 
**Voice** | Pointer to **string** | The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are &#x60;alloy&#x60;, &#x60;ash&#x60;, &#x60;ballad&#x60;, &#x60;coral&#x60;, &#x60;echo&#x60; &#x60;sage&#x60;,  &#x60;shimmer&#x60; and &#x60;verse&#x60;.  | [optional] 
**OutputAudioFormat** | Pointer to **string** | The format of output audio. Options are &#x60;pcm16&#x60;, &#x60;g711_ulaw&#x60;, or &#x60;g711_alaw&#x60;.  | [optional] 
**Tools** | Pointer to [**[]RealtimeResponseCreateParamsToolsInner**](RealtimeResponseCreateParamsToolsInner.md) | Tools (functions) available to the model. | [optional] 
**ToolChoice** | Pointer to **string** | How the model chooses tools. Options are &#x60;auto&#x60;, &#x60;none&#x60;, &#x60;required&#x60;, or  specify a function, like &#x60;{\&quot;type\&quot;: \&quot;function\&quot;, \&quot;function\&quot;: {\&quot;name\&quot;: \&quot;my_function\&quot;}}&#x60;.  | [optional] 
**Temperature** | Pointer to **float32** | Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8.  | [optional] 
**MaxResponseOutputTokens** | Pointer to [**RealtimeResponseCreateParamsMaxResponseOutputTokens**](RealtimeResponseCreateParamsMaxResponseOutputTokens.md) |  | [optional] 
**Conversation** | Pointer to [**RealtimeResponseCreateParamsConversation**](RealtimeResponseCreateParamsConversation.md) |  | [optional] 
**Metadata** | Pointer to **map[string]interface{}** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [optional] 
**Input** | Pointer to [**[]RealtimeConversationItem**](RealtimeConversationItem.md) | Input items to include in the prompt for the model. Creates a new context for this response, without including the default conversation. Can include references to items from the default conversation.  | [optional] 

## Methods

### NewRealtimeResponseCreateParams

`func NewRealtimeResponseCreateParams() *RealtimeResponseCreateParams`

NewRealtimeResponseCreateParams instantiates a new RealtimeResponseCreateParams object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRealtimeResponseCreateParamsWithDefaults

`func NewRealtimeResponseCreateParamsWithDefaults() *RealtimeResponseCreateParams`

NewRealtimeResponseCreateParamsWithDefaults instantiates a new RealtimeResponseCreateParams object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetModalities

`func (o *RealtimeResponseCreateParams) GetModalities() []string`

GetModalities returns the Modalities field if non-nil, zero value otherwise.

### GetModalitiesOk

`func (o *RealtimeResponseCreateParams) GetModalitiesOk() (*[]string, bool)`

GetModalitiesOk returns a tuple with the Modalities field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModalities

`func (o *RealtimeResponseCreateParams) SetModalities(v []string)`

SetModalities sets Modalities field to given value.

### HasModalities

`func (o *RealtimeResponseCreateParams) HasModalities() bool`

HasModalities returns a boolean if a field has been set.

### GetInstructions

`func (o *RealtimeResponseCreateParams) GetInstructions() string`

GetInstructions returns the Instructions field if non-nil, zero value otherwise.

### GetInstructionsOk

`func (o *RealtimeResponseCreateParams) GetInstructionsOk() (*string, bool)`

GetInstructionsOk returns a tuple with the Instructions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstructions

`func (o *RealtimeResponseCreateParams) SetInstructions(v string)`

SetInstructions sets Instructions field to given value.

### HasInstructions

`func (o *RealtimeResponseCreateParams) HasInstructions() bool`

HasInstructions returns a boolean if a field has been set.

### GetVoice

`func (o *RealtimeResponseCreateParams) GetVoice() string`

GetVoice returns the Voice field if non-nil, zero value otherwise.

### GetVoiceOk

`func (o *RealtimeResponseCreateParams) GetVoiceOk() (*string, bool)`

GetVoiceOk returns a tuple with the Voice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVoice

`func (o *RealtimeResponseCreateParams) SetVoice(v string)`

SetVoice sets Voice field to given value.

### HasVoice

`func (o *RealtimeResponseCreateParams) HasVoice() bool`

HasVoice returns a boolean if a field has been set.

### GetOutputAudioFormat

`func (o *RealtimeResponseCreateParams) GetOutputAudioFormat() string`

GetOutputAudioFormat returns the OutputAudioFormat field if non-nil, zero value otherwise.

### GetOutputAudioFormatOk

`func (o *RealtimeResponseCreateParams) GetOutputAudioFormatOk() (*string, bool)`

GetOutputAudioFormatOk returns a tuple with the OutputAudioFormat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOutputAudioFormat

`func (o *RealtimeResponseCreateParams) SetOutputAudioFormat(v string)`

SetOutputAudioFormat sets OutputAudioFormat field to given value.

### HasOutputAudioFormat

`func (o *RealtimeResponseCreateParams) HasOutputAudioFormat() bool`

HasOutputAudioFormat returns a boolean if a field has been set.

### GetTools

`func (o *RealtimeResponseCreateParams) GetTools() []RealtimeResponseCreateParamsToolsInner`

GetTools returns the Tools field if non-nil, zero value otherwise.

### GetToolsOk

`func (o *RealtimeResponseCreateParams) GetToolsOk() (*[]RealtimeResponseCreateParamsToolsInner, bool)`

GetToolsOk returns a tuple with the Tools field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTools

`func (o *RealtimeResponseCreateParams) SetTools(v []RealtimeResponseCreateParamsToolsInner)`

SetTools sets Tools field to given value.

### HasTools

`func (o *RealtimeResponseCreateParams) HasTools() bool`

HasTools returns a boolean if a field has been set.

### GetToolChoice

`func (o *RealtimeResponseCreateParams) GetToolChoice() string`

GetToolChoice returns the ToolChoice field if non-nil, zero value otherwise.

### GetToolChoiceOk

`func (o *RealtimeResponseCreateParams) GetToolChoiceOk() (*string, bool)`

GetToolChoiceOk returns a tuple with the ToolChoice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToolChoice

`func (o *RealtimeResponseCreateParams) SetToolChoice(v string)`

SetToolChoice sets ToolChoice field to given value.

### HasToolChoice

`func (o *RealtimeResponseCreateParams) HasToolChoice() bool`

HasToolChoice returns a boolean if a field has been set.

### GetTemperature

`func (o *RealtimeResponseCreateParams) GetTemperature() float32`

GetTemperature returns the Temperature field if non-nil, zero value otherwise.

### GetTemperatureOk

`func (o *RealtimeResponseCreateParams) GetTemperatureOk() (*float32, bool)`

GetTemperatureOk returns a tuple with the Temperature field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTemperature

`func (o *RealtimeResponseCreateParams) SetTemperature(v float32)`

SetTemperature sets Temperature field to given value.

### HasTemperature

`func (o *RealtimeResponseCreateParams) HasTemperature() bool`

HasTemperature returns a boolean if a field has been set.

### GetMaxResponseOutputTokens

`func (o *RealtimeResponseCreateParams) GetMaxResponseOutputTokens() RealtimeResponseCreateParamsMaxResponseOutputTokens`

GetMaxResponseOutputTokens returns the MaxResponseOutputTokens field if non-nil, zero value otherwise.

### GetMaxResponseOutputTokensOk

`func (o *RealtimeResponseCreateParams) GetMaxResponseOutputTokensOk() (*RealtimeResponseCreateParamsMaxResponseOutputTokens, bool)`

GetMaxResponseOutputTokensOk returns a tuple with the MaxResponseOutputTokens field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxResponseOutputTokens

`func (o *RealtimeResponseCreateParams) SetMaxResponseOutputTokens(v RealtimeResponseCreateParamsMaxResponseOutputTokens)`

SetMaxResponseOutputTokens sets MaxResponseOutputTokens field to given value.

### HasMaxResponseOutputTokens

`func (o *RealtimeResponseCreateParams) HasMaxResponseOutputTokens() bool`

HasMaxResponseOutputTokens returns a boolean if a field has been set.

### GetConversation

`func (o *RealtimeResponseCreateParams) GetConversation() RealtimeResponseCreateParamsConversation`

GetConversation returns the Conversation field if non-nil, zero value otherwise.

### GetConversationOk

`func (o *RealtimeResponseCreateParams) GetConversationOk() (*RealtimeResponseCreateParamsConversation, bool)`

GetConversationOk returns a tuple with the Conversation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConversation

`func (o *RealtimeResponseCreateParams) SetConversation(v RealtimeResponseCreateParamsConversation)`

SetConversation sets Conversation field to given value.

### HasConversation

`func (o *RealtimeResponseCreateParams) HasConversation() bool`

HasConversation returns a boolean if a field has been set.

### GetMetadata

`func (o *RealtimeResponseCreateParams) GetMetadata() map[string]interface{}`

GetMetadata returns the Metadata field if non-nil, zero value otherwise.

### GetMetadataOk

`func (o *RealtimeResponseCreateParams) GetMetadataOk() (*map[string]interface{}, bool)`

GetMetadataOk returns a tuple with the Metadata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMetadata

`func (o *RealtimeResponseCreateParams) SetMetadata(v map[string]interface{})`

SetMetadata sets Metadata field to given value.

### HasMetadata

`func (o *RealtimeResponseCreateParams) HasMetadata() bool`

HasMetadata returns a boolean if a field has been set.

### SetMetadataNil

`func (o *RealtimeResponseCreateParams) SetMetadataNil(b bool)`

 SetMetadataNil sets the value for Metadata to be an explicit nil

### UnsetMetadata
`func (o *RealtimeResponseCreateParams) UnsetMetadata()`

UnsetMetadata ensures that no value is present for Metadata, not even an explicit nil
### GetInput

`func (o *RealtimeResponseCreateParams) GetInput() []RealtimeConversationItem`

GetInput returns the Input field if non-nil, zero value otherwise.

### GetInputOk

`func (o *RealtimeResponseCreateParams) GetInputOk() (*[]RealtimeConversationItem, bool)`

GetInputOk returns a tuple with the Input field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInput

`func (o *RealtimeResponseCreateParams) SetInput(v []RealtimeConversationItem)`

SetInput sets Input field to given value.

### HasInput

`func (o *RealtimeResponseCreateParams) HasInput() bool`

HasInput returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


