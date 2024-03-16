/*
 * images_response_data_inner.h
 *
 * 
 */

#ifndef _images_response_data_inner_H_
#define _images_response_data_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct images_response_data_inner_t images_response_data_inner_t;




typedef struct images_response_data_inner_t {
    char *url; // string
    char *b64_json; // string

} images_response_data_inner_t;

images_response_data_inner_t *images_response_data_inner_create(
    char *url,
    char *b64_json
);

void images_response_data_inner_free(images_response_data_inner_t *images_response_data_inner);

images_response_data_inner_t *images_response_data_inner_parseFromJSON(cJSON *images_response_data_innerJSON);

cJSON *images_response_data_inner_convertToJSON(images_response_data_inner_t *images_response_data_inner);

#endif /* _images_response_data_inner_H_ */

