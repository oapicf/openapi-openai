# RunStepObjectStepDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | Always &#x60;message_creation&#x60;. | 
**MessageCreation** | [**RunStepDetailsMessageCreationObjectMessageCreation**](RunStepDetailsMessageCreationObjectMessageCreation.md) |  | 
**ToolCalls** | [**[]RunStepDetailsToolCallsObjectToolCallsInner**](RunStepDetailsToolCallsObjectToolCallsInner.md) | An array of tool calls the run step was involved in. These can be associated with one of three types of tools: &#x60;code_interpreter&#x60;, &#x60;file_search&#x60;, or &#x60;function&#x60;.  | 

## Methods

### NewRunStepObjectStepDetails

`func NewRunStepObjectStepDetails(type_ string, messageCreation RunStepDetailsMessageCreationObjectMessageCreation, toolCalls []RunStepDetailsToolCallsObjectToolCallsInner, ) *RunStepObjectStepDetails`

NewRunStepObjectStepDetails instantiates a new RunStepObjectStepDetails object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRunStepObjectStepDetailsWithDefaults

`func NewRunStepObjectStepDetailsWithDefaults() *RunStepObjectStepDetails`

NewRunStepObjectStepDetailsWithDefaults instantiates a new RunStepObjectStepDetails object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *RunStepObjectStepDetails) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *RunStepObjectStepDetails) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *RunStepObjectStepDetails) SetType(v string)`

SetType sets Type field to given value.


### GetMessageCreation

`func (o *RunStepObjectStepDetails) GetMessageCreation() RunStepDetailsMessageCreationObjectMessageCreation`

GetMessageCreation returns the MessageCreation field if non-nil, zero value otherwise.

### GetMessageCreationOk

`func (o *RunStepObjectStepDetails) GetMessageCreationOk() (*RunStepDetailsMessageCreationObjectMessageCreation, bool)`

GetMessageCreationOk returns a tuple with the MessageCreation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessageCreation

`func (o *RunStepObjectStepDetails) SetMessageCreation(v RunStepDetailsMessageCreationObjectMessageCreation)`

SetMessageCreation sets MessageCreation field to given value.


### GetToolCalls

`func (o *RunStepObjectStepDetails) GetToolCalls() []RunStepDetailsToolCallsObjectToolCallsInner`

GetToolCalls returns the ToolCalls field if non-nil, zero value otherwise.

### GetToolCallsOk

`func (o *RunStepObjectStepDetails) GetToolCallsOk() (*[]RunStepDetailsToolCallsObjectToolCallsInner, bool)`

GetToolCallsOk returns a tuple with the ToolCalls field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToolCalls

`func (o *RunStepObjectStepDetails) SetToolCalls(v []RunStepDetailsToolCallsObjectToolCallsInner)`

SetToolCalls sets ToolCalls field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


