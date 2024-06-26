/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * API version: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"github.com/gin-gonic/gin"
)

type ModelsAPI struct {
}

// Delete /v1/models/:model
// Delete a fine-tuned model. You must have the Owner role in your organization to delete a model. 
func (api *ModelsAPI) DeleteModel(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /v1/models
// Lists the currently available models, and provides basic information about each one such as the owner and availability. 
func (api *ModelsAPI) ListModels(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /v1/models/:model
// Retrieves a model instance, providing basic information about the model such as the owner and permissioning. 
func (api *ModelsAPI) RetrieveModel(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

