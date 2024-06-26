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




type CreateTranscription200Response struct {

	// The transcribed text.
	Text string `json:"text"`

	// The language of the input audio.
	Language string `json:"language"`

	// The duration of the input audio.
	Duration string `json:"duration"`

	// Extracted words and their corresponding timestamps.
	Words []TranscriptionWord `json:"words,omitempty"`

	// Segments of the transcribed text and their corresponding details.
	Segments []TranscriptionSegment `json:"segments,omitempty"`
}

// AssertCreateTranscription200ResponseRequired checks if the required fields are not zero-ed
func AssertCreateTranscription200ResponseRequired(obj CreateTranscription200Response) error {
	elements := map[string]interface{}{
		"text": obj.Text,
		"language": obj.Language,
		"duration": obj.Duration,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	for _, el := range obj.Words {
		if err := AssertTranscriptionWordRequired(el); err != nil {
			return err
		}
	}
	for _, el := range obj.Segments {
		if err := AssertTranscriptionSegmentRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertCreateTranscription200ResponseConstraints checks if the values respects the defined constraints
func AssertCreateTranscription200ResponseConstraints(obj CreateTranscription200Response) error {
	return nil
}
