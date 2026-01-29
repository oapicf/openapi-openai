package controllers;

import apimodels.CreateEmbeddingRequest;
import apimodels.CreateEmbeddingResponse;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T10:45:05.350526304Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class EmbeddingsApiControllerImp extends EmbeddingsApiControllerImpInterface {
    @Override
    public CreateEmbeddingResponse createEmbedding(Http.Request request, CreateEmbeddingRequest createEmbeddingRequest) throws Exception {
        //Do your magic!!!
        return new CreateEmbeddingResponse();
    }

}
