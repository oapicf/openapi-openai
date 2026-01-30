/*
 * array_of_content_parts_inner.h
 *
 * 
 */

#ifndef _array_of_content_parts_inner_H_
#define _array_of_content_parts_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct array_of_content_parts_inner_t array_of_content_parts_inner_t;

#include "message_content_image_file_object.h"
#include "message_content_image_file_object_image_file.h"
#include "message_content_image_url_object.h"
#include "message_content_image_url_object_image_url.h"
#include "message_request_content_text_object.h"

// Enum TYPE for array_of_content_parts_inner

typedef enum  { openai_api_array_of_content_parts_inner_TYPE_NULL = 0, openai_api_array_of_content_parts_inner_TYPE_image_file, openai_api_array_of_content_parts_inner_TYPE_image_url, openai_api_array_of_content_parts_inner_TYPE_text } openai_api_array_of_content_parts_inner_TYPE_e;

char* array_of_content_parts_inner_type_ToString(openai_api_array_of_content_parts_inner_TYPE_e type);

openai_api_array_of_content_parts_inner_TYPE_e array_of_content_parts_inner_type_FromString(char* type);



typedef struct array_of_content_parts_inner_t {
    openai_api_array_of_content_parts_inner_TYPE_e type; //enum
    struct message_content_image_file_object_image_file_t *image_file; //model
    struct message_content_image_url_object_image_url_t *image_url; //model
    char *text; // string

    int _library_owned; // Is the library responsible for freeing this object?
} array_of_content_parts_inner_t;

__attribute__((deprecated)) array_of_content_parts_inner_t *array_of_content_parts_inner_create(
    openai_api_array_of_content_parts_inner_TYPE_e type,
    message_content_image_file_object_image_file_t *image_file,
    message_content_image_url_object_image_url_t *image_url,
    char *text
);

void array_of_content_parts_inner_free(array_of_content_parts_inner_t *array_of_content_parts_inner);

array_of_content_parts_inner_t *array_of_content_parts_inner_parseFromJSON(cJSON *array_of_content_parts_innerJSON);

cJSON *array_of_content_parts_inner_convertToJSON(array_of_content_parts_inner_t *array_of_content_parts_inner);

#endif /* _array_of_content_parts_inner_H_ */

