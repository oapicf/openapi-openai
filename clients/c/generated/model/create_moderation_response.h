/*
 * create_moderation_response.h
 *
 * Represents if a given text input is potentially harmful.
 */

#ifndef _create_moderation_response_H_
#define _create_moderation_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_moderation_response_t create_moderation_response_t;

#include "create_moderation_response_results_inner.h"



typedef struct create_moderation_response_t {
    char *id; // string
    char *model; // string
    list_t *results; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} create_moderation_response_t;

__attribute__((deprecated)) create_moderation_response_t *create_moderation_response_create(
    char *id,
    char *model,
    list_t *results
);

void create_moderation_response_free(create_moderation_response_t *create_moderation_response);

create_moderation_response_t *create_moderation_response_parseFromJSON(cJSON *create_moderation_responseJSON);

cJSON *create_moderation_response_convertToJSON(create_moderation_response_t *create_moderation_response);

#endif /* _create_moderation_response_H_ */

