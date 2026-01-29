# ChatCompletionMessageToolCall

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | The ID of the tool call. | 
**Type** | **string** | The type of the tool. Currently, only &#x60;function&#x60; is supported. | 
**Function** | [**ChatCompletionMessageToolCallFunction**](ChatCompletionMessageToolCallFunction.md) |  | 

## Methods

### NewChatCompletionMessageToolCall

`func NewChatCompletionMessageToolCall(id string, type_ string, function ChatCompletionMessageToolCallFunction, ) *ChatCompletionMessageToolCall`

NewChatCompletionMessageToolCall instantiates a new ChatCompletionMessageToolCall object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewChatCompletionMessageToolCallWithDefaults

`func NewChatCompletionMessageToolCallWithDefaults() *ChatCompletionMessageToolCall`

NewChatCompletionMessageToolCallWithDefaults instantiates a new ChatCompletionMessageToolCall object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *ChatCompletionMessageToolCall) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ChatCompletionMessageToolCall) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ChatCompletionMessageToolCall) SetId(v string)`

SetId sets Id field to given value.


### GetType

`func (o *ChatCompletionMessageToolCall) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *ChatCompletionMessageToolCall) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *ChatCompletionMessageToolCall) SetType(v string)`

SetType sets Type field to given value.


### GetFunction

`func (o *ChatCompletionMessageToolCall) GetFunction() ChatCompletionMessageToolCallFunction`

GetFunction returns the Function field if non-nil, zero value otherwise.

### GetFunctionOk

`func (o *ChatCompletionMessageToolCall) GetFunctionOk() (*ChatCompletionMessageToolCallFunction, bool)`

GetFunctionOk returns a tuple with the Function field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFunction

`func (o *ChatCompletionMessageToolCall) SetFunction(v ChatCompletionMessageToolCallFunction)`

SetFunction sets Function field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


