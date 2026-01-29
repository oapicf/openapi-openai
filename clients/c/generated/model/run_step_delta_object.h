/*
 * run_step_delta_object.h
 *
 * Represents a run step delta i.e. any changed fields on a run step during streaming. 
 */

#ifndef _run_step_delta_object_H_
#define _run_step_delta_object_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct run_step_delta_object_t run_step_delta_object_t;

#include "run_step_delta_object_delta.h"

// Enum OBJECT for run_step_delta_object

typedef enum  { openai_api_run_step_delta_object_OBJECT_NULL = 0, openai_api_run_step_delta_object_OBJECT_thread.run.step.delta } openai_api_run_step_delta_object_OBJECT_e;

char* run_step_delta_object_object_ToString(openai_api_run_step_delta_object_OBJECT_e object);

openai_api_run_step_delta_object_OBJECT_e run_step_delta_object_object_FromString(char* object);



typedef struct run_step_delta_object_t {
    char *id; // string
    openai_api_run_step_delta_object_OBJECT_e object; //enum
    struct run_step_delta_object_delta_t *delta; //model

    int _library_owned; // Is the library responsible for freeing this object?
} run_step_delta_object_t;

__attribute__((deprecated)) run_step_delta_object_t *run_step_delta_object_create(
    char *id,
    openai_api_run_step_delta_object_OBJECT_e object,
    run_step_delta_object_delta_t *delta
);

void run_step_delta_object_free(run_step_delta_object_t *run_step_delta_object);

run_step_delta_object_t *run_step_delta_object_parseFromJSON(cJSON *run_step_delta_objectJSON);

cJSON *run_step_delta_object_convertToJSON(run_step_delta_object_t *run_step_delta_object);

#endif /* _run_step_delta_object_H_ */

