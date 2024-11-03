#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_embedding_request.h"


char* create_embedding_request_encoding_format_ToString(openai_api_create_embedding_request_ENCODINGFORMAT_e encoding_format) {
    char* encoding_formatArray[] =  { "NULL", "float", "base64" };
    return encoding_formatArray[encoding_format];
}

openai_api_create_embedding_request_ENCODINGFORMAT_e create_embedding_request_encoding_format_FromString(char* encoding_format){
    int stringToReturn = 0;
    char *encoding_formatArray[] =  { "NULL", "float", "base64" };
    size_t sizeofArray = sizeof(encoding_formatArray) / sizeof(encoding_formatArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(encoding_format, encoding_formatArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

create_embedding_request_t *create_embedding_request_create(
    create_embedding_request_input_t *input,
    create_embedding_request_model_t *model,
    openai_api_create_embedding_request_ENCODINGFORMAT_e encoding_format,
    int dimensions,
    char *user
    ) {
    create_embedding_request_t *create_embedding_request_local_var = malloc(sizeof(create_embedding_request_t));
    if (!create_embedding_request_local_var) {
        return NULL;
    }
    create_embedding_request_local_var->input = input;
    create_embedding_request_local_var->model = model;
    create_embedding_request_local_var->encoding_format = encoding_format;
    create_embedding_request_local_var->dimensions = dimensions;
    create_embedding_request_local_var->user = user;

    return create_embedding_request_local_var;
}


void create_embedding_request_free(create_embedding_request_t *create_embedding_request) {
    if(NULL == create_embedding_request){
        return ;
    }
    listEntry_t *listEntry;
    if (create_embedding_request->input) {
        create_embedding_request_input_free(create_embedding_request->input);
        create_embedding_request->input = NULL;
    }
    if (create_embedding_request->model) {
        create_embedding_request_model_free(create_embedding_request->model);
        create_embedding_request->model = NULL;
    }
    if (create_embedding_request->user) {
        free(create_embedding_request->user);
        create_embedding_request->user = NULL;
    }
    free(create_embedding_request);
}

cJSON *create_embedding_request_convertToJSON(create_embedding_request_t *create_embedding_request) {
    cJSON *item = cJSON_CreateObject();

    // create_embedding_request->input
    if (!create_embedding_request->input) {
        goto fail;
    }
    cJSON *input_local_JSON = create_embedding_request_input_convertToJSON(create_embedding_request->input);
    if(input_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "input", input_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // create_embedding_request->model
    if (!create_embedding_request->model) {
        goto fail;
    }
    cJSON *model_local_JSON = create_embedding_request_model_convertToJSON(create_embedding_request->model);
    if(model_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "model", model_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // create_embedding_request->encoding_format
    if(create_embedding_request->encoding_format != openai_api_create_embedding_request_ENCODINGFORMAT_NULL) {
    if(cJSON_AddStringToObject(item, "encoding_format", encoding_formatcreate_embedding_request_ToString(create_embedding_request->encoding_format)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // create_embedding_request->dimensions
    if(create_embedding_request->dimensions) {
    if(cJSON_AddNumberToObject(item, "dimensions", create_embedding_request->dimensions) == NULL) {
    goto fail; //Numeric
    }
    }


    // create_embedding_request->user
    if(create_embedding_request->user) {
    if(cJSON_AddStringToObject(item, "user", create_embedding_request->user) == NULL) {
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

create_embedding_request_t *create_embedding_request_parseFromJSON(cJSON *create_embedding_requestJSON){

    create_embedding_request_t *create_embedding_request_local_var = NULL;

    // define the local variable for create_embedding_request->input
    create_embedding_request_input_t *input_local_nonprim = NULL;

    // define the local variable for create_embedding_request->model
    create_embedding_request_model_t *model_local_nonprim = NULL;

    // create_embedding_request->input
    cJSON *input = cJSON_GetObjectItemCaseSensitive(create_embedding_requestJSON, "input");
    if (!input) {
        goto end;
    }

    
    input_local_nonprim = create_embedding_request_input_parseFromJSON(input); //nonprimitive

    // create_embedding_request->model
    cJSON *model = cJSON_GetObjectItemCaseSensitive(create_embedding_requestJSON, "model");
    if (!model) {
        goto end;
    }

    
    model_local_nonprim = create_embedding_request_model_parseFromJSON(model); //nonprimitive

    // create_embedding_request->encoding_format
    cJSON *encoding_format = cJSON_GetObjectItemCaseSensitive(create_embedding_requestJSON, "encoding_format");
    openai_api_create_embedding_request_ENCODINGFORMAT_e encoding_formatVariable;
    if (encoding_format) { 
    if(!cJSON_IsString(encoding_format))
    {
    goto end; //Enum
    }
    encoding_formatVariable = create_embedding_request_encoding_format_FromString(encoding_format->valuestring);
    }

    // create_embedding_request->dimensions
    cJSON *dimensions = cJSON_GetObjectItemCaseSensitive(create_embedding_requestJSON, "dimensions");
    if (dimensions) { 
    if(!cJSON_IsNumber(dimensions))
    {
    goto end; //Numeric
    }
    }

    // create_embedding_request->user
    cJSON *user = cJSON_GetObjectItemCaseSensitive(create_embedding_requestJSON, "user");
    if (user) { 
    if(!cJSON_IsString(user) && !cJSON_IsNull(user))
    {
    goto end; //String
    }
    }


    create_embedding_request_local_var = create_embedding_request_create (
        input_local_nonprim,
        model_local_nonprim,
        encoding_format ? encoding_formatVariable : openai_api_create_embedding_request_ENCODINGFORMAT_NULL,
        dimensions ? dimensions->valuedouble : 0,
        user && !cJSON_IsNull(user) ? strdup(user->valuestring) : NULL
        );

    return create_embedding_request_local_var;
end:
    if (input_local_nonprim) {
        create_embedding_request_input_free(input_local_nonprim);
        input_local_nonprim = NULL;
    }
    if (model_local_nonprim) {
        create_embedding_request_model_free(model_local_nonprim);
        model_local_nonprim = NULL;
    }
    return NULL;

}
