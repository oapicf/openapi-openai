#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "message_content_refusal_object.h"


char* message_content_refusal_object_type_ToString(openai_api_message_content_refusal_object_TYPE_e type) {
    char* typeArray[] =  { "NULL", "refusal" };
    return typeArray[type];
}

openai_api_message_content_refusal_object_TYPE_e message_content_refusal_object_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "refusal" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static message_content_refusal_object_t *message_content_refusal_object_create_internal(
    openai_api_message_content_refusal_object_TYPE_e type,
    char *refusal
    ) {
    message_content_refusal_object_t *message_content_refusal_object_local_var = malloc(sizeof(message_content_refusal_object_t));
    if (!message_content_refusal_object_local_var) {
        return NULL;
    }
    message_content_refusal_object_local_var->type = type;
    message_content_refusal_object_local_var->refusal = refusal;

    message_content_refusal_object_local_var->_library_owned = 1;
    return message_content_refusal_object_local_var;
}

__attribute__((deprecated)) message_content_refusal_object_t *message_content_refusal_object_create(
    openai_api_message_content_refusal_object_TYPE_e type,
    char *refusal
    ) {
    return message_content_refusal_object_create_internal (
        type,
        refusal
        );
}

void message_content_refusal_object_free(message_content_refusal_object_t *message_content_refusal_object) {
    if(NULL == message_content_refusal_object){
        return ;
    }
    if(message_content_refusal_object->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "message_content_refusal_object_free");
        return ;
    }
    listEntry_t *listEntry;
    if (message_content_refusal_object->refusal) {
        free(message_content_refusal_object->refusal);
        message_content_refusal_object->refusal = NULL;
    }
    free(message_content_refusal_object);
}

cJSON *message_content_refusal_object_convertToJSON(message_content_refusal_object_t *message_content_refusal_object) {
    cJSON *item = cJSON_CreateObject();

    // message_content_refusal_object->type
    if (openai_api_message_content_refusal_object_TYPE_NULL == message_content_refusal_object->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", message_content_refusal_object_type_ToString(message_content_refusal_object->type)) == NULL)
    {
    goto fail; //Enum
    }


    // message_content_refusal_object->refusal
    if (!message_content_refusal_object->refusal) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "refusal", message_content_refusal_object->refusal) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

message_content_refusal_object_t *message_content_refusal_object_parseFromJSON(cJSON *message_content_refusal_objectJSON){

    message_content_refusal_object_t *message_content_refusal_object_local_var = NULL;

    // message_content_refusal_object->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(message_content_refusal_objectJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_message_content_refusal_object_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = message_content_refusal_object_type_FromString(type->valuestring);

    // message_content_refusal_object->refusal
    cJSON *refusal = cJSON_GetObjectItemCaseSensitive(message_content_refusal_objectJSON, "refusal");
    if (cJSON_IsNull(refusal)) {
        refusal = NULL;
    }
    if (!refusal) {
        goto end;
    }

    
    if(!cJSON_IsString(refusal))
    {
    goto end; //String
    }


    message_content_refusal_object_local_var = message_content_refusal_object_create_internal (
        typeVariable,
        strdup(refusal->valuestring)
        );

    return message_content_refusal_object_local_var;
end:
    return NULL;

}
