package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ChatCompletionMessageToolCall;
import org.openapitools.model.ChatCompletionRequestAssistantMessage;
import org.openapitools.model.ChatCompletionRequestAssistantMessageAudio;
import org.openapitools.model.ChatCompletionRequestAssistantMessageFunctionCall;
import org.openapitools.model.ChatCompletionRequestDeveloperMessage;
import org.openapitools.model.ChatCompletionRequestFunctionMessage;
import org.openapitools.model.ChatCompletionRequestSystemMessage;
import org.openapitools.model.ChatCompletionRequestToolMessage;
import org.openapitools.model.ChatCompletionRequestUserMessage;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public interface ChatCompletionRequestMessage {
}
