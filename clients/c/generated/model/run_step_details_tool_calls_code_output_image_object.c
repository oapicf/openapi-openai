#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "run_step_details_tool_calls_code_output_image_object.h"


char* run_step_details_tool_calls_code_output_image_object_type_ToString(openai_api_run_step_details_tool_calls_code_output_image_object_TYPE_e type) {
    char* typeArray[] =  { "NULL", "image" };
    return typeArray[type];
}

openai_api_run_step_details_tool_calls_code_output_image_object_TYPE_e run_step_details_tool_calls_code_output_image_object_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "image" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

run_step_details_tool_calls_code_output_image_object_t *run_step_details_tool_calls_code_output_image_object_create(
    openai_api_run_step_details_tool_calls_code_output_image_object_TYPE_e type,
    run_step_details_tool_calls_code_output_image_object_image_t *image
    ) {
    run_step_details_tool_calls_code_output_image_object_t *run_step_details_tool_calls_code_output_image_object_local_var = malloc(sizeof(run_step_details_tool_calls_code_output_image_object_t));
    if (!run_step_details_tool_calls_code_output_image_object_local_var) {
        return NULL;
    }
    run_step_details_tool_calls_code_output_image_object_local_var->type = type;
    run_step_details_tool_calls_code_output_image_object_local_var->image = image;

    return run_step_details_tool_calls_code_output_image_object_local_var;
}


void run_step_details_tool_calls_code_output_image_object_free(run_step_details_tool_calls_code_output_image_object_t *run_step_details_tool_calls_code_output_image_object) {
    if(NULL == run_step_details_tool_calls_code_output_image_object){
        return ;
    }
    listEntry_t *listEntry;
    if (run_step_details_tool_calls_code_output_image_object->image) {
        run_step_details_tool_calls_code_output_image_object_image_free(run_step_details_tool_calls_code_output_image_object->image);
        run_step_details_tool_calls_code_output_image_object->image = NULL;
    }
    free(run_step_details_tool_calls_code_output_image_object);
}

cJSON *run_step_details_tool_calls_code_output_image_object_convertToJSON(run_step_details_tool_calls_code_output_image_object_t *run_step_details_tool_calls_code_output_image_object) {
    cJSON *item = cJSON_CreateObject();

    // run_step_details_tool_calls_code_output_image_object->type
    if (openai_api_run_step_details_tool_calls_code_output_image_object_TYPE_NULL == run_step_details_tool_calls_code_output_image_object->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", typerun_step_details_tool_calls_code_output_image_object_ToString(run_step_details_tool_calls_code_output_image_object->type)) == NULL)
    {
    goto fail; //Enum
    }


    // run_step_details_tool_calls_code_output_image_object->image
    if (!run_step_details_tool_calls_code_output_image_object->image) {
        goto fail;
    }
    cJSON *image_local_JSON = run_step_details_tool_calls_code_output_image_object_image_convertToJSON(run_step_details_tool_calls_code_output_image_object->image);
    if(image_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "image", image_local_JSON);
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

run_step_details_tool_calls_code_output_image_object_t *run_step_details_tool_calls_code_output_image_object_parseFromJSON(cJSON *run_step_details_tool_calls_code_output_image_objectJSON){

    run_step_details_tool_calls_code_output_image_object_t *run_step_details_tool_calls_code_output_image_object_local_var = NULL;

    // define the local variable for run_step_details_tool_calls_code_output_image_object->image
    run_step_details_tool_calls_code_output_image_object_image_t *image_local_nonprim = NULL;

    // run_step_details_tool_calls_code_output_image_object->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(run_step_details_tool_calls_code_output_image_objectJSON, "type");
    if (!type) {
        goto end;
    }

    openai_api_run_step_details_tool_calls_code_output_image_object_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = run_step_details_tool_calls_code_output_image_object_type_FromString(type->valuestring);

    // run_step_details_tool_calls_code_output_image_object->image
    cJSON *image = cJSON_GetObjectItemCaseSensitive(run_step_details_tool_calls_code_output_image_objectJSON, "image");
    if (!image) {
        goto end;
    }

    
    image_local_nonprim = run_step_details_tool_calls_code_output_image_object_image_parseFromJSON(image); //nonprimitive


    run_step_details_tool_calls_code_output_image_object_local_var = run_step_details_tool_calls_code_output_image_object_create (
        typeVariable,
        image_local_nonprim
        );

    return run_step_details_tool_calls_code_output_image_object_local_var;
end:
    if (image_local_nonprim) {
        run_step_details_tool_calls_code_output_image_object_image_free(image_local_nonprim);
        image_local_nonprim = NULL;
    }
    return NULL;

}
