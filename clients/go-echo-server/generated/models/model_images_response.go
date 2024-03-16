package models

type ImagesResponse struct {

	Created int32 `json:"created"`

	Data []ImagesResponseDataInner `json:"data"`
}
