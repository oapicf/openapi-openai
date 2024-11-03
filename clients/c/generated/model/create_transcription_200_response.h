/*
 * create_transcription_200_response.h
 *
 * 
 */

#ifndef _create_transcription_200_response_H_
#define _create_transcription_200_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_transcription_200_response_t create_transcription_200_response_t;

#include "create_transcription_response_json.h"
#include "create_transcription_response_verbose_json.h"
#include "transcription_segment.h"
#include "transcription_word.h"



typedef struct create_transcription_200_response_t {
    char *text; // string
    char *language; // string
    char *duration; // string
    list_t *words; //nonprimitive container
    list_t *segments; //nonprimitive container

} create_transcription_200_response_t;

create_transcription_200_response_t *create_transcription_200_response_create(
    char *text,
    char *language,
    char *duration,
    list_t *words,
    list_t *segments
);

void create_transcription_200_response_free(create_transcription_200_response_t *create_transcription_200_response);

create_transcription_200_response_t *create_transcription_200_response_parseFromJSON(cJSON *create_transcription_200_responseJSON);

cJSON *create_transcription_200_response_convertToJSON(create_transcription_200_response_t *create_transcription_200_response);

#endif /* _create_transcription_200_response_H_ */

