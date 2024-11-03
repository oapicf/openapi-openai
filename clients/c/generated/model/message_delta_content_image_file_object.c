#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "message_delta_content_image_file_object.h"


char* message_delta_content_image_file_object_type_ToString(openai_api_message_delta_content_image_file_object_TYPE_e type) {
    char* typeArray[] =  { "NULL", "image_file" };
    return typeArray[type];
}

openai_api_message_delta_content_image_file_object_TYPE_e message_delta_content_image_file_object_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "image_file" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

message_delta_content_image_file_object_t *message_delta_content_image_file_object_create(
    int index,
    openai_api_message_delta_content_image_file_object_TYPE_e type,
    message_delta_content_image_file_object_image_file_t *image_file
    ) {
    message_delta_content_image_file_object_t *message_delta_content_image_file_object_local_var = malloc(sizeof(message_delta_content_image_file_object_t));
    if (!message_delta_content_image_file_object_local_var) {
        return NULL;
    }
    message_delta_content_image_file_object_local_var->index = index;
    message_delta_content_image_file_object_local_var->type = type;
    message_delta_content_image_file_object_local_var->image_file = image_file;

    return message_delta_content_image_file_object_local_var;
}


void message_delta_content_image_file_object_free(message_delta_content_image_file_object_t *message_delta_content_image_file_object) {
    if(NULL == message_delta_content_image_file_object){
        return ;
    }
    listEntry_t *listEntry;
    if (message_delta_content_image_file_object->image_file) {
        message_delta_content_image_file_object_image_file_free(message_delta_content_image_file_object->image_file);
        message_delta_content_image_file_object->image_file = NULL;
    }
    free(message_delta_content_image_file_object);
}

cJSON *message_delta_content_image_file_object_convertToJSON(message_delta_content_image_file_object_t *message_delta_content_image_file_object) {
    cJSON *item = cJSON_CreateObject();

    // message_delta_content_image_file_object->index
    if (!message_delta_content_image_file_object->index) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "index", message_delta_content_image_file_object->index) == NULL) {
    goto fail; //Numeric
    }


    // message_delta_content_image_file_object->type
    if (openai_api_message_delta_content_image_file_object_TYPE_NULL == message_delta_content_image_file_object->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", typemessage_delta_content_image_file_object_ToString(message_delta_content_image_file_object->type)) == NULL)
    {
    goto fail; //Enum
    }


    // message_delta_content_image_file_object->image_file
    if(message_delta_content_image_file_object->image_file) {
    cJSON *image_file_local_JSON = message_delta_content_image_file_object_image_file_convertToJSON(message_delta_content_image_file_object->image_file);
    if(image_file_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "image_file", image_file_local_JSON);
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

message_delta_content_image_file_object_t *message_delta_content_image_file_object_parseFromJSON(cJSON *message_delta_content_image_file_objectJSON){

    message_delta_content_image_file_object_t *message_delta_content_image_file_object_local_var = NULL;

    // define the local variable for message_delta_content_image_file_object->image_file
    message_delta_content_image_file_object_image_file_t *image_file_local_nonprim = NULL;

    // message_delta_content_image_file_object->index
    cJSON *index = cJSON_GetObjectItemCaseSensitive(message_delta_content_image_file_objectJSON, "index");
    if (!index) {
        goto end;
    }

    
    if(!cJSON_IsNumber(index))
    {
    goto end; //Numeric
    }

    // message_delta_content_image_file_object->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(message_delta_content_image_file_objectJSON, "type");
    if (!type) {
        goto end;
    }

    openai_api_message_delta_content_image_file_object_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = message_delta_content_image_file_object_type_FromString(type->valuestring);

    // message_delta_content_image_file_object->image_file
    cJSON *image_file = cJSON_GetObjectItemCaseSensitive(message_delta_content_image_file_objectJSON, "image_file");
    if (image_file) { 
    image_file_local_nonprim = message_delta_content_image_file_object_image_file_parseFromJSON(image_file); //nonprimitive
    }


    message_delta_content_image_file_object_local_var = message_delta_content_image_file_object_create (
        index->valuedouble,
        typeVariable,
        image_file ? image_file_local_nonprim : NULL
        );

    return message_delta_content_image_file_object_local_var;
end:
    if (image_file_local_nonprim) {
        message_delta_content_image_file_object_image_file_free(image_file_local_nonprim);
        image_file_local_nonprim = NULL;
    }
    return NULL;

}
