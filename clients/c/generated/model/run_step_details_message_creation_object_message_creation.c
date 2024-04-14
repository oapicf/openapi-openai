#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "run_step_details_message_creation_object_message_creation.h"



run_step_details_message_creation_object_message_creation_t *run_step_details_message_creation_object_message_creation_create(
    char *message_id
    ) {
    run_step_details_message_creation_object_message_creation_t *run_step_details_message_creation_object_message_creation_local_var = malloc(sizeof(run_step_details_message_creation_object_message_creation_t));
    if (!run_step_details_message_creation_object_message_creation_local_var) {
        return NULL;
    }
    run_step_details_message_creation_object_message_creation_local_var->message_id = message_id;

    return run_step_details_message_creation_object_message_creation_local_var;
}


void run_step_details_message_creation_object_message_creation_free(run_step_details_message_creation_object_message_creation_t *run_step_details_message_creation_object_message_creation) {
    if(NULL == run_step_details_message_creation_object_message_creation){
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

    // run_step_details_message_creation_object_message_creation->message_id
    cJSON *message_id = cJSON_GetObjectItemCaseSensitive(run_step_details_message_creation_object_message_creationJSON, "message_id");
    if (!message_id) {
        goto end;
    }

    
    if(!cJSON_IsString(message_id))
    {
    goto end; //String
    }


    run_step_details_message_creation_object_message_creation_local_var = run_step_details_message_creation_object_message_creation_create (
        strdup(message_id->valuestring)
        );

    return run_step_details_message_creation_object_message_creation_local_var;
end:
    return NULL;

}
