/*
 * create_speech_request_model.h
 *
 * One of the available [TTS models](/docs/models#tts): &#x60;tts-1&#x60; or &#x60;tts-1-hd&#x60; 
 */

#ifndef _create_speech_request_model_H_
#define _create_speech_request_model_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_speech_request_model_t create_speech_request_model_t;




typedef struct create_speech_request_model_t {

    int _library_owned; // Is the library responsible for freeing this object?
} create_speech_request_model_t;

__attribute__((deprecated)) create_speech_request_model_t *create_speech_request_model_create(
);

void create_speech_request_model_free(create_speech_request_model_t *create_speech_request_model);

create_speech_request_model_t *create_speech_request_model_parseFromJSON(cJSON *create_speech_request_modelJSON);

cJSON *create_speech_request_model_convertToJSON(create_speech_request_model_t *create_speech_request_model);

#endif /* _create_speech_request_model_H_ */

