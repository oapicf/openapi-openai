package models

// PredictionContent - Static predicted output content, such as the content of a text file that is being regenerated. 
type PredictionContent struct {

	// The type of the predicted content you want to provide. This type is currently always `content`. 
	Type string `json:"type"`

	Content PredictionContentContent `json:"content"`
}
