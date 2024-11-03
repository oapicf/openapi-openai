package models

type MessageDeltaContentTextObjectText struct {

	// The data that makes up the text.
	Value string `json:"value,omitempty"`

	Annotations []MessageDeltaContentTextObjectTextAnnotationsInner `json:"annotations,omitempty"`
}
