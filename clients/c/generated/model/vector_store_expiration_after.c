#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "vector_store_expiration_after.h"


char* vector_store_expiration_after_anchor_ToString(openai_api_vector_store_expiration_after_ANCHOR_e anchor) {
    char* anchorArray[] =  { "NULL", "last_active_at" };
    return anchorArray[anchor];
}

openai_api_vector_store_expiration_after_ANCHOR_e vector_store_expiration_after_anchor_FromString(char* anchor){
    int stringToReturn = 0;
    char *anchorArray[] =  { "NULL", "last_active_at" };
    size_t sizeofArray = sizeof(anchorArray) / sizeof(anchorArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(anchor, anchorArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static vector_store_expiration_after_t *vector_store_expiration_after_create_internal(
    openai_api_vector_store_expiration_after_ANCHOR_e anchor,
    int days
    ) {
    vector_store_expiration_after_t *vector_store_expiration_after_local_var = malloc(sizeof(vector_store_expiration_after_t));
    if (!vector_store_expiration_after_local_var) {
        return NULL;
    }
    vector_store_expiration_after_local_var->anchor = anchor;
    vector_store_expiration_after_local_var->days = days;

    vector_store_expiration_after_local_var->_library_owned = 1;
    return vector_store_expiration_after_local_var;
}

__attribute__((deprecated)) vector_store_expiration_after_t *vector_store_expiration_after_create(
    openai_api_vector_store_expiration_after_ANCHOR_e anchor,
    int days
    ) {
    return vector_store_expiration_after_create_internal (
        anchor,
        days
        );
}

void vector_store_expiration_after_free(vector_store_expiration_after_t *vector_store_expiration_after) {
    if(NULL == vector_store_expiration_after){
        return ;
    }
    if(vector_store_expiration_after->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "vector_store_expiration_after_free");
        return ;
    }
    listEntry_t *listEntry;
    free(vector_store_expiration_after);
}

cJSON *vector_store_expiration_after_convertToJSON(vector_store_expiration_after_t *vector_store_expiration_after) {
    cJSON *item = cJSON_CreateObject();

    // vector_store_expiration_after->anchor
    if (openai_api_vector_store_expiration_after_ANCHOR_NULL == vector_store_expiration_after->anchor) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "anchor", vector_store_expiration_after_anchor_ToString(vector_store_expiration_after->anchor)) == NULL)
    {
    goto fail; //Enum
    }


    // vector_store_expiration_after->days
    if (!vector_store_expiration_after->days) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "days", vector_store_expiration_after->days) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

vector_store_expiration_after_t *vector_store_expiration_after_parseFromJSON(cJSON *vector_store_expiration_afterJSON){

    vector_store_expiration_after_t *vector_store_expiration_after_local_var = NULL;

    // vector_store_expiration_after->anchor
    cJSON *anchor = cJSON_GetObjectItemCaseSensitive(vector_store_expiration_afterJSON, "anchor");
    if (cJSON_IsNull(anchor)) {
        anchor = NULL;
    }
    if (!anchor) {
        goto end;
    }

    openai_api_vector_store_expiration_after_ANCHOR_e anchorVariable;
    
    if(!cJSON_IsString(anchor))
    {
    goto end; //Enum
    }
    anchorVariable = vector_store_expiration_after_anchor_FromString(anchor->valuestring);

    // vector_store_expiration_after->days
    cJSON *days = cJSON_GetObjectItemCaseSensitive(vector_store_expiration_afterJSON, "days");
    if (cJSON_IsNull(days)) {
        days = NULL;
    }
    if (!days) {
        goto end;
    }

    
    if(!cJSON_IsNumber(days))
    {
    goto end; //Numeric
    }


    vector_store_expiration_after_local_var = vector_store_expiration_after_create_internal (
        anchorVariable,
        days->valuedouble
        );

    return vector_store_expiration_after_local_var;
end:
    return NULL;

}
