#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "image.h"



image_t *image_create(
    char *b64_json,
    char *url,
    char *revised_prompt
    ) {
    image_t *image_local_var = malloc(sizeof(image_t));
    if (!image_local_var) {
        return NULL;
    }
    image_local_var->b64_json = b64_json;
    image_local_var->url = url;
    image_local_var->revised_prompt = revised_prompt;

    return image_local_var;
}


void image_free(image_t *image) {
    if(NULL == image){
        return ;
    }
    listEntry_t *listEntry;
    if (image->b64_json) {
        free(image->b64_json);
        image->b64_json = NULL;
    }
    if (image->url) {
        free(image->url);
        image->url = NULL;
    }
    if (image->revised_prompt) {
        free(image->revised_prompt);
        image->revised_prompt = NULL;
    }
    free(image);
}

cJSON *image_convertToJSON(image_t *image) {
    cJSON *item = cJSON_CreateObject();

    // image->b64_json
    if(image->b64_json) {
    if(cJSON_AddStringToObject(item, "b64_json", image->b64_json) == NULL) {
    goto fail; //String
    }
    }


    // image->url
    if(image->url) {
    if(cJSON_AddStringToObject(item, "url", image->url) == NULL) {
    goto fail; //String
    }
    }


    // image->revised_prompt
    if(image->revised_prompt) {
    if(cJSON_AddStringToObject(item, "revised_prompt", image->revised_prompt) == NULL) {
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

image_t *image_parseFromJSON(cJSON *imageJSON){

    image_t *image_local_var = NULL;

    // image->b64_json
    cJSON *b64_json = cJSON_GetObjectItemCaseSensitive(imageJSON, "b64_json");
    if (b64_json) { 
    if(!cJSON_IsString(b64_json) && !cJSON_IsNull(b64_json))
    {
    goto end; //String
    }
    }

    // image->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(imageJSON, "url");
    if (url) { 
    if(!cJSON_IsString(url) && !cJSON_IsNull(url))
    {
    goto end; //String
    }
    }

    // image->revised_prompt
    cJSON *revised_prompt = cJSON_GetObjectItemCaseSensitive(imageJSON, "revised_prompt");
    if (revised_prompt) { 
    if(!cJSON_IsString(revised_prompt) && !cJSON_IsNull(revised_prompt))
    {
    goto end; //String
    }
    }


    image_local_var = image_create (
        b64_json && !cJSON_IsNull(b64_json) ? strdup(b64_json->valuestring) : NULL,
        url && !cJSON_IsNull(url) ? strdup(url->valuestring) : NULL,
        revised_prompt && !cJSON_IsNull(revised_prompt) ? strdup(revised_prompt->valuestring) : NULL
        );

    return image_local_var;
end:
    return NULL;

}
