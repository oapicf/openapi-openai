package models

type CompleteUploadRequest struct {

	// The ordered list of Part IDs. 
	PartIds []string `json:"part_ids"`

	// The optional md5 checksum for the file contents to verify if the bytes uploaded matches what you expect. 
	Md5 string `json:"md5,omitempty"`
}
