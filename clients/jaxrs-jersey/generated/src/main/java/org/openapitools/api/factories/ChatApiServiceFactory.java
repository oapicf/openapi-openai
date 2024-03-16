package org.openapitools.api.factories;

import org.openapitools.api.ChatApiService;
import org.openapitools.api.impl.ChatApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-03-16T01:13:32.134709667Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ChatApiServiceFactory {
    private static final ChatApiService service = new ChatApiServiceImpl();

    public static ChatApiService getChatApi() {
        return service;
    }
}
