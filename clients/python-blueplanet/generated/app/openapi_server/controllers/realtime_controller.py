import connexion

from app.openapi_server.models.realtime_session_create_request import RealtimeSessionCreateRequest  # noqa: E501
from app.openapi_server.models.realtime_session_create_response import RealtimeSessionCreateResponse  # noqa: E501
from openapi_server import util


def create_realtime_session(body):  # noqa: E501
    """Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the &#x60;session.update&#x60; client event.  It responds with a session object, plus a &#x60;client_secret&#x60; key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 

     # noqa: E501

    :param body: Create an ephemeral API key with the given session configuration.
    :type body: dict | bytes

    :rtype: RealtimeSessionCreateResponse
    """
    if connexion.request.is_json:
        body = RealtimeSessionCreateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
