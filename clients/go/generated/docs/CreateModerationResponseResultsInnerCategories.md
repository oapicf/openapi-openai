# CreateModerationResponseResultsInnerCategories

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Hate** | **bool** | Content that expresses, incites, or promotes hate based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. Hateful content aimed at non-protected groups (e.g., chess players) is harassment. | 
**HateThreatening** | **bool** | Hateful content that also includes violence or serious harm towards the targeted group based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. | 
**Harassment** | **bool** | Content that expresses, incites, or promotes harassing language towards any target. | 
**HarassmentThreatening** | **bool** | Harassment content that also includes violence or serious harm towards any target. | 
**SelfHarm** | **bool** | Content that promotes, encourages, or depicts acts of self-harm, such as suicide, cutting, and eating disorders. | 
**SelfHarmIntent** | **bool** | Content where the speaker expresses that they are engaging or intend to engage in acts of self-harm, such as suicide, cutting, and eating disorders. | 
**SelfHarmInstructions** | **bool** | Content that encourages performing acts of self-harm, such as suicide, cutting, and eating disorders, or that gives instructions or advice on how to commit such acts. | 
**Sexual** | **bool** | Content meant to arouse sexual excitement, such as the description of sexual activity, or that promotes sexual services (excluding sex education and wellness). | 
**SexualMinors** | **bool** | Sexual content that includes an individual who is under 18 years old. | 
**Violence** | **bool** | Content that depicts death, violence, or physical injury. | 
**ViolenceGraphic** | **bool** | Content that depicts death, violence, or physical injury in graphic detail. | 

## Methods

### NewCreateModerationResponseResultsInnerCategories

`func NewCreateModerationResponseResultsInnerCategories(hate bool, hateThreatening bool, harassment bool, harassmentThreatening bool, selfHarm bool, selfHarmIntent bool, selfHarmInstructions bool, sexual bool, sexualMinors bool, violence bool, violenceGraphic bool, ) *CreateModerationResponseResultsInnerCategories`

NewCreateModerationResponseResultsInnerCategories instantiates a new CreateModerationResponseResultsInnerCategories object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateModerationResponseResultsInnerCategoriesWithDefaults

`func NewCreateModerationResponseResultsInnerCategoriesWithDefaults() *CreateModerationResponseResultsInnerCategories`

NewCreateModerationResponseResultsInnerCategoriesWithDefaults instantiates a new CreateModerationResponseResultsInnerCategories object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetHate

`func (o *CreateModerationResponseResultsInnerCategories) GetHate() bool`

GetHate returns the Hate field if non-nil, zero value otherwise.

### GetHateOk

`func (o *CreateModerationResponseResultsInnerCategories) GetHateOk() (*bool, bool)`

GetHateOk returns a tuple with the Hate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHate

`func (o *CreateModerationResponseResultsInnerCategories) SetHate(v bool)`

SetHate sets Hate field to given value.


### GetHateThreatening

`func (o *CreateModerationResponseResultsInnerCategories) GetHateThreatening() bool`

GetHateThreatening returns the HateThreatening field if non-nil, zero value otherwise.

### GetHateThreateningOk

`func (o *CreateModerationResponseResultsInnerCategories) GetHateThreateningOk() (*bool, bool)`

GetHateThreateningOk returns a tuple with the HateThreatening field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHateThreatening

`func (o *CreateModerationResponseResultsInnerCategories) SetHateThreatening(v bool)`

SetHateThreatening sets HateThreatening field to given value.


### GetHarassment

`func (o *CreateModerationResponseResultsInnerCategories) GetHarassment() bool`

GetHarassment returns the Harassment field if non-nil, zero value otherwise.

### GetHarassmentOk

`func (o *CreateModerationResponseResultsInnerCategories) GetHarassmentOk() (*bool, bool)`

GetHarassmentOk returns a tuple with the Harassment field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHarassment

`func (o *CreateModerationResponseResultsInnerCategories) SetHarassment(v bool)`

SetHarassment sets Harassment field to given value.


### GetHarassmentThreatening

`func (o *CreateModerationResponseResultsInnerCategories) GetHarassmentThreatening() bool`

GetHarassmentThreatening returns the HarassmentThreatening field if non-nil, zero value otherwise.

### GetHarassmentThreateningOk

`func (o *CreateModerationResponseResultsInnerCategories) GetHarassmentThreateningOk() (*bool, bool)`

GetHarassmentThreateningOk returns a tuple with the HarassmentThreatening field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHarassmentThreatening

`func (o *CreateModerationResponseResultsInnerCategories) SetHarassmentThreatening(v bool)`

SetHarassmentThreatening sets HarassmentThreatening field to given value.


### GetSelfHarm

`func (o *CreateModerationResponseResultsInnerCategories) GetSelfHarm() bool`

GetSelfHarm returns the SelfHarm field if non-nil, zero value otherwise.

### GetSelfHarmOk

`func (o *CreateModerationResponseResultsInnerCategories) GetSelfHarmOk() (*bool, bool)`

GetSelfHarmOk returns a tuple with the SelfHarm field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSelfHarm

`func (o *CreateModerationResponseResultsInnerCategories) SetSelfHarm(v bool)`

SetSelfHarm sets SelfHarm field to given value.


### GetSelfHarmIntent

`func (o *CreateModerationResponseResultsInnerCategories) GetSelfHarmIntent() bool`

GetSelfHarmIntent returns the SelfHarmIntent field if non-nil, zero value otherwise.

### GetSelfHarmIntentOk

`func (o *CreateModerationResponseResultsInnerCategories) GetSelfHarmIntentOk() (*bool, bool)`

GetSelfHarmIntentOk returns a tuple with the SelfHarmIntent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSelfHarmIntent

`func (o *CreateModerationResponseResultsInnerCategories) SetSelfHarmIntent(v bool)`

SetSelfHarmIntent sets SelfHarmIntent field to given value.


### GetSelfHarmInstructions

`func (o *CreateModerationResponseResultsInnerCategories) GetSelfHarmInstructions() bool`

GetSelfHarmInstructions returns the SelfHarmInstructions field if non-nil, zero value otherwise.

### GetSelfHarmInstructionsOk

`func (o *CreateModerationResponseResultsInnerCategories) GetSelfHarmInstructionsOk() (*bool, bool)`

GetSelfHarmInstructionsOk returns a tuple with the SelfHarmInstructions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSelfHarmInstructions

`func (o *CreateModerationResponseResultsInnerCategories) SetSelfHarmInstructions(v bool)`

SetSelfHarmInstructions sets SelfHarmInstructions field to given value.


### GetSexual

`func (o *CreateModerationResponseResultsInnerCategories) GetSexual() bool`

GetSexual returns the Sexual field if non-nil, zero value otherwise.

### GetSexualOk

`func (o *CreateModerationResponseResultsInnerCategories) GetSexualOk() (*bool, bool)`

GetSexualOk returns a tuple with the Sexual field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSexual

`func (o *CreateModerationResponseResultsInnerCategories) SetSexual(v bool)`

SetSexual sets Sexual field to given value.


### GetSexualMinors

`func (o *CreateModerationResponseResultsInnerCategories) GetSexualMinors() bool`

GetSexualMinors returns the SexualMinors field if non-nil, zero value otherwise.

### GetSexualMinorsOk

`func (o *CreateModerationResponseResultsInnerCategories) GetSexualMinorsOk() (*bool, bool)`

GetSexualMinorsOk returns a tuple with the SexualMinors field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSexualMinors

`func (o *CreateModerationResponseResultsInnerCategories) SetSexualMinors(v bool)`

SetSexualMinors sets SexualMinors field to given value.


### GetViolence

`func (o *CreateModerationResponseResultsInnerCategories) GetViolence() bool`

GetViolence returns the Violence field if non-nil, zero value otherwise.

### GetViolenceOk

`func (o *CreateModerationResponseResultsInnerCategories) GetViolenceOk() (*bool, bool)`

GetViolenceOk returns a tuple with the Violence field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetViolence

`func (o *CreateModerationResponseResultsInnerCategories) SetViolence(v bool)`

SetViolence sets Violence field to given value.


### GetViolenceGraphic

`func (o *CreateModerationResponseResultsInnerCategories) GetViolenceGraphic() bool`

GetViolenceGraphic returns the ViolenceGraphic field if non-nil, zero value otherwise.

### GetViolenceGraphicOk

`func (o *CreateModerationResponseResultsInnerCategories) GetViolenceGraphicOk() (*bool, bool)`

GetViolenceGraphicOk returns a tuple with the ViolenceGraphic field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetViolenceGraphic

`func (o *CreateModerationResponseResultsInnerCategories) SetViolenceGraphic(v bool)`

SetViolenceGraphic sets ViolenceGraphic field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


