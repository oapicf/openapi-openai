#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "response_format_text.h"


char* response_format_text_type_ToString(openai_api_response_format_text_TYPE_e type) {
    char* typeArray[] =  { "NULL", "text" };
    return typeArray[type];
}

openai_api_response_format_text_TYPE_e response_format_text_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "text" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static response_format_text_t *response_format_text_create_internal(
    openai_api_response_format_text_TYPE_e type
    ) {
    response_format_text_t *response_format_text_local_var = malloc(sizeof(response_format_text_t));
    if (!response_format_text_local_var) {
        return NULL;
    }
    response_format_text_local_var->type = type;

    response_format_text_local_var->_library_owned = 1;
    return response_format_text_local_var;
}

__attribute__((deprecated)) response_format_text_t *response_format_text_create(
    openai_api_response_format_text_TYPE_e type
    ) {
    return response_format_text_create_internal (
        type
        );
}

void response_format_text_free(response_format_text_t *response_format_text) {
    if(NULL == response_format_text){
        return ;
    }
    if(response_format_text->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "response_format_text_free");
        return ;
    }
    listEntry_t *listEntry;
    free(response_format_text);
}

cJSON *response_format_text_convertToJSON(response_format_text_t *response_format_text) {
    cJSON *item = cJSON_CreateObject();

    // response_format_text->type
    if (openai_api_response_format_text_TYPE_NULL == response_format_text->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", response_format_text_type_ToString(response_format_text->type)) == NULL)
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

response_format_text_t *response_format_text_parseFromJSON(cJSON *response_format_textJSON){

    response_format_text_t *response_format_text_local_var = NULL;

    // response_format_text->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(response_format_textJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_response_format_text_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = response_format_text_type_FromString(type->valuestring);


    response_format_text_local_var = response_format_text_create_internal (
        typeVariable
        );

    return response_format_text_local_var;
end:
    return NULL;

}
