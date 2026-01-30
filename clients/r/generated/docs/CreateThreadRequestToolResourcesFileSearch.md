# openapi::CreateThreadRequestToolResourcesFileSearch


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**vector_store_ids** | **array[character]** | The [vector store](/docs/api-reference/vector-stores/object) attached to this thread. There can be a maximum of 1 vector store attached to the thread.  | [optional] [Max. items: 1] 
**vector_stores** | [**array[CreateThreadRequestToolResourcesFileSearchVectorStoresInner]**](CreateThreadRequest_tool_resources_file_search_vector_stores_inner.md) | A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this thread. There can be a maximum of 1 vector store attached to the thread.  | [optional] [Max. items: 1] 


