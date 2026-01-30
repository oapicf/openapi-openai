# openapi::VectorStoreExpirationAfter

The expiration policy for a vector store.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**anchor** | **character** | Anchor timestamp after which the expiration policy applies. Supported anchors: &#x60;last_active_at&#x60;. | [Enum: [last_active_at]] 
**days** | **integer** | The number of days after the anchor time that the vector store will expire. | [Max: 365] [Min: 1] 


