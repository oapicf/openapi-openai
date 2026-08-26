

# VectorStoreExpirationAfter

The expiration policy for a vector store.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**anchor** | [**Anchor**](#Anchor) | Anchor timestamp after which the expiration policy applies. Supported anchors: &#x60;last_active_at&#x60;. | 
**days** | **Int** | The number of days after the anchor time that the vector store will expire. | 


## Enum: Anchor
Allowed values: [last_active_at]




