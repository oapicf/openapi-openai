#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "message_delta_content_text_annotations_file_citation_object.h"


char* message_delta_content_text_annotations_file_citation_object_type_ToString(openai_api_message_delta_content_text_annotations_file_citation_object_TYPE_e type) {
    char* typeArray[] =  { "NULL", "file_citation" };
    return typeArray[type];
}

openai_api_message_delta_content_text_annotations_file_citation_object_TYPE_e message_delta_content_text_annotations_file_citation_object_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "file_citation" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static message_delta_content_text_annotations_file_citation_object_t *message_delta_content_text_annotations_file_citation_object_create_internal(
    int index,
    openai_api_message_delta_content_text_annotations_file_citation_object_TYPE_e type,
    char *text,
    message_delta_content_text_annotations_file_citation_object_file_citation_t *file_citation,
    int start_index,
    int end_index
    ) {
    message_delta_content_text_annotations_file_citation_object_t *message_delta_content_text_annotations_file_citation_object_local_var = malloc(sizeof(message_delta_content_text_annotations_file_citation_object_t));
    if (!message_delta_content_text_annotations_file_citation_object_local_var) {
        return NULL;
    }
    message_delta_content_text_annotations_file_citation_object_local_var->index = index;
    message_delta_content_text_annotations_file_citation_object_local_var->type = type;
    message_delta_content_text_annotations_file_citation_object_local_var->text = text;
    message_delta_content_text_annotations_file_citation_object_local_var->file_citation = file_citation;
    message_delta_content_text_annotations_file_citation_object_local_var->start_index = start_index;
    message_delta_content_text_annotations_file_citation_object_local_var->end_index = end_index;

    message_delta_content_text_annotations_file_citation_object_local_var->_library_owned = 1;
    return message_delta_content_text_annotations_file_citation_object_local_var;
}

__attribute__((deprecated)) message_delta_content_text_annotations_file_citation_object_t *message_delta_content_text_annotations_file_citation_object_create(
    int index,
    openai_api_message_delta_content_text_annotations_file_citation_object_TYPE_e type,
    char *text,
    message_delta_content_text_annotations_file_citation_object_file_citation_t *file_citation,
    int start_index,
    int end_index
    ) {
    return message_delta_content_text_annotations_file_citation_object_create_internal (
        index,
        type,
        text,
        file_citation,
        start_index,
        end_index
        );
}

void message_delta_content_text_annotations_file_citation_object_free(message_delta_content_text_annotations_file_citation_object_t *message_delta_content_text_annotations_file_citation_object) {
    if(NULL == message_delta_content_text_annotations_file_citation_object){
        return ;
    }
    if(message_delta_content_text_annotations_file_citation_object->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "message_delta_content_text_annotations_file_citation_object_free");
        return ;
    }
    listEntry_t *listEntry;
    if (message_delta_content_text_annotations_file_citation_object->text) {
        free(message_delta_content_text_annotations_file_citation_object->text);
        message_delta_content_text_annotations_file_citation_object->text = NULL;
    }
    if (message_delta_content_text_annotations_file_citation_object->file_citation) {
        message_delta_content_text_annotations_file_citation_object_file_citation_free(message_delta_content_text_annotations_file_citation_object->file_citation);
        message_delta_content_text_annotations_file_citation_object->file_citation = NULL;
    }
    free(message_delta_content_text_annotations_file_citation_object);
}

cJSON *message_delta_content_text_annotations_file_citation_object_convertToJSON(message_delta_content_text_annotations_file_citation_object_t *message_delta_content_text_annotations_file_citation_object) {
    cJSON *item = cJSON_CreateObject();

    // message_delta_content_text_annotations_file_citation_object->index
    if (!message_delta_content_text_annotations_file_citation_object->index) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "index", message_delta_content_text_annotations_file_citation_object->index) == NULL) {
    goto fail; //Numeric
    }


    // message_delta_content_text_annotations_file_citation_object->type
    if (openai_api_message_delta_content_text_annotations_file_citation_object_TYPE_NULL == message_delta_content_text_annotations_file_citation_object->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", message_delta_content_text_annotations_file_citation_object_type_ToString(message_delta_content_text_annotations_file_citation_object->type)) == NULL)
    {
    goto fail; //Enum
    }


    // message_delta_content_text_annotations_file_citation_object->text
    if(message_delta_content_text_annotations_file_citation_object->text) {
    if(cJSON_AddStringToObject(item, "text", message_delta_content_text_annotations_file_citation_object->text) == NULL) {
    goto fail; //String
    }
    }


    // message_delta_content_text_annotations_file_citation_object->file_citation
    if(message_delta_content_text_annotations_file_citation_object->file_citation) {
    cJSON *file_citation_local_JSON = message_delta_content_text_annotations_file_citation_object_file_citation_convertToJSON(message_delta_content_text_annotations_file_citation_object->file_citation);
    if(file_citation_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "file_citation", file_citation_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // message_delta_content_text_annotations_file_citation_object->start_index
    if(message_delta_content_text_annotations_file_citation_object->start_index) {
    if(cJSON_AddNumberToObject(item, "start_index", message_delta_content_text_annotations_file_citation_object->start_index) == NULL) {
    goto fail; //Numeric
    }
    }


    // message_delta_content_text_annotations_file_citation_object->end_index
    if(message_delta_content_text_annotations_file_citation_object->end_index) {
    if(cJSON_AddNumberToObject(item, "end_index", message_delta_content_text_annotations_file_citation_object->end_index) == NULL) {
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

message_delta_content_text_annotations_file_citation_object_t *message_delta_content_text_annotations_file_citation_object_parseFromJSON(cJSON *message_delta_content_text_annotations_file_citation_objectJSON){

    message_delta_content_text_annotations_file_citation_object_t *message_delta_content_text_annotations_file_citation_object_local_var = NULL;

    // define the local variable for message_delta_content_text_annotations_file_citation_object->file_citation
    message_delta_content_text_annotations_file_citation_object_file_citation_t *file_citation_local_nonprim = NULL;

    // message_delta_content_text_annotations_file_citation_object->index
    cJSON *index = cJSON_GetObjectItemCaseSensitive(message_delta_content_text_annotations_file_citation_objectJSON, "index");
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

    // message_delta_content_text_annotations_file_citation_object->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(message_delta_content_text_annotations_file_citation_objectJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_message_delta_content_text_annotations_file_citation_object_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = message_delta_content_text_annotations_file_citation_object_type_FromString(type->valuestring);

    // message_delta_content_text_annotations_file_citation_object->text
    cJSON *text = cJSON_GetObjectItemCaseSensitive(message_delta_content_text_annotations_file_citation_objectJSON, "text");
    if (cJSON_IsNull(text)) {
        text = NULL;
    }
    if (text) { 
    if(!cJSON_IsString(text) && !cJSON_IsNull(text))
    {
    goto end; //String
    }
    }

    // message_delta_content_text_annotations_file_citation_object->file_citation
    cJSON *file_citation = cJSON_GetObjectItemCaseSensitive(message_delta_content_text_annotations_file_citation_objectJSON, "file_citation");
    if (cJSON_IsNull(file_citation)) {
        file_citation = NULL;
    }
    if (file_citation) { 
    file_citation_local_nonprim = message_delta_content_text_annotations_file_citation_object_file_citation_parseFromJSON(file_citation); //nonprimitive
    }

    // message_delta_content_text_annotations_file_citation_object->start_index
    cJSON *start_index = cJSON_GetObjectItemCaseSensitive(message_delta_content_text_annotations_file_citation_objectJSON, "start_index");
    if (cJSON_IsNull(start_index)) {
        start_index = NULL;
    }
    if (start_index) { 
    if(!cJSON_IsNumber(start_index))
    {
    goto end; //Numeric
    }
    }

    // message_delta_content_text_annotations_file_citation_object->end_index
    cJSON *end_index = cJSON_GetObjectItemCaseSensitive(message_delta_content_text_annotations_file_citation_objectJSON, "end_index");
    if (cJSON_IsNull(end_index)) {
        end_index = NULL;
    }
    if (end_index) { 
    if(!cJSON_IsNumber(end_index))
    {
    goto end; //Numeric
    }
    }


    message_delta_content_text_annotations_file_citation_object_local_var = message_delta_content_text_annotations_file_citation_object_create_internal (
        index->valuedouble,
        typeVariable,
        text && !cJSON_IsNull(text) ? strdup(text->valuestring) : NULL,
        file_citation ? file_citation_local_nonprim : NULL,
        start_index ? start_index->valuedouble : 0,
        end_index ? end_index->valuedouble : 0
        );

    return message_delta_content_text_annotations_file_citation_object_local_var;
end:
    if (file_citation_local_nonprim) {
        message_delta_content_text_annotations_file_citation_object_file_citation_free(file_citation_local_nonprim);
        file_citation_local_nonprim = NULL;
    }
    return NULL;

}
