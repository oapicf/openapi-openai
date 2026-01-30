

# CreateVectorStoreRequestChunkingStrategy

The chunking strategy used to chunk the file(s). If not set, will use the `auto` strategy. Only applicable if `file_ids` is non-empty.

The class is defined in **[CreateVectorStoreRequestChunkingStrategy.java](../../src/main/java/org/openapitools/model/CreateVectorStoreRequestChunkingStrategy.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | Always &#x60;auto&#x60;. | 
**_static** | [`StaticChunkingStrategy`](StaticChunkingStrategy.md) |  | 

## TypeEnum

Name | Value
---- | -----
AUTO | `"auto"`
STATIC | `"static"`



