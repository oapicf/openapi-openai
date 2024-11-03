/*
 * chat_completion_functions.h
 *
 * 
 */

#ifndef _chat_completion_functions_H_
#define _chat_completion_functions_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct chat_completion_functions_t chat_completion_functions_t;

#include "any_type.h"



typedef struct chat_completion_functions_t {
    char *description; // string
    char *name; // string
    list_t* parameters; //map

} chat_completion_functions_t;

chat_completion_functions_t *chat_completion_functions_create(
    char *description,
    char *name,
    list_t* parameters
);

void chat_completion_functions_free(chat_completion_functions_t *chat_completion_functions);

chat_completion_functions_t *chat_completion_functions_parseFromJSON(cJSON *chat_completion_functionsJSON);

cJSON *chat_completion_functions_convertToJSON(chat_completion_functions_t *chat_completion_functions);

#endif /* _chat_completion_functions_H_ */

