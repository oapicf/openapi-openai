# ChatCompletionMessageToolCallChunk

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Index** | **int32** |  | 
**Id** | Pointer to **string** | The ID of the tool call. | [optional] 
**Type** | Pointer to **string** | The type of the tool. Currently, only &#x60;function&#x60; is supported. | [optional] 
**Function** | Pointer to [**ChatCompletionMessageToolCallChunkFunction**](ChatCompletionMessageToolCallChunkFunction.md) |  | [optional] 

## Methods

### NewChatCompletionMessageToolCallChunk

`func NewChatCompletionMessageToolCallChunk(index int32, ) *ChatCompletionMessageToolCallChunk`

NewChatCompletionMessageToolCallChunk instantiates a new ChatCompletionMessageToolCallChunk object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewChatCompletionMessageToolCallChunkWithDefaults

`func NewChatCompletionMessageToolCallChunkWithDefaults() *ChatCompletionMessageToolCallChunk`

NewChatCompletionMessageToolCallChunkWithDefaults instantiates a new ChatCompletionMessageToolCallChunk object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetIndex

`func (o *ChatCompletionMessageToolCallChunk) GetIndex() int32`

GetIndex returns the Index field if non-nil, zero value otherwise.

### GetIndexOk

`func (o *ChatCompletionMessageToolCallChunk) GetIndexOk() (*int32, bool)`

GetIndexOk returns a tuple with the Index field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIndex

`func (o *ChatCompletionMessageToolCallChunk) SetIndex(v int32)`

SetIndex sets Index field to given value.


### GetId

`func (o *ChatCompletionMessageToolCallChunk) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ChatCompletionMessageToolCallChunk) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ChatCompletionMessageToolCallChunk) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *ChatCompletionMessageToolCallChunk) HasId() bool`

HasId returns a boolean if a field has been set.

### GetType

`func (o *ChatCompletionMessageToolCallChunk) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *ChatCompletionMessageToolCallChunk) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *ChatCompletionMessageToolCallChunk) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *ChatCompletionMessageToolCallChunk) HasType() bool`

HasType returns a boolean if a field has been set.

### GetFunction

`func (o *ChatCompletionMessageToolCallChunk) GetFunction() ChatCompletionMessageToolCallChunkFunction`

GetFunction returns the Function field if non-nil, zero value otherwise.

### GetFunctionOk

`func (o *ChatCompletionMessageToolCallChunk) GetFunctionOk() (*ChatCompletionMessageToolCallChunkFunction, bool)`

GetFunctionOk returns a tuple with the Function field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFunction

`func (o *ChatCompletionMessageToolCallChunk) SetFunction(v ChatCompletionMessageToolCallChunkFunction)`

SetFunction sets Function field to given value.

### HasFunction

`func (o *ChatCompletionMessageToolCallChunk) HasFunction() bool`

HasFunction returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


