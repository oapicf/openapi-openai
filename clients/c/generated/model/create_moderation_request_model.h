/*
 * create_moderation_request_model.h
 *
 * The content moderation model you would like to use. Learn more in [the moderation guide](/docs/guides/moderation), and learn about available models [here](/docs/models#moderation). 
 */

#ifndef _create_moderation_request_model_H_
#define _create_moderation_request_model_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_moderation_request_model_t create_moderation_request_model_t;




typedef struct create_moderation_request_model_t {

    int _library_owned; // Is the library responsible for freeing this object?
} create_moderation_request_model_t;

__attribute__((deprecated)) create_moderation_request_model_t *create_moderation_request_model_create(
);

void create_moderation_request_model_free(create_moderation_request_model_t *create_moderation_request_model);

create_moderation_request_model_t *create_moderation_request_model_parseFromJSON(cJSON *create_moderation_request_modelJSON);

cJSON *create_moderation_request_model_convertToJSON(create_moderation_request_model_t *create_moderation_request_model);

#endif /* _create_moderation_request_model_H_ */

