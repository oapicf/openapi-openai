#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "prediction_content.h"


char* prediction_content_type_ToString(openai_api_prediction_content_TYPE_e type) {
    char* typeArray[] =  { "NULL", "content" };
    return typeArray[type];
}

openai_api_prediction_content_TYPE_e prediction_content_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "content" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static prediction_content_t *prediction_content_create_internal(
    openai_api_prediction_content_TYPE_e type,
    prediction_content_content_t *content
    ) {
    prediction_content_t *prediction_content_local_var = malloc(sizeof(prediction_content_t));
    if (!prediction_content_local_var) {
        return NULL;
    }
    prediction_content_local_var->type = type;
    prediction_content_local_var->content = content;

    prediction_content_local_var->_library_owned = 1;
    return prediction_content_local_var;
}

__attribute__((deprecated)) prediction_content_t *prediction_content_create(
    openai_api_prediction_content_TYPE_e type,
    prediction_content_content_t *content
    ) {
    return prediction_content_create_internal (
        type,
        content
        );
}

void prediction_content_free(prediction_content_t *prediction_content) {
    if(NULL == prediction_content){
        return ;
    }
    if(prediction_content->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "prediction_content_free");
        return ;
    }
    listEntry_t *listEntry;
    if (prediction_content->content) {
        prediction_content_content_free(prediction_content->content);
        prediction_content->content = NULL;
    }
    free(prediction_content);
}

cJSON *prediction_content_convertToJSON(prediction_content_t *prediction_content) {
    cJSON *item = cJSON_CreateObject();

    // prediction_content->type
    if (openai_api_prediction_content_TYPE_NULL == prediction_content->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", prediction_content_type_ToString(prediction_content->type)) == NULL)
    {
    goto fail; //Enum
    }


    // prediction_content->content
    if (!prediction_content->content) {
        goto fail;
    }
    cJSON *content_local_JSON = prediction_content_content_convertToJSON(prediction_content->content);
    if(content_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "content", content_local_JSON);
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

prediction_content_t *prediction_content_parseFromJSON(cJSON *prediction_contentJSON){

    prediction_content_t *prediction_content_local_var = NULL;

    // define the local variable for prediction_content->content
    prediction_content_content_t *content_local_nonprim = NULL;

    // prediction_content->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(prediction_contentJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_prediction_content_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = prediction_content_type_FromString(type->valuestring);

    // prediction_content->content
    cJSON *content = cJSON_GetObjectItemCaseSensitive(prediction_contentJSON, "content");
    if (cJSON_IsNull(content)) {
        content = NULL;
    }
    if (!content) {
        goto end;
    }

    
    content_local_nonprim = prediction_content_content_parseFromJSON(content); //nonprimitive


    prediction_content_local_var = prediction_content_create_internal (
        typeVariable,
        content_local_nonprim
        );

    return prediction_content_local_var;
end:
    if (content_local_nonprim) {
        prediction_content_content_free(content_local_nonprim);
        content_local_nonprim = NULL;
    }
    return NULL;

}
