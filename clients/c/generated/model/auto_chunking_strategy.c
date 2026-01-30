#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "auto_chunking_strategy.h"


char* auto_chunking_strategy_type_ToString(openai_api_auto_chunking_strategy_TYPE_e type) {
    char* typeArray[] =  { "NULL", "auto" };
    return typeArray[type];
}

openai_api_auto_chunking_strategy_TYPE_e auto_chunking_strategy_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "auto" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static auto_chunking_strategy_t *auto_chunking_strategy_create_internal(
    openai_api_auto_chunking_strategy_TYPE_e type
    ) {
    auto_chunking_strategy_t *auto_chunking_strategy_local_var = malloc(sizeof(auto_chunking_strategy_t));
    if (!auto_chunking_strategy_local_var) {
        return NULL;
    }
    auto_chunking_strategy_local_var->type = type;

    auto_chunking_strategy_local_var->_library_owned = 1;
    return auto_chunking_strategy_local_var;
}

__attribute__((deprecated)) auto_chunking_strategy_t *auto_chunking_strategy_create(
    openai_api_auto_chunking_strategy_TYPE_e type
    ) {
    return auto_chunking_strategy_create_internal (
        type
        );
}

void auto_chunking_strategy_free(auto_chunking_strategy_t *auto_chunking_strategy) {
    if(NULL == auto_chunking_strategy){
        return ;
    }
    if(auto_chunking_strategy->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "auto_chunking_strategy_free");
        return ;
    }
    listEntry_t *listEntry;
    free(auto_chunking_strategy);
}

cJSON *auto_chunking_strategy_convertToJSON(auto_chunking_strategy_t *auto_chunking_strategy) {
    cJSON *item = cJSON_CreateObject();

    // auto_chunking_strategy->type
    if (openai_api_auto_chunking_strategy_TYPE_NULL == auto_chunking_strategy->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", auto_chunking_strategy_type_ToString(auto_chunking_strategy->type)) == NULL)
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

auto_chunking_strategy_t *auto_chunking_strategy_parseFromJSON(cJSON *auto_chunking_strategyJSON){

    auto_chunking_strategy_t *auto_chunking_strategy_local_var = NULL;

    // auto_chunking_strategy->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(auto_chunking_strategyJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_auto_chunking_strategy_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = auto_chunking_strategy_type_FromString(type->valuestring);


    auto_chunking_strategy_local_var = auto_chunking_strategy_create_internal (
        typeVariable
        );

    return auto_chunking_strategy_local_var;
end:
    return NULL;

}
