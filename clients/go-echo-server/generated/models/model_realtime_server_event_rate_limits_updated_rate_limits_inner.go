package models

type RealtimeServerEventRateLimitsUpdatedRateLimitsInner struct {

	// The name of the rate limit (`requests`, `tokens`). 
	Name string `json:"name,omitempty"`

	// The maximum allowed value for the rate limit.
	Limit int32 `json:"limit,omitempty"`

	// The remaining value before the limit is reached.
	Remaining int32 `json:"remaining,omitempty"`

	// Seconds until the rate limit resets.
	ResetSeconds float32 `json:"reset_seconds,omitempty"`
}
