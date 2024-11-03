package models

type MessageContentTextObjectText struct {

	// The data that makes up the text.
	Value string `json:"value"`

	Annotations []MessageContentTextObjectTextAnnotationsInner `json:"annotations"`
}
