#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/create_chat_completion_request.h"
#include "../model/create_chat_completion_response.h"
#include "../model/create_completion_request.h"
#include "../model/create_completion_response.h"
#include "../model/create_edit_request.h"
#include "../model/create_edit_response.h"
#include "../model/create_embedding_request.h"
#include "../model/create_embedding_response.h"
#include "../model/create_fine_tune_request.h"
#include "../model/create_image_request.h"
#include "../model/create_moderation_request.h"
#include "../model/create_moderation_response.h"
#include "../model/create_transcription_request_model.h"
#include "../model/create_transcription_response.h"
#include "../model/create_translation_response.h"
#include "../model/delete_file_response.h"
#include "../model/delete_model_response.h"
#include "../model/fine_tune.h"
#include "../model/images_response.h"
#include "../model/list_files_response.h"
#include "../model/list_fine_tune_events_response.h"
#include "../model/list_fine_tunes_response.h"
#include "../model/list_models_response.h"
#include "../model/model.h"
#include "../model/open_ai_file.h"

// Enum SIZE for OpenAIAPI_createImageEdit
typedef enum  { openai_api_createImageEdit_SIZE_NULL = 0, openai_api_createImageEdit_SIZE__256x256, openai_api_createImageEdit_SIZE__512x512, openai_api_createImageEdit_SIZE__1024x1024 } openai_api_createImageEdit_size_e;

// Enum RESPONSEFORMAT for OpenAIAPI_createImageEdit
typedef enum  { openai_api_createImageEdit_RESPONSEFORMAT_NULL = 0, openai_api_createImageEdit_RESPONSEFORMAT_url, openai_api_createImageEdit_RESPONSEFORMAT_b64_json } openai_api_createImageEdit_response_format_e;

// Enum SIZE for OpenAIAPI_createImageVariation
typedef enum  { openai_api_createImageVariation_SIZE_NULL = 0, openai_api_createImageVariation_SIZE__256x256, openai_api_createImageVariation_SIZE__512x512, openai_api_createImageVariation_SIZE__1024x1024 } openai_api_createImageVariation_size_e;

// Enum RESPONSEFORMAT for OpenAIAPI_createImageVariation
typedef enum  { openai_api_createImageVariation_RESPONSEFORMAT_NULL = 0, openai_api_createImageVariation_RESPONSEFORMAT_url, openai_api_createImageVariation_RESPONSEFORMAT_b64_json } openai_api_createImageVariation_response_format_e;


// Immediately cancel a fine-tune job. 
//
fine_tune_t*
OpenAIAPI_cancelFineTune(apiClient_t *apiClient, char *fine_tune_id);


// Creates a model response for the given chat conversation.
//
create_chat_completion_response_t*
OpenAIAPI_createChatCompletion(apiClient_t *apiClient, create_chat_completion_request_t *create_chat_completion_request);


// Creates a completion for the provided prompt and parameters.
//
create_completion_response_t*
OpenAIAPI_createCompletion(apiClient_t *apiClient, create_completion_request_t *create_completion_request);


// Creates a new edit for the provided input, instruction, and parameters.
//
create_edit_response_t*
OpenAIAPI_createEdit(apiClient_t *apiClient, create_edit_request_t *create_edit_request);


// Creates an embedding vector representing the input text.
//
create_embedding_response_t*
OpenAIAPI_createEmbedding(apiClient_t *apiClient, create_embedding_request_t *create_embedding_request);


// Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
//
open_ai_file_t*
OpenAIAPI_createFile(apiClient_t *apiClient, binary_t* file, char *purpose);


// Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
//
fine_tune_t*
OpenAIAPI_createFineTune(apiClient_t *apiClient, create_fine_tune_request_t *create_fine_tune_request);


// Creates an image given a prompt.
//
images_response_t*
OpenAIAPI_createImage(apiClient_t *apiClient, create_image_request_t *create_image_request);


// Creates an edited or extended image given an original image and a prompt.
//
images_response_t*
OpenAIAPI_createImageEdit(apiClient_t *apiClient, binary_t* image, char *prompt, binary_t* mask, int *n, openai_api_createImageEdit_size_e size, openai_api_createImageEdit_response_format_e response_format, char *user);


// Creates a variation of a given image.
//
images_response_t*
OpenAIAPI_createImageVariation(apiClient_t *apiClient, binary_t* image, int *n, openai_api_createImageVariation_size_e size, openai_api_createImageVariation_response_format_e response_format, char *user);


// Classifies if text violates OpenAI's Content Policy
//
create_moderation_response_t*
OpenAIAPI_createModeration(apiClient_t *apiClient, create_moderation_request_t *create_moderation_request);


// Transcribes audio into the input language.
//
create_transcription_response_t*
OpenAIAPI_createTranscription(apiClient_t *apiClient, binary_t* file, create_transcription_request_model_t *model, char *prompt, char *response_format, double temperature, char *language);


// Translates audio into English.
//
create_translation_response_t*
OpenAIAPI_createTranslation(apiClient_t *apiClient, binary_t* file, create_transcription_request_model_t *model, char *prompt, char *response_format, double temperature);


// Delete a file.
//
delete_file_response_t*
OpenAIAPI_deleteFile(apiClient_t *apiClient, char *file_id);


// Delete a fine-tuned model. You must have the Owner role in your organization.
//
delete_model_response_t*
OpenAIAPI_deleteModel(apiClient_t *apiClient, char *model);


// Returns the contents of the specified file
//
char*
OpenAIAPI_downloadFile(apiClient_t *apiClient, char *file_id);


// Returns a list of files that belong to the user's organization.
//
list_files_response_t*
OpenAIAPI_listFiles(apiClient_t *apiClient);


// Get fine-grained status updates for a fine-tune job. 
//
list_fine_tune_events_response_t*
OpenAIAPI_listFineTuneEvents(apiClient_t *apiClient, char *fine_tune_id, int *stream);


// List your organization's fine-tuning jobs 
//
list_fine_tunes_response_t*
OpenAIAPI_listFineTunes(apiClient_t *apiClient);


// Lists the currently available models, and provides basic information about each one such as the owner and availability.
//
list_models_response_t*
OpenAIAPI_listModels(apiClient_t *apiClient);


// Returns information about a specific file.
//
open_ai_file_t*
OpenAIAPI_retrieveFile(apiClient_t *apiClient, char *file_id);


// Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
//
fine_tune_t*
OpenAIAPI_retrieveFineTune(apiClient_t *apiClient, char *fine_tune_id);


// Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
//
model_t*
OpenAIAPI_retrieveModel(apiClient_t *apiClient, char *model);


