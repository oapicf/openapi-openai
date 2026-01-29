#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "message_delta_object_delta_content_inner.h"


char* message_delta_object_delta_content_inner_type_ToString(openai_api_message_delta_object_delta_content_inner_TYPE_e type) {
    char* typeArray[] =  { "NULL", "image_file", "text" };
    return typeArray[type];
}

openai_api_message_delta_object_delta_content_inner_TYPE_e message_delta_object_delta_content_inner_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "image_file", "text" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static message_delta_object_delta_content_inner_t *message_delta_object_delta_content_inner_create_internal(
    int index,
    openai_api_message_delta_object_delta_content_inner_TYPE_e type,
    message_delta_content_image_file_object_image_file_t *image_file,
    message_delta_content_text_object_text_t *text
    ) {
    message_delta_object_delta_content_inner_t *message_delta_object_delta_content_inner_local_var = malloc(sizeof(message_delta_object_delta_content_inner_t));
    if (!message_delta_object_delta_content_inner_local_var) {
        return NULL;
    }
    message_delta_object_delta_content_inner_local_var->index = index;
    message_delta_object_delta_content_inner_local_var->type = type;
    message_delta_object_delta_content_inner_local_var->image_file = image_file;
    message_delta_object_delta_content_inner_local_var->text = text;

    message_delta_object_delta_content_inner_local_var->_library_owned = 1;
    return message_delta_object_delta_content_inner_local_var;
}

__attribute__((deprecated)) message_delta_object_delta_content_inner_t *message_delta_object_delta_content_inner_create(
    int index,
    openai_api_message_delta_object_delta_content_inner_TYPE_e type,
    message_delta_content_image_file_object_image_file_t *image_file,
    message_delta_content_text_object_text_t *text
    ) {
    return message_delta_object_delta_content_inner_create_internal (
        index,
        type,
        image_file,
        text
        );
}

void message_delta_object_delta_content_inner_free(message_delta_object_delta_content_inner_t *message_delta_object_delta_content_inner) {
    if(NULL == message_delta_object_delta_content_inner){
        return ;
    }
    if(message_delta_object_delta_content_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "message_delta_object_delta_content_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (message_delta_object_delta_content_inner->image_file) {
        message_delta_content_image_file_object_image_file_free(message_delta_object_delta_content_inner->image_file);
        message_delta_object_delta_content_inner->image_file = NULL;
    }
    if (message_delta_object_delta_content_inner->text) {
        message_delta_content_text_object_text_free(message_delta_object_delta_content_inner->text);
        message_delta_object_delta_content_inner->text = NULL;
    }
    free(message_delta_object_delta_content_inner);
}

cJSON *message_delta_object_delta_content_inner_convertToJSON(message_delta_object_delta_content_inner_t *message_delta_object_delta_content_inner) {
    cJSON *item = cJSON_CreateObject();

    // message_delta_object_delta_content_inner->index
    if (!message_delta_object_delta_content_inner->index) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "index", message_delta_object_delta_content_inner->index) == NULL) {
    goto fail; //Numeric
    }


    // message_delta_object_delta_content_inner->type
    if (openai_api_message_delta_object_delta_content_inner_TYPE_NULL == message_delta_object_delta_content_inner->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", message_delta_object_delta_content_inner_type_ToString(message_delta_object_delta_content_inner->type)) == NULL)
    {
    goto fail; //Enum
    }


    // message_delta_object_delta_content_inner->image_file
    if(message_delta_object_delta_content_inner->image_file) {
    cJSON *image_file_local_JSON = message_delta_content_image_file_object_image_file_convertToJSON(message_delta_object_delta_content_inner->image_file);
    if(image_file_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "image_file", image_file_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // message_delta_object_delta_content_inner->text
    if(message_delta_object_delta_content_inner->text) {
    cJSON *text_local_JSON = message_delta_content_text_object_text_convertToJSON(message_delta_object_delta_content_inner->text);
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

message_delta_object_delta_content_inner_t *message_delta_object_delta_content_inner_parseFromJSON(cJSON *message_delta_object_delta_content_innerJSON){

    message_delta_object_delta_content_inner_t *message_delta_object_delta_content_inner_local_var = NULL;

    // define the local variable for message_delta_object_delta_content_inner->image_file
    message_delta_content_image_file_object_image_file_t *image_file_local_nonprim = NULL;

    // define the local variable for message_delta_object_delta_content_inner->text
    message_delta_content_text_object_text_t *text_local_nonprim = NULL;

    // message_delta_object_delta_content_inner->index
    cJSON *index = cJSON_GetObjectItemCaseSensitive(message_delta_object_delta_content_innerJSON, "index");
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

    // message_delta_object_delta_content_inner->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(message_delta_object_delta_content_innerJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_message_delta_object_delta_content_inner_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = message_delta_object_delta_content_inner_type_FromString(type->valuestring);

    // message_delta_object_delta_content_inner->image_file
    cJSON *image_file = cJSON_GetObjectItemCaseSensitive(message_delta_object_delta_content_innerJSON, "image_file");
    if (cJSON_IsNull(image_file)) {
        image_file = NULL;
    }
    if (image_file) { 
    image_file_local_nonprim = message_delta_content_image_file_object_image_file_parseFromJSON(image_file); //nonprimitive
    }

    // message_delta_object_delta_content_inner->text
    cJSON *text = cJSON_GetObjectItemCaseSensitive(message_delta_object_delta_content_innerJSON, "text");
    if (cJSON_IsNull(text)) {
        text = NULL;
    }
    if (text) { 
    text_local_nonprim = message_delta_content_text_object_text_parseFromJSON(text); //nonprimitive
    }


    message_delta_object_delta_content_inner_local_var = message_delta_object_delta_content_inner_create_internal (
        index->valuedouble,
        typeVariable,
        image_file ? image_file_local_nonprim : NULL,
        text ? text_local_nonprim : NULL
        );

    return message_delta_object_delta_content_inner_local_var;
end:
    if (image_file_local_nonprim) {
        message_delta_content_image_file_object_image_file_free(image_file_local_nonprim);
        image_file_local_nonprim = NULL;
    }
    if (text_local_nonprim) {
        message_delta_content_text_object_text_free(text_local_nonprim);
        text_local_nonprim = NULL;
    }
    return NULL;

}
