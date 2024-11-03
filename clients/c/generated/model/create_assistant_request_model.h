/*
 * create_assistant_request_model.h
 *
 * ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them. 
 */

#ifndef _create_assistant_request_model_H_
#define _create_assistant_request_model_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_assistant_request_model_t create_assistant_request_model_t;




typedef struct create_assistant_request_model_t {

} create_assistant_request_model_t;

create_assistant_request_model_t *create_assistant_request_model_create(
);

void create_assistant_request_model_free(create_assistant_request_model_t *create_assistant_request_model);

create_assistant_request_model_t *create_assistant_request_model_parseFromJSON(cJSON *create_assistant_request_modelJSON);

cJSON *create_assistant_request_model_convertToJSON(create_assistant_request_model_t *create_assistant_request_model);

#endif /* _create_assistant_request_model_H_ */

