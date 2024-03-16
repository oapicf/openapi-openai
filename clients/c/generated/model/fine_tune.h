/*
 * fine_tune.h
 *
 * 
 */

#ifndef _fine_tune_H_
#define _fine_tune_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct fine_tune_t fine_tune_t;

#include "fine_tune_event.h"
#include "object.h"
#include "open_ai_file.h"



typedef struct fine_tune_t {
    char *id; // string
    char *object; // string
    int created_at; //numeric
    int updated_at; //numeric
    char *model; // string
    char *fine_tuned_model; // string
    char *organization_id; // string
    char *status; // string
    object_t *hyperparams; //object
    list_t *training_files; //nonprimitive container
    list_t *validation_files; //nonprimitive container
    list_t *result_files; //nonprimitive container
    list_t *events; //nonprimitive container

} fine_tune_t;

fine_tune_t *fine_tune_create(
    char *id,
    char *object,
    int created_at,
    int updated_at,
    char *model,
    char *fine_tuned_model,
    char *organization_id,
    char *status,
    object_t *hyperparams,
    list_t *training_files,
    list_t *validation_files,
    list_t *result_files,
    list_t *events
);

void fine_tune_free(fine_tune_t *fine_tune);

fine_tune_t *fine_tune_parseFromJSON(cJSON *fine_tuneJSON);

cJSON *fine_tune_convertToJSON(fine_tune_t *fine_tune);

#endif /* _fine_tune_H_ */

