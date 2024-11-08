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




type ListPaginatedFineTuningJobsResponse struct {

	Data []FineTuningJob `json:"data"`

	HasMore bool `json:"has_more"`

	Object string `json:"object"`
}

// AssertListPaginatedFineTuningJobsResponseRequired checks if the required fields are not zero-ed
func AssertListPaginatedFineTuningJobsResponseRequired(obj ListPaginatedFineTuningJobsResponse) error {
	elements := map[string]interface{}{
		"data": obj.Data,
		"has_more": obj.HasMore,
		"object": obj.Object,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	for _, el := range obj.Data {
		if err := AssertFineTuningJobRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertListPaginatedFineTuningJobsResponseConstraints checks if the values respects the defined constraints
func AssertListPaginatedFineTuningJobsResponseConstraints(obj ListPaginatedFineTuningJobsResponse) error {
	for _, el := range obj.Data {
		if err := AssertFineTuningJobConstraints(el); err != nil {
			return err
		}
	}
	return nil
}
