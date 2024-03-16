#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "images_response_data_inner.h"



images_response_data_inner_t *images_response_data_inner_create(
    char *url,
    char *b64_json
    ) {
    images_response_data_inner_t *images_response_data_inner_local_var = malloc(sizeof(images_response_data_inner_t));
    if (!images_response_data_inner_local_var) {
        return NULL;
    }
    images_response_data_inner_local_var->url = url;
    images_response_data_inner_local_var->b64_json = b64_json;

    return images_response_data_inner_local_var;
}


void images_response_data_inner_free(images_response_data_inner_t *images_response_data_inner) {
    if(NULL == images_response_data_inner){
        return ;
    }
    listEntry_t *listEntry;
    if (images_response_data_inner->url) {
        free(images_response_data_inner->url);
        images_response_data_inner->url = NULL;
    }
    if (images_response_data_inner->b64_json) {
        free(images_response_data_inner->b64_json);
        images_response_data_inner->b64_json = NULL;
    }
    free(images_response_data_inner);
}

cJSON *images_response_data_inner_convertToJSON(images_response_data_inner_t *images_response_data_inner) {
    cJSON *item = cJSON_CreateObject();

    // images_response_data_inner->url
    if(images_response_data_inner->url) {
    if(cJSON_AddStringToObject(item, "url", images_response_data_inner->url) == NULL) {
    goto fail; //String
    }
    }


    // images_response_data_inner->b64_json
    if(images_response_data_inner->b64_json) {
    if(cJSON_AddStringToObject(item, "b64_json", images_response_data_inner->b64_json) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

images_response_data_inner_t *images_response_data_inner_parseFromJSON(cJSON *images_response_data_innerJSON){

    images_response_data_inner_t *images_response_data_inner_local_var = NULL;

    // images_response_data_inner->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(images_response_data_innerJSON, "url");
    if (url) { 
    if(!cJSON_IsString(url) && !cJSON_IsNull(url))
    {
    goto end; //String
    }
    }

    // images_response_data_inner->b64_json
    cJSON *b64_json = cJSON_GetObjectItemCaseSensitive(images_response_data_innerJSON, "b64_json");
    if (b64_json) { 
    if(!cJSON_IsString(b64_json) && !cJSON_IsNull(b64_json))
    {
    goto end; //String
    }
    }


    images_response_data_inner_local_var = images_response_data_inner_create (
        url && !cJSON_IsNull(url) ? strdup(url->valuestring) : NULL,
        b64_json && !cJSON_IsNull(b64_json) ? strdup(b64_json->valuestring) : NULL
        );

    return images_response_data_inner_local_var;
end:
    return NULL;

}
