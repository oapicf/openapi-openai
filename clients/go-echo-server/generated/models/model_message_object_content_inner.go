package models

type MessageObjectContentInner struct {

	// Always `image_file`.
	Type string `json:"type"`

	ImageFile MessageContentImageFileObjectImageFile `json:"image_file"`

	Text MessageContentTextObjectText `json:"text"`
}
