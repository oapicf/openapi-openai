/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get audio speeches usage details for the organization.
*
* startUnderscoretime Integer Start time (Unix seconds) of the query time range, inclusive.
* endUnderscoretime Integer End time (Unix seconds) of the query time range, exclusive. (optional)
* bucketUnderscorewidth String Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional)
* projectUnderscoreids List Return only usage for these projects. (optional)
* userUnderscoreids List Return only usage for these users. (optional)
* apiUnderscorekeyUnderscoreids List Return only usage for these API keys. (optional)
* models List Return only usage for these models. (optional)
* groupUnderscoreby List Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them. (optional)
* limit Integer Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional)
* page String A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)
* returns UsageResponse
* */
const usageAudioSpeeches = ({ startUnderscoretime, endUnderscoretime, bucketUnderscorewidth, projectUnderscoreids, userUnderscoreids, apiUnderscorekeyUnderscoreids, models, groupUnderscoreby, limit, page }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        startUnderscoretime,
        endUnderscoretime,
        bucketUnderscorewidth,
        projectUnderscoreids,
        userUnderscoreids,
        apiUnderscorekeyUnderscoreids,
        models,
        groupUnderscoreby,
        limit,
        page,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get audio transcriptions usage details for the organization.
*
* startUnderscoretime Integer Start time (Unix seconds) of the query time range, inclusive.
* endUnderscoretime Integer End time (Unix seconds) of the query time range, exclusive. (optional)
* bucketUnderscorewidth String Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional)
* projectUnderscoreids List Return only usage for these projects. (optional)
* userUnderscoreids List Return only usage for these users. (optional)
* apiUnderscorekeyUnderscoreids List Return only usage for these API keys. (optional)
* models List Return only usage for these models. (optional)
* groupUnderscoreby List Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them. (optional)
* limit Integer Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional)
* page String A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)
* returns UsageResponse
* */
const usageAudioTranscriptions = ({ startUnderscoretime, endUnderscoretime, bucketUnderscorewidth, projectUnderscoreids, userUnderscoreids, apiUnderscorekeyUnderscoreids, models, groupUnderscoreby, limit, page }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        startUnderscoretime,
        endUnderscoretime,
        bucketUnderscorewidth,
        projectUnderscoreids,
        userUnderscoreids,
        apiUnderscorekeyUnderscoreids,
        models,
        groupUnderscoreby,
        limit,
        page,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get code interpreter sessions usage details for the organization.
*
* startUnderscoretime Integer Start time (Unix seconds) of the query time range, inclusive.
* endUnderscoretime Integer End time (Unix seconds) of the query time range, exclusive. (optional)
* bucketUnderscorewidth String Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional)
* projectUnderscoreids List Return only usage for these projects. (optional)
* groupUnderscoreby List Group the usage data by the specified fields. Support fields include `project_id`. (optional)
* limit Integer Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional)
* page String A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)
* returns UsageResponse
* */
const usageCodeInterpreterSessions = ({ startUnderscoretime, endUnderscoretime, bucketUnderscorewidth, projectUnderscoreids, groupUnderscoreby, limit, page }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        startUnderscoretime,
        endUnderscoretime,
        bucketUnderscorewidth,
        projectUnderscoreids,
        groupUnderscoreby,
        limit,
        page,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get completions usage details for the organization.
*
* startUnderscoretime Integer Start time (Unix seconds) of the query time range, inclusive.
* endUnderscoretime Integer End time (Unix seconds) of the query time range, exclusive. (optional)
* bucketUnderscorewidth String Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional)
* projectUnderscoreids List Return only usage for these projects. (optional)
* userUnderscoreids List Return only usage for these users. (optional)
* apiUnderscorekeyUnderscoreids List Return only usage for these API keys. (optional)
* models List Return only usage for these models. (optional)
* batch Boolean If `true`, return batch jobs only. If `false`, return non-batch jobs only. By default, return both.  (optional)
* groupUnderscoreby List Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `batch` or any combination of them. (optional)
* limit Integer Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional)
* page String A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)
* returns UsageResponse
* */
const usageCompletions = ({ startUnderscoretime, endUnderscoretime, bucketUnderscorewidth, projectUnderscoreids, userUnderscoreids, apiUnderscorekeyUnderscoreids, models, batch, groupUnderscoreby, limit, page }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        startUnderscoretime,
        endUnderscoretime,
        bucketUnderscorewidth,
        projectUnderscoreids,
        userUnderscoreids,
        apiUnderscorekeyUnderscoreids,
        models,
        batch,
        groupUnderscoreby,
        limit,
        page,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get costs details for the organization.
*
* startUnderscoretime Integer Start time (Unix seconds) of the query time range, inclusive.
* endUnderscoretime Integer End time (Unix seconds) of the query time range, exclusive. (optional)
* bucketUnderscorewidth String Width of each time bucket in response. Currently only `1d` is supported, default to `1d`. (optional)
* projectUnderscoreids List Return only costs for these projects. (optional)
* groupUnderscoreby List Group the costs by the specified fields. Support fields include `project_id`, `line_item` and any combination of them. (optional)
* limit Integer A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7.  (optional)
* page String A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)
* returns UsageResponse
* */
const usageCosts = ({ startUnderscoretime, endUnderscoretime, bucketUnderscorewidth, projectUnderscoreids, groupUnderscoreby, limit, page }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        startUnderscoretime,
        endUnderscoretime,
        bucketUnderscorewidth,
        projectUnderscoreids,
        groupUnderscoreby,
        limit,
        page,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get embeddings usage details for the organization.
*
* startUnderscoretime Integer Start time (Unix seconds) of the query time range, inclusive.
* endUnderscoretime Integer End time (Unix seconds) of the query time range, exclusive. (optional)
* bucketUnderscorewidth String Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional)
* projectUnderscoreids List Return only usage for these projects. (optional)
* userUnderscoreids List Return only usage for these users. (optional)
* apiUnderscorekeyUnderscoreids List Return only usage for these API keys. (optional)
* models List Return only usage for these models. (optional)
* groupUnderscoreby List Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them. (optional)
* limit Integer Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional)
* page String A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)
* returns UsageResponse
* */
const usageEmbeddings = ({ startUnderscoretime, endUnderscoretime, bucketUnderscorewidth, projectUnderscoreids, userUnderscoreids, apiUnderscorekeyUnderscoreids, models, groupUnderscoreby, limit, page }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        startUnderscoretime,
        endUnderscoretime,
        bucketUnderscorewidth,
        projectUnderscoreids,
        userUnderscoreids,
        apiUnderscorekeyUnderscoreids,
        models,
        groupUnderscoreby,
        limit,
        page,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get images usage details for the organization.
*
* startUnderscoretime Integer Start time (Unix seconds) of the query time range, inclusive.
* endUnderscoretime Integer End time (Unix seconds) of the query time range, exclusive. (optional)
* bucketUnderscorewidth String Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional)
* sources List Return only usages for these sources. Possible values are `image.generation`, `image.edit`, `image.variation` or any combination of them. (optional)
* sizes List Return only usages for these image sizes. Possible values are `256x256`, `512x512`, `1024x1024`, `1792x1792`, `1024x1792` or any combination of them. (optional)
* projectUnderscoreids List Return only usage for these projects. (optional)
* userUnderscoreids List Return only usage for these users. (optional)
* apiUnderscorekeyUnderscoreids List Return only usage for these API keys. (optional)
* models List Return only usage for these models. (optional)
* groupUnderscoreby List Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `size`, `source` or any combination of them. (optional)
* limit Integer Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional)
* page String A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)
* returns UsageResponse
* */
const usageImages = ({ startUnderscoretime, endUnderscoretime, bucketUnderscorewidth, sources, sizes, projectUnderscoreids, userUnderscoreids, apiUnderscorekeyUnderscoreids, models, groupUnderscoreby, limit, page }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        startUnderscoretime,
        endUnderscoretime,
        bucketUnderscorewidth,
        sources,
        sizes,
        projectUnderscoreids,
        userUnderscoreids,
        apiUnderscorekeyUnderscoreids,
        models,
        groupUnderscoreby,
        limit,
        page,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get moderations usage details for the organization.
*
* startUnderscoretime Integer Start time (Unix seconds) of the query time range, inclusive.
* endUnderscoretime Integer End time (Unix seconds) of the query time range, exclusive. (optional)
* bucketUnderscorewidth String Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional)
* projectUnderscoreids List Return only usage for these projects. (optional)
* userUnderscoreids List Return only usage for these users. (optional)
* apiUnderscorekeyUnderscoreids List Return only usage for these API keys. (optional)
* models List Return only usage for these models. (optional)
* groupUnderscoreby List Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them. (optional)
* limit Integer Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional)
* page String A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)
* returns UsageResponse
* */
const usageModerations = ({ startUnderscoretime, endUnderscoretime, bucketUnderscorewidth, projectUnderscoreids, userUnderscoreids, apiUnderscorekeyUnderscoreids, models, groupUnderscoreby, limit, page }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        startUnderscoretime,
        endUnderscoretime,
        bucketUnderscorewidth,
        projectUnderscoreids,
        userUnderscoreids,
        apiUnderscorekeyUnderscoreids,
        models,
        groupUnderscoreby,
        limit,
        page,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get vector stores usage details for the organization.
*
* startUnderscoretime Integer Start time (Unix seconds) of the query time range, inclusive.
* endUnderscoretime Integer End time (Unix seconds) of the query time range, exclusive. (optional)
* bucketUnderscorewidth String Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional)
* projectUnderscoreids List Return only usage for these projects. (optional)
* groupUnderscoreby List Group the usage data by the specified fields. Support fields include `project_id`. (optional)
* limit Integer Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional)
* page String A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)
* returns UsageResponse
* */
const usageVectorStores = ({ startUnderscoretime, endUnderscoretime, bucketUnderscorewidth, projectUnderscoreids, groupUnderscoreby, limit, page }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        startUnderscoretime,
        endUnderscoretime,
        bucketUnderscorewidth,
        projectUnderscoreids,
        groupUnderscoreby,
        limit,
        page,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);

module.exports = {
  usageAudioSpeeches,
  usageAudioTranscriptions,
  usageCodeInterpreterSessions,
  usageCompletions,
  usageCosts,
  usageEmbeddings,
  usageImages,
  usageModerations,
  usageVectorStores,
};
