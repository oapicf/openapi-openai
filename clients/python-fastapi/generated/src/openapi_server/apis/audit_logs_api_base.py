# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, StrictInt, StrictStr
from typing import List, Optional
from typing_extensions import Annotated
from openapi_server.models.audit_log_event_type import AuditLogEventType
from openapi_server.models.list_audit_logs_effective_at_parameter import ListAuditLogsEffectiveAtParameter
from openapi_server.models.list_audit_logs_response import ListAuditLogsResponse
from openapi_server.security_api import get_token_ApiKeyAuth

class BaseAuditLogsApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseAuditLogsApi.subclasses = BaseAuditLogsApi.subclasses + (cls,)
    async def list_audit_logs(
        self,
        effective_at: Annotated[Optional[ListAuditLogsEffectiveAtParameter], Field(description="Return only events whose `effective_at` (Unix seconds) is in this range.")],
        project_ids: Annotated[Optional[List[StrictStr]], Field(description="Return only events for these projects.")],
        event_types: Annotated[Optional[List[AuditLogEventType]], Field(description="Return only events with a `type` in one of these values. For example, `project.created`. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object).")],
        actor_ids: Annotated[Optional[List[StrictStr]], Field(description="Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID.")],
        actor_emails: Annotated[Optional[List[StrictStr]], Field(description="Return only events performed by users with these emails.")],
        resource_ids: Annotated[Optional[List[StrictStr]], Field(description="Return only events performed on these targets. For example, a project ID updated.")],
        limit: Annotated[Optional[StrictInt], Field(description="A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ")],
        after: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")],
        before: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ")],
    ) -> ListAuditLogsResponse:
        ...
