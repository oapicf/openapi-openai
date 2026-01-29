#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "fine_tuning_integration.h"


char* fine_tuning_integration_type_ToString(openai_api_fine_tuning_integration_TYPE_e type) {
    char* typeArray[] =  { "NULL", "wandb" };
    return typeArray[type];
}

openai_api_fine_tuning_integration_TYPE_e fine_tuning_integration_type_FromString(char* type){
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

static fine_tuning_integration_t *fine_tuning_integration_create_internal(
    openai_api_fine_tuning_integration_TYPE_e type,
    create_fine_tuning_job_request_integrations_inner_wandb_t *wandb
    ) {
    fine_tuning_integration_t *fine_tuning_integration_local_var = malloc(sizeof(fine_tuning_integration_t));
    if (!fine_tuning_integration_local_var) {
        return NULL;
    }
    fine_tuning_integration_local_var->type = type;
    fine_tuning_integration_local_var->wandb = wandb;

    fine_tuning_integration_local_var->_library_owned = 1;
    return fine_tuning_integration_local_var;
}

__attribute__((deprecated)) fine_tuning_integration_t *fine_tuning_integration_create(
    openai_api_fine_tuning_integration_TYPE_e type,
    create_fine_tuning_job_request_integrations_inner_wandb_t *wandb
    ) {
    return fine_tuning_integration_create_internal (
        type,
        wandb
        );
}

void fine_tuning_integration_free(fine_tuning_integration_t *fine_tuning_integration) {
    if(NULL == fine_tuning_integration){
        return ;
    }
    if(fine_tuning_integration->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "fine_tuning_integration_free");
        return ;
    }
    listEntry_t *listEntry;
    if (fine_tuning_integration->wandb) {
        create_fine_tuning_job_request_integrations_inner_wandb_free(fine_tuning_integration->wandb);
        fine_tuning_integration->wandb = NULL;
    }
    free(fine_tuning_integration);
}

cJSON *fine_tuning_integration_convertToJSON(fine_tuning_integration_t *fine_tuning_integration) {
    cJSON *item = cJSON_CreateObject();

    // fine_tuning_integration->type
    if (openai_api_fine_tuning_integration_TYPE_NULL == fine_tuning_integration->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", fine_tuning_integration_type_ToString(fine_tuning_integration->type)) == NULL)
    {
    goto fail; //Enum
    }


    // fine_tuning_integration->wandb
    if (!fine_tuning_integration->wandb) {
        goto fail;
    }
    cJSON *wandb_local_JSON = create_fine_tuning_job_request_integrations_inner_wandb_convertToJSON(fine_tuning_integration->wandb);
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

fine_tuning_integration_t *fine_tuning_integration_parseFromJSON(cJSON *fine_tuning_integrationJSON){

    fine_tuning_integration_t *fine_tuning_integration_local_var = NULL;

    // define the local variable for fine_tuning_integration->wandb
    create_fine_tuning_job_request_integrations_inner_wandb_t *wandb_local_nonprim = NULL;

    // fine_tuning_integration->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(fine_tuning_integrationJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_fine_tuning_integration_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = fine_tuning_integration_type_FromString(type->valuestring);

    // fine_tuning_integration->wandb
    cJSON *wandb = cJSON_GetObjectItemCaseSensitive(fine_tuning_integrationJSON, "wandb");
    if (cJSON_IsNull(wandb)) {
        wandb = NULL;
    }
    if (!wandb) {
        goto end;
    }

    
    wandb_local_nonprim = create_fine_tuning_job_request_integrations_inner_wandb_parseFromJSON(wandb); //nonprimitive


    fine_tuning_integration_local_var = fine_tuning_integration_create_internal (
        typeVariable,
        wandb_local_nonprim
        );

    return fine_tuning_integration_local_var;
end:
    if (wandb_local_nonprim) {
        create_fine_tuning_job_request_integrations_inner_wandb_free(wandb_local_nonprim);
        wandb_local_nonprim = NULL;
    }
    return NULL;

}
