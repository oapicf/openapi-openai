#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "chat_completion_functions.h"



static chat_completion_functions_t *chat_completion_functions_create_internal(
    char *description,
    char *name,
    list_t* parameters
    ) {
    chat_completion_functions_t *chat_completion_functions_local_var = malloc(sizeof(chat_completion_functions_t));
    if (!chat_completion_functions_local_var) {
        return NULL;
    }
    chat_completion_functions_local_var->description = description;
    chat_completion_functions_local_var->name = name;
    chat_completion_functions_local_var->parameters = parameters;

    chat_completion_functions_local_var->_library_owned = 1;
    return chat_completion_functions_local_var;
}

__attribute__((deprecated)) chat_completion_functions_t *chat_completion_functions_create(
    char *description,
    char *name,
    list_t* parameters
    ) {
    return chat_completion_functions_create_internal (
        description,
        name,
        parameters
        );
}

void chat_completion_functions_free(chat_completion_functions_t *chat_completion_functions) {
    if(NULL == chat_completion_functions){
        return ;
    }
    if(chat_completion_functions->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "chat_completion_functions_free");
        return ;
    }
    listEntry_t *listEntry;
    if (chat_completion_functions->description) {
        free(chat_completion_functions->description);
        chat_completion_functions->description = NULL;
    }
    if (chat_completion_functions->name) {
        free(chat_completion_functions->name);
        chat_completion_functions->name = NULL;
    }
    if (chat_completion_functions->parameters) {
        list_ForEach(listEntry, chat_completion_functions->parameters) {
            keyValuePair_t *localKeyValue = listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_freeList(chat_completion_functions->parameters);
        chat_completion_functions->parameters = NULL;
    }
    free(chat_completion_functions);
}

cJSON *chat_completion_functions_convertToJSON(chat_completion_functions_t *chat_completion_functions) {
    cJSON *item = cJSON_CreateObject();

    // chat_completion_functions->description
    if(chat_completion_functions->description) {
    if(cJSON_AddStringToObject(item, "description", chat_completion_functions->description) == NULL) {
    goto fail; //String
    }
    }


    // chat_completion_functions->name
    if (!chat_completion_functions->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", chat_completion_functions->name) == NULL) {
    goto fail; //String
    }


    // chat_completion_functions->parameters
    if(chat_completion_functions->parameters) {
    cJSON *parameters = cJSON_AddObjectToObject(item, "parameters");
    if(parameters == NULL) {
        goto fail; //primitive map container
    }
    cJSON *localMapObject = parameters;
    listEntry_t *parametersListEntry;
    if (chat_completion_functions->parameters) {
    list_ForEach(parametersListEntry, chat_completion_functions->parameters) {
        keyValuePair_t *localKeyValue = parametersListEntry->data;
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

chat_completion_functions_t *chat_completion_functions_parseFromJSON(cJSON *chat_completion_functionsJSON){

    chat_completion_functions_t *chat_completion_functions_local_var = NULL;

    // define the local map for chat_completion_functions->parameters
    list_t *parametersList = NULL;

    // chat_completion_functions->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(chat_completion_functionsJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // chat_completion_functions->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(chat_completion_functionsJSON, "name");
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

    // chat_completion_functions->parameters
    cJSON *parameters = cJSON_GetObjectItemCaseSensitive(chat_completion_functionsJSON, "parameters");
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


    chat_completion_functions_local_var = chat_completion_functions_create_internal (
        description && !cJSON_IsNull(description) ? strdup(description->valuestring) : NULL,
        strdup(name->valuestring),
        parameters ? parametersList : NULL
        );

    return chat_completion_functions_local_var;
end:
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
    return NULL;

}
