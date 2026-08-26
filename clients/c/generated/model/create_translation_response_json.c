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
    memset(create_translation_response_json_local_var, 0, sizeof(create_translation_response_json_t));
    create_translation_response_json_local_var->_library_owned = 1;
    create_translation_response_json_local_var->text = text;
    return create_translation_response_json_local_var;
}

__attribute__((deprecated)) create_translation_response_json_t *create_translation_response_json_create(
    char *text
    ) {
    create_translation_response_json_t *result = create_translation_response_json_create_internal (
        text
        );
    if (!result) {
    }
    return result;
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

    char *text_local_str = NULL;

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


    if (text && !cJSON_IsNull(text)) text_local_str = strdup(text->valuestring);

    create_translation_response_json_local_var = create_translation_response_json_create_internal (
        text_local_str
        );

    if (!create_translation_response_json_local_var) {
        goto end;
    }

    return create_translation_response_json_local_var;
end:
    if (text_local_str) {
        free(text_local_str);
        text_local_str = NULL;
    }
    return NULL;

}
