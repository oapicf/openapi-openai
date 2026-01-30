# CreateThreadRequestToolResources

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CodeInterpreter** | Pointer to [**CreateAssistantRequestToolResourcesCodeInterpreter**](CreateAssistantRequestToolResourcesCodeInterpreter.md) |  | [optional] 
**FileSearch** | Pointer to [**NullableCreateThreadRequestToolResourcesFileSearch**](CreateThreadRequestToolResourcesFileSearch.md) |  | [optional] 

## Methods

### NewCreateThreadRequestToolResources

`func NewCreateThreadRequestToolResources() *CreateThreadRequestToolResources`

NewCreateThreadRequestToolResources instantiates a new CreateThreadRequestToolResources object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateThreadRequestToolResourcesWithDefaults

`func NewCreateThreadRequestToolResourcesWithDefaults() *CreateThreadRequestToolResources`

NewCreateThreadRequestToolResourcesWithDefaults instantiates a new CreateThreadRequestToolResources object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCodeInterpreter

`func (o *CreateThreadRequestToolResources) GetCodeInterpreter() CreateAssistantRequestToolResourcesCodeInterpreter`

GetCodeInterpreter returns the CodeInterpreter field if non-nil, zero value otherwise.

### GetCodeInterpreterOk

`func (o *CreateThreadRequestToolResources) GetCodeInterpreterOk() (*CreateAssistantRequestToolResourcesCodeInterpreter, bool)`

GetCodeInterpreterOk returns a tuple with the CodeInterpreter field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCodeInterpreter

`func (o *CreateThreadRequestToolResources) SetCodeInterpreter(v CreateAssistantRequestToolResourcesCodeInterpreter)`

SetCodeInterpreter sets CodeInterpreter field to given value.

### HasCodeInterpreter

`func (o *CreateThreadRequestToolResources) HasCodeInterpreter() bool`

HasCodeInterpreter returns a boolean if a field has been set.

### GetFileSearch

`func (o *CreateThreadRequestToolResources) GetFileSearch() CreateThreadRequestToolResourcesFileSearch`

GetFileSearch returns the FileSearch field if non-nil, zero value otherwise.

### GetFileSearchOk

`func (o *CreateThreadRequestToolResources) GetFileSearchOk() (*CreateThreadRequestToolResourcesFileSearch, bool)`

GetFileSearchOk returns a tuple with the FileSearch field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFileSearch

`func (o *CreateThreadRequestToolResources) SetFileSearch(v CreateThreadRequestToolResourcesFileSearch)`

SetFileSearch sets FileSearch field to given value.

### HasFileSearch

`func (o *CreateThreadRequestToolResources) HasFileSearch() bool`

HasFileSearch returns a boolean if a field has been set.

### SetFileSearchNil

`func (o *CreateThreadRequestToolResources) SetFileSearchNil(b bool)`

 SetFileSearchNil sets the value for FileSearch to be an explicit nil

### UnsetFileSearch
`func (o *CreateThreadRequestToolResources) UnsetFileSearch()`

UnsetFileSearch ensures that no value is present for FileSearch, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


