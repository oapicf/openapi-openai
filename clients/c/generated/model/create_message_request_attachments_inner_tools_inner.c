#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_message_request_attachments_inner_tools_inner.h"


char* create_message_request_attachments_inner_tools_inner_type_ToString(openai_api_create_message_request_attachments_inner_tools_inner_TYPE_e type) {
    char* typeArray[] =  { "NULL", "code_interpreter", "file_search" };
    return typeArray[type];
}

openai_api_create_message_request_attachments_inner_tools_inner_TYPE_e create_message_request_attachments_inner_tools_inner_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "code_interpreter", "file_search" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static create_message_request_attachments_inner_tools_inner_t *create_message_request_attachments_inner_tools_inner_create_internal(
    openai_api_create_message_request_attachments_inner_tools_inner_TYPE_e type
    ) {
    create_message_request_attachments_inner_tools_inner_t *create_message_request_attachments_inner_tools_inner_local_var = malloc(sizeof(create_message_request_attachments_inner_tools_inner_t));
    if (!create_message_request_attachments_inner_tools_inner_local_var) {
        return NULL;
    }
    create_message_request_attachments_inner_tools_inner_local_var->type = type;

    create_message_request_attachments_inner_tools_inner_local_var->_library_owned = 1;
    return create_message_request_attachments_inner_tools_inner_local_var;
}

__attribute__((deprecated)) create_message_request_attachments_inner_tools_inner_t *create_message_request_attachments_inner_tools_inner_create(
    openai_api_create_message_request_attachments_inner_tools_inner_TYPE_e type
    ) {
    return create_message_request_attachments_inner_tools_inner_create_internal (
        type
        );
}

void create_message_request_attachments_inner_tools_inner_free(create_message_request_attachments_inner_tools_inner_t *create_message_request_attachments_inner_tools_inner) {
    if(NULL == create_message_request_attachments_inner_tools_inner){
        return ;
    }
    if(create_message_request_attachments_inner_tools_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "create_message_request_attachments_inner_tools_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    free(create_message_request_attachments_inner_tools_inner);
}

cJSON *create_message_request_attachments_inner_tools_inner_convertToJSON(create_message_request_attachments_inner_tools_inner_t *create_message_request_attachments_inner_tools_inner) {
    cJSON *item = cJSON_CreateObject();

    // create_message_request_attachments_inner_tools_inner->type
    if (openai_api_create_message_request_attachments_inner_tools_inner_TYPE_NULL == create_message_request_attachments_inner_tools_inner->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", create_message_request_attachments_inner_tools_inner_type_ToString(create_message_request_attachments_inner_tools_inner->type)) == NULL)
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

create_message_request_attachments_inner_tools_inner_t *create_message_request_attachments_inner_tools_inner_parseFromJSON(cJSON *create_message_request_attachments_inner_tools_innerJSON){

    create_message_request_attachments_inner_tools_inner_t *create_message_request_attachments_inner_tools_inner_local_var = NULL;

    // create_message_request_attachments_inner_tools_inner->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(create_message_request_attachments_inner_tools_innerJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_create_message_request_attachments_inner_tools_inner_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = create_message_request_attachments_inner_tools_inner_type_FromString(type->valuestring);


    create_message_request_attachments_inner_tools_inner_local_var = create_message_request_attachments_inner_tools_inner_create_internal (
        typeVariable
        );

    return create_message_request_attachments_inner_tools_inner_local_var;
end:
    return NULL;

}
