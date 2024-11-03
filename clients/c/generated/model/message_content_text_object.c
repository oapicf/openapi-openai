#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "message_content_text_object.h"


char* message_content_text_object_type_ToString(openai_api_message_content_text_object_TYPE_e type) {
    char* typeArray[] =  { "NULL", "text" };
    return typeArray[type];
}

openai_api_message_content_text_object_TYPE_e message_content_text_object_type_FromString(char* type){
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

message_content_text_object_t *message_content_text_object_create(
    openai_api_message_content_text_object_TYPE_e type,
    message_content_text_object_text_t *text
    ) {
    message_content_text_object_t *message_content_text_object_local_var = malloc(sizeof(message_content_text_object_t));
    if (!message_content_text_object_local_var) {
        return NULL;
    }
    message_content_text_object_local_var->type = type;
    message_content_text_object_local_var->text = text;

    return message_content_text_object_local_var;
}


void message_content_text_object_free(message_content_text_object_t *message_content_text_object) {
    if(NULL == message_content_text_object){
        return ;
    }
    listEntry_t *listEntry;
    if (message_content_text_object->text) {
        message_content_text_object_text_free(message_content_text_object->text);
        message_content_text_object->text = NULL;
    }
    free(message_content_text_object);
}

cJSON *message_content_text_object_convertToJSON(message_content_text_object_t *message_content_text_object) {
    cJSON *item = cJSON_CreateObject();

    // message_content_text_object->type
    if (openai_api_message_content_text_object_TYPE_NULL == message_content_text_object->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", typemessage_content_text_object_ToString(message_content_text_object->type)) == NULL)
    {
    goto fail; //Enum
    }


    // message_content_text_object->text
    if (!message_content_text_object->text) {
        goto fail;
    }
    cJSON *text_local_JSON = message_content_text_object_text_convertToJSON(message_content_text_object->text);
    if(text_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "text", text_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

message_content_text_object_t *message_content_text_object_parseFromJSON(cJSON *message_content_text_objectJSON){

    message_content_text_object_t *message_content_text_object_local_var = NULL;

    // define the local variable for message_content_text_object->text
    message_content_text_object_text_t *text_local_nonprim = NULL;

    // message_content_text_object->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(message_content_text_objectJSON, "type");
    if (!type) {
        goto end;
    }

    openai_api_message_content_text_object_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = message_content_text_object_type_FromString(type->valuestring);

    // message_content_text_object->text
    cJSON *text = cJSON_GetObjectItemCaseSensitive(message_content_text_objectJSON, "text");
    if (!text) {
        goto end;
    }

    
    text_local_nonprim = message_content_text_object_text_parseFromJSON(text); //nonprimitive


    message_content_text_object_local_var = message_content_text_object_create (
        typeVariable,
        text_local_nonprim
        );

    return message_content_text_object_local_var;
end:
    if (text_local_nonprim) {
        message_content_text_object_text_free(text_local_nonprim);
        text_local_nonprim = NULL;
    }
    return NULL;

}
