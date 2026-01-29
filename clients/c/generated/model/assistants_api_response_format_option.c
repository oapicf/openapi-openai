#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "assistants_api_response_format_option.h"


char* assistants_api_response_format_option_type_ToString(openai_api_assistants_api_response_format_option_TYPE_e type) {
    char* typeArray[] =  { "NULL", "text", "json_object" };
    return typeArray[type];
}

openai_api_assistants_api_response_format_option_TYPE_e assistants_api_response_format_option_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "text", "json_object" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static assistants_api_response_format_option_t *assistants_api_response_format_option_create_internal(
    openai_api_assistants_api_response_format_option_TYPE_e type
    ) {
    assistants_api_response_format_option_t *assistants_api_response_format_option_local_var = malloc(sizeof(assistants_api_response_format_option_t));
    if (!assistants_api_response_format_option_local_var) {
        return NULL;
    }
    assistants_api_response_format_option_local_var->type = type;

    assistants_api_response_format_option_local_var->_library_owned = 1;
    return assistants_api_response_format_option_local_var;
}

__attribute__((deprecated)) assistants_api_response_format_option_t *assistants_api_response_format_option_create(
    openai_api_assistants_api_response_format_option_TYPE_e type
    ) {
    return assistants_api_response_format_option_create_internal (
        type
        );
}

void assistants_api_response_format_option_free(assistants_api_response_format_option_t *assistants_api_response_format_option) {
    if(NULL == assistants_api_response_format_option){
        return ;
    }
    if(assistants_api_response_format_option->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "assistants_api_response_format_option_free");
        return ;
    }
    listEntry_t *listEntry;
    free(assistants_api_response_format_option);
}

cJSON *assistants_api_response_format_option_convertToJSON(assistants_api_response_format_option_t *assistants_api_response_format_option) {
    cJSON *item = cJSON_CreateObject();

    // assistants_api_response_format_option->type
    if(assistants_api_response_format_option->type != openai_api_assistants_api_response_format_option_TYPE_NULL) {
    if(cJSON_AddStringToObject(item, "type", assistants_api_response_format_option_type_ToString(assistants_api_response_format_option->type)) == NULL)
    {
    goto fail; //Enum
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

assistants_api_response_format_option_t *assistants_api_response_format_option_parseFromJSON(cJSON *assistants_api_response_format_optionJSON){

    assistants_api_response_format_option_t *assistants_api_response_format_option_local_var = NULL;

    // assistants_api_response_format_option->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(assistants_api_response_format_optionJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    openai_api_assistants_api_response_format_option_TYPE_e typeVariable;
    if (type) { 
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = assistants_api_response_format_option_type_FromString(type->valuestring);
    }


    assistants_api_response_format_option_local_var = assistants_api_response_format_option_create_internal (
        type ? typeVariable : openai_api_assistants_api_response_format_option_TYPE_NULL
        );

    return assistants_api_response_format_option_local_var;
end:
    return NULL;

}
