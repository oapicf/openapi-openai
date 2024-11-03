#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_translation_response_json.h"



create_translation_response_json_t *create_translation_response_json_create(
    char *text
    ) {
    create_translation_response_json_t *create_translation_response_json_local_var = malloc(sizeof(create_translation_response_json_t));
    if (!create_translation_response_json_local_var) {
        return NULL;
    }
    create_translation_response_json_local_var->text = text;

    return create_translation_response_json_local_var;
}


void create_translation_response_json_free(create_translation_response_json_t *create_translation_response_json) {
    if(NULL == create_translation_response_json){
        return ;
    }
    listEntry_t *listEntry;
    if (create_translation_response_json->text) {
        free(create_translation_response_json->text);
        create_translation_response_json->text = NULL;
    }
    free(create_translation_response_json);
}

cJSON *create_translation_response_json_convertToJSON(create_translation_response_json_t *create_translation_response_json) {
    cJSON *item = cJSON_CreateObject();

    // create_translation_response_json->text
    if (!create_translation_response_json->text) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "text", create_translation_response_json->text) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

create_translation_response_json_t *create_translation_response_json_parseFromJSON(cJSON *create_translation_response_jsonJSON){

    create_translation_response_json_t *create_translation_response_json_local_var = NULL;

    // create_translation_response_json->text
    cJSON *text = cJSON_GetObjectItemCaseSensitive(create_translation_response_jsonJSON, "text");
    if (!text) {
        goto end;
    }

    
    if(!cJSON_IsString(text))
    {
    goto end; //String
    }


    create_translation_response_json_local_var = create_translation_response_json_create (
        strdup(text->valuestring)
        );

    return create_translation_response_json_local_var;
end:
    return NULL;

}
