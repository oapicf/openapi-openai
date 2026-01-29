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
import org.springframework.lang.Nullable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T10:48:36.973220935Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public interface RunStreamEvent extends AssistantStreamEvent {
}
