/*
 * list_messages_response.h
 *
 * 
 */

#ifndef _list_messages_response_H_
#define _list_messages_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct list_messages_response_t list_messages_response_t;

#include "message_object.h"



typedef struct list_messages_response_t {
    char *object; // string
    list_t *data; //nonprimitive container
    char *first_id; // string
    char *last_id; // string
    int has_more; //boolean

} list_messages_response_t;

list_messages_response_t *list_messages_response_create(
    char *object,
    list_t *data,
    char *first_id,
    char *last_id,
    int has_more
);

void list_messages_response_free(list_messages_response_t *list_messages_response);

list_messages_response_t *list_messages_response_parseFromJSON(cJSON *list_messages_responseJSON);

cJSON *list_messages_response_convertToJSON(list_messages_response_t *list_messages_response);

#endif /* _list_messages_response_H_ */

