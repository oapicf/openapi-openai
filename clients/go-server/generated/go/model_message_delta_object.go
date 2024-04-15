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




// MessageDeltaObject - Represents a message delta i.e. any changed fields on a message during streaming. 
type MessageDeltaObject struct {

	// The identifier of the message, which can be referenced in API endpoints.
	Id string `json:"id"`

	// The object type, which is always `thread.message.delta`.
	Object string `json:"object"`

	Delta MessageDeltaObjectDelta `json:"delta"`
}

// AssertMessageDeltaObjectRequired checks if the required fields are not zero-ed
func AssertMessageDeltaObjectRequired(obj MessageDeltaObject) error {
	elements := map[string]interface{}{
		"id": obj.Id,
		"object": obj.Object,
		"delta": obj.Delta,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertMessageDeltaObjectDeltaRequired(obj.Delta); err != nil {
		return err
	}
	return nil
}

// AssertMessageDeltaObjectConstraints checks if the values respects the defined constraints
func AssertMessageDeltaObjectConstraints(obj MessageDeltaObject) error {
	return nil
}