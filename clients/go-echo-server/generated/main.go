package main

import (
	"github.com/oapicf/openapi-openai/handlers"
	"github.com/labstack/echo/v4"
	"github.com/labstack/echo/v4/middleware"
)

func main() {
	e := echo.New()

	//todo: handle the error!
	c, _ := handlers.NewContainer()

	// Middleware
	e.Use(middleware.Logger())
	e.Use(middleware.Recover())


	// CancelFineTune - Immediately cancel a fine-tune job. 
	e.POST("/v1/fine-tunes/:fine_tune_id/cancel", c.CancelFineTune)

	// CreateChatCompletion - Creates a model response for the given chat conversation.
	e.POST("/v1/chat/completions", c.CreateChatCompletion)

	// CreateCompletion - Creates a completion for the provided prompt and parameters.
	e.POST("/v1/completions", c.CreateCompletion)

	// CreateEdit - Creates a new edit for the provided input, instruction, and parameters.
	e.POST("/v1/edits", c.CreateEdit)

	// CreateEmbedding - Creates an embedding vector representing the input text.
	e.POST("/v1/embeddings", c.CreateEmbedding)

	// CreateFile - Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
	e.POST("/v1/files", c.CreateFile)

	// CreateFineTune - Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
	e.POST("/v1/fine-tunes", c.CreateFineTune)

	// CreateImage - Creates an image given a prompt.
	e.POST("/v1/images/generations", c.CreateImage)

	// CreateImageEdit - Creates an edited or extended image given an original image and a prompt.
	e.POST("/v1/images/edits", c.CreateImageEdit)

	// CreateImageVariation - Creates a variation of a given image.
	e.POST("/v1/images/variations", c.CreateImageVariation)

	// CreateModeration - Classifies if text violates OpenAI's Content Policy
	e.POST("/v1/moderations", c.CreateModeration)

	// CreateTranscription - Transcribes audio into the input language.
	e.POST("/v1/audio/transcriptions", c.CreateTranscription)

	// CreateTranslation - Translates audio into English.
	e.POST("/v1/audio/translations", c.CreateTranslation)

	// DeleteFile - Delete a file.
	e.DELETE("/v1/files/:file_id", c.DeleteFile)

	// DeleteModel - Delete a fine-tuned model. You must have the Owner role in your organization.
	e.DELETE("/v1/models/:model", c.DeleteModel)

	// DownloadFile - Returns the contents of the specified file
	e.GET("/v1/files/:file_id/content", c.DownloadFile)

	// ListFiles - Returns a list of files that belong to the user's organization.
	e.GET("/v1/files", c.ListFiles)

	// ListFineTuneEvents - Get fine-grained status updates for a fine-tune job. 
	e.GET("/v1/fine-tunes/:fine_tune_id/events", c.ListFineTuneEvents)

	// ListFineTunes - List your organization's fine-tuning jobs 
	e.GET("/v1/fine-tunes", c.ListFineTunes)

	// ListModels - Lists the currently available models, and provides basic information about each one such as the owner and availability.
	e.GET("/v1/models", c.ListModels)

	// RetrieveFile - Returns information about a specific file.
	e.GET("/v1/files/:file_id", c.RetrieveFile)

	// RetrieveFineTune - Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
	e.GET("/v1/fine-tunes/:fine_tune_id", c.RetrieveFineTune)

	// RetrieveModel - Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
	e.GET("/v1/models/:model", c.RetrieveModel)


	// Start server
	e.Logger.Fatal(e.Start(":8080"))
}
