#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "message_content_text_annotations_file_path_object.h"


char* message_content_text_annotations_file_path_object_type_ToString(openai_api_message_content_text_annotations_file_path_object_TYPE_e type) {
    char* typeArray[] =  { "NULL", "file_path" };
    return typeArray[type];
}

openai_api_message_content_text_annotations_file_path_object_TYPE_e message_content_text_annotations_file_path_object_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "file_path" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

message_content_text_annotations_file_path_object_t *message_content_text_annotations_file_path_object_create(
    openai_api_message_content_text_annotations_file_path_object_TYPE_e type,
    char *text,
    message_content_text_annotations_file_path_object_file_path_t *file_path,
    int start_index,
    int end_index
    ) {
    message_content_text_annotations_file_path_object_t *message_content_text_annotations_file_path_object_local_var = malloc(sizeof(message_content_text_annotations_file_path_object_t));
    if (!message_content_text_annotations_file_path_object_local_var) {
        return NULL;
    }
    message_content_text_annotations_file_path_object_local_var->type = type;
    message_content_text_annotations_file_path_object_local_var->text = text;
    message_content_text_annotations_file_path_object_local_var->file_path = file_path;
    message_content_text_annotations_file_path_object_local_var->start_index = start_index;
    message_content_text_annotations_file_path_object_local_var->end_index = end_index;

    return message_content_text_annotations_file_path_object_local_var;
}


void message_content_text_annotations_file_path_object_free(message_content_text_annotations_file_path_object_t *message_content_text_annotations_file_path_object) {
    if(NULL == message_content_text_annotations_file_path_object){
        return ;
    }
    listEntry_t *listEntry;
    if (message_content_text_annotations_file_path_object->text) {
        free(message_content_text_annotations_file_path_object->text);
        message_content_text_annotations_file_path_object->text = NULL;
    }
    if (message_content_text_annotations_file_path_object->file_path) {
        message_content_text_annotations_file_path_object_file_path_free(message_content_text_annotations_file_path_object->file_path);
        message_content_text_annotations_file_path_object->file_path = NULL;
    }
    free(message_content_text_annotations_file_path_object);
}

cJSON *message_content_text_annotations_file_path_object_convertToJSON(message_content_text_annotations_file_path_object_t *message_content_text_annotations_file_path_object) {
    cJSON *item = cJSON_CreateObject();

    // message_content_text_annotations_file_path_object->type
    if (openai_api_message_content_text_annotations_file_path_object_TYPE_NULL == message_content_text_annotations_file_path_object->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", typemessage_content_text_annotations_file_path_object_ToString(message_content_text_annotations_file_path_object->type)) == NULL)
    {
    goto fail; //Enum
    }


    // message_content_text_annotations_file_path_object->text
    if (!message_content_text_annotations_file_path_object->text) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "text", message_content_text_annotations_file_path_object->text) == NULL) {
    goto fail; //String
    }


    // message_content_text_annotations_file_path_object->file_path
    if (!message_content_text_annotations_file_path_object->file_path) {
        goto fail;
    }
    cJSON *file_path_local_JSON = message_content_text_annotations_file_path_object_file_path_convertToJSON(message_content_text_annotations_file_path_object->file_path);
    if(file_path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "file_path", file_path_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // message_content_text_annotations_file_path_object->start_index
    if (!message_content_text_annotations_file_path_object->start_index) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "start_index", message_content_text_annotations_file_path_object->start_index) == NULL) {
    goto fail; //Numeric
    }


    // message_content_text_annotations_file_path_object->end_index
    if (!message_content_text_annotations_file_path_object->end_index) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "end_index", message_content_text_annotations_file_path_object->end_index) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

message_content_text_annotations_file_path_object_t *message_content_text_annotations_file_path_object_parseFromJSON(cJSON *message_content_text_annotations_file_path_objectJSON){

    message_content_text_annotations_file_path_object_t *message_content_text_annotations_file_path_object_local_var = NULL;

    // define the local variable for message_content_text_annotations_file_path_object->file_path
    message_content_text_annotations_file_path_object_file_path_t *file_path_local_nonprim = NULL;

    // message_content_text_annotations_file_path_object->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(message_content_text_annotations_file_path_objectJSON, "type");
    if (!type) {
        goto end;
    }

    openai_api_message_content_text_annotations_file_path_object_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = message_content_text_annotations_file_path_object_type_FromString(type->valuestring);

    // message_content_text_annotations_file_path_object->text
    cJSON *text = cJSON_GetObjectItemCaseSensitive(message_content_text_annotations_file_path_objectJSON, "text");
    if (!text) {
        goto end;
    }

    
    if(!cJSON_IsString(text))
    {
    goto end; //String
    }

    // message_content_text_annotations_file_path_object->file_path
    cJSON *file_path = cJSON_GetObjectItemCaseSensitive(message_content_text_annotations_file_path_objectJSON, "file_path");
    if (!file_path) {
        goto end;
    }

    
    file_path_local_nonprim = message_content_text_annotations_file_path_object_file_path_parseFromJSON(file_path); //nonprimitive

    // message_content_text_annotations_file_path_object->start_index
    cJSON *start_index = cJSON_GetObjectItemCaseSensitive(message_content_text_annotations_file_path_objectJSON, "start_index");
    if (!start_index) {
        goto end;
    }

    
    if(!cJSON_IsNumber(start_index))
    {
    goto end; //Numeric
    }

    // message_content_text_annotations_file_path_object->end_index
    cJSON *end_index = cJSON_GetObjectItemCaseSensitive(message_content_text_annotations_file_path_objectJSON, "end_index");
    if (!end_index) {
        goto end;
    }

    
    if(!cJSON_IsNumber(end_index))
    {
    goto end; //Numeric
    }


    message_content_text_annotations_file_path_object_local_var = message_content_text_annotations_file_path_object_create (
        typeVariable,
        strdup(text->valuestring),
        file_path_local_nonprim,
        start_index->valuedouble,
        end_index->valuedouble
        );

    return message_content_text_annotations_file_path_object_local_var;
end:
    if (file_path_local_nonprim) {
        message_content_text_annotations_file_path_object_file_path_free(file_path_local_nonprim);
        file_path_local_nonprim = NULL;
    }
    return NULL;

}
