#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "chunking_strategy_request_param.h"


char* chunking_strategy_request_param_type_ToString(openai_api_chunking_strategy_request_param_TYPE_e type) {
    char* typeArray[] =  { "NULL", "auto", "static" };
    return typeArray[type];
}

openai_api_chunking_strategy_request_param_TYPE_e chunking_strategy_request_param_type_FromString(char* type){
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

static chunking_strategy_request_param_t *chunking_strategy_request_param_create_internal(
    openai_api_chunking_strategy_request_param_TYPE_e type,
    static_chunking_strategy_t *_static
    ) {
    chunking_strategy_request_param_t *chunking_strategy_request_param_local_var = malloc(sizeof(chunking_strategy_request_param_t));
    if (!chunking_strategy_request_param_local_var) {
        return NULL;
    }
    chunking_strategy_request_param_local_var->type = type;
    chunking_strategy_request_param_local_var->_static = _static;

    chunking_strategy_request_param_local_var->_library_owned = 1;
    return chunking_strategy_request_param_local_var;
}

__attribute__((deprecated)) chunking_strategy_request_param_t *chunking_strategy_request_param_create(
    openai_api_chunking_strategy_request_param_TYPE_e type,
    static_chunking_strategy_t *_static
    ) {
    return chunking_strategy_request_param_create_internal (
        type,
        _static
        );
}

void chunking_strategy_request_param_free(chunking_strategy_request_param_t *chunking_strategy_request_param) {
    if(NULL == chunking_strategy_request_param){
        return ;
    }
    if(chunking_strategy_request_param->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "chunking_strategy_request_param_free");
        return ;
    }
    listEntry_t *listEntry;
    if (chunking_strategy_request_param->_static) {
        static_chunking_strategy_free(chunking_strategy_request_param->_static);
        chunking_strategy_request_param->_static = NULL;
    }
    free(chunking_strategy_request_param);
}

cJSON *chunking_strategy_request_param_convertToJSON(chunking_strategy_request_param_t *chunking_strategy_request_param) {
    cJSON *item = cJSON_CreateObject();

    // chunking_strategy_request_param->type
    if (openai_api_chunking_strategy_request_param_TYPE_NULL == chunking_strategy_request_param->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", chunking_strategy_request_param_type_ToString(chunking_strategy_request_param->type)) == NULL)
    {
    goto fail; //Enum
    }


    // chunking_strategy_request_param->_static
    if (!chunking_strategy_request_param->_static) {
        goto fail;
    }
    cJSON *_static_local_JSON = static_chunking_strategy_convertToJSON(chunking_strategy_request_param->_static);
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

chunking_strategy_request_param_t *chunking_strategy_request_param_parseFromJSON(cJSON *chunking_strategy_request_paramJSON){

    chunking_strategy_request_param_t *chunking_strategy_request_param_local_var = NULL;

    // define the local variable for chunking_strategy_request_param->_static
    static_chunking_strategy_t *_static_local_nonprim = NULL;

    // chunking_strategy_request_param->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(chunking_strategy_request_paramJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_chunking_strategy_request_param_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = chunking_strategy_request_param_type_FromString(type->valuestring);

    // chunking_strategy_request_param->_static
    cJSON *_static = cJSON_GetObjectItemCaseSensitive(chunking_strategy_request_paramJSON, "static");
    if (cJSON_IsNull(_static)) {
        _static = NULL;
    }
    if (!_static) {
        goto end;
    }

    
    _static_local_nonprim = static_chunking_strategy_parseFromJSON(_static); //nonprimitive


    chunking_strategy_request_param_local_var = chunking_strategy_request_param_create_internal (
        typeVariable,
        _static_local_nonprim
        );

    return chunking_strategy_request_param_local_var;
end:
    if (_static_local_nonprim) {
        static_chunking_strategy_free(_static_local_nonprim);
        _static_local_nonprim = NULL;
    }
    return NULL;

}
