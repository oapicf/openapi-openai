# AssistantToolsFileSearchFileSearch

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MaxNumResults** | Pointer to **int32** | The maximum number of results the file search tool should output. The default is 20 for &#x60;gpt-4*&#x60; models and 5 for &#x60;gpt-3.5-turbo&#x60;. This number should be between 1 and 50 inclusive.  Note that the file search tool may output fewer than &#x60;max_num_results&#x60; results. See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | [optional] 
**RankingOptions** | Pointer to [**FileSearchRankingOptions**](FileSearchRankingOptions.md) |  | [optional] 

## Methods

### NewAssistantToolsFileSearchFileSearch

`func NewAssistantToolsFileSearchFileSearch() *AssistantToolsFileSearchFileSearch`

NewAssistantToolsFileSearchFileSearch instantiates a new AssistantToolsFileSearchFileSearch object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAssistantToolsFileSearchFileSearchWithDefaults

`func NewAssistantToolsFileSearchFileSearchWithDefaults() *AssistantToolsFileSearchFileSearch`

NewAssistantToolsFileSearchFileSearchWithDefaults instantiates a new AssistantToolsFileSearchFileSearch object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMaxNumResults

`func (o *AssistantToolsFileSearchFileSearch) GetMaxNumResults() int32`

GetMaxNumResults returns the MaxNumResults field if non-nil, zero value otherwise.

### GetMaxNumResultsOk

`func (o *AssistantToolsFileSearchFileSearch) GetMaxNumResultsOk() (*int32, bool)`

GetMaxNumResultsOk returns a tuple with the MaxNumResults field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxNumResults

`func (o *AssistantToolsFileSearchFileSearch) SetMaxNumResults(v int32)`

SetMaxNumResults sets MaxNumResults field to given value.

### HasMaxNumResults

`func (o *AssistantToolsFileSearchFileSearch) HasMaxNumResults() bool`

HasMaxNumResults returns a boolean if a field has been set.

### GetRankingOptions

`func (o *AssistantToolsFileSearchFileSearch) GetRankingOptions() FileSearchRankingOptions`

GetRankingOptions returns the RankingOptions field if non-nil, zero value otherwise.

### GetRankingOptionsOk

`func (o *AssistantToolsFileSearchFileSearch) GetRankingOptionsOk() (*FileSearchRankingOptions, bool)`

GetRankingOptionsOk returns a tuple with the RankingOptions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRankingOptions

`func (o *AssistantToolsFileSearchFileSearch) SetRankingOptions(v FileSearchRankingOptions)`

SetRankingOptions sets RankingOptions field to given value.

### HasRankingOptions

`func (o *AssistantToolsFileSearchFileSearch) HasRankingOptions() bool`

HasRankingOptions returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


