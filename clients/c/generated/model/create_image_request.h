/*
 * create_image_request.h
 *
 * 
 */

#ifndef _create_image_request_H_
#define _create_image_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_image_request_t create_image_request_t;

#include "create_image_request_model.h"

// Enum QUALITY for create_image_request

typedef enum  { openai_api_create_image_request_QUALITY_NULL = 0, openai_api_create_image_request_QUALITY_standard, openai_api_create_image_request_QUALITY_hd } openai_api_create_image_request_QUALITY_e;

char* create_image_request_quality_ToString(openai_api_create_image_request_QUALITY_e quality);

openai_api_create_image_request_QUALITY_e create_image_request_quality_FromString(char* quality);

// Enum RESPONSEFORMAT for create_image_request

typedef enum  { openai_api_create_image_request_RESPONSEFORMAT_NULL = 0, openai_api_create_image_request_RESPONSEFORMAT_url, openai_api_create_image_request_RESPONSEFORMAT_b64_json } openai_api_create_image_request_RESPONSEFORMAT_e;

char* create_image_request_response_format_ToString(openai_api_create_image_request_RESPONSEFORMAT_e response_format);

openai_api_create_image_request_RESPONSEFORMAT_e create_image_request_response_format_FromString(char* response_format);

// Enum SIZE for create_image_request

typedef enum  { openai_api_create_image_request_SIZE_NULL = 0, openai_api_create_image_request_SIZE__256x256, openai_api_create_image_request_SIZE__512x512, openai_api_create_image_request_SIZE__1024x1024, openai_api_create_image_request_SIZE__1792x1024, openai_api_create_image_request_SIZE__1024x1792 } openai_api_create_image_request_SIZE_e;

char* create_image_request_size_ToString(openai_api_create_image_request_SIZE_e size);

openai_api_create_image_request_SIZE_e create_image_request_size_FromString(char* size);

// Enum STYLE for create_image_request

typedef enum  { openai_api_create_image_request_STYLE_NULL = 0, openai_api_create_image_request_STYLE_vivid, openai_api_create_image_request_STYLE_natural } openai_api_create_image_request_STYLE_e;

char* create_image_request_style_ToString(openai_api_create_image_request_STYLE_e style);

openai_api_create_image_request_STYLE_e create_image_request_style_FromString(char* style);



typedef struct create_image_request_t {
    char *prompt; // string
    struct create_image_request_model_t *model; //model
    int n; //numeric
    openai_api_create_image_request_QUALITY_e quality; //enum
    openai_api_create_image_request_RESPONSEFORMAT_e response_format; //enum
    openai_api_create_image_request_SIZE_e size; //enum
    openai_api_create_image_request_STYLE_e style; //enum
    char *user; // string

} create_image_request_t;

create_image_request_t *create_image_request_create(
    char *prompt,
    create_image_request_model_t *model,
    int n,
    openai_api_create_image_request_QUALITY_e quality,
    openai_api_create_image_request_RESPONSEFORMAT_e response_format,
    openai_api_create_image_request_SIZE_e size,
    openai_api_create_image_request_STYLE_e style,
    char *user
);

void create_image_request_free(create_image_request_t *create_image_request);

create_image_request_t *create_image_request_parseFromJSON(cJSON *create_image_requestJSON);

cJSON *create_image_request_convertToJSON(create_image_request_t *create_image_request);

#endif /* _create_image_request_H_ */

