/*
 * create_edit_request_model.h
 *
 * ID of the model to use. You can use the &#x60;text-davinci-edit-001&#x60; or &#x60;code-davinci-edit-001&#x60; model with this endpoint.
 */

#ifndef _create_edit_request_model_H_
#define _create_edit_request_model_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_edit_request_model_t create_edit_request_model_t;




typedef struct create_edit_request_model_t {

} create_edit_request_model_t;

create_edit_request_model_t *create_edit_request_model_create(
);

void create_edit_request_model_free(create_edit_request_model_t *create_edit_request_model);

create_edit_request_model_t *create_edit_request_model_parseFromJSON(cJSON *create_edit_request_modelJSON);

cJSON *create_edit_request_model_convertToJSON(create_edit_request_model_t *create_edit_request_model);

#endif /* _create_edit_request_model_H_ */

