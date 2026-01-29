/*
 * images_response.h
 *
 * 
 */

#ifndef _images_response_H_
#define _images_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct images_response_t images_response_t;

#include "image.h"



typedef struct images_response_t {
    int created; //numeric
    list_t *data; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} images_response_t;

__attribute__((deprecated)) images_response_t *images_response_create(
    int created,
    list_t *data
);

void images_response_free(images_response_t *images_response);

images_response_t *images_response_parseFromJSON(cJSON *images_responseJSON);

cJSON *images_response_convertToJSON(images_response_t *images_response);

#endif /* _images_response_H_ */

