#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "message_delta_content_text_object_text_annotations_inner.h"


char* message_delta_content_text_object_text_annotations_inner_type_ToString(openai_api_message_delta_content_text_object_text_annotations_inner_TYPE_e type) {
    char* typeArray[] =  { "NULL", "file_citation", "file_path" };
    return typeArray[type];
}

openai_api_message_delta_content_text_object_text_annotations_inner_TYPE_e message_delta_content_text_object_text_annotations_inner_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "file_citation", "file_path" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

message_delta_content_text_object_text_annotations_inner_t *message_delta_content_text_object_text_annotations_inner_create(
    int index,
    openai_api_message_delta_content_text_object_text_annotations_inner_TYPE_e type,
    char *text,
    message_delta_content_text_annotations_file_citation_object_file_citation_t *file_citation,
    int start_index,
    int end_index,
    message_delta_content_text_annotations_file_path_object_file_path_t *file_path
    ) {
    message_delta_content_text_object_text_annotations_inner_t *message_delta_content_text_object_text_annotations_inner_local_var = malloc(sizeof(message_delta_content_text_object_text_annotations_inner_t));
    if (!message_delta_content_text_object_text_annotations_inner_local_var) {
        return NULL;
    }
    message_delta_content_text_object_text_annotations_inner_local_var->index = index;
    message_delta_content_text_object_text_annotations_inner_local_var->type = type;
    message_delta_content_text_object_text_annotations_inner_local_var->text = text;
    message_delta_content_text_object_text_annotations_inner_local_var->file_citation = file_citation;
    message_delta_content_text_object_text_annotations_inner_local_var->start_index = start_index;
    message_delta_content_text_object_text_annotations_inner_local_var->end_index = end_index;
    message_delta_content_text_object_text_annotations_inner_local_var->file_path = file_path;

    return message_delta_content_text_object_text_annotations_inner_local_var;
}


void message_delta_content_text_object_text_annotations_inner_free(message_delta_content_text_object_text_annotations_inner_t *message_delta_content_text_object_text_annotations_inner) {
    if(NULL == message_delta_content_text_object_text_annotations_inner){
        return ;
    }
    listEntry_t *listEntry;
    if (message_delta_content_text_object_text_annotations_inner->text) {
        free(message_delta_content_text_object_text_annotations_inner->text);
        message_delta_content_text_object_text_annotations_inner->text = NULL;
    }
    if (message_delta_content_text_object_text_annotations_inner->file_citation) {
        message_delta_content_text_annotations_file_citation_object_file_citation_free(message_delta_content_text_object_text_annotations_inner->file_citation);
        message_delta_content_text_object_text_annotations_inner->file_citation = NULL;
    }
    if (message_delta_content_text_object_text_annotations_inner->file_path) {
        message_delta_content_text_annotations_file_path_object_file_path_free(message_delta_content_text_object_text_annotations_inner->file_path);
        message_delta_content_text_object_text_annotations_inner->file_path = NULL;
    }
    free(message_delta_content_text_object_text_annotations_inner);
}

cJSON *message_delta_content_text_object_text_annotations_inner_convertToJSON(message_delta_content_text_object_text_annotations_inner_t *message_delta_content_text_object_text_annotations_inner) {
    cJSON *item = cJSON_CreateObject();

    // message_delta_content_text_object_text_annotations_inner->index
    if (!message_delta_content_text_object_text_annotations_inner->index) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "index", message_delta_content_text_object_text_annotations_inner->index) == NULL) {
    goto fail; //Numeric
    }


    // message_delta_content_text_object_text_annotations_inner->type
    if (openai_api_message_delta_content_text_object_text_annotations_inner_TYPE_NULL == message_delta_content_text_object_text_annotations_inner->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", typemessage_delta_content_text_object_text_annotations_inner_ToString(message_delta_content_text_object_text_annotations_inner->type)) == NULL)
    {
    goto fail; //Enum
    }


    // message_delta_content_text_object_text_annotations_inner->text
    if(message_delta_content_text_object_text_annotations_inner->text) {
    if(cJSON_AddStringToObject(item, "text", message_delta_content_text_object_text_annotations_inner->text) == NULL) {
    goto fail; //String
    }
    }


    // message_delta_content_text_object_text_annotations_inner->file_citation
    if(message_delta_content_text_object_text_annotations_inner->file_citation) {
    cJSON *file_citation_local_JSON = message_delta_content_text_annotations_file_citation_object_file_citation_convertToJSON(message_delta_content_text_object_text_annotations_inner->file_citation);
    if(file_citation_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "file_citation", file_citation_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // message_delta_content_text_object_text_annotations_inner->start_index
    if(message_delta_content_text_object_text_annotations_inner->start_index) {
    if(cJSON_AddNumberToObject(item, "start_index", message_delta_content_text_object_text_annotations_inner->start_index) == NULL) {
    goto fail; //Numeric
    }
    }


    // message_delta_content_text_object_text_annotations_inner->end_index
    if(message_delta_content_text_object_text_annotations_inner->end_index) {
    if(cJSON_AddNumberToObject(item, "end_index", message_delta_content_text_object_text_annotations_inner->end_index) == NULL) {
    goto fail; //Numeric
    }
    }


    // message_delta_content_text_object_text_annotations_inner->file_path
    if(message_delta_content_text_object_text_annotations_inner->file_path) {
    cJSON *file_path_local_JSON = message_delta_content_text_annotations_file_path_object_file_path_convertToJSON(message_delta_content_text_object_text_annotations_inner->file_path);
    if(file_path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "file_path", file_path_local_JSON);
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

message_delta_content_text_object_text_annotations_inner_t *message_delta_content_text_object_text_annotations_inner_parseFromJSON(cJSON *message_delta_content_text_object_text_annotations_innerJSON){

    message_delta_content_text_object_text_annotations_inner_t *message_delta_content_text_object_text_annotations_inner_local_var = NULL;

    // define the local variable for message_delta_content_text_object_text_annotations_inner->file_citation
    message_delta_content_text_annotations_file_citation_object_file_citation_t *file_citation_local_nonprim = NULL;

    // define the local variable for message_delta_content_text_object_text_annotations_inner->file_path
    message_delta_content_text_annotations_file_path_object_file_path_t *file_path_local_nonprim = NULL;

    // message_delta_content_text_object_text_annotations_inner->index
    cJSON *index = cJSON_GetObjectItemCaseSensitive(message_delta_content_text_object_text_annotations_innerJSON, "index");
    if (!index) {
        goto end;
    }

    
    if(!cJSON_IsNumber(index))
    {
    goto end; //Numeric
    }

    // message_delta_content_text_object_text_annotations_inner->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(message_delta_content_text_object_text_annotations_innerJSON, "type");
    if (!type) {
        goto end;
    }

    openai_api_message_delta_content_text_object_text_annotations_inner_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = message_delta_content_text_object_text_annotations_inner_type_FromString(type->valuestring);

    // message_delta_content_text_object_text_annotations_inner->text
    cJSON *text = cJSON_GetObjectItemCaseSensitive(message_delta_content_text_object_text_annotations_innerJSON, "text");
    if (text) { 
    if(!cJSON_IsString(text) && !cJSON_IsNull(text))
    {
    goto end; //String
    }
    }

    // message_delta_content_text_object_text_annotations_inner->file_citation
    cJSON *file_citation = cJSON_GetObjectItemCaseSensitive(message_delta_content_text_object_text_annotations_innerJSON, "file_citation");
    if (file_citation) { 
    file_citation_local_nonprim = message_delta_content_text_annotations_file_citation_object_file_citation_parseFromJSON(file_citation); //nonprimitive
    }

    // message_delta_content_text_object_text_annotations_inner->start_index
    cJSON *start_index = cJSON_GetObjectItemCaseSensitive(message_delta_content_text_object_text_annotations_innerJSON, "start_index");
    if (start_index) { 
    if(!cJSON_IsNumber(start_index))
    {
    goto end; //Numeric
    }
    }

    // message_delta_content_text_object_text_annotations_inner->end_index
    cJSON *end_index = cJSON_GetObjectItemCaseSensitive(message_delta_content_text_object_text_annotations_innerJSON, "end_index");
    if (end_index) { 
    if(!cJSON_IsNumber(end_index))
    {
    goto end; //Numeric
    }
    }

    // message_delta_content_text_object_text_annotations_inner->file_path
    cJSON *file_path = cJSON_GetObjectItemCaseSensitive(message_delta_content_text_object_text_annotations_innerJSON, "file_path");
    if (file_path) { 
    file_path_local_nonprim = message_delta_content_text_annotations_file_path_object_file_path_parseFromJSON(file_path); //nonprimitive
    }


    message_delta_content_text_object_text_annotations_inner_local_var = message_delta_content_text_object_text_annotations_inner_create (
        index->valuedouble,
        typeVariable,
        text && !cJSON_IsNull(text) ? strdup(text->valuestring) : NULL,
        file_citation ? file_citation_local_nonprim : NULL,
        start_index ? start_index->valuedouble : 0,
        end_index ? end_index->valuedouble : 0,
        file_path ? file_path_local_nonprim : NULL
        );

    return message_delta_content_text_object_text_annotations_inner_local_var;
end:
    if (file_citation_local_nonprim) {
        message_delta_content_text_annotations_file_citation_object_file_citation_free(file_citation_local_nonprim);
        file_citation_local_nonprim = NULL;
    }
    if (file_path_local_nonprim) {
        message_delta_content_text_annotations_file_path_object_file_path_free(file_path_local_nonprim);
        file_path_local_nonprim = NULL;
    }
    return NULL;

}
