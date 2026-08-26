#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_moderation_request_input_one_of_inner_one_of_image_url.h"



static create_moderation_request_input_one_of_inner_one_of_image_url_t *create_moderation_request_input_one_of_inner_one_of_image_url_create_internal(
    char *url
    ) {
    create_moderation_request_input_one_of_inner_one_of_image_url_t *create_moderation_request_input_one_of_inner_one_of_image_url_local_var = malloc(sizeof(create_moderation_request_input_one_of_inner_one_of_image_url_t));
    if (!create_moderation_request_input_one_of_inner_one_of_image_url_local_var) {
        return NULL;
    }
    memset(create_moderation_request_input_one_of_inner_one_of_image_url_local_var, 0, sizeof(create_moderation_request_input_one_of_inner_one_of_image_url_t));
    create_moderation_request_input_one_of_inner_one_of_image_url_local_var->_library_owned = 1;
    create_moderation_request_input_one_of_inner_one_of_image_url_local_var->url = url;
    return create_moderation_request_input_one_of_inner_one_of_image_url_local_var;
}

__attribute__((deprecated)) create_moderation_request_input_one_of_inner_one_of_image_url_t *create_moderation_request_input_one_of_inner_one_of_image_url_create(
    char *url
    ) {
    create_moderation_request_input_one_of_inner_one_of_image_url_t *result = create_moderation_request_input_one_of_inner_one_of_image_url_create_internal (
        url
        );
    if (!result) {
    }
    return result;
}

void create_moderation_request_input_one_of_inner_one_of_image_url_free(create_moderation_request_input_one_of_inner_one_of_image_url_t *create_moderation_request_input_one_of_inner_one_of_image_url) {
    if(NULL == create_moderation_request_input_one_of_inner_one_of_image_url){
        return ;
    }
    if(create_moderation_request_input_one_of_inner_one_of_image_url->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "create_moderation_request_input_one_of_inner_one_of_image_url_free");
        return ;
    }
    listEntry_t *listEntry;
    if (create_moderation_request_input_one_of_inner_one_of_image_url->url) {
        free(create_moderation_request_input_one_of_inner_one_of_image_url->url);
        create_moderation_request_input_one_of_inner_one_of_image_url->url = NULL;
    }
    free(create_moderation_request_input_one_of_inner_one_of_image_url);
}

cJSON *create_moderation_request_input_one_of_inner_one_of_image_url_convertToJSON(create_moderation_request_input_one_of_inner_one_of_image_url_t *create_moderation_request_input_one_of_inner_one_of_image_url) {
    cJSON *item = cJSON_CreateObject();

    // create_moderation_request_input_one_of_inner_one_of_image_url->url
    if (!create_moderation_request_input_one_of_inner_one_of_image_url->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", create_moderation_request_input_one_of_inner_one_of_image_url->url) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

create_moderation_request_input_one_of_inner_one_of_image_url_t *create_moderation_request_input_one_of_inner_one_of_image_url_parseFromJSON(cJSON *create_moderation_request_input_one_of_inner_one_of_image_urlJSON){

    create_moderation_request_input_one_of_inner_one_of_image_url_t *create_moderation_request_input_one_of_inner_one_of_image_url_local_var = NULL;

    char *url_local_str = NULL;

    // create_moderation_request_input_one_of_inner_one_of_image_url->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(create_moderation_request_input_one_of_inner_one_of_image_urlJSON, "url");
    if (cJSON_IsNull(url)) {
        url = NULL;
    }
    if (!url) {
        goto end;
    }

    
    if(!cJSON_IsString(url))
    {
    goto end; //String
    }


    if (url && !cJSON_IsNull(url)) url_local_str = strdup(url->valuestring);

    create_moderation_request_input_one_of_inner_one_of_image_url_local_var = create_moderation_request_input_one_of_inner_one_of_image_url_create_internal (
        url_local_str
        );

    if (!create_moderation_request_input_one_of_inner_one_of_image_url_local_var) {
        goto end;
    }

    return create_moderation_request_input_one_of_inner_one_of_image_url_local_var;
end:
    if (url_local_str) {
        free(url_local_str);
        url_local_str = NULL;
    }
    return NULL;

}
