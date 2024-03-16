package org.openapitools.api;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import java.util.Set;
import java.util.HashSet;

import org.openapitools.api.impl.AudioApiServiceImpl;
import org.openapitools.api.impl.ChatApiServiceImpl;
import org.openapitools.api.impl.CompletionsApiServiceImpl;
import org.openapitools.api.impl.EditsApiServiceImpl;
import org.openapitools.api.impl.EmbeddingsApiServiceImpl;
import org.openapitools.api.impl.FilesApiServiceImpl;
import org.openapitools.api.impl.FineTunesApiServiceImpl;
import org.openapitools.api.impl.ImagesApiServiceImpl;
import org.openapitools.api.impl.ModelsApiServiceImpl;
import org.openapitools.api.impl.ModerationsApiServiceImpl;

@ApplicationPath("/v1")
public class RestApplication extends Application {


    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<Class<?>>();
        resources.add(AudioApiServiceImpl.class);
        resources.add(ChatApiServiceImpl.class);
        resources.add(CompletionsApiServiceImpl.class);
        resources.add(EditsApiServiceImpl.class);
        resources.add(EmbeddingsApiServiceImpl.class);
        resources.add(FilesApiServiceImpl.class);
        resources.add(FineTunesApiServiceImpl.class);
        resources.add(ImagesApiServiceImpl.class);
        resources.add(ModelsApiServiceImpl.class);
        resources.add(ModerationsApiServiceImpl.class);

        return resources;
    }




}