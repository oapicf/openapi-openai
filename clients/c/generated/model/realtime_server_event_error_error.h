/*
 * realtime_server_event_error_error.h
 *
 * Details of the error.
 */

#ifndef _realtime_server_event_error_error_H_
#define _realtime_server_event_error_error_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct realtime_server_event_error_error_t realtime_server_event_error_error_t;




typedef struct realtime_server_event_error_error_t {
    char *type; // string
    char *code; // string
    char *message; // string
    char *param; // string
    char *event_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} realtime_server_event_error_error_t;

__attribute__((deprecated)) realtime_server_event_error_error_t *realtime_server_event_error_error_create(
    char *type,
    char *code,
    char *message,
    char *param,
    char *event_id
);

void realtime_server_event_error_error_free(realtime_server_event_error_error_t *realtime_server_event_error_error);

realtime_server_event_error_error_t *realtime_server_event_error_error_parseFromJSON(cJSON *realtime_server_event_error_errorJSON);

cJSON *realtime_server_event_error_error_convertToJSON(realtime_server_event_error_error_t *realtime_server_event_error_error);

#endif /* _realtime_server_event_error_error_H_ */

