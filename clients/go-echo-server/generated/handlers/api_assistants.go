package handlers
import (
	"github.com/oapicf/openapi-openai/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// CancelRun - Cancels a run that is `in_progress`.
func (c *Container) CancelRun(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// CreateAssistant - Create an assistant with a model and instructions.
func (c *Container) CreateAssistant(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// CreateAssistantFile - Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).
func (c *Container) CreateAssistantFile(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// CreateMessage - Create a message.
func (c *Container) CreateMessage(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// CreateRun - Create a run.
func (c *Container) CreateRun(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// CreateThread - Create a thread.
func (c *Container) CreateThread(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// CreateThreadAndRun - Create a thread and run it in one request.
func (c *Container) CreateThreadAndRun(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// DeleteAssistant - Delete an assistant.
func (c *Container) DeleteAssistant(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// DeleteAssistantFile - Delete an assistant file.
func (c *Container) DeleteAssistantFile(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// DeleteThread - Delete a thread.
func (c *Container) DeleteThread(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetAssistant - Retrieves an assistant.
func (c *Container) GetAssistant(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetAssistantFile - Retrieves an AssistantFile.
func (c *Container) GetAssistantFile(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetMessage - Retrieve a message.
func (c *Container) GetMessage(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetMessageFile - Retrieves a message file.
func (c *Container) GetMessageFile(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetRun - Retrieves a run.
func (c *Container) GetRun(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetRunStep - Retrieves a run step.
func (c *Container) GetRunStep(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetThread - Retrieves a thread.
func (c *Container) GetThread(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ListAssistantFiles - Returns a list of assistant files.
func (c *Container) ListAssistantFiles(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ListAssistants - Returns a list of assistants.
func (c *Container) ListAssistants(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ListMessageFiles - Returns a list of message files.
func (c *Container) ListMessageFiles(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ListMessages - Returns a list of messages for a given thread.
func (c *Container) ListMessages(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ListRunSteps - Returns a list of run steps belonging to a run.
func (c *Container) ListRunSteps(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ListRuns - Returns a list of runs belonging to a thread.
func (c *Container) ListRuns(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ModifyAssistant - Modifies an assistant.
func (c *Container) ModifyAssistant(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ModifyMessage - Modifies a message.
func (c *Container) ModifyMessage(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ModifyRun - Modifies a run.
func (c *Container) ModifyRun(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ModifyThread - Modifies a thread.
func (c *Container) ModifyThread(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// SubmitToolOuputsToRun - When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. 
func (c *Container) SubmitToolOuputsToRun(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

