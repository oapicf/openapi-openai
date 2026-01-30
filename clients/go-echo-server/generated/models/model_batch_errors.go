package models

type BatchErrors struct {

	// The object type, which is always `list`.
	Object string `json:"object,omitempty"`

	Data []BatchErrorsDataInner `json:"data,omitempty"`
}
