# AssistantsNamedToolChoice

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | The type of the tool. If type is &#x60;function&#x60;, the function name must be set | 
**Function** | Pointer to [**AssistantsNamedToolChoiceFunction**](AssistantsNamedToolChoiceFunction.md) |  | [optional] 

## Methods

### NewAssistantsNamedToolChoice

`func NewAssistantsNamedToolChoice(type_ string, ) *AssistantsNamedToolChoice`

NewAssistantsNamedToolChoice instantiates a new AssistantsNamedToolChoice object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAssistantsNamedToolChoiceWithDefaults

`func NewAssistantsNamedToolChoiceWithDefaults() *AssistantsNamedToolChoice`

NewAssistantsNamedToolChoiceWithDefaults instantiates a new AssistantsNamedToolChoice object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *AssistantsNamedToolChoice) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *AssistantsNamedToolChoice) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *AssistantsNamedToolChoice) SetType(v string)`

SetType sets Type field to given value.


### GetFunction

`func (o *AssistantsNamedToolChoice) GetFunction() AssistantsNamedToolChoiceFunction`

GetFunction returns the Function field if non-nil, zero value otherwise.

### GetFunctionOk

`func (o *AssistantsNamedToolChoice) GetFunctionOk() (*AssistantsNamedToolChoiceFunction, bool)`

GetFunctionOk returns a tuple with the Function field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFunction

`func (o *AssistantsNamedToolChoice) SetFunction(v AssistantsNamedToolChoiceFunction)`

SetFunction sets Function field to given value.

### HasFunction

`func (o *AssistantsNamedToolChoice) HasFunction() bool`

HasFunction returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


