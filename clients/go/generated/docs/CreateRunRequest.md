# CreateRunRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssistantId** | **string** | The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run. | 
**Model** | Pointer to [**NullableCreateRunRequestModel**](CreateRunRequestModel.md) |  | [optional] 
**Instructions** | Pointer to **NullableString** | Overrides the [instructions](/docs/api-reference/assistants/createAssistant) of the assistant. This is useful for modifying the behavior on a per-run basis. | [optional] 
**AdditionalInstructions** | Pointer to **NullableString** | Appends additional instructions at the end of the instructions for the run. This is useful for modifying the behavior on a per-run basis without overriding other instructions. | [optional] 
**AdditionalMessages** | Pointer to [**[]CreateMessageRequest**](CreateMessageRequest.md) | Adds additional messages to the thread before creating the run. | [optional] 
**Tools** | Pointer to [**[]AssistantObjectToolsInner**](AssistantObjectToolsInner.md) | Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis. | [optional] 
**Metadata** | Pointer to **map[string]interface{}** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [optional] 
**Temperature** | Pointer to **NullableFloat32** | What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  | [optional] [default to 1]
**TopP** | Pointer to **NullableFloat32** | An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both.  | [optional] [default to 1]
**Stream** | Pointer to **NullableBool** | If &#x60;true&#x60;, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a &#x60;data: [DONE]&#x60; message.  | [optional] 
**MaxPromptTokens** | Pointer to **NullableInt32** | The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status &#x60;incomplete&#x60;. See &#x60;incomplete_details&#x60; for more info.  | [optional] 
**MaxCompletionTokens** | Pointer to **NullableInt32** | The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status &#x60;incomplete&#x60;. See &#x60;incomplete_details&#x60; for more info.  | [optional] 
**TruncationStrategy** | Pointer to [**TruncationObject**](TruncationObject.md) |  | [optional] 
**ToolChoice** | Pointer to [**AssistantsApiToolChoiceOption**](AssistantsApiToolChoiceOption.md) |  | [optional] 
**ParallelToolCalls** | Pointer to **bool** | Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use. | [optional] [default to true]
**ResponseFormat** | Pointer to [**AssistantsApiResponseFormatOption**](AssistantsApiResponseFormatOption.md) |  | [optional] 

## Methods

### NewCreateRunRequest

`func NewCreateRunRequest(assistantId string, ) *CreateRunRequest`

NewCreateRunRequest instantiates a new CreateRunRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateRunRequestWithDefaults

`func NewCreateRunRequestWithDefaults() *CreateRunRequest`

NewCreateRunRequestWithDefaults instantiates a new CreateRunRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAssistantId

`func (o *CreateRunRequest) GetAssistantId() string`

GetAssistantId returns the AssistantId field if non-nil, zero value otherwise.

### GetAssistantIdOk

`func (o *CreateRunRequest) GetAssistantIdOk() (*string, bool)`

GetAssistantIdOk returns a tuple with the AssistantId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssistantId

`func (o *CreateRunRequest) SetAssistantId(v string)`

SetAssistantId sets AssistantId field to given value.


### GetModel

`func (o *CreateRunRequest) GetModel() CreateRunRequestModel`

GetModel returns the Model field if non-nil, zero value otherwise.

### GetModelOk

`func (o *CreateRunRequest) GetModelOk() (*CreateRunRequestModel, bool)`

GetModelOk returns a tuple with the Model field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModel

`func (o *CreateRunRequest) SetModel(v CreateRunRequestModel)`

SetModel sets Model field to given value.

### HasModel

`func (o *CreateRunRequest) HasModel() bool`

HasModel returns a boolean if a field has been set.

### SetModelNil

`func (o *CreateRunRequest) SetModelNil(b bool)`

 SetModelNil sets the value for Model to be an explicit nil

### UnsetModel
`func (o *CreateRunRequest) UnsetModel()`

UnsetModel ensures that no value is present for Model, not even an explicit nil
### GetInstructions

`func (o *CreateRunRequest) GetInstructions() string`

GetInstructions returns the Instructions field if non-nil, zero value otherwise.

### GetInstructionsOk

`func (o *CreateRunRequest) GetInstructionsOk() (*string, bool)`

GetInstructionsOk returns a tuple with the Instructions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstructions

`func (o *CreateRunRequest) SetInstructions(v string)`

SetInstructions sets Instructions field to given value.

### HasInstructions

`func (o *CreateRunRequest) HasInstructions() bool`

HasInstructions returns a boolean if a field has been set.

### SetInstructionsNil

`func (o *CreateRunRequest) SetInstructionsNil(b bool)`

 SetInstructionsNil sets the value for Instructions to be an explicit nil

### UnsetInstructions
`func (o *CreateRunRequest) UnsetInstructions()`

UnsetInstructions ensures that no value is present for Instructions, not even an explicit nil
### GetAdditionalInstructions

`func (o *CreateRunRequest) GetAdditionalInstructions() string`

GetAdditionalInstructions returns the AdditionalInstructions field if non-nil, zero value otherwise.

### GetAdditionalInstructionsOk

`func (o *CreateRunRequest) GetAdditionalInstructionsOk() (*string, bool)`

GetAdditionalInstructionsOk returns a tuple with the AdditionalInstructions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdditionalInstructions

`func (o *CreateRunRequest) SetAdditionalInstructions(v string)`

SetAdditionalInstructions sets AdditionalInstructions field to given value.

### HasAdditionalInstructions

`func (o *CreateRunRequest) HasAdditionalInstructions() bool`

HasAdditionalInstructions returns a boolean if a field has been set.

### SetAdditionalInstructionsNil

`func (o *CreateRunRequest) SetAdditionalInstructionsNil(b bool)`

 SetAdditionalInstructionsNil sets the value for AdditionalInstructions to be an explicit nil

### UnsetAdditionalInstructions
`func (o *CreateRunRequest) UnsetAdditionalInstructions()`

UnsetAdditionalInstructions ensures that no value is present for AdditionalInstructions, not even an explicit nil
### GetAdditionalMessages

`func (o *CreateRunRequest) GetAdditionalMessages() []CreateMessageRequest`

GetAdditionalMessages returns the AdditionalMessages field if non-nil, zero value otherwise.

### GetAdditionalMessagesOk

`func (o *CreateRunRequest) GetAdditionalMessagesOk() (*[]CreateMessageRequest, bool)`

GetAdditionalMessagesOk returns a tuple with the AdditionalMessages field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdditionalMessages

`func (o *CreateRunRequest) SetAdditionalMessages(v []CreateMessageRequest)`

SetAdditionalMessages sets AdditionalMessages field to given value.

### HasAdditionalMessages

`func (o *CreateRunRequest) HasAdditionalMessages() bool`

HasAdditionalMessages returns a boolean if a field has been set.

### SetAdditionalMessagesNil

`func (o *CreateRunRequest) SetAdditionalMessagesNil(b bool)`

 SetAdditionalMessagesNil sets the value for AdditionalMessages to be an explicit nil

### UnsetAdditionalMessages
`func (o *CreateRunRequest) UnsetAdditionalMessages()`

UnsetAdditionalMessages ensures that no value is present for AdditionalMessages, not even an explicit nil
### GetTools

`func (o *CreateRunRequest) GetTools() []AssistantObjectToolsInner`

GetTools returns the Tools field if non-nil, zero value otherwise.

### GetToolsOk

`func (o *CreateRunRequest) GetToolsOk() (*[]AssistantObjectToolsInner, bool)`

GetToolsOk returns a tuple with the Tools field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTools

`func (o *CreateRunRequest) SetTools(v []AssistantObjectToolsInner)`

SetTools sets Tools field to given value.

### HasTools

`func (o *CreateRunRequest) HasTools() bool`

HasTools returns a boolean if a field has been set.

### SetToolsNil

`func (o *CreateRunRequest) SetToolsNil(b bool)`

 SetToolsNil sets the value for Tools to be an explicit nil

### UnsetTools
`func (o *CreateRunRequest) UnsetTools()`

UnsetTools ensures that no value is present for Tools, not even an explicit nil
### GetMetadata

`func (o *CreateRunRequest) GetMetadata() map[string]interface{}`

GetMetadata returns the Metadata field if non-nil, zero value otherwise.

### GetMetadataOk

`func (o *CreateRunRequest) GetMetadataOk() (*map[string]interface{}, bool)`

GetMetadataOk returns a tuple with the Metadata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMetadata

`func (o *CreateRunRequest) SetMetadata(v map[string]interface{})`

SetMetadata sets Metadata field to given value.

### HasMetadata

`func (o *CreateRunRequest) HasMetadata() bool`

HasMetadata returns a boolean if a field has been set.

### SetMetadataNil

`func (o *CreateRunRequest) SetMetadataNil(b bool)`

 SetMetadataNil sets the value for Metadata to be an explicit nil

### UnsetMetadata
`func (o *CreateRunRequest) UnsetMetadata()`

UnsetMetadata ensures that no value is present for Metadata, not even an explicit nil
### GetTemperature

`func (o *CreateRunRequest) GetTemperature() float32`

GetTemperature returns the Temperature field if non-nil, zero value otherwise.

### GetTemperatureOk

`func (o *CreateRunRequest) GetTemperatureOk() (*float32, bool)`

GetTemperatureOk returns a tuple with the Temperature field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTemperature

`func (o *CreateRunRequest) SetTemperature(v float32)`

SetTemperature sets Temperature field to given value.

### HasTemperature

`func (o *CreateRunRequest) HasTemperature() bool`

HasTemperature returns a boolean if a field has been set.

### SetTemperatureNil

`func (o *CreateRunRequest) SetTemperatureNil(b bool)`

 SetTemperatureNil sets the value for Temperature to be an explicit nil

### UnsetTemperature
`func (o *CreateRunRequest) UnsetTemperature()`

UnsetTemperature ensures that no value is present for Temperature, not even an explicit nil
### GetTopP

`func (o *CreateRunRequest) GetTopP() float32`

GetTopP returns the TopP field if non-nil, zero value otherwise.

### GetTopPOk

`func (o *CreateRunRequest) GetTopPOk() (*float32, bool)`

GetTopPOk returns a tuple with the TopP field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTopP

`func (o *CreateRunRequest) SetTopP(v float32)`

SetTopP sets TopP field to given value.

### HasTopP

`func (o *CreateRunRequest) HasTopP() bool`

HasTopP returns a boolean if a field has been set.

### SetTopPNil

`func (o *CreateRunRequest) SetTopPNil(b bool)`

 SetTopPNil sets the value for TopP to be an explicit nil

### UnsetTopP
`func (o *CreateRunRequest) UnsetTopP()`

UnsetTopP ensures that no value is present for TopP, not even an explicit nil
### GetStream

`func (o *CreateRunRequest) GetStream() bool`

GetStream returns the Stream field if non-nil, zero value otherwise.

### GetStreamOk

`func (o *CreateRunRequest) GetStreamOk() (*bool, bool)`

GetStreamOk returns a tuple with the Stream field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStream

`func (o *CreateRunRequest) SetStream(v bool)`

SetStream sets Stream field to given value.

### HasStream

`func (o *CreateRunRequest) HasStream() bool`

HasStream returns a boolean if a field has been set.

### SetStreamNil

`func (o *CreateRunRequest) SetStreamNil(b bool)`

 SetStreamNil sets the value for Stream to be an explicit nil

### UnsetStream
`func (o *CreateRunRequest) UnsetStream()`

UnsetStream ensures that no value is present for Stream, not even an explicit nil
### GetMaxPromptTokens

`func (o *CreateRunRequest) GetMaxPromptTokens() int32`

GetMaxPromptTokens returns the MaxPromptTokens field if non-nil, zero value otherwise.

### GetMaxPromptTokensOk

`func (o *CreateRunRequest) GetMaxPromptTokensOk() (*int32, bool)`

GetMaxPromptTokensOk returns a tuple with the MaxPromptTokens field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxPromptTokens

`func (o *CreateRunRequest) SetMaxPromptTokens(v int32)`

SetMaxPromptTokens sets MaxPromptTokens field to given value.

### HasMaxPromptTokens

`func (o *CreateRunRequest) HasMaxPromptTokens() bool`

HasMaxPromptTokens returns a boolean if a field has been set.

### SetMaxPromptTokensNil

`func (o *CreateRunRequest) SetMaxPromptTokensNil(b bool)`

 SetMaxPromptTokensNil sets the value for MaxPromptTokens to be an explicit nil

### UnsetMaxPromptTokens
`func (o *CreateRunRequest) UnsetMaxPromptTokens()`

UnsetMaxPromptTokens ensures that no value is present for MaxPromptTokens, not even an explicit nil
### GetMaxCompletionTokens

`func (o *CreateRunRequest) GetMaxCompletionTokens() int32`

GetMaxCompletionTokens returns the MaxCompletionTokens field if non-nil, zero value otherwise.

### GetMaxCompletionTokensOk

`func (o *CreateRunRequest) GetMaxCompletionTokensOk() (*int32, bool)`

GetMaxCompletionTokensOk returns a tuple with the MaxCompletionTokens field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxCompletionTokens

`func (o *CreateRunRequest) SetMaxCompletionTokens(v int32)`

SetMaxCompletionTokens sets MaxCompletionTokens field to given value.

### HasMaxCompletionTokens

`func (o *CreateRunRequest) HasMaxCompletionTokens() bool`

HasMaxCompletionTokens returns a boolean if a field has been set.

### SetMaxCompletionTokensNil

`func (o *CreateRunRequest) SetMaxCompletionTokensNil(b bool)`

 SetMaxCompletionTokensNil sets the value for MaxCompletionTokens to be an explicit nil

### UnsetMaxCompletionTokens
`func (o *CreateRunRequest) UnsetMaxCompletionTokens()`

UnsetMaxCompletionTokens ensures that no value is present for MaxCompletionTokens, not even an explicit nil
### GetTruncationStrategy

`func (o *CreateRunRequest) GetTruncationStrategy() TruncationObject`

GetTruncationStrategy returns the TruncationStrategy field if non-nil, zero value otherwise.

### GetTruncationStrategyOk

`func (o *CreateRunRequest) GetTruncationStrategyOk() (*TruncationObject, bool)`

GetTruncationStrategyOk returns a tuple with the TruncationStrategy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTruncationStrategy

`func (o *CreateRunRequest) SetTruncationStrategy(v TruncationObject)`

SetTruncationStrategy sets TruncationStrategy field to given value.

### HasTruncationStrategy

`func (o *CreateRunRequest) HasTruncationStrategy() bool`

HasTruncationStrategy returns a boolean if a field has been set.

### GetToolChoice

`func (o *CreateRunRequest) GetToolChoice() AssistantsApiToolChoiceOption`

GetToolChoice returns the ToolChoice field if non-nil, zero value otherwise.

### GetToolChoiceOk

`func (o *CreateRunRequest) GetToolChoiceOk() (*AssistantsApiToolChoiceOption, bool)`

GetToolChoiceOk returns a tuple with the ToolChoice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToolChoice

`func (o *CreateRunRequest) SetToolChoice(v AssistantsApiToolChoiceOption)`

SetToolChoice sets ToolChoice field to given value.

### HasToolChoice

`func (o *CreateRunRequest) HasToolChoice() bool`

HasToolChoice returns a boolean if a field has been set.

### GetParallelToolCalls

`func (o *CreateRunRequest) GetParallelToolCalls() bool`

GetParallelToolCalls returns the ParallelToolCalls field if non-nil, zero value otherwise.

### GetParallelToolCallsOk

`func (o *CreateRunRequest) GetParallelToolCallsOk() (*bool, bool)`

GetParallelToolCallsOk returns a tuple with the ParallelToolCalls field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParallelToolCalls

`func (o *CreateRunRequest) SetParallelToolCalls(v bool)`

SetParallelToolCalls sets ParallelToolCalls field to given value.

### HasParallelToolCalls

`func (o *CreateRunRequest) HasParallelToolCalls() bool`

HasParallelToolCalls returns a boolean if a field has been set.

### GetResponseFormat

`func (o *CreateRunRequest) GetResponseFormat() AssistantsApiResponseFormatOption`

GetResponseFormat returns the ResponseFormat field if non-nil, zero value otherwise.

### GetResponseFormatOk

`func (o *CreateRunRequest) GetResponseFormatOk() (*AssistantsApiResponseFormatOption, bool)`

GetResponseFormatOk returns a tuple with the ResponseFormat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponseFormat

`func (o *CreateRunRequest) SetResponseFormat(v AssistantsApiResponseFormatOption)`

SetResponseFormat sets ResponseFormat field to given value.

### HasResponseFormat

`func (o *CreateRunRequest) HasResponseFormat() bool`

HasResponseFormat returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


