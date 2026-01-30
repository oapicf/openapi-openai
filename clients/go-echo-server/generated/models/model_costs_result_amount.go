package models

// CostsResultAmount - The monetary value in its associated currency.
type CostsResultAmount struct {

	// The numeric value of the cost.
	Value float32 `json:"value,omitempty"`

	// Lowercase ISO-4217 currency e.g. \"usd\"
	Currency string `json:"currency,omitempty"`
}
