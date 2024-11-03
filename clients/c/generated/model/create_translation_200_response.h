/*
 * create_translation_200_response.h
 *
 * 
 */

#ifndef _create_translation_200_response_H_
#define _create_translation_200_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_translation_200_response_t create_translation_200_response_t;

#include "create_translation_response_json.h"
#include "create_translation_response_verbose_json.h"
#include "transcription_segment.h"



typedef struct create_translation_200_response_t {
    char *text; // string
    char *language; // string
    char *duration; // string
    list_t *segments; //nonprimitive container

} create_translation_200_response_t;

create_translation_200_response_t *create_translation_200_response_create(
    char *text,
    char *language,
    char *duration,
    list_t *segments
);

void create_translation_200_response_free(create_translation_200_response_t *create_translation_200_response);

create_translation_200_response_t *create_translation_200_response_parseFromJSON(cJSON *create_translation_200_responseJSON);

cJSON *create_translation_200_response_convertToJSON(create_translation_200_response_t *create_translation_200_response);

#endif /* _create_translation_200_response_H_ */

