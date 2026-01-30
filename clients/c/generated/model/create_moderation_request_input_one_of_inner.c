#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_moderation_request_input_one_of_inner.h"


char* create_moderation_request_input_one_of_inner_type_ToString(openai_api_create_moderation_request_input_one_of_inner_TYPE_e type) {
    char* typeArray[] =  { "NULL", "image_url", "text" };
    return typeArray[type];
}

openai_api_create_moderation_request_input_one_of_inner_TYPE_e create_moderation_request_input_one_of_inner_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "image_url", "text" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static create_moderation_request_input_one_of_inner_t *create_moderation_request_input_one_of_inner_create_internal(
    openai_api_create_moderation_request_input_one_of_inner_TYPE_e type,
    create_moderation_request_input_one_of_inner_one_of_image_url_t *image_url,
    char *text
    ) {
    create_moderation_request_input_one_of_inner_t *create_moderation_request_input_one_of_inner_local_var = malloc(sizeof(create_moderation_request_input_one_of_inner_t));
    if (!create_moderation_request_input_one_of_inner_local_var) {
        return NULL;
    }
    create_moderation_request_input_one_of_inner_local_var->type = type;
    create_moderation_request_input_one_of_inner_local_var->image_url = image_url;
    create_moderation_request_input_one_of_inner_local_var->text = text;

    create_moderation_request_input_one_of_inner_local_var->_library_owned = 1;
    return create_moderation_request_input_one_of_inner_local_var;
}

__attribute__((deprecated)) create_moderation_request_input_one_of_inner_t *create_moderation_request_input_one_of_inner_create(
    openai_api_create_moderation_request_input_one_of_inner_TYPE_e type,
    create_moderation_request_input_one_of_inner_one_of_image_url_t *image_url,
    char *text
    ) {
    return create_moderation_request_input_one_of_inner_create_internal (
        type,
        image_url,
        text
        );
}

void create_moderation_request_input_one_of_inner_free(create_moderation_request_input_one_of_inner_t *create_moderation_request_input_one_of_inner) {
    if(NULL == create_moderation_request_input_one_of_inner){
        return ;
    }
    if(create_moderation_request_input_one_of_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "create_moderation_request_input_one_of_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (create_moderation_request_input_one_of_inner->image_url) {
        create_moderation_request_input_one_of_inner_one_of_image_url_free(create_moderation_request_input_one_of_inner->image_url);
        create_moderation_request_input_one_of_inner->image_url = NULL;
    }
    if (create_moderation_request_input_one_of_inner->text) {
        free(create_moderation_request_input_one_of_inner->text);
        create_moderation_request_input_one_of_inner->text = NULL;
    }
    free(create_moderation_request_input_one_of_inner);
}

cJSON *create_moderation_request_input_one_of_inner_convertToJSON(create_moderation_request_input_one_of_inner_t *create_moderation_request_input_one_of_inner) {
    cJSON *item = cJSON_CreateObject();

    // create_moderation_request_input_one_of_inner->type
    if (openai_api_create_moderation_request_input_one_of_inner_TYPE_NULL == create_moderation_request_input_one_of_inner->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", create_moderation_request_input_one_of_inner_type_ToString(create_moderation_request_input_one_of_inner->type)) == NULL)
    {
    goto fail; //Enum
    }


    // create_moderation_request_input_one_of_inner->image_url
    if (!create_moderation_request_input_one_of_inner->image_url) {
        goto fail;
    }
    cJSON *image_url_local_JSON = create_moderation_request_input_one_of_inner_one_of_image_url_convertToJSON(create_moderation_request_input_one_of_inner->image_url);
    if(image_url_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "image_url", image_url_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // create_moderation_request_input_one_of_inner->text
    if (!create_moderation_request_input_one_of_inner->text) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "text", create_moderation_request_input_one_of_inner->text) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

create_moderation_request_input_one_of_inner_t *create_moderation_request_input_one_of_inner_parseFromJSON(cJSON *create_moderation_request_input_one_of_innerJSON){

    create_moderation_request_input_one_of_inner_t *create_moderation_request_input_one_of_inner_local_var = NULL;

    // define the local variable for create_moderation_request_input_one_of_inner->image_url
    create_moderation_request_input_one_of_inner_one_of_image_url_t *image_url_local_nonprim = NULL;

    // create_moderation_request_input_one_of_inner->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(create_moderation_request_input_one_of_innerJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_create_moderation_request_input_one_of_inner_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = create_moderation_request_input_one_of_inner_type_FromString(type->valuestring);

    // create_moderation_request_input_one_of_inner->image_url
    cJSON *image_url = cJSON_GetObjectItemCaseSensitive(create_moderation_request_input_one_of_innerJSON, "image_url");
    if (cJSON_IsNull(image_url)) {
        image_url = NULL;
    }
    if (!image_url) {
        goto end;
    }

    
    image_url_local_nonprim = create_moderation_request_input_one_of_inner_one_of_image_url_parseFromJSON(image_url); //nonprimitive

    // create_moderation_request_input_one_of_inner->text
    cJSON *text = cJSON_GetObjectItemCaseSensitive(create_moderation_request_input_one_of_innerJSON, "text");
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


    create_moderation_request_input_one_of_inner_local_var = create_moderation_request_input_one_of_inner_create_internal (
        typeVariable,
        image_url_local_nonprim,
        strdup(text->valuestring)
        );

    return create_moderation_request_input_one_of_inner_local_var;
end:
    if (image_url_local_nonprim) {
        create_moderation_request_input_one_of_inner_one_of_image_url_free(image_url_local_nonprim);
        image_url_local_nonprim = NULL;
    }
    return NULL;

}
