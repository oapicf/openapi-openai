package handlers
import (
	"github.com/oapicf/openapi-openai/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// AdminApiKeysCreate - Create an organization admin API key
func (c *Container) AdminApiKeysCreate(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// AdminApiKeysDelete - Delete an organization admin API key
func (c *Container) AdminApiKeysDelete(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// AdminApiKeysGet - Retrieve a single organization API key
func (c *Container) AdminApiKeysGet(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// AdminApiKeysList - List organization API keys
func (c *Container) AdminApiKeysList(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

