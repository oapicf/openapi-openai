package models

import (
	"gopkg.in/validator.v2"
)

// CreateCompletionRequestStop - Up to 4 sequences where the API will stop generating further tokens. The returned text will not contain the stop sequence. 
type CreateCompletionRequestStop struct {
}
