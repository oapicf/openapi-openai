package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.MessageObject;
import org.openapitools.model.MessageStreamEventOneOf;
import org.openapitools.model.MessageStreamEventOneOf1;
import org.openapitools.model.MessageStreamEventOneOf2;
import org.openapitools.model.MessageStreamEventOneOf3;
import org.openapitools.model.MessageStreamEventOneOf4;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-14T13:54:16.789070334Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public interface MessageStreamEvent extends AssistantStreamEvent {
}
