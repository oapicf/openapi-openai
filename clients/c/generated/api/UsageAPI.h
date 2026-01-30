#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/usage_response.h"

// Enum BUCKETWIDTH for UsageAPI_usageAudioSpeeches
typedef enum  { openai_api_usageAudioSpeeches_BUCKETWIDTH_NULL = 0, openai_api_usageAudioSpeeches_BUCKETWIDTH__1m, openai_api_usageAudioSpeeches_BUCKETWIDTH__1h, openai_api_usageAudioSpeeches_BUCKETWIDTH__1d } openai_api_usageAudioSpeeches_bucket_width_e;

// Enum GROUPBY for UsageAPI_usageAudioSpeeches
typedef enum  { openai_api_usageAudioSpeeches_GROUPBY_NULL = 0, openai_api_usageAudioSpeeches_GROUPBY_project_id, openai_api_usageAudioSpeeches_GROUPBY_user_id, openai_api_usageAudioSpeeches_GROUPBY_api_key_id, openai_api_usageAudioSpeeches_GROUPBY_model } openai_api_usageAudioSpeeches_group_by_e;

// Enum BUCKETWIDTH for UsageAPI_usageAudioTranscriptions
typedef enum  { openai_api_usageAudioTranscriptions_BUCKETWIDTH_NULL = 0, openai_api_usageAudioTranscriptions_BUCKETWIDTH__1m, openai_api_usageAudioTranscriptions_BUCKETWIDTH__1h, openai_api_usageAudioTranscriptions_BUCKETWIDTH__1d } openai_api_usageAudioTranscriptions_bucket_width_e;

// Enum GROUPBY for UsageAPI_usageAudioTranscriptions
typedef enum  { openai_api_usageAudioTranscriptions_GROUPBY_NULL = 0, openai_api_usageAudioTranscriptions_GROUPBY_project_id, openai_api_usageAudioTranscriptions_GROUPBY_user_id, openai_api_usageAudioTranscriptions_GROUPBY_api_key_id, openai_api_usageAudioTranscriptions_GROUPBY_model } openai_api_usageAudioTranscriptions_group_by_e;

// Enum BUCKETWIDTH for UsageAPI_usageCodeInterpreterSessions
typedef enum  { openai_api_usageCodeInterpreterSessions_BUCKETWIDTH_NULL = 0, openai_api_usageCodeInterpreterSessions_BUCKETWIDTH__1m, openai_api_usageCodeInterpreterSessions_BUCKETWIDTH__1h, openai_api_usageCodeInterpreterSessions_BUCKETWIDTH__1d } openai_api_usageCodeInterpreterSessions_bucket_width_e;

// Enum GROUPBY for UsageAPI_usageCodeInterpreterSessions
typedef enum  { openai_api_usageCodeInterpreterSessions_GROUPBY_NULL = 0, openai_api_usageCodeInterpreterSessions_GROUPBY_project_id } openai_api_usageCodeInterpreterSessions_group_by_e;

// Enum BUCKETWIDTH for UsageAPI_usageCompletions
typedef enum  { openai_api_usageCompletions_BUCKETWIDTH_NULL = 0, openai_api_usageCompletions_BUCKETWIDTH__1m, openai_api_usageCompletions_BUCKETWIDTH__1h, openai_api_usageCompletions_BUCKETWIDTH__1d } openai_api_usageCompletions_bucket_width_e;

// Enum GROUPBY for UsageAPI_usageCompletions
typedef enum  { openai_api_usageCompletions_GROUPBY_NULL = 0, openai_api_usageCompletions_GROUPBY_project_id, openai_api_usageCompletions_GROUPBY_user_id, openai_api_usageCompletions_GROUPBY_api_key_id, openai_api_usageCompletions_GROUPBY_model, openai_api_usageCompletions_GROUPBY_batch } openai_api_usageCompletions_group_by_e;

// Enum BUCKETWIDTH for UsageAPI_usageCosts
typedef enum  { openai_api_usageCosts_BUCKETWIDTH_NULL = 0, openai_api_usageCosts_BUCKETWIDTH__1d } openai_api_usageCosts_bucket_width_e;

// Enum GROUPBY for UsageAPI_usageCosts
typedef enum  { openai_api_usageCosts_GROUPBY_NULL = 0, openai_api_usageCosts_GROUPBY_project_id, openai_api_usageCosts_GROUPBY_line_item } openai_api_usageCosts_group_by_e;

// Enum BUCKETWIDTH for UsageAPI_usageEmbeddings
typedef enum  { openai_api_usageEmbeddings_BUCKETWIDTH_NULL = 0, openai_api_usageEmbeddings_BUCKETWIDTH__1m, openai_api_usageEmbeddings_BUCKETWIDTH__1h, openai_api_usageEmbeddings_BUCKETWIDTH__1d } openai_api_usageEmbeddings_bucket_width_e;

// Enum GROUPBY for UsageAPI_usageEmbeddings
typedef enum  { openai_api_usageEmbeddings_GROUPBY_NULL = 0, openai_api_usageEmbeddings_GROUPBY_project_id, openai_api_usageEmbeddings_GROUPBY_user_id, openai_api_usageEmbeddings_GROUPBY_api_key_id, openai_api_usageEmbeddings_GROUPBY_model } openai_api_usageEmbeddings_group_by_e;

// Enum BUCKETWIDTH for UsageAPI_usageImages
typedef enum  { openai_api_usageImages_BUCKETWIDTH_NULL = 0, openai_api_usageImages_BUCKETWIDTH__1m, openai_api_usageImages_BUCKETWIDTH__1h, openai_api_usageImages_BUCKETWIDTH__1d } openai_api_usageImages_bucket_width_e;

// Enum SOURCES for UsageAPI_usageImages
typedef enum  { openai_api_usageImages_SOURCES_NULL = 0, openai_api_usageImages_SOURCES_image.generation, openai_api_usageImages_SOURCES_image.edit, openai_api_usageImages_SOURCES_image.variation } openai_api_usageImages_sources_e;

// Enum SIZES for UsageAPI_usageImages
typedef enum  { openai_api_usageImages_SIZES_NULL = 0, openai_api_usageImages_SIZES__256x256, openai_api_usageImages_SIZES__512x512, openai_api_usageImages_SIZES__1024x1024, openai_api_usageImages_SIZES__1792x1792, openai_api_usageImages_SIZES__1024x1792 } openai_api_usageImages_sizes_e;

// Enum GROUPBY for UsageAPI_usageImages
typedef enum  { openai_api_usageImages_GROUPBY_NULL = 0, openai_api_usageImages_GROUPBY_project_id, openai_api_usageImages_GROUPBY_user_id, openai_api_usageImages_GROUPBY_api_key_id, openai_api_usageImages_GROUPBY_model, openai_api_usageImages_GROUPBY_size, openai_api_usageImages_GROUPBY_source } openai_api_usageImages_group_by_e;

// Enum BUCKETWIDTH for UsageAPI_usageModerations
typedef enum  { openai_api_usageModerations_BUCKETWIDTH_NULL = 0, openai_api_usageModerations_BUCKETWIDTH__1m, openai_api_usageModerations_BUCKETWIDTH__1h, openai_api_usageModerations_BUCKETWIDTH__1d } openai_api_usageModerations_bucket_width_e;

// Enum GROUPBY for UsageAPI_usageModerations
typedef enum  { openai_api_usageModerations_GROUPBY_NULL = 0, openai_api_usageModerations_GROUPBY_project_id, openai_api_usageModerations_GROUPBY_user_id, openai_api_usageModerations_GROUPBY_api_key_id, openai_api_usageModerations_GROUPBY_model } openai_api_usageModerations_group_by_e;

// Enum BUCKETWIDTH for UsageAPI_usageVectorStores
typedef enum  { openai_api_usageVectorStores_BUCKETWIDTH_NULL = 0, openai_api_usageVectorStores_BUCKETWIDTH__1m, openai_api_usageVectorStores_BUCKETWIDTH__1h, openai_api_usageVectorStores_BUCKETWIDTH__1d } openai_api_usageVectorStores_bucket_width_e;

// Enum GROUPBY for UsageAPI_usageVectorStores
typedef enum  { openai_api_usageVectorStores_GROUPBY_NULL = 0, openai_api_usageVectorStores_GROUPBY_project_id } openai_api_usageVectorStores_group_by_e;


// Get audio speeches usage details for the organization.
//
usage_response_t*
UsageAPI_usageAudioSpeeches(apiClient_t *apiClient, int *start_time, int *end_time, openai_api_usageAudioSpeeches_bucket_width_e bucket_width, list_t *project_ids, list_t *user_ids, list_t *api_key_ids, list_t *models, list_t *group_by, int *limit, char *page);


// Get audio transcriptions usage details for the organization.
//
usage_response_t*
UsageAPI_usageAudioTranscriptions(apiClient_t *apiClient, int *start_time, int *end_time, openai_api_usageAudioTranscriptions_bucket_width_e bucket_width, list_t *project_ids, list_t *user_ids, list_t *api_key_ids, list_t *models, list_t *group_by, int *limit, char *page);


// Get code interpreter sessions usage details for the organization.
//
usage_response_t*
UsageAPI_usageCodeInterpreterSessions(apiClient_t *apiClient, int *start_time, int *end_time, openai_api_usageCodeInterpreterSessions_bucket_width_e bucket_width, list_t *project_ids, list_t *group_by, int *limit, char *page);


// Get completions usage details for the organization.
//
usage_response_t*
UsageAPI_usageCompletions(apiClient_t *apiClient, int *start_time, int *end_time, openai_api_usageCompletions_bucket_width_e bucket_width, list_t *project_ids, list_t *user_ids, list_t *api_key_ids, list_t *models, int *batch, list_t *group_by, int *limit, char *page);


// Get costs details for the organization.
//
usage_response_t*
UsageAPI_usageCosts(apiClient_t *apiClient, int *start_time, int *end_time, openai_api_usageCosts_bucket_width_e bucket_width, list_t *project_ids, list_t *group_by, int *limit, char *page);


// Get embeddings usage details for the organization.
//
usage_response_t*
UsageAPI_usageEmbeddings(apiClient_t *apiClient, int *start_time, int *end_time, openai_api_usageEmbeddings_bucket_width_e bucket_width, list_t *project_ids, list_t *user_ids, list_t *api_key_ids, list_t *models, list_t *group_by, int *limit, char *page);


// Get images usage details for the organization.
//
usage_response_t*
UsageAPI_usageImages(apiClient_t *apiClient, int *start_time, int *end_time, openai_api_usageImages_bucket_width_e bucket_width, list_t *sources, list_t *sizes, list_t *project_ids, list_t *user_ids, list_t *api_key_ids, list_t *models, list_t *group_by, int *limit, char *page);


// Get moderations usage details for the organization.
//
usage_response_t*
UsageAPI_usageModerations(apiClient_t *apiClient, int *start_time, int *end_time, openai_api_usageModerations_bucket_width_e bucket_width, list_t *project_ids, list_t *user_ids, list_t *api_key_ids, list_t *models, list_t *group_by, int *limit, char *page);


// Get vector stores usage details for the organization.
//
usage_response_t*
UsageAPI_usageVectorStores(apiClient_t *apiClient, int *start_time, int *end_time, openai_api_usageVectorStores_bucket_width_e bucket_width, list_t *project_ids, list_t *group_by, int *limit, char *page);


