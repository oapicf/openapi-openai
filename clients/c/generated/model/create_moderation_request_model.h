/*
 * create_moderation_request_model.h
 *
 * Two content moderations models are available: &#x60;text-moderation-stable&#x60; and &#x60;text-moderation-latest&#x60;.  The default is &#x60;text-moderation-latest&#x60; which will be automatically upgraded over time. This ensures you are always using our most accurate model. If you use &#x60;text-moderation-stable&#x60;, we will provide advanced notice before updating the model. Accuracy of &#x60;text-moderation-stable&#x60; may be slightly lower than for &#x60;text-moderation-latest&#x60;. 
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

