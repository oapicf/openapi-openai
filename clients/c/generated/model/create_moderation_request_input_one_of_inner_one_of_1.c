#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_moderation_request_input_one_of_inner_one_of_1.h"


char* create_moderation_request_input_one_of_inner_one_of_1_type_ToString(openai_api_create_moderation_request_input_one_of_inner_one_of_1_TYPE_e type) {
    char* typeArray[] =  { "NULL", "text" };
    return typeArray[type];
}

openai_api_create_moderation_request_input_one_of_inner_one_of_1_TYPE_e create_moderation_request_input_one_of_inner_one_of_1_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "text" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static create_moderation_request_input_one_of_inner_one_of_1_t *create_moderation_request_input_one_of_inner_one_of_1_create_internal(
    openai_api_create_moderation_request_input_one_of_inner_one_of_1_TYPE_e type,
    char *text
    ) {
    create_moderation_request_input_one_of_inner_one_of_1_t *create_moderation_request_input_one_of_inner_one_of_1_local_var = malloc(sizeof(create_moderation_request_input_one_of_inner_one_of_1_t));
    if (!create_moderation_request_input_one_of_inner_one_of_1_local_var) {
        return NULL;
    }
    create_moderation_request_input_one_of_inner_one_of_1_local_var->type = type;
    create_moderation_request_input_one_of_inner_one_of_1_local_var->text = text;

    create_moderation_request_input_one_of_inner_one_of_1_local_var->_library_owned = 1;
    return create_moderation_request_input_one_of_inner_one_of_1_local_var;
}

__attribute__((deprecated)) create_moderation_request_input_one_of_inner_one_of_1_t *create_moderation_request_input_one_of_inner_one_of_1_create(
    openai_api_create_moderation_request_input_one_of_inner_one_of_1_TYPE_e type,
    char *text
    ) {
    return create_moderation_request_input_one_of_inner_one_of_1_create_internal (
        type,
        text
        );
}

void create_moderation_request_input_one_of_inner_one_of_1_free(create_moderation_request_input_one_of_inner_one_of_1_t *create_moderation_request_input_one_of_inner_one_of_1) {
    if(NULL == create_moderation_request_input_one_of_inner_one_of_1){
        return ;
    }
    if(create_moderation_request_input_one_of_inner_one_of_1->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "create_moderation_request_input_one_of_inner_one_of_1_free");
        return ;
    }
    listEntry_t *listEntry;
    if (create_moderation_request_input_one_of_inner_one_of_1->text) {
        free(create_moderation_request_input_one_of_inner_one_of_1->text);
        create_moderation_request_input_one_of_inner_one_of_1->text = NULL;
    }
    free(create_moderation_request_input_one_of_inner_one_of_1);
}

cJSON *create_moderation_request_input_one_of_inner_one_of_1_convertToJSON(create_moderation_request_input_one_of_inner_one_of_1_t *create_moderation_request_input_one_of_inner_one_of_1) {
    cJSON *item = cJSON_CreateObject();

    // create_moderation_request_input_one_of_inner_one_of_1->type
    if (openai_api_create_moderation_request_input_one_of_inner_one_of_1_TYPE_NULL == create_moderation_request_input_one_of_inner_one_of_1->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", create_moderation_request_input_one_of_inner_one_of_1_type_ToString(create_moderation_request_input_one_of_inner_one_of_1->type)) == NULL)
    {
    goto fail; //Enum
    }


    // create_moderation_request_input_one_of_inner_one_of_1->text
    if (!create_moderation_request_input_one_of_inner_one_of_1->text) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "text", create_moderation_request_input_one_of_inner_one_of_1->text) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

create_moderation_request_input_one_of_inner_one_of_1_t *create_moderation_request_input_one_of_inner_one_of_1_parseFromJSON(cJSON *create_moderation_request_input_one_of_inner_one_of_1JSON){

    create_moderation_request_input_one_of_inner_one_of_1_t *create_moderation_request_input_one_of_inner_one_of_1_local_var = NULL;

    // create_moderation_request_input_one_of_inner_one_of_1->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(create_moderation_request_input_one_of_inner_one_of_1JSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_create_moderation_request_input_one_of_inner_one_of_1_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = create_moderation_request_input_one_of_inner_one_of_1_type_FromString(type->valuestring);

    // create_moderation_request_input_one_of_inner_one_of_1->text
    cJSON *text = cJSON_GetObjectItemCaseSensitive(create_moderation_request_input_one_of_inner_one_of_1JSON, "text");
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


    create_moderation_request_input_one_of_inner_one_of_1_local_var = create_moderation_request_input_one_of_inner_one_of_1_create_internal (
        typeVariable,
        strdup(text->valuestring)
        );

    return create_moderation_request_input_one_of_inner_one_of_1_local_var;
end:
    return NULL;

}
