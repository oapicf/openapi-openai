#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_fine_tuning_job_request_integrations_inner_wandb.h"



static create_fine_tuning_job_request_integrations_inner_wandb_t *create_fine_tuning_job_request_integrations_inner_wandb_create_internal(
    char *project,
    char *name,
    char *entity,
    list_t *tags
    ) {
    create_fine_tuning_job_request_integrations_inner_wandb_t *create_fine_tuning_job_request_integrations_inner_wandb_local_var = malloc(sizeof(create_fine_tuning_job_request_integrations_inner_wandb_t));
    if (!create_fine_tuning_job_request_integrations_inner_wandb_local_var) {
        return NULL;
    }
    create_fine_tuning_job_request_integrations_inner_wandb_local_var->project = project;
    create_fine_tuning_job_request_integrations_inner_wandb_local_var->name = name;
    create_fine_tuning_job_request_integrations_inner_wandb_local_var->entity = entity;
    create_fine_tuning_job_request_integrations_inner_wandb_local_var->tags = tags;

    create_fine_tuning_job_request_integrations_inner_wandb_local_var->_library_owned = 1;
    return create_fine_tuning_job_request_integrations_inner_wandb_local_var;
}

__attribute__((deprecated)) create_fine_tuning_job_request_integrations_inner_wandb_t *create_fine_tuning_job_request_integrations_inner_wandb_create(
    char *project,
    char *name,
    char *entity,
    list_t *tags
    ) {
    return create_fine_tuning_job_request_integrations_inner_wandb_create_internal (
        project,
        name,
        entity,
        tags
        );
}

void create_fine_tuning_job_request_integrations_inner_wandb_free(create_fine_tuning_job_request_integrations_inner_wandb_t *create_fine_tuning_job_request_integrations_inner_wandb) {
    if(NULL == create_fine_tuning_job_request_integrations_inner_wandb){
        return ;
    }
    if(create_fine_tuning_job_request_integrations_inner_wandb->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "create_fine_tuning_job_request_integrations_inner_wandb_free");
        return ;
    }
    listEntry_t *listEntry;
    if (create_fine_tuning_job_request_integrations_inner_wandb->project) {
        free(create_fine_tuning_job_request_integrations_inner_wandb->project);
        create_fine_tuning_job_request_integrations_inner_wandb->project = NULL;
    }
    if (create_fine_tuning_job_request_integrations_inner_wandb->name) {
        free(create_fine_tuning_job_request_integrations_inner_wandb->name);
        create_fine_tuning_job_request_integrations_inner_wandb->name = NULL;
    }
    if (create_fine_tuning_job_request_integrations_inner_wandb->entity) {
        free(create_fine_tuning_job_request_integrations_inner_wandb->entity);
        create_fine_tuning_job_request_integrations_inner_wandb->entity = NULL;
    }
    if (create_fine_tuning_job_request_integrations_inner_wandb->tags) {
        list_ForEach(listEntry, create_fine_tuning_job_request_integrations_inner_wandb->tags) {
            free(listEntry->data);
        }
        list_freeList(create_fine_tuning_job_request_integrations_inner_wandb->tags);
        create_fine_tuning_job_request_integrations_inner_wandb->tags = NULL;
    }
    free(create_fine_tuning_job_request_integrations_inner_wandb);
}

cJSON *create_fine_tuning_job_request_integrations_inner_wandb_convertToJSON(create_fine_tuning_job_request_integrations_inner_wandb_t *create_fine_tuning_job_request_integrations_inner_wandb) {
    cJSON *item = cJSON_CreateObject();

    // create_fine_tuning_job_request_integrations_inner_wandb->project
    if (!create_fine_tuning_job_request_integrations_inner_wandb->project) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "project", create_fine_tuning_job_request_integrations_inner_wandb->project) == NULL) {
    goto fail; //String
    }


    // create_fine_tuning_job_request_integrations_inner_wandb->name
    if(create_fine_tuning_job_request_integrations_inner_wandb->name) {
    if(cJSON_AddStringToObject(item, "name", create_fine_tuning_job_request_integrations_inner_wandb->name) == NULL) {
    goto fail; //String
    }
    }


    // create_fine_tuning_job_request_integrations_inner_wandb->entity
    if(create_fine_tuning_job_request_integrations_inner_wandb->entity) {
    if(cJSON_AddStringToObject(item, "entity", create_fine_tuning_job_request_integrations_inner_wandb->entity) == NULL) {
    goto fail; //String
    }
    }


    // create_fine_tuning_job_request_integrations_inner_wandb->tags
    if(create_fine_tuning_job_request_integrations_inner_wandb->tags) {
    cJSON *tags = cJSON_AddArrayToObject(item, "tags");
    if(tags == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *tagsListEntry;
    list_ForEach(tagsListEntry, create_fine_tuning_job_request_integrations_inner_wandb->tags) {
    if(cJSON_AddStringToObject(tags, "", tagsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

create_fine_tuning_job_request_integrations_inner_wandb_t *create_fine_tuning_job_request_integrations_inner_wandb_parseFromJSON(cJSON *create_fine_tuning_job_request_integrations_inner_wandbJSON){

    create_fine_tuning_job_request_integrations_inner_wandb_t *create_fine_tuning_job_request_integrations_inner_wandb_local_var = NULL;

    // define the local list for create_fine_tuning_job_request_integrations_inner_wandb->tags
    list_t *tagsList = NULL;

    // create_fine_tuning_job_request_integrations_inner_wandb->project
    cJSON *project = cJSON_GetObjectItemCaseSensitive(create_fine_tuning_job_request_integrations_inner_wandbJSON, "project");
    if (cJSON_IsNull(project)) {
        project = NULL;
    }
    if (!project) {
        goto end;
    }

    
    if(!cJSON_IsString(project))
    {
    goto end; //String
    }

    // create_fine_tuning_job_request_integrations_inner_wandb->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(create_fine_tuning_job_request_integrations_inner_wandbJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // create_fine_tuning_job_request_integrations_inner_wandb->entity
    cJSON *entity = cJSON_GetObjectItemCaseSensitive(create_fine_tuning_job_request_integrations_inner_wandbJSON, "entity");
    if (cJSON_IsNull(entity)) {
        entity = NULL;
    }
    if (entity) { 
    if(!cJSON_IsString(entity) && !cJSON_IsNull(entity))
    {
    goto end; //String
    }
    }

    // create_fine_tuning_job_request_integrations_inner_wandb->tags
    cJSON *tags = cJSON_GetObjectItemCaseSensitive(create_fine_tuning_job_request_integrations_inner_wandbJSON, "tags");
    if (cJSON_IsNull(tags)) {
        tags = NULL;
    }
    if (tags) { 
    cJSON *tags_local = NULL;
    if(!cJSON_IsArray(tags)) {
        goto end;//primitive container
    }
    tagsList = list_createList();

    cJSON_ArrayForEach(tags_local, tags)
    {
        if(!cJSON_IsString(tags_local))
        {
            goto end;
        }
        list_addElement(tagsList , strdup(tags_local->valuestring));
    }
    }


    create_fine_tuning_job_request_integrations_inner_wandb_local_var = create_fine_tuning_job_request_integrations_inner_wandb_create_internal (
        strdup(project->valuestring),
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        entity && !cJSON_IsNull(entity) ? strdup(entity->valuestring) : NULL,
        tags ? tagsList : NULL
        );

    return create_fine_tuning_job_request_integrations_inner_wandb_local_var;
end:
    if (tagsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, tagsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(tagsList);
        tagsList = NULL;
    }
    return NULL;

}
