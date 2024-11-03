/*
 * create_translation_response_json.h
 *
 * 
 */

#ifndef _create_translation_response_json_H_
#define _create_translation_response_json_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_translation_response_json_t create_translation_response_json_t;




typedef struct create_translation_response_json_t {
    char *text; // string

} create_translation_response_json_t;

create_translation_response_json_t *create_translation_response_json_create(
    char *text
);

void create_translation_response_json_free(create_translation_response_json_t *create_translation_response_json);

create_translation_response_json_t *create_translation_response_json_parseFromJSON(cJSON *create_translation_response_jsonJSON);

cJSON *create_translation_response_json_convertToJSON(create_translation_response_json_t *create_translation_response_json);

#endif /* _create_translation_response_json_H_ */

