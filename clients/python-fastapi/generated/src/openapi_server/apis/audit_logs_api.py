# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.audit_logs_api_base import BaseAuditLogsApi
import openapi_server.impl

from fastapi import (  # noqa: F401
    APIRouter,
    Body,
    Cookie,
    Depends,
    Form,
    Header,
    HTTPException,
    Path,
    Query,
    Response,
    Security,
    status,
)

from openapi_server.models.extra_models import TokenModel  # noqa: F401
from pydantic import Field, StrictInt, StrictStr
from typing import List, Optional
from typing_extensions import Annotated
from openapi_server.models.audit_log_event_type import AuditLogEventType
from openapi_server.models.list_audit_logs_effective_at_parameter import ListAuditLogsEffectiveAtParameter
from openapi_server.models.list_audit_logs_response import ListAuditLogsResponse
from openapi_server.security_api import get_token_ApiKeyAuth

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/organization/audit_logs",
    responses={
        200: {"model": ListAuditLogsResponse, "description": "Audit logs listed successfully."},
    },
    tags=["Audit Logs"],
    summary="List user actions and configuration changes within this organization.",
    response_model_by_alias=True,
)
async def list_audit_logs(
    effective_at: Annotated[Optional[ListAuditLogsEffectiveAtParameter], Field(description="Return only events whose `effective_at` (Unix seconds) is in this range.")] = Query(None, description="Return only events whose &#x60;effective_at&#x60; (Unix seconds) is in this range.", alias="effective_at"),
    project_ids: Annotated[Optional[List[StrictStr]], Field(description="Return only events for these projects.")] = Query(None, description="Return only events for these projects.", alias="project_ids[]"),
    event_types: Annotated[Optional[List[AuditLogEventType]], Field(description="Return only events with a `type` in one of these values. For example, `project.created`. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object).")] = Query(None, description="Return only events with a &#x60;type&#x60; in one of these values. For example, &#x60;project.created&#x60;. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object).", alias="event_types[]"),
    actor_ids: Annotated[Optional[List[StrictStr]], Field(description="Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID.")] = Query(None, description="Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID.", alias="actor_ids[]"),
    actor_emails: Annotated[Optional[List[StrictStr]], Field(description="Return only events performed by users with these emails.")] = Query(None, description="Return only events performed by users with these emails.", alias="actor_emails[]"),
    resource_ids: Annotated[Optional[List[StrictStr]], Field(description="Return only events performed on these targets. For example, a project ID updated.")] = Query(None, description="Return only events performed on these targets. For example, a project ID updated.", alias="resource_ids[]"),
    limit: Annotated[Optional[StrictInt], Field(description="A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ")] = Query(20, description="A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", alias="limit"),
    after: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")] = Query(None, description="A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ", alias="after"),
    before: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ")] = Query(None, description="A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. ", alias="before"),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> ListAuditLogsResponse:
    if not BaseAuditLogsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAuditLogsApi.subclasses[0]().list_audit_logs(effective_at, project_ids, event_types, actor_ids, actor_emails, resource_ids, limit, after, before)
