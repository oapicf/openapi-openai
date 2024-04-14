package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.RunStepObject;
import org.openapitools.model.RunStepStreamEventOneOf;
import org.openapitools.model.RunStepStreamEventOneOf1;
import org.openapitools.model.RunStepStreamEventOneOf2;
import org.openapitools.model.RunStepStreamEventOneOf3;
import org.openapitools.model.RunStepStreamEventOneOf4;
import org.openapitools.model.RunStepStreamEventOneOf5;
import org.openapitools.model.RunStepStreamEventOneOf6;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-04-14T13:40:33.442815767Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public interface RunStepStreamEvent extends AssistantStreamEvent {
}
