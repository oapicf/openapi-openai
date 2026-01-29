package handlers
import (
	"github.com/oapicf/openapi-openai/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// CancelFineTuningJob - Immediately cancel a fine-tune job. 
func (c *Container) CancelFineTuningJob(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// CreateFineTuningJob - Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
func (c *Container) CreateFineTuningJob(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ListFineTuningEvents - Get status updates for a fine-tuning job. 
func (c *Container) ListFineTuningEvents(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ListFineTuningJobCheckpoints - List checkpoints for a fine-tuning job. 
func (c *Container) ListFineTuningJobCheckpoints(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ListPaginatedFineTuningJobs - List your organization's fine-tuning jobs 
func (c *Container) ListPaginatedFineTuningJobs(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// RetrieveFineTuningJob - Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
func (c *Container) RetrieveFineTuningJob(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

