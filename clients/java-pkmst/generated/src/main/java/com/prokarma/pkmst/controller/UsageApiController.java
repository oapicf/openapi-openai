package com.prokarma.pkmst.controller;

import java.util.List;
import com.prokarma.pkmst.model.UsageResponse;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
/**
 * Api implementation
 * @author pkmst
 *
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@Controller
public class UsageApiController implements UsageApi {
    private final ObjectMapper objectMapper;
@Autowired
    public UsageApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<UsageResponse> usageAudioSpeeches(@ApiParam(value = "Start time (Unix seconds) of the query time range, inclusive.", required = true)  @RequestParam(value = "start_time", required = true) Integer startTime,
        @ApiParam(value = "End time (Unix seconds) of the query time range, exclusive.")  @RequestParam(value = "end_time", required = false) Integer endTime,
        @ApiParam(value = "Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.", allowableValues = "1m, 1h, 1d", defaultValue = "1d")  @RequestParam(value = "bucket_width", required = false, defaultValue="1d") String bucketWidth,
        @ApiParam(value = "Return only usage for these projects.")  @RequestParam(value = "project_ids", required = false) List<String> projectIds,
        @ApiParam(value = "Return only usage for these users.")  @RequestParam(value = "user_ids", required = false) List<String> userIds,
        @ApiParam(value = "Return only usage for these API keys.")  @RequestParam(value = "api_key_ids", required = false) List<String> apiKeyIds,
        @ApiParam(value = "Return only usage for these models.")  @RequestParam(value = "models", required = false) List<String> models,
        @ApiParam(value = "Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.", allowableValues = "project_id, user_id, api_key_id, model")  @RequestParam(value = "group_by", required = false) List<String> groupBy,
        @ApiParam(value = "Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 ")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = "A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.")  @RequestParam(value = "page", required = false) String page,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UsageResponse>(objectMapper.readValue("", UsageResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<UsageResponse>(HttpStatus.OK);
    }

    public ResponseEntity<UsageResponse> usageAudioTranscriptions(@ApiParam(value = "Start time (Unix seconds) of the query time range, inclusive.", required = true)  @RequestParam(value = "start_time", required = true) Integer startTime,
        @ApiParam(value = "End time (Unix seconds) of the query time range, exclusive.")  @RequestParam(value = "end_time", required = false) Integer endTime,
        @ApiParam(value = "Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.", allowableValues = "1m, 1h, 1d", defaultValue = "1d")  @RequestParam(value = "bucket_width", required = false, defaultValue="1d") String bucketWidth,
        @ApiParam(value = "Return only usage for these projects.")  @RequestParam(value = "project_ids", required = false) List<String> projectIds,
        @ApiParam(value = "Return only usage for these users.")  @RequestParam(value = "user_ids", required = false) List<String> userIds,
        @ApiParam(value = "Return only usage for these API keys.")  @RequestParam(value = "api_key_ids", required = false) List<String> apiKeyIds,
        @ApiParam(value = "Return only usage for these models.")  @RequestParam(value = "models", required = false) List<String> models,
        @ApiParam(value = "Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.", allowableValues = "project_id, user_id, api_key_id, model")  @RequestParam(value = "group_by", required = false) List<String> groupBy,
        @ApiParam(value = "Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 ")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = "A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.")  @RequestParam(value = "page", required = false) String page,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UsageResponse>(objectMapper.readValue("", UsageResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<UsageResponse>(HttpStatus.OK);
    }

    public ResponseEntity<UsageResponse> usageCodeInterpreterSessions(@ApiParam(value = "Start time (Unix seconds) of the query time range, inclusive.", required = true)  @RequestParam(value = "start_time", required = true) Integer startTime,
        @ApiParam(value = "End time (Unix seconds) of the query time range, exclusive.")  @RequestParam(value = "end_time", required = false) Integer endTime,
        @ApiParam(value = "Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.", allowableValues = "1m, 1h, 1d", defaultValue = "1d")  @RequestParam(value = "bucket_width", required = false, defaultValue="1d") String bucketWidth,
        @ApiParam(value = "Return only usage for these projects.")  @RequestParam(value = "project_ids", required = false) List<String> projectIds,
        @ApiParam(value = "Group the usage data by the specified fields. Support fields include `project_id`.", allowableValues = "project_id")  @RequestParam(value = "group_by", required = false) List<String> groupBy,
        @ApiParam(value = "Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 ")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = "A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.")  @RequestParam(value = "page", required = false) String page,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UsageResponse>(objectMapper.readValue("", UsageResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<UsageResponse>(HttpStatus.OK);
    }

    public ResponseEntity<UsageResponse> usageCompletions(@ApiParam(value = "Start time (Unix seconds) of the query time range, inclusive.", required = true)  @RequestParam(value = "start_time", required = true) Integer startTime,
        @ApiParam(value = "End time (Unix seconds) of the query time range, exclusive.")  @RequestParam(value = "end_time", required = false) Integer endTime,
        @ApiParam(value = "Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.", allowableValues = "1m, 1h, 1d", defaultValue = "1d")  @RequestParam(value = "bucket_width", required = false, defaultValue="1d") String bucketWidth,
        @ApiParam(value = "Return only usage for these projects.")  @RequestParam(value = "project_ids", required = false) List<String> projectIds,
        @ApiParam(value = "Return only usage for these users.")  @RequestParam(value = "user_ids", required = false) List<String> userIds,
        @ApiParam(value = "Return only usage for these API keys.")  @RequestParam(value = "api_key_ids", required = false) List<String> apiKeyIds,
        @ApiParam(value = "Return only usage for these models.")  @RequestParam(value = "models", required = false) List<String> models,
        @ApiParam(value = "If `true`, return batch jobs only. If `false`, return non-batch jobs only. By default, return both. ")  @RequestParam(value = "batch", required = false) Boolean batch,
        @ApiParam(value = "Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `batch` or any combination of them.", allowableValues = "project_id, user_id, api_key_id, model, batch")  @RequestParam(value = "group_by", required = false) List<String> groupBy,
        @ApiParam(value = "Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 ")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = "A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.")  @RequestParam(value = "page", required = false) String page,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UsageResponse>(objectMapper.readValue("", UsageResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<UsageResponse>(HttpStatus.OK);
    }

    public ResponseEntity<UsageResponse> usageCosts(@ApiParam(value = "Start time (Unix seconds) of the query time range, inclusive.", required = true)  @RequestParam(value = "start_time", required = true) Integer startTime,
        @ApiParam(value = "End time (Unix seconds) of the query time range, exclusive.")  @RequestParam(value = "end_time", required = false) Integer endTime,
        @ApiParam(value = "Width of each time bucket in response. Currently only `1d` is supported, default to `1d`.", allowableValues = "1d", defaultValue = "1d")  @RequestParam(value = "bucket_width", required = false, defaultValue="1d") String bucketWidth,
        @ApiParam(value = "Return only costs for these projects.")  @RequestParam(value = "project_ids", required = false) List<String> projectIds,
        @ApiParam(value = "Group the costs by the specified fields. Support fields include `project_id`, `line_item` and any combination of them.", allowableValues = "project_id, line_item")  @RequestParam(value = "group_by", required = false) List<String> groupBy,
        @ApiParam(value = "A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7. ", defaultValue = "7")  @RequestParam(value = "limit", required = false, defaultValue="7") Integer limit,
        @ApiParam(value = "A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.")  @RequestParam(value = "page", required = false) String page,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UsageResponse>(objectMapper.readValue("", UsageResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<UsageResponse>(HttpStatus.OK);
    }

    public ResponseEntity<UsageResponse> usageEmbeddings(@ApiParam(value = "Start time (Unix seconds) of the query time range, inclusive.", required = true)  @RequestParam(value = "start_time", required = true) Integer startTime,
        @ApiParam(value = "End time (Unix seconds) of the query time range, exclusive.")  @RequestParam(value = "end_time", required = false) Integer endTime,
        @ApiParam(value = "Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.", allowableValues = "1m, 1h, 1d", defaultValue = "1d")  @RequestParam(value = "bucket_width", required = false, defaultValue="1d") String bucketWidth,
        @ApiParam(value = "Return only usage for these projects.")  @RequestParam(value = "project_ids", required = false) List<String> projectIds,
        @ApiParam(value = "Return only usage for these users.")  @RequestParam(value = "user_ids", required = false) List<String> userIds,
        @ApiParam(value = "Return only usage for these API keys.")  @RequestParam(value = "api_key_ids", required = false) List<String> apiKeyIds,
        @ApiParam(value = "Return only usage for these models.")  @RequestParam(value = "models", required = false) List<String> models,
        @ApiParam(value = "Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.", allowableValues = "project_id, user_id, api_key_id, model")  @RequestParam(value = "group_by", required = false) List<String> groupBy,
        @ApiParam(value = "Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 ")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = "A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.")  @RequestParam(value = "page", required = false) String page,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UsageResponse>(objectMapper.readValue("", UsageResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<UsageResponse>(HttpStatus.OK);
    }

    public ResponseEntity<UsageResponse> usageImages(@ApiParam(value = "Start time (Unix seconds) of the query time range, inclusive.", required = true)  @RequestParam(value = "start_time", required = true) Integer startTime,
        @ApiParam(value = "End time (Unix seconds) of the query time range, exclusive.")  @RequestParam(value = "end_time", required = false) Integer endTime,
        @ApiParam(value = "Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.", allowableValues = "1m, 1h, 1d", defaultValue = "1d")  @RequestParam(value = "bucket_width", required = false, defaultValue="1d") String bucketWidth,
        @ApiParam(value = "Return only usages for these sources. Possible values are `image.generation`, `image.edit`, `image.variation` or any combination of them.", allowableValues = "image.generation, image.edit, image.variation")  @RequestParam(value = "sources", required = false) List<String> sources,
        @ApiParam(value = "Return only usages for these image sizes. Possible values are `256x256`, `512x512`, `1024x1024`, `1792x1792`, `1024x1792` or any combination of them.", allowableValues = "256x256, 512x512, 1024x1024, 1792x1792, 1024x1792")  @RequestParam(value = "sizes", required = false) List<String> sizes,
        @ApiParam(value = "Return only usage for these projects.")  @RequestParam(value = "project_ids", required = false) List<String> projectIds,
        @ApiParam(value = "Return only usage for these users.")  @RequestParam(value = "user_ids", required = false) List<String> userIds,
        @ApiParam(value = "Return only usage for these API keys.")  @RequestParam(value = "api_key_ids", required = false) List<String> apiKeyIds,
        @ApiParam(value = "Return only usage for these models.")  @RequestParam(value = "models", required = false) List<String> models,
        @ApiParam(value = "Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `size`, `source` or any combination of them.", allowableValues = "project_id, user_id, api_key_id, model, size, source")  @RequestParam(value = "group_by", required = false) List<String> groupBy,
        @ApiParam(value = "Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 ")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = "A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.")  @RequestParam(value = "page", required = false) String page,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UsageResponse>(objectMapper.readValue("", UsageResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<UsageResponse>(HttpStatus.OK);
    }

    public ResponseEntity<UsageResponse> usageModerations(@ApiParam(value = "Start time (Unix seconds) of the query time range, inclusive.", required = true)  @RequestParam(value = "start_time", required = true) Integer startTime,
        @ApiParam(value = "End time (Unix seconds) of the query time range, exclusive.")  @RequestParam(value = "end_time", required = false) Integer endTime,
        @ApiParam(value = "Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.", allowableValues = "1m, 1h, 1d", defaultValue = "1d")  @RequestParam(value = "bucket_width", required = false, defaultValue="1d") String bucketWidth,
        @ApiParam(value = "Return only usage for these projects.")  @RequestParam(value = "project_ids", required = false) List<String> projectIds,
        @ApiParam(value = "Return only usage for these users.")  @RequestParam(value = "user_ids", required = false) List<String> userIds,
        @ApiParam(value = "Return only usage for these API keys.")  @RequestParam(value = "api_key_ids", required = false) List<String> apiKeyIds,
        @ApiParam(value = "Return only usage for these models.")  @RequestParam(value = "models", required = false) List<String> models,
        @ApiParam(value = "Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.", allowableValues = "project_id, user_id, api_key_id, model")  @RequestParam(value = "group_by", required = false) List<String> groupBy,
        @ApiParam(value = "Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 ")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = "A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.")  @RequestParam(value = "page", required = false) String page,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UsageResponse>(objectMapper.readValue("", UsageResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<UsageResponse>(HttpStatus.OK);
    }

    public ResponseEntity<UsageResponse> usageVectorStores(@ApiParam(value = "Start time (Unix seconds) of the query time range, inclusive.", required = true)  @RequestParam(value = "start_time", required = true) Integer startTime,
        @ApiParam(value = "End time (Unix seconds) of the query time range, exclusive.")  @RequestParam(value = "end_time", required = false) Integer endTime,
        @ApiParam(value = "Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.", allowableValues = "1m, 1h, 1d", defaultValue = "1d")  @RequestParam(value = "bucket_width", required = false, defaultValue="1d") String bucketWidth,
        @ApiParam(value = "Return only usage for these projects.")  @RequestParam(value = "project_ids", required = false) List<String> projectIds,
        @ApiParam(value = "Group the usage data by the specified fields. Support fields include `project_id`.", allowableValues = "project_id")  @RequestParam(value = "group_by", required = false) List<String> groupBy,
        @ApiParam(value = "Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 ")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = "A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.")  @RequestParam(value = "page", required = false) String page,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UsageResponse>(objectMapper.readValue("", UsageResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<UsageResponse>(HttpStatus.OK);
    }

}
