/*
 * model.h
 *
 * Describes an OpenAI model offering that can be used with the API.
 */

#ifndef _model_H_
#define _model_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct model_t model_t;


// Enum OBJECT for model

typedef enum  { openai_api_model_OBJECT_NULL = 0, openai_api_model_OBJECT_model } openai_api_model_OBJECT_e;

char* model_object_ToString(openai_api_model_OBJECT_e object);

openai_api_model_OBJECT_e model_object_FromString(char* object);



typedef struct model_t {
    char *id; // string
    int created; //numeric
    openai_api_model_OBJECT_e object; //enum
    char *owned_by; // string

} model_t;

model_t *model_create(
    char *id,
    int created,
    openai_api_model_OBJECT_e object,
    char *owned_by
);

void model_free(model_t *model);

model_t *model_parseFromJSON(cJSON *modelJSON);

cJSON *model_convertToJSON(model_t *model);

#endif /* _model_H_ */

