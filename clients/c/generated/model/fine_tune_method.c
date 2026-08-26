#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "fine_tune_method.h"


char* fine_tune_method_type_ToString(openai_api_fine_tune_method_TYPE_e type) {
    char* typeArray[] =  { "NULL", "supervised", "dpo" };
    return typeArray[type];
}

openai_api_fine_tune_method_TYPE_e fine_tune_method_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "supervised", "dpo" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static fine_tune_method_t *fine_tune_method_create_internal(
    openai_api_fine_tune_method_TYPE_e type,
    fine_tune_supervised_method_t *supervised,
    fine_tune_dpo_method_t *dpo
    ) {
    fine_tune_method_t *fine_tune_method_local_var = malloc(sizeof(fine_tune_method_t));
    if (!fine_tune_method_local_var) {
        return NULL;
    }
    memset(fine_tune_method_local_var, 0, sizeof(fine_tune_method_t));
    fine_tune_method_local_var->_library_owned = 1;
    fine_tune_method_local_var->type = type;
    fine_tune_method_local_var->supervised = supervised;
    fine_tune_method_local_var->dpo = dpo;
    return fine_tune_method_local_var;
}

__attribute__((deprecated)) fine_tune_method_t *fine_tune_method_create(
    openai_api_fine_tune_method_TYPE_e type,
    fine_tune_supervised_method_t *supervised,
    fine_tune_dpo_method_t *dpo
    ) {
    fine_tune_method_t *result = fine_tune_method_create_internal (
        type,
        supervised,
        dpo
        );
    if (!result) {
    }
    return result;
}

void fine_tune_method_free(fine_tune_method_t *fine_tune_method) {
    if(NULL == fine_tune_method){
        return ;
    }
    if(fine_tune_method->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "fine_tune_method_free");
        return ;
    }
    listEntry_t *listEntry;
    if (fine_tune_method->supervised) {
        fine_tune_supervised_method_free(fine_tune_method->supervised);
        fine_tune_method->supervised = NULL;
    }
    if (fine_tune_method->dpo) {
        fine_tune_dpo_method_free(fine_tune_method->dpo);
        fine_tune_method->dpo = NULL;
    }
    free(fine_tune_method);
}

cJSON *fine_tune_method_convertToJSON(fine_tune_method_t *fine_tune_method) {
    cJSON *item = cJSON_CreateObject();

    // fine_tune_method->type
    if(fine_tune_method->type != openai_api_fine_tune_method_TYPE_NULL) {
    if(cJSON_AddStringToObject(item, "type", fine_tune_method_type_ToString(fine_tune_method->type)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // fine_tune_method->supervised
    if(fine_tune_method->supervised) {
    cJSON *supervised_local_JSON = fine_tune_supervised_method_convertToJSON(fine_tune_method->supervised);
    if(supervised_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "supervised", supervised_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // fine_tune_method->dpo
    if(fine_tune_method->dpo) {
    cJSON *dpo_local_JSON = fine_tune_dpo_method_convertToJSON(fine_tune_method->dpo);
    if(dpo_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "dpo", dpo_local_JSON);
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

fine_tune_method_t *fine_tune_method_parseFromJSON(cJSON *fine_tune_methodJSON){

    fine_tune_method_t *fine_tune_method_local_var = NULL;

    // define the local variable for fine_tune_method->supervised
    fine_tune_supervised_method_t *supervised_local_nonprim = NULL;

    // define the local variable for fine_tune_method->dpo
    fine_tune_dpo_method_t *dpo_local_nonprim = NULL;

    // fine_tune_method->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(fine_tune_methodJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    openai_api_fine_tune_method_TYPE_e typeVariable;
    if (type) { 
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = fine_tune_method_type_FromString(type->valuestring);
    }

    // fine_tune_method->supervised
    cJSON *supervised = cJSON_GetObjectItemCaseSensitive(fine_tune_methodJSON, "supervised");
    if (cJSON_IsNull(supervised)) {
        supervised = NULL;
    }
    if (supervised) { 
    supervised_local_nonprim = fine_tune_supervised_method_parseFromJSON(supervised); //nonprimitive
    }

    // fine_tune_method->dpo
    cJSON *dpo = cJSON_GetObjectItemCaseSensitive(fine_tune_methodJSON, "dpo");
    if (cJSON_IsNull(dpo)) {
        dpo = NULL;
    }
    if (dpo) { 
    dpo_local_nonprim = fine_tune_dpo_method_parseFromJSON(dpo); //nonprimitive
    }



    fine_tune_method_local_var = fine_tune_method_create_internal (
        type ? typeVariable : openai_api_fine_tune_method_TYPE_NULL,
        supervised ? supervised_local_nonprim : NULL,
        dpo ? dpo_local_nonprim : NULL
        );

    if (!fine_tune_method_local_var) {
        goto end;
    }

    return fine_tune_method_local_var;
end:
    if (supervised_local_nonprim) {
        fine_tune_supervised_method_free(supervised_local_nonprim);
        supervised_local_nonprim = NULL;
    }
    if (dpo_local_nonprim) {
        fine_tune_dpo_method_free(dpo_local_nonprim);
        dpo_local_nonprim = NULL;
    }
    return NULL;

}
