# AssistantObjectToolsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | The type of tool being defined: &#x60;code_interpreter&#x60; | 
**FileSearch** | Pointer to [**AssistantToolsFileSearchFileSearch**](AssistantToolsFileSearchFileSearch.md) |  | [optional] 
**Function** | [**FunctionObject**](FunctionObject.md) |  | 

## Methods

### NewAssistantObjectToolsInner

`func NewAssistantObjectToolsInner(type_ string, function FunctionObject, ) *AssistantObjectToolsInner`

NewAssistantObjectToolsInner instantiates a new AssistantObjectToolsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAssistantObjectToolsInnerWithDefaults

`func NewAssistantObjectToolsInnerWithDefaults() *AssistantObjectToolsInner`

NewAssistantObjectToolsInnerWithDefaults instantiates a new AssistantObjectToolsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *AssistantObjectToolsInner) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *AssistantObjectToolsInner) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *AssistantObjectToolsInner) SetType(v string)`

SetType sets Type field to given value.


### GetFileSearch

`func (o *AssistantObjectToolsInner) GetFileSearch() AssistantToolsFileSearchFileSearch`

GetFileSearch returns the FileSearch field if non-nil, zero value otherwise.

### GetFileSearchOk

`func (o *AssistantObjectToolsInner) GetFileSearchOk() (*AssistantToolsFileSearchFileSearch, bool)`

GetFileSearchOk returns a tuple with the FileSearch field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFileSearch

`func (o *AssistantObjectToolsInner) SetFileSearch(v AssistantToolsFileSearchFileSearch)`

SetFileSearch sets FileSearch field to given value.

### HasFileSearch

`func (o *AssistantObjectToolsInner) HasFileSearch() bool`

HasFileSearch returns a boolean if a field has been set.

### GetFunction

`func (o *AssistantObjectToolsInner) GetFunction() FunctionObject`

GetFunction returns the Function field if non-nil, zero value otherwise.

### GetFunctionOk

`func (o *AssistantObjectToolsInner) GetFunctionOk() (*FunctionObject, bool)`

GetFunctionOk returns a tuple with the Function field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFunction

`func (o *AssistantObjectToolsInner) SetFunction(v FunctionObject)`

SetFunction sets Function field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


