package handlers
import (
	"github.com/oapicf/openapi-openai/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// CreateModeration - Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). 
func (c *Container) CreateModeration(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

