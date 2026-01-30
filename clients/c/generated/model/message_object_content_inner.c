#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "message_object_content_inner.h"


char* message_object_content_inner_type_ToString(openai_api_message_object_content_inner_TYPE_e type) {
    char* typeArray[] =  { "NULL", "image_file", "image_url", "text", "refusal" };
    return typeArray[type];
}

openai_api_message_object_content_inner_TYPE_e message_object_content_inner_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "image_file", "image_url", "text", "refusal" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static message_object_content_inner_t *message_object_content_inner_create_internal(
    openai_api_message_object_content_inner_TYPE_e type,
    message_content_image_file_object_image_file_t *image_file,
    message_content_image_url_object_image_url_t *image_url,
    message_content_text_object_text_t *text,
    char *refusal
    ) {
    message_object_content_inner_t *message_object_content_inner_local_var = malloc(sizeof(message_object_content_inner_t));
    if (!message_object_content_inner_local_var) {
        return NULL;
    }
    message_object_content_inner_local_var->type = type;
    message_object_content_inner_local_var->image_file = image_file;
    message_object_content_inner_local_var->image_url = image_url;
    message_object_content_inner_local_var->text = text;
    message_object_content_inner_local_var->refusal = refusal;

    message_object_content_inner_local_var->_library_owned = 1;
    return message_object_content_inner_local_var;
}

__attribute__((deprecated)) message_object_content_inner_t *message_object_content_inner_create(
    openai_api_message_object_content_inner_TYPE_e type,
    message_content_image_file_object_image_file_t *image_file,
    message_content_image_url_object_image_url_t *image_url,
    message_content_text_object_text_t *text,
    char *refusal
    ) {
    return message_object_content_inner_create_internal (
        type,
        image_file,
        image_url,
        text,
        refusal
        );
}

void message_object_content_inner_free(message_object_content_inner_t *message_object_content_inner) {
    if(NULL == message_object_content_inner){
        return ;
    }
    if(message_object_content_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "message_object_content_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (message_object_content_inner->image_file) {
        message_content_image_file_object_image_file_free(message_object_content_inner->image_file);
        message_object_content_inner->image_file = NULL;
    }
    if (message_object_content_inner->image_url) {
        message_content_image_url_object_image_url_free(message_object_content_inner->image_url);
        message_object_content_inner->image_url = NULL;
    }
    if (message_object_content_inner->text) {
        message_content_text_object_text_free(message_object_content_inner->text);
        message_object_content_inner->text = NULL;
    }
    if (message_object_content_inner->refusal) {
        free(message_object_content_inner->refusal);
        message_object_content_inner->refusal = NULL;
    }
    free(message_object_content_inner);
}

cJSON *message_object_content_inner_convertToJSON(message_object_content_inner_t *message_object_content_inner) {
    cJSON *item = cJSON_CreateObject();

    // message_object_content_inner->type
    if (openai_api_message_object_content_inner_TYPE_NULL == message_object_content_inner->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", message_object_content_inner_type_ToString(message_object_content_inner->type)) == NULL)
    {
    goto fail; //Enum
    }


    // message_object_content_inner->image_file
    if (!message_object_content_inner->image_file) {
        goto fail;
    }
    cJSON *image_file_local_JSON = message_content_image_file_object_image_file_convertToJSON(message_object_content_inner->image_file);
    if(image_file_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "image_file", image_file_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // message_object_content_inner->image_url
    if (!message_object_content_inner->image_url) {
        goto fail;
    }
    cJSON *image_url_local_JSON = message_content_image_url_object_image_url_convertToJSON(message_object_content_inner->image_url);
    if(image_url_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "image_url", image_url_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // message_object_content_inner->text
    if (!message_object_content_inner->text) {
        goto fail;
    }
    cJSON *text_local_JSON = message_content_text_object_text_convertToJSON(message_object_content_inner->text);
    if(text_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "text", text_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // message_object_content_inner->refusal
    if (!message_object_content_inner->refusal) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "refusal", message_object_content_inner->refusal) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

message_object_content_inner_t *message_object_content_inner_parseFromJSON(cJSON *message_object_content_innerJSON){

    message_object_content_inner_t *message_object_content_inner_local_var = NULL;

    // define the local variable for message_object_content_inner->image_file
    message_content_image_file_object_image_file_t *image_file_local_nonprim = NULL;

    // define the local variable for message_object_content_inner->image_url
    message_content_image_url_object_image_url_t *image_url_local_nonprim = NULL;

    // define the local variable for message_object_content_inner->text
    message_content_text_object_text_t *text_local_nonprim = NULL;

    // message_object_content_inner->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(message_object_content_innerJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_message_object_content_inner_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = message_object_content_inner_type_FromString(type->valuestring);

    // message_object_content_inner->image_file
    cJSON *image_file = cJSON_GetObjectItemCaseSensitive(message_object_content_innerJSON, "image_file");
    if (cJSON_IsNull(image_file)) {
        image_file = NULL;
    }
    if (!image_file) {
        goto end;
    }

    
    image_file_local_nonprim = message_content_image_file_object_image_file_parseFromJSON(image_file); //nonprimitive

    // message_object_content_inner->image_url
    cJSON *image_url = cJSON_GetObjectItemCaseSensitive(message_object_content_innerJSON, "image_url");
    if (cJSON_IsNull(image_url)) {
        image_url = NULL;
    }
    if (!image_url) {
        goto end;
    }

    
    image_url_local_nonprim = message_content_image_url_object_image_url_parseFromJSON(image_url); //nonprimitive

    // message_object_content_inner->text
    cJSON *text = cJSON_GetObjectItemCaseSensitive(message_object_content_innerJSON, "text");
    if (cJSON_IsNull(text)) {
        text = NULL;
    }
    if (!text) {
        goto end;
    }

    
    text_local_nonprim = message_content_text_object_text_parseFromJSON(text); //nonprimitive

    // message_object_content_inner->refusal
    cJSON *refusal = cJSON_GetObjectItemCaseSensitive(message_object_content_innerJSON, "refusal");
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


    message_object_content_inner_local_var = message_object_content_inner_create_internal (
        typeVariable,
        image_file_local_nonprim,
        image_url_local_nonprim,
        text_local_nonprim,
        strdup(refusal->valuestring)
        );

    return message_object_content_inner_local_var;
end:
    if (image_file_local_nonprim) {
        message_content_image_file_object_image_file_free(image_file_local_nonprim);
        image_file_local_nonprim = NULL;
    }
    if (image_url_local_nonprim) {
        message_content_image_url_object_image_url_free(image_url_local_nonprim);
        image_url_local_nonprim = NULL;
    }
    if (text_local_nonprim) {
        message_content_text_object_text_free(text_local_nonprim);
        text_local_nonprim = NULL;
    }
    return NULL;

}
