#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "other_chunking_strategy_response_param.h"


char* other_chunking_strategy_response_param_type_ToString(openai_api_other_chunking_strategy_response_param_TYPE_e type) {
    char* typeArray[] =  { "NULL", "other" };
    return typeArray[type];
}

openai_api_other_chunking_strategy_response_param_TYPE_e other_chunking_strategy_response_param_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "other" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static other_chunking_strategy_response_param_t *other_chunking_strategy_response_param_create_internal(
    openai_api_other_chunking_strategy_response_param_TYPE_e type
    ) {
    other_chunking_strategy_response_param_t *other_chunking_strategy_response_param_local_var = malloc(sizeof(other_chunking_strategy_response_param_t));
    if (!other_chunking_strategy_response_param_local_var) {
        return NULL;
    }
    other_chunking_strategy_response_param_local_var->type = type;

    other_chunking_strategy_response_param_local_var->_library_owned = 1;
    return other_chunking_strategy_response_param_local_var;
}

__attribute__((deprecated)) other_chunking_strategy_response_param_t *other_chunking_strategy_response_param_create(
    openai_api_other_chunking_strategy_response_param_TYPE_e type
    ) {
    return other_chunking_strategy_response_param_create_internal (
        type
        );
}

void other_chunking_strategy_response_param_free(other_chunking_strategy_response_param_t *other_chunking_strategy_response_param) {
    if(NULL == other_chunking_strategy_response_param){
        return ;
    }
    if(other_chunking_strategy_response_param->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "other_chunking_strategy_response_param_free");
        return ;
    }
    listEntry_t *listEntry;
    free(other_chunking_strategy_response_param);
}

cJSON *other_chunking_strategy_response_param_convertToJSON(other_chunking_strategy_response_param_t *other_chunking_strategy_response_param) {
    cJSON *item = cJSON_CreateObject();

    // other_chunking_strategy_response_param->type
    if (openai_api_other_chunking_strategy_response_param_TYPE_NULL == other_chunking_strategy_response_param->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", other_chunking_strategy_response_param_type_ToString(other_chunking_strategy_response_param->type)) == NULL)
    {
    goto fail; //Enum
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

other_chunking_strategy_response_param_t *other_chunking_strategy_response_param_parseFromJSON(cJSON *other_chunking_strategy_response_paramJSON){

    other_chunking_strategy_response_param_t *other_chunking_strategy_response_param_local_var = NULL;

    // other_chunking_strategy_response_param->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(other_chunking_strategy_response_paramJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_other_chunking_strategy_response_param_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = other_chunking_strategy_response_param_type_FromString(type->valuestring);


    other_chunking_strategy_response_param_local_var = other_chunking_strategy_response_param_create_internal (
        typeVariable
        );

    return other_chunking_strategy_response_param_local_var;
end:
    return NULL;

}
