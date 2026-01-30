#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_vector_store_request_chunking_strategy.h"


char* create_vector_store_request_chunking_strategy_type_ToString(openai_api_create_vector_store_request_chunking_strategy_TYPE_e type) {
    char* typeArray[] =  { "NULL", "auto", "static" };
    return typeArray[type];
}

openai_api_create_vector_store_request_chunking_strategy_TYPE_e create_vector_store_request_chunking_strategy_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "auto", "static" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static create_vector_store_request_chunking_strategy_t *create_vector_store_request_chunking_strategy_create_internal(
    openai_api_create_vector_store_request_chunking_strategy_TYPE_e type,
    static_chunking_strategy_t *_static
    ) {
    create_vector_store_request_chunking_strategy_t *create_vector_store_request_chunking_strategy_local_var = malloc(sizeof(create_vector_store_request_chunking_strategy_t));
    if (!create_vector_store_request_chunking_strategy_local_var) {
        return NULL;
    }
    create_vector_store_request_chunking_strategy_local_var->type = type;
    create_vector_store_request_chunking_strategy_local_var->_static = _static;

    create_vector_store_request_chunking_strategy_local_var->_library_owned = 1;
    return create_vector_store_request_chunking_strategy_local_var;
}

__attribute__((deprecated)) create_vector_store_request_chunking_strategy_t *create_vector_store_request_chunking_strategy_create(
    openai_api_create_vector_store_request_chunking_strategy_TYPE_e type,
    static_chunking_strategy_t *_static
    ) {
    return create_vector_store_request_chunking_strategy_create_internal (
        type,
        _static
        );
}

void create_vector_store_request_chunking_strategy_free(create_vector_store_request_chunking_strategy_t *create_vector_store_request_chunking_strategy) {
    if(NULL == create_vector_store_request_chunking_strategy){
        return ;
    }
    if(create_vector_store_request_chunking_strategy->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "create_vector_store_request_chunking_strategy_free");
        return ;
    }
    listEntry_t *listEntry;
    if (create_vector_store_request_chunking_strategy->_static) {
        static_chunking_strategy_free(create_vector_store_request_chunking_strategy->_static);
        create_vector_store_request_chunking_strategy->_static = NULL;
    }
    free(create_vector_store_request_chunking_strategy);
}

cJSON *create_vector_store_request_chunking_strategy_convertToJSON(create_vector_store_request_chunking_strategy_t *create_vector_store_request_chunking_strategy) {
    cJSON *item = cJSON_CreateObject();

    // create_vector_store_request_chunking_strategy->type
    if (openai_api_create_vector_store_request_chunking_strategy_TYPE_NULL == create_vector_store_request_chunking_strategy->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", create_vector_store_request_chunking_strategy_type_ToString(create_vector_store_request_chunking_strategy->type)) == NULL)
    {
    goto fail; //Enum
    }


    // create_vector_store_request_chunking_strategy->_static
    if (!create_vector_store_request_chunking_strategy->_static) {
        goto fail;
    }
    cJSON *_static_local_JSON = static_chunking_strategy_convertToJSON(create_vector_store_request_chunking_strategy->_static);
    if(_static_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "static", _static_local_JSON);
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

create_vector_store_request_chunking_strategy_t *create_vector_store_request_chunking_strategy_parseFromJSON(cJSON *create_vector_store_request_chunking_strategyJSON){

    create_vector_store_request_chunking_strategy_t *create_vector_store_request_chunking_strategy_local_var = NULL;

    // define the local variable for create_vector_store_request_chunking_strategy->_static
    static_chunking_strategy_t *_static_local_nonprim = NULL;

    // create_vector_store_request_chunking_strategy->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(create_vector_store_request_chunking_strategyJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_create_vector_store_request_chunking_strategy_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = create_vector_store_request_chunking_strategy_type_FromString(type->valuestring);

    // create_vector_store_request_chunking_strategy->_static
    cJSON *_static = cJSON_GetObjectItemCaseSensitive(create_vector_store_request_chunking_strategyJSON, "static");
    if (cJSON_IsNull(_static)) {
        _static = NULL;
    }
    if (!_static) {
        goto end;
    }

    
    _static_local_nonprim = static_chunking_strategy_parseFromJSON(_static); //nonprimitive


    create_vector_store_request_chunking_strategy_local_var = create_vector_store_request_chunking_strategy_create_internal (
        typeVariable,
        _static_local_nonprim
        );

    return create_vector_store_request_chunking_strategy_local_var;
end:
    if (_static_local_nonprim) {
        static_chunking_strategy_free(_static_local_nonprim);
        _static_local_nonprim = NULL;
    }
    return NULL;

}
