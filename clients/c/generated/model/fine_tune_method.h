/*
 * fine_tune_method.h
 *
 * The method used for fine-tuning.
 */

#ifndef _fine_tune_method_H_
#define _fine_tune_method_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct fine_tune_method_t fine_tune_method_t;

#include "fine_tune_dpo_method.h"
#include "fine_tune_supervised_method.h"

// Enum TYPE for fine_tune_method

typedef enum  { openai_api_fine_tune_method_TYPE_NULL = 0, openai_api_fine_tune_method_TYPE_supervised, openai_api_fine_tune_method_TYPE_dpo } openai_api_fine_tune_method_TYPE_e;

char* fine_tune_method_type_ToString(openai_api_fine_tune_method_TYPE_e type);

openai_api_fine_tune_method_TYPE_e fine_tune_method_type_FromString(char* type);



typedef struct fine_tune_method_t {
    openai_api_fine_tune_method_TYPE_e type; //enum
    fine_tune_supervised_method_t *supervised; //object
    fine_tune_dpo_method_t *dpo; //object

    int _library_owned; // Is the library responsible for freeing this object?
} fine_tune_method_t;

__attribute__((deprecated)) fine_tune_method_t *fine_tune_method_create(
    openai_api_fine_tune_method_TYPE_e type,
    fine_tune_supervised_method_t *supervised,
    fine_tune_dpo_method_t *dpo
);

void fine_tune_method_free(fine_tune_method_t *fine_tune_method);

fine_tune_method_t *fine_tune_method_parseFromJSON(cJSON *fine_tune_methodJSON);

cJSON *fine_tune_method_convertToJSON(fine_tune_method_t *fine_tune_method);

#endif /* _fine_tune_method_H_ */

