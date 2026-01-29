# RunObjectRequiredAction

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | For now, this is always &#x60;submit_tool_outputs&#x60;. | 
**SubmitToolOutputs** | [**RunObjectRequiredActionSubmitToolOutputs**](RunObjectRequiredActionSubmitToolOutputs.md) |  | 

## Methods

### NewRunObjectRequiredAction

`func NewRunObjectRequiredAction(type_ string, submitToolOutputs RunObjectRequiredActionSubmitToolOutputs, ) *RunObjectRequiredAction`

NewRunObjectRequiredAction instantiates a new RunObjectRequiredAction object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRunObjectRequiredActionWithDefaults

`func NewRunObjectRequiredActionWithDefaults() *RunObjectRequiredAction`

NewRunObjectRequiredActionWithDefaults instantiates a new RunObjectRequiredAction object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *RunObjectRequiredAction) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *RunObjectRequiredAction) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *RunObjectRequiredAction) SetType(v string)`

SetType sets Type field to given value.


### GetSubmitToolOutputs

`func (o *RunObjectRequiredAction) GetSubmitToolOutputs() RunObjectRequiredActionSubmitToolOutputs`

GetSubmitToolOutputs returns the SubmitToolOutputs field if non-nil, zero value otherwise.

### GetSubmitToolOutputsOk

`func (o *RunObjectRequiredAction) GetSubmitToolOutputsOk() (*RunObjectRequiredActionSubmitToolOutputs, bool)`

GetSubmitToolOutputsOk returns a tuple with the SubmitToolOutputs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubmitToolOutputs

`func (o *RunObjectRequiredAction) SetSubmitToolOutputs(v RunObjectRequiredActionSubmitToolOutputs)`

SetSubmitToolOutputs sets SubmitToolOutputs field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


