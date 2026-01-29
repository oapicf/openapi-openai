# RunToolCallObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | The ID of the tool call. This ID must be referenced when you submit the tool outputs in using the [Submit tool outputs to run](/docs/api-reference/runs/submitToolOutputs) endpoint. | 
**Type** | **string** | The type of tool call the output is required for. For now, this is always &#x60;function&#x60;. | 
**Function** | [**RunToolCallObjectFunction**](RunToolCallObjectFunction.md) |  | 

## Methods

### NewRunToolCallObject

`func NewRunToolCallObject(id string, type_ string, function RunToolCallObjectFunction, ) *RunToolCallObject`

NewRunToolCallObject instantiates a new RunToolCallObject object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRunToolCallObjectWithDefaults

`func NewRunToolCallObjectWithDefaults() *RunToolCallObject`

NewRunToolCallObjectWithDefaults instantiates a new RunToolCallObject object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *RunToolCallObject) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *RunToolCallObject) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *RunToolCallObject) SetId(v string)`

SetId sets Id field to given value.


### GetType

`func (o *RunToolCallObject) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *RunToolCallObject) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *RunToolCallObject) SetType(v string)`

SetType sets Type field to given value.


### GetFunction

`func (o *RunToolCallObject) GetFunction() RunToolCallObjectFunction`

GetFunction returns the Function field if non-nil, zero value otherwise.

### GetFunctionOk

`func (o *RunToolCallObject) GetFunctionOk() (*RunToolCallObjectFunction, bool)`

GetFunctionOk returns a tuple with the Function field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFunction

`func (o *RunToolCallObject) SetFunction(v RunToolCallObjectFunction)`

SetFunction sets Function field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


