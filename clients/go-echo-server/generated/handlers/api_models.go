package handlers
import (
	"github.com/oapicf/openapi-openai/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// DeleteModel - Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
func (c *Container) DeleteModel(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ListModels - Lists the currently available models, and provides basic information about each one such as the owner and availability.
func (c *Container) ListModels(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// RetrieveModel - Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
func (c *Container) RetrieveModel(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

