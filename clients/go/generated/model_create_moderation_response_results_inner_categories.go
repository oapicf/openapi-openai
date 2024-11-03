/*
OpenAI API

The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

API version: 2.0.0
Contact: blah+oapicf@cliffano.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
	"bytes"
	"fmt"
)

// checks if the CreateModerationResponseResultsInnerCategories type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CreateModerationResponseResultsInnerCategories{}

// CreateModerationResponseResultsInnerCategories A list of the categories, and whether they are flagged or not.
type CreateModerationResponseResultsInnerCategories struct {
	// Content that expresses, incites, or promotes hate based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. Hateful content aimed at non-protected groups (e.g., chess players) is harassment.
	Hate bool `json:"hate"`
	// Hateful content that also includes violence or serious harm towards the targeted group based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste.
	HateThreatening bool `json:"hate/threatening"`
	// Content that expresses, incites, or promotes harassing language towards any target.
	Harassment bool `json:"harassment"`
	// Harassment content that also includes violence or serious harm towards any target.
	HarassmentThreatening bool `json:"harassment/threatening"`
	// Content that promotes, encourages, or depicts acts of self-harm, such as suicide, cutting, and eating disorders.
	SelfHarm bool `json:"self-harm"`
	// Content where the speaker expresses that they are engaging or intend to engage in acts of self-harm, such as suicide, cutting, and eating disorders.
	SelfHarmIntent bool `json:"self-harm/intent"`
	// Content that encourages performing acts of self-harm, such as suicide, cutting, and eating disorders, or that gives instructions or advice on how to commit such acts.
	SelfHarmInstructions bool `json:"self-harm/instructions"`
	// Content meant to arouse sexual excitement, such as the description of sexual activity, or that promotes sexual services (excluding sex education and wellness).
	Sexual bool `json:"sexual"`
	// Sexual content that includes an individual who is under 18 years old.
	SexualMinors bool `json:"sexual/minors"`
	// Content that depicts death, violence, or physical injury.
	Violence bool `json:"violence"`
	// Content that depicts death, violence, or physical injury in graphic detail.
	ViolenceGraphic bool `json:"violence/graphic"`
}

type _CreateModerationResponseResultsInnerCategories CreateModerationResponseResultsInnerCategories

// NewCreateModerationResponseResultsInnerCategories instantiates a new CreateModerationResponseResultsInnerCategories object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCreateModerationResponseResultsInnerCategories(hate bool, hateThreatening bool, harassment bool, harassmentThreatening bool, selfHarm bool, selfHarmIntent bool, selfHarmInstructions bool, sexual bool, sexualMinors bool, violence bool, violenceGraphic bool) *CreateModerationResponseResultsInnerCategories {
	this := CreateModerationResponseResultsInnerCategories{}
	this.Hate = hate
	this.HateThreatening = hateThreatening
	this.Harassment = harassment
	this.HarassmentThreatening = harassmentThreatening
	this.SelfHarm = selfHarm
	this.SelfHarmIntent = selfHarmIntent
	this.SelfHarmInstructions = selfHarmInstructions
	this.Sexual = sexual
	this.SexualMinors = sexualMinors
	this.Violence = violence
	this.ViolenceGraphic = violenceGraphic
	return &this
}

// NewCreateModerationResponseResultsInnerCategoriesWithDefaults instantiates a new CreateModerationResponseResultsInnerCategories object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCreateModerationResponseResultsInnerCategoriesWithDefaults() *CreateModerationResponseResultsInnerCategories {
	this := CreateModerationResponseResultsInnerCategories{}
	return &this
}

// GetHate returns the Hate field value
func (o *CreateModerationResponseResultsInnerCategories) GetHate() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Hate
}

// GetHateOk returns a tuple with the Hate field value
// and a boolean to check if the value has been set.
func (o *CreateModerationResponseResultsInnerCategories) GetHateOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Hate, true
}

// SetHate sets field value
func (o *CreateModerationResponseResultsInnerCategories) SetHate(v bool) {
	o.Hate = v
}

// GetHateThreatening returns the HateThreatening field value
func (o *CreateModerationResponseResultsInnerCategories) GetHateThreatening() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.HateThreatening
}

// GetHateThreateningOk returns a tuple with the HateThreatening field value
// and a boolean to check if the value has been set.
func (o *CreateModerationResponseResultsInnerCategories) GetHateThreateningOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.HateThreatening, true
}

// SetHateThreatening sets field value
func (o *CreateModerationResponseResultsInnerCategories) SetHateThreatening(v bool) {
	o.HateThreatening = v
}

// GetHarassment returns the Harassment field value
func (o *CreateModerationResponseResultsInnerCategories) GetHarassment() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Harassment
}

// GetHarassmentOk returns a tuple with the Harassment field value
// and a boolean to check if the value has been set.
func (o *CreateModerationResponseResultsInnerCategories) GetHarassmentOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Harassment, true
}

// SetHarassment sets field value
func (o *CreateModerationResponseResultsInnerCategories) SetHarassment(v bool) {
	o.Harassment = v
}

// GetHarassmentThreatening returns the HarassmentThreatening field value
func (o *CreateModerationResponseResultsInnerCategories) GetHarassmentThreatening() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.HarassmentThreatening
}

// GetHarassmentThreateningOk returns a tuple with the HarassmentThreatening field value
// and a boolean to check if the value has been set.
func (o *CreateModerationResponseResultsInnerCategories) GetHarassmentThreateningOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.HarassmentThreatening, true
}

// SetHarassmentThreatening sets field value
func (o *CreateModerationResponseResultsInnerCategories) SetHarassmentThreatening(v bool) {
	o.HarassmentThreatening = v
}

// GetSelfHarm returns the SelfHarm field value
func (o *CreateModerationResponseResultsInnerCategories) GetSelfHarm() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.SelfHarm
}

// GetSelfHarmOk returns a tuple with the SelfHarm field value
// and a boolean to check if the value has been set.
func (o *CreateModerationResponseResultsInnerCategories) GetSelfHarmOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.SelfHarm, true
}

// SetSelfHarm sets field value
func (o *CreateModerationResponseResultsInnerCategories) SetSelfHarm(v bool) {
	o.SelfHarm = v
}

// GetSelfHarmIntent returns the SelfHarmIntent field value
func (o *CreateModerationResponseResultsInnerCategories) GetSelfHarmIntent() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.SelfHarmIntent
}

// GetSelfHarmIntentOk returns a tuple with the SelfHarmIntent field value
// and a boolean to check if the value has been set.
func (o *CreateModerationResponseResultsInnerCategories) GetSelfHarmIntentOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.SelfHarmIntent, true
}

// SetSelfHarmIntent sets field value
func (o *CreateModerationResponseResultsInnerCategories) SetSelfHarmIntent(v bool) {
	o.SelfHarmIntent = v
}

// GetSelfHarmInstructions returns the SelfHarmInstructions field value
func (o *CreateModerationResponseResultsInnerCategories) GetSelfHarmInstructions() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.SelfHarmInstructions
}

// GetSelfHarmInstructionsOk returns a tuple with the SelfHarmInstructions field value
// and a boolean to check if the value has been set.
func (o *CreateModerationResponseResultsInnerCategories) GetSelfHarmInstructionsOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.SelfHarmInstructions, true
}

// SetSelfHarmInstructions sets field value
func (o *CreateModerationResponseResultsInnerCategories) SetSelfHarmInstructions(v bool) {
	o.SelfHarmInstructions = v
}

// GetSexual returns the Sexual field value
func (o *CreateModerationResponseResultsInnerCategories) GetSexual() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Sexual
}

// GetSexualOk returns a tuple with the Sexual field value
// and a boolean to check if the value has been set.
func (o *CreateModerationResponseResultsInnerCategories) GetSexualOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Sexual, true
}

// SetSexual sets field value
func (o *CreateModerationResponseResultsInnerCategories) SetSexual(v bool) {
	o.Sexual = v
}

// GetSexualMinors returns the SexualMinors field value
func (o *CreateModerationResponseResultsInnerCategories) GetSexualMinors() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.SexualMinors
}

// GetSexualMinorsOk returns a tuple with the SexualMinors field value
// and a boolean to check if the value has been set.
func (o *CreateModerationResponseResultsInnerCategories) GetSexualMinorsOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.SexualMinors, true
}

// SetSexualMinors sets field value
func (o *CreateModerationResponseResultsInnerCategories) SetSexualMinors(v bool) {
	o.SexualMinors = v
}

// GetViolence returns the Violence field value
func (o *CreateModerationResponseResultsInnerCategories) GetViolence() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Violence
}

// GetViolenceOk returns a tuple with the Violence field value
// and a boolean to check if the value has been set.
func (o *CreateModerationResponseResultsInnerCategories) GetViolenceOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Violence, true
}

// SetViolence sets field value
func (o *CreateModerationResponseResultsInnerCategories) SetViolence(v bool) {
	o.Violence = v
}

// GetViolenceGraphic returns the ViolenceGraphic field value
func (o *CreateModerationResponseResultsInnerCategories) GetViolenceGraphic() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.ViolenceGraphic
}

// GetViolenceGraphicOk returns a tuple with the ViolenceGraphic field value
// and a boolean to check if the value has been set.
func (o *CreateModerationResponseResultsInnerCategories) GetViolenceGraphicOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.ViolenceGraphic, true
}

// SetViolenceGraphic sets field value
func (o *CreateModerationResponseResultsInnerCategories) SetViolenceGraphic(v bool) {
	o.ViolenceGraphic = v
}

func (o CreateModerationResponseResultsInnerCategories) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CreateModerationResponseResultsInnerCategories) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["hate"] = o.Hate
	toSerialize["hate/threatening"] = o.HateThreatening
	toSerialize["harassment"] = o.Harassment
	toSerialize["harassment/threatening"] = o.HarassmentThreatening
	toSerialize["self-harm"] = o.SelfHarm
	toSerialize["self-harm/intent"] = o.SelfHarmIntent
	toSerialize["self-harm/instructions"] = o.SelfHarmInstructions
	toSerialize["sexual"] = o.Sexual
	toSerialize["sexual/minors"] = o.SexualMinors
	toSerialize["violence"] = o.Violence
	toSerialize["violence/graphic"] = o.ViolenceGraphic
	return toSerialize, nil
}

func (o *CreateModerationResponseResultsInnerCategories) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"hate",
		"hate/threatening",
		"harassment",
		"harassment/threatening",
		"self-harm",
		"self-harm/intent",
		"self-harm/instructions",
		"sexual",
		"sexual/minors",
		"violence",
		"violence/graphic",
	}

	allProperties := make(map[string]interface{})

	err = json.Unmarshal(data, &allProperties)

	if err != nil {
		return err;
	}

	for _, requiredProperty := range(requiredProperties) {
		if _, exists := allProperties[requiredProperty]; !exists {
			return fmt.Errorf("no value given for required property %v", requiredProperty)
		}
	}

	varCreateModerationResponseResultsInnerCategories := _CreateModerationResponseResultsInnerCategories{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCreateModerationResponseResultsInnerCategories)

	if err != nil {
		return err
	}

	*o = CreateModerationResponseResultsInnerCategories(varCreateModerationResponseResultsInnerCategories)

	return err
}

type NullableCreateModerationResponseResultsInnerCategories struct {
	value *CreateModerationResponseResultsInnerCategories
	isSet bool
}

func (v NullableCreateModerationResponseResultsInnerCategories) Get() *CreateModerationResponseResultsInnerCategories {
	return v.value
}

func (v *NullableCreateModerationResponseResultsInnerCategories) Set(val *CreateModerationResponseResultsInnerCategories) {
	v.value = val
	v.isSet = true
}

func (v NullableCreateModerationResponseResultsInnerCategories) IsSet() bool {
	return v.isSet
}

func (v *NullableCreateModerationResponseResultsInnerCategories) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCreateModerationResponseResultsInnerCategories(val *CreateModerationResponseResultsInnerCategories) *NullableCreateModerationResponseResultsInnerCategories {
	return &NullableCreateModerationResponseResultsInnerCategories{value: val, isSet: true}
}

func (v NullableCreateModerationResponseResultsInnerCategories) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCreateModerationResponseResultsInnerCategories) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


