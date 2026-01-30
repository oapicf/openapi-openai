# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, StrictBool, StrictInt, StrictStr, field_validator
from typing import List, Optional
from typing_extensions import Annotated
from openapi_server.models.usage_response import UsageResponse
from openapi_server.security_api import get_token_ApiKeyAuth

class BaseUsageApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseUsageApi.subclasses = BaseUsageApi.subclasses + (cls,)
    async def usage_costs(
        self,
        start_time: Annotated[StrictInt, Field(description="Start time (Unix seconds) of the query time range, inclusive.")],
        end_time: Annotated[Optional[StrictInt], Field(description="End time (Unix seconds) of the query time range, exclusive.")],
        bucket_width: Annotated[Optional[StrictStr], Field(description="Width of each time bucket in response. Currently only `1d` is supported, default to `1d`.")],
        project_ids: Annotated[Optional[List[StrictStr]], Field(description="Return only costs for these projects.")],
        group_by: Annotated[Optional[List[StrictStr]], Field(description="Group the costs by the specified fields. Support fields include `project_id`, `line_item` and any combination of them.")],
        limit: Annotated[Optional[StrictInt], Field(description="A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7. ")],
        page: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.")],
    ) -> UsageResponse:
        ...


    async def usage_audio_speeches(
        self,
        start_time: Annotated[StrictInt, Field(description="Start time (Unix seconds) of the query time range, inclusive.")],
        end_time: Annotated[Optional[StrictInt], Field(description="End time (Unix seconds) of the query time range, exclusive.")],
        bucket_width: Annotated[Optional[StrictStr], Field(description="Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.")],
        project_ids: Annotated[Optional[List[StrictStr]], Field(description="Return only usage for these projects.")],
        user_ids: Annotated[Optional[List[StrictStr]], Field(description="Return only usage for these users.")],
        api_key_ids: Annotated[Optional[List[StrictStr]], Field(description="Return only usage for these API keys.")],
        models: Annotated[Optional[List[StrictStr]], Field(description="Return only usage for these models.")],
        group_by: Annotated[Optional[List[StrictStr]], Field(description="Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.")],
        limit: Annotated[Optional[StrictInt], Field(description="Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 ")],
        page: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.")],
    ) -> UsageResponse:
        ...


    async def usage_audio_transcriptions(
        self,
        start_time: Annotated[StrictInt, Field(description="Start time (Unix seconds) of the query time range, inclusive.")],
        end_time: Annotated[Optional[StrictInt], Field(description="End time (Unix seconds) of the query time range, exclusive.")],
        bucket_width: Annotated[Optional[StrictStr], Field(description="Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.")],
        project_ids: Annotated[Optional[List[StrictStr]], Field(description="Return only usage for these projects.")],
        user_ids: Annotated[Optional[List[StrictStr]], Field(description="Return only usage for these users.")],
        api_key_ids: Annotated[Optional[List[StrictStr]], Field(description="Return only usage for these API keys.")],
        models: Annotated[Optional[List[StrictStr]], Field(description="Return only usage for these models.")],
        group_by: Annotated[Optional[List[StrictStr]], Field(description="Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.")],
        limit: Annotated[Optional[StrictInt], Field(description="Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 ")],
        page: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.")],
    ) -> UsageResponse:
        ...


    async def usage_code_interpreter_sessions(
        self,
        start_time: Annotated[StrictInt, Field(description="Start time (Unix seconds) of the query time range, inclusive.")],
        end_time: Annotated[Optional[StrictInt], Field(description="End time (Unix seconds) of the query time range, exclusive.")],
        bucket_width: Annotated[Optional[StrictStr], Field(description="Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.")],
        project_ids: Annotated[Optional[List[StrictStr]], Field(description="Return only usage for these projects.")],
        group_by: Annotated[Optional[List[StrictStr]], Field(description="Group the usage data by the specified fields. Support fields include `project_id`.")],
        limit: Annotated[Optional[StrictInt], Field(description="Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 ")],
        page: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.")],
    ) -> UsageResponse:
        ...


    async def usage_completions(
        self,
        start_time: Annotated[StrictInt, Field(description="Start time (Unix seconds) of the query time range, inclusive.")],
        end_time: Annotated[Optional[StrictInt], Field(description="End time (Unix seconds) of the query time range, exclusive.")],
        bucket_width: Annotated[Optional[StrictStr], Field(description="Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.")],
        project_ids: Annotated[Optional[List[StrictStr]], Field(description="Return only usage for these projects.")],
        user_ids: Annotated[Optional[List[StrictStr]], Field(description="Return only usage for these users.")],
        api_key_ids: Annotated[Optional[List[StrictStr]], Field(description="Return only usage for these API keys.")],
        models: Annotated[Optional[List[StrictStr]], Field(description="Return only usage for these models.")],
        batch: Annotated[Optional[StrictBool], Field(description="If `true`, return batch jobs only. If `false`, return non-batch jobs only. By default, return both. ")],
        group_by: Annotated[Optional[List[StrictStr]], Field(description="Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `batch` or any combination of them.")],
        limit: Annotated[Optional[StrictInt], Field(description="Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 ")],
        page: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.")],
    ) -> UsageResponse:
        ...


    async def usage_embeddings(
        self,
        start_time: Annotated[StrictInt, Field(description="Start time (Unix seconds) of the query time range, inclusive.")],
        end_time: Annotated[Optional[StrictInt], Field(description="End time (Unix seconds) of the query time range, exclusive.")],
        bucket_width: Annotated[Optional[StrictStr], Field(description="Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.")],
        project_ids: Annotated[Optional[List[StrictStr]], Field(description="Return only usage for these projects.")],
        user_ids: Annotated[Optional[List[StrictStr]], Field(description="Return only usage for these users.")],
        api_key_ids: Annotated[Optional[List[StrictStr]], Field(description="Return only usage for these API keys.")],
        models: Annotated[Optional[List[StrictStr]], Field(description="Return only usage for these models.")],
        group_by: Annotated[Optional[List[StrictStr]], Field(description="Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.")],
        limit: Annotated[Optional[StrictInt], Field(description="Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 ")],
        page: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.")],
    ) -> UsageResponse:
        ...


    async def usage_images(
        self,
        start_time: Annotated[StrictInt, Field(description="Start time (Unix seconds) of the query time range, inclusive.")],
        end_time: Annotated[Optional[StrictInt], Field(description="End time (Unix seconds) of the query time range, exclusive.")],
        bucket_width: Annotated[Optional[StrictStr], Field(description="Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.")],
        sources: Annotated[Optional[List[StrictStr]], Field(description="Return only usages for these sources. Possible values are `image.generation`, `image.edit`, `image.variation` or any combination of them.")],
        sizes: Annotated[Optional[List[StrictStr]], Field(description="Return only usages for these image sizes. Possible values are `256x256`, `512x512`, `1024x1024`, `1792x1792`, `1024x1792` or any combination of them.")],
        project_ids: Annotated[Optional[List[StrictStr]], Field(description="Return only usage for these projects.")],
        user_ids: Annotated[Optional[List[StrictStr]], Field(description="Return only usage for these users.")],
        api_key_ids: Annotated[Optional[List[StrictStr]], Field(description="Return only usage for these API keys.")],
        models: Annotated[Optional[List[StrictStr]], Field(description="Return only usage for these models.")],
        group_by: Annotated[Optional[List[StrictStr]], Field(description="Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `size`, `source` or any combination of them.")],
        limit: Annotated[Optional[StrictInt], Field(description="Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 ")],
        page: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.")],
    ) -> UsageResponse:
        ...


    async def usage_moderations(
        self,
        start_time: Annotated[StrictInt, Field(description="Start time (Unix seconds) of the query time range, inclusive.")],
        end_time: Annotated[Optional[StrictInt], Field(description="End time (Unix seconds) of the query time range, exclusive.")],
        bucket_width: Annotated[Optional[StrictStr], Field(description="Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.")],
        project_ids: Annotated[Optional[List[StrictStr]], Field(description="Return only usage for these projects.")],
        user_ids: Annotated[Optional[List[StrictStr]], Field(description="Return only usage for these users.")],
        api_key_ids: Annotated[Optional[List[StrictStr]], Field(description="Return only usage for these API keys.")],
        models: Annotated[Optional[List[StrictStr]], Field(description="Return only usage for these models.")],
        group_by: Annotated[Optional[List[StrictStr]], Field(description="Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.")],
        limit: Annotated[Optional[StrictInt], Field(description="Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 ")],
        page: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.")],
    ) -> UsageResponse:
        ...


    async def usage_vector_stores(
        self,
        start_time: Annotated[StrictInt, Field(description="Start time (Unix seconds) of the query time range, inclusive.")],
        end_time: Annotated[Optional[StrictInt], Field(description="End time (Unix seconds) of the query time range, exclusive.")],
        bucket_width: Annotated[Optional[StrictStr], Field(description="Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.")],
        project_ids: Annotated[Optional[List[StrictStr]], Field(description="Return only usage for these projects.")],
        group_by: Annotated[Optional[List[StrictStr]], Field(description="Group the usage data by the specified fields. Support fields include `project_id`.")],
        limit: Annotated[Optional[StrictInt], Field(description="Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 ")],
        page: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.")],
    ) -> UsageResponse:
        ...
