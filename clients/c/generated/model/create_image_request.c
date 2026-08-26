#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_image_request.h"


char* create_image_request_quality_ToString(openai_api_create_image_request_QUALITY_e quality) {
    char* qualityArray[] =  { "NULL", "standard", "hd" };
    return qualityArray[quality];
}

openai_api_create_image_request_QUALITY_e create_image_request_quality_FromString(char* quality){
    int stringToReturn = 0;
    char *qualityArray[] =  { "NULL", "standard", "hd" };
    size_t sizeofArray = sizeof(qualityArray) / sizeof(qualityArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(quality, qualityArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* create_image_request_response_format_ToString(openai_api_create_image_request_RESPONSEFORMAT_e response_format) {
    char* response_formatArray[] =  { "NULL", "url", "b64_json" };
    return response_formatArray[response_format];
}

openai_api_create_image_request_RESPONSEFORMAT_e create_image_request_response_format_FromString(char* response_format){
    int stringToReturn = 0;
    char *response_formatArray[] =  { "NULL", "url", "b64_json" };
    size_t sizeofArray = sizeof(response_formatArray) / sizeof(response_formatArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(response_format, response_formatArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* create_image_request_size_ToString(openai_api_create_image_request_SIZE_e size) {
    char* sizeArray[] =  { "NULL", "256x256", "512x512", "1024x1024", "1792x1024", "1024x1792" };
    return sizeArray[size];
}

openai_api_create_image_request_SIZE_e create_image_request_size_FromString(char* size){
    int stringToReturn = 0;
    char *sizeArray[] =  { "NULL", "256x256", "512x512", "1024x1024", "1792x1024", "1024x1792" };
    size_t sizeofArray = sizeof(sizeArray) / sizeof(sizeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(size, sizeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* create_image_request_style_ToString(openai_api_create_image_request_STYLE_e style) {
    char* styleArray[] =  { "NULL", "vivid", "natural" };
    return styleArray[style];
}

openai_api_create_image_request_STYLE_e create_image_request_style_FromString(char* style){
    int stringToReturn = 0;
    char *styleArray[] =  { "NULL", "vivid", "natural" };
    size_t sizeofArray = sizeof(styleArray) / sizeof(styleArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(style, styleArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static create_image_request_t *create_image_request_create_internal(
    char *prompt,
    create_image_request_model_t *model,
    int *n,
    openai_api_create_image_request_QUALITY_e quality,
    openai_api_create_image_request_RESPONSEFORMAT_e response_format,
    openai_api_create_image_request_SIZE_e size,
    openai_api_create_image_request_STYLE_e style,
    char *user
    ) {
    create_image_request_t *create_image_request_local_var = malloc(sizeof(create_image_request_t));
    if (!create_image_request_local_var) {
        return NULL;
    }
    memset(create_image_request_local_var, 0, sizeof(create_image_request_t));
    create_image_request_local_var->_library_owned = 1;
    create_image_request_local_var->prompt = prompt;
    create_image_request_local_var->model = model;
    create_image_request_local_var->n = n;
    create_image_request_local_var->quality = quality;
    create_image_request_local_var->response_format = response_format;
    create_image_request_local_var->size = size;
    create_image_request_local_var->style = style;
    create_image_request_local_var->user = user;
    return create_image_request_local_var;
}

__attribute__((deprecated)) create_image_request_t *create_image_request_create(
    char *prompt,
    create_image_request_model_t *model,
    int *n,
    openai_api_create_image_request_QUALITY_e quality,
    openai_api_create_image_request_RESPONSEFORMAT_e response_format,
    openai_api_create_image_request_SIZE_e size,
    openai_api_create_image_request_STYLE_e style,
    char *user
    ) {
    int *n_copy = NULL;
    if (n) {
        n_copy = malloc(sizeof(int));
        if (n_copy) *n_copy = *n;
    }
    create_image_request_t *result = create_image_request_create_internal (
        prompt,
        model,
        n_copy,
        quality,
        response_format,
        size,
        style,
        user
        );
    if (!result) {
        free(n_copy);
    }
    return result;
}

void create_image_request_free(create_image_request_t *create_image_request) {
    if(NULL == create_image_request){
        return ;
    }
    if(create_image_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "create_image_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (create_image_request->prompt) {
        free(create_image_request->prompt);
        create_image_request->prompt = NULL;
    }
    if (create_image_request->model) {
        create_image_request_model_free(create_image_request->model);
        create_image_request->model = NULL;
    }
    if (create_image_request->n) {
        free(create_image_request->n);
        create_image_request->n = NULL;
    }
    if (create_image_request->user) {
        free(create_image_request->user);
        create_image_request->user = NULL;
    }
    free(create_image_request);
}

cJSON *create_image_request_convertToJSON(create_image_request_t *create_image_request) {
    cJSON *item = cJSON_CreateObject();

    // create_image_request->prompt
    if (!create_image_request->prompt) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "prompt", create_image_request->prompt) == NULL) {
    goto fail; //String
    }


    // create_image_request->model
    if(create_image_request->model) {
    cJSON *model_local_JSON = create_image_request_model_convertToJSON(create_image_request->model);
    if(model_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "model", model_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // create_image_request->n
    if(create_image_request->n) {
    if(cJSON_AddNumberToObject(item, "n", *create_image_request->n) == NULL) {
    goto fail; //Numeric
    }
    }


    // create_image_request->quality
    if(create_image_request->quality != openai_api_create_image_request_QUALITY_NULL) {
    if(cJSON_AddStringToObject(item, "quality", create_image_request_quality_ToString(create_image_request->quality)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // create_image_request->response_format
    if(create_image_request->response_format != openai_api_create_image_request_RESPONSEFORMAT_NULL) {
    if(cJSON_AddStringToObject(item, "response_format", create_image_request_response_format_ToString(create_image_request->response_format)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // create_image_request->size
    if(create_image_request->size != openai_api_create_image_request_SIZE_NULL) {
    if(cJSON_AddStringToObject(item, "size", create_image_request_size_ToString(create_image_request->size)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // create_image_request->style
    if(create_image_request->style != openai_api_create_image_request_STYLE_NULL) {
    if(cJSON_AddStringToObject(item, "style", create_image_request_style_ToString(create_image_request->style)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // create_image_request->user
    if(create_image_request->user) {
    if(cJSON_AddStringToObject(item, "user", create_image_request->user) == NULL) {
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

create_image_request_t *create_image_request_parseFromJSON(cJSON *create_image_requestJSON){

    create_image_request_t *create_image_request_local_var = NULL;

    char *prompt_local_str = NULL;

    // define the local variable for create_image_request->model
    create_image_request_model_t *model_local_nonprim = NULL;

    // define the local variable for create_image_request->n
    int *n_local_var = NULL;

    char *user_local_str = NULL;

    // create_image_request->prompt
    cJSON *prompt = cJSON_GetObjectItemCaseSensitive(create_image_requestJSON, "prompt");
    if (cJSON_IsNull(prompt)) {
        prompt = NULL;
    }
    if (!prompt) {
        goto end;
    }

    
    if(!cJSON_IsString(prompt))
    {
    goto end; //String
    }

    // create_image_request->model
    cJSON *model = cJSON_GetObjectItemCaseSensitive(create_image_requestJSON, "model");
    if (cJSON_IsNull(model)) {
        model = NULL;
    }
    if (model) { 
    model_local_nonprim = create_image_request_model_parseFromJSON(model); //nonprimitive
    }

    // create_image_request->n
    cJSON *n = cJSON_GetObjectItemCaseSensitive(create_image_requestJSON, "n");
    if (cJSON_IsNull(n)) {
        n = NULL;
    }
    if (n) { 
    if(!cJSON_IsNumber(n))
    {
    goto end; //Numeric
    }
    n_local_var = malloc(sizeof(int));
    if(!n_local_var)
    {
        goto end;
    }
    *n_local_var = n->valuedouble;
    }

    // create_image_request->quality
    cJSON *quality = cJSON_GetObjectItemCaseSensitive(create_image_requestJSON, "quality");
    if (cJSON_IsNull(quality)) {
        quality = NULL;
    }
    openai_api_create_image_request_QUALITY_e qualityVariable;
    if (quality) { 
    if(!cJSON_IsString(quality))
    {
    goto end; //Enum
    }
    qualityVariable = create_image_request_quality_FromString(quality->valuestring);
    }

    // create_image_request->response_format
    cJSON *response_format = cJSON_GetObjectItemCaseSensitive(create_image_requestJSON, "response_format");
    if (cJSON_IsNull(response_format)) {
        response_format = NULL;
    }
    openai_api_create_image_request_RESPONSEFORMAT_e response_formatVariable;
    if (response_format) { 
    if(!cJSON_IsString(response_format))
    {
    goto end; //Enum
    }
    response_formatVariable = create_image_request_response_format_FromString(response_format->valuestring);
    }

    // create_image_request->size
    cJSON *size = cJSON_GetObjectItemCaseSensitive(create_image_requestJSON, "size");
    if (cJSON_IsNull(size)) {
        size = NULL;
    }
    openai_api_create_image_request_SIZE_e sizeVariable;
    if (size) { 
    if(!cJSON_IsString(size))
    {
    goto end; //Enum
    }
    sizeVariable = create_image_request_size_FromString(size->valuestring);
    }

    // create_image_request->style
    cJSON *style = cJSON_GetObjectItemCaseSensitive(create_image_requestJSON, "style");
    if (cJSON_IsNull(style)) {
        style = NULL;
    }
    openai_api_create_image_request_STYLE_e styleVariable;
    if (style) { 
    if(!cJSON_IsString(style))
    {
    goto end; //Enum
    }
    styleVariable = create_image_request_style_FromString(style->valuestring);
    }

    // create_image_request->user
    cJSON *user = cJSON_GetObjectItemCaseSensitive(create_image_requestJSON, "user");
    if (cJSON_IsNull(user)) {
        user = NULL;
    }
    if (user) { 
    if(!cJSON_IsString(user) && !cJSON_IsNull(user))
    {
    goto end; //String
    }
    }


    if (prompt && !cJSON_IsNull(prompt)) prompt_local_str = strdup(prompt->valuestring);
    if (user && !cJSON_IsNull(user)) user_local_str = strdup(user->valuestring);

    create_image_request_local_var = create_image_request_create_internal (
        prompt_local_str,
        model ? model_local_nonprim : NULL,
        n_local_var,
        quality ? qualityVariable : openai_api_create_image_request_QUALITY_NULL,
        response_format ? response_formatVariable : openai_api_create_image_request_RESPONSEFORMAT_NULL,
        size ? sizeVariable : openai_api_create_image_request_SIZE_NULL,
        style ? styleVariable : openai_api_create_image_request_STYLE_NULL,
        user_local_str
        );

    if (!create_image_request_local_var) {
        goto end;
    }

    return create_image_request_local_var;
end:
    if (prompt_local_str) {
        free(prompt_local_str);
        prompt_local_str = NULL;
    }
    if (model_local_nonprim) {
        create_image_request_model_free(model_local_nonprim);
        model_local_nonprim = NULL;
    }
    if (n_local_var) {
        free(n_local_var);
        n_local_var = NULL;
    }
    if (user_local_str) {
        free(user_local_str);
        user_local_str = NULL;
    }
    return NULL;

}
