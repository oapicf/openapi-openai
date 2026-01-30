package models

type UserRoleUpdateRequest struct {

	// `owner` or `reader`
	Role string `json:"role"`
}
