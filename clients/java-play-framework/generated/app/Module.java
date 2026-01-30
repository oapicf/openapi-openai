import com.google.inject.AbstractModule;

import controllers.*;
import openapitools.SecurityAPIUtils;

public class Module extends AbstractModule {

    @Override
    protected void configure() {
        bind(AssistantsApiControllerImpInterface.class).to(AssistantsApiControllerImp.class);
        bind(AudioApiControllerImpInterface.class).to(AudioApiControllerImp.class);
        bind(AuditLogsApiControllerImpInterface.class).to(AuditLogsApiControllerImp.class);
        bind(BatchApiControllerImpInterface.class).to(BatchApiControllerImp.class);
        bind(ChatApiControllerImpInterface.class).to(ChatApiControllerImp.class);
        bind(CompletionsApiControllerImpInterface.class).to(CompletionsApiControllerImp.class);
        bind(DefaultApiControllerImpInterface.class).to(DefaultApiControllerImp.class);
        bind(EmbeddingsApiControllerImpInterface.class).to(EmbeddingsApiControllerImp.class);
        bind(FilesApiControllerImpInterface.class).to(FilesApiControllerImp.class);
        bind(FineTuningApiControllerImpInterface.class).to(FineTuningApiControllerImp.class);
        bind(ImagesApiControllerImpInterface.class).to(ImagesApiControllerImp.class);
        bind(InvitesApiControllerImpInterface.class).to(InvitesApiControllerImp.class);
        bind(ModelsApiControllerImpInterface.class).to(ModelsApiControllerImp.class);
        bind(ModerationsApiControllerImpInterface.class).to(ModerationsApiControllerImp.class);
        bind(ProjectsApiControllerImpInterface.class).to(ProjectsApiControllerImp.class);
        bind(RealtimeApiControllerImpInterface.class).to(RealtimeApiControllerImp.class);
        bind(UploadsApiControllerImpInterface.class).to(UploadsApiControllerImp.class);
        bind(UsageApiControllerImpInterface.class).to(UsageApiControllerImp.class);
        bind(UsersApiControllerImpInterface.class).to(UsersApiControllerImp.class);
        bind(VectorStoresApiControllerImpInterface.class).to(VectorStoresApiControllerImp.class);
        bind(SecurityAPIUtils.class);
    }
}