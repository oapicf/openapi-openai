/*
 * create_moderation_request_input_one_of_inner_one_of_image_url.h
 *
 * Contains either an image URL or a data URL for a base64 encoded image.
 */

#ifndef _create_moderation_request_input_one_of_inner_one_of_image_url_H_
#define _create_moderation_request_input_one_of_inner_one_of_image_url_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_moderation_request_input_one_of_inner_one_of_image_url_t create_moderation_request_input_one_of_inner_one_of_image_url_t;




typedef struct create_moderation_request_input_one_of_inner_one_of_image_url_t {
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} create_moderation_request_input_one_of_inner_one_of_image_url_t;

__attribute__((deprecated)) create_moderation_request_input_one_of_inner_one_of_image_url_t *create_moderation_request_input_one_of_inner_one_of_image_url_create(
    char *url
);

void create_moderation_request_input_one_of_inner_one_of_image_url_free(create_moderation_request_input_one_of_inner_one_of_image_url_t *create_moderation_request_input_one_of_inner_one_of_image_url);

create_moderation_request_input_one_of_inner_one_of_image_url_t *create_moderation_request_input_one_of_inner_one_of_image_url_parseFromJSON(cJSON *create_moderation_request_input_one_of_inner_one_of_image_urlJSON);

cJSON *create_moderation_request_input_one_of_inner_one_of_image_url_convertToJSON(create_moderation_request_input_one_of_inner_one_of_image_url_t *create_moderation_request_input_one_of_inner_one_of_image_url);

#endif /* _create_moderation_request_input_one_of_inner_one_of_image_url_H_ */

