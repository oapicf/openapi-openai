/*
 * run_step_details_message_creation_object_message_creation.h
 *
 * 
 */

#ifndef _run_step_details_message_creation_object_message_creation_H_
#define _run_step_details_message_creation_object_message_creation_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct run_step_details_message_creation_object_message_creation_t run_step_details_message_creation_object_message_creation_t;




typedef struct run_step_details_message_creation_object_message_creation_t {
    char *message_id; // string

} run_step_details_message_creation_object_message_creation_t;

run_step_details_message_creation_object_message_creation_t *run_step_details_message_creation_object_message_creation_create(
    char *message_id
);

void run_step_details_message_creation_object_message_creation_free(run_step_details_message_creation_object_message_creation_t *run_step_details_message_creation_object_message_creation);

run_step_details_message_creation_object_message_creation_t *run_step_details_message_creation_object_message_creation_parseFromJSON(cJSON *run_step_details_message_creation_object_message_creationJSON);

cJSON *run_step_details_message_creation_object_message_creation_convertToJSON(run_step_details_message_creation_object_message_creation_t *run_step_details_message_creation_object_message_creation);

#endif /* _run_step_details_message_creation_object_message_creation_H_ */

