

# VectorStoreExpirationAfter

The expiration policy for a vector store.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**anchor** | [**AnchorEnum**](#AnchorEnum) | Anchor timestamp after which the expiration policy applies. Supported anchors: &#x60;last_active_at&#x60;. |  |
|**days** | **Integer** | The number of days after the anchor time that the vector store will expire. |  |



## Enum: AnchorEnum

| Name | Value |
|---- | -----|
| LAST_ACTIVE_AT | &quot;last_active_at&quot; |



