# usage_api

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**UsageAudioSpeeches**](usage_api.md#UsageAudioSpeeches) | **GET** /organization/usage/audio_speeches | Get audio speeches usage details for the organization.
[**UsageAudioTranscriptions**](usage_api.md#UsageAudioTranscriptions) | **GET** /organization/usage/audio_transcriptions | Get audio transcriptions usage details for the organization.
[**UsageCodeInterpreterSessions**](usage_api.md#UsageCodeInterpreterSessions) | **GET** /organization/usage/code_interpreter_sessions | Get code interpreter sessions usage details for the organization.
[**UsageCompletions**](usage_api.md#UsageCompletions) | **GET** /organization/usage/completions | Get completions usage details for the organization.
[**UsageCosts**](usage_api.md#UsageCosts) | **GET** /organization/costs | Get costs details for the organization.
[**UsageEmbeddings**](usage_api.md#UsageEmbeddings) | **GET** /organization/usage/embeddings | Get embeddings usage details for the organization.
[**UsageImages**](usage_api.md#UsageImages) | **GET** /organization/usage/images | Get images usage details for the organization.
[**UsageModerations**](usage_api.md#UsageModerations) | **GET** /organization/usage/moderations | Get moderations usage details for the organization.
[**UsageVectorStores**](usage_api.md#UsageVectorStores) | **GET** /organization/usage/vector_stores | Get vector stores usage details for the organization.


<a name="UsageAudioSpeeches"></a>
# **UsageAudioSpeeches**
> UsageResponse UsageAudioSpeeches(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page)

Get audio speeches usage details for the organization.
<a name="UsageAudioTranscriptions"></a>
# **UsageAudioTranscriptions**
> UsageResponse UsageAudioTranscriptions(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page)

Get audio transcriptions usage details for the organization.
<a name="UsageCodeInterpreterSessions"></a>
# **UsageCodeInterpreterSessions**
> UsageResponse UsageCodeInterpreterSessions(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page)

Get code interpreter sessions usage details for the organization.
<a name="UsageCompletions"></a>
# **UsageCompletions**
> UsageResponse UsageCompletions(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, batch, groupBy, limit, page)

Get completions usage details for the organization.
<a name="UsageCosts"></a>
# **UsageCosts**
> UsageResponse UsageCosts(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page)

Get costs details for the organization.
<a name="UsageEmbeddings"></a>
# **UsageEmbeddings**
> UsageResponse UsageEmbeddings(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page)

Get embeddings usage details for the organization.
<a name="UsageImages"></a>
# **UsageImages**
> UsageResponse UsageImages(startTime, endTime, bucketWidth, sources, sizes, projectIds, userIds, apiKeyIds, models, groupBy, limit, page)

Get images usage details for the organization.
<a name="UsageModerations"></a>
# **UsageModerations**
> UsageResponse UsageModerations(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page)

Get moderations usage details for the organization.
<a name="UsageVectorStores"></a>
# **UsageVectorStores**
> UsageResponse UsageVectorStores(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page)

Get vector stores usage details for the organization.
