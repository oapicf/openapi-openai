#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audit_log.h"



static audit_log_t *audit_log_create_internal(
    char *id,
    openai_api_audit_log_event_type__e type,
    int effective_at,
    audit_log_project_t *project,
    audit_log_actor_t *actor,
    audit_log_api_key_created_t *api_key_created,
    audit_log_api_key_updated_t *api_key_updated,
    audit_log_api_key_deleted_t *api_key_deleted,
    audit_log_invite_sent_t *invite_sent,
    audit_log_invite_accepted_t *invite_accepted,
    audit_log_invite_accepted_t *invite_deleted,
    audit_log_login_failed_t *login_failed,
    audit_log_login_failed_t *logout_failed,
    audit_log_organization_updated_t *organization_updated,
    audit_log_project_created_t *project_created,
    audit_log_project_updated_t *project_updated,
    audit_log_project_archived_t *project_archived,
    audit_log_rate_limit_updated_t *rate_limit_updated,
    audit_log_rate_limit_deleted_t *rate_limit_deleted,
    audit_log_service_account_created_t *service_account_created,
    audit_log_service_account_updated_t *service_account_updated,
    audit_log_service_account_deleted_t *service_account_deleted,
    audit_log_user_added_t *user_added,
    audit_log_user_updated_t *user_updated,
    audit_log_user_deleted_t *user_deleted
    ) {
    audit_log_t *audit_log_local_var = malloc(sizeof(audit_log_t));
    if (!audit_log_local_var) {
        return NULL;
    }
    audit_log_local_var->id = id;
    audit_log_local_var->type = type;
    audit_log_local_var->effective_at = effective_at;
    audit_log_local_var->project = project;
    audit_log_local_var->actor = actor;
    audit_log_local_var->api_key_created = api_key_created;
    audit_log_local_var->api_key_updated = api_key_updated;
    audit_log_local_var->api_key_deleted = api_key_deleted;
    audit_log_local_var->invite_sent = invite_sent;
    audit_log_local_var->invite_accepted = invite_accepted;
    audit_log_local_var->invite_deleted = invite_deleted;
    audit_log_local_var->login_failed = login_failed;
    audit_log_local_var->logout_failed = logout_failed;
    audit_log_local_var->organization_updated = organization_updated;
    audit_log_local_var->project_created = project_created;
    audit_log_local_var->project_updated = project_updated;
    audit_log_local_var->project_archived = project_archived;
    audit_log_local_var->rate_limit_updated = rate_limit_updated;
    audit_log_local_var->rate_limit_deleted = rate_limit_deleted;
    audit_log_local_var->service_account_created = service_account_created;
    audit_log_local_var->service_account_updated = service_account_updated;
    audit_log_local_var->service_account_deleted = service_account_deleted;
    audit_log_local_var->user_added = user_added;
    audit_log_local_var->user_updated = user_updated;
    audit_log_local_var->user_deleted = user_deleted;

    audit_log_local_var->_library_owned = 1;
    return audit_log_local_var;
}

__attribute__((deprecated)) audit_log_t *audit_log_create(
    char *id,
    openai_api_audit_log_event_type__e type,
    int effective_at,
    audit_log_project_t *project,
    audit_log_actor_t *actor,
    audit_log_api_key_created_t *api_key_created,
    audit_log_api_key_updated_t *api_key_updated,
    audit_log_api_key_deleted_t *api_key_deleted,
    audit_log_invite_sent_t *invite_sent,
    audit_log_invite_accepted_t *invite_accepted,
    audit_log_invite_accepted_t *invite_deleted,
    audit_log_login_failed_t *login_failed,
    audit_log_login_failed_t *logout_failed,
    audit_log_organization_updated_t *organization_updated,
    audit_log_project_created_t *project_created,
    audit_log_project_updated_t *project_updated,
    audit_log_project_archived_t *project_archived,
    audit_log_rate_limit_updated_t *rate_limit_updated,
    audit_log_rate_limit_deleted_t *rate_limit_deleted,
    audit_log_service_account_created_t *service_account_created,
    audit_log_service_account_updated_t *service_account_updated,
    audit_log_service_account_deleted_t *service_account_deleted,
    audit_log_user_added_t *user_added,
    audit_log_user_updated_t *user_updated,
    audit_log_user_deleted_t *user_deleted
    ) {
    return audit_log_create_internal (
        id,
        type,
        effective_at,
        project,
        actor,
        api_key_created,
        api_key_updated,
        api_key_deleted,
        invite_sent,
        invite_accepted,
        invite_deleted,
        login_failed,
        logout_failed,
        organization_updated,
        project_created,
        project_updated,
        project_archived,
        rate_limit_updated,
        rate_limit_deleted,
        service_account_created,
        service_account_updated,
        service_account_deleted,
        user_added,
        user_updated,
        user_deleted
        );
}

void audit_log_free(audit_log_t *audit_log) {
    if(NULL == audit_log){
        return ;
    }
    if(audit_log->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "audit_log_free");
        return ;
    }
    listEntry_t *listEntry;
    if (audit_log->id) {
        free(audit_log->id);
        audit_log->id = NULL;
    }
    if (audit_log->project) {
        audit_log_project_free(audit_log->project);
        audit_log->project = NULL;
    }
    if (audit_log->actor) {
        audit_log_actor_free(audit_log->actor);
        audit_log->actor = NULL;
    }
    if (audit_log->api_key_created) {
        audit_log_api_key_created_free(audit_log->api_key_created);
        audit_log->api_key_created = NULL;
    }
    if (audit_log->api_key_updated) {
        audit_log_api_key_updated_free(audit_log->api_key_updated);
        audit_log->api_key_updated = NULL;
    }
    if (audit_log->api_key_deleted) {
        audit_log_api_key_deleted_free(audit_log->api_key_deleted);
        audit_log->api_key_deleted = NULL;
    }
    if (audit_log->invite_sent) {
        audit_log_invite_sent_free(audit_log->invite_sent);
        audit_log->invite_sent = NULL;
    }
    if (audit_log->invite_accepted) {
        audit_log_invite_accepted_free(audit_log->invite_accepted);
        audit_log->invite_accepted = NULL;
    }
    if (audit_log->invite_deleted) {
        audit_log_invite_accepted_free(audit_log->invite_deleted);
        audit_log->invite_deleted = NULL;
    }
    if (audit_log->login_failed) {
        audit_log_login_failed_free(audit_log->login_failed);
        audit_log->login_failed = NULL;
    }
    if (audit_log->logout_failed) {
        audit_log_login_failed_free(audit_log->logout_failed);
        audit_log->logout_failed = NULL;
    }
    if (audit_log->organization_updated) {
        audit_log_organization_updated_free(audit_log->organization_updated);
        audit_log->organization_updated = NULL;
    }
    if (audit_log->project_created) {
        audit_log_project_created_free(audit_log->project_created);
        audit_log->project_created = NULL;
    }
    if (audit_log->project_updated) {
        audit_log_project_updated_free(audit_log->project_updated);
        audit_log->project_updated = NULL;
    }
    if (audit_log->project_archived) {
        audit_log_project_archived_free(audit_log->project_archived);
        audit_log->project_archived = NULL;
    }
    if (audit_log->rate_limit_updated) {
        audit_log_rate_limit_updated_free(audit_log->rate_limit_updated);
        audit_log->rate_limit_updated = NULL;
    }
    if (audit_log->rate_limit_deleted) {
        audit_log_rate_limit_deleted_free(audit_log->rate_limit_deleted);
        audit_log->rate_limit_deleted = NULL;
    }
    if (audit_log->service_account_created) {
        audit_log_service_account_created_free(audit_log->service_account_created);
        audit_log->service_account_created = NULL;
    }
    if (audit_log->service_account_updated) {
        audit_log_service_account_updated_free(audit_log->service_account_updated);
        audit_log->service_account_updated = NULL;
    }
    if (audit_log->service_account_deleted) {
        audit_log_service_account_deleted_free(audit_log->service_account_deleted);
        audit_log->service_account_deleted = NULL;
    }
    if (audit_log->user_added) {
        audit_log_user_added_free(audit_log->user_added);
        audit_log->user_added = NULL;
    }
    if (audit_log->user_updated) {
        audit_log_user_updated_free(audit_log->user_updated);
        audit_log->user_updated = NULL;
    }
    if (audit_log->user_deleted) {
        audit_log_user_deleted_free(audit_log->user_deleted);
        audit_log->user_deleted = NULL;
    }
    free(audit_log);
}

cJSON *audit_log_convertToJSON(audit_log_t *audit_log) {
    cJSON *item = cJSON_CreateObject();

    // audit_log->id
    if (!audit_log->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", audit_log->id) == NULL) {
    goto fail; //String
    }


    // audit_log->type
    if (openai_api_audit_log_event_type__NULL == audit_log->type) {
        goto fail;
    }
    cJSON *type_local_JSON = audit_log_event_type_convertToJSON(audit_log->type);
    if(type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "type", type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // audit_log->effective_at
    if (!audit_log->effective_at) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "effective_at", audit_log->effective_at) == NULL) {
    goto fail; //Numeric
    }


    // audit_log->project
    if(audit_log->project) {
    cJSON *project_local_JSON = audit_log_project_convertToJSON(audit_log->project);
    if(project_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "project", project_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // audit_log->actor
    if (!audit_log->actor) {
        goto fail;
    }
    cJSON *actor_local_JSON = audit_log_actor_convertToJSON(audit_log->actor);
    if(actor_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "actor", actor_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // audit_log->api_key_created
    if(audit_log->api_key_created) {
    cJSON *api_key_created_local_JSON = audit_log_api_key_created_convertToJSON(audit_log->api_key_created);
    if(api_key_created_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "api_key.created", api_key_created_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // audit_log->api_key_updated
    if(audit_log->api_key_updated) {
    cJSON *api_key_updated_local_JSON = audit_log_api_key_updated_convertToJSON(audit_log->api_key_updated);
    if(api_key_updated_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "api_key.updated", api_key_updated_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // audit_log->api_key_deleted
    if(audit_log->api_key_deleted) {
    cJSON *api_key_deleted_local_JSON = audit_log_api_key_deleted_convertToJSON(audit_log->api_key_deleted);
    if(api_key_deleted_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "api_key.deleted", api_key_deleted_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // audit_log->invite_sent
    if(audit_log->invite_sent) {
    cJSON *invite_sent_local_JSON = audit_log_invite_sent_convertToJSON(audit_log->invite_sent);
    if(invite_sent_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "invite.sent", invite_sent_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // audit_log->invite_accepted
    if(audit_log->invite_accepted) {
    cJSON *invite_accepted_local_JSON = audit_log_invite_accepted_convertToJSON(audit_log->invite_accepted);
    if(invite_accepted_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "invite.accepted", invite_accepted_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // audit_log->invite_deleted
    if(audit_log->invite_deleted) {
    cJSON *invite_deleted_local_JSON = audit_log_invite_accepted_convertToJSON(audit_log->invite_deleted);
    if(invite_deleted_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "invite.deleted", invite_deleted_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // audit_log->login_failed
    if(audit_log->login_failed) {
    cJSON *login_failed_local_JSON = audit_log_login_failed_convertToJSON(audit_log->login_failed);
    if(login_failed_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "login.failed", login_failed_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // audit_log->logout_failed
    if(audit_log->logout_failed) {
    cJSON *logout_failed_local_JSON = audit_log_login_failed_convertToJSON(audit_log->logout_failed);
    if(logout_failed_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "logout.failed", logout_failed_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // audit_log->organization_updated
    if(audit_log->organization_updated) {
    cJSON *organization_updated_local_JSON = audit_log_organization_updated_convertToJSON(audit_log->organization_updated);
    if(organization_updated_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "organization.updated", organization_updated_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // audit_log->project_created
    if(audit_log->project_created) {
    cJSON *project_created_local_JSON = audit_log_project_created_convertToJSON(audit_log->project_created);
    if(project_created_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "project.created", project_created_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // audit_log->project_updated
    if(audit_log->project_updated) {
    cJSON *project_updated_local_JSON = audit_log_project_updated_convertToJSON(audit_log->project_updated);
    if(project_updated_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "project.updated", project_updated_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // audit_log->project_archived
    if(audit_log->project_archived) {
    cJSON *project_archived_local_JSON = audit_log_project_archived_convertToJSON(audit_log->project_archived);
    if(project_archived_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "project.archived", project_archived_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // audit_log->rate_limit_updated
    if(audit_log->rate_limit_updated) {
    cJSON *rate_limit_updated_local_JSON = audit_log_rate_limit_updated_convertToJSON(audit_log->rate_limit_updated);
    if(rate_limit_updated_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "rate_limit.updated", rate_limit_updated_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // audit_log->rate_limit_deleted
    if(audit_log->rate_limit_deleted) {
    cJSON *rate_limit_deleted_local_JSON = audit_log_rate_limit_deleted_convertToJSON(audit_log->rate_limit_deleted);
    if(rate_limit_deleted_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "rate_limit.deleted", rate_limit_deleted_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // audit_log->service_account_created
    if(audit_log->service_account_created) {
    cJSON *service_account_created_local_JSON = audit_log_service_account_created_convertToJSON(audit_log->service_account_created);
    if(service_account_created_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "service_account.created", service_account_created_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // audit_log->service_account_updated
    if(audit_log->service_account_updated) {
    cJSON *service_account_updated_local_JSON = audit_log_service_account_updated_convertToJSON(audit_log->service_account_updated);
    if(service_account_updated_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "service_account.updated", service_account_updated_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // audit_log->service_account_deleted
    if(audit_log->service_account_deleted) {
    cJSON *service_account_deleted_local_JSON = audit_log_service_account_deleted_convertToJSON(audit_log->service_account_deleted);
    if(service_account_deleted_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "service_account.deleted", service_account_deleted_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // audit_log->user_added
    if(audit_log->user_added) {
    cJSON *user_added_local_JSON = audit_log_user_added_convertToJSON(audit_log->user_added);
    if(user_added_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "user.added", user_added_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // audit_log->user_updated
    if(audit_log->user_updated) {
    cJSON *user_updated_local_JSON = audit_log_user_updated_convertToJSON(audit_log->user_updated);
    if(user_updated_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "user.updated", user_updated_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // audit_log->user_deleted
    if(audit_log->user_deleted) {
    cJSON *user_deleted_local_JSON = audit_log_user_deleted_convertToJSON(audit_log->user_deleted);
    if(user_deleted_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "user.deleted", user_deleted_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

audit_log_t *audit_log_parseFromJSON(cJSON *audit_logJSON){

    audit_log_t *audit_log_local_var = NULL;

    // define the local variable for audit_log->type
    openai_api_audit_log_event_type__e type_local_nonprim = 0;

    // define the local variable for audit_log->project
    audit_log_project_t *project_local_nonprim = NULL;

    // define the local variable for audit_log->actor
    audit_log_actor_t *actor_local_nonprim = NULL;

    // define the local variable for audit_log->api_key_created
    audit_log_api_key_created_t *api_key_created_local_nonprim = NULL;

    // define the local variable for audit_log->api_key_updated
    audit_log_api_key_updated_t *api_key_updated_local_nonprim = NULL;

    // define the local variable for audit_log->api_key_deleted
    audit_log_api_key_deleted_t *api_key_deleted_local_nonprim = NULL;

    // define the local variable for audit_log->invite_sent
    audit_log_invite_sent_t *invite_sent_local_nonprim = NULL;

    // define the local variable for audit_log->invite_accepted
    audit_log_invite_accepted_t *invite_accepted_local_nonprim = NULL;

    // define the local variable for audit_log->invite_deleted
    audit_log_invite_accepted_t *invite_deleted_local_nonprim = NULL;

    // define the local variable for audit_log->login_failed
    audit_log_login_failed_t *login_failed_local_nonprim = NULL;

    // define the local variable for audit_log->logout_failed
    audit_log_login_failed_t *logout_failed_local_nonprim = NULL;

    // define the local variable for audit_log->organization_updated
    audit_log_organization_updated_t *organization_updated_local_nonprim = NULL;

    // define the local variable for audit_log->project_created
    audit_log_project_created_t *project_created_local_nonprim = NULL;

    // define the local variable for audit_log->project_updated
    audit_log_project_updated_t *project_updated_local_nonprim = NULL;

    // define the local variable for audit_log->project_archived
    audit_log_project_archived_t *project_archived_local_nonprim = NULL;

    // define the local variable for audit_log->rate_limit_updated
    audit_log_rate_limit_updated_t *rate_limit_updated_local_nonprim = NULL;

    // define the local variable for audit_log->rate_limit_deleted
    audit_log_rate_limit_deleted_t *rate_limit_deleted_local_nonprim = NULL;

    // define the local variable for audit_log->service_account_created
    audit_log_service_account_created_t *service_account_created_local_nonprim = NULL;

    // define the local variable for audit_log->service_account_updated
    audit_log_service_account_updated_t *service_account_updated_local_nonprim = NULL;

    // define the local variable for audit_log->service_account_deleted
    audit_log_service_account_deleted_t *service_account_deleted_local_nonprim = NULL;

    // define the local variable for audit_log->user_added
    audit_log_user_added_t *user_added_local_nonprim = NULL;

    // define the local variable for audit_log->user_updated
    audit_log_user_updated_t *user_updated_local_nonprim = NULL;

    // define the local variable for audit_log->user_deleted
    audit_log_user_deleted_t *user_deleted_local_nonprim = NULL;

    // audit_log->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(audit_logJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // audit_log->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(audit_logJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    
    type_local_nonprim = audit_log_event_type_parseFromJSON(type); //custom

    // audit_log->effective_at
    cJSON *effective_at = cJSON_GetObjectItemCaseSensitive(audit_logJSON, "effective_at");
    if (cJSON_IsNull(effective_at)) {
        effective_at = NULL;
    }
    if (!effective_at) {
        goto end;
    }

    
    if(!cJSON_IsNumber(effective_at))
    {
    goto end; //Numeric
    }

    // audit_log->project
    cJSON *project = cJSON_GetObjectItemCaseSensitive(audit_logJSON, "project");
    if (cJSON_IsNull(project)) {
        project = NULL;
    }
    if (project) { 
    project_local_nonprim = audit_log_project_parseFromJSON(project); //nonprimitive
    }

    // audit_log->actor
    cJSON *actor = cJSON_GetObjectItemCaseSensitive(audit_logJSON, "actor");
    if (cJSON_IsNull(actor)) {
        actor = NULL;
    }
    if (!actor) {
        goto end;
    }

    
    actor_local_nonprim = audit_log_actor_parseFromJSON(actor); //nonprimitive

    // audit_log->api_key_created
    cJSON *api_key_created = cJSON_GetObjectItemCaseSensitive(audit_logJSON, "api_key.created");
    if (cJSON_IsNull(api_key_created)) {
        api_key_created = NULL;
    }
    if (api_key_created) { 
    api_key_created_local_nonprim = audit_log_api_key_created_parseFromJSON(api_key_created); //nonprimitive
    }

    // audit_log->api_key_updated
    cJSON *api_key_updated = cJSON_GetObjectItemCaseSensitive(audit_logJSON, "api_key.updated");
    if (cJSON_IsNull(api_key_updated)) {
        api_key_updated = NULL;
    }
    if (api_key_updated) { 
    api_key_updated_local_nonprim = audit_log_api_key_updated_parseFromJSON(api_key_updated); //nonprimitive
    }

    // audit_log->api_key_deleted
    cJSON *api_key_deleted = cJSON_GetObjectItemCaseSensitive(audit_logJSON, "api_key.deleted");
    if (cJSON_IsNull(api_key_deleted)) {
        api_key_deleted = NULL;
    }
    if (api_key_deleted) { 
    api_key_deleted_local_nonprim = audit_log_api_key_deleted_parseFromJSON(api_key_deleted); //nonprimitive
    }

    // audit_log->invite_sent
    cJSON *invite_sent = cJSON_GetObjectItemCaseSensitive(audit_logJSON, "invite.sent");
    if (cJSON_IsNull(invite_sent)) {
        invite_sent = NULL;
    }
    if (invite_sent) { 
    invite_sent_local_nonprim = audit_log_invite_sent_parseFromJSON(invite_sent); //nonprimitive
    }

    // audit_log->invite_accepted
    cJSON *invite_accepted = cJSON_GetObjectItemCaseSensitive(audit_logJSON, "invite.accepted");
    if (cJSON_IsNull(invite_accepted)) {
        invite_accepted = NULL;
    }
    if (invite_accepted) { 
    invite_accepted_local_nonprim = audit_log_invite_accepted_parseFromJSON(invite_accepted); //nonprimitive
    }

    // audit_log->invite_deleted
    cJSON *invite_deleted = cJSON_GetObjectItemCaseSensitive(audit_logJSON, "invite.deleted");
    if (cJSON_IsNull(invite_deleted)) {
        invite_deleted = NULL;
    }
    if (invite_deleted) { 
    invite_deleted_local_nonprim = audit_log_invite_accepted_parseFromJSON(invite_deleted); //nonprimitive
    }

    // audit_log->login_failed
    cJSON *login_failed = cJSON_GetObjectItemCaseSensitive(audit_logJSON, "login.failed");
    if (cJSON_IsNull(login_failed)) {
        login_failed = NULL;
    }
    if (login_failed) { 
    login_failed_local_nonprim = audit_log_login_failed_parseFromJSON(login_failed); //nonprimitive
    }

    // audit_log->logout_failed
    cJSON *logout_failed = cJSON_GetObjectItemCaseSensitive(audit_logJSON, "logout.failed");
    if (cJSON_IsNull(logout_failed)) {
        logout_failed = NULL;
    }
    if (logout_failed) { 
    logout_failed_local_nonprim = audit_log_login_failed_parseFromJSON(logout_failed); //nonprimitive
    }

    // audit_log->organization_updated
    cJSON *organization_updated = cJSON_GetObjectItemCaseSensitive(audit_logJSON, "organization.updated");
    if (cJSON_IsNull(organization_updated)) {
        organization_updated = NULL;
    }
    if (organization_updated) { 
    organization_updated_local_nonprim = audit_log_organization_updated_parseFromJSON(organization_updated); //nonprimitive
    }

    // audit_log->project_created
    cJSON *project_created = cJSON_GetObjectItemCaseSensitive(audit_logJSON, "project.created");
    if (cJSON_IsNull(project_created)) {
        project_created = NULL;
    }
    if (project_created) { 
    project_created_local_nonprim = audit_log_project_created_parseFromJSON(project_created); //nonprimitive
    }

    // audit_log->project_updated
    cJSON *project_updated = cJSON_GetObjectItemCaseSensitive(audit_logJSON, "project.updated");
    if (cJSON_IsNull(project_updated)) {
        project_updated = NULL;
    }
    if (project_updated) { 
    project_updated_local_nonprim = audit_log_project_updated_parseFromJSON(project_updated); //nonprimitive
    }

    // audit_log->project_archived
    cJSON *project_archived = cJSON_GetObjectItemCaseSensitive(audit_logJSON, "project.archived");
    if (cJSON_IsNull(project_archived)) {
        project_archived = NULL;
    }
    if (project_archived) { 
    project_archived_local_nonprim = audit_log_project_archived_parseFromJSON(project_archived); //nonprimitive
    }

    // audit_log->rate_limit_updated
    cJSON *rate_limit_updated = cJSON_GetObjectItemCaseSensitive(audit_logJSON, "rate_limit.updated");
    if (cJSON_IsNull(rate_limit_updated)) {
        rate_limit_updated = NULL;
    }
    if (rate_limit_updated) { 
    rate_limit_updated_local_nonprim = audit_log_rate_limit_updated_parseFromJSON(rate_limit_updated); //nonprimitive
    }

    // audit_log->rate_limit_deleted
    cJSON *rate_limit_deleted = cJSON_GetObjectItemCaseSensitive(audit_logJSON, "rate_limit.deleted");
    if (cJSON_IsNull(rate_limit_deleted)) {
        rate_limit_deleted = NULL;
    }
    if (rate_limit_deleted) { 
    rate_limit_deleted_local_nonprim = audit_log_rate_limit_deleted_parseFromJSON(rate_limit_deleted); //nonprimitive
    }

    // audit_log->service_account_created
    cJSON *service_account_created = cJSON_GetObjectItemCaseSensitive(audit_logJSON, "service_account.created");
    if (cJSON_IsNull(service_account_created)) {
        service_account_created = NULL;
    }
    if (service_account_created) { 
    service_account_created_local_nonprim = audit_log_service_account_created_parseFromJSON(service_account_created); //nonprimitive
    }

    // audit_log->service_account_updated
    cJSON *service_account_updated = cJSON_GetObjectItemCaseSensitive(audit_logJSON, "service_account.updated");
    if (cJSON_IsNull(service_account_updated)) {
        service_account_updated = NULL;
    }
    if (service_account_updated) { 
    service_account_updated_local_nonprim = audit_log_service_account_updated_parseFromJSON(service_account_updated); //nonprimitive
    }

    // audit_log->service_account_deleted
    cJSON *service_account_deleted = cJSON_GetObjectItemCaseSensitive(audit_logJSON, "service_account.deleted");
    if (cJSON_IsNull(service_account_deleted)) {
        service_account_deleted = NULL;
    }
    if (service_account_deleted) { 
    service_account_deleted_local_nonprim = audit_log_service_account_deleted_parseFromJSON(service_account_deleted); //nonprimitive
    }

    // audit_log->user_added
    cJSON *user_added = cJSON_GetObjectItemCaseSensitive(audit_logJSON, "user.added");
    if (cJSON_IsNull(user_added)) {
        user_added = NULL;
    }
    if (user_added) { 
    user_added_local_nonprim = audit_log_user_added_parseFromJSON(user_added); //nonprimitive
    }

    // audit_log->user_updated
    cJSON *user_updated = cJSON_GetObjectItemCaseSensitive(audit_logJSON, "user.updated");
    if (cJSON_IsNull(user_updated)) {
        user_updated = NULL;
    }
    if (user_updated) { 
    user_updated_local_nonprim = audit_log_user_updated_parseFromJSON(user_updated); //nonprimitive
    }

    // audit_log->user_deleted
    cJSON *user_deleted = cJSON_GetObjectItemCaseSensitive(audit_logJSON, "user.deleted");
    if (cJSON_IsNull(user_deleted)) {
        user_deleted = NULL;
    }
    if (user_deleted) { 
    user_deleted_local_nonprim = audit_log_user_deleted_parseFromJSON(user_deleted); //nonprimitive
    }


    audit_log_local_var = audit_log_create_internal (
        strdup(id->valuestring),
        type_local_nonprim,
        effective_at->valuedouble,
        project ? project_local_nonprim : NULL,
        actor_local_nonprim,
        api_key_created ? api_key_created_local_nonprim : NULL,
        api_key_updated ? api_key_updated_local_nonprim : NULL,
        api_key_deleted ? api_key_deleted_local_nonprim : NULL,
        invite_sent ? invite_sent_local_nonprim : NULL,
        invite_accepted ? invite_accepted_local_nonprim : NULL,
        invite_deleted ? invite_deleted_local_nonprim : NULL,
        login_failed ? login_failed_local_nonprim : NULL,
        logout_failed ? logout_failed_local_nonprim : NULL,
        organization_updated ? organization_updated_local_nonprim : NULL,
        project_created ? project_created_local_nonprim : NULL,
        project_updated ? project_updated_local_nonprim : NULL,
        project_archived ? project_archived_local_nonprim : NULL,
        rate_limit_updated ? rate_limit_updated_local_nonprim : NULL,
        rate_limit_deleted ? rate_limit_deleted_local_nonprim : NULL,
        service_account_created ? service_account_created_local_nonprim : NULL,
        service_account_updated ? service_account_updated_local_nonprim : NULL,
        service_account_deleted ? service_account_deleted_local_nonprim : NULL,
        user_added ? user_added_local_nonprim : NULL,
        user_updated ? user_updated_local_nonprim : NULL,
        user_deleted ? user_deleted_local_nonprim : NULL
        );

    return audit_log_local_var;
end:
    if (type_local_nonprim) {
        type_local_nonprim = 0;
    }
    if (project_local_nonprim) {
        audit_log_project_free(project_local_nonprim);
        project_local_nonprim = NULL;
    }
    if (actor_local_nonprim) {
        audit_log_actor_free(actor_local_nonprim);
        actor_local_nonprim = NULL;
    }
    if (api_key_created_local_nonprim) {
        audit_log_api_key_created_free(api_key_created_local_nonprim);
        api_key_created_local_nonprim = NULL;
    }
    if (api_key_updated_local_nonprim) {
        audit_log_api_key_updated_free(api_key_updated_local_nonprim);
        api_key_updated_local_nonprim = NULL;
    }
    if (api_key_deleted_local_nonprim) {
        audit_log_api_key_deleted_free(api_key_deleted_local_nonprim);
        api_key_deleted_local_nonprim = NULL;
    }
    if (invite_sent_local_nonprim) {
        audit_log_invite_sent_free(invite_sent_local_nonprim);
        invite_sent_local_nonprim = NULL;
    }
    if (invite_accepted_local_nonprim) {
        audit_log_invite_accepted_free(invite_accepted_local_nonprim);
        invite_accepted_local_nonprim = NULL;
    }
    if (invite_deleted_local_nonprim) {
        audit_log_invite_accepted_free(invite_deleted_local_nonprim);
        invite_deleted_local_nonprim = NULL;
    }
    if (login_failed_local_nonprim) {
        audit_log_login_failed_free(login_failed_local_nonprim);
        login_failed_local_nonprim = NULL;
    }
    if (logout_failed_local_nonprim) {
        audit_log_login_failed_free(logout_failed_local_nonprim);
        logout_failed_local_nonprim = NULL;
    }
    if (organization_updated_local_nonprim) {
        audit_log_organization_updated_free(organization_updated_local_nonprim);
        organization_updated_local_nonprim = NULL;
    }
    if (project_created_local_nonprim) {
        audit_log_project_created_free(project_created_local_nonprim);
        project_created_local_nonprim = NULL;
    }
    if (project_updated_local_nonprim) {
        audit_log_project_updated_free(project_updated_local_nonprim);
        project_updated_local_nonprim = NULL;
    }
    if (project_archived_local_nonprim) {
        audit_log_project_archived_free(project_archived_local_nonprim);
        project_archived_local_nonprim = NULL;
    }
    if (rate_limit_updated_local_nonprim) {
        audit_log_rate_limit_updated_free(rate_limit_updated_local_nonprim);
        rate_limit_updated_local_nonprim = NULL;
    }
    if (rate_limit_deleted_local_nonprim) {
        audit_log_rate_limit_deleted_free(rate_limit_deleted_local_nonprim);
        rate_limit_deleted_local_nonprim = NULL;
    }
    if (service_account_created_local_nonprim) {
        audit_log_service_account_created_free(service_account_created_local_nonprim);
        service_account_created_local_nonprim = NULL;
    }
    if (service_account_updated_local_nonprim) {
        audit_log_service_account_updated_free(service_account_updated_local_nonprim);
        service_account_updated_local_nonprim = NULL;
    }
    if (service_account_deleted_local_nonprim) {
        audit_log_service_account_deleted_free(service_account_deleted_local_nonprim);
        service_account_deleted_local_nonprim = NULL;
    }
    if (user_added_local_nonprim) {
        audit_log_user_added_free(user_added_local_nonprim);
        user_added_local_nonprim = NULL;
    }
    if (user_updated_local_nonprim) {
        audit_log_user_updated_free(user_updated_local_nonprim);
        user_updated_local_nonprim = NULL;
    }
    if (user_deleted_local_nonprim) {
        audit_log_user_deleted_free(user_deleted_local_nonprim);
        user_deleted_local_nonprim = NULL;
    }
    return NULL;

}
