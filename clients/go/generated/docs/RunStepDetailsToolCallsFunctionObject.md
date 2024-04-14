# RunStepDetailsToolCallsFunctionObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | The ID of the tool call object. | 
**Type** | **string** | The type of tool call. This is always going to be &#x60;function&#x60; for this type of tool call. | 
**Function** | [**RunStepDetailsToolCallsFunctionObjectFunction**](RunStepDetailsToolCallsFunctionObjectFunction.md) |  | 

## Methods

### NewRunStepDetailsToolCallsFunctionObject

`func NewRunStepDetailsToolCallsFunctionObject(id string, type_ string, function RunStepDetailsToolCallsFunctionObjectFunction, ) *RunStepDetailsToolCallsFunctionObject`

NewRunStepDetailsToolCallsFunctionObject instantiates a new RunStepDetailsToolCallsFunctionObject object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRunStepDetailsToolCallsFunctionObjectWithDefaults

`func NewRunStepDetailsToolCallsFunctionObjectWithDefaults() *RunStepDetailsToolCallsFunctionObject`

NewRunStepDetailsToolCallsFunctionObjectWithDefaults instantiates a new RunStepDetailsToolCallsFunctionObject object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *RunStepDetailsToolCallsFunctionObject) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *RunStepDetailsToolCallsFunctionObject) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *RunStepDetailsToolCallsFunctionObject) SetId(v string)`

SetId sets Id field to given value.


### GetType

`func (o *RunStepDetailsToolCallsFunctionObject) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *RunStepDetailsToolCallsFunctionObject) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *RunStepDetailsToolCallsFunctionObject) SetType(v string)`

SetType sets Type field to given value.


### GetFunction

`func (o *RunStepDetailsToolCallsFunctionObject) GetFunction() RunStepDetailsToolCallsFunctionObjectFunction`

GetFunction returns the Function field if non-nil, zero value otherwise.

### GetFunctionOk

`func (o *RunStepDetailsToolCallsFunctionObject) GetFunctionOk() (*RunStepDetailsToolCallsFunctionObjectFunction, bool)`

GetFunctionOk returns a tuple with the Function field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFunction

`func (o *RunStepDetailsToolCallsFunctionObject) SetFunction(v RunStepDetailsToolCallsFunctionObjectFunction)`

SetFunction sets Function field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


