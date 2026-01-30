#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "assistant_tools_file_search_type_only.h"


char* assistant_tools_file_search_type_only_type_ToString(openai_api_assistant_tools_file_search_type_only_TYPE_e type) {
    char* typeArray[] =  { "NULL", "file_search" };
    return typeArray[type];
}

openai_api_assistant_tools_file_search_type_only_TYPE_e assistant_tools_file_search_type_only_type_FromString(char* type){
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

static assistant_tools_file_search_type_only_t *assistant_tools_file_search_type_only_create_internal(
    openai_api_assistant_tools_file_search_type_only_TYPE_e type
    ) {
    assistant_tools_file_search_type_only_t *assistant_tools_file_search_type_only_local_var = malloc(sizeof(assistant_tools_file_search_type_only_t));
    if (!assistant_tools_file_search_type_only_local_var) {
        return NULL;
    }
    assistant_tools_file_search_type_only_local_var->type = type;

    assistant_tools_file_search_type_only_local_var->_library_owned = 1;
    return assistant_tools_file_search_type_only_local_var;
}

__attribute__((deprecated)) assistant_tools_file_search_type_only_t *assistant_tools_file_search_type_only_create(
    openai_api_assistant_tools_file_search_type_only_TYPE_e type
    ) {
    return assistant_tools_file_search_type_only_create_internal (
        type
        );
}

void assistant_tools_file_search_type_only_free(assistant_tools_file_search_type_only_t *assistant_tools_file_search_type_only) {
    if(NULL == assistant_tools_file_search_type_only){
        return ;
    }
    if(assistant_tools_file_search_type_only->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "assistant_tools_file_search_type_only_free");
        return ;
    }
    listEntry_t *listEntry;
    free(assistant_tools_file_search_type_only);
}

cJSON *assistant_tools_file_search_type_only_convertToJSON(assistant_tools_file_search_type_only_t *assistant_tools_file_search_type_only) {
    cJSON *item = cJSON_CreateObject();

    // assistant_tools_file_search_type_only->type
    if (openai_api_assistant_tools_file_search_type_only_TYPE_NULL == assistant_tools_file_search_type_only->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", assistant_tools_file_search_type_only_type_ToString(assistant_tools_file_search_type_only->type)) == NULL)
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

assistant_tools_file_search_type_only_t *assistant_tools_file_search_type_only_parseFromJSON(cJSON *assistant_tools_file_search_type_onlyJSON){

    assistant_tools_file_search_type_only_t *assistant_tools_file_search_type_only_local_var = NULL;

    // assistant_tools_file_search_type_only->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(assistant_tools_file_search_type_onlyJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_assistant_tools_file_search_type_only_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = assistant_tools_file_search_type_only_type_FromString(type->valuestring);


    assistant_tools_file_search_type_only_local_var = assistant_tools_file_search_type_only_create_internal (
        typeVariable
        );

    return assistant_tools_file_search_type_only_local_var;
end:
    return NULL;

}
