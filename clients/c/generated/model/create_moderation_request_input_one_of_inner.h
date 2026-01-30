/*
 * create_moderation_request_input_one_of_inner.h
 *
 * 
 */

#ifndef _create_moderation_request_input_one_of_inner_H_
#define _create_moderation_request_input_one_of_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_moderation_request_input_one_of_inner_t create_moderation_request_input_one_of_inner_t;

#include "create_moderation_request_input_one_of_inner_one_of.h"
#include "create_moderation_request_input_one_of_inner_one_of_1.h"
#include "create_moderation_request_input_one_of_inner_one_of_image_url.h"

// Enum TYPE for create_moderation_request_input_one_of_inner

typedef enum  { openai_api_create_moderation_request_input_one_of_inner_TYPE_NULL = 0, openai_api_create_moderation_request_input_one_of_inner_TYPE_image_url, openai_api_create_moderation_request_input_one_of_inner_TYPE_text } openai_api_create_moderation_request_input_one_of_inner_TYPE_e;

char* create_moderation_request_input_one_of_inner_type_ToString(openai_api_create_moderation_request_input_one_of_inner_TYPE_e type);

openai_api_create_moderation_request_input_one_of_inner_TYPE_e create_moderation_request_input_one_of_inner_type_FromString(char* type);



typedef struct create_moderation_request_input_one_of_inner_t {
    openai_api_create_moderation_request_input_one_of_inner_TYPE_e type; //enum
    struct create_moderation_request_input_one_of_inner_one_of_image_url_t *image_url; //model
    char *text; // string

    int _library_owned; // Is the library responsible for freeing this object?
} create_moderation_request_input_one_of_inner_t;

__attribute__((deprecated)) create_moderation_request_input_one_of_inner_t *create_moderation_request_input_one_of_inner_create(
    openai_api_create_moderation_request_input_one_of_inner_TYPE_e type,
    create_moderation_request_input_one_of_inner_one_of_image_url_t *image_url,
    char *text
);

void create_moderation_request_input_one_of_inner_free(create_moderation_request_input_one_of_inner_t *create_moderation_request_input_one_of_inner);

create_moderation_request_input_one_of_inner_t *create_moderation_request_input_one_of_inner_parseFromJSON(cJSON *create_moderation_request_input_one_of_innerJSON);

cJSON *create_moderation_request_input_one_of_inner_convertToJSON(create_moderation_request_input_one_of_inner_t *create_moderation_request_input_one_of_inner);

#endif /* _create_moderation_request_input_one_of_inner_H_ */

