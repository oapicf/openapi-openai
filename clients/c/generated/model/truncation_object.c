#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "truncation_object.h"


char* truncation_object_type_ToString(openai_api_truncation_object_TYPE_e type) {
    char* typeArray[] =  { "NULL", "auto", "last_messages" };
    return typeArray[type];
}

openai_api_truncation_object_TYPE_e truncation_object_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "auto", "last_messages" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

truncation_object_t *truncation_object_create(
    openai_api_truncation_object_TYPE_e type,
    int last_messages
    ) {
    truncation_object_t *truncation_object_local_var = malloc(sizeof(truncation_object_t));
    if (!truncation_object_local_var) {
        return NULL;
    }
    truncation_object_local_var->type = type;
    truncation_object_local_var->last_messages = last_messages;

    return truncation_object_local_var;
}


void truncation_object_free(truncation_object_t *truncation_object) {
    if(NULL == truncation_object){
        return ;
    }
    listEntry_t *listEntry;
    free(truncation_object);
}

cJSON *truncation_object_convertToJSON(truncation_object_t *truncation_object) {
    cJSON *item = cJSON_CreateObject();

    // truncation_object->type
    if(truncation_object->type != openai_api_truncation_object_TYPE_NULL) {
    if(cJSON_AddStringToObject(item, "type", typetruncation_object_ToString(truncation_object->type)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // truncation_object->last_messages
    if(truncation_object->last_messages) {
    if(cJSON_AddNumberToObject(item, "last_messages", truncation_object->last_messages) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

truncation_object_t *truncation_object_parseFromJSON(cJSON *truncation_objectJSON){

    truncation_object_t *truncation_object_local_var = NULL;

    // truncation_object->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(truncation_objectJSON, "type");
    openai_api_truncation_object_TYPE_e typeVariable;
    if (type) { 
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = truncation_object_type_FromString(type->valuestring);
    }

    // truncation_object->last_messages
    cJSON *last_messages = cJSON_GetObjectItemCaseSensitive(truncation_objectJSON, "last_messages");
    if (last_messages) { 
    if(!cJSON_IsNumber(last_messages))
    {
    goto end; //Numeric
    }
    }


    truncation_object_local_var = truncation_object_create (
        type ? typeVariable : openai_api_truncation_object_TYPE_NULL,
        last_messages ? last_messages->valuedouble : 0
        );

    return truncation_object_local_var;
end:
    return NULL;

}
