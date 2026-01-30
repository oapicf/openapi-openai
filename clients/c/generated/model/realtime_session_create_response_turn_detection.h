/*
 * realtime_session_create_response_turn_detection.h
 *
 * Configuration for turn detection. Can be set to &#x60;null&#x60; to turn off. Server  VAD means that the model will detect the start and end of speech based on  audio volume and respond at the end of user speech. 
 */

#ifndef _realtime_session_create_response_turn_detection_H_
#define _realtime_session_create_response_turn_detection_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct realtime_session_create_response_turn_detection_t realtime_session_create_response_turn_detection_t;




typedef struct realtime_session_create_response_turn_detection_t {
    char *type; // string
    double threshold; //numeric
    int prefix_padding_ms; //numeric
    int silence_duration_ms; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} realtime_session_create_response_turn_detection_t;

__attribute__((deprecated)) realtime_session_create_response_turn_detection_t *realtime_session_create_response_turn_detection_create(
    char *type,
    double threshold,
    int prefix_padding_ms,
    int silence_duration_ms
);

void realtime_session_create_response_turn_detection_free(realtime_session_create_response_turn_detection_t *realtime_session_create_response_turn_detection);

realtime_session_create_response_turn_detection_t *realtime_session_create_response_turn_detection_parseFromJSON(cJSON *realtime_session_create_response_turn_detectionJSON);

cJSON *realtime_session_create_response_turn_detection_convertToJSON(realtime_session_create_response_turn_detection_t *realtime_session_create_response_turn_detection);

#endif /* _realtime_session_create_response_turn_detection_H_ */

