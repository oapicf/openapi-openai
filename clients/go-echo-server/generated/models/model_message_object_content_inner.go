package models

import (
	"gopkg.in/validator.v2"
)

type MessageObjectContentInner struct {

	// Always `image_file`.
	Type string `json:"type"`

	ImageFile MessageContentImageFileObjectImageFile `json:"image_file"`

	Text MessageContentTextObjectText `json:"text"`
}
