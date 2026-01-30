#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_moderation_request_input_one_of_inner_one_of.h"


char* create_moderation_request_input_one_of_inner_one_of_type_ToString(openai_api_create_moderation_request_input_one_of_inner_one_of_TYPE_e type) {
    char* typeArray[] =  { "NULL", "image_url" };
    return typeArray[type];
}

openai_api_create_moderation_request_input_one_of_inner_one_of_TYPE_e create_moderation_request_input_one_of_inner_one_of_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "image_url" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static create_moderation_request_input_one_of_inner_one_of_t *create_moderation_request_input_one_of_inner_one_of_create_internal(
    openai_api_create_moderation_request_input_one_of_inner_one_of_TYPE_e type,
    create_moderation_request_input_one_of_inner_one_of_image_url_t *image_url
    ) {
    create_moderation_request_input_one_of_inner_one_of_t *create_moderation_request_input_one_of_inner_one_of_local_var = malloc(sizeof(create_moderation_request_input_one_of_inner_one_of_t));
    if (!create_moderation_request_input_one_of_inner_one_of_local_var) {
        return NULL;
    }
    create_moderation_request_input_one_of_inner_one_of_local_var->type = type;
    create_moderation_request_input_one_of_inner_one_of_local_var->image_url = image_url;

    create_moderation_request_input_one_of_inner_one_of_local_var->_library_owned = 1;
    return create_moderation_request_input_one_of_inner_one_of_local_var;
}

__attribute__((deprecated)) create_moderation_request_input_one_of_inner_one_of_t *create_moderation_request_input_one_of_inner_one_of_create(
    openai_api_create_moderation_request_input_one_of_inner_one_of_TYPE_e type,
    create_moderation_request_input_one_of_inner_one_of_image_url_t *image_url
    ) {
    return create_moderation_request_input_one_of_inner_one_of_create_internal (
        type,
        image_url
        );
}

void create_moderation_request_input_one_of_inner_one_of_free(create_moderation_request_input_one_of_inner_one_of_t *create_moderation_request_input_one_of_inner_one_of) {
    if(NULL == create_moderation_request_input_one_of_inner_one_of){
        return ;
    }
    if(create_moderation_request_input_one_of_inner_one_of->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "create_moderation_request_input_one_of_inner_one_of_free");
        return ;
    }
    listEntry_t *listEntry;
    if (create_moderation_request_input_one_of_inner_one_of->image_url) {
        create_moderation_request_input_one_of_inner_one_of_image_url_free(create_moderation_request_input_one_of_inner_one_of->image_url);
        create_moderation_request_input_one_of_inner_one_of->image_url = NULL;
    }
    free(create_moderation_request_input_one_of_inner_one_of);
}

cJSON *create_moderation_request_input_one_of_inner_one_of_convertToJSON(create_moderation_request_input_one_of_inner_one_of_t *create_moderation_request_input_one_of_inner_one_of) {
    cJSON *item = cJSON_CreateObject();

    // create_moderation_request_input_one_of_inner_one_of->type
    if (openai_api_create_moderation_request_input_one_of_inner_one_of_TYPE_NULL == create_moderation_request_input_one_of_inner_one_of->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", create_moderation_request_input_one_of_inner_one_of_type_ToString(create_moderation_request_input_one_of_inner_one_of->type)) == NULL)
    {
    goto fail; //Enum
    }


    // create_moderation_request_input_one_of_inner_one_of->image_url
    if (!create_moderation_request_input_one_of_inner_one_of->image_url) {
        goto fail;
    }
    cJSON *image_url_local_JSON = create_moderation_request_input_one_of_inner_one_of_image_url_convertToJSON(create_moderation_request_input_one_of_inner_one_of->image_url);
    if(image_url_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "image_url", image_url_local_JSON);
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

create_moderation_request_input_one_of_inner_one_of_t *create_moderation_request_input_one_of_inner_one_of_parseFromJSON(cJSON *create_moderation_request_input_one_of_inner_one_ofJSON){

    create_moderation_request_input_one_of_inner_one_of_t *create_moderation_request_input_one_of_inner_one_of_local_var = NULL;

    // define the local variable for create_moderation_request_input_one_of_inner_one_of->image_url
    create_moderation_request_input_one_of_inner_one_of_image_url_t *image_url_local_nonprim = NULL;

    // create_moderation_request_input_one_of_inner_one_of->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(create_moderation_request_input_one_of_inner_one_ofJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_create_moderation_request_input_one_of_inner_one_of_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = create_moderation_request_input_one_of_inner_one_of_type_FromString(type->valuestring);

    // create_moderation_request_input_one_of_inner_one_of->image_url
    cJSON *image_url = cJSON_GetObjectItemCaseSensitive(create_moderation_request_input_one_of_inner_one_ofJSON, "image_url");
    if (cJSON_IsNull(image_url)) {
        image_url = NULL;
    }
    if (!image_url) {
        goto end;
    }

    
    image_url_local_nonprim = create_moderation_request_input_one_of_inner_one_of_image_url_parseFromJSON(image_url); //nonprimitive


    create_moderation_request_input_one_of_inner_one_of_local_var = create_moderation_request_input_one_of_inner_one_of_create_internal (
        typeVariable,
        image_url_local_nonprim
        );

    return create_moderation_request_input_one_of_inner_one_of_local_var;
end:
    if (image_url_local_nonprim) {
        create_moderation_request_input_one_of_inner_one_of_image_url_free(image_url_local_nonprim);
        image_url_local_nonprim = NULL;
    }
    return NULL;

}
