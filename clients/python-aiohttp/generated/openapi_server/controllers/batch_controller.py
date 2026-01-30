from typing import List, Dict
from aiohttp import web

from openapi_server.models.batch import Batch
from openapi_server.models.create_batch_request import CreateBatchRequest
from openapi_server.models.list_batches_response import ListBatchesResponse
from openapi_server import util


async def cancel_batch(request: web.Request, batch_id) -> web.Response:
    """Cancels an in-progress batch. The batch will be in status &#x60;cancelling&#x60; for up to 10 minutes, before changing to &#x60;cancelled&#x60;, where it will have partial results (if any) available in the output file.

    

    :param batch_id: The ID of the batch to cancel.
    :type batch_id: str

    """
    return web.Response(status=200)


async def create_batch(request: web.Request, body) -> web.Response:
    """Creates and executes a batch from an uploaded file of requests

    

    :param body: 
    :type body: dict | bytes

    """
    body = CreateBatchRequest.from_dict(body)
    return web.Response(status=200)


async def list_batches(request: web.Request, after=None, limit=None) -> web.Response:
    """List your organization&#39;s batches.

    

    :param after: A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
    :type after: str
    :param limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    :type limit: int

    """
    return web.Response(status=200)


async def retrieve_batch(request: web.Request, batch_id) -> web.Response:
    """Retrieves a batch.

    

    :param batch_id: The ID of the batch to retrieve.
    :type batch_id: str

    """
    return web.Response(status=200)
