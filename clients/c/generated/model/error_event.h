/*
 * error_event.h
 *
 * Occurs when an [error](/docs/guides/error-codes#api-errors) occurs. This can happen due to an internal server error or a timeout.
 */

#ifndef _error_event_H_
#define _error_event_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct error_event_t error_event_t;

#include "error.h"

// Enum EVENT for error_event

typedef enum  { openai_api_error_event_EVENT_NULL = 0, openai_api_error_event_EVENT_error } openai_api_error_event_EVENT_e;

char* error_event_event_ToString(openai_api_error_event_EVENT_e event);

openai_api_error_event_EVENT_e error_event_event_FromString(char* event);



typedef struct error_event_t {
    openai_api_error_event_EVENT_e event; //enum
    struct error_t *data; //model

    int _library_owned; // Is the library responsible for freeing this object?
} error_event_t;

__attribute__((deprecated)) error_event_t *error_event_create(
    openai_api_error_event_EVENT_e event,
    error_t *data
);

void error_event_free(error_event_t *error_event);

error_event_t *error_event_parseFromJSON(cJSON *error_eventJSON);

cJSON *error_event_convertToJSON(error_event_t *error_event);

#endif /* _error_event_H_ */

