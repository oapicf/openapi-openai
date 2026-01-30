package models

type ProjectUserUpdateRequest struct {

	// `owner` or `member`
	Role string `json:"role"`
}
