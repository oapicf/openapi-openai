# CreateThreadAndRunRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssistantId** | **string** | The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run. | 
**Thread** | Pointer to [**CreateThreadRequest**](CreateThreadRequest.md) |  | [optional] 
**Model** | Pointer to [**NullableCreateRunRequestModel**](CreateRunRequestModel.md) |  | [optional] 
**Instructions** | Pointer to **NullableString** | Override the default system message of the assistant. This is useful for modifying the behavior on a per-run basis. | [optional] 
**Tools** | Pointer to [**[]CreateThreadAndRunRequestToolsInner**](CreateThreadAndRunRequestToolsInner.md) | Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis. | [optional] 
**ToolResources** | Pointer to [**NullableCreateThreadAndRunRequestToolResources**](CreateThreadAndRunRequestToolResources.md) |  | [optional] 
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

### NewCreateThreadAndRunRequest

`func NewCreateThreadAndRunRequest(assistantId string, ) *CreateThreadAndRunRequest`

NewCreateThreadAndRunRequest instantiates a new CreateThreadAndRunRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateThreadAndRunRequestWithDefaults

`func NewCreateThreadAndRunRequestWithDefaults() *CreateThreadAndRunRequest`

NewCreateThreadAndRunRequestWithDefaults instantiates a new CreateThreadAndRunRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAssistantId

`func (o *CreateThreadAndRunRequest) GetAssistantId() string`

GetAssistantId returns the AssistantId field if non-nil, zero value otherwise.

### GetAssistantIdOk

`func (o *CreateThreadAndRunRequest) GetAssistantIdOk() (*string, bool)`

GetAssistantIdOk returns a tuple with the AssistantId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssistantId

`func (o *CreateThreadAndRunRequest) SetAssistantId(v string)`

SetAssistantId sets AssistantId field to given value.


### GetThread

`func (o *CreateThreadAndRunRequest) GetThread() CreateThreadRequest`

GetThread returns the Thread field if non-nil, zero value otherwise.

### GetThreadOk

`func (o *CreateThreadAndRunRequest) GetThreadOk() (*CreateThreadRequest, bool)`

GetThreadOk returns a tuple with the Thread field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetThread

`func (o *CreateThreadAndRunRequest) SetThread(v CreateThreadRequest)`

SetThread sets Thread field to given value.

### HasThread

`func (o *CreateThreadAndRunRequest) HasThread() bool`

HasThread returns a boolean if a field has been set.

### GetModel

`func (o *CreateThreadAndRunRequest) GetModel() CreateRunRequestModel`

GetModel returns the Model field if non-nil, zero value otherwise.

### GetModelOk

`func (o *CreateThreadAndRunRequest) GetModelOk() (*CreateRunRequestModel, bool)`

GetModelOk returns a tuple with the Model field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModel

`func (o *CreateThreadAndRunRequest) SetModel(v CreateRunRequestModel)`

SetModel sets Model field to given value.

### HasModel

`func (o *CreateThreadAndRunRequest) HasModel() bool`

HasModel returns a boolean if a field has been set.

### SetModelNil

`func (o *CreateThreadAndRunRequest) SetModelNil(b bool)`

 SetModelNil sets the value for Model to be an explicit nil

### UnsetModel
`func (o *CreateThreadAndRunRequest) UnsetModel()`

UnsetModel ensures that no value is present for Model, not even an explicit nil
### GetInstructions

`func (o *CreateThreadAndRunRequest) GetInstructions() string`

GetInstructions returns the Instructions field if non-nil, zero value otherwise.

### GetInstructionsOk

`func (o *CreateThreadAndRunRequest) GetInstructionsOk() (*string, bool)`

GetInstructionsOk returns a tuple with the Instructions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstructions

`func (o *CreateThreadAndRunRequest) SetInstructions(v string)`

SetInstructions sets Instructions field to given value.

### HasInstructions

`func (o *CreateThreadAndRunRequest) HasInstructions() bool`

HasInstructions returns a boolean if a field has been set.

### SetInstructionsNil

`func (o *CreateThreadAndRunRequest) SetInstructionsNil(b bool)`

 SetInstructionsNil sets the value for Instructions to be an explicit nil

### UnsetInstructions
`func (o *CreateThreadAndRunRequest) UnsetInstructions()`

UnsetInstructions ensures that no value is present for Instructions, not even an explicit nil
### GetTools

`func (o *CreateThreadAndRunRequest) GetTools() []CreateThreadAndRunRequestToolsInner`

GetTools returns the Tools field if non-nil, zero value otherwise.

### GetToolsOk

`func (o *CreateThreadAndRunRequest) GetToolsOk() (*[]CreateThreadAndRunRequestToolsInner, bool)`

GetToolsOk returns a tuple with the Tools field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTools

`func (o *CreateThreadAndRunRequest) SetTools(v []CreateThreadAndRunRequestToolsInner)`

SetTools sets Tools field to given value.

### HasTools

`func (o *CreateThreadAndRunRequest) HasTools() bool`

HasTools returns a boolean if a field has been set.

### SetToolsNil

`func (o *CreateThreadAndRunRequest) SetToolsNil(b bool)`

 SetToolsNil sets the value for Tools to be an explicit nil

### UnsetTools
`func (o *CreateThreadAndRunRequest) UnsetTools()`

UnsetTools ensures that no value is present for Tools, not even an explicit nil
### GetToolResources

`func (o *CreateThreadAndRunRequest) GetToolResources() CreateThreadAndRunRequestToolResources`

GetToolResources returns the ToolResources field if non-nil, zero value otherwise.

### GetToolResourcesOk

`func (o *CreateThreadAndRunRequest) GetToolResourcesOk() (*CreateThreadAndRunRequestToolResources, bool)`

GetToolResourcesOk returns a tuple with the ToolResources field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToolResources

`func (o *CreateThreadAndRunRequest) SetToolResources(v CreateThreadAndRunRequestToolResources)`

SetToolResources sets ToolResources field to given value.

### HasToolResources

`func (o *CreateThreadAndRunRequest) HasToolResources() bool`

HasToolResources returns a boolean if a field has been set.

### SetToolResourcesNil

`func (o *CreateThreadAndRunRequest) SetToolResourcesNil(b bool)`

 SetToolResourcesNil sets the value for ToolResources to be an explicit nil

### UnsetToolResources
`func (o *CreateThreadAndRunRequest) UnsetToolResources()`

UnsetToolResources ensures that no value is present for ToolResources, not even an explicit nil
### GetMetadata

`func (o *CreateThreadAndRunRequest) GetMetadata() map[string]interface{}`

GetMetadata returns the Metadata field if non-nil, zero value otherwise.

### GetMetadataOk

`func (o *CreateThreadAndRunRequest) GetMetadataOk() (*map[string]interface{}, bool)`

GetMetadataOk returns a tuple with the Metadata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMetadata

`func (o *CreateThreadAndRunRequest) SetMetadata(v map[string]interface{})`

SetMetadata sets Metadata field to given value.

### HasMetadata

`func (o *CreateThreadAndRunRequest) HasMetadata() bool`

HasMetadata returns a boolean if a field has been set.

### SetMetadataNil

`func (o *CreateThreadAndRunRequest) SetMetadataNil(b bool)`

 SetMetadataNil sets the value for Metadata to be an explicit nil

### UnsetMetadata
`func (o *CreateThreadAndRunRequest) UnsetMetadata()`

UnsetMetadata ensures that no value is present for Metadata, not even an explicit nil
### GetTemperature

`func (o *CreateThreadAndRunRequest) GetTemperature() float32`

GetTemperature returns the Temperature field if non-nil, zero value otherwise.

### GetTemperatureOk

`func (o *CreateThreadAndRunRequest) GetTemperatureOk() (*float32, bool)`

GetTemperatureOk returns a tuple with the Temperature field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTemperature

`func (o *CreateThreadAndRunRequest) SetTemperature(v float32)`

SetTemperature sets Temperature field to given value.

### HasTemperature

`func (o *CreateThreadAndRunRequest) HasTemperature() bool`

HasTemperature returns a boolean if a field has been set.

### SetTemperatureNil

`func (o *CreateThreadAndRunRequest) SetTemperatureNil(b bool)`

 SetTemperatureNil sets the value for Temperature to be an explicit nil

### UnsetTemperature
`func (o *CreateThreadAndRunRequest) UnsetTemperature()`

UnsetTemperature ensures that no value is present for Temperature, not even an explicit nil
### GetTopP

`func (o *CreateThreadAndRunRequest) GetTopP() float32`

GetTopP returns the TopP field if non-nil, zero value otherwise.

### GetTopPOk

`func (o *CreateThreadAndRunRequest) GetTopPOk() (*float32, bool)`

GetTopPOk returns a tuple with the TopP field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTopP

`func (o *CreateThreadAndRunRequest) SetTopP(v float32)`

SetTopP sets TopP field to given value.

### HasTopP

`func (o *CreateThreadAndRunRequest) HasTopP() bool`

HasTopP returns a boolean if a field has been set.

### SetTopPNil

`func (o *CreateThreadAndRunRequest) SetTopPNil(b bool)`

 SetTopPNil sets the value for TopP to be an explicit nil

### UnsetTopP
`func (o *CreateThreadAndRunRequest) UnsetTopP()`

UnsetTopP ensures that no value is present for TopP, not even an explicit nil
### GetStream

`func (o *CreateThreadAndRunRequest) GetStream() bool`

GetStream returns the Stream field if non-nil, zero value otherwise.

### GetStreamOk

`func (o *CreateThreadAndRunRequest) GetStreamOk() (*bool, bool)`

GetStreamOk returns a tuple with the Stream field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStream

`func (o *CreateThreadAndRunRequest) SetStream(v bool)`

SetStream sets Stream field to given value.

### HasStream

`func (o *CreateThreadAndRunRequest) HasStream() bool`

HasStream returns a boolean if a field has been set.

### SetStreamNil

`func (o *CreateThreadAndRunRequest) SetStreamNil(b bool)`

 SetStreamNil sets the value for Stream to be an explicit nil

### UnsetStream
`func (o *CreateThreadAndRunRequest) UnsetStream()`

UnsetStream ensures that no value is present for Stream, not even an explicit nil
### GetMaxPromptTokens

`func (o *CreateThreadAndRunRequest) GetMaxPromptTokens() int32`

GetMaxPromptTokens returns the MaxPromptTokens field if non-nil, zero value otherwise.

### GetMaxPromptTokensOk

`func (o *CreateThreadAndRunRequest) GetMaxPromptTokensOk() (*int32, bool)`

GetMaxPromptTokensOk returns a tuple with the MaxPromptTokens field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxPromptTokens

`func (o *CreateThreadAndRunRequest) SetMaxPromptTokens(v int32)`

SetMaxPromptTokens sets MaxPromptTokens field to given value.

### HasMaxPromptTokens

`func (o *CreateThreadAndRunRequest) HasMaxPromptTokens() bool`

HasMaxPromptTokens returns a boolean if a field has been set.

### SetMaxPromptTokensNil

`func (o *CreateThreadAndRunRequest) SetMaxPromptTokensNil(b bool)`

 SetMaxPromptTokensNil sets the value for MaxPromptTokens to be an explicit nil

### UnsetMaxPromptTokens
`func (o *CreateThreadAndRunRequest) UnsetMaxPromptTokens()`

UnsetMaxPromptTokens ensures that no value is present for MaxPromptTokens, not even an explicit nil
### GetMaxCompletionTokens

`func (o *CreateThreadAndRunRequest) GetMaxCompletionTokens() int32`

GetMaxCompletionTokens returns the MaxCompletionTokens field if non-nil, zero value otherwise.

### GetMaxCompletionTokensOk

`func (o *CreateThreadAndRunRequest) GetMaxCompletionTokensOk() (*int32, bool)`

GetMaxCompletionTokensOk returns a tuple with the MaxCompletionTokens field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxCompletionTokens

`func (o *CreateThreadAndRunRequest) SetMaxCompletionTokens(v int32)`

SetMaxCompletionTokens sets MaxCompletionTokens field to given value.

### HasMaxCompletionTokens

`func (o *CreateThreadAndRunRequest) HasMaxCompletionTokens() bool`

HasMaxCompletionTokens returns a boolean if a field has been set.

### SetMaxCompletionTokensNil

`func (o *CreateThreadAndRunRequest) SetMaxCompletionTokensNil(b bool)`

 SetMaxCompletionTokensNil sets the value for MaxCompletionTokens to be an explicit nil

### UnsetMaxCompletionTokens
`func (o *CreateThreadAndRunRequest) UnsetMaxCompletionTokens()`

UnsetMaxCompletionTokens ensures that no value is present for MaxCompletionTokens, not even an explicit nil
### GetTruncationStrategy

`func (o *CreateThreadAndRunRequest) GetTruncationStrategy() TruncationObject`

GetTruncationStrategy returns the TruncationStrategy field if non-nil, zero value otherwise.

### GetTruncationStrategyOk

`func (o *CreateThreadAndRunRequest) GetTruncationStrategyOk() (*TruncationObject, bool)`

GetTruncationStrategyOk returns a tuple with the TruncationStrategy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTruncationStrategy

`func (o *CreateThreadAndRunRequest) SetTruncationStrategy(v TruncationObject)`

SetTruncationStrategy sets TruncationStrategy field to given value.

### HasTruncationStrategy

`func (o *CreateThreadAndRunRequest) HasTruncationStrategy() bool`

HasTruncationStrategy returns a boolean if a field has been set.

### GetToolChoice

`func (o *CreateThreadAndRunRequest) GetToolChoice() AssistantsApiToolChoiceOption`

GetToolChoice returns the ToolChoice field if non-nil, zero value otherwise.

### GetToolChoiceOk

`func (o *CreateThreadAndRunRequest) GetToolChoiceOk() (*AssistantsApiToolChoiceOption, bool)`

GetToolChoiceOk returns a tuple with the ToolChoice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToolChoice

`func (o *CreateThreadAndRunRequest) SetToolChoice(v AssistantsApiToolChoiceOption)`

SetToolChoice sets ToolChoice field to given value.

### HasToolChoice

`func (o *CreateThreadAndRunRequest) HasToolChoice() bool`

HasToolChoice returns a boolean if a field has been set.

### GetParallelToolCalls

`func (o *CreateThreadAndRunRequest) GetParallelToolCalls() bool`

GetParallelToolCalls returns the ParallelToolCalls field if non-nil, zero value otherwise.

### GetParallelToolCallsOk

`func (o *CreateThreadAndRunRequest) GetParallelToolCallsOk() (*bool, bool)`

GetParallelToolCallsOk returns a tuple with the ParallelToolCalls field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParallelToolCalls

`func (o *CreateThreadAndRunRequest) SetParallelToolCalls(v bool)`

SetParallelToolCalls sets ParallelToolCalls field to given value.

### HasParallelToolCalls

`func (o *CreateThreadAndRunRequest) HasParallelToolCalls() bool`

HasParallelToolCalls returns a boolean if a field has been set.

### GetResponseFormat

`func (o *CreateThreadAndRunRequest) GetResponseFormat() AssistantsApiResponseFormatOption`

GetResponseFormat returns the ResponseFormat field if non-nil, zero value otherwise.

### GetResponseFormatOk

`func (o *CreateThreadAndRunRequest) GetResponseFormatOk() (*AssistantsApiResponseFormatOption, bool)`

GetResponseFormatOk returns a tuple with the ResponseFormat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponseFormat

`func (o *CreateThreadAndRunRequest) SetResponseFormat(v AssistantsApiResponseFormatOption)`

SetResponseFormat sets ResponseFormat field to given value.

### HasResponseFormat

`func (o *CreateThreadAndRunRequest) HasResponseFormat() bool`

HasResponseFormat returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


