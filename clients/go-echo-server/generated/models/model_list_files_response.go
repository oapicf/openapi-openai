package models

type ListFilesResponse struct {

	Data []OpenAiFile `json:"data"`

	Object string `json:"object"`
}
