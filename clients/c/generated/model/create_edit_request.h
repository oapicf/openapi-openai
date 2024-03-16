/*
 * create_edit_request.h
 *
 * 
 */

#ifndef _create_edit_request_H_
#define _create_edit_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_edit_request_t create_edit_request_t;

#include "create_edit_request_model.h"



typedef struct create_edit_request_t {
    struct create_edit_request_model_t *model; //model
    char *input; // string
    char *instruction; // string
    int n; //numeric
    double temperature; //numeric
    double top_p; //numeric

} create_edit_request_t;

create_edit_request_t *create_edit_request_create(
    create_edit_request_model_t *model,
    char *input,
    char *instruction,
    int n,
    double temperature,
    double top_p
);

void create_edit_request_free(create_edit_request_t *create_edit_request);

create_edit_request_t *create_edit_request_parseFromJSON(cJSON *create_edit_requestJSON);

cJSON *create_edit_request_convertToJSON(create_edit_request_t *create_edit_request);

#endif /* _create_edit_request_H_ */

