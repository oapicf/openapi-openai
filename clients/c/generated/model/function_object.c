#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "function_object.h"



function_object_t *function_object_create(
    char *description,
    char *name,
    list_t* parameters
    ) {
    function_object_t *function_object_local_var = malloc(sizeof(function_object_t));
    if (!function_object_local_var) {
        return NULL;
    }
    function_object_local_var->description = description;
    function_object_local_var->name = name;
    function_object_local_var->parameters = parameters;

    return function_object_local_var;
}


void function_object_free(function_object_t *function_object) {
    if(NULL == function_object){
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
            keyValuePair_t *localKeyValue = (keyValuePair_t*) listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_freeList(function_object->parameters);
        function_object->parameters = NULL;
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
        keyValuePair_t *localKeyValue = (keyValuePair_t*)parametersListEntry->data;
    }
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

    // define the local map for function_object->parameters
    list_t *parametersList = NULL;

    // function_object->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(function_objectJSON, "description");
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // function_object->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(function_objectJSON, "name");
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // function_object->parameters
    cJSON *parameters = cJSON_GetObjectItemCaseSensitive(function_objectJSON, "parameters");
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


    function_object_local_var = function_object_create (
        description && !cJSON_IsNull(description) ? strdup(description->valuestring) : NULL,
        strdup(name->valuestring),
        parameters ? parametersList : NULL
        );

    return function_object_local_var;
end:
    if (parametersList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, parametersList) {
            keyValuePair_t *localKeyValue = (keyValuePair_t*) listEntry->data;
            free(localKeyValue->key);
            localKeyValue->key = NULL;
            keyValuePair_free(localKeyValue);
            localKeyValue = NULL;
        }
        list_freeList(parametersList);
        parametersList = NULL;
    }
    return NULL;

}
