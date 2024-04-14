#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_fine_tuning_job_request_integrations_inner.h"



create_fine_tuning_job_request_integrations_inner_t *create_fine_tuning_job_request_integrations_inner_create(
    create_fine_tuning_job_request_integrations_inner_type_t *type,
    create_fine_tuning_job_request_integrations_inner_wandb_t *wandb
    ) {
    create_fine_tuning_job_request_integrations_inner_t *create_fine_tuning_job_request_integrations_inner_local_var = malloc(sizeof(create_fine_tuning_job_request_integrations_inner_t));
    if (!create_fine_tuning_job_request_integrations_inner_local_var) {
        return NULL;
    }
    create_fine_tuning_job_request_integrations_inner_local_var->type = type;
    create_fine_tuning_job_request_integrations_inner_local_var->wandb = wandb;

    return create_fine_tuning_job_request_integrations_inner_local_var;
}


void create_fine_tuning_job_request_integrations_inner_free(create_fine_tuning_job_request_integrations_inner_t *create_fine_tuning_job_request_integrations_inner) {
    if(NULL == create_fine_tuning_job_request_integrations_inner){
        return ;
    }
    listEntry_t *listEntry;
    if (create_fine_tuning_job_request_integrations_inner->type) {
        create_fine_tuning_job_request_integrations_inner_type_free(create_fine_tuning_job_request_integrations_inner->type);
        create_fine_tuning_job_request_integrations_inner->type = NULL;
    }
    if (create_fine_tuning_job_request_integrations_inner->wandb) {
        create_fine_tuning_job_request_integrations_inner_wandb_free(create_fine_tuning_job_request_integrations_inner->wandb);
        create_fine_tuning_job_request_integrations_inner->wandb = NULL;
    }
    free(create_fine_tuning_job_request_integrations_inner);
}

cJSON *create_fine_tuning_job_request_integrations_inner_convertToJSON(create_fine_tuning_job_request_integrations_inner_t *create_fine_tuning_job_request_integrations_inner) {
    cJSON *item = cJSON_CreateObject();

    // create_fine_tuning_job_request_integrations_inner->type
    if (!create_fine_tuning_job_request_integrations_inner->type) {
        goto fail;
    }
    cJSON *type_local_JSON = create_fine_tuning_job_request_integrations_inner_type_convertToJSON(create_fine_tuning_job_request_integrations_inner->type);
    if(type_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "type", type_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // create_fine_tuning_job_request_integrations_inner->wandb
    if (!create_fine_tuning_job_request_integrations_inner->wandb) {
        goto fail;
    }
    cJSON *wandb_local_JSON = create_fine_tuning_job_request_integrations_inner_wandb_convertToJSON(create_fine_tuning_job_request_integrations_inner->wandb);
    if(wandb_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "wandb", wandb_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

create_fine_tuning_job_request_integrations_inner_t *create_fine_tuning_job_request_integrations_inner_parseFromJSON(cJSON *create_fine_tuning_job_request_integrations_innerJSON){

    create_fine_tuning_job_request_integrations_inner_t *create_fine_tuning_job_request_integrations_inner_local_var = NULL;

    // define the local variable for create_fine_tuning_job_request_integrations_inner->type
    create_fine_tuning_job_request_integrations_inner_type_t *type_local_nonprim = NULL;

    // define the local variable for create_fine_tuning_job_request_integrations_inner->wandb
    create_fine_tuning_job_request_integrations_inner_wandb_t *wandb_local_nonprim = NULL;

    // create_fine_tuning_job_request_integrations_inner->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(create_fine_tuning_job_request_integrations_innerJSON, "type");
    if (!type) {
        goto end;
    }

    
    type_local_nonprim = create_fine_tuning_job_request_integrations_inner_type_parseFromJSON(type); //nonprimitive

    // create_fine_tuning_job_request_integrations_inner->wandb
    cJSON *wandb = cJSON_GetObjectItemCaseSensitive(create_fine_tuning_job_request_integrations_innerJSON, "wandb");
    if (!wandb) {
        goto end;
    }

    
    wandb_local_nonprim = create_fine_tuning_job_request_integrations_inner_wandb_parseFromJSON(wandb); //nonprimitive


    create_fine_tuning_job_request_integrations_inner_local_var = create_fine_tuning_job_request_integrations_inner_create (
        type_local_nonprim,
        wandb_local_nonprim
        );

    return create_fine_tuning_job_request_integrations_inner_local_var;
end:
    if (type_local_nonprim) {
        create_fine_tuning_job_request_integrations_inner_type_free(type_local_nonprim);
        type_local_nonprim = NULL;
    }
    if (wandb_local_nonprim) {
        create_fine_tuning_job_request_integrations_inner_wandb_free(wandb_local_nonprim);
        wandb_local_nonprim = NULL;
    }
    return NULL;

}
