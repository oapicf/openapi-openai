#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "message_request_content_text_object.h"


char* message_request_content_text_object_type_ToString(openai_api_message_request_content_text_object_TYPE_e type) {
    char* typeArray[] =  { "NULL", "text" };
    return typeArray[type];
}

openai_api_message_request_content_text_object_TYPE_e message_request_content_text_object_type_FromString(char* type){
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

static message_request_content_text_object_t *message_request_content_text_object_create_internal(
    openai_api_message_request_content_text_object_TYPE_e type,
    char *text
    ) {
    message_request_content_text_object_t *message_request_content_text_object_local_var = malloc(sizeof(message_request_content_text_object_t));
    if (!message_request_content_text_object_local_var) {
        return NULL;
    }
    message_request_content_text_object_local_var->type = type;
    message_request_content_text_object_local_var->text = text;

    message_request_content_text_object_local_var->_library_owned = 1;
    return message_request_content_text_object_local_var;
}

__attribute__((deprecated)) message_request_content_text_object_t *message_request_content_text_object_create(
    openai_api_message_request_content_text_object_TYPE_e type,
    char *text
    ) {
    return message_request_content_text_object_create_internal (
        type,
        text
        );
}

void message_request_content_text_object_free(message_request_content_text_object_t *message_request_content_text_object) {
    if(NULL == message_request_content_text_object){
        return ;
    }
    if(message_request_content_text_object->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "message_request_content_text_object_free");
        return ;
    }
    listEntry_t *listEntry;
    if (message_request_content_text_object->text) {
        free(message_request_content_text_object->text);
        message_request_content_text_object->text = NULL;
    }
    free(message_request_content_text_object);
}

cJSON *message_request_content_text_object_convertToJSON(message_request_content_text_object_t *message_request_content_text_object) {
    cJSON *item = cJSON_CreateObject();

    // message_request_content_text_object->type
    if (openai_api_message_request_content_text_object_TYPE_NULL == message_request_content_text_object->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", message_request_content_text_object_type_ToString(message_request_content_text_object->type)) == NULL)
    {
    goto fail; //Enum
    }


    // message_request_content_text_object->text
    if (!message_request_content_text_object->text) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "text", message_request_content_text_object->text) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

message_request_content_text_object_t *message_request_content_text_object_parseFromJSON(cJSON *message_request_content_text_objectJSON){

    message_request_content_text_object_t *message_request_content_text_object_local_var = NULL;

    // message_request_content_text_object->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(message_request_content_text_objectJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_message_request_content_text_object_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = message_request_content_text_object_type_FromString(type->valuestring);

    // message_request_content_text_object->text
    cJSON *text = cJSON_GetObjectItemCaseSensitive(message_request_content_text_objectJSON, "text");
    if (cJSON_IsNull(text)) {
        text = NULL;
    }
    if (!text) {
        goto end;
    }

    
    if(!cJSON_IsString(text))
    {
    goto end; //String
    }


    message_request_content_text_object_local_var = message_request_content_text_object_create_internal (
        typeVariable,
        strdup(text->valuestring)
        );

    return message_request_content_text_object_local_var;
end:
    return NULL;

}
