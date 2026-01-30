package controllers;

import apimodels.AdminApiKey;
import apimodels.AdminApiKeysCreateRequest;
import apimodels.AdminApiKeysDelete200Response;
import apimodels.ApiKeyList;

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
public class DefaultApiControllerImp extends DefaultApiControllerImpInterface {
    @Override
    public AdminApiKey adminApiKeysCreate(Http.Request request, AdminApiKeysCreateRequest adminApiKeysCreateRequest) throws Exception {
        //Do your magic!!!
        return new AdminApiKey();
    }

    @Override
    public AdminApiKeysDelete200Response adminApiKeysDelete(Http.Request request, String keyId) throws Exception {
        //Do your magic!!!
        return new AdminApiKeysDelete200Response();
    }

    @Override
    public AdminApiKey adminApiKeysGet(Http.Request request, String keyId) throws Exception {
        //Do your magic!!!
        return new AdminApiKey();
    }

    @Override
    public ApiKeyList adminApiKeysList(Http.Request request, String after, String order, Integer limit) throws Exception {
        //Do your magic!!!
        return new ApiKeyList();
    }

}
