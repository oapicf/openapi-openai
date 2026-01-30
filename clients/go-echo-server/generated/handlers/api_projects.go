package handlers
import (
	"github.com/oapicf/openapi-openai/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// ArchiveProject - Archives a project in the organization. Archived projects cannot be used or updated.
func (c *Container) ArchiveProject(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// CreateProject - Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
func (c *Container) CreateProject(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// CreateProjectServiceAccount - Creates a new service account in the project. This also returns an unredacted API key for the service account.
func (c *Container) CreateProjectServiceAccount(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// CreateProjectUser - Adds a user to the project. Users must already be members of the organization to be added to a project.
func (c *Container) CreateProjectUser(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// DeleteProjectApiKey - Deletes an API key from the project.
func (c *Container) DeleteProjectApiKey(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// DeleteProjectServiceAccount - Deletes a service account from the project.
func (c *Container) DeleteProjectServiceAccount(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// DeleteProjectUser - Deletes a user from the project.
func (c *Container) DeleteProjectUser(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ListProjectApiKeys - Returns a list of API keys in the project.
func (c *Container) ListProjectApiKeys(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ListProjectRateLimits - Returns the rate limits per model for a project.
func (c *Container) ListProjectRateLimits(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ListProjectServiceAccounts - Returns a list of service accounts in the project.
func (c *Container) ListProjectServiceAccounts(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ListProjectUsers - Returns a list of users in the project.
func (c *Container) ListProjectUsers(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ListProjects - Returns a list of projects.
func (c *Container) ListProjects(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ModifyProject - Modifies a project in the organization.
func (c *Container) ModifyProject(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ModifyProjectUser - Modifies a user's role in the project.
func (c *Container) ModifyProjectUser(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// RetrieveProject - Retrieves a project.
func (c *Container) RetrieveProject(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// RetrieveProjectApiKey - Retrieves an API key in the project.
func (c *Container) RetrieveProjectApiKey(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// RetrieveProjectServiceAccount - Retrieves a service account in the project.
func (c *Container) RetrieveProjectServiceAccount(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// RetrieveProjectUser - Retrieves a user in the project.
func (c *Container) RetrieveProjectUser(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// UpdateProjectRateLimits - Updates a project rate limit.
func (c *Container) UpdateProjectRateLimits(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

