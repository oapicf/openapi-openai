# openapi::RealtimeSessionCreateResponseClientSecret

Ephemeral key returned by the API.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **character** | Ephemeral key usable in client environments to authenticate connections to the Realtime API. Use this in client-side environments rather than a standard API token, which should only be used server-side.  | [optional] 
**expires_at** | **integer** | Timestamp for when the token expires. Currently, all tokens expire after one minute.  | [optional] 


