# CreateModerationResponseResultsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Flagged** | **bool** |  | 
**Categories** | [**CreateModerationResponseResultsInnerCategories**](CreateModerationResponseResultsInnerCategories.md) |  | 
**CategoryScores** | [**CreateModerationResponseResultsInnerCategoryScores**](CreateModerationResponseResultsInnerCategoryScores.md) |  | 

## Methods

### NewCreateModerationResponseResultsInner

`func NewCreateModerationResponseResultsInner(flagged bool, categories CreateModerationResponseResultsInnerCategories, categoryScores CreateModerationResponseResultsInnerCategoryScores, ) *CreateModerationResponseResultsInner`

NewCreateModerationResponseResultsInner instantiates a new CreateModerationResponseResultsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateModerationResponseResultsInnerWithDefaults

`func NewCreateModerationResponseResultsInnerWithDefaults() *CreateModerationResponseResultsInner`

NewCreateModerationResponseResultsInnerWithDefaults instantiates a new CreateModerationResponseResultsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFlagged

`func (o *CreateModerationResponseResultsInner) GetFlagged() bool`

GetFlagged returns the Flagged field if non-nil, zero value otherwise.

### GetFlaggedOk

`func (o *CreateModerationResponseResultsInner) GetFlaggedOk() (*bool, bool)`

GetFlaggedOk returns a tuple with the Flagged field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFlagged

`func (o *CreateModerationResponseResultsInner) SetFlagged(v bool)`

SetFlagged sets Flagged field to given value.


### GetCategories

`func (o *CreateModerationResponseResultsInner) GetCategories() CreateModerationResponseResultsInnerCategories`

GetCategories returns the Categories field if non-nil, zero value otherwise.

### GetCategoriesOk

`func (o *CreateModerationResponseResultsInner) GetCategoriesOk() (*CreateModerationResponseResultsInnerCategories, bool)`

GetCategoriesOk returns a tuple with the Categories field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategories

`func (o *CreateModerationResponseResultsInner) SetCategories(v CreateModerationResponseResultsInnerCategories)`

SetCategories sets Categories field to given value.


### GetCategoryScores

`func (o *CreateModerationResponseResultsInner) GetCategoryScores() CreateModerationResponseResultsInnerCategoryScores`

GetCategoryScores returns the CategoryScores field if non-nil, zero value otherwise.

### GetCategoryScoresOk

`func (o *CreateModerationResponseResultsInner) GetCategoryScoresOk() (*CreateModerationResponseResultsInnerCategoryScores, bool)`

GetCategoryScoresOk returns a tuple with the CategoryScores field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategoryScores

`func (o *CreateModerationResponseResultsInner) SetCategoryScores(v CreateModerationResponseResultsInnerCategoryScores)`

SetCategoryScores sets CategoryScores field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


