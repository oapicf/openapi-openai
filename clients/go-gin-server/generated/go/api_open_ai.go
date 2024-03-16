/*
 * OpenAI API
 *
 * APIs for sampling from and fine-tuning language models
 *
 * API version: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"github.com/gin-gonic/gin"
)

type OpenAIAPI struct {
}

// Post /v1/fine-tunes/:fine_tune_id/cancel
// Immediately cancel a fine-tune job.  
func (api *OpenAIAPI) CancelFineTune(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /v1/chat/completions
// Creates a model response for the given chat conversation. 
func (api *OpenAIAPI) CreateChatCompletion(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /v1/completions
// Creates a completion for the provided prompt and parameters. 
func (api *OpenAIAPI) CreateCompletion(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /v1/edits
// Creates a new edit for the provided input, instruction, and parameters. 
func (api *OpenAIAPI) CreateEdit(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /v1/embeddings
// Creates an embedding vector representing the input text. 
func (api *OpenAIAPI) CreateEmbedding(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /v1/files
// Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit.  
func (api *OpenAIAPI) CreateFile(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /v1/fine-tunes
// Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning)  
func (api *OpenAIAPI) CreateFineTune(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /v1/images/generations
// Creates an image given a prompt. 
func (api *OpenAIAPI) CreateImage(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /v1/images/edits
// Creates an edited or extended image given an original image and a prompt. 
func (api *OpenAIAPI) CreateImageEdit(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /v1/images/variations
// Creates a variation of a given image. 
func (api *OpenAIAPI) CreateImageVariation(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /v1/moderations
// Classifies if text violates OpenAI's Content Policy 
func (api *OpenAIAPI) CreateModeration(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /v1/audio/transcriptions
// Transcribes audio into the input language. 
func (api *OpenAIAPI) CreateTranscription(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /v1/audio/translations
// Translates audio into English. 
func (api *OpenAIAPI) CreateTranslation(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Delete /v1/files/:file_id
// Delete a file. 
func (api *OpenAIAPI) DeleteFile(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Delete /v1/models/:model
// Delete a fine-tuned model. You must have the Owner role in your organization. 
func (api *OpenAIAPI) DeleteModel(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /v1/files/:file_id/content
// Returns the contents of the specified file 
func (api *OpenAIAPI) DownloadFile(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /v1/files
// Returns a list of files that belong to the user's organization. 
func (api *OpenAIAPI) ListFiles(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /v1/fine-tunes/:fine_tune_id/events
// Get fine-grained status updates for a fine-tune job.  
func (api *OpenAIAPI) ListFineTuneEvents(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /v1/fine-tunes
// List your organization's fine-tuning jobs  
func (api *OpenAIAPI) ListFineTunes(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /v1/models
// Lists the currently available models, and provides basic information about each one such as the owner and availability. 
func (api *OpenAIAPI) ListModels(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /v1/files/:file_id
// Returns information about a specific file. 
func (api *OpenAIAPI) RetrieveFile(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /v1/fine-tunes/:fine_tune_id
// Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning)  
func (api *OpenAIAPI) RetrieveFineTune(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /v1/models/:model
// Retrieves a model instance, providing basic information about the model such as the owner and permissioning. 
func (api *OpenAIAPI) RetrieveModel(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}
