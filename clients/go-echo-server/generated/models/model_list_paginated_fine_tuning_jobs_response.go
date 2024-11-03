package models

type ListPaginatedFineTuningJobsResponse struct {

	Data []FineTuningJob `json:"data"`

	HasMore bool `json:"has_more"`

	Object string `json:"object"`
}
