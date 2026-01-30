#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "prediction_content_content.h"



static prediction_content_content_t *prediction_content_content_create_internal(
    ) {
    prediction_content_content_t *prediction_content_content_local_var = malloc(sizeof(prediction_content_content_t));
    if (!prediction_content_content_local_var) {
        return NULL;
    }

    prediction_content_content_local_var->_library_owned = 1;
    return prediction_content_content_local_var;
}

__attribute__((deprecated)) prediction_content_content_t *prediction_content_content_create(
    ) {
    return prediction_content_content_create_internal (
        );
}

void prediction_content_content_free(prediction_content_content_t *prediction_content_content) {
    if(NULL == prediction_content_content){
        return ;
    }
    if(prediction_content_content->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "prediction_content_content_free");
        return ;
    }
    listEntry_t *listEntry;
    free(prediction_content_content);
}

cJSON *prediction_content_content_convertToJSON(prediction_content_content_t *prediction_content_content) {
    cJSON *item = cJSON_CreateObject();
    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

prediction_content_content_t *prediction_content_content_parseFromJSON(cJSON *prediction_content_contentJSON){

    prediction_content_content_t *prediction_content_content_local_var = NULL;


    prediction_content_content_local_var = prediction_content_content_create_internal (
        );

    return prediction_content_content_local_var;
end:
    return NULL;

}
