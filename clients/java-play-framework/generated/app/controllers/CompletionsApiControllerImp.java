package controllers;

import apimodels.CreateCompletionRequest;
import apimodels.CreateCompletionResponse;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-04-14T13:39:27.767845477Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CompletionsApiControllerImp extends CompletionsApiControllerImpInterface {
    @Override
    public CreateCompletionResponse createCompletion(Http.Request request, CreateCompletionRequest createCompletionRequest) throws Exception {
        //Do your magic!!!
        return new CreateCompletionResponse();
    }

}
