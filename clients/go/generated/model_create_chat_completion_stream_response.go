/*
OpenAI API

APIs for sampling from and fine-tuning language models

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

// checks if the CreateChatCompletionStreamResponse type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CreateChatCompletionStreamResponse{}

// CreateChatCompletionStreamResponse struct for CreateChatCompletionStreamResponse
type CreateChatCompletionStreamResponse struct {
	Id string `json:"id"`
	Object string `json:"object"`
	Created int32 `json:"created"`
	Model string `json:"model"`
	Choices []CreateChatCompletionStreamResponseChoicesInner `json:"choices"`
}

type _CreateChatCompletionStreamResponse CreateChatCompletionStreamResponse

// NewCreateChatCompletionStreamResponse instantiates a new CreateChatCompletionStreamResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCreateChatCompletionStreamResponse(id string, object string, created int32, model string, choices []CreateChatCompletionStreamResponseChoicesInner) *CreateChatCompletionStreamResponse {
	this := CreateChatCompletionStreamResponse{}
	this.Id = id
	this.Object = object
	this.Created = created
	this.Model = model
	this.Choices = choices
	return &this
}

// NewCreateChatCompletionStreamResponseWithDefaults instantiates a new CreateChatCompletionStreamResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCreateChatCompletionStreamResponseWithDefaults() *CreateChatCompletionStreamResponse {
	this := CreateChatCompletionStreamResponse{}
	return &this
}

// GetId returns the Id field value
func (o *CreateChatCompletionStreamResponse) GetId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *CreateChatCompletionStreamResponse) GetIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *CreateChatCompletionStreamResponse) SetId(v string) {
	o.Id = v
}

// GetObject returns the Object field value
func (o *CreateChatCompletionStreamResponse) GetObject() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Object
}

// GetObjectOk returns a tuple with the Object field value
// and a boolean to check if the value has been set.
func (o *CreateChatCompletionStreamResponse) GetObjectOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Object, true
}

// SetObject sets field value
func (o *CreateChatCompletionStreamResponse) SetObject(v string) {
	o.Object = v
}

// GetCreated returns the Created field value
func (o *CreateChatCompletionStreamResponse) GetCreated() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Created
}

// GetCreatedOk returns a tuple with the Created field value
// and a boolean to check if the value has been set.
func (o *CreateChatCompletionStreamResponse) GetCreatedOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Created, true
}

// SetCreated sets field value
func (o *CreateChatCompletionStreamResponse) SetCreated(v int32) {
	o.Created = v
}

// GetModel returns the Model field value
func (o *CreateChatCompletionStreamResponse) GetModel() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Model
}

// GetModelOk returns a tuple with the Model field value
// and a boolean to check if the value has been set.
func (o *CreateChatCompletionStreamResponse) GetModelOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Model, true
}

// SetModel sets field value
func (o *CreateChatCompletionStreamResponse) SetModel(v string) {
	o.Model = v
}

// GetChoices returns the Choices field value
func (o *CreateChatCompletionStreamResponse) GetChoices() []CreateChatCompletionStreamResponseChoicesInner {
	if o == nil {
		var ret []CreateChatCompletionStreamResponseChoicesInner
		return ret
	}

	return o.Choices
}

// GetChoicesOk returns a tuple with the Choices field value
// and a boolean to check if the value has been set.
func (o *CreateChatCompletionStreamResponse) GetChoicesOk() ([]CreateChatCompletionStreamResponseChoicesInner, bool) {
	if o == nil {
		return nil, false
	}
	return o.Choices, true
}

// SetChoices sets field value
func (o *CreateChatCompletionStreamResponse) SetChoices(v []CreateChatCompletionStreamResponseChoicesInner) {
	o.Choices = v
}

func (o CreateChatCompletionStreamResponse) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CreateChatCompletionStreamResponse) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["id"] = o.Id
	toSerialize["object"] = o.Object
	toSerialize["created"] = o.Created
	toSerialize["model"] = o.Model
	toSerialize["choices"] = o.Choices
	return toSerialize, nil
}

func (o *CreateChatCompletionStreamResponse) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"id",
		"object",
		"created",
		"model",
		"choices",
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

	varCreateChatCompletionStreamResponse := _CreateChatCompletionStreamResponse{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCreateChatCompletionStreamResponse)

	if err != nil {
		return err
	}

	*o = CreateChatCompletionStreamResponse(varCreateChatCompletionStreamResponse)

	return err
}

type NullableCreateChatCompletionStreamResponse struct {
	value *CreateChatCompletionStreamResponse
	isSet bool
}

func (v NullableCreateChatCompletionStreamResponse) Get() *CreateChatCompletionStreamResponse {
	return v.value
}

func (v *NullableCreateChatCompletionStreamResponse) Set(val *CreateChatCompletionStreamResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableCreateChatCompletionStreamResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableCreateChatCompletionStreamResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCreateChatCompletionStreamResponse(val *CreateChatCompletionStreamResponse) *NullableCreateChatCompletionStreamResponse {
	return &NullableCreateChatCompletionStreamResponse{value: val, isSet: true}
}

func (v NullableCreateChatCompletionStreamResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCreateChatCompletionStreamResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

