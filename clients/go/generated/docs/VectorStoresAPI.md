# \VectorStoresAPI

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CancelVectorStoreFileBatch**](VectorStoresAPI.md#CancelVectorStoreFileBatch) | **Post** /vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel | Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
[**CreateVectorStore**](VectorStoresAPI.md#CreateVectorStore) | **Post** /vector_stores | Create a vector store.
[**CreateVectorStoreFile**](VectorStoresAPI.md#CreateVectorStoreFile) | **Post** /vector_stores/{vector_store_id}/files | Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
[**CreateVectorStoreFileBatch**](VectorStoresAPI.md#CreateVectorStoreFileBatch) | **Post** /vector_stores/{vector_store_id}/file_batches | Create a vector store file batch.
[**DeleteVectorStore**](VectorStoresAPI.md#DeleteVectorStore) | **Delete** /vector_stores/{vector_store_id} | Delete a vector store.
[**DeleteVectorStoreFile**](VectorStoresAPI.md#DeleteVectorStoreFile) | **Delete** /vector_stores/{vector_store_id}/files/{file_id} | Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
[**GetVectorStore**](VectorStoresAPI.md#GetVectorStore) | **Get** /vector_stores/{vector_store_id} | Retrieves a vector store.
[**GetVectorStoreFile**](VectorStoresAPI.md#GetVectorStoreFile) | **Get** /vector_stores/{vector_store_id}/files/{file_id} | Retrieves a vector store file.
[**GetVectorStoreFileBatch**](VectorStoresAPI.md#GetVectorStoreFileBatch) | **Get** /vector_stores/{vector_store_id}/file_batches/{batch_id} | Retrieves a vector store file batch.
[**ListFilesInVectorStoreBatch**](VectorStoresAPI.md#ListFilesInVectorStoreBatch) | **Get** /vector_stores/{vector_store_id}/file_batches/{batch_id}/files | Returns a list of vector store files in a batch.
[**ListVectorStoreFiles**](VectorStoresAPI.md#ListVectorStoreFiles) | **Get** /vector_stores/{vector_store_id}/files | Returns a list of vector store files.
[**ListVectorStores**](VectorStoresAPI.md#ListVectorStores) | **Get** /vector_stores | Returns a list of vector stores.
[**ModifyVectorStore**](VectorStoresAPI.md#ModifyVectorStore) | **Post** /vector_stores/{vector_store_id} | Modifies a vector store.



## CancelVectorStoreFileBatch

> VectorStoreFileBatchObject CancelVectorStoreFileBatch(ctx, vectorStoreId, batchId).Execute()

Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	vectorStoreId := "vectorStoreId_example" // string | The ID of the vector store that the file batch belongs to.
	batchId := "batchId_example" // string | The ID of the file batch to cancel.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.VectorStoresAPI.CancelVectorStoreFileBatch(context.Background(), vectorStoreId, batchId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `VectorStoresAPI.CancelVectorStoreFileBatch``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CancelVectorStoreFileBatch`: VectorStoreFileBatchObject
	fmt.Fprintf(os.Stdout, "Response from `VectorStoresAPI.CancelVectorStoreFileBatch`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**vectorStoreId** | **string** | The ID of the vector store that the file batch belongs to. | 
**batchId** | **string** | The ID of the file batch to cancel. | 

### Other Parameters

Other parameters are passed through a pointer to a apiCancelVectorStoreFileBatchRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**VectorStoreFileBatchObject**](VectorStoreFileBatchObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CreateVectorStore

> VectorStoreObject CreateVectorStore(ctx).CreateVectorStoreRequest(createVectorStoreRequest).Execute()

Create a vector store.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	createVectorStoreRequest := *openapiclient.NewCreateVectorStoreRequest() // CreateVectorStoreRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.VectorStoresAPI.CreateVectorStore(context.Background()).CreateVectorStoreRequest(createVectorStoreRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `VectorStoresAPI.CreateVectorStore``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CreateVectorStore`: VectorStoreObject
	fmt.Fprintf(os.Stdout, "Response from `VectorStoresAPI.CreateVectorStore`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCreateVectorStoreRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createVectorStoreRequest** | [**CreateVectorStoreRequest**](CreateVectorStoreRequest.md) |  | 

### Return type

[**VectorStoreObject**](VectorStoreObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CreateVectorStoreFile

> VectorStoreFileObject CreateVectorStoreFile(ctx, vectorStoreId).CreateVectorStoreFileRequest(createVectorStoreFileRequest).Execute()

Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	vectorStoreId := "vs_abc123" // string | The ID of the vector store for which to create a File. 
	createVectorStoreFileRequest := *openapiclient.NewCreateVectorStoreFileRequest("FileId_example") // CreateVectorStoreFileRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.VectorStoresAPI.CreateVectorStoreFile(context.Background(), vectorStoreId).CreateVectorStoreFileRequest(createVectorStoreFileRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `VectorStoresAPI.CreateVectorStoreFile``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CreateVectorStoreFile`: VectorStoreFileObject
	fmt.Fprintf(os.Stdout, "Response from `VectorStoresAPI.CreateVectorStoreFile`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**vectorStoreId** | **string** | The ID of the vector store for which to create a File.  | 

### Other Parameters

Other parameters are passed through a pointer to a apiCreateVectorStoreFileRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **createVectorStoreFileRequest** | [**CreateVectorStoreFileRequest**](CreateVectorStoreFileRequest.md) |  | 

### Return type

[**VectorStoreFileObject**](VectorStoreFileObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CreateVectorStoreFileBatch

> VectorStoreFileBatchObject CreateVectorStoreFileBatch(ctx, vectorStoreId).CreateVectorStoreFileBatchRequest(createVectorStoreFileBatchRequest).Execute()

Create a vector store file batch.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	vectorStoreId := "vs_abc123" // string | The ID of the vector store for which to create a File Batch. 
	createVectorStoreFileBatchRequest := *openapiclient.NewCreateVectorStoreFileBatchRequest([]string{"FileIds_example"}) // CreateVectorStoreFileBatchRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.VectorStoresAPI.CreateVectorStoreFileBatch(context.Background(), vectorStoreId).CreateVectorStoreFileBatchRequest(createVectorStoreFileBatchRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `VectorStoresAPI.CreateVectorStoreFileBatch``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CreateVectorStoreFileBatch`: VectorStoreFileBatchObject
	fmt.Fprintf(os.Stdout, "Response from `VectorStoresAPI.CreateVectorStoreFileBatch`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**vectorStoreId** | **string** | The ID of the vector store for which to create a File Batch.  | 

### Other Parameters

Other parameters are passed through a pointer to a apiCreateVectorStoreFileBatchRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **createVectorStoreFileBatchRequest** | [**CreateVectorStoreFileBatchRequest**](CreateVectorStoreFileBatchRequest.md) |  | 

### Return type

[**VectorStoreFileBatchObject**](VectorStoreFileBatchObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DeleteVectorStore

> DeleteVectorStoreResponse DeleteVectorStore(ctx, vectorStoreId).Execute()

Delete a vector store.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	vectorStoreId := "vectorStoreId_example" // string | The ID of the vector store to delete.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.VectorStoresAPI.DeleteVectorStore(context.Background(), vectorStoreId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `VectorStoresAPI.DeleteVectorStore``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `DeleteVectorStore`: DeleteVectorStoreResponse
	fmt.Fprintf(os.Stdout, "Response from `VectorStoresAPI.DeleteVectorStore`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**vectorStoreId** | **string** | The ID of the vector store to delete. | 

### Other Parameters

Other parameters are passed through a pointer to a apiDeleteVectorStoreRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**DeleteVectorStoreResponse**](DeleteVectorStoreResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DeleteVectorStoreFile

> DeleteVectorStoreFileResponse DeleteVectorStoreFile(ctx, vectorStoreId, fileId).Execute()

Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	vectorStoreId := "vectorStoreId_example" // string | The ID of the vector store that the file belongs to.
	fileId := "fileId_example" // string | The ID of the file to delete.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.VectorStoresAPI.DeleteVectorStoreFile(context.Background(), vectorStoreId, fileId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `VectorStoresAPI.DeleteVectorStoreFile``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `DeleteVectorStoreFile`: DeleteVectorStoreFileResponse
	fmt.Fprintf(os.Stdout, "Response from `VectorStoresAPI.DeleteVectorStoreFile`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**vectorStoreId** | **string** | The ID of the vector store that the file belongs to. | 
**fileId** | **string** | The ID of the file to delete. | 

### Other Parameters

Other parameters are passed through a pointer to a apiDeleteVectorStoreFileRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**DeleteVectorStoreFileResponse**](DeleteVectorStoreFileResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetVectorStore

> VectorStoreObject GetVectorStore(ctx, vectorStoreId).Execute()

Retrieves a vector store.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	vectorStoreId := "vectorStoreId_example" // string | The ID of the vector store to retrieve.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.VectorStoresAPI.GetVectorStore(context.Background(), vectorStoreId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `VectorStoresAPI.GetVectorStore``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetVectorStore`: VectorStoreObject
	fmt.Fprintf(os.Stdout, "Response from `VectorStoresAPI.GetVectorStore`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**vectorStoreId** | **string** | The ID of the vector store to retrieve. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetVectorStoreRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**VectorStoreObject**](VectorStoreObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetVectorStoreFile

> VectorStoreFileObject GetVectorStoreFile(ctx, vectorStoreId, fileId).Execute()

Retrieves a vector store file.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	vectorStoreId := "vs_abc123" // string | The ID of the vector store that the file belongs to.
	fileId := "file-abc123" // string | The ID of the file being retrieved.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.VectorStoresAPI.GetVectorStoreFile(context.Background(), vectorStoreId, fileId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `VectorStoresAPI.GetVectorStoreFile``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetVectorStoreFile`: VectorStoreFileObject
	fmt.Fprintf(os.Stdout, "Response from `VectorStoresAPI.GetVectorStoreFile`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**vectorStoreId** | **string** | The ID of the vector store that the file belongs to. | 
**fileId** | **string** | The ID of the file being retrieved. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetVectorStoreFileRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**VectorStoreFileObject**](VectorStoreFileObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetVectorStoreFileBatch

> VectorStoreFileBatchObject GetVectorStoreFileBatch(ctx, vectorStoreId, batchId).Execute()

Retrieves a vector store file batch.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	vectorStoreId := "vs_abc123" // string | The ID of the vector store that the file batch belongs to.
	batchId := "vsfb_abc123" // string | The ID of the file batch being retrieved.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.VectorStoresAPI.GetVectorStoreFileBatch(context.Background(), vectorStoreId, batchId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `VectorStoresAPI.GetVectorStoreFileBatch``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetVectorStoreFileBatch`: VectorStoreFileBatchObject
	fmt.Fprintf(os.Stdout, "Response from `VectorStoresAPI.GetVectorStoreFileBatch`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**vectorStoreId** | **string** | The ID of the vector store that the file batch belongs to. | 
**batchId** | **string** | The ID of the file batch being retrieved. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetVectorStoreFileBatchRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**VectorStoreFileBatchObject**](VectorStoreFileBatchObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListFilesInVectorStoreBatch

> ListVectorStoreFilesResponse ListFilesInVectorStoreBatch(ctx, vectorStoreId, batchId).Limit(limit).Order(order).After(after).Before(before).Filter(filter).Execute()

Returns a list of vector store files in a batch.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	vectorStoreId := "vectorStoreId_example" // string | The ID of the vector store that the files belong to.
	batchId := "batchId_example" // string | The ID of the file batch that the files belong to.
	limit := int32(56) // int32 | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to 20)
	order := "order_example" // string | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional) (default to "desc")
	after := "after_example" // string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
	before := "before_example" // string | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)
	filter := "filter_example" // string | Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.VectorStoresAPI.ListFilesInVectorStoreBatch(context.Background(), vectorStoreId, batchId).Limit(limit).Order(order).After(after).Before(before).Filter(filter).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `VectorStoresAPI.ListFilesInVectorStoreBatch``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ListFilesInVectorStoreBatch`: ListVectorStoreFilesResponse
	fmt.Fprintf(os.Stdout, "Response from `VectorStoresAPI.ListFilesInVectorStoreBatch`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**vectorStoreId** | **string** | The ID of the vector store that the files belong to. | 
**batchId** | **string** | The ID of the file batch that the files belong to. | 

### Other Parameters

Other parameters are passed through a pointer to a apiListFilesInVectorStoreBatchRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **limit** | **int32** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [default to 20]
 **order** | **string** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [default to &quot;desc&quot;]
 **after** | **string** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | 
 **before** | **string** | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | 
 **filter** | **string** | Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;. | 

### Return type

[**ListVectorStoreFilesResponse**](ListVectorStoreFilesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListVectorStoreFiles

> ListVectorStoreFilesResponse ListVectorStoreFiles(ctx, vectorStoreId).Limit(limit).Order(order).After(after).Before(before).Filter(filter).Execute()

Returns a list of vector store files.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	vectorStoreId := "vectorStoreId_example" // string | The ID of the vector store that the files belong to.
	limit := int32(56) // int32 | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to 20)
	order := "order_example" // string | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional) (default to "desc")
	after := "after_example" // string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
	before := "before_example" // string | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)
	filter := "filter_example" // string | Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.VectorStoresAPI.ListVectorStoreFiles(context.Background(), vectorStoreId).Limit(limit).Order(order).After(after).Before(before).Filter(filter).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `VectorStoresAPI.ListVectorStoreFiles``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ListVectorStoreFiles`: ListVectorStoreFilesResponse
	fmt.Fprintf(os.Stdout, "Response from `VectorStoresAPI.ListVectorStoreFiles`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**vectorStoreId** | **string** | The ID of the vector store that the files belong to. | 

### Other Parameters

Other parameters are passed through a pointer to a apiListVectorStoreFilesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **limit** | **int32** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [default to 20]
 **order** | **string** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [default to &quot;desc&quot;]
 **after** | **string** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | 
 **before** | **string** | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | 
 **filter** | **string** | Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;. | 

### Return type

[**ListVectorStoreFilesResponse**](ListVectorStoreFilesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListVectorStores

> ListVectorStoresResponse ListVectorStores(ctx).Limit(limit).Order(order).After(after).Before(before).Execute()

Returns a list of vector stores.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	limit := int32(56) // int32 | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to 20)
	order := "order_example" // string | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional) (default to "desc")
	after := "after_example" // string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
	before := "before_example" // string | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.VectorStoresAPI.ListVectorStores(context.Background()).Limit(limit).Order(order).After(after).Before(before).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `VectorStoresAPI.ListVectorStores``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ListVectorStores`: ListVectorStoresResponse
	fmt.Fprintf(os.Stdout, "Response from `VectorStoresAPI.ListVectorStores`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiListVectorStoresRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int32** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [default to 20]
 **order** | **string** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [default to &quot;desc&quot;]
 **after** | **string** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | 
 **before** | **string** | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | 

### Return type

[**ListVectorStoresResponse**](ListVectorStoresResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModifyVectorStore

> VectorStoreObject ModifyVectorStore(ctx, vectorStoreId).UpdateVectorStoreRequest(updateVectorStoreRequest).Execute()

Modifies a vector store.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	vectorStoreId := "vectorStoreId_example" // string | The ID of the vector store to modify.
	updateVectorStoreRequest := *openapiclient.NewUpdateVectorStoreRequest() // UpdateVectorStoreRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.VectorStoresAPI.ModifyVectorStore(context.Background(), vectorStoreId).UpdateVectorStoreRequest(updateVectorStoreRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `VectorStoresAPI.ModifyVectorStore``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModifyVectorStore`: VectorStoreObject
	fmt.Fprintf(os.Stdout, "Response from `VectorStoresAPI.ModifyVectorStore`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**vectorStoreId** | **string** | The ID of the vector store to modify. | 

### Other Parameters

Other parameters are passed through a pointer to a apiModifyVectorStoreRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **updateVectorStoreRequest** | [**UpdateVectorStoreRequest**](UpdateVectorStoreRequest.md) |  | 

### Return type

[**VectorStoreObject**](VectorStoreObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

