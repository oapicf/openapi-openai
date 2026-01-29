/*
 * done_event.h
 *
 * Occurs when a stream ends.
 */

#ifndef _done_event_H_
#define _done_event_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct done_event_t done_event_t;


// Enum EVENT for done_event

typedef enum  { openai_api_done_event_EVENT_NULL = 0, openai_api_done_event_EVENT_done } openai_api_done_event_EVENT_e;

char* done_event_event_ToString(openai_api_done_event_EVENT_e event);

openai_api_done_event_EVENT_e done_event_event_FromString(char* event);

// Enum DATA for done_event

typedef enum  { openai_api_done_event_DATA_NULL = 0, openai_api_done_event_DATA_[DONE] } openai_api_done_event_DATA_e;

char* done_event_data_ToString(openai_api_done_event_DATA_e data);

openai_api_done_event_DATA_e done_event_data_FromString(char* data);



typedef struct done_event_t {
    openai_api_done_event_EVENT_e event; //enum
    openai_api_done_event_DATA_e data; //enum

    int _library_owned; // Is the library responsible for freeing this object?
} done_event_t;

__attribute__((deprecated)) done_event_t *done_event_create(
    openai_api_done_event_EVENT_e event,
    openai_api_done_event_DATA_e data
);

void done_event_free(done_event_t *done_event);

done_event_t *done_event_parseFromJSON(cJSON *done_eventJSON);

cJSON *done_event_convertToJSON(done_event_t *done_event);

#endif /* _done_event_H_ */

