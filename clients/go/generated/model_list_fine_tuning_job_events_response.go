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

// checks if the ListFineTuningJobEventsResponse type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ListFineTuningJobEventsResponse{}

// ListFineTuningJobEventsResponse struct for ListFineTuningJobEventsResponse
type ListFineTuningJobEventsResponse struct {
	Data []FineTuningJobEvent `json:"data"`
	Object string `json:"object"`
}

type _ListFineTuningJobEventsResponse ListFineTuningJobEventsResponse

// NewListFineTuningJobEventsResponse instantiates a new ListFineTuningJobEventsResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewListFineTuningJobEventsResponse(data []FineTuningJobEvent, object string) *ListFineTuningJobEventsResponse {
	this := ListFineTuningJobEventsResponse{}
	this.Data = data
	this.Object = object
	return &this
}

// NewListFineTuningJobEventsResponseWithDefaults instantiates a new ListFineTuningJobEventsResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewListFineTuningJobEventsResponseWithDefaults() *ListFineTuningJobEventsResponse {
	this := ListFineTuningJobEventsResponse{}
	return &this
}

// GetData returns the Data field value
func (o *ListFineTuningJobEventsResponse) GetData() []FineTuningJobEvent {
	if o == nil {
		var ret []FineTuningJobEvent
		return ret
	}

	return o.Data
}

// GetDataOk returns a tuple with the Data field value
// and a boolean to check if the value has been set.
func (o *ListFineTuningJobEventsResponse) GetDataOk() ([]FineTuningJobEvent, bool) {
	if o == nil {
		return nil, false
	}
	return o.Data, true
}

// SetData sets field value
func (o *ListFineTuningJobEventsResponse) SetData(v []FineTuningJobEvent) {
	o.Data = v
}

// GetObject returns the Object field value
func (o *ListFineTuningJobEventsResponse) GetObject() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Object
}

// GetObjectOk returns a tuple with the Object field value
// and a boolean to check if the value has been set.
func (o *ListFineTuningJobEventsResponse) GetObjectOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Object, true
}

// SetObject sets field value
func (o *ListFineTuningJobEventsResponse) SetObject(v string) {
	o.Object = v
}

func (o ListFineTuningJobEventsResponse) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ListFineTuningJobEventsResponse) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["data"] = o.Data
	toSerialize["object"] = o.Object
	return toSerialize, nil
}

func (o *ListFineTuningJobEventsResponse) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"data",
		"object",
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

	varListFineTuningJobEventsResponse := _ListFineTuningJobEventsResponse{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varListFineTuningJobEventsResponse)

	if err != nil {
		return err
	}

	*o = ListFineTuningJobEventsResponse(varListFineTuningJobEventsResponse)

	return err
}

type NullableListFineTuningJobEventsResponse struct {
	value *ListFineTuningJobEventsResponse
	isSet bool
}

func (v NullableListFineTuningJobEventsResponse) Get() *ListFineTuningJobEventsResponse {
	return v.value
}

func (v *NullableListFineTuningJobEventsResponse) Set(val *ListFineTuningJobEventsResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableListFineTuningJobEventsResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableListFineTuningJobEventsResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableListFineTuningJobEventsResponse(val *ListFineTuningJobEventsResponse) *NullableListFineTuningJobEventsResponse {
	return &NullableListFineTuningJobEventsResponse{value: val, isSet: true}
}

func (v NullableListFineTuningJobEventsResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableListFineTuningJobEventsResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


