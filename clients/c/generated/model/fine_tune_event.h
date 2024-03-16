/*
 * fine_tune_event.h
 *
 * 
 */

#ifndef _fine_tune_event_H_
#define _fine_tune_event_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct fine_tune_event_t fine_tune_event_t;




typedef struct fine_tune_event_t {
    char *object; // string
    int created_at; //numeric
    char *level; // string
    char *message; // string

} fine_tune_event_t;

fine_tune_event_t *fine_tune_event_create(
    char *object,
    int created_at,
    char *level,
    char *message
);

void fine_tune_event_free(fine_tune_event_t *fine_tune_event);

fine_tune_event_t *fine_tune_event_parseFromJSON(cJSON *fine_tune_eventJSON);

cJSON *fine_tune_event_convertToJSON(fine_tune_event_t *fine_tune_event);

#endif /* _fine_tune_event_H_ */

