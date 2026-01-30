/*
 * realtime_server_event_response_output_item_added.h
 *
 * Returned when a new Item is created during Response generation.
 */

#ifndef _realtime_server_event_response_output_item_added_H_
#define _realtime_server_event_response_output_item_added_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct realtime_server_event_response_output_item_added_t realtime_server_event_response_output_item_added_t;

#include "realtime_conversation_item.h"

// Enum TYPE for realtime_server_event_response_output_item_added

typedef enum  { openai_api_realtime_server_event_response_output_item_added_TYPE_NULL = 0, openai_api_realtime_server_event_response_output_item_added_TYPE_response.output_item.added } openai_api_realtime_server_event_response_output_item_added_TYPE_e;

char* realtime_server_event_response_output_item_added_type_ToString(openai_api_realtime_server_event_response_output_item_added_TYPE_e type);

openai_api_realtime_server_event_response_output_item_added_TYPE_e realtime_server_event_response_output_item_added_type_FromString(char* type);



typedef struct realtime_server_event_response_output_item_added_t {
    char *event_id; // string
    openai_api_realtime_server_event_response_output_item_added_TYPE_e type; //enum
    char *response_id; // string
    int output_index; //numeric
    struct realtime_conversation_item_t *item; //model

    int _library_owned; // Is the library responsible for freeing this object?
} realtime_server_event_response_output_item_added_t;

__attribute__((deprecated)) realtime_server_event_response_output_item_added_t *realtime_server_event_response_output_item_added_create(
    char *event_id,
    openai_api_realtime_server_event_response_output_item_added_TYPE_e type,
    char *response_id,
    int output_index,
    realtime_conversation_item_t *item
);

void realtime_server_event_response_output_item_added_free(realtime_server_event_response_output_item_added_t *realtime_server_event_response_output_item_added);

realtime_server_event_response_output_item_added_t *realtime_server_event_response_output_item_added_parseFromJSON(cJSON *realtime_server_event_response_output_item_addedJSON);

cJSON *realtime_server_event_response_output_item_added_convertToJSON(realtime_server_event_response_output_item_added_t *realtime_server_event_response_output_item_added);

#endif /* _realtime_server_event_response_output_item_added_H_ */

