# openapi::CreateAssistantRequestToolResourcesFileSearch


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**vector_store_ids** | **array[character]** | The [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant.  | [optional] [Max. items: 1] 
**vector_stores** | [**array[CreateAssistantRequestToolResourcesFileSearchVectorStoresInner]**](CreateAssistantRequest_tool_resources_file_search_vector_stores_inner.md) | A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this assistant. There can be a maximum of 1 vector store attached to the assistant.  | [optional] [Max. items: 1] 


