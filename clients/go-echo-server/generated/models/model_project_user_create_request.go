package models

type ProjectUserCreateRequest struct {

	// The ID of the user.
	UserId string `json:"user_id"`

	// `owner` or `member`
	Role string `json:"role"`
}
