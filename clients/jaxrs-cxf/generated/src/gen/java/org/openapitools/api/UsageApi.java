package org.openapitools.api;

import org.openapitools.model.UsageResponse;

import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * OpenAI API
 *
 * <p>The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 */
@Path("/organization")
@Api(value = "/", description = "")
public interface UsageApi  {

    /**
     * Get audio speeches usage details for the organization.
     *
     */
    @GET
    @Path("/usage/audio_speeches")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get audio speeches usage details for the organization.", tags={ "Usage" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Usage data retrieved successfully.", response = UsageResponse.class) })
    public UsageResponse usageAudioSpeeches(@QueryParam("start_time") @NotNull Integer startTime, @QueryParam("end_time") Integer endTime, @QueryParam("bucket_width") @DefaultValue("1d")String bucketWidth, @QueryParam("project_ids") List<String> projectIds, @QueryParam("user_ids") List<String> userIds, @QueryParam("api_key_ids") List<String> apiKeyIds, @QueryParam("models") List<String> models, @QueryParam("group_by") List<String> groupBy, @QueryParam("limit") Integer limit, @QueryParam("page") String page);

    /**
     * Get audio transcriptions usage details for the organization.
     *
     */
    @GET
    @Path("/usage/audio_transcriptions")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get audio transcriptions usage details for the organization.", tags={ "Usage" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Usage data retrieved successfully.", response = UsageResponse.class) })
    public UsageResponse usageAudioTranscriptions(@QueryParam("start_time") @NotNull Integer startTime, @QueryParam("end_time") Integer endTime, @QueryParam("bucket_width") @DefaultValue("1d")String bucketWidth, @QueryParam("project_ids") List<String> projectIds, @QueryParam("user_ids") List<String> userIds, @QueryParam("api_key_ids") List<String> apiKeyIds, @QueryParam("models") List<String> models, @QueryParam("group_by") List<String> groupBy, @QueryParam("limit") Integer limit, @QueryParam("page") String page);

    /**
     * Get code interpreter sessions usage details for the organization.
     *
     */
    @GET
    @Path("/usage/code_interpreter_sessions")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get code interpreter sessions usage details for the organization.", tags={ "Usage" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Usage data retrieved successfully.", response = UsageResponse.class) })
    public UsageResponse usageCodeInterpreterSessions(@QueryParam("start_time") @NotNull Integer startTime, @QueryParam("end_time") Integer endTime, @QueryParam("bucket_width") @DefaultValue("1d")String bucketWidth, @QueryParam("project_ids") List<String> projectIds, @QueryParam("group_by") List<String> groupBy, @QueryParam("limit") Integer limit, @QueryParam("page") String page);

    /**
     * Get completions usage details for the organization.
     *
     */
    @GET
    @Path("/usage/completions")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get completions usage details for the organization.", tags={ "Usage" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Usage data retrieved successfully.", response = UsageResponse.class) })
    public UsageResponse usageCompletions(@QueryParam("start_time") @NotNull Integer startTime, @QueryParam("end_time") Integer endTime, @QueryParam("bucket_width") @DefaultValue("1d")String bucketWidth, @QueryParam("project_ids") List<String> projectIds, @QueryParam("user_ids") List<String> userIds, @QueryParam("api_key_ids") List<String> apiKeyIds, @QueryParam("models") List<String> models, @QueryParam("batch") Boolean batch, @QueryParam("group_by") List<String> groupBy, @QueryParam("limit") Integer limit, @QueryParam("page") String page);

    /**
     * Get costs details for the organization.
     *
     */
    @GET
    @Path("/costs")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get costs details for the organization.", tags={ "Usage" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Costs data retrieved successfully.", response = UsageResponse.class) })
    public UsageResponse usageCosts(@QueryParam("start_time") @NotNull Integer startTime, @QueryParam("end_time") Integer endTime, @QueryParam("bucket_width") @DefaultValue("1d")String bucketWidth, @QueryParam("project_ids") List<String> projectIds, @QueryParam("group_by") List<String> groupBy, @QueryParam("limit") @DefaultValue("7")Integer limit, @QueryParam("page") String page);

    /**
     * Get embeddings usage details for the organization.
     *
     */
    @GET
    @Path("/usage/embeddings")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get embeddings usage details for the organization.", tags={ "Usage" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Usage data retrieved successfully.", response = UsageResponse.class) })
    public UsageResponse usageEmbeddings(@QueryParam("start_time") @NotNull Integer startTime, @QueryParam("end_time") Integer endTime, @QueryParam("bucket_width") @DefaultValue("1d")String bucketWidth, @QueryParam("project_ids") List<String> projectIds, @QueryParam("user_ids") List<String> userIds, @QueryParam("api_key_ids") List<String> apiKeyIds, @QueryParam("models") List<String> models, @QueryParam("group_by") List<String> groupBy, @QueryParam("limit") Integer limit, @QueryParam("page") String page);

    /**
     * Get images usage details for the organization.
     *
     */
    @GET
    @Path("/usage/images")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get images usage details for the organization.", tags={ "Usage" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Usage data retrieved successfully.", response = UsageResponse.class) })
    public UsageResponse usageImages(@QueryParam("start_time") @NotNull Integer startTime, @QueryParam("end_time") Integer endTime, @QueryParam("bucket_width") @DefaultValue("1d")String bucketWidth, @QueryParam("sources") List<String> sources, @QueryParam("sizes") List<String> sizes, @QueryParam("project_ids") List<String> projectIds, @QueryParam("user_ids") List<String> userIds, @QueryParam("api_key_ids") List<String> apiKeyIds, @QueryParam("models") List<String> models, @QueryParam("group_by") List<String> groupBy, @QueryParam("limit") Integer limit, @QueryParam("page") String page);

    /**
     * Get moderations usage details for the organization.
     *
     */
    @GET
    @Path("/usage/moderations")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get moderations usage details for the organization.", tags={ "Usage" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Usage data retrieved successfully.", response = UsageResponse.class) })
    public UsageResponse usageModerations(@QueryParam("start_time") @NotNull Integer startTime, @QueryParam("end_time") Integer endTime, @QueryParam("bucket_width") @DefaultValue("1d")String bucketWidth, @QueryParam("project_ids") List<String> projectIds, @QueryParam("user_ids") List<String> userIds, @QueryParam("api_key_ids") List<String> apiKeyIds, @QueryParam("models") List<String> models, @QueryParam("group_by") List<String> groupBy, @QueryParam("limit") Integer limit, @QueryParam("page") String page);

    /**
     * Get vector stores usage details for the organization.
     *
     */
    @GET
    @Path("/usage/vector_stores")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get vector stores usage details for the organization.", tags={ "Usage" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Usage data retrieved successfully.", response = UsageResponse.class) })
    public UsageResponse usageVectorStores(@QueryParam("start_time") @NotNull Integer startTime, @QueryParam("end_time") Integer endTime, @QueryParam("bucket_width") @DefaultValue("1d")String bucketWidth, @QueryParam("project_ids") List<String> projectIds, @QueryParam("group_by") List<String> groupBy, @QueryParam("limit") Integer limit, @QueryParam("page") String page);
}
