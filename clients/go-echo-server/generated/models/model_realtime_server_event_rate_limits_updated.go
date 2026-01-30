package models

// RealtimeServerEventRateLimitsUpdated - Emitted at the beginning of a Response to indicate the updated rate limits.  When a Response is created some tokens will be \"reserved\" for the output  tokens, the rate limits shown here reflect that reservation, which is then  adjusted accordingly once the Response is completed. 
type RealtimeServerEventRateLimitsUpdated struct {

	// The unique ID of the server event.
	EventId string `json:"event_id"`

	// The event type, must be `rate_limits.updated`.
	Type string `json:"type"`

	// List of rate limit information.
	RateLimits []RealtimeServerEventRateLimitsUpdatedRateLimitsInner `json:"rate_limits"`
}
