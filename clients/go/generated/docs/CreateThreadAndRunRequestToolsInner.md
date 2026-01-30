# CreateThreadAndRunRequestToolsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | The type of tool being defined: &#x60;code_interpreter&#x60; | 
**FileSearch** | Pointer to [**AssistantToolsFileSearchFileSearch**](AssistantToolsFileSearchFileSearch.md) |  | [optional] 
**Function** | [**FunctionObject**](FunctionObject.md) |  | 

## Methods

### NewCreateThreadAndRunRequestToolsInner

`func NewCreateThreadAndRunRequestToolsInner(type_ string, function FunctionObject, ) *CreateThreadAndRunRequestToolsInner`

NewCreateThreadAndRunRequestToolsInner instantiates a new CreateThreadAndRunRequestToolsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateThreadAndRunRequestToolsInnerWithDefaults

`func NewCreateThreadAndRunRequestToolsInnerWithDefaults() *CreateThreadAndRunRequestToolsInner`

NewCreateThreadAndRunRequestToolsInnerWithDefaults instantiates a new CreateThreadAndRunRequestToolsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *CreateThreadAndRunRequestToolsInner) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *CreateThreadAndRunRequestToolsInner) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *CreateThreadAndRunRequestToolsInner) SetType(v string)`

SetType sets Type field to given value.


### GetFileSearch

`func (o *CreateThreadAndRunRequestToolsInner) GetFileSearch() AssistantToolsFileSearchFileSearch`

GetFileSearch returns the FileSearch field if non-nil, zero value otherwise.

### GetFileSearchOk

`func (o *CreateThreadAndRunRequestToolsInner) GetFileSearchOk() (*AssistantToolsFileSearchFileSearch, bool)`

GetFileSearchOk returns a tuple with the FileSearch field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFileSearch

`func (o *CreateThreadAndRunRequestToolsInner) SetFileSearch(v AssistantToolsFileSearchFileSearch)`

SetFileSearch sets FileSearch field to given value.

### HasFileSearch

`func (o *CreateThreadAndRunRequestToolsInner) HasFileSearch() bool`

HasFileSearch returns a boolean if a field has been set.

### GetFunction

`func (o *CreateThreadAndRunRequestToolsInner) GetFunction() FunctionObject`

GetFunction returns the Function field if non-nil, zero value otherwise.

### GetFunctionOk

`func (o *CreateThreadAndRunRequestToolsInner) GetFunctionOk() (*FunctionObject, bool)`

GetFunctionOk returns a tuple with the Function field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFunction

`func (o *CreateThreadAndRunRequestToolsInner) SetFunction(v FunctionObject)`

SetFunction sets Function field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


