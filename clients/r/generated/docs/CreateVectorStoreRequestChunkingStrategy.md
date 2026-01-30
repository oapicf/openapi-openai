# openapi::CreateVectorStoreRequestChunkingStrategy

The chunking strategy used to chunk the file(s). If not set, will use the `auto` strategy. Only applicable if `file_ids` is non-empty.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **character** | Always &#x60;auto&#x60;. | [Enum: [auto, static]] 
**static** | [**StaticChunkingStrategy**](StaticChunkingStrategy.md) |  | 


