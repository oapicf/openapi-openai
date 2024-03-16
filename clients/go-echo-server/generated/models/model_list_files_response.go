package models

type ListFilesResponse struct {

	Object string `json:"object"`

	Data []OpenAiFile `json:"data"`
}
