/*
 * create_image_edit_request_model.h
 *
 * The model to use for image generation. Only &#x60;dall-e-2&#x60; is supported at this time.
 */

#ifndef _create_image_edit_request_model_H_
#define _create_image_edit_request_model_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_image_edit_request_model_t create_image_edit_request_model_t;




typedef struct create_image_edit_request_model_t {

} create_image_edit_request_model_t;

create_image_edit_request_model_t *create_image_edit_request_model_create(
);

void create_image_edit_request_model_free(create_image_edit_request_model_t *create_image_edit_request_model);

create_image_edit_request_model_t *create_image_edit_request_model_parseFromJSON(cJSON *create_image_edit_request_modelJSON);

cJSON *create_image_edit_request_model_convertToJSON(create_image_edit_request_model_t *create_image_edit_request_model);

#endif /* _create_image_edit_request_model_H_ */

