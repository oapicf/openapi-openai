#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "run_step_delta_object_delta.h"



run_step_delta_object_delta_t *run_step_delta_object_delta_create(
    run_step_delta_object_delta_step_details_t *step_details
    ) {
    run_step_delta_object_delta_t *run_step_delta_object_delta_local_var = malloc(sizeof(run_step_delta_object_delta_t));
    if (!run_step_delta_object_delta_local_var) {
        return NULL;
    }
    run_step_delta_object_delta_local_var->step_details = step_details;

    return run_step_delta_object_delta_local_var;
}


void run_step_delta_object_delta_free(run_step_delta_object_delta_t *run_step_delta_object_delta) {
    if(NULL == run_step_delta_object_delta){
        return ;
    }
    listEntry_t *listEntry;
    if (run_step_delta_object_delta->step_details) {
        run_step_delta_object_delta_step_details_free(run_step_delta_object_delta->step_details);
        run_step_delta_object_delta->step_details = NULL;
    }
    free(run_step_delta_object_delta);
}

cJSON *run_step_delta_object_delta_convertToJSON(run_step_delta_object_delta_t *run_step_delta_object_delta) {
    cJSON *item = cJSON_CreateObject();

    // run_step_delta_object_delta->step_details
    if(run_step_delta_object_delta->step_details) {
    cJSON *step_details_local_JSON = run_step_delta_object_delta_step_details_convertToJSON(run_step_delta_object_delta->step_details);
    if(step_details_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "step_details", step_details_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

run_step_delta_object_delta_t *run_step_delta_object_delta_parseFromJSON(cJSON *run_step_delta_object_deltaJSON){

    run_step_delta_object_delta_t *run_step_delta_object_delta_local_var = NULL;

    // define the local variable for run_step_delta_object_delta->step_details
    run_step_delta_object_delta_step_details_t *step_details_local_nonprim = NULL;

    // run_step_delta_object_delta->step_details
    cJSON *step_details = cJSON_GetObjectItemCaseSensitive(run_step_delta_object_deltaJSON, "step_details");
    if (step_details) { 
    step_details_local_nonprim = run_step_delta_object_delta_step_details_parseFromJSON(step_details); //nonprimitive
    }


    run_step_delta_object_delta_local_var = run_step_delta_object_delta_create (
        step_details ? step_details_local_nonprim : NULL
        );

    return run_step_delta_object_delta_local_var;
end:
    if (step_details_local_nonprim) {
        run_step_delta_object_delta_step_details_free(step_details_local_nonprim);
        step_details_local_nonprim = NULL;
    }
    return NULL;

}
