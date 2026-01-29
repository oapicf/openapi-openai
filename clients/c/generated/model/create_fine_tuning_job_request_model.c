#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_fine_tuning_job_request_model.h"



static create_fine_tuning_job_request_model_t *create_fine_tuning_job_request_model_create_internal(
    ) {
    create_fine_tuning_job_request_model_t *create_fine_tuning_job_request_model_local_var = malloc(sizeof(create_fine_tuning_job_request_model_t));
    if (!create_fine_tuning_job_request_model_local_var) {
        return NULL;
    }

    create_fine_tuning_job_request_model_local_var->_library_owned = 1;
    return create_fine_tuning_job_request_model_local_var;
}

__attribute__((deprecated)) create_fine_tuning_job_request_model_t *create_fine_tuning_job_request_model_create(
    ) {
    return create_fine_tuning_job_request_model_create_internal (
        );
}

void create_fine_tuning_job_request_model_free(create_fine_tuning_job_request_model_t *create_fine_tuning_job_request_model) {
    if(NULL == create_fine_tuning_job_request_model){
        return ;
    }
    if(create_fine_tuning_job_request_model->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "create_fine_tuning_job_request_model_free");
        return ;
    }
    listEntry_t *listEntry;
    free(create_fine_tuning_job_request_model);
}

cJSON *create_fine_tuning_job_request_model_convertToJSON(create_fine_tuning_job_request_model_t *create_fine_tuning_job_request_model) {
    cJSON *item = cJSON_CreateObject();
    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

create_fine_tuning_job_request_model_t *create_fine_tuning_job_request_model_parseFromJSON(cJSON *create_fine_tuning_job_request_modelJSON){

    create_fine_tuning_job_request_model_t *create_fine_tuning_job_request_model_local_var = NULL;


    create_fine_tuning_job_request_model_local_var = create_fine_tuning_job_request_model_create_internal (
        );

    return create_fine_tuning_job_request_model_local_var;
end:
    return NULL;

}
