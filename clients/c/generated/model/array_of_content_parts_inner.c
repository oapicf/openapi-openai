#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "array_of_content_parts_inner.h"


char* array_of_content_parts_inner_type_ToString(openai_api_array_of_content_parts_inner_TYPE_e type) {
    char* typeArray[] =  { "NULL", "image_file", "image_url", "text" };
    return typeArray[type];
}

openai_api_array_of_content_parts_inner_TYPE_e array_of_content_parts_inner_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "image_file", "image_url", "text" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static array_of_content_parts_inner_t *array_of_content_parts_inner_create_internal(
    openai_api_array_of_content_parts_inner_TYPE_e type,
    message_content_image_file_object_image_file_t *image_file,
    message_content_image_url_object_image_url_t *image_url,
    char *text
    ) {
    array_of_content_parts_inner_t *array_of_content_parts_inner_local_var = malloc(sizeof(array_of_content_parts_inner_t));
    if (!array_of_content_parts_inner_local_var) {
        return NULL;
    }
    array_of_content_parts_inner_local_var->type = type;
    array_of_content_parts_inner_local_var->image_file = image_file;
    array_of_content_parts_inner_local_var->image_url = image_url;
    array_of_content_parts_inner_local_var->text = text;

    array_of_content_parts_inner_local_var->_library_owned = 1;
    return array_of_content_parts_inner_local_var;
}

__attribute__((deprecated)) array_of_content_parts_inner_t *array_of_content_parts_inner_create(
    openai_api_array_of_content_parts_inner_TYPE_e type,
    message_content_image_file_object_image_file_t *image_file,
    message_content_image_url_object_image_url_t *image_url,
    char *text
    ) {
    return array_of_content_parts_inner_create_internal (
        type,
        image_file,
        image_url,
        text
        );
}

void array_of_content_parts_inner_free(array_of_content_parts_inner_t *array_of_content_parts_inner) {
    if(NULL == array_of_content_parts_inner){
        return ;
    }
    if(array_of_content_parts_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "array_of_content_parts_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (array_of_content_parts_inner->image_file) {
        message_content_image_file_object_image_file_free(array_of_content_parts_inner->image_file);
        array_of_content_parts_inner->image_file = NULL;
    }
    if (array_of_content_parts_inner->image_url) {
        message_content_image_url_object_image_url_free(array_of_content_parts_inner->image_url);
        array_of_content_parts_inner->image_url = NULL;
    }
    if (array_of_content_parts_inner->text) {
        free(array_of_content_parts_inner->text);
        array_of_content_parts_inner->text = NULL;
    }
    free(array_of_content_parts_inner);
}

cJSON *array_of_content_parts_inner_convertToJSON(array_of_content_parts_inner_t *array_of_content_parts_inner) {
    cJSON *item = cJSON_CreateObject();

    // array_of_content_parts_inner->type
    if (openai_api_array_of_content_parts_inner_TYPE_NULL == array_of_content_parts_inner->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", array_of_content_parts_inner_type_ToString(array_of_content_parts_inner->type)) == NULL)
    {
    goto fail; //Enum
    }


    // array_of_content_parts_inner->image_file
    if (!array_of_content_parts_inner->image_file) {
        goto fail;
    }
    cJSON *image_file_local_JSON = message_content_image_file_object_image_file_convertToJSON(array_of_content_parts_inner->image_file);
    if(image_file_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "image_file", image_file_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // array_of_content_parts_inner->image_url
    if (!array_of_content_parts_inner->image_url) {
        goto fail;
    }
    cJSON *image_url_local_JSON = message_content_image_url_object_image_url_convertToJSON(array_of_content_parts_inner->image_url);
    if(image_url_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "image_url", image_url_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // array_of_content_parts_inner->text
    if (!array_of_content_parts_inner->text) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "text", array_of_content_parts_inner->text) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

array_of_content_parts_inner_t *array_of_content_parts_inner_parseFromJSON(cJSON *array_of_content_parts_innerJSON){

    array_of_content_parts_inner_t *array_of_content_parts_inner_local_var = NULL;

    // define the local variable for array_of_content_parts_inner->image_file
    message_content_image_file_object_image_file_t *image_file_local_nonprim = NULL;

    // define the local variable for array_of_content_parts_inner->image_url
    message_content_image_url_object_image_url_t *image_url_local_nonprim = NULL;

    // array_of_content_parts_inner->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(array_of_content_parts_innerJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_array_of_content_parts_inner_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = array_of_content_parts_inner_type_FromString(type->valuestring);

    // array_of_content_parts_inner->image_file
    cJSON *image_file = cJSON_GetObjectItemCaseSensitive(array_of_content_parts_innerJSON, "image_file");
    if (cJSON_IsNull(image_file)) {
        image_file = NULL;
    }
    if (!image_file) {
        goto end;
    }

    
    image_file_local_nonprim = message_content_image_file_object_image_file_parseFromJSON(image_file); //nonprimitive

    // array_of_content_parts_inner->image_url
    cJSON *image_url = cJSON_GetObjectItemCaseSensitive(array_of_content_parts_innerJSON, "image_url");
    if (cJSON_IsNull(image_url)) {
        image_url = NULL;
    }
    if (!image_url) {
        goto end;
    }

    
    image_url_local_nonprim = message_content_image_url_object_image_url_parseFromJSON(image_url); //nonprimitive

    // array_of_content_parts_inner->text
    cJSON *text = cJSON_GetObjectItemCaseSensitive(array_of_content_parts_innerJSON, "text");
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


    array_of_content_parts_inner_local_var = array_of_content_parts_inner_create_internal (
        typeVariable,
        image_file_local_nonprim,
        image_url_local_nonprim,
        strdup(text->valuestring)
        );

    return array_of_content_parts_inner_local_var;
end:
    if (image_file_local_nonprim) {
        message_content_image_file_object_image_file_free(image_file_local_nonprim);
        image_file_local_nonprim = NULL;
    }
    if (image_url_local_nonprim) {
        message_content_image_url_object_image_url_free(image_url_local_nonprim);
        image_url_local_nonprim = NULL;
    }
    return NULL;

}
