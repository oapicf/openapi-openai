/*
 * create_edit_response.h
 *
 * 
 */

#ifndef _create_edit_response_H_
#define _create_edit_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_edit_response_t create_edit_response_t;

#include "create_completion_response_usage.h"
#include "create_edit_response_choices_inner.h"



typedef struct create_edit_response_t {
    char *object; // string
    int created; //numeric
    list_t *choices; //nonprimitive container
    struct create_completion_response_usage_t *usage; //model

} create_edit_response_t;

create_edit_response_t *create_edit_response_create(
    char *object,
    int created,
    list_t *choices,
    create_completion_response_usage_t *usage
);

void create_edit_response_free(create_edit_response_t *create_edit_response);

create_edit_response_t *create_edit_response_parseFromJSON(cJSON *create_edit_responseJSON);

cJSON *create_edit_response_convertToJSON(create_edit_response_t *create_edit_response);

#endif /* _create_edit_response_H_ */

