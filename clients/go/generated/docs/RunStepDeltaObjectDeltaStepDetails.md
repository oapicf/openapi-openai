# RunStepDeltaObjectDeltaStepDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | Always &#x60;message_creation&#x60;. | 
**MessageCreation** | Pointer to [**RunStepDeltaStepDetailsMessageCreationObjectMessageCreation**](RunStepDeltaStepDetailsMessageCreationObjectMessageCreation.md) |  | [optional] 
**ToolCalls** | Pointer to [**[]RunStepDeltaStepDetailsToolCallsObjectToolCallsInner**](RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.md) | An array of tool calls the run step was involved in. These can be associated with one of three types of tools: &#x60;code_interpreter&#x60;, &#x60;file_search&#x60;, or &#x60;function&#x60;.  | [optional] 

## Methods

### NewRunStepDeltaObjectDeltaStepDetails

`func NewRunStepDeltaObjectDeltaStepDetails(type_ string, ) *RunStepDeltaObjectDeltaStepDetails`

NewRunStepDeltaObjectDeltaStepDetails instantiates a new RunStepDeltaObjectDeltaStepDetails object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRunStepDeltaObjectDeltaStepDetailsWithDefaults

`func NewRunStepDeltaObjectDeltaStepDetailsWithDefaults() *RunStepDeltaObjectDeltaStepDetails`

NewRunStepDeltaObjectDeltaStepDetailsWithDefaults instantiates a new RunStepDeltaObjectDeltaStepDetails object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *RunStepDeltaObjectDeltaStepDetails) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *RunStepDeltaObjectDeltaStepDetails) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *RunStepDeltaObjectDeltaStepDetails) SetType(v string)`

SetType sets Type field to given value.


### GetMessageCreation

`func (o *RunStepDeltaObjectDeltaStepDetails) GetMessageCreation() RunStepDeltaStepDetailsMessageCreationObjectMessageCreation`

GetMessageCreation returns the MessageCreation field if non-nil, zero value otherwise.

### GetMessageCreationOk

`func (o *RunStepDeltaObjectDeltaStepDetails) GetMessageCreationOk() (*RunStepDeltaStepDetailsMessageCreationObjectMessageCreation, bool)`

GetMessageCreationOk returns a tuple with the MessageCreation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessageCreation

`func (o *RunStepDeltaObjectDeltaStepDetails) SetMessageCreation(v RunStepDeltaStepDetailsMessageCreationObjectMessageCreation)`

SetMessageCreation sets MessageCreation field to given value.

### HasMessageCreation

`func (o *RunStepDeltaObjectDeltaStepDetails) HasMessageCreation() bool`

HasMessageCreation returns a boolean if a field has been set.

### GetToolCalls

`func (o *RunStepDeltaObjectDeltaStepDetails) GetToolCalls() []RunStepDeltaStepDetailsToolCallsObjectToolCallsInner`

GetToolCalls returns the ToolCalls field if non-nil, zero value otherwise.

### GetToolCallsOk

`func (o *RunStepDeltaObjectDeltaStepDetails) GetToolCallsOk() (*[]RunStepDeltaStepDetailsToolCallsObjectToolCallsInner, bool)`

GetToolCallsOk returns a tuple with the ToolCalls field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToolCalls

`func (o *RunStepDeltaObjectDeltaStepDetails) SetToolCalls(v []RunStepDeltaStepDetailsToolCallsObjectToolCallsInner)`

SetToolCalls sets ToolCalls field to given value.

### HasToolCalls

`func (o *RunStepDeltaObjectDeltaStepDetails) HasToolCalls() bool`

HasToolCalls returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


