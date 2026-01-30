package models

type ProjectServiceAccountCreateResponse struct {

	Object string `json:"object"`

	Id string `json:"id"`

	Name string `json:"name"`

	// Service accounts can only have one role of type `member`
	Role string `json:"role"`

	CreatedAt int32 `json:"created_at"`

	ApiKey ProjectServiceAccountApiKey `json:"api_key"`
}
