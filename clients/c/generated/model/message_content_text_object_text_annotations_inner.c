#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "message_content_text_object_text_annotations_inner.h"


char* message_content_text_object_text_annotations_inner_type_ToString(openai_api_message_content_text_object_text_annotations_inner_TYPE_e type) {
    char* typeArray[] =  { "NULL", "file_citation", "file_path" };
    return typeArray[type];
}

openai_api_message_content_text_object_text_annotations_inner_TYPE_e message_content_text_object_text_annotations_inner_type_FromString(char* type){
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

static message_content_text_object_text_annotations_inner_t *message_content_text_object_text_annotations_inner_create_internal(
    openai_api_message_content_text_object_text_annotations_inner_TYPE_e type,
    char *text,
    message_content_text_annotations_file_citation_object_file_citation_t *file_citation,
    int *start_index,
    int *end_index,
    message_content_text_annotations_file_path_object_file_path_t *file_path
    ) {
    message_content_text_object_text_annotations_inner_t *message_content_text_object_text_annotations_inner_local_var = malloc(sizeof(message_content_text_object_text_annotations_inner_t));
    if (!message_content_text_object_text_annotations_inner_local_var) {
        return NULL;
    }
    memset(message_content_text_object_text_annotations_inner_local_var, 0, sizeof(message_content_text_object_text_annotations_inner_t));
    message_content_text_object_text_annotations_inner_local_var->_library_owned = 1;
    message_content_text_object_text_annotations_inner_local_var->type = type;
    message_content_text_object_text_annotations_inner_local_var->text = text;
    message_content_text_object_text_annotations_inner_local_var->file_citation = file_citation;
    message_content_text_object_text_annotations_inner_local_var->start_index = start_index;
    message_content_text_object_text_annotations_inner_local_var->end_index = end_index;
    message_content_text_object_text_annotations_inner_local_var->file_path = file_path;
    return message_content_text_object_text_annotations_inner_local_var;
}

__attribute__((deprecated)) message_content_text_object_text_annotations_inner_t *message_content_text_object_text_annotations_inner_create(
    openai_api_message_content_text_object_text_annotations_inner_TYPE_e type,
    char *text,
    message_content_text_annotations_file_citation_object_file_citation_t *file_citation,
    int *start_index,
    int *end_index,
    message_content_text_annotations_file_path_object_file_path_t *file_path
    ) {
    int *start_index_copy = NULL;
    if (start_index) {
        start_index_copy = malloc(sizeof(int));
        if (start_index_copy) *start_index_copy = *start_index;
    }
    int *end_index_copy = NULL;
    if (end_index) {
        end_index_copy = malloc(sizeof(int));
        if (end_index_copy) *end_index_copy = *end_index;
    }
    message_content_text_object_text_annotations_inner_t *result = message_content_text_object_text_annotations_inner_create_internal (
        type,
        text,
        file_citation,
        start_index_copy,
        end_index_copy,
        file_path
        );
    if (!result) {
        free(start_index_copy);
        free(end_index_copy);
    }
    return result;
}

void message_content_text_object_text_annotations_inner_free(message_content_text_object_text_annotations_inner_t *message_content_text_object_text_annotations_inner) {
    if(NULL == message_content_text_object_text_annotations_inner){
        return ;
    }
    if(message_content_text_object_text_annotations_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "message_content_text_object_text_annotations_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (message_content_text_object_text_annotations_inner->text) {
        free(message_content_text_object_text_annotations_inner->text);
        message_content_text_object_text_annotations_inner->text = NULL;
    }
    if (message_content_text_object_text_annotations_inner->file_citation) {
        message_content_text_annotations_file_citation_object_file_citation_free(message_content_text_object_text_annotations_inner->file_citation);
        message_content_text_object_text_annotations_inner->file_citation = NULL;
    }
    if (message_content_text_object_text_annotations_inner->start_index) {
        free(message_content_text_object_text_annotations_inner->start_index);
        message_content_text_object_text_annotations_inner->start_index = NULL;
    }
    if (message_content_text_object_text_annotations_inner->end_index) {
        free(message_content_text_object_text_annotations_inner->end_index);
        message_content_text_object_text_annotations_inner->end_index = NULL;
    }
    if (message_content_text_object_text_annotations_inner->file_path) {
        message_content_text_annotations_file_path_object_file_path_free(message_content_text_object_text_annotations_inner->file_path);
        message_content_text_object_text_annotations_inner->file_path = NULL;
    }
    free(message_content_text_object_text_annotations_inner);
}

cJSON *message_content_text_object_text_annotations_inner_convertToJSON(message_content_text_object_text_annotations_inner_t *message_content_text_object_text_annotations_inner) {
    cJSON *item = cJSON_CreateObject();

    // message_content_text_object_text_annotations_inner->type
    if (openai_api_message_content_text_object_text_annotations_inner_TYPE_NULL == message_content_text_object_text_annotations_inner->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", message_content_text_object_text_annotations_inner_type_ToString(message_content_text_object_text_annotations_inner->type)) == NULL)
    {
    goto fail; //Enum
    }


    // message_content_text_object_text_annotations_inner->text
    if (!message_content_text_object_text_annotations_inner->text) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "text", message_content_text_object_text_annotations_inner->text) == NULL) {
    goto fail; //String
    }


    // message_content_text_object_text_annotations_inner->file_citation
    if (!message_content_text_object_text_annotations_inner->file_citation) {
        goto fail;
    }
    cJSON *file_citation_local_JSON = message_content_text_annotations_file_citation_object_file_citation_convertToJSON(message_content_text_object_text_annotations_inner->file_citation);
    if(file_citation_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "file_citation", file_citation_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // message_content_text_object_text_annotations_inner->start_index
    if (!message_content_text_object_text_annotations_inner->start_index) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "start_index", *message_content_text_object_text_annotations_inner->start_index) == NULL) {
    goto fail; //Numeric
    }


    // message_content_text_object_text_annotations_inner->end_index
    if (!message_content_text_object_text_annotations_inner->end_index) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "end_index", *message_content_text_object_text_annotations_inner->end_index) == NULL) {
    goto fail; //Numeric
    }


    // message_content_text_object_text_annotations_inner->file_path
    if (!message_content_text_object_text_annotations_inner->file_path) {
        goto fail;
    }
    cJSON *file_path_local_JSON = message_content_text_annotations_file_path_object_file_path_convertToJSON(message_content_text_object_text_annotations_inner->file_path);
    if(file_path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "file_path", file_path_local_JSON);
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

message_content_text_object_text_annotations_inner_t *message_content_text_object_text_annotations_inner_parseFromJSON(cJSON *message_content_text_object_text_annotations_innerJSON){

    message_content_text_object_text_annotations_inner_t *message_content_text_object_text_annotations_inner_local_var = NULL;

    char *text_local_str = NULL;

    // define the local variable for message_content_text_object_text_annotations_inner->file_citation
    message_content_text_annotations_file_citation_object_file_citation_t *file_citation_local_nonprim = NULL;

    // define the local variable for message_content_text_object_text_annotations_inner->start_index
    int *start_index_local_var = NULL;

    // define the local variable for message_content_text_object_text_annotations_inner->end_index
    int *end_index_local_var = NULL;

    // define the local variable for message_content_text_object_text_annotations_inner->file_path
    message_content_text_annotations_file_path_object_file_path_t *file_path_local_nonprim = NULL;

    // message_content_text_object_text_annotations_inner->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(message_content_text_object_text_annotations_innerJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_message_content_text_object_text_annotations_inner_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = message_content_text_object_text_annotations_inner_type_FromString(type->valuestring);

    // message_content_text_object_text_annotations_inner->text
    cJSON *text = cJSON_GetObjectItemCaseSensitive(message_content_text_object_text_annotations_innerJSON, "text");
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

    // message_content_text_object_text_annotations_inner->file_citation
    cJSON *file_citation = cJSON_GetObjectItemCaseSensitive(message_content_text_object_text_annotations_innerJSON, "file_citation");
    if (cJSON_IsNull(file_citation)) {
        file_citation = NULL;
    }
    if (!file_citation) {
        goto end;
    }

    
    file_citation_local_nonprim = message_content_text_annotations_file_citation_object_file_citation_parseFromJSON(file_citation); //nonprimitive

    // message_content_text_object_text_annotations_inner->start_index
    cJSON *start_index = cJSON_GetObjectItemCaseSensitive(message_content_text_object_text_annotations_innerJSON, "start_index");
    if (cJSON_IsNull(start_index)) {
        start_index = NULL;
    }
    if (!start_index) {
        goto end;
    }

    
    if(!cJSON_IsNumber(start_index))
    {
    goto end; //Numeric
    }
    start_index_local_var = malloc(sizeof(int));
    if(!start_index_local_var)
    {
        goto end;
    }
    *start_index_local_var = start_index->valuedouble;

    // message_content_text_object_text_annotations_inner->end_index
    cJSON *end_index = cJSON_GetObjectItemCaseSensitive(message_content_text_object_text_annotations_innerJSON, "end_index");
    if (cJSON_IsNull(end_index)) {
        end_index = NULL;
    }
    if (!end_index) {
        goto end;
    }

    
    if(!cJSON_IsNumber(end_index))
    {
    goto end; //Numeric
    }
    end_index_local_var = malloc(sizeof(int));
    if(!end_index_local_var)
    {
        goto end;
    }
    *end_index_local_var = end_index->valuedouble;

    // message_content_text_object_text_annotations_inner->file_path
    cJSON *file_path = cJSON_GetObjectItemCaseSensitive(message_content_text_object_text_annotations_innerJSON, "file_path");
    if (cJSON_IsNull(file_path)) {
        file_path = NULL;
    }
    if (!file_path) {
        goto end;
    }

    
    file_path_local_nonprim = message_content_text_annotations_file_path_object_file_path_parseFromJSON(file_path); //nonprimitive


    if (text && !cJSON_IsNull(text)) text_local_str = strdup(text->valuestring);

    message_content_text_object_text_annotations_inner_local_var = message_content_text_object_text_annotations_inner_create_internal (
        typeVariable,
        text_local_str,
        file_citation_local_nonprim,
        start_index_local_var,
        end_index_local_var,
        file_path_local_nonprim
        );

    if (!message_content_text_object_text_annotations_inner_local_var) {
        goto end;
    }

    return message_content_text_object_text_annotations_inner_local_var;
end:
    if (text_local_str) {
        free(text_local_str);
        text_local_str = NULL;
    }
    if (file_citation_local_nonprim) {
        message_content_text_annotations_file_citation_object_file_citation_free(file_citation_local_nonprim);
        file_citation_local_nonprim = NULL;
    }
    if (start_index_local_var) {
        free(start_index_local_var);
        start_index_local_var = NULL;
    }
    if (end_index_local_var) {
        free(end_index_local_var);
        end_index_local_var = NULL;
    }
    if (file_path_local_nonprim) {
        message_content_text_annotations_file_path_object_file_path_free(file_path_local_nonprim);
        file_path_local_nonprim = NULL;
    }
    return NULL;

}
