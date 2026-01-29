#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/create_image_edit_request_model.h"
#include "../model/create_image_request.h"
#include "../model/images_response.h"

// Enum SIZE for ImagesAPI_createImageEdit
typedef enum  { openai_api_createImageEdit_SIZE_NULL = 0, openai_api_createImageEdit_SIZE__256x256, openai_api_createImageEdit_SIZE__512x512, openai_api_createImageEdit_SIZE__1024x1024 } openai_api_createImageEdit_size_e;

// Enum RESPONSEFORMAT for ImagesAPI_createImageEdit
typedef enum  { openai_api_createImageEdit_RESPONSEFORMAT_NULL = 0, openai_api_createImageEdit_RESPONSEFORMAT_url, openai_api_createImageEdit_RESPONSEFORMAT_b64_json } openai_api_createImageEdit_response_format_e;

// Enum RESPONSEFORMAT for ImagesAPI_createImageVariation
typedef enum  { openai_api_createImageVariation_RESPONSEFORMAT_NULL = 0, openai_api_createImageVariation_RESPONSEFORMAT_url, openai_api_createImageVariation_RESPONSEFORMAT_b64_json } openai_api_createImageVariation_response_format_e;

// Enum SIZE for ImagesAPI_createImageVariation
typedef enum  { openai_api_createImageVariation_SIZE_NULL = 0, openai_api_createImageVariation_SIZE__256x256, openai_api_createImageVariation_SIZE__512x512, openai_api_createImageVariation_SIZE__1024x1024 } openai_api_createImageVariation_size_e;


// Creates an image given a prompt.
//
images_response_t*
ImagesAPI_createImage(apiClient_t *apiClient, create_image_request_t *create_image_request);


// Creates an edited or extended image given an original image and a prompt.
//
images_response_t*
ImagesAPI_createImageEdit(apiClient_t *apiClient, binary_t* image, char *prompt, binary_t* mask, create_image_edit_request_model_t *model, int *n, openai_api_createImageEdit_size_e size, openai_api_createImageEdit_response_format_e response_format, char *user);


// Creates a variation of a given image.
//
images_response_t*
ImagesAPI_createImageVariation(apiClient_t *apiClient, binary_t* image, create_image_edit_request_model_t *model, int *n, openai_api_createImageVariation_response_format_e response_format, openai_api_createImageVariation_size_e size, char *user);


