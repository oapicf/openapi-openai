package models

type CreateUploadRequest struct {

	// The name of the file to upload. 
	Filename string `json:"filename"`

	// The intended purpose of the uploaded file.  See the [documentation on File purposes](/docs/api-reference/files/create#files-create-purpose). 
	Purpose string `json:"purpose"`

	// The number of bytes in the file you are uploading. 
	Bytes int32 `json:"bytes"`

	// The MIME type of the file.  This must fall within the supported MIME types for your file purpose. See the supported MIME types for assistants and vision. 
	MimeType string `json:"mime_type"`
}
