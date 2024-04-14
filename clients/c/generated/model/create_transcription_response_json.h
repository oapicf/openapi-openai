/*
 * create_transcription_response_json.h
 *
 * Represents a transcription response returned by model, based on the provided input.
 */

#ifndef _create_transcription_response_json_H_
#define _create_transcription_response_json_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_transcription_response_json_t create_transcription_response_json_t;




typedef struct create_transcription_response_json_t {
    char *text; // string

} create_transcription_response_json_t;

create_transcription_response_json_t *create_transcription_response_json_create(
    char *text
);

void create_transcription_response_json_free(create_transcription_response_json_t *create_transcription_response_json);

create_transcription_response_json_t *create_transcription_response_json_parseFromJSON(cJSON *create_transcription_response_jsonJSON);

cJSON *create_transcription_response_json_convertToJSON(create_transcription_response_json_t *create_transcription_response_json);

#endif /* _create_transcription_response_json_H_ */

