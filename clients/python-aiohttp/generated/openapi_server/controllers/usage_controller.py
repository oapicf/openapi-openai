from typing import List, Dict
from aiohttp import web

from openapi_server.models.usage_response import UsageResponse
from openapi_server import util


async def usage_audio_speeches(request: web.Request, start_time, end_time=None, bucket_width=None, project_ids=None, user_ids=None, api_key_ids=None, models=None, group_by=None, limit=None, page=None) -> web.Response:
    """Get audio speeches usage details for the organization.

    

    :param start_time: Start time (Unix seconds) of the query time range, inclusive.
    :type start_time: int
    :param end_time: End time (Unix seconds) of the query time range, exclusive.
    :type end_time: int
    :param bucket_width: Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.
    :type bucket_width: str
    :param project_ids: Return only usage for these projects.
    :type project_ids: List[str]
    :param user_ids: Return only usage for these users.
    :type user_ids: List[str]
    :param api_key_ids: Return only usage for these API keys.
    :type api_key_ids: List[str]
    :param models: Return only usage for these models.
    :type models: List[str]
    :param group_by: Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them.
    :type group_by: List[str]
    :param limit: Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 
    :type limit: int
    :param page: A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
    :type page: str

    """
    return web.Response(status=200)


async def usage_audio_transcriptions(request: web.Request, start_time, end_time=None, bucket_width=None, project_ids=None, user_ids=None, api_key_ids=None, models=None, group_by=None, limit=None, page=None) -> web.Response:
    """Get audio transcriptions usage details for the organization.

    

    :param start_time: Start time (Unix seconds) of the query time range, inclusive.
    :type start_time: int
    :param end_time: End time (Unix seconds) of the query time range, exclusive.
    :type end_time: int
    :param bucket_width: Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.
    :type bucket_width: str
    :param project_ids: Return only usage for these projects.
    :type project_ids: List[str]
    :param user_ids: Return only usage for these users.
    :type user_ids: List[str]
    :param api_key_ids: Return only usage for these API keys.
    :type api_key_ids: List[str]
    :param models: Return only usage for these models.
    :type models: List[str]
    :param group_by: Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them.
    :type group_by: List[str]
    :param limit: Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 
    :type limit: int
    :param page: A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
    :type page: str

    """
    return web.Response(status=200)


async def usage_code_interpreter_sessions(request: web.Request, start_time, end_time=None, bucket_width=None, project_ids=None, group_by=None, limit=None, page=None) -> web.Response:
    """Get code interpreter sessions usage details for the organization.

    

    :param start_time: Start time (Unix seconds) of the query time range, inclusive.
    :type start_time: int
    :param end_time: End time (Unix seconds) of the query time range, exclusive.
    :type end_time: int
    :param bucket_width: Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.
    :type bucket_width: str
    :param project_ids: Return only usage for these projects.
    :type project_ids: List[str]
    :param group_by: Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;.
    :type group_by: List[str]
    :param limit: Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 
    :type limit: int
    :param page: A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
    :type page: str

    """
    return web.Response(status=200)


async def usage_completions(request: web.Request, start_time, end_time=None, bucket_width=None, project_ids=None, user_ids=None, api_key_ids=None, models=None, batch=None, group_by=None, limit=None, page=None) -> web.Response:
    """Get completions usage details for the organization.

    

    :param start_time: Start time (Unix seconds) of the query time range, inclusive.
    :type start_time: int
    :param end_time: End time (Unix seconds) of the query time range, exclusive.
    :type end_time: int
    :param bucket_width: Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.
    :type bucket_width: str
    :param project_ids: Return only usage for these projects.
    :type project_ids: List[str]
    :param user_ids: Return only usage for these users.
    :type user_ids: List[str]
    :param api_key_ids: Return only usage for these API keys.
    :type api_key_ids: List[str]
    :param models: Return only usage for these models.
    :type models: List[str]
    :param batch: If &#x60;true&#x60;, return batch jobs only. If &#x60;false&#x60;, return non-batch jobs only. By default, return both. 
    :type batch: bool
    :param group_by: Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;batch&#x60; or any combination of them.
    :type group_by: List[str]
    :param limit: Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 
    :type limit: int
    :param page: A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
    :type page: str

    """
    return web.Response(status=200)


async def usage_costs(request: web.Request, start_time, end_time=None, bucket_width=None, project_ids=None, group_by=None, limit=None, page=None) -> web.Response:
    """Get costs details for the organization.

    

    :param start_time: Start time (Unix seconds) of the query time range, inclusive.
    :type start_time: int
    :param end_time: End time (Unix seconds) of the query time range, exclusive.
    :type end_time: int
    :param bucket_width: Width of each time bucket in response. Currently only &#x60;1d&#x60; is supported, default to &#x60;1d&#x60;.
    :type bucket_width: str
    :param project_ids: Return only costs for these projects.
    :type project_ids: List[str]
    :param group_by: Group the costs by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;line_item&#x60; and any combination of them.
    :type group_by: List[str]
    :param limit: A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7. 
    :type limit: int
    :param page: A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
    :type page: str

    """
    return web.Response(status=200)


async def usage_embeddings(request: web.Request, start_time, end_time=None, bucket_width=None, project_ids=None, user_ids=None, api_key_ids=None, models=None, group_by=None, limit=None, page=None) -> web.Response:
    """Get embeddings usage details for the organization.

    

    :param start_time: Start time (Unix seconds) of the query time range, inclusive.
    :type start_time: int
    :param end_time: End time (Unix seconds) of the query time range, exclusive.
    :type end_time: int
    :param bucket_width: Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.
    :type bucket_width: str
    :param project_ids: Return only usage for these projects.
    :type project_ids: List[str]
    :param user_ids: Return only usage for these users.
    :type user_ids: List[str]
    :param api_key_ids: Return only usage for these API keys.
    :type api_key_ids: List[str]
    :param models: Return only usage for these models.
    :type models: List[str]
    :param group_by: Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them.
    :type group_by: List[str]
    :param limit: Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 
    :type limit: int
    :param page: A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
    :type page: str

    """
    return web.Response(status=200)


async def usage_images(request: web.Request, start_time, end_time=None, bucket_width=None, sources=None, sizes=None, project_ids=None, user_ids=None, api_key_ids=None, models=None, group_by=None, limit=None, page=None) -> web.Response:
    """Get images usage details for the organization.

    

    :param start_time: Start time (Unix seconds) of the query time range, inclusive.
    :type start_time: int
    :param end_time: End time (Unix seconds) of the query time range, exclusive.
    :type end_time: int
    :param bucket_width: Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.
    :type bucket_width: str
    :param sources: Return only usages for these sources. Possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60; or any combination of them.
    :type sources: List[str]
    :param sizes: Return only usages for these image sizes. Possible values are &#x60;256x256&#x60;, &#x60;512x512&#x60;, &#x60;1024x1024&#x60;, &#x60;1792x1792&#x60;, &#x60;1024x1792&#x60; or any combination of them.
    :type sizes: List[str]
    :param project_ids: Return only usage for these projects.
    :type project_ids: List[str]
    :param user_ids: Return only usage for these users.
    :type user_ids: List[str]
    :param api_key_ids: Return only usage for these API keys.
    :type api_key_ids: List[str]
    :param models: Return only usage for these models.
    :type models: List[str]
    :param group_by: Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;size&#x60;, &#x60;source&#x60; or any combination of them.
    :type group_by: List[str]
    :param limit: Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 
    :type limit: int
    :param page: A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
    :type page: str

    """
    return web.Response(status=200)


async def usage_moderations(request: web.Request, start_time, end_time=None, bucket_width=None, project_ids=None, user_ids=None, api_key_ids=None, models=None, group_by=None, limit=None, page=None) -> web.Response:
    """Get moderations usage details for the organization.

    

    :param start_time: Start time (Unix seconds) of the query time range, inclusive.
    :type start_time: int
    :param end_time: End time (Unix seconds) of the query time range, exclusive.
    :type end_time: int
    :param bucket_width: Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.
    :type bucket_width: str
    :param project_ids: Return only usage for these projects.
    :type project_ids: List[str]
    :param user_ids: Return only usage for these users.
    :type user_ids: List[str]
    :param api_key_ids: Return only usage for these API keys.
    :type api_key_ids: List[str]
    :param models: Return only usage for these models.
    :type models: List[str]
    :param group_by: Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them.
    :type group_by: List[str]
    :param limit: Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 
    :type limit: int
    :param page: A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
    :type page: str

    """
    return web.Response(status=200)


async def usage_vector_stores(request: web.Request, start_time, end_time=None, bucket_width=None, project_ids=None, group_by=None, limit=None, page=None) -> web.Response:
    """Get vector stores usage details for the organization.

    

    :param start_time: Start time (Unix seconds) of the query time range, inclusive.
    :type start_time: int
    :param end_time: End time (Unix seconds) of the query time range, exclusive.
    :type end_time: int
    :param bucket_width: Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.
    :type bucket_width: str
    :param project_ids: Return only usage for these projects.
    :type project_ids: List[str]
    :param group_by: Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;.
    :type group_by: List[str]
    :param limit: Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 
    :type limit: int
    :param page: A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
    :type page: str

    """
    return web.Response(status=200)
