

# VectorStoreExpirationAfter

The expiration policy for a vector store.

The class is defined in **[VectorStoreExpirationAfter.java](../../src/main/java/org/openapitools/model/VectorStoreExpirationAfter.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**anchor** | [**AnchorEnum**](#AnchorEnum) | Anchor timestamp after which the expiration policy applies. Supported anchors: &#x60;last_active_at&#x60;. | 
**days** | `Integer` | The number of days after the anchor time that the vector store will expire. | 

## AnchorEnum

Name | Value
---- | -----
LAST_ACTIVE_AT | `"last_active_at"`



