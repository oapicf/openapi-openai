package models

type MessageDeltaObjectDeltaContentInner struct {

	// The index of the content part in the message.
	Index int32 `json:"index"`

	// Always `image_file`.
	Type string `json:"type"`

	ImageFile MessageDeltaContentImageFileObjectImageFile `json:"image_file,omitempty"`

	Text MessageDeltaContentTextObjectText `json:"text,omitempty"`
}
