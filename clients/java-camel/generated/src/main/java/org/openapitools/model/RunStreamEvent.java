package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.RunObject;
import org.openapitools.model.RunStreamEventOneOf;
import org.openapitools.model.RunStreamEventOneOf1;
import org.openapitools.model.RunStreamEventOneOf2;
import org.openapitools.model.RunStreamEventOneOf3;
import org.openapitools.model.RunStreamEventOneOf4;
import org.openapitools.model.RunStreamEventOneOf5;
import org.openapitools.model.RunStreamEventOneOf6;
import org.openapitools.model.RunStreamEventOneOf7;
import org.openapitools.model.RunStreamEventOneOf8;
import org.openapitools.model.RunStreamEventOneOf9;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-26T05:15:54.509838742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public interface RunStreamEvent extends AssistantStreamEvent {
}
