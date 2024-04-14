import com.google.inject.AbstractModule;

import controllers.*;
import openapitools.SecurityAPIUtils;

public class Module extends AbstractModule {

    @Override
    protected void configure() {
        bind(AssistantsApiControllerImpInterface.class).to(AssistantsApiControllerImp.class);
        bind(AudioApiControllerImpInterface.class).to(AudioApiControllerImp.class);
        bind(ChatApiControllerImpInterface.class).to(ChatApiControllerImp.class);
        bind(CompletionsApiControllerImpInterface.class).to(CompletionsApiControllerImp.class);
        bind(EmbeddingsApiControllerImpInterface.class).to(EmbeddingsApiControllerImp.class);
        bind(FilesApiControllerImpInterface.class).to(FilesApiControllerImp.class);
        bind(FineTuningApiControllerImpInterface.class).to(FineTuningApiControllerImp.class);
        bind(ImagesApiControllerImpInterface.class).to(ImagesApiControllerImp.class);
        bind(ModelsApiControllerImpInterface.class).to(ModelsApiControllerImp.class);
        bind(ModerationsApiControllerImpInterface.class).to(ModerationsApiControllerImp.class);
        bind(SecurityAPIUtils.class);
    }
}