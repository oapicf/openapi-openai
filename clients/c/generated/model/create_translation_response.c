#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_translation_response.h"



create_translation_response_t *create_translation_response_create(
    char *text
    ) {
    create_translation_response_t *create_translation_response_local_var = malloc(sizeof(create_translation_response_t));
    if (!create_translation_response_local_var) {
        return NULL;
    }
    create_translation_response_local_var->text = text;

    return create_translation_response_local_var;
}


void create_translation_response_free(create_translation_response_t *create_translation_response) {
    if(NULL == create_translation_response){
        return ;
    }
    listEntry_t *listEntry;
    if (create_translation_response->text) {
        free(create_translation_response->text);
        create_translation_response->text = NULL;
    }
    free(create_translation_response);
}

cJSON *create_translation_response_convertToJSON(create_translation_response_t *create_translation_response) {
    cJSON *item = cJSON_CreateObject();

    // create_translation_response->text
    if (!create_translation_response->text) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "text", create_translation_response->text) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

create_translation_response_t *create_translation_response_parseFromJSON(cJSON *create_translation_responseJSON){

    create_translation_response_t *create_translation_response_local_var = NULL;

    // create_translation_response->text
    cJSON *text = cJSON_GetObjectItemCaseSensitive(create_translation_responseJSON, "text");
    if (!text) {
        goto end;
    }

    
    if(!cJSON_IsString(text))
    {
    goto end; //String
    }


    create_translation_response_local_var = create_translation_response_create (
        strdup(text->valuestring)
        );

    return create_translation_response_local_var;
end:
    return NULL;

}
