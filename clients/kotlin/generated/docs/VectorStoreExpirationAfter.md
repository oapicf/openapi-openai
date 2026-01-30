
# VectorStoreExpirationAfter

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **anchor** | [**inline**](#Anchor) | Anchor timestamp after which the expiration policy applies. Supported anchors: &#x60;last_active_at&#x60;. |  |
| **days** | **kotlin.Int** | The number of days after the anchor time that the vector store will expire. |  |


<a id="Anchor"></a>
## Enum: anchor
| Name | Value |
| ---- | ----- |
| anchor | last_active_at |



