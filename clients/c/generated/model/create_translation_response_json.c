#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_translation_response_json.h"



static create_translation_response_json_t *create_translation_response_json_create_internal(
    char *text
    ) {
    create_translation_response_json_t *create_translation_response_json_local_var = malloc(sizeof(create_translation_response_json_t));
    if (!create_translation_response_json_local_var) {
        return NULL;
    }
    create_translation_response_json_local_var->text = text;

    create_translation_response_json_local_var->_library_owned = 1;
    return create_translation_response_json_local_var;
}

__attribute__((deprecated)) create_translation_response_json_t *create_translation_response_json_create(
    char *text
    ) {
    return create_translation_response_json_create_internal (
        text
        );
}

void create_translation_response_json_free(create_translation_response_json_t *create_translation_response_json) {
    if(NULL == create_translation_response_json){
        return ;
    }
    if(create_translation_response_json->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "create_translation_response_json_free");
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


    create_translation_response_json_local_var = create_translation_response_json_create_internal (
        strdup(text->valuestring)
        );

    return create_translation_response_json_local_var;
end:
    return NULL;

}
