package org.openapitools.api.factories;

import org.openapitools.api.ChatApiService;
import org.openapitools.api.impl.ChatApiServiceImpl;

public class ChatApiServiceFactory {
    private static final ChatApiService service = new ChatApiServiceImpl();

    public static ChatApiService getChatApi() {
        return service;
    }
}
