/*
 * create_moderation_request_input_one_of_inner_one_of_1.h
 *
 * An object describing text to classify.
 */

#ifndef _create_moderation_request_input_one_of_inner_one_of_1_H_
#define _create_moderation_request_input_one_of_inner_one_of_1_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_moderation_request_input_one_of_inner_one_of_1_t create_moderation_request_input_one_of_inner_one_of_1_t;


// Enum TYPE for create_moderation_request_input_one_of_inner_one_of_1

typedef enum  { openai_api_create_moderation_request_input_one_of_inner_one_of_1_TYPE_NULL = 0, openai_api_create_moderation_request_input_one_of_inner_one_of_1_TYPE_text } openai_api_create_moderation_request_input_one_of_inner_one_of_1_TYPE_e;

char* create_moderation_request_input_one_of_inner_one_of_1_type_ToString(openai_api_create_moderation_request_input_one_of_inner_one_of_1_TYPE_e type);

openai_api_create_moderation_request_input_one_of_inner_one_of_1_TYPE_e create_moderation_request_input_one_of_inner_one_of_1_type_FromString(char* type);



typedef struct create_moderation_request_input_one_of_inner_one_of_1_t {
    openai_api_create_moderation_request_input_one_of_inner_one_of_1_TYPE_e type; //enum
    char *text; // string

    int _library_owned; // Is the library responsible for freeing this object?
} create_moderation_request_input_one_of_inner_one_of_1_t;

__attribute__((deprecated)) create_moderation_request_input_one_of_inner_one_of_1_t *create_moderation_request_input_one_of_inner_one_of_1_create(
    openai_api_create_moderation_request_input_one_of_inner_one_of_1_TYPE_e type,
    char *text
);

void create_moderation_request_input_one_of_inner_one_of_1_free(create_moderation_request_input_one_of_inner_one_of_1_t *create_moderation_request_input_one_of_inner_one_of_1);

create_moderation_request_input_one_of_inner_one_of_1_t *create_moderation_request_input_one_of_inner_one_of_1_parseFromJSON(cJSON *create_moderation_request_input_one_of_inner_one_of_1JSON);

cJSON *create_moderation_request_input_one_of_inner_one_of_1_convertToJSON(create_moderation_request_input_one_of_inner_one_of_1_t *create_moderation_request_input_one_of_inner_one_of_1);

#endif /* _create_moderation_request_input_one_of_inner_one_of_1_H_ */

