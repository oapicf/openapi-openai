import com.google.inject.AbstractModule;

import controllers.*;
import openapitools.SecurityAPIUtils;

public class Module extends AbstractModule {

    @Override
    protected void configure() {
        bind(OpenAiApiControllerImpInterface.class).to(OpenAiApiControllerImp.class);
        bind(SecurityAPIUtils.class);
    }
}