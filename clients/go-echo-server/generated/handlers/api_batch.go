package handlers
import (
	"github.com/oapicf/openapi-openai/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// CancelBatch - Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file.
func (c *Container) CancelBatch(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// CreateBatch - Creates and executes a batch from an uploaded file of requests
func (c *Container) CreateBatch(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ListBatches - List your organization's batches.
func (c *Container) ListBatches(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// RetrieveBatch - Retrieves a batch.
func (c *Container) RetrieveBatch(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

