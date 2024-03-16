/*
 * create_transcription_response.h
 *
 * 
 */

#ifndef _create_transcription_response_H_
#define _create_transcription_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_transcription_response_t create_transcription_response_t;




typedef struct create_transcription_response_t {
    char *text; // string

} create_transcription_response_t;

create_transcription_response_t *create_transcription_response_create(
    char *text
);

void create_transcription_response_free(create_transcription_response_t *create_transcription_response);

create_transcription_response_t *create_transcription_response_parseFromJSON(cJSON *create_transcription_responseJSON);

cJSON *create_transcription_response_convertToJSON(create_transcription_response_t *create_transcription_response);

#endif /* _create_transcription_response_H_ */

