package models

type ArrayOfContentPartsInner struct {

	// Always `image_file`.
	Type string `json:"type"`

	ImageFile MessageContentImageFileObjectImageFile `json:"image_file"`

	ImageUrl MessageContentImageUrlObjectImageUrl `json:"image_url"`

	// Text content to be sent to the model
	Text string `json:"text"`
}
