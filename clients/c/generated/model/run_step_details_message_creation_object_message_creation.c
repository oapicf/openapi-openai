#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "run_step_details_message_creation_object_message_creation.h"



static run_step_details_message_creation_object_message_creation_t *run_step_details_message_creation_object_message_creation_create_internal(
    char *message_id
    ) {
    run_step_details_message_creation_object_message_creation_t *run_step_details_message_creation_object_message_creation_local_var = malloc(sizeof(run_step_details_message_creation_object_message_creation_t));
    if (!run_step_details_message_creation_object_message_creation_local_var) {
        return NULL;
    }
    memset(run_step_details_message_creation_object_message_creation_local_var, 0, sizeof(run_step_details_message_creation_object_message_creation_t));
    run_step_details_message_creation_object_message_creation_local_var->_library_owned = 1;
    run_step_details_message_creation_object_message_creation_local_var->message_id = message_id;
    return run_step_details_message_creation_object_message_creation_local_var;
}

__attribute__((deprecated)) run_step_details_message_creation_object_message_creation_t *run_step_details_message_creation_object_message_creation_create(
    char *message_id
    ) {
    run_step_details_message_creation_object_message_creation_t *result = run_step_details_message_creation_object_message_creation_create_internal (
        message_id
        );
    if (!result) {
    }
    return result;
}

void run_step_details_message_creation_object_message_creation_free(run_step_details_message_creation_object_message_creation_t *run_step_details_message_creation_object_message_creation) {
    if(NULL == run_step_details_message_creation_object_message_creation){
        return ;
    }
    if(run_step_details_message_creation_object_message_creation->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "run_step_details_message_creation_object_message_creation_free");
        return ;
    }
    listEntry_t *listEntry;
    if (run_step_details_message_creation_object_message_creation->message_id) {
        free(run_step_details_message_creation_object_message_creation->message_id);
        run_step_details_message_creation_object_message_creation->message_id = NULL;
    }
    free(run_step_details_message_creation_object_message_creation);
}

cJSON *run_step_details_message_creation_object_message_creation_convertToJSON(run_step_details_message_creation_object_message_creation_t *run_step_details_message_creation_object_message_creation) {
    cJSON *item = cJSON_CreateObject();

    // run_step_details_message_creation_object_message_creation->message_id
    if (!run_step_details_message_creation_object_message_creation->message_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "message_id", run_step_details_message_creation_object_message_creation->message_id) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

run_step_details_message_creation_object_message_creation_t *run_step_details_message_creation_object_message_creation_parseFromJSON(cJSON *run_step_details_message_creation_object_message_creationJSON){

    run_step_details_message_creation_object_message_creation_t *run_step_details_message_creation_object_message_creation_local_var = NULL;

    char *message_id_local_str = NULL;

    // run_step_details_message_creation_object_message_creation->message_id
    cJSON *message_id = cJSON_GetObjectItemCaseSensitive(run_step_details_message_creation_object_message_creationJSON, "message_id");
    if (cJSON_IsNull(message_id)) {
        message_id = NULL;
    }
    if (!message_id) {
        goto end;
    }

    
    if(!cJSON_IsString(message_id))
    {
    goto end; //String
    }


    if (message_id && !cJSON_IsNull(message_id)) message_id_local_str = strdup(message_id->valuestring);

    run_step_details_message_creation_object_message_creation_local_var = run_step_details_message_creation_object_message_creation_create_internal (
        message_id_local_str
        );

    if (!run_step_details_message_creation_object_message_creation_local_var) {
        goto end;
    }

    return run_step_details_message_creation_object_message_creation_local_var;
end:
    if (message_id_local_str) {
        free(message_id_local_str);
        message_id_local_str = NULL;
    }
    return NULL;

}
