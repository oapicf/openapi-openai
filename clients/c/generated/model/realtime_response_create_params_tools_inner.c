#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "realtime_response_create_params_tools_inner.h"


char* realtime_response_create_params_tools_inner_type_ToString(openai_api_realtime_response_create_params_tools_inner_TYPE_e type) {
    char* typeArray[] =  { "NULL", "function" };
    return typeArray[type];
}

openai_api_realtime_response_create_params_tools_inner_TYPE_e realtime_response_create_params_tools_inner_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "function" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static realtime_response_create_params_tools_inner_t *realtime_response_create_params_tools_inner_create_internal(
    openai_api_realtime_response_create_params_tools_inner_TYPE_e type,
    char *name,
    char *description,
    object_t *parameters
    ) {
    realtime_response_create_params_tools_inner_t *realtime_response_create_params_tools_inner_local_var = malloc(sizeof(realtime_response_create_params_tools_inner_t));
    if (!realtime_response_create_params_tools_inner_local_var) {
        return NULL;
    }
    realtime_response_create_params_tools_inner_local_var->type = type;
    realtime_response_create_params_tools_inner_local_var->name = name;
    realtime_response_create_params_tools_inner_local_var->description = description;
    realtime_response_create_params_tools_inner_local_var->parameters = parameters;

    realtime_response_create_params_tools_inner_local_var->_library_owned = 1;
    return realtime_response_create_params_tools_inner_local_var;
}

__attribute__((deprecated)) realtime_response_create_params_tools_inner_t *realtime_response_create_params_tools_inner_create(
    openai_api_realtime_response_create_params_tools_inner_TYPE_e type,
    char *name,
    char *description,
    object_t *parameters
    ) {
    return realtime_response_create_params_tools_inner_create_internal (
        type,
        name,
        description,
        parameters
        );
}

void realtime_response_create_params_tools_inner_free(realtime_response_create_params_tools_inner_t *realtime_response_create_params_tools_inner) {
    if(NULL == realtime_response_create_params_tools_inner){
        return ;
    }
    if(realtime_response_create_params_tools_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "realtime_response_create_params_tools_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (realtime_response_create_params_tools_inner->name) {
        free(realtime_response_create_params_tools_inner->name);
        realtime_response_create_params_tools_inner->name = NULL;
    }
    if (realtime_response_create_params_tools_inner->description) {
        free(realtime_response_create_params_tools_inner->description);
        realtime_response_create_params_tools_inner->description = NULL;
    }
    if (realtime_response_create_params_tools_inner->parameters) {
        object_free(realtime_response_create_params_tools_inner->parameters);
        realtime_response_create_params_tools_inner->parameters = NULL;
    }
    free(realtime_response_create_params_tools_inner);
}

cJSON *realtime_response_create_params_tools_inner_convertToJSON(realtime_response_create_params_tools_inner_t *realtime_response_create_params_tools_inner) {
    cJSON *item = cJSON_CreateObject();

    // realtime_response_create_params_tools_inner->type
    if(realtime_response_create_params_tools_inner->type != openai_api_realtime_response_create_params_tools_inner_TYPE_NULL) {
    if(cJSON_AddStringToObject(item, "type", realtime_response_create_params_tools_inner_type_ToString(realtime_response_create_params_tools_inner->type)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // realtime_response_create_params_tools_inner->name
    if(realtime_response_create_params_tools_inner->name) {
    if(cJSON_AddStringToObject(item, "name", realtime_response_create_params_tools_inner->name) == NULL) {
    goto fail; //String
    }
    }


    // realtime_response_create_params_tools_inner->description
    if(realtime_response_create_params_tools_inner->description) {
    if(cJSON_AddStringToObject(item, "description", realtime_response_create_params_tools_inner->description) == NULL) {
    goto fail; //String
    }
    }


    // realtime_response_create_params_tools_inner->parameters
    if(realtime_response_create_params_tools_inner->parameters) {
    cJSON *parameters_object = object_convertToJSON(realtime_response_create_params_tools_inner->parameters);
    if(parameters_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "parameters", parameters_object);
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

realtime_response_create_params_tools_inner_t *realtime_response_create_params_tools_inner_parseFromJSON(cJSON *realtime_response_create_params_tools_innerJSON){

    realtime_response_create_params_tools_inner_t *realtime_response_create_params_tools_inner_local_var = NULL;

    // realtime_response_create_params_tools_inner->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(realtime_response_create_params_tools_innerJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    openai_api_realtime_response_create_params_tools_inner_TYPE_e typeVariable;
    if (type) { 
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = realtime_response_create_params_tools_inner_type_FromString(type->valuestring);
    }

    // realtime_response_create_params_tools_inner->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(realtime_response_create_params_tools_innerJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // realtime_response_create_params_tools_inner->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(realtime_response_create_params_tools_innerJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // realtime_response_create_params_tools_inner->parameters
    cJSON *parameters = cJSON_GetObjectItemCaseSensitive(realtime_response_create_params_tools_innerJSON, "parameters");
    if (cJSON_IsNull(parameters)) {
        parameters = NULL;
    }
    object_t *parameters_local_object = NULL;
    if (parameters) { 
    parameters_local_object = object_parseFromJSON(parameters); //object
    }


    realtime_response_create_params_tools_inner_local_var = realtime_response_create_params_tools_inner_create_internal (
        type ? typeVariable : openai_api_realtime_response_create_params_tools_inner_TYPE_NULL,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        description && !cJSON_IsNull(description) ? strdup(description->valuestring) : NULL,
        parameters ? parameters_local_object : NULL
        );

    return realtime_response_create_params_tools_inner_local_var;
end:
    return NULL;

}
