# AssistantToolsFileSearch

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | The type of tool being defined: &#x60;file_search&#x60; | 
**FileSearch** | Pointer to [**AssistantToolsFileSearchFileSearch**](AssistantToolsFileSearchFileSearch.md) |  | [optional] 

## Methods

### NewAssistantToolsFileSearch

`func NewAssistantToolsFileSearch(type_ string, ) *AssistantToolsFileSearch`

NewAssistantToolsFileSearch instantiates a new AssistantToolsFileSearch object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAssistantToolsFileSearchWithDefaults

`func NewAssistantToolsFileSearchWithDefaults() *AssistantToolsFileSearch`

NewAssistantToolsFileSearchWithDefaults instantiates a new AssistantToolsFileSearch object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *AssistantToolsFileSearch) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *AssistantToolsFileSearch) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *AssistantToolsFileSearch) SetType(v string)`

SetType sets Type field to given value.


### GetFileSearch

`func (o *AssistantToolsFileSearch) GetFileSearch() AssistantToolsFileSearchFileSearch`

GetFileSearch returns the FileSearch field if non-nil, zero value otherwise.

### GetFileSearchOk

`func (o *AssistantToolsFileSearch) GetFileSearchOk() (*AssistantToolsFileSearchFileSearch, bool)`

GetFileSearchOk returns a tuple with the FileSearch field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFileSearch

`func (o *AssistantToolsFileSearch) SetFileSearch(v AssistantToolsFileSearchFileSearch)`

SetFileSearch sets FileSearch field to given value.

### HasFileSearch

`func (o *AssistantToolsFileSearch) HasFileSearch() bool`

HasFileSearch returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


