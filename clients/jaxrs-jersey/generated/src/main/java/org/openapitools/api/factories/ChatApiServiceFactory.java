package org.openapitools.api.factories;

import org.openapitools.api.ChatApiService;
import org.openapitools.api.impl.ChatApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-08-26T05:16:07.346796379Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ChatApiServiceFactory {
    private static final ChatApiService service = new ChatApiServiceImpl();

    public static ChatApiService getChatApi() {
        return service;
    }
}
