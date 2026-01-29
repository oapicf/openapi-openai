package controllers;

import apimodels.CreateChatCompletionRequest;
import apimodels.CreateChatCompletionResponse;

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
public class ChatApiControllerImp extends ChatApiControllerImpInterface {
    @Override
    public CreateChatCompletionResponse createChatCompletion(Http.Request request, CreateChatCompletionRequest createChatCompletionRequest) throws Exception {
        //Do your magic!!!
        return new CreateChatCompletionResponse();
    }

}
