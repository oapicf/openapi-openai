#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_fine_tuning_job_request_integrations_inner.h"


char* create_fine_tuning_job_request_integrations_inner_type_ToString(openai_api_create_fine_tuning_job_request_integrations_inner_TYPE_e type) {
    char* typeArray[] =  { "NULL", "wandb" };
    return typeArray[type];
}

openai_api_create_fine_tuning_job_request_integrations_inner_TYPE_e create_fine_tuning_job_request_integrations_inner_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "wandb" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static create_fine_tuning_job_request_integrations_inner_t *create_fine_tuning_job_request_integrations_inner_create_internal(
    openai_api_create_fine_tuning_job_request_integrations_inner_TYPE_e type,
    create_fine_tuning_job_request_integrations_inner_wandb_t *wandb
    ) {
    create_fine_tuning_job_request_integrations_inner_t *create_fine_tuning_job_request_integrations_inner_local_var = malloc(sizeof(create_fine_tuning_job_request_integrations_inner_t));
    if (!create_fine_tuning_job_request_integrations_inner_local_var) {
        return NULL;
    }
    create_fine_tuning_job_request_integrations_inner_local_var->type = type;
    create_fine_tuning_job_request_integrations_inner_local_var->wandb = wandb;

    create_fine_tuning_job_request_integrations_inner_local_var->_library_owned = 1;
    return create_fine_tuning_job_request_integrations_inner_local_var;
}

__attribute__((deprecated)) create_fine_tuning_job_request_integrations_inner_t *create_fine_tuning_job_request_integrations_inner_create(
    openai_api_create_fine_tuning_job_request_integrations_inner_TYPE_e type,
    create_fine_tuning_job_request_integrations_inner_wandb_t *wandb
    ) {
    return create_fine_tuning_job_request_integrations_inner_create_internal (
        type,
        wandb
        );
}

void create_fine_tuning_job_request_integrations_inner_free(create_fine_tuning_job_request_integrations_inner_t *create_fine_tuning_job_request_integrations_inner) {
    if(NULL == create_fine_tuning_job_request_integrations_inner){
        return ;
    }
    if(create_fine_tuning_job_request_integrations_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "create_fine_tuning_job_request_integrations_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (create_fine_tuning_job_request_integrations_inner->wandb) {
        create_fine_tuning_job_request_integrations_inner_wandb_free(create_fine_tuning_job_request_integrations_inner->wandb);
        create_fine_tuning_job_request_integrations_inner->wandb = NULL;
    }
    free(create_fine_tuning_job_request_integrations_inner);
}

cJSON *create_fine_tuning_job_request_integrations_inner_convertToJSON(create_fine_tuning_job_request_integrations_inner_t *create_fine_tuning_job_request_integrations_inner) {
    cJSON *item = cJSON_CreateObject();

    // create_fine_tuning_job_request_integrations_inner->type
    if (openai_api_create_fine_tuning_job_request_integrations_inner_TYPE_NULL == create_fine_tuning_job_request_integrations_inner->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", create_fine_tuning_job_request_integrations_inner_type_ToString(create_fine_tuning_job_request_integrations_inner->type)) == NULL)
    {
    goto fail; //Enum
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

    // define the local variable for create_fine_tuning_job_request_integrations_inner->wandb
    create_fine_tuning_job_request_integrations_inner_wandb_t *wandb_local_nonprim = NULL;

    // create_fine_tuning_job_request_integrations_inner->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(create_fine_tuning_job_request_integrations_innerJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_create_fine_tuning_job_request_integrations_inner_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = create_fine_tuning_job_request_integrations_inner_type_FromString(type->valuestring);

    // create_fine_tuning_job_request_integrations_inner->wandb
    cJSON *wandb = cJSON_GetObjectItemCaseSensitive(create_fine_tuning_job_request_integrations_innerJSON, "wandb");
    if (cJSON_IsNull(wandb)) {
        wandb = NULL;
    }
    if (!wandb) {
        goto end;
    }

    
    wandb_local_nonprim = create_fine_tuning_job_request_integrations_inner_wandb_parseFromJSON(wandb); //nonprimitive


    create_fine_tuning_job_request_integrations_inner_local_var = create_fine_tuning_job_request_integrations_inner_create_internal (
        typeVariable,
        wandb_local_nonprim
        );

    return create_fine_tuning_job_request_integrations_inner_local_var;
end:
    if (wandb_local_nonprim) {
        create_fine_tuning_job_request_integrations_inner_wandb_free(wandb_local_nonprim);
        wandb_local_nonprim = NULL;
    }
    return NULL;

}
