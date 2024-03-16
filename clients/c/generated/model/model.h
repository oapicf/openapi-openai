/*
 * model.h
 *
 * 
 */

#ifndef _model_H_
#define _model_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct model_t model_t;




typedef struct model_t {
    char *id; // string
    char *object; // string
    int created; //numeric
    char *owned_by; // string

} model_t;

model_t *model_create(
    char *id,
    char *object,
    int created,
    char *owned_by
);

void model_free(model_t *model);

model_t *model_parseFromJSON(cJSON *modelJSON);

cJSON *model_convertToJSON(model_t *model);

#endif /* _model_H_ */

