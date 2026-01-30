package handlers
import (
	"github.com/oapicf/openapi-openai/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// UsageAudioSpeeches - Get audio speeches usage details for the organization.
func (c *Container) UsageAudioSpeeches(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// UsageAudioTranscriptions - Get audio transcriptions usage details for the organization.
func (c *Container) UsageAudioTranscriptions(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// UsageCodeInterpreterSessions - Get code interpreter sessions usage details for the organization.
func (c *Container) UsageCodeInterpreterSessions(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// UsageCompletions - Get completions usage details for the organization.
func (c *Container) UsageCompletions(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// UsageCosts - Get costs details for the organization.
func (c *Container) UsageCosts(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// UsageEmbeddings - Get embeddings usage details for the organization.
func (c *Container) UsageEmbeddings(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// UsageImages - Get images usage details for the organization.
func (c *Container) UsageImages(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// UsageModerations - Get moderations usage details for the organization.
func (c *Container) UsageModerations(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// UsageVectorStores - Get vector stores usage details for the organization.
func (c *Container) UsageVectorStores(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

