package handlers
import (
	"github.com/oapicf/openapi-openai/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// DeleteInvite - Delete an invite. If the invite has already been accepted, it cannot be deleted.
func (c *Container) DeleteInvite(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// InviteUser - Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
func (c *Container) InviteUser(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ListInvites - Returns a list of invites in the organization.
func (c *Container) ListInvites(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// RetrieveInvite - Retrieves an invite.
func (c *Container) RetrieveInvite(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

