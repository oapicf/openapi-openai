/*
 * realtime_session_model.h
 *
 * The Realtime model used for this session. 
 */

#ifndef _realtime_session_model_H_
#define _realtime_session_model_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct realtime_session_model_t realtime_session_model_t;




typedef struct realtime_session_model_t {

    int _library_owned; // Is the library responsible for freeing this object?
} realtime_session_model_t;

__attribute__((deprecated)) realtime_session_model_t *realtime_session_model_create(
);

void realtime_session_model_free(realtime_session_model_t *realtime_session_model);

realtime_session_model_t *realtime_session_model_parseFromJSON(cJSON *realtime_session_modelJSON);

cJSON *realtime_session_model_convertToJSON(realtime_session_model_t *realtime_session_model);

#endif /* _realtime_session_model_H_ */

