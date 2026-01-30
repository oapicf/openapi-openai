package models

// VectorStoreFileObjectLastError - The last error associated with this vector store file. Will be `null` if there are no errors.
type VectorStoreFileObjectLastError struct {

	// One of `server_error` or `rate_limit_exceeded`.
	Code string `json:"code"`

	// A human-readable description of the error.
	Message string `json:"message"`
}
