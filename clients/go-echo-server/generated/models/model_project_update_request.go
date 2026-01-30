package models

type ProjectUpdateRequest struct {

	// The updated name of the project, this name appears in reports.
	Name string `json:"name"`
}
