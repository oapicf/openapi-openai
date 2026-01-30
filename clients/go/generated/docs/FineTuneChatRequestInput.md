# FineTuneChatRequestInput

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Messages** | Pointer to [**[]FineTuneChatRequestInputMessagesInner**](FineTuneChatRequestInputMessagesInner.md) |  | [optional] 
**Tools** | Pointer to [**[]ChatCompletionTool**](ChatCompletionTool.md) | A list of tools the model may generate JSON inputs for. | [optional] 
**ParallelToolCalls** | Pointer to **bool** | Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use. | [optional] [default to true]
**Functions** | Pointer to [**[]ChatCompletionFunctions**](ChatCompletionFunctions.md) | A list of functions the model may generate JSON inputs for. | [optional] 

## Methods

### NewFineTuneChatRequestInput

`func NewFineTuneChatRequestInput() *FineTuneChatRequestInput`

NewFineTuneChatRequestInput instantiates a new FineTuneChatRequestInput object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFineTuneChatRequestInputWithDefaults

`func NewFineTuneChatRequestInputWithDefaults() *FineTuneChatRequestInput`

NewFineTuneChatRequestInputWithDefaults instantiates a new FineTuneChatRequestInput object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMessages

`func (o *FineTuneChatRequestInput) GetMessages() []FineTuneChatRequestInputMessagesInner`

GetMessages returns the Messages field if non-nil, zero value otherwise.

### GetMessagesOk

`func (o *FineTuneChatRequestInput) GetMessagesOk() (*[]FineTuneChatRequestInputMessagesInner, bool)`

GetMessagesOk returns a tuple with the Messages field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessages

`func (o *FineTuneChatRequestInput) SetMessages(v []FineTuneChatRequestInputMessagesInner)`

SetMessages sets Messages field to given value.

### HasMessages

`func (o *FineTuneChatRequestInput) HasMessages() bool`

HasMessages returns a boolean if a field has been set.

### GetTools

`func (o *FineTuneChatRequestInput) GetTools() []ChatCompletionTool`

GetTools returns the Tools field if non-nil, zero value otherwise.

### GetToolsOk

`func (o *FineTuneChatRequestInput) GetToolsOk() (*[]ChatCompletionTool, bool)`

GetToolsOk returns a tuple with the Tools field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTools

`func (o *FineTuneChatRequestInput) SetTools(v []ChatCompletionTool)`

SetTools sets Tools field to given value.

### HasTools

`func (o *FineTuneChatRequestInput) HasTools() bool`

HasTools returns a boolean if a field has been set.

### GetParallelToolCalls

`func (o *FineTuneChatRequestInput) GetParallelToolCalls() bool`

GetParallelToolCalls returns the ParallelToolCalls field if non-nil, zero value otherwise.

### GetParallelToolCallsOk

`func (o *FineTuneChatRequestInput) GetParallelToolCallsOk() (*bool, bool)`

GetParallelToolCallsOk returns a tuple with the ParallelToolCalls field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParallelToolCalls

`func (o *FineTuneChatRequestInput) SetParallelToolCalls(v bool)`

SetParallelToolCalls sets ParallelToolCalls field to given value.

### HasParallelToolCalls

`func (o *FineTuneChatRequestInput) HasParallelToolCalls() bool`

HasParallelToolCalls returns a boolean if a field has been set.

### GetFunctions

`func (o *FineTuneChatRequestInput) GetFunctions() []ChatCompletionFunctions`

GetFunctions returns the Functions field if non-nil, zero value otherwise.

### GetFunctionsOk

`func (o *FineTuneChatRequestInput) GetFunctionsOk() (*[]ChatCompletionFunctions, bool)`

GetFunctionsOk returns a tuple with the Functions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFunctions

`func (o *FineTuneChatRequestInput) SetFunctions(v []ChatCompletionFunctions)`

SetFunctions sets Functions field to given value.

### HasFunctions

`func (o *FineTuneChatRequestInput) HasFunctions() bool`

HasFunctions returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


