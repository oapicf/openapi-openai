import connexion

from app.openapi_server.models.audit_log_event_type import AuditLogEventType  # noqa: E501
from app.openapi_server.models.list_audit_logs_effective_at_parameter import ListAuditLogsEffectiveAtParameter  # noqa: E501
from app.openapi_server.models.list_audit_logs_response import ListAuditLogsResponse  # noqa: E501
from openapi_server import util


def list_audit_logs(effective_at=None, project_ids=None, event_types=None, actor_ids=None, actor_emails=None, resource_ids=None, limit=None, after=None, before=None):  # noqa: E501
    """List user actions and configuration changes within this organization.

     # noqa: E501

    :param effective_at: Return only events whose &#x60;effective_at&#x60; (Unix seconds) is in this range.
    :type effective_at: dict | bytes
    :param project_ids: Return only events for these projects.
    :type project_ids: List[str]
    :param event_types: Return only events with a &#x60;type&#x60; in one of these values. For example, &#x60;project.created&#x60;. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object).
    :type event_types: list | bytes
    :param actor_ids: Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID.
    :type actor_ids: List[str]
    :param actor_emails: Return only events performed by users with these emails.
    :type actor_emails: List[str]
    :param resource_ids: Return only events performed on these targets. For example, a project ID updated.
    :type resource_ids: List[str]
    :param limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    :type limit: int
    :param after: A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
    :type after: str
    :param before: A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
    :type before: str

    :rtype: ListAuditLogsResponse
    """
    if connexion.request.is_json:
        effective_at = .from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        event_types = [AuditLogEventType.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'
