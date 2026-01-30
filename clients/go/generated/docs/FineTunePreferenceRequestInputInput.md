# FineTunePreferenceRequestInputInput

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Messages** | Pointer to [**[]FineTuneChatRequestInputMessagesInner**](FineTuneChatRequestInputMessagesInner.md) |  | [optional] 
**Tools** | Pointer to [**[]ChatCompletionTool**](ChatCompletionTool.md) | A list of tools the model may generate JSON inputs for. | [optional] 
**ParallelToolCalls** | Pointer to **bool** | Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use. | [optional] [default to true]

## Methods

### NewFineTunePreferenceRequestInputInput

`func NewFineTunePreferenceRequestInputInput() *FineTunePreferenceRequestInputInput`

NewFineTunePreferenceRequestInputInput instantiates a new FineTunePreferenceRequestInputInput object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFineTunePreferenceRequestInputInputWithDefaults

`func NewFineTunePreferenceRequestInputInputWithDefaults() *FineTunePreferenceRequestInputInput`

NewFineTunePreferenceRequestInputInputWithDefaults instantiates a new FineTunePreferenceRequestInputInput object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMessages

`func (o *FineTunePreferenceRequestInputInput) GetMessages() []FineTuneChatRequestInputMessagesInner`

GetMessages returns the Messages field if non-nil, zero value otherwise.

### GetMessagesOk

`func (o *FineTunePreferenceRequestInputInput) GetMessagesOk() (*[]FineTuneChatRequestInputMessagesInner, bool)`

GetMessagesOk returns a tuple with the Messages field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessages

`func (o *FineTunePreferenceRequestInputInput) SetMessages(v []FineTuneChatRequestInputMessagesInner)`

SetMessages sets Messages field to given value.

### HasMessages

`func (o *FineTunePreferenceRequestInputInput) HasMessages() bool`

HasMessages returns a boolean if a field has been set.

### GetTools

`func (o *FineTunePreferenceRequestInputInput) GetTools() []ChatCompletionTool`

GetTools returns the Tools field if non-nil, zero value otherwise.

### GetToolsOk

`func (o *FineTunePreferenceRequestInputInput) GetToolsOk() (*[]ChatCompletionTool, bool)`

GetToolsOk returns a tuple with the Tools field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTools

`func (o *FineTunePreferenceRequestInputInput) SetTools(v []ChatCompletionTool)`

SetTools sets Tools field to given value.

### HasTools

`func (o *FineTunePreferenceRequestInputInput) HasTools() bool`

HasTools returns a boolean if a field has been set.

### GetParallelToolCalls

`func (o *FineTunePreferenceRequestInputInput) GetParallelToolCalls() bool`

GetParallelToolCalls returns the ParallelToolCalls field if non-nil, zero value otherwise.

### GetParallelToolCallsOk

`func (o *FineTunePreferenceRequestInputInput) GetParallelToolCallsOk() (*bool, bool)`

GetParallelToolCallsOk returns a tuple with the ParallelToolCalls field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParallelToolCalls

`func (o *FineTunePreferenceRequestInputInput) SetParallelToolCalls(v bool)`

SetParallelToolCalls sets ParallelToolCalls field to given value.

### HasParallelToolCalls

`func (o *FineTunePreferenceRequestInputInput) HasParallelToolCalls() bool`

HasParallelToolCalls returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


