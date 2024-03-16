/*
 * create_chat_completion_response.h
 *
 * 
 */

#ifndef _create_chat_completion_response_H_
#define _create_chat_completion_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_chat_completion_response_t create_chat_completion_response_t;

#include "create_chat_completion_response_choices_inner.h"
#include "create_completion_response_usage.h"



typedef struct create_chat_completion_response_t {
    char *id; // string
    char *object; // string
    int created; //numeric
    char *model; // string
    list_t *choices; //nonprimitive container
    struct create_completion_response_usage_t *usage; //model

} create_chat_completion_response_t;

create_chat_completion_response_t *create_chat_completion_response_create(
    char *id,
    char *object,
    int created,
    char *model,
    list_t *choices,
    create_completion_response_usage_t *usage
);

void create_chat_completion_response_free(create_chat_completion_response_t *create_chat_completion_response);

create_chat_completion_response_t *create_chat_completion_response_parseFromJSON(cJSON *create_chat_completion_responseJSON);

cJSON *create_chat_completion_response_convertToJSON(create_chat_completion_response_t *create_chat_completion_response);

#endif /* _create_chat_completion_response_H_ */

