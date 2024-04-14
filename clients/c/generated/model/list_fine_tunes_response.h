/*
 * list_fine_tunes_response.h
 *
 * 
 */

#ifndef _list_fine_tunes_response_H_
#define _list_fine_tunes_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct list_fine_tunes_response_t list_fine_tunes_response_t;

#include "fine_tune.h"



typedef struct list_fine_tunes_response_t {
    char *object; // string
    list_t *data; //nonprimitive container

} list_fine_tunes_response_t;

list_fine_tunes_response_t *list_fine_tunes_response_create(
    char *object,
    list_t *data
);

void list_fine_tunes_response_free(list_fine_tunes_response_t *list_fine_tunes_response);

list_fine_tunes_response_t *list_fine_tunes_response_parseFromJSON(cJSON *list_fine_tunes_responseJSON);

cJSON *list_fine_tunes_response_convertToJSON(list_fine_tunes_response_t *list_fine_tunes_response);

#endif /* _list_fine_tunes_response_H_ */
