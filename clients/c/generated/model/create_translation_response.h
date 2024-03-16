/*
 * create_translation_response.h
 *
 * 
 */

#ifndef _create_translation_response_H_
#define _create_translation_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_translation_response_t create_translation_response_t;




typedef struct create_translation_response_t {
    char *text; // string

} create_translation_response_t;

create_translation_response_t *create_translation_response_create(
    char *text
);

void create_translation_response_free(create_translation_response_t *create_translation_response);

create_translation_response_t *create_translation_response_parseFromJSON(cJSON *create_translation_responseJSON);

cJSON *create_translation_response_convertToJSON(create_translation_response_t *create_translation_response);

#endif /* _create_translation_response_H_ */

