-module(openapi_audit_log).

-include("openapi.hrl").

-export([openapi_audit_log/0]).

-export([openapi_audit_log/1]).

-export_type([openapi_audit_log/0]).

-type openapi_audit_log() ::
  [ {'id', binary() }
  | {'type', openapi_audit_log_event_type:openapi_audit_log_event_type() }
  | {'effective_at', integer() }
  | {'project', openapi_audit_log_project:openapi_audit_log_project() }
  | {'actor', openapi_audit_log_actor:openapi_audit_log_actor() }
  | {'api_key_created', openapi_audit_log_api_key_created:openapi_audit_log_api_key_created() }
  | {'api_key_updated', openapi_audit_log_api_key_updated:openapi_audit_log_api_key_updated() }
  | {'api_key_deleted', openapi_audit_log_api_key_deleted:openapi_audit_log_api_key_deleted() }
  | {'invite_sent', openapi_audit_log_invite_sent:openapi_audit_log_invite_sent() }
  | {'invite_accepted', openapi_audit_log_invite_accepted:openapi_audit_log_invite_accepted() }
  | {'invite_deleted', openapi_audit_log_invite_accepted:openapi_audit_log_invite_accepted() }
  | {'login_failed', openapi_audit_log_login_failed:openapi_audit_log_login_failed() }
  | {'logout_failed', openapi_audit_log_login_failed:openapi_audit_log_login_failed() }
  | {'organization_updated', openapi_audit_log_organization_updated:openapi_audit_log_organization_updated() }
  | {'project_created', openapi_audit_log_project_created:openapi_audit_log_project_created() }
  | {'project_updated', openapi_audit_log_project_updated:openapi_audit_log_project_updated() }
  | {'project_archived', openapi_audit_log_project_archived:openapi_audit_log_project_archived() }
  | {'rate_limit_updated', openapi_audit_log_rate_limit_updated:openapi_audit_log_rate_limit_updated() }
  | {'rate_limit_deleted', openapi_audit_log_rate_limit_deleted:openapi_audit_log_rate_limit_deleted() }
  | {'service_account_created', openapi_audit_log_service_account_created:openapi_audit_log_service_account_created() }
  | {'service_account_updated', openapi_audit_log_service_account_updated:openapi_audit_log_service_account_updated() }
  | {'service_account_deleted', openapi_audit_log_service_account_deleted:openapi_audit_log_service_account_deleted() }
  | {'user_added', openapi_audit_log_user_added:openapi_audit_log_user_added() }
  | {'user_updated', openapi_audit_log_user_updated:openapi_audit_log_user_updated() }
  | {'user_deleted', openapi_audit_log_user_deleted:openapi_audit_log_user_deleted() }
  ].


openapi_audit_log() ->
    openapi_audit_log([]).

openapi_audit_log(Fields) ->
  Default = [ {'id', binary() }
            , {'type', openapi_audit_log_event_type:openapi_audit_log_event_type() }
            , {'effective_at', integer() }
            , {'project', openapi_audit_log_project:openapi_audit_log_project() }
            , {'actor', openapi_audit_log_actor:openapi_audit_log_actor() }
            , {'api_key.created', openapi_audit_log_api_key_created:openapi_audit_log_api_key_created() }
            , {'api_key.updated', openapi_audit_log_api_key_updated:openapi_audit_log_api_key_updated() }
            , {'api_key.deleted', openapi_audit_log_api_key_deleted:openapi_audit_log_api_key_deleted() }
            , {'invite.sent', openapi_audit_log_invite_sent:openapi_audit_log_invite_sent() }
            , {'invite.accepted', openapi_audit_log_invite_accepted:openapi_audit_log_invite_accepted() }
            , {'invite.deleted', openapi_audit_log_invite_accepted:openapi_audit_log_invite_accepted() }
            , {'login.failed', openapi_audit_log_login_failed:openapi_audit_log_login_failed() }
            , {'logout.failed', openapi_audit_log_login_failed:openapi_audit_log_login_failed() }
            , {'organization.updated', openapi_audit_log_organization_updated:openapi_audit_log_organization_updated() }
            , {'project.created', openapi_audit_log_project_created:openapi_audit_log_project_created() }
            , {'project.updated', openapi_audit_log_project_updated:openapi_audit_log_project_updated() }
            , {'project.archived', openapi_audit_log_project_archived:openapi_audit_log_project_archived() }
            , {'rate_limit.updated', openapi_audit_log_rate_limit_updated:openapi_audit_log_rate_limit_updated() }
            , {'rate_limit.deleted', openapi_audit_log_rate_limit_deleted:openapi_audit_log_rate_limit_deleted() }
            , {'service_account.created', openapi_audit_log_service_account_created:openapi_audit_log_service_account_created() }
            , {'service_account.updated', openapi_audit_log_service_account_updated:openapi_audit_log_service_account_updated() }
            , {'service_account.deleted', openapi_audit_log_service_account_deleted:openapi_audit_log_service_account_deleted() }
            , {'user.added', openapi_audit_log_user_added:openapi_audit_log_user_added() }
            , {'user.updated', openapi_audit_log_user_updated:openapi_audit_log_user_updated() }
            , {'user.deleted', openapi_audit_log_user_deleted:openapi_audit_log_user_deleted() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

