/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * API version: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type ListFineTuningJobEventsResponse struct {

	Data []FineTuningJobEvent `json:"data"`

	Object string `json:"object"`
}

// AssertListFineTuningJobEventsResponseRequired checks if the required fields are not zero-ed
func AssertListFineTuningJobEventsResponseRequired(obj ListFineTuningJobEventsResponse) error {
	elements := map[string]interface{}{
		"data": obj.Data,
		"object": obj.Object,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	for _, el := range obj.Data {
		if err := AssertFineTuningJobEventRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertListFineTuningJobEventsResponseConstraints checks if the values respects the defined constraints
func AssertListFineTuningJobEventsResponseConstraints(obj ListFineTuningJobEventsResponse) error {
	return nil
}
