package handlers
import (
	"github.com/oapicf/openapi-openai/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// CancelVectorStoreFileBatch - Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
func (c *Container) CancelVectorStoreFileBatch(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// CreateVectorStore - Create a vector store.
func (c *Container) CreateVectorStore(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// CreateVectorStoreFile - Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
func (c *Container) CreateVectorStoreFile(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// CreateVectorStoreFileBatch - Create a vector store file batch.
func (c *Container) CreateVectorStoreFileBatch(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// DeleteVectorStore - Delete a vector store.
func (c *Container) DeleteVectorStore(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// DeleteVectorStoreFile - Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
func (c *Container) DeleteVectorStoreFile(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetVectorStore - Retrieves a vector store.
func (c *Container) GetVectorStore(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetVectorStoreFile - Retrieves a vector store file.
func (c *Container) GetVectorStoreFile(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetVectorStoreFileBatch - Retrieves a vector store file batch.
func (c *Container) GetVectorStoreFileBatch(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ListFilesInVectorStoreBatch - Returns a list of vector store files in a batch.
func (c *Container) ListFilesInVectorStoreBatch(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ListVectorStoreFiles - Returns a list of vector store files.
func (c *Container) ListVectorStoreFiles(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ListVectorStores - Returns a list of vector stores.
func (c *Container) ListVectorStores(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// ModifyVectorStore - Modifies a vector store.
func (c *Container) ModifyVectorStore(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

