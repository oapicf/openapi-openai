#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "function_object.h"



static function_object_t *function_object_create_internal(
    char *description,
    char *name,
    list_t* parameters,
    int *strict
    ) {
    function_object_t *function_object_local_var = malloc(sizeof(function_object_t));
    if (!function_object_local_var) {
        return NULL;
    }
    memset(function_object_local_var, 0, sizeof(function_object_t));
    function_object_local_var->_library_owned = 1;
    function_object_local_var->description = description;
    function_object_local_var->name = name;
    function_object_local_var->parameters = parameters;
    function_object_local_var->strict = strict;
    return function_object_local_var;
}

__attribute__((deprecated)) function_object_t *function_object_create(
    char *description,
    char *name,
    list_t* parameters,
    int *strict
    ) {
    int *strict_copy = NULL;
    if (strict) {
        strict_copy = malloc(sizeof(int));
        if (strict_copy) *strict_copy = *strict;
    }
    function_object_t *result = function_object_create_internal (
        description,
        name,
        parameters,
        strict_copy
        );
    if (!result) {
        free(strict_copy);
    }
    return result;
}

void function_object_free(function_object_t *function_object) {
    if(NULL == function_object){
        return ;
    }
    if(function_object->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "function_object_free");
        return ;
    }
    listEntry_t *listEntry;
    if (function_object->description) {
        free(function_object->description);
        function_object->description = NULL;
    }
    if (function_object->name) {
        free(function_object->name);
        function_object->name = NULL;
    }
    if (function_object->parameters) {
        list_ForEach(listEntry, function_object->parameters) {
            keyValuePair_t *localKeyValue = listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_freeList(function_object->parameters);
        function_object->parameters = NULL;
    }
    if (function_object->strict) {
        free(function_object->strict);
        function_object->strict = NULL;
    }
    free(function_object);
}

cJSON *function_object_convertToJSON(function_object_t *function_object) {
    cJSON *item = cJSON_CreateObject();

    // function_object->description
    if(function_object->description) {
    if(cJSON_AddStringToObject(item, "description", function_object->description) == NULL) {
    goto fail; //String
    }
    }


    // function_object->name
    if (!function_object->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", function_object->name) == NULL) {
    goto fail; //String
    }


    // function_object->parameters
    if(function_object->parameters) {
    cJSON *parameters = cJSON_AddObjectToObject(item, "parameters");
    if(parameters == NULL) {
        goto fail; //primitive map container
    }
    cJSON *localMapObject = parameters;
    listEntry_t *parametersListEntry;
    if (function_object->parameters) {
    list_ForEach(parametersListEntry, function_object->parameters) {
        keyValuePair_t *localKeyValue = parametersListEntry->data;
    }
    }
    }


    // function_object->strict
    if(function_object->strict) {
    if(cJSON_AddBoolToObject(item, "strict", *function_object->strict) == NULL) {
    goto fail; //Bool
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

function_object_t *function_object_parseFromJSON(cJSON *function_objectJSON){

    function_object_t *function_object_local_var = NULL;

    char *description_local_str = NULL;

    char *name_local_str = NULL;

    // define the local map for function_object->parameters
    list_t *parametersList = NULL;

    // define the local variable for function_object->strict
    int *strict_local_var = NULL;

    // function_object->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(function_objectJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // function_object->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(function_objectJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // function_object->parameters
    cJSON *parameters = cJSON_GetObjectItemCaseSensitive(function_objectJSON, "parameters");
    if (cJSON_IsNull(parameters)) {
        parameters = NULL;
    }
    if (parameters) { 
    cJSON *parameters_local_map = NULL;
    if(!cJSON_IsObject(parameters) && !cJSON_IsNull(parameters))
    {
        goto end;//primitive map container
    }
    if(cJSON_IsObject(parameters))
    {
        parametersList = list_createList();
        keyValuePair_t *localMapKeyPair;
        cJSON_ArrayForEach(parameters_local_map, parameters)
        {
            cJSON *localMapObject = parameters_local_map;
            list_addElement(parametersList , localMapKeyPair);
        }
    }
    }

    // function_object->strict
    cJSON *strict = cJSON_GetObjectItemCaseSensitive(function_objectJSON, "strict");
    if (cJSON_IsNull(strict)) {
        strict = NULL;
    }
    if (strict) { 
    if(!cJSON_IsBool(strict))
    {
    goto end; //Bool
    }
    strict_local_var = malloc(sizeof(int));
    if(!strict_local_var)
    {
        goto end;
    }
    *strict_local_var = strict->valueint;
    }


    if (description && !cJSON_IsNull(description)) description_local_str = strdup(description->valuestring);
    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);

    function_object_local_var = function_object_create_internal (
        description_local_str,
        name_local_str,
        parameters ? parametersList : NULL,
        strict_local_var
        );

    if (!function_object_local_var) {
        goto end;
    }

    return function_object_local_var;
end:
    if (description_local_str) {
        free(description_local_str);
        description_local_str = NULL;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    if (parametersList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, parametersList) {
            keyValuePair_t *localKeyValue = listEntry->data;
            free(localKeyValue->key);
            localKeyValue->key = NULL;
            keyValuePair_free(localKeyValue);
            localKeyValue = NULL;
        }
        list_freeList(parametersList);
        parametersList = NULL;
    }
    if (strict_local_var) {
        free(strict_local_var);
        strict_local_var = NULL;
    }
    return NULL;

}
