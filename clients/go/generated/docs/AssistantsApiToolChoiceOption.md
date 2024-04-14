# AssistantsApiToolChoiceOption

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | The type of the tool. If type is &#x60;function&#x60;, the function name must be set | 
**Function** | Pointer to [**ChatCompletionNamedToolChoiceFunction**](ChatCompletionNamedToolChoiceFunction.md) |  | [optional] 

## Methods

### NewAssistantsApiToolChoiceOption

`func NewAssistantsApiToolChoiceOption(type_ string, ) *AssistantsApiToolChoiceOption`

NewAssistantsApiToolChoiceOption instantiates a new AssistantsApiToolChoiceOption object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAssistantsApiToolChoiceOptionWithDefaults

`func NewAssistantsApiToolChoiceOptionWithDefaults() *AssistantsApiToolChoiceOption`

NewAssistantsApiToolChoiceOptionWithDefaults instantiates a new AssistantsApiToolChoiceOption object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *AssistantsApiToolChoiceOption) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *AssistantsApiToolChoiceOption) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *AssistantsApiToolChoiceOption) SetType(v string)`

SetType sets Type field to given value.


### GetFunction

`func (o *AssistantsApiToolChoiceOption) GetFunction() ChatCompletionNamedToolChoiceFunction`

GetFunction returns the Function field if non-nil, zero value otherwise.

### GetFunctionOk

`func (o *AssistantsApiToolChoiceOption) GetFunctionOk() (*ChatCompletionNamedToolChoiceFunction, bool)`

GetFunctionOk returns a tuple with the Function field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFunction

`func (o *AssistantsApiToolChoiceOption) SetFunction(v ChatCompletionNamedToolChoiceFunction)`

SetFunction sets Function field to given value.

### HasFunction

`func (o *AssistantsApiToolChoiceOption) HasFunction() bool`

HasFunction returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


