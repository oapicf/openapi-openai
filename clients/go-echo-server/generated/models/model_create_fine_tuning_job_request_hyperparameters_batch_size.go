package models

import (
	"gopkg.in/validator.v2"
)

// CreateFineTuningJobRequestHyperparametersBatchSize - Number of examples in each batch. A larger batch size means that model parameters are updated less frequently, but with lower variance. 
type CreateFineTuningJobRequestHyperparametersBatchSize struct {
}
