/*
 * OpenAI API
 *
 * APIs for sampling from and fine-tuning language models
 *
 * API version: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type ImagesResponse struct {

	Created int32 `json:"created"`

	Data []ImagesResponseDataInner `json:"data"`
}

// AssertImagesResponseRequired checks if the required fields are not zero-ed
func AssertImagesResponseRequired(obj ImagesResponse) error {
	elements := map[string]interface{}{
		"created": obj.Created,
		"data": obj.Data,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	for _, el := range obj.Data {
		if err := AssertImagesResponseDataInnerRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertImagesResponseConstraints checks if the values respects the defined constraints
func AssertImagesResponseConstraints(obj ImagesResponse) error {
	return nil
}
