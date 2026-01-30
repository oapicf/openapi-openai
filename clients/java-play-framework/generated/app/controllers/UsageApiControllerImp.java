package controllers;

import apimodels.UsageResponse;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class UsageApiControllerImp extends UsageApiControllerImpInterface {
    @Override
    public UsageResponse usageAudioSpeeches(Http.Request request, @NotNull Integer startTime, Integer endTime, String bucketWidth, List<String> projectIds, List<String> userIds, List<String> apiKeyIds, List<String> models, List<String> groupBy, Integer limit, String page) throws Exception {
        //Do your magic!!!
        return new UsageResponse();
    }

    @Override
    public UsageResponse usageAudioTranscriptions(Http.Request request, @NotNull Integer startTime, Integer endTime, String bucketWidth, List<String> projectIds, List<String> userIds, List<String> apiKeyIds, List<String> models, List<String> groupBy, Integer limit, String page) throws Exception {
        //Do your magic!!!
        return new UsageResponse();
    }

    @Override
    public UsageResponse usageCodeInterpreterSessions(Http.Request request, @NotNull Integer startTime, Integer endTime, String bucketWidth, List<String> projectIds, List<String> groupBy, Integer limit, String page) throws Exception {
        //Do your magic!!!
        return new UsageResponse();
    }

    @Override
    public UsageResponse usageCompletions(Http.Request request, @NotNull Integer startTime, Integer endTime, String bucketWidth, List<String> projectIds, List<String> userIds, List<String> apiKeyIds, List<String> models, Boolean batch, List<String> groupBy, Integer limit, String page) throws Exception {
        //Do your magic!!!
        return new UsageResponse();
    }

    @Override
    public UsageResponse usageCosts(Http.Request request, @NotNull Integer startTime, Integer endTime, String bucketWidth, List<String> projectIds, List<String> groupBy, Integer limit, String page) throws Exception {
        //Do your magic!!!
        return new UsageResponse();
    }

    @Override
    public UsageResponse usageEmbeddings(Http.Request request, @NotNull Integer startTime, Integer endTime, String bucketWidth, List<String> projectIds, List<String> userIds, List<String> apiKeyIds, List<String> models, List<String> groupBy, Integer limit, String page) throws Exception {
        //Do your magic!!!
        return new UsageResponse();
    }

    @Override
    public UsageResponse usageImages(Http.Request request, @NotNull Integer startTime, Integer endTime, String bucketWidth, List<String> sources, List<String> sizes, List<String> projectIds, List<String> userIds, List<String> apiKeyIds, List<String> models, List<String> groupBy, Integer limit, String page) throws Exception {
        //Do your magic!!!
        return new UsageResponse();
    }

    @Override
    public UsageResponse usageModerations(Http.Request request, @NotNull Integer startTime, Integer endTime, String bucketWidth, List<String> projectIds, List<String> userIds, List<String> apiKeyIds, List<String> models, List<String> groupBy, Integer limit, String page) throws Exception {
        //Do your magic!!!
        return new UsageResponse();
    }

    @Override
    public UsageResponse usageVectorStores(Http.Request request, @NotNull Integer startTime, Integer endTime, String bucketWidth, List<String> projectIds, List<String> groupBy, Integer limit, String page) throws Exception {
        //Do your magic!!!
        return new UsageResponse();
    }

}
