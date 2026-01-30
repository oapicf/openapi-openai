# ChatCompletionStreamOptions

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**IncludeUsage** | Pointer to **bool** | If set, an additional chunk will be streamed before the &#x60;data: [DONE]&#x60; message. The &#x60;usage&#x60; field on this chunk shows the token usage statistics for the entire request, and the &#x60;choices&#x60; field will always be an empty array. All other chunks will also include a &#x60;usage&#x60; field, but with a null value.  | [optional] 

## Methods

### NewChatCompletionStreamOptions

`func NewChatCompletionStreamOptions() *ChatCompletionStreamOptions`

NewChatCompletionStreamOptions instantiates a new ChatCompletionStreamOptions object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewChatCompletionStreamOptionsWithDefaults

`func NewChatCompletionStreamOptionsWithDefaults() *ChatCompletionStreamOptions`

NewChatCompletionStreamOptionsWithDefaults instantiates a new ChatCompletionStreamOptions object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetIncludeUsage

`func (o *ChatCompletionStreamOptions) GetIncludeUsage() bool`

GetIncludeUsage returns the IncludeUsage field if non-nil, zero value otherwise.

### GetIncludeUsageOk

`func (o *ChatCompletionStreamOptions) GetIncludeUsageOk() (*bool, bool)`

GetIncludeUsageOk returns a tuple with the IncludeUsage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIncludeUsage

`func (o *ChatCompletionStreamOptions) SetIncludeUsage(v bool)`

SetIncludeUsage sets IncludeUsage field to given value.

### HasIncludeUsage

`func (o *ChatCompletionStreamOptions) HasIncludeUsage() bool`

HasIncludeUsage returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


