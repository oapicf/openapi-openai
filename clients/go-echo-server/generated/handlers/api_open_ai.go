package handlers
import (
	"github.com/oapicf/openapi-openai/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// CancelFineTune - Immediately cancel a fine-tune job. 
func (c *Container) CancelFineTune(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// CreateChatCompletion - Creates a model response for the given chat conversation.
func (c *Container) CreateChatCompletion(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// CreateCompletion - Creates a completion for the provided prompt and parameters.
func (c *Container) CreateCompletion(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// CreateEdit - Creates a new edit for the provided input, instruction, and parameters.
func (c *Container) CreateEdit(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// CreateEmbedding - Creates an embedding vector representing the input text.
func (c *Container) CreateEmbedding(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// CreateFile - Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
func (c *Container) CreateFile(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// CreateFineTune - Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
func (c *Container) CreateFineTune(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// CreateImage - Creates an image given a prompt.
func (c *Container) CreateImage(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// CreateImageEdit - Creates an edited or extended image given an original image and a prompt.
func (c *Container) CreateImageEdit(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// CreateImageVariation - Creates a variation of a given image.
func (c *Container) CreateImageVariation(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// CreateModeration - Classifies if text violates OpenAI's Content Policy
func (c *Container) CreateModeration(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// CreateTranscription - Transcribes audio into the input language.
func (c *Container) CreateTranscription(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// CreateTranslation - Translates audio into English.
func (c *Container) CreateTranslation(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// DeleteFile - Delete a file.
func (c *Container) DeleteFile(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// DeleteModel - Delete a fine-tuned model. You must have the Owner role in your organization.
func (c *Container) DeleteModel(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// DownloadFile - Returns the contents of the specified file
func (c *Container) DownloadFile(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ListFiles - Returns a list of files that belong to the user's organization.
func (c *Container) ListFiles(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ListFineTuneEvents - Get fine-grained status updates for a fine-tune job. 
func (c *Container) ListFineTuneEvents(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ListFineTunes - List your organization's fine-tuning jobs 
func (c *Container) ListFineTunes(ctx echo.Context) error {
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


// RetrieveFile - Returns information about a specific file.
func (c *Container) RetrieveFile(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// RetrieveFineTune - Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
func (c *Container) RetrieveFineTune(ctx echo.Context) error {
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

