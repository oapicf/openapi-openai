package controllers;

import apimodels.CreateModerationRequest;
import apimodels.CreateModerationResponse;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-03T11:07:27.411323426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ModerationsApiControllerImp extends ModerationsApiControllerImpInterface {
    @Override
    public CreateModerationResponse createModeration(Http.Request request, CreateModerationRequest createModerationRequest) throws Exception {
        //Do your magic!!!
        return new CreateModerationResponse();
    }

}
