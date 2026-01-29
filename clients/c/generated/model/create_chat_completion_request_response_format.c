#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_chat_completion_request_response_format.h"


char* create_chat_completion_request_response_format_type_ToString(openai_api_create_chat_completion_request_response_format_TYPE_e type) {
    char* typeArray[] =  { "NULL", "text", "json_object" };
    return typeArray[type];
}

openai_api_create_chat_completion_request_response_format_TYPE_e create_chat_completion_request_response_format_type_FromString(char* type){
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

static create_chat_completion_request_response_format_t *create_chat_completion_request_response_format_create_internal(
    openai_api_create_chat_completion_request_response_format_TYPE_e type
    ) {
    create_chat_completion_request_response_format_t *create_chat_completion_request_response_format_local_var = malloc(sizeof(create_chat_completion_request_response_format_t));
    if (!create_chat_completion_request_response_format_local_var) {
        return NULL;
    }
    create_chat_completion_request_response_format_local_var->type = type;

    create_chat_completion_request_response_format_local_var->_library_owned = 1;
    return create_chat_completion_request_response_format_local_var;
}

__attribute__((deprecated)) create_chat_completion_request_response_format_t *create_chat_completion_request_response_format_create(
    openai_api_create_chat_completion_request_response_format_TYPE_e type
    ) {
    return create_chat_completion_request_response_format_create_internal (
        type
        );
}

void create_chat_completion_request_response_format_free(create_chat_completion_request_response_format_t *create_chat_completion_request_response_format) {
    if(NULL == create_chat_completion_request_response_format){
        return ;
    }
    if(create_chat_completion_request_response_format->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "create_chat_completion_request_response_format_free");
        return ;
    }
    listEntry_t *listEntry;
    free(create_chat_completion_request_response_format);
}

cJSON *create_chat_completion_request_response_format_convertToJSON(create_chat_completion_request_response_format_t *create_chat_completion_request_response_format) {
    cJSON *item = cJSON_CreateObject();

    // create_chat_completion_request_response_format->type
    if(create_chat_completion_request_response_format->type != openai_api_create_chat_completion_request_response_format_TYPE_NULL) {
    if(cJSON_AddStringToObject(item, "type", create_chat_completion_request_response_format_type_ToString(create_chat_completion_request_response_format->type)) == NULL)
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

create_chat_completion_request_response_format_t *create_chat_completion_request_response_format_parseFromJSON(cJSON *create_chat_completion_request_response_formatJSON){

    create_chat_completion_request_response_format_t *create_chat_completion_request_response_format_local_var = NULL;

    // create_chat_completion_request_response_format->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(create_chat_completion_request_response_formatJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    openai_api_create_chat_completion_request_response_format_TYPE_e typeVariable;
    if (type) { 
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = create_chat_completion_request_response_format_type_FromString(type->valuestring);
    }


    create_chat_completion_request_response_format_local_var = create_chat_completion_request_response_format_create_internal (
        type ? typeVariable : openai_api_create_chat_completion_request_response_format_TYPE_NULL
        );

    return create_chat_completion_request_response_format_local_var;
end:
    return NULL;

}
