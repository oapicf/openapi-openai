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

// checks if the ListMessageFilesResponse type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ListMessageFilesResponse{}

// ListMessageFilesResponse struct for ListMessageFilesResponse
type ListMessageFilesResponse struct {
	Object string `json:"object"`
	Data []MessageFileObject `json:"data"`
	FirstId string `json:"first_id"`
	LastId string `json:"last_id"`
	HasMore bool `json:"has_more"`
}

type _ListMessageFilesResponse ListMessageFilesResponse

// NewListMessageFilesResponse instantiates a new ListMessageFilesResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewListMessageFilesResponse(object string, data []MessageFileObject, firstId string, lastId string, hasMore bool) *ListMessageFilesResponse {
	this := ListMessageFilesResponse{}
	this.Object = object
	this.Data = data
	this.FirstId = firstId
	this.LastId = lastId
	this.HasMore = hasMore
	return &this
}

// NewListMessageFilesResponseWithDefaults instantiates a new ListMessageFilesResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewListMessageFilesResponseWithDefaults() *ListMessageFilesResponse {
	this := ListMessageFilesResponse{}
	return &this
}

// GetObject returns the Object field value
func (o *ListMessageFilesResponse) GetObject() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Object
}

// GetObjectOk returns a tuple with the Object field value
// and a boolean to check if the value has been set.
func (o *ListMessageFilesResponse) GetObjectOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Object, true
}

// SetObject sets field value
func (o *ListMessageFilesResponse) SetObject(v string) {
	o.Object = v
}

// GetData returns the Data field value
func (o *ListMessageFilesResponse) GetData() []MessageFileObject {
	if o == nil {
		var ret []MessageFileObject
		return ret
	}

	return o.Data
}

// GetDataOk returns a tuple with the Data field value
// and a boolean to check if the value has been set.
func (o *ListMessageFilesResponse) GetDataOk() ([]MessageFileObject, bool) {
	if o == nil {
		return nil, false
	}
	return o.Data, true
}

// SetData sets field value
func (o *ListMessageFilesResponse) SetData(v []MessageFileObject) {
	o.Data = v
}

// GetFirstId returns the FirstId field value
func (o *ListMessageFilesResponse) GetFirstId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.FirstId
}

// GetFirstIdOk returns a tuple with the FirstId field value
// and a boolean to check if the value has been set.
func (o *ListMessageFilesResponse) GetFirstIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.FirstId, true
}

// SetFirstId sets field value
func (o *ListMessageFilesResponse) SetFirstId(v string) {
	o.FirstId = v
}

// GetLastId returns the LastId field value
func (o *ListMessageFilesResponse) GetLastId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.LastId
}

// GetLastIdOk returns a tuple with the LastId field value
// and a boolean to check if the value has been set.
func (o *ListMessageFilesResponse) GetLastIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.LastId, true
}

// SetLastId sets field value
func (o *ListMessageFilesResponse) SetLastId(v string) {
	o.LastId = v
}

// GetHasMore returns the HasMore field value
func (o *ListMessageFilesResponse) GetHasMore() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.HasMore
}

// GetHasMoreOk returns a tuple with the HasMore field value
// and a boolean to check if the value has been set.
func (o *ListMessageFilesResponse) GetHasMoreOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.HasMore, true
}

// SetHasMore sets field value
func (o *ListMessageFilesResponse) SetHasMore(v bool) {
	o.HasMore = v
}

func (o ListMessageFilesResponse) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ListMessageFilesResponse) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["object"] = o.Object
	toSerialize["data"] = o.Data
	toSerialize["first_id"] = o.FirstId
	toSerialize["last_id"] = o.LastId
	toSerialize["has_more"] = o.HasMore
	return toSerialize, nil
}

func (o *ListMessageFilesResponse) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"object",
		"data",
		"first_id",
		"last_id",
		"has_more",
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

	varListMessageFilesResponse := _ListMessageFilesResponse{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varListMessageFilesResponse)

	if err != nil {
		return err
	}

	*o = ListMessageFilesResponse(varListMessageFilesResponse)

	return err
}

type NullableListMessageFilesResponse struct {
	value *ListMessageFilesResponse
	isSet bool
}

func (v NullableListMessageFilesResponse) Get() *ListMessageFilesResponse {
	return v.value
}

func (v *NullableListMessageFilesResponse) Set(val *ListMessageFilesResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableListMessageFilesResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableListMessageFilesResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableListMessageFilesResponse(val *ListMessageFilesResponse) *NullableListMessageFilesResponse {
	return &NullableListMessageFilesResponse{value: val, isSet: true}
}

func (v NullableListMessageFilesResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableListMessageFilesResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


