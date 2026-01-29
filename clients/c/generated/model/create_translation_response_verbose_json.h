/*
 * create_translation_response_verbose_json.h
 *
 * 
 */

#ifndef _create_translation_response_verbose_json_H_
#define _create_translation_response_verbose_json_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_translation_response_verbose_json_t create_translation_response_verbose_json_t;

#include "transcription_segment.h"



typedef struct create_translation_response_verbose_json_t {
    char *language; // string
    char *duration; // string
    char *text; // string
    list_t *segments; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} create_translation_response_verbose_json_t;

__attribute__((deprecated)) create_translation_response_verbose_json_t *create_translation_response_verbose_json_create(
    char *language,
    char *duration,
    char *text,
    list_t *segments
);

void create_translation_response_verbose_json_free(create_translation_response_verbose_json_t *create_translation_response_verbose_json);

create_translation_response_verbose_json_t *create_translation_response_verbose_json_parseFromJSON(cJSON *create_translation_response_verbose_jsonJSON);

cJSON *create_translation_response_verbose_json_convertToJSON(create_translation_response_verbose_json_t *create_translation_response_verbose_json);

#endif /* _create_translation_response_verbose_json_H_ */

