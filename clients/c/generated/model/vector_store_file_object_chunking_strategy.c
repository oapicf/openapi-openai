#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "vector_store_file_object_chunking_strategy.h"


char* vector_store_file_object_chunking_strategy_type_ToString(openai_api_vector_store_file_object_chunking_strategy_TYPE_e type) {
    char* typeArray[] =  { "NULL", "static", "other" };
    return typeArray[type];
}

openai_api_vector_store_file_object_chunking_strategy_TYPE_e vector_store_file_object_chunking_strategy_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "static", "other" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static vector_store_file_object_chunking_strategy_t *vector_store_file_object_chunking_strategy_create_internal(
    openai_api_vector_store_file_object_chunking_strategy_TYPE_e type,
    static_chunking_strategy_t *_static
    ) {
    vector_store_file_object_chunking_strategy_t *vector_store_file_object_chunking_strategy_local_var = malloc(sizeof(vector_store_file_object_chunking_strategy_t));
    if (!vector_store_file_object_chunking_strategy_local_var) {
        return NULL;
    }
    vector_store_file_object_chunking_strategy_local_var->type = type;
    vector_store_file_object_chunking_strategy_local_var->_static = _static;

    vector_store_file_object_chunking_strategy_local_var->_library_owned = 1;
    return vector_store_file_object_chunking_strategy_local_var;
}

__attribute__((deprecated)) vector_store_file_object_chunking_strategy_t *vector_store_file_object_chunking_strategy_create(
    openai_api_vector_store_file_object_chunking_strategy_TYPE_e type,
    static_chunking_strategy_t *_static
    ) {
    return vector_store_file_object_chunking_strategy_create_internal (
        type,
        _static
        );
}

void vector_store_file_object_chunking_strategy_free(vector_store_file_object_chunking_strategy_t *vector_store_file_object_chunking_strategy) {
    if(NULL == vector_store_file_object_chunking_strategy){
        return ;
    }
    if(vector_store_file_object_chunking_strategy->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "vector_store_file_object_chunking_strategy_free");
        return ;
    }
    listEntry_t *listEntry;
    if (vector_store_file_object_chunking_strategy->_static) {
        static_chunking_strategy_free(vector_store_file_object_chunking_strategy->_static);
        vector_store_file_object_chunking_strategy->_static = NULL;
    }
    free(vector_store_file_object_chunking_strategy);
}

cJSON *vector_store_file_object_chunking_strategy_convertToJSON(vector_store_file_object_chunking_strategy_t *vector_store_file_object_chunking_strategy) {
    cJSON *item = cJSON_CreateObject();

    // vector_store_file_object_chunking_strategy->type
    if (openai_api_vector_store_file_object_chunking_strategy_TYPE_NULL == vector_store_file_object_chunking_strategy->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", vector_store_file_object_chunking_strategy_type_ToString(vector_store_file_object_chunking_strategy->type)) == NULL)
    {
    goto fail; //Enum
    }


    // vector_store_file_object_chunking_strategy->_static
    if (!vector_store_file_object_chunking_strategy->_static) {
        goto fail;
    }
    cJSON *_static_local_JSON = static_chunking_strategy_convertToJSON(vector_store_file_object_chunking_strategy->_static);
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

vector_store_file_object_chunking_strategy_t *vector_store_file_object_chunking_strategy_parseFromJSON(cJSON *vector_store_file_object_chunking_strategyJSON){

    vector_store_file_object_chunking_strategy_t *vector_store_file_object_chunking_strategy_local_var = NULL;

    // define the local variable for vector_store_file_object_chunking_strategy->_static
    static_chunking_strategy_t *_static_local_nonprim = NULL;

    // vector_store_file_object_chunking_strategy->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(vector_store_file_object_chunking_strategyJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_vector_store_file_object_chunking_strategy_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = vector_store_file_object_chunking_strategy_type_FromString(type->valuestring);

    // vector_store_file_object_chunking_strategy->_static
    cJSON *_static = cJSON_GetObjectItemCaseSensitive(vector_store_file_object_chunking_strategyJSON, "static");
    if (cJSON_IsNull(_static)) {
        _static = NULL;
    }
    if (!_static) {
        goto end;
    }

    
    _static_local_nonprim = static_chunking_strategy_parseFromJSON(_static); //nonprimitive


    vector_store_file_object_chunking_strategy_local_var = vector_store_file_object_chunking_strategy_create_internal (
        typeVariable,
        _static_local_nonprim
        );

    return vector_store_file_object_chunking_strategy_local_var;
end:
    if (_static_local_nonprim) {
        static_chunking_strategy_free(_static_local_nonprim);
        _static_local_nonprim = NULL;
    }
    return NULL;

}
