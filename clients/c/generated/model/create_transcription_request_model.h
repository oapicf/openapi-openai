/*
 * create_transcription_request_model.h
 *
 * ID of the model to use. Only &#x60;whisper-1&#x60; (which is powered by our open source Whisper V2 model) is currently available. 
 */

#ifndef _create_transcription_request_model_H_
#define _create_transcription_request_model_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_transcription_request_model_t create_transcription_request_model_t;




typedef struct create_transcription_request_model_t {

} create_transcription_request_model_t;

create_transcription_request_model_t *create_transcription_request_model_create(
);

void create_transcription_request_model_free(create_transcription_request_model_t *create_transcription_request_model);

create_transcription_request_model_t *create_transcription_request_model_parseFromJSON(cJSON *create_transcription_request_modelJSON);

cJSON *create_transcription_request_model_convertToJSON(create_transcription_request_model_t *create_transcription_request_model);

#endif /* _create_transcription_request_model_H_ */

