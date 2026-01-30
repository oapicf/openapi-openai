import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.realtime_session_create_request import RealtimeSessionCreateRequest  # noqa: E501
from openapi_server.models.realtime_session_create_response import RealtimeSessionCreateResponse  # noqa: E501
from openapi_server import util


def create_realtime_session(body):  # noqa: E501
    """Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the &#x60;session.update&#x60; client event.  It responds with a session object, plus a &#x60;client_secret&#x60; key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 

     # noqa: E501

    :param realtime_session_create_request: Create an ephemeral API key with the given session configuration.
    :type realtime_session_create_request: dict | bytes

    :rtype: Union[RealtimeSessionCreateResponse, Tuple[RealtimeSessionCreateResponse, int], Tuple[RealtimeSessionCreateResponse, int, Dict[str, str]]
    """
    realtime_session_create_request = body
    if connexion.request.is_json:
        realtime_session_create_request = RealtimeSessionCreateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
