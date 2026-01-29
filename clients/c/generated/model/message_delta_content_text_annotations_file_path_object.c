#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "message_delta_content_text_annotations_file_path_object.h"


char* message_delta_content_text_annotations_file_path_object_type_ToString(openai_api_message_delta_content_text_annotations_file_path_object_TYPE_e type) {
    char* typeArray[] =  { "NULL", "file_path" };
    return typeArray[type];
}

openai_api_message_delta_content_text_annotations_file_path_object_TYPE_e message_delta_content_text_annotations_file_path_object_type_FromString(char* type){
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

static message_delta_content_text_annotations_file_path_object_t *message_delta_content_text_annotations_file_path_object_create_internal(
    int index,
    openai_api_message_delta_content_text_annotations_file_path_object_TYPE_e type,
    char *text,
    message_delta_content_text_annotations_file_path_object_file_path_t *file_path,
    int start_index,
    int end_index
    ) {
    message_delta_content_text_annotations_file_path_object_t *message_delta_content_text_annotations_file_path_object_local_var = malloc(sizeof(message_delta_content_text_annotations_file_path_object_t));
    if (!message_delta_content_text_annotations_file_path_object_local_var) {
        return NULL;
    }
    message_delta_content_text_annotations_file_path_object_local_var->index = index;
    message_delta_content_text_annotations_file_path_object_local_var->type = type;
    message_delta_content_text_annotations_file_path_object_local_var->text = text;
    message_delta_content_text_annotations_file_path_object_local_var->file_path = file_path;
    message_delta_content_text_annotations_file_path_object_local_var->start_index = start_index;
    message_delta_content_text_annotations_file_path_object_local_var->end_index = end_index;

    message_delta_content_text_annotations_file_path_object_local_var->_library_owned = 1;
    return message_delta_content_text_annotations_file_path_object_local_var;
}

__attribute__((deprecated)) message_delta_content_text_annotations_file_path_object_t *message_delta_content_text_annotations_file_path_object_create(
    int index,
    openai_api_message_delta_content_text_annotations_file_path_object_TYPE_e type,
    char *text,
    message_delta_content_text_annotations_file_path_object_file_path_t *file_path,
    int start_index,
    int end_index
    ) {
    return message_delta_content_text_annotations_file_path_object_create_internal (
        index,
        type,
        text,
        file_path,
        start_index,
        end_index
        );
}

void message_delta_content_text_annotations_file_path_object_free(message_delta_content_text_annotations_file_path_object_t *message_delta_content_text_annotations_file_path_object) {
    if(NULL == message_delta_content_text_annotations_file_path_object){
        return ;
    }
    if(message_delta_content_text_annotations_file_path_object->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "message_delta_content_text_annotations_file_path_object_free");
        return ;
    }
    listEntry_t *listEntry;
    if (message_delta_content_text_annotations_file_path_object->text) {
        free(message_delta_content_text_annotations_file_path_object->text);
        message_delta_content_text_annotations_file_path_object->text = NULL;
    }
    if (message_delta_content_text_annotations_file_path_object->file_path) {
        message_delta_content_text_annotations_file_path_object_file_path_free(message_delta_content_text_annotations_file_path_object->file_path);
        message_delta_content_text_annotations_file_path_object->file_path = NULL;
    }
    free(message_delta_content_text_annotations_file_path_object);
}

cJSON *message_delta_content_text_annotations_file_path_object_convertToJSON(message_delta_content_text_annotations_file_path_object_t *message_delta_content_text_annotations_file_path_object) {
    cJSON *item = cJSON_CreateObject();

    // message_delta_content_text_annotations_file_path_object->index
    if (!message_delta_content_text_annotations_file_path_object->index) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "index", message_delta_content_text_annotations_file_path_object->index) == NULL) {
    goto fail; //Numeric
    }


    // message_delta_content_text_annotations_file_path_object->type
    if (openai_api_message_delta_content_text_annotations_file_path_object_TYPE_NULL == message_delta_content_text_annotations_file_path_object->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", message_delta_content_text_annotations_file_path_object_type_ToString(message_delta_content_text_annotations_file_path_object->type)) == NULL)
    {
    goto fail; //Enum
    }


    // message_delta_content_text_annotations_file_path_object->text
    if(message_delta_content_text_annotations_file_path_object->text) {
    if(cJSON_AddStringToObject(item, "text", message_delta_content_text_annotations_file_path_object->text) == NULL) {
    goto fail; //String
    }
    }


    // message_delta_content_text_annotations_file_path_object->file_path
    if(message_delta_content_text_annotations_file_path_object->file_path) {
    cJSON *file_path_local_JSON = message_delta_content_text_annotations_file_path_object_file_path_convertToJSON(message_delta_content_text_annotations_file_path_object->file_path);
    if(file_path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "file_path", file_path_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // message_delta_content_text_annotations_file_path_object->start_index
    if(message_delta_content_text_annotations_file_path_object->start_index) {
    if(cJSON_AddNumberToObject(item, "start_index", message_delta_content_text_annotations_file_path_object->start_index) == NULL) {
    goto fail; //Numeric
    }
    }


    // message_delta_content_text_annotations_file_path_object->end_index
    if(message_delta_content_text_annotations_file_path_object->end_index) {
    if(cJSON_AddNumberToObject(item, "end_index", message_delta_content_text_annotations_file_path_object->end_index) == NULL) {
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

message_delta_content_text_annotations_file_path_object_t *message_delta_content_text_annotations_file_path_object_parseFromJSON(cJSON *message_delta_content_text_annotations_file_path_objectJSON){

    message_delta_content_text_annotations_file_path_object_t *message_delta_content_text_annotations_file_path_object_local_var = NULL;

    // define the local variable for message_delta_content_text_annotations_file_path_object->file_path
    message_delta_content_text_annotations_file_path_object_file_path_t *file_path_local_nonprim = NULL;

    // message_delta_content_text_annotations_file_path_object->index
    cJSON *index = cJSON_GetObjectItemCaseSensitive(message_delta_content_text_annotations_file_path_objectJSON, "index");
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

    // message_delta_content_text_annotations_file_path_object->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(message_delta_content_text_annotations_file_path_objectJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_message_delta_content_text_annotations_file_path_object_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = message_delta_content_text_annotations_file_path_object_type_FromString(type->valuestring);

    // message_delta_content_text_annotations_file_path_object->text
    cJSON *text = cJSON_GetObjectItemCaseSensitive(message_delta_content_text_annotations_file_path_objectJSON, "text");
    if (cJSON_IsNull(text)) {
        text = NULL;
    }
    if (text) { 
    if(!cJSON_IsString(text) && !cJSON_IsNull(text))
    {
    goto end; //String
    }
    }

    // message_delta_content_text_annotations_file_path_object->file_path
    cJSON *file_path = cJSON_GetObjectItemCaseSensitive(message_delta_content_text_annotations_file_path_objectJSON, "file_path");
    if (cJSON_IsNull(file_path)) {
        file_path = NULL;
    }
    if (file_path) { 
    file_path_local_nonprim = message_delta_content_text_annotations_file_path_object_file_path_parseFromJSON(file_path); //nonprimitive
    }

    // message_delta_content_text_annotations_file_path_object->start_index
    cJSON *start_index = cJSON_GetObjectItemCaseSensitive(message_delta_content_text_annotations_file_path_objectJSON, "start_index");
    if (cJSON_IsNull(start_index)) {
        start_index = NULL;
    }
    if (start_index) { 
    if(!cJSON_IsNumber(start_index))
    {
    goto end; //Numeric
    }
    }

    // message_delta_content_text_annotations_file_path_object->end_index
    cJSON *end_index = cJSON_GetObjectItemCaseSensitive(message_delta_content_text_annotations_file_path_objectJSON, "end_index");
    if (cJSON_IsNull(end_index)) {
        end_index = NULL;
    }
    if (end_index) { 
    if(!cJSON_IsNumber(end_index))
    {
    goto end; //Numeric
    }
    }


    message_delta_content_text_annotations_file_path_object_local_var = message_delta_content_text_annotations_file_path_object_create_internal (
        index->valuedouble,
        typeVariable,
        text && !cJSON_IsNull(text) ? strdup(text->valuestring) : NULL,
        file_path ? file_path_local_nonprim : NULL,
        start_index ? start_index->valuedouble : 0,
        end_index ? end_index->valuedouble : 0
        );

    return message_delta_content_text_annotations_file_path_object_local_var;
end:
    if (file_path_local_nonprim) {
        message_delta_content_text_annotations_file_path_object_file_path_free(file_path_local_nonprim);
        file_path_local_nonprim = NULL;
    }
    return NULL;

}
