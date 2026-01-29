#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "message_delta_content_text_object.h"


char* message_delta_content_text_object_type_ToString(openai_api_message_delta_content_text_object_TYPE_e type) {
    char* typeArray[] =  { "NULL", "text" };
    return typeArray[type];
}

openai_api_message_delta_content_text_object_TYPE_e message_delta_content_text_object_type_FromString(char* type){
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

static message_delta_content_text_object_t *message_delta_content_text_object_create_internal(
    int index,
    openai_api_message_delta_content_text_object_TYPE_e type,
    message_delta_content_text_object_text_t *text
    ) {
    message_delta_content_text_object_t *message_delta_content_text_object_local_var = malloc(sizeof(message_delta_content_text_object_t));
    if (!message_delta_content_text_object_local_var) {
        return NULL;
    }
    message_delta_content_text_object_local_var->index = index;
    message_delta_content_text_object_local_var->type = type;
    message_delta_content_text_object_local_var->text = text;

    message_delta_content_text_object_local_var->_library_owned = 1;
    return message_delta_content_text_object_local_var;
}

__attribute__((deprecated)) message_delta_content_text_object_t *message_delta_content_text_object_create(
    int index,
    openai_api_message_delta_content_text_object_TYPE_e type,
    message_delta_content_text_object_text_t *text
    ) {
    return message_delta_content_text_object_create_internal (
        index,
        type,
        text
        );
}

void message_delta_content_text_object_free(message_delta_content_text_object_t *message_delta_content_text_object) {
    if(NULL == message_delta_content_text_object){
        return ;
    }
    if(message_delta_content_text_object->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "message_delta_content_text_object_free");
        return ;
    }
    listEntry_t *listEntry;
    if (message_delta_content_text_object->text) {
        message_delta_content_text_object_text_free(message_delta_content_text_object->text);
        message_delta_content_text_object->text = NULL;
    }
    free(message_delta_content_text_object);
}

cJSON *message_delta_content_text_object_convertToJSON(message_delta_content_text_object_t *message_delta_content_text_object) {
    cJSON *item = cJSON_CreateObject();

    // message_delta_content_text_object->index
    if (!message_delta_content_text_object->index) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "index", message_delta_content_text_object->index) == NULL) {
    goto fail; //Numeric
    }


    // message_delta_content_text_object->type
    if (openai_api_message_delta_content_text_object_TYPE_NULL == message_delta_content_text_object->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", message_delta_content_text_object_type_ToString(message_delta_content_text_object->type)) == NULL)
    {
    goto fail; //Enum
    }


    // message_delta_content_text_object->text
    if(message_delta_content_text_object->text) {
    cJSON *text_local_JSON = message_delta_content_text_object_text_convertToJSON(message_delta_content_text_object->text);
    if(text_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "text", text_local_JSON);
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

message_delta_content_text_object_t *message_delta_content_text_object_parseFromJSON(cJSON *message_delta_content_text_objectJSON){

    message_delta_content_text_object_t *message_delta_content_text_object_local_var = NULL;

    // define the local variable for message_delta_content_text_object->text
    message_delta_content_text_object_text_t *text_local_nonprim = NULL;

    // message_delta_content_text_object->index
    cJSON *index = cJSON_GetObjectItemCaseSensitive(message_delta_content_text_objectJSON, "index");
    if (cJSON_IsNull(index)) {
        index = NULL;
    }
    if (!index) {
        goto end;
    }

    
    if(!cJSON_IsNumber(index))
    {
    goto end; //Numeric
    }

    // message_delta_content_text_object->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(message_delta_content_text_objectJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_message_delta_content_text_object_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = message_delta_content_text_object_type_FromString(type->valuestring);

    // message_delta_content_text_object->text
    cJSON *text = cJSON_GetObjectItemCaseSensitive(message_delta_content_text_objectJSON, "text");
    if (cJSON_IsNull(text)) {
        text = NULL;
    }
    if (text) { 
    text_local_nonprim = message_delta_content_text_object_text_parseFromJSON(text); //nonprimitive
    }


    message_delta_content_text_object_local_var = message_delta_content_text_object_create_internal (
        index->valuedouble,
        typeVariable,
        text ? text_local_nonprim : NULL
        );

    return message_delta_content_text_object_local_var;
end:
    if (text_local_nonprim) {
        message_delta_content_text_object_text_free(text_local_nonprim);
        text_local_nonprim = NULL;
    }
    return NULL;

}
