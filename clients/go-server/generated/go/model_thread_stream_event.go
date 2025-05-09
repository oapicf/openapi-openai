// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * API version: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 */

package openapi


import (
	"gopkg.in/validator.v2"
)



type ThreadStreamEvent struct {

	Event string `json:"event"`

	Data ThreadObject `json:"data"`
}

// AssertThreadStreamEventRequired checks if the required fields are not zero-ed
func AssertThreadStreamEventRequired(obj ThreadStreamEvent) error {
	elements := map[string]interface{}{
		"event": obj.Event,
		"data": obj.Data,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertThreadObjectRequired(obj.Data); err != nil {
		return err
	}
	return nil
}

// AssertThreadStreamEventConstraints checks if the values respects the defined constraints
func AssertThreadStreamEventConstraints(obj ThreadStreamEvent) error {
	if err := AssertThreadObjectConstraints(obj.Data); err != nil {
		return err
	}
	return nil
}
