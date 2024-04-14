#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_fine_tuning_job_request_integrations_inner_type.h"



create_fine_tuning_job_request_integrations_inner_type_t *create_fine_tuning_job_request_integrations_inner_type_create(
    ) {
    create_fine_tuning_job_request_integrations_inner_type_t *create_fine_tuning_job_request_integrations_inner_type_local_var = malloc(sizeof(create_fine_tuning_job_request_integrations_inner_type_t));
    if (!create_fine_tuning_job_request_integrations_inner_type_local_var) {
        return NULL;
    }

    return create_fine_tuning_job_request_integrations_inner_type_local_var;
}


void create_fine_tuning_job_request_integrations_inner_type_free(create_fine_tuning_job_request_integrations_inner_type_t *create_fine_tuning_job_request_integrations_inner_type) {
    if(NULL == create_fine_tuning_job_request_integrations_inner_type){
        return ;
    }
    listEntry_t *listEntry;
    free(create_fine_tuning_job_request_integrations_inner_type);
}

cJSON *create_fine_tuning_job_request_integrations_inner_type_convertToJSON(create_fine_tuning_job_request_integrations_inner_type_t *create_fine_tuning_job_request_integrations_inner_type) {
    cJSON *item = cJSON_CreateObject();
    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

create_fine_tuning_job_request_integrations_inner_type_t *create_fine_tuning_job_request_integrations_inner_type_parseFromJSON(cJSON *create_fine_tuning_job_request_integrations_inner_typeJSON){

    create_fine_tuning_job_request_integrations_inner_type_t *create_fine_tuning_job_request_integrations_inner_type_local_var = NULL;


    create_fine_tuning_job_request_integrations_inner_type_local_var = create_fine_tuning_job_request_integrations_inner_type_create (
        );

    return create_fine_tuning_job_request_integrations_inner_type_local_var;
end:
    return NULL;

}
