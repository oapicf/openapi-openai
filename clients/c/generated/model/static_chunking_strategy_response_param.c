#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "static_chunking_strategy_response_param.h"


char* static_chunking_strategy_response_param_type_ToString(openai_api_static_chunking_strategy_response_param_TYPE_e type) {
    char* typeArray[] =  { "NULL", "static" };
    return typeArray[type];
}

openai_api_static_chunking_strategy_response_param_TYPE_e static_chunking_strategy_response_param_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "static" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static static_chunking_strategy_response_param_t *static_chunking_strategy_response_param_create_internal(
    openai_api_static_chunking_strategy_response_param_TYPE_e type,
    static_chunking_strategy_t *_static
    ) {
    static_chunking_strategy_response_param_t *static_chunking_strategy_response_param_local_var = malloc(sizeof(static_chunking_strategy_response_param_t));
    if (!static_chunking_strategy_response_param_local_var) {
        return NULL;
    }
    static_chunking_strategy_response_param_local_var->type = type;
    static_chunking_strategy_response_param_local_var->_static = _static;

    static_chunking_strategy_response_param_local_var->_library_owned = 1;
    return static_chunking_strategy_response_param_local_var;
}

__attribute__((deprecated)) static_chunking_strategy_response_param_t *static_chunking_strategy_response_param_create(
    openai_api_static_chunking_strategy_response_param_TYPE_e type,
    static_chunking_strategy_t *_static
    ) {
    return static_chunking_strategy_response_param_create_internal (
        type,
        _static
        );
}

void static_chunking_strategy_response_param_free(static_chunking_strategy_response_param_t *static_chunking_strategy_response_param) {
    if(NULL == static_chunking_strategy_response_param){
        return ;
    }
    if(static_chunking_strategy_response_param->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "static_chunking_strategy_response_param_free");
        return ;
    }
    listEntry_t *listEntry;
    if (static_chunking_strategy_response_param->_static) {
        static_chunking_strategy_free(static_chunking_strategy_response_param->_static);
        static_chunking_strategy_response_param->_static = NULL;
    }
    free(static_chunking_strategy_response_param);
}

cJSON *static_chunking_strategy_response_param_convertToJSON(static_chunking_strategy_response_param_t *static_chunking_strategy_response_param) {
    cJSON *item = cJSON_CreateObject();

    // static_chunking_strategy_response_param->type
    if (openai_api_static_chunking_strategy_response_param_TYPE_NULL == static_chunking_strategy_response_param->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", static_chunking_strategy_response_param_type_ToString(static_chunking_strategy_response_param->type)) == NULL)
    {
    goto fail; //Enum
    }


    // static_chunking_strategy_response_param->_static
    if (!static_chunking_strategy_response_param->_static) {
        goto fail;
    }
    cJSON *_static_local_JSON = static_chunking_strategy_convertToJSON(static_chunking_strategy_response_param->_static);
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

static_chunking_strategy_response_param_t *static_chunking_strategy_response_param_parseFromJSON(cJSON *static_chunking_strategy_response_paramJSON){

    static_chunking_strategy_response_param_t *static_chunking_strategy_response_param_local_var = NULL;

    // define the local variable for static_chunking_strategy_response_param->_static
    static_chunking_strategy_t *_static_local_nonprim = NULL;

    // static_chunking_strategy_response_param->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(static_chunking_strategy_response_paramJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_static_chunking_strategy_response_param_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = static_chunking_strategy_response_param_type_FromString(type->valuestring);

    // static_chunking_strategy_response_param->_static
    cJSON *_static = cJSON_GetObjectItemCaseSensitive(static_chunking_strategy_response_paramJSON, "static");
    if (cJSON_IsNull(_static)) {
        _static = NULL;
    }
    if (!_static) {
        goto end;
    }

    
    _static_local_nonprim = static_chunking_strategy_parseFromJSON(_static); //nonprimitive


    static_chunking_strategy_response_param_local_var = static_chunking_strategy_response_param_create_internal (
        typeVariable,
        _static_local_nonprim
        );

    return static_chunking_strategy_response_param_local_var;
end:
    if (_static_local_nonprim) {
        static_chunking_strategy_free(_static_local_nonprim);
        _static_local_nonprim = NULL;
    }
    return NULL;

}
