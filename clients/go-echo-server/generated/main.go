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


	// CancelRun - Cancels a run that is `in_progress`.
	e.POST("/v1/threads/:thread_id/runs/:run_id/cancel", c.CancelRun)

	// CreateAssistant - Create an assistant with a model and instructions.
	e.POST("/v1/assistants", c.CreateAssistant)

	// CreateAssistantFile - Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).
	e.POST("/v1/assistants/:assistant_id/files", c.CreateAssistantFile)

	// CreateMessage - Create a message.
	e.POST("/v1/threads/:thread_id/messages", c.CreateMessage)

	// CreateRun - Create a run.
	e.POST("/v1/threads/:thread_id/runs", c.CreateRun)

	// CreateThread - Create a thread.
	e.POST("/v1/threads", c.CreateThread)

	// CreateThreadAndRun - Create a thread and run it in one request.
	e.POST("/v1/threads/runs", c.CreateThreadAndRun)

	// DeleteAssistant - Delete an assistant.
	e.DELETE("/v1/assistants/:assistant_id", c.DeleteAssistant)

	// DeleteAssistantFile - Delete an assistant file.
	e.DELETE("/v1/assistants/:assistant_id/files/:file_id", c.DeleteAssistantFile)

	// DeleteThread - Delete a thread.
	e.DELETE("/v1/threads/:thread_id", c.DeleteThread)

	// GetAssistant - Retrieves an assistant.
	e.GET("/v1/assistants/:assistant_id", c.GetAssistant)

	// GetAssistantFile - Retrieves an AssistantFile.
	e.GET("/v1/assistants/:assistant_id/files/:file_id", c.GetAssistantFile)

	// GetMessage - Retrieve a message.
	e.GET("/v1/threads/:thread_id/messages/:message_id", c.GetMessage)

	// GetMessageFile - Retrieves a message file.
	e.GET("/v1/threads/:thread_id/messages/:message_id/files/:file_id", c.GetMessageFile)

	// GetRun - Retrieves a run.
	e.GET("/v1/threads/:thread_id/runs/:run_id", c.GetRun)

	// GetRunStep - Retrieves a run step.
	e.GET("/v1/threads/:thread_id/runs/:run_id/steps/:step_id", c.GetRunStep)

	// GetThread - Retrieves a thread.
	e.GET("/v1/threads/:thread_id", c.GetThread)

	// ListAssistantFiles - Returns a list of assistant files.
	e.GET("/v1/assistants/:assistant_id/files", c.ListAssistantFiles)

	// ListAssistants - Returns a list of assistants.
	e.GET("/v1/assistants", c.ListAssistants)

	// ListMessageFiles - Returns a list of message files.
	e.GET("/v1/threads/:thread_id/messages/:message_id/files", c.ListMessageFiles)

	// ListMessages - Returns a list of messages for a given thread.
	e.GET("/v1/threads/:thread_id/messages", c.ListMessages)

	// ListRunSteps - Returns a list of run steps belonging to a run.
	e.GET("/v1/threads/:thread_id/runs/:run_id/steps", c.ListRunSteps)

	// ListRuns - Returns a list of runs belonging to a thread.
	e.GET("/v1/threads/:thread_id/runs", c.ListRuns)

	// ModifyAssistant - Modifies an assistant.
	e.POST("/v1/assistants/:assistant_id", c.ModifyAssistant)

	// ModifyMessage - Modifies a message.
	e.POST("/v1/threads/:thread_id/messages/:message_id", c.ModifyMessage)

	// ModifyRun - Modifies a run.
	e.POST("/v1/threads/:thread_id/runs/:run_id", c.ModifyRun)

	// ModifyThread - Modifies a thread.
	e.POST("/v1/threads/:thread_id", c.ModifyThread)

	// SubmitToolOuputsToRun - When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. 
	e.POST("/v1/threads/:thread_id/runs/:run_id/submit_tool_outputs", c.SubmitToolOuputsToRun)

	// CreateSpeech - Generates audio from the input text.
	e.POST("/v1/audio/speech", c.CreateSpeech)

	// CreateTranscription - Transcribes audio into the input language.
	e.POST("/v1/audio/transcriptions", c.CreateTranscription)

	// CreateTranslation - Translates audio into English.
	e.POST("/v1/audio/translations", c.CreateTranslation)

	// CreateChatCompletion - Creates a model response for the given chat conversation.
	e.POST("/v1/chat/completions", c.CreateChatCompletion)

	// CreateCompletion - Creates a completion for the provided prompt and parameters.
	e.POST("/v1/completions", c.CreateCompletion)

	// CreateEmbedding - Creates an embedding vector representing the input text.
	e.POST("/v1/embeddings", c.CreateEmbedding)

	// CreateFile - Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
	e.POST("/v1/files", c.CreateFile)

	// DeleteFile - Delete a file.
	e.DELETE("/v1/files/:file_id", c.DeleteFile)

	// DownloadFile - Returns the contents of the specified file.
	e.GET("/v1/files/:file_id/content", c.DownloadFile)

	// ListFiles - Returns a list of files that belong to the user's organization.
	e.GET("/v1/files", c.ListFiles)

	// RetrieveFile - Returns information about a specific file.
	e.GET("/v1/files/:file_id", c.RetrieveFile)

	// CancelFineTuningJob - Immediately cancel a fine-tune job. 
	e.POST("/v1/fine_tuning/jobs/:fine_tuning_job_id/cancel", c.CancelFineTuningJob)

	// CreateFineTuningJob - Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
	e.POST("/v1/fine_tuning/jobs", c.CreateFineTuningJob)

	// ListFineTuningEvents - Get status updates for a fine-tuning job. 
	e.GET("/v1/fine_tuning/jobs/:fine_tuning_job_id/events", c.ListFineTuningEvents)

	// ListFineTuningJobCheckpoints - List checkpoints for a fine-tuning job. 
	e.GET("/v1/fine_tuning/jobs/:fine_tuning_job_id/checkpoints", c.ListFineTuningJobCheckpoints)

	// ListPaginatedFineTuningJobs - List your organization's fine-tuning jobs 
	e.GET("/v1/fine_tuning/jobs", c.ListPaginatedFineTuningJobs)

	// RetrieveFineTuningJob - Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
	e.GET("/v1/fine_tuning/jobs/:fine_tuning_job_id", c.RetrieveFineTuningJob)

	// CreateImage - Creates an image given a prompt.
	e.POST("/v1/images/generations", c.CreateImage)

	// CreateImageEdit - Creates an edited or extended image given an original image and a prompt.
	e.POST("/v1/images/edits", c.CreateImageEdit)

	// CreateImageVariation - Creates a variation of a given image.
	e.POST("/v1/images/variations", c.CreateImageVariation)

	// DeleteModel - Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
	e.DELETE("/v1/models/:model", c.DeleteModel)

	// ListModels - Lists the currently available models, and provides basic information about each one such as the owner and availability.
	e.GET("/v1/models", c.ListModels)

	// RetrieveModel - Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
	e.GET("/v1/models/:model", c.RetrieveModel)

	// CreateModeration - Classifies if text is potentially harmful.
	e.POST("/v1/moderations", c.CreateModeration)


	// Start server
	e.Logger.Fatal(e.Start(":8080"))
}
