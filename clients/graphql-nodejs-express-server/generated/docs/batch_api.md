# batch_api

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CancelBatch**](batch_api.md#CancelBatch) | **POST** /batches/{batch_id}/cancel | Cancels an in-progress batch. The batch will be in status &#x60;cancelling&#x60; for up to 10 minutes, before changing to &#x60;cancelled&#x60;, where it will have partial results (if any) available in the output file.
[**CreateBatch**](batch_api.md#CreateBatch) | **POST** /batches | Creates and executes a batch from an uploaded file of requests
[**ListBatches**](batch_api.md#ListBatches) | **GET** /batches | List your organization&#39;s batches.
[**RetrieveBatch**](batch_api.md#RetrieveBatch) | **GET** /batches/{batch_id} | Retrieves a batch.


<a name="CancelBatch"></a>
# **CancelBatch**
> Batch CancelBatch(batchId)

Cancels an in-progress batch. The batch will be in status &#x60;cancelling&#x60; for up to 10 minutes, before changing to &#x60;cancelled&#x60;, where it will have partial results (if any) available in the output file.
<a name="CreateBatch"></a>
# **CreateBatch**
> Batch CreateBatch(createBatchRequest)

Creates and executes a batch from an uploaded file of requests
<a name="ListBatches"></a>
# **ListBatches**
> ListBatchesResponse ListBatches(after, limit)

List your organization&#39;s batches.
<a name="RetrieveBatch"></a>
# **RetrieveBatch**
> Batch RetrieveBatch(batchId)

Retrieves a batch.
