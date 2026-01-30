# RealtimeSessionCreateResponseClientSecret

Ephemeral key returned by the API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **str** | Ephemeral key usable in client environments to authenticate connections to the Realtime API. Use this in client-side environments rather than a standard API token, which should only be used server-side.  | [optional] 
**expires_at** | **int** | Timestamp for when the token expires. Currently, all tokens expire after one minute.  | [optional] 

## Example

```python
from openapiopenai.models.realtime_session_create_response_client_secret import RealtimeSessionCreateResponseClientSecret

# TODO update the JSON string below
json = "{}"
# create an instance of RealtimeSessionCreateResponseClientSecret from a JSON string
realtime_session_create_response_client_secret_instance = RealtimeSessionCreateResponseClientSecret.from_json(json)
# print the JSON string representation of the object
print(RealtimeSessionCreateResponseClientSecret.to_json())

# convert the object into a dict
realtime_session_create_response_client_secret_dict = realtime_session_create_response_client_secret_instance.to_dict()
# create an instance of RealtimeSessionCreateResponseClientSecret from a dict
realtime_session_create_response_client_secret_from_dict = RealtimeSessionCreateResponseClientSecret.from_dict(realtime_session_create_response_client_secret_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


