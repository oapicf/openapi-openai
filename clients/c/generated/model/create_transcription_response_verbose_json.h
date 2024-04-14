/*
 * create_transcription_response_verbose_json.h
 *
 * Represents a verbose json transcription response returned by model, based on the provided input.
 */

#ifndef _create_transcription_response_verbose_json_H_
#define _create_transcription_response_verbose_json_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_transcription_response_verbose_json_t create_transcription_response_verbose_json_t;

#include "transcription_segment.h"
#include "transcription_word.h"



typedef struct create_transcription_response_verbose_json_t {
    char *language; // string
    char *duration; // string
    char *text; // string
    list_t *words; //nonprimitive container
    list_t *segments; //nonprimitive container

} create_transcription_response_verbose_json_t;

create_transcription_response_verbose_json_t *create_transcription_response_verbose_json_create(
    char *language,
    char *duration,
    char *text,
    list_t *words,
    list_t *segments
);

void create_transcription_response_verbose_json_free(create_transcription_response_verbose_json_t *create_transcription_response_verbose_json);

create_transcription_response_verbose_json_t *create_transcription_response_verbose_json_parseFromJSON(cJSON *create_transcription_response_verbose_jsonJSON);

cJSON *create_transcription_response_verbose_json_convertToJSON(create_transcription_response_verbose_json_t *create_transcription_response_verbose_json);

#endif /* _create_transcription_response_verbose_json_H_ */

