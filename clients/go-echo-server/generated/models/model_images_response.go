package models

type ImagesResponse struct {

	Created int32 `json:"created"`

	Data []Image `json:"data"`
}
