#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "assistant_tools_file_search.h"


char* assistant_tools_file_search_type_ToString(openai_api_assistant_tools_file_search_TYPE_e type) {
    char* typeArray[] =  { "NULL", "file_search" };
    return typeArray[type];
}

openai_api_assistant_tools_file_search_TYPE_e assistant_tools_file_search_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "file_search" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static assistant_tools_file_search_t *assistant_tools_file_search_create_internal(
    openai_api_assistant_tools_file_search_TYPE_e type,
    assistant_tools_file_search_file_search_t *file_search
    ) {
    assistant_tools_file_search_t *assistant_tools_file_search_local_var = malloc(sizeof(assistant_tools_file_search_t));
    if (!assistant_tools_file_search_local_var) {
        return NULL;
    }
    assistant_tools_file_search_local_var->type = type;
    assistant_tools_file_search_local_var->file_search = file_search;

    assistant_tools_file_search_local_var->_library_owned = 1;
    return assistant_tools_file_search_local_var;
}

__attribute__((deprecated)) assistant_tools_file_search_t *assistant_tools_file_search_create(
    openai_api_assistant_tools_file_search_TYPE_e type,
    assistant_tools_file_search_file_search_t *file_search
    ) {
    return assistant_tools_file_search_create_internal (
        type,
        file_search
        );
}

void assistant_tools_file_search_free(assistant_tools_file_search_t *assistant_tools_file_search) {
    if(NULL == assistant_tools_file_search){
        return ;
    }
    if(assistant_tools_file_search->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "assistant_tools_file_search_free");
        return ;
    }
    listEntry_t *listEntry;
    if (assistant_tools_file_search->file_search) {
        assistant_tools_file_search_file_search_free(assistant_tools_file_search->file_search);
        assistant_tools_file_search->file_search = NULL;
    }
    free(assistant_tools_file_search);
}

cJSON *assistant_tools_file_search_convertToJSON(assistant_tools_file_search_t *assistant_tools_file_search) {
    cJSON *item = cJSON_CreateObject();

    // assistant_tools_file_search->type
    if (openai_api_assistant_tools_file_search_TYPE_NULL == assistant_tools_file_search->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", assistant_tools_file_search_type_ToString(assistant_tools_file_search->type)) == NULL)
    {
    goto fail; //Enum
    }


    // assistant_tools_file_search->file_search
    if(assistant_tools_file_search->file_search) {
    cJSON *file_search_local_JSON = assistant_tools_file_search_file_search_convertToJSON(assistant_tools_file_search->file_search);
    if(file_search_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "file_search", file_search_local_JSON);
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

assistant_tools_file_search_t *assistant_tools_file_search_parseFromJSON(cJSON *assistant_tools_file_searchJSON){

    assistant_tools_file_search_t *assistant_tools_file_search_local_var = NULL;

    // define the local variable for assistant_tools_file_search->file_search
    assistant_tools_file_search_file_search_t *file_search_local_nonprim = NULL;

    // assistant_tools_file_search->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(assistant_tools_file_searchJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_assistant_tools_file_search_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = assistant_tools_file_search_type_FromString(type->valuestring);

    // assistant_tools_file_search->file_search
    cJSON *file_search = cJSON_GetObjectItemCaseSensitive(assistant_tools_file_searchJSON, "file_search");
    if (cJSON_IsNull(file_search)) {
        file_search = NULL;
    }
    if (file_search) { 
    file_search_local_nonprim = assistant_tools_file_search_file_search_parseFromJSON(file_search); //nonprimitive
    }


    assistant_tools_file_search_local_var = assistant_tools_file_search_create_internal (
        typeVariable,
        file_search ? file_search_local_nonprim : NULL
        );

    return assistant_tools_file_search_local_var;
end:
    if (file_search_local_nonprim) {
        assistant_tools_file_search_file_search_free(file_search_local_nonprim);
        file_search_local_nonprim = NULL;
    }
    return NULL;

}
