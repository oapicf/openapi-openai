package org.openapitools.models

import java.time._

import io.circe.refined._
import io.circe.syntax._
import io.circe.{ Decoder, Encoder }
import io.circe.generic.semiauto.{ deriveDecoder, deriveEncoder }

import eu.timepit.refined.api.Refined
import eu.timepit.refined.boolean.And
import eu.timepit.refined.collection.MaxSize
import eu.timepit.refined.collection.MinSize
import eu.timepit.refined.numeric.GreaterEqual
import eu.timepit.refined.numeric.LessEqual
import java.net.URI

import org.openapitools.models.AudioResponseFormat.AudioResponseFormat
import org.openapitools.models.AuditLogEventType.AuditLogEventType
import org.openapitools.models.ChatCompletionRole.ChatCompletionRole
/**
* 
* @param `object` 
* @param id 
* @param name 
* @param redactedUnderscorevalue 
* @param value 
* @param createdUnderscoreat 
* @param owner 
*/

case class AdminApiKey(
  `object`: Option[String],
  id: Option[String],
  name: Option[String],
  redactedUnderscorevalue: Option[String],
  value: Option[String],
  createdUnderscoreat: Option[Long],
  owner: Option[AdminApiKeyOwner]
)
object AdminApiKey {
  implicit val encoderAdminApiKey: Encoder[AdminApiKey] = deriveEncoder[AdminApiKey].mapJson(_.dropNullValues)
  implicit val decoderAdminApiKey: Decoder[AdminApiKey] = deriveDecoder[AdminApiKey]
}

/**
* 
* @param `type` 
* @param id 
* @param name 
* @param createdUnderscoreat 
* @param role 
*/

case class AdminApiKeyOwner(
  `type`: Option[String],
  id: Option[String],
  name: Option[String],
  createdUnderscoreat: Option[Long],
  role: Option[String]
)
object AdminApiKeyOwner {
  implicit val encoderAdminApiKeyOwner: Encoder[AdminApiKeyOwner] = deriveEncoder[AdminApiKeyOwner].mapJson(_.dropNullValues)
  implicit val decoderAdminApiKeyOwner: Decoder[AdminApiKeyOwner] = deriveDecoder[AdminApiKeyOwner]
}

/**
* 
* @param name 
*/

case class AdminApiKeysCreateRequest(
  name: String
)
object AdminApiKeysCreateRequest {
  implicit val encoderAdminApiKeysCreateRequest: Encoder[AdminApiKeysCreateRequest] = deriveEncoder[AdminApiKeysCreateRequest].mapJson(_.dropNullValues)
  implicit val decoderAdminApiKeysCreateRequest: Decoder[AdminApiKeysCreateRequest] = deriveDecoder[AdminApiKeysCreateRequest]
}

/**
* 
* @param id 
* @param `object` 
* @param deleted 
*/

case class AdminApiKeysDelete200Response(
  id: Option[String],
  `object`: Option[String],
  deleted: Option[Boolean]
)
object AdminApiKeysDelete200Response {
  implicit val encoderAdminApiKeysDelete200Response: Encoder[AdminApiKeysDelete200Response] = deriveEncoder[AdminApiKeysDelete200Response].mapJson(_.dropNullValues)
  implicit val decoderAdminApiKeysDelete200Response: Decoder[AdminApiKeysDelete200Response] = deriveDecoder[AdminApiKeysDelete200Response]
}

/**
* 
* @param `object` 
* @param data 
* @param hasUnderscoremore 
* @param firstUnderscoreid 
* @param lastUnderscoreid 
*/

case class ApiKeyList(
  `object`: Option[String],
  data: Option[List[AdminApiKey]],
  hasUnderscoremore: Option[Boolean],
  firstUnderscoreid: Option[String],
  lastUnderscoreid: Option[String]
)
object ApiKeyList {
  implicit val encoderApiKeyList: Encoder[ApiKeyList] = deriveEncoder[ApiKeyList].mapJson(_.dropNullValues)
  implicit val decoderApiKeyList: Decoder[ApiKeyList] = deriveDecoder[ApiKeyList]
}

/**
* 
* @param `type` Always `image_file`.
* @param imageUnderscorefile 
* @param imageUnderscoreurl 
* @param text Text content to be sent to the model
*/
sealed trait ArrayOfContentPartsInner
object ArrayOfContentPartsInner {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val arrayOfContentPartsInnerEncoder: Encoder[ArrayOfContentPartsInner] = Encoder.instance {
    case messageContentImageFileObject: MessageContentImageFileObject => messageContentImageFileObject.asJson
    case messageContentImageUrlObject: MessageContentImageUrlObject => messageContentImageUrlObject.asJson
    case messageRequestContentTextObject: MessageRequestContentTextObject => messageRequestContentTextObject.asJson
  }

  implicit val arrayOfContentPartsInnerDecoder: Decoder[ArrayOfContentPartsInner] =
    List[Decoder[ArrayOfContentPartsInner]](
      Decoder[MessageContentImageFileObject].widen,
      Decoder[MessageContentImageUrlObject].widen,
      Decoder[MessageRequestContentTextObject].widen,
  ).reduceLeft(_ or _)
}


/**
* 
* @param weight Controls whether the assistant message is trained against (0 or 1)
*/

case class AssistantMessage(
  weight: Option[Int]
)
object AssistantMessage {
  implicit val encoderAssistantMessage: Encoder[AssistantMessage] = deriveEncoder[AssistantMessage].mapJson(_.dropNullValues)
  implicit val decoderAssistantMessage: Decoder[AssistantMessage] = deriveDecoder[AssistantMessage]
}

/**
* Represents an `assistant` that can call the model and use tools.
* @param id The identifier, which can be referenced in API endpoints.
* @param `object` The object type, which is always `assistant`.
* @param createdUnderscoreat The Unix timestamp (in seconds) for when the assistant was created.
* @param name The name of the assistant. The maximum length is 256 characters. 
* @param description The description of the assistant. The maximum length is 512 characters. 
* @param model ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models) for descriptions of them. 
* @param instructions The system instructions that the assistant uses. The maximum length is 256,000 characters. 
* @param tools A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `file_search`, or `function`. 
* @param toolUnderscoreresources 
* @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
* @param temperature What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
* @param topUnderscorep An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. 
* @param responseUnderscoreformat 
*/

case class AssistantObject(
  id: String,
  `object`: String,
  createdUnderscoreat: Int,
  name: Refined[String, MaxSize[256]],
  description: Refined[String, MaxSize[512]],
  model: String,
  instructions: Refined[String, MaxSize[256000]],
  tools: Refined[List[AssistantObjectToolsInner], MaxSize[128]],
  toolUnderscoreresources: Option[AssistantObjectToolResources],
  metadata: Object,
  temperature: Option[Refined[BigDecimal, GreaterEqual[0] And LessEqual[2]]],
  topUnderscorep: Option[Refined[BigDecimal, GreaterEqual[0] And LessEqual[1]]],
  responseUnderscoreformat: Option[AssistantsApiResponseFormatOption]
)
object AssistantObject {
  implicit val encoderAssistantObject: Encoder[AssistantObject] = deriveEncoder[AssistantObject].mapJson(_.dropNullValues)
  implicit val decoderAssistantObject: Decoder[AssistantObject] = deriveDecoder[AssistantObject]
}

/**
* A set of resources that are used by the assistant's tools. The resources are specific to the type of tool. For example, the `code_interpreter` tool requires a list of file IDs, while the `file_search` tool requires a list of vector store IDs. 
* @param codeUnderscoreinterpreter 
* @param fileUnderscoresearch 
*/

case class AssistantObjectToolResources(
  codeUnderscoreinterpreter: Option[AssistantObjectToolResourcesCodeInterpreter],
  fileUnderscoresearch: Option[AssistantObjectToolResourcesFileSearch]
)
object AssistantObjectToolResources {
  implicit val encoderAssistantObjectToolResources: Encoder[AssistantObjectToolResources] = deriveEncoder[AssistantObjectToolResources].mapJson(_.dropNullValues)
  implicit val decoderAssistantObjectToolResources: Decoder[AssistantObjectToolResources] = deriveDecoder[AssistantObjectToolResources]
}

/**
* 
* @param fileUnderscoreids A list of [file](/docs/api-reference/files) IDs made available to the `code_interpreter`` tool. There can be a maximum of 20 files associated with the tool. 
*/

case class AssistantObjectToolResourcesCodeInterpreter(
  fileUnderscoreids: Option[Refined[List[String], MaxSize[20]]]
)
object AssistantObjectToolResourcesCodeInterpreter {
  implicit val encoderAssistantObjectToolResourcesCodeInterpreter: Encoder[AssistantObjectToolResourcesCodeInterpreter] = deriveEncoder[AssistantObjectToolResourcesCodeInterpreter].mapJson(_.dropNullValues)
  implicit val decoderAssistantObjectToolResourcesCodeInterpreter: Decoder[AssistantObjectToolResourcesCodeInterpreter] = deriveDecoder[AssistantObjectToolResourcesCodeInterpreter]
}

/**
* 
* @param vectorUnderscorestoreUnderscoreids The ID of the [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant. 
*/

case class AssistantObjectToolResourcesFileSearch(
  vectorUnderscorestoreUnderscoreids: Option[Refined[List[String], MaxSize[1]]]
)
object AssistantObjectToolResourcesFileSearch {
  implicit val encoderAssistantObjectToolResourcesFileSearch: Encoder[AssistantObjectToolResourcesFileSearch] = deriveEncoder[AssistantObjectToolResourcesFileSearch].mapJson(_.dropNullValues)
  implicit val decoderAssistantObjectToolResourcesFileSearch: Decoder[AssistantObjectToolResourcesFileSearch] = deriveDecoder[AssistantObjectToolResourcesFileSearch]
}

/**
* 
* @param `type` The type of tool being defined: `code_interpreter`
* @param fileUnderscoresearch 
* @param function 
*/
sealed trait AssistantObjectToolsInner
object AssistantObjectToolsInner {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val assistantObjectToolsInnerEncoder: Encoder[AssistantObjectToolsInner] = Encoder.instance {
    case assistantToolsCode: AssistantToolsCode => assistantToolsCode.asJson
    case assistantToolsFileSearch: AssistantToolsFileSearch => assistantToolsFileSearch.asJson
    case assistantToolsFunction: AssistantToolsFunction => assistantToolsFunction.asJson
  }

  implicit val assistantObjectToolsInnerDecoder: Decoder[AssistantObjectToolsInner] =
    List[Decoder[AssistantObjectToolsInner]](
      Decoder[AssistantToolsCode].widen,
      Decoder[AssistantToolsFileSearch].widen,
      Decoder[AssistantToolsFunction].widen,
  ).reduceLeft(_ or _)
}


/**
* Represents an event emitted when streaming a Run.  Each event in a server-sent events stream has an `event` and `data` property:  ``` event: thread.created data: {\"id\": \"thread_123\", \"object\": \"thread\", ...} ```  We emit events whenever a new object is created, transitions to a new state, or is being streamed in parts (deltas). For example, we emit `thread.run.created` when a new run is created, `thread.run.completed` when a run completes, and so on. When an Assistant chooses to create a message during a run, we emit a `thread.message.created event`, a `thread.message.in_progress` event, many `thread.message.delta` events, and finally a `thread.message.completed` event.  We may add additional events over time, so we recommend handling unknown events gracefully in your code. See the [Assistants API quickstart](/docs/assistants/overview) to learn how to integrate the Assistants API with streaming. 
* @param enabled Whether to enable input audio transcription.
* @param event 
* @param data 
*/
sealed trait AssistantStreamEvent
object AssistantStreamEvent {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val assistantStreamEventEncoder: Encoder[AssistantStreamEvent] = Encoder.instance {
    case doneEvent: DoneEvent => doneEvent.asJson
    case errorEvent: ErrorEvent => errorEvent.asJson
    case messageStreamEvent: MessageStreamEvent => messageStreamEvent.asJson
    case runStepStreamEvent: RunStepStreamEvent => runStepStreamEvent.asJson
    case runStreamEvent: RunStreamEvent => runStreamEvent.asJson
    case threadStreamEvent: ThreadStreamEvent => threadStreamEvent.asJson
  }

  implicit val assistantStreamEventDecoder: Decoder[AssistantStreamEvent] =
    List[Decoder[AssistantStreamEvent]](
      Decoder[DoneEvent].widen,
      Decoder[ErrorEvent].widen,
      Decoder[MessageStreamEvent].widen,
      Decoder[RunStepStreamEvent].widen,
      Decoder[RunStreamEvent].widen,
      Decoder[ThreadStreamEvent].widen,
  ).reduceLeft(_ or _)
}


/**
* 
* @param `type` The type of tool being defined: `code_interpreter`
*/

case class AssistantToolsCode(
  `type`: String
) extends AssistantObjectToolsInner with CreateAssistantRequestToolsInner with CreateMessageRequestAttachmentsInnerToolsInner with CreateRunRequestToolsInner with CreateThreadAndRunRequestToolsInner with MessageObjectAttachmentsInnerToolsInner with ModifyAssistantRequestToolsInner with RunObjectToolsInner
object AssistantToolsCode {
  implicit val encoderAssistantToolsCode: Encoder[AssistantToolsCode] = deriveEncoder[AssistantToolsCode].mapJson(_.dropNullValues)
  implicit val decoderAssistantToolsCode: Decoder[AssistantToolsCode] = deriveDecoder[AssistantToolsCode]
}

/**
* 
* @param `type` The type of tool being defined: `file_search`
* @param fileUnderscoresearch 
*/

case class AssistantToolsFileSearch(
  `type`: String,
  fileUnderscoresearch: Option[AssistantToolsFileSearchFileSearch]
) extends AssistantObjectToolsInner with CreateAssistantRequestToolsInner with CreateRunRequestToolsInner with CreateThreadAndRunRequestToolsInner with ModifyAssistantRequestToolsInner with RunObjectToolsInner
object AssistantToolsFileSearch {
  implicit val encoderAssistantToolsFileSearch: Encoder[AssistantToolsFileSearch] = deriveEncoder[AssistantToolsFileSearch].mapJson(_.dropNullValues)
  implicit val decoderAssistantToolsFileSearch: Decoder[AssistantToolsFileSearch] = deriveDecoder[AssistantToolsFileSearch]
}

/**
* Overrides for the file search tool.
* @param maxUnderscorenumUnderscoreresults The maximum number of results the file search tool should output. The default is 20 for `gpt-4*` models and 5 for `gpt-3.5-turbo`. This number should be between 1 and 50 inclusive.  Note that the file search tool may output fewer than `max_num_results` results. See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
* @param rankingUnderscoreoptions 
*/

case class AssistantToolsFileSearchFileSearch(
  maxUnderscorenumUnderscoreresults: Option[Refined[Int, GreaterEqual[1] And LessEqual[50]]],
  rankingUnderscoreoptions: Option[FileSearchRankingOptions]
)
object AssistantToolsFileSearchFileSearch {
  implicit val encoderAssistantToolsFileSearchFileSearch: Encoder[AssistantToolsFileSearchFileSearch] = deriveEncoder[AssistantToolsFileSearchFileSearch].mapJson(_.dropNullValues)
  implicit val decoderAssistantToolsFileSearchFileSearch: Decoder[AssistantToolsFileSearchFileSearch] = deriveDecoder[AssistantToolsFileSearchFileSearch]
}

/**
* 
* @param `type` The type of tool being defined: `file_search`
*/

case class AssistantToolsFileSearchTypeOnly(
  `type`: String
) extends CreateMessageRequestAttachmentsInnerToolsInner with MessageObjectAttachmentsInnerToolsInner
object AssistantToolsFileSearchTypeOnly {
  implicit val encoderAssistantToolsFileSearchTypeOnly: Encoder[AssistantToolsFileSearchTypeOnly] = deriveEncoder[AssistantToolsFileSearchTypeOnly].mapJson(_.dropNullValues)
  implicit val decoderAssistantToolsFileSearchTypeOnly: Decoder[AssistantToolsFileSearchTypeOnly] = deriveDecoder[AssistantToolsFileSearchTypeOnly]
}

/**
* 
* @param `type` The type of tool being defined: `function`
* @param function 
*/

case class AssistantToolsFunction(
  `type`: String,
  function: FunctionObject
) extends AssistantObjectToolsInner with CreateAssistantRequestToolsInner with CreateRunRequestToolsInner with CreateThreadAndRunRequestToolsInner with ModifyAssistantRequestToolsInner with RunObjectToolsInner
object AssistantToolsFunction {
  implicit val encoderAssistantToolsFunction: Encoder[AssistantToolsFunction] = deriveEncoder[AssistantToolsFunction].mapJson(_.dropNullValues)
  implicit val decoderAssistantToolsFunction: Decoder[AssistantToolsFunction] = deriveDecoder[AssistantToolsFunction]
}

/**
* Specifies the format that the model must output. Compatible with [GPT-4o](/docs/models#gpt-4o), [GPT-4 Turbo](/docs/models#gpt-4-turbo-and-gpt-4), and all GPT-3.5 Turbo models since `gpt-3.5-turbo-1106`.  Setting to `{ \"type\": \"json_schema\", \"json_schema\": {...} }` enables Structured Outputs which ensures the model will match your supplied JSON schema. Learn more in the [Structured Outputs guide](/docs/guides/structured-outputs).  Setting to `{ \"type\": \"json_object\" }` enables JSON mode, which ensures the message the model generates is valid JSON.  **Important:** when using JSON mode, you **must** also instruct the model to produce JSON yourself via a system or user message. Without this, the model may generate an unending stream of whitespace until the generation reaches the token limit, resulting in a long-running and seemingly \"stuck\" request. Also note that the message content may be partially cut off if `finish_reason=\"length\"`, which indicates the generation exceeded `max_tokens` or the conversation exceeded the max context length. 
* @param `type` The type of response format being defined: `text`
* @param jsonUnderscoreschema 
*/
sealed trait AssistantsApiResponseFormatOption
object AssistantsApiResponseFormatOption {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val assistantsApiResponseFormatOptionEncoder: Encoder[AssistantsApiResponseFormatOption] = Encoder.instance {
    case responseFormatJsonObject: ResponseFormatJsonObject => responseFormatJsonObject.asJson
    case responseFormatJsonSchema: ResponseFormatJsonSchema => responseFormatJsonSchema.asJson
    case responseFormatText: ResponseFormatText => responseFormatText.asJson
    case string: String => string.asJson
  }

  implicit val assistantsApiResponseFormatOptionDecoder: Decoder[AssistantsApiResponseFormatOption] =
    List[Decoder[AssistantsApiResponseFormatOption]](
      Decoder[ResponseFormatJsonObject].widen,
      Decoder[ResponseFormatJsonSchema].widen,
      Decoder[ResponseFormatText].widen,
      Decoder[String].widen,
  ).reduceLeft(_ or _)
}


/**
* Controls which (if any) tool is called by the model. `none` means the model will not call any tools and instead generates a message. `auto` is the default value and means the model can pick between generating a message or calling one or more tools. `required` means the model must call one or more tools before responding to the user. Specifying a particular tool like `{\"type\": \"file_search\"}` or `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}` forces the model to call that tool. 
* @param `type` The type of the tool. If type is `function`, the function name must be set
* @param function 
*/
sealed trait AssistantsApiToolChoiceOption
object AssistantsApiToolChoiceOption {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val assistantsApiToolChoiceOptionEncoder: Encoder[AssistantsApiToolChoiceOption] = Encoder.instance {
    case assistantsNamedToolChoice: AssistantsNamedToolChoice => assistantsNamedToolChoice.asJson
    case string: String => string.asJson
  }

  implicit val assistantsApiToolChoiceOptionDecoder: Decoder[AssistantsApiToolChoiceOption] =
    List[Decoder[AssistantsApiToolChoiceOption]](
      Decoder[AssistantsNamedToolChoice].widen,
      Decoder[String].widen,
  ).reduceLeft(_ or _)
}


/**
* Specifies a tool the model should use. Use to force the model to call a specific tool.
* @param `type` The type of the tool. If type is `function`, the function name must be set
* @param function 
*/

case class AssistantsNamedToolChoice(
  `type`: String,
  function: Option[AssistantsNamedToolChoiceFunction]
) extends AssistantsApiToolChoiceOption
object AssistantsNamedToolChoice {
  implicit val encoderAssistantsNamedToolChoice: Encoder[AssistantsNamedToolChoice] = deriveEncoder[AssistantsNamedToolChoice].mapJson(_.dropNullValues)
  implicit val decoderAssistantsNamedToolChoice: Decoder[AssistantsNamedToolChoice] = deriveDecoder[AssistantsNamedToolChoice]
}

/**
* 
* @param name The name of the function to call.
*/

case class AssistantsNamedToolChoiceFunction(
  name: String
)
object AssistantsNamedToolChoiceFunction {
  implicit val encoderAssistantsNamedToolChoiceFunction: Encoder[AssistantsNamedToolChoiceFunction] = deriveEncoder[AssistantsNamedToolChoiceFunction].mapJson(_.dropNullValues)
  implicit val decoderAssistantsNamedToolChoiceFunction: Decoder[AssistantsNamedToolChoiceFunction] = deriveDecoder[AssistantsNamedToolChoiceFunction]
}

/**
* The format of the output, in one of these options: `json`, `text`, `srt`, `verbose_json`, or `vtt`. 
*/

object AudioResponseFormat extends Enumeration {
    type AudioResponseFormat = Value
    val json = Value
    val text = Value
    val srt = Value
    val verbose_json = Value
    val vtt = Value
    implicit val decoder: Decoder[AudioResponseFormat.Value] = Decoder.decodeEnumeration(AudioResponseFormat)
    implicit val encoder: Encoder[AudioResponseFormat.Value] = Encoder.encodeEnumeration(AudioResponseFormat)
}

/**
* A log of a user action or configuration change within this organization.
* @param id The ID of this log.
* @param `type` 
* @param effectiveUnderscoreat The Unix timestamp (in seconds) of the event.
* @param project 
* @param actor 
* @param apiUnderscorekeyPeriodcreated 
* @param apiUnderscorekeyPeriodupdated 
* @param apiUnderscorekeyPerioddeleted 
* @param invitePeriodsent 
* @param invitePeriodaccepted 
* @param invitePerioddeleted 
* @param loginPeriodfailed 
* @param logoutPeriodfailed 
* @param organizationPeriodupdated 
* @param projectPeriodcreated 
* @param projectPeriodupdated 
* @param projectPeriodarchived 
* @param rateUnderscorelimitPeriodupdated 
* @param rateUnderscorelimitPerioddeleted 
* @param serviceUnderscoreaccountPeriodcreated 
* @param serviceUnderscoreaccountPeriodupdated 
* @param serviceUnderscoreaccountPerioddeleted 
* @param userPeriodadded 
* @param userPeriodupdated 
* @param userPerioddeleted 
*/

case class AuditLog(
  id: String,
  `type`: AuditLogEventType,
  effectiveUnderscoreat: Int,
  project: Option[AuditLogProject],
  actor: AuditLogActor,
  apiUnderscorekeyPeriodcreated: Option[AuditLogApiKeyCreated],
  apiUnderscorekeyPeriodupdated: Option[AuditLogApiKeyUpdated],
  apiUnderscorekeyPerioddeleted: Option[AuditLogApiKeyDeleted],
  invitePeriodsent: Option[AuditLogInviteSent],
  invitePeriodaccepted: Option[AuditLogInviteAccepted],
  invitePerioddeleted: Option[AuditLogInviteDeleted],
  loginPeriodfailed: Option[AuditLogLoginFailed],
  logoutPeriodfailed: Option[AuditLogLogoutFailed],
  organizationPeriodupdated: Option[AuditLogOrganizationUpdated],
  projectPeriodcreated: Option[AuditLogProjectCreated],
  projectPeriodupdated: Option[AuditLogProjectUpdated],
  projectPeriodarchived: Option[AuditLogProjectArchived],
  rateUnderscorelimitPeriodupdated: Option[AuditLogRateLimitUpdated],
  rateUnderscorelimitPerioddeleted: Option[AuditLogRateLimitDeleted],
  serviceUnderscoreaccountPeriodcreated: Option[AuditLogServiceAccountCreated],
  serviceUnderscoreaccountPeriodupdated: Option[AuditLogServiceAccountUpdated],
  serviceUnderscoreaccountPerioddeleted: Option[AuditLogServiceAccountDeleted],
  userPeriodadded: Option[AuditLogUserAdded],
  userPeriodupdated: Option[AuditLogUserUpdated],
  userPerioddeleted: Option[AuditLogUserDeleted]
)
object AuditLog {
  implicit val encoderAuditLog: Encoder[AuditLog] = deriveEncoder[AuditLog].mapJson(_.dropNullValues)
  implicit val decoderAuditLog: Decoder[AuditLog] = deriveDecoder[AuditLog]
}

/**
* The actor who performed the audit logged action.
* @param `type` The type of actor. Is either `session` or `api_key`.
* @param session 
* @param apiUnderscorekey 
*/

case class AuditLogActor(
  `type`: Option[String],
  session: Option[AuditLogActorSession],
  apiUnderscorekey: Option[AuditLogActorApiKey]
)
object AuditLogActor {
  implicit val encoderAuditLogActor: Encoder[AuditLogActor] = deriveEncoder[AuditLogActor].mapJson(_.dropNullValues)
  implicit val decoderAuditLogActor: Decoder[AuditLogActor] = deriveDecoder[AuditLogActor]
}

/**
* The API Key used to perform the audit logged action.
* @param id The tracking id of the API key.
* @param `type` The type of API key. Can be either `user` or `service_account`.
* @param user 
* @param serviceUnderscoreaccount 
*/

case class AuditLogActorApiKey(
  id: Option[String],
  `type`: Option[String],
  user: Option[AuditLogActorUser],
  serviceUnderscoreaccount: Option[AuditLogActorServiceAccount]
)
object AuditLogActorApiKey {
  implicit val encoderAuditLogActorApiKey: Encoder[AuditLogActorApiKey] = deriveEncoder[AuditLogActorApiKey].mapJson(_.dropNullValues)
  implicit val decoderAuditLogActorApiKey: Decoder[AuditLogActorApiKey] = deriveDecoder[AuditLogActorApiKey]
}

/**
* The service account that performed the audit logged action.
* @param id The service account id.
*/

case class AuditLogActorServiceAccount(
  id: Option[String]
)
object AuditLogActorServiceAccount {
  implicit val encoderAuditLogActorServiceAccount: Encoder[AuditLogActorServiceAccount] = deriveEncoder[AuditLogActorServiceAccount].mapJson(_.dropNullValues)
  implicit val decoderAuditLogActorServiceAccount: Decoder[AuditLogActorServiceAccount] = deriveDecoder[AuditLogActorServiceAccount]
}

/**
* The session in which the audit logged action was performed.
* @param user 
* @param ipUnderscoreaddress The IP address from which the action was performed.
*/

case class AuditLogActorSession(
  user: Option[AuditLogActorUser],
  ipUnderscoreaddress: Option[String]
)
object AuditLogActorSession {
  implicit val encoderAuditLogActorSession: Encoder[AuditLogActorSession] = deriveEncoder[AuditLogActorSession].mapJson(_.dropNullValues)
  implicit val decoderAuditLogActorSession: Decoder[AuditLogActorSession] = deriveDecoder[AuditLogActorSession]
}

/**
* The user who performed the audit logged action.
* @param id The user id.
* @param email The user email.
*/

case class AuditLogActorUser(
  id: Option[String],
  email: Option[String]
)
object AuditLogActorUser {
  implicit val encoderAuditLogActorUser: Encoder[AuditLogActorUser] = deriveEncoder[AuditLogActorUser].mapJson(_.dropNullValues)
  implicit val decoderAuditLogActorUser: Decoder[AuditLogActorUser] = deriveDecoder[AuditLogActorUser]
}

/**
* The details for events with this `type`.
* @param id The tracking ID of the API key.
* @param data 
*/

case class AuditLogApiKeyCreated(
  id: Option[String],
  data: Option[AuditLogApiKeyCreatedData]
)
object AuditLogApiKeyCreated {
  implicit val encoderAuditLogApiKeyCreated: Encoder[AuditLogApiKeyCreated] = deriveEncoder[AuditLogApiKeyCreated].mapJson(_.dropNullValues)
  implicit val decoderAuditLogApiKeyCreated: Decoder[AuditLogApiKeyCreated] = deriveDecoder[AuditLogApiKeyCreated]
}

/**
* The payload used to create the API key.
* @param scopes A list of scopes allowed for the API key, e.g. `[\"api.model.request\"]`
*/

case class AuditLogApiKeyCreatedData(
  scopes: Option[List[String]]
)
object AuditLogApiKeyCreatedData {
  implicit val encoderAuditLogApiKeyCreatedData: Encoder[AuditLogApiKeyCreatedData] = deriveEncoder[AuditLogApiKeyCreatedData].mapJson(_.dropNullValues)
  implicit val decoderAuditLogApiKeyCreatedData: Decoder[AuditLogApiKeyCreatedData] = deriveDecoder[AuditLogApiKeyCreatedData]
}

/**
* The details for events with this `type`.
* @param id The tracking ID of the API key.
*/

case class AuditLogApiKeyDeleted(
  id: Option[String]
)
object AuditLogApiKeyDeleted {
  implicit val encoderAuditLogApiKeyDeleted: Encoder[AuditLogApiKeyDeleted] = deriveEncoder[AuditLogApiKeyDeleted].mapJson(_.dropNullValues)
  implicit val decoderAuditLogApiKeyDeleted: Decoder[AuditLogApiKeyDeleted] = deriveDecoder[AuditLogApiKeyDeleted]
}

/**
* The details for events with this `type`.
* @param id The tracking ID of the API key.
* @param changesUnderscorerequested 
*/

case class AuditLogApiKeyUpdated(
  id: Option[String],
  changesUnderscorerequested: Option[AuditLogApiKeyUpdatedChangesRequested]
)
object AuditLogApiKeyUpdated {
  implicit val encoderAuditLogApiKeyUpdated: Encoder[AuditLogApiKeyUpdated] = deriveEncoder[AuditLogApiKeyUpdated].mapJson(_.dropNullValues)
  implicit val decoderAuditLogApiKeyUpdated: Decoder[AuditLogApiKeyUpdated] = deriveDecoder[AuditLogApiKeyUpdated]
}

/**
* The payload used to update the API key.
* @param scopes A list of scopes allowed for the API key, e.g. `[\"api.model.request\"]`
*/

case class AuditLogApiKeyUpdatedChangesRequested(
  scopes: Option[List[String]]
)
object AuditLogApiKeyUpdatedChangesRequested {
  implicit val encoderAuditLogApiKeyUpdatedChangesRequested: Encoder[AuditLogApiKeyUpdatedChangesRequested] = deriveEncoder[AuditLogApiKeyUpdatedChangesRequested].mapJson(_.dropNullValues)
  implicit val decoderAuditLogApiKeyUpdatedChangesRequested: Decoder[AuditLogApiKeyUpdatedChangesRequested] = deriveDecoder[AuditLogApiKeyUpdatedChangesRequested]
}

/**
* The event type.
*/

object AuditLogEventType extends Enumeration {
    type AuditLogEventType = Value
    val api_key.created = Value
    val api_key.updated = Value
    val api_key.deleted = Value
    val invite.sent = Value
    val invite.accepted = Value
    val invite.deleted = Value
    val login.succeeded = Value
    val login.failed = Value
    val logout.succeeded = Value
    val logout.failed = Value
    val organization.updated = Value
    val project.created = Value
    val project.updated = Value
    val project.archived = Value
    val service_account.created = Value
    val service_account.updated = Value
    val service_account.deleted = Value
    val rate_limit.updated = Value
    val rate_limit.deleted = Value
    val user.added = Value
    val user.updated = Value
    val user.deleted = Value
    implicit val decoder: Decoder[AuditLogEventType.Value] = Decoder.decodeEnumeration(AuditLogEventType)
    implicit val encoder: Encoder[AuditLogEventType.Value] = Encoder.encodeEnumeration(AuditLogEventType)
}

/**
* The details for events with this `type`.
* @param id The ID of the invite.
*/

case class AuditLogInviteAccepted(
  id: Option[String]
)
object AuditLogInviteAccepted {
  implicit val encoderAuditLogInviteAccepted: Encoder[AuditLogInviteAccepted] = deriveEncoder[AuditLogInviteAccepted].mapJson(_.dropNullValues)
  implicit val decoderAuditLogInviteAccepted: Decoder[AuditLogInviteAccepted] = deriveDecoder[AuditLogInviteAccepted]
}

/**
* The details for events with this `type`.
* @param id The ID of the invite.
*/

case class AuditLogInviteDeleted(
  id: Option[String]
)
object AuditLogInviteDeleted {
  implicit val encoderAuditLogInviteDeleted: Encoder[AuditLogInviteDeleted] = deriveEncoder[AuditLogInviteDeleted].mapJson(_.dropNullValues)
  implicit val decoderAuditLogInviteDeleted: Decoder[AuditLogInviteDeleted] = deriveDecoder[AuditLogInviteDeleted]
}

/**
* The details for events with this `type`.
* @param id The ID of the invite.
* @param data 
*/

case class AuditLogInviteSent(
  id: Option[String],
  data: Option[AuditLogInviteSentData]
)
object AuditLogInviteSent {
  implicit val encoderAuditLogInviteSent: Encoder[AuditLogInviteSent] = deriveEncoder[AuditLogInviteSent].mapJson(_.dropNullValues)
  implicit val decoderAuditLogInviteSent: Decoder[AuditLogInviteSent] = deriveDecoder[AuditLogInviteSent]
}

/**
* The payload used to create the invite.
* @param email The email invited to the organization.
* @param role The role the email was invited to be. Is either `owner` or `member`.
*/

case class AuditLogInviteSentData(
  email: Option[String],
  role: Option[String]
)
object AuditLogInviteSentData {
  implicit val encoderAuditLogInviteSentData: Encoder[AuditLogInviteSentData] = deriveEncoder[AuditLogInviteSentData].mapJson(_.dropNullValues)
  implicit val decoderAuditLogInviteSentData: Decoder[AuditLogInviteSentData] = deriveDecoder[AuditLogInviteSentData]
}

/**
* The details for events with this `type`.
* @param errorUnderscorecode The error code of the failure.
* @param errorUnderscoremessage The error message of the failure.
*/

case class AuditLogLoginFailed(
  errorUnderscorecode: Option[String],
  errorUnderscoremessage: Option[String]
)
object AuditLogLoginFailed {
  implicit val encoderAuditLogLoginFailed: Encoder[AuditLogLoginFailed] = deriveEncoder[AuditLogLoginFailed].mapJson(_.dropNullValues)
  implicit val decoderAuditLogLoginFailed: Decoder[AuditLogLoginFailed] = deriveDecoder[AuditLogLoginFailed]
}

/**
* The details for events with this `type`.
* @param errorUnderscorecode The error code of the failure.
* @param errorUnderscoremessage The error message of the failure.
*/

case class AuditLogLogoutFailed(
  errorUnderscorecode: Option[String],
  errorUnderscoremessage: Option[String]
)
object AuditLogLogoutFailed {
  implicit val encoderAuditLogLogoutFailed: Encoder[AuditLogLogoutFailed] = deriveEncoder[AuditLogLogoutFailed].mapJson(_.dropNullValues)
  implicit val decoderAuditLogLogoutFailed: Decoder[AuditLogLogoutFailed] = deriveDecoder[AuditLogLogoutFailed]
}

/**
* The details for events with this `type`.
* @param id The organization ID.
* @param changesUnderscorerequested 
*/

case class AuditLogOrganizationUpdated(
  id: Option[String],
  changesUnderscorerequested: Option[AuditLogOrganizationUpdatedChangesRequested]
)
object AuditLogOrganizationUpdated {
  implicit val encoderAuditLogOrganizationUpdated: Encoder[AuditLogOrganizationUpdated] = deriveEncoder[AuditLogOrganizationUpdated].mapJson(_.dropNullValues)
  implicit val decoderAuditLogOrganizationUpdated: Decoder[AuditLogOrganizationUpdated] = deriveDecoder[AuditLogOrganizationUpdated]
}

/**
* The payload used to update the organization settings.
* @param title The organization title.
* @param description The organization description.
* @param name The organization name.
* @param settings 
*/

case class AuditLogOrganizationUpdatedChangesRequested(
  title: Option[String],
  description: Option[String],
  name: Option[String],
  settings: Option[AuditLogOrganizationUpdatedChangesRequestedSettings]
)
object AuditLogOrganizationUpdatedChangesRequested {
  implicit val encoderAuditLogOrganizationUpdatedChangesRequested: Encoder[AuditLogOrganizationUpdatedChangesRequested] = deriveEncoder[AuditLogOrganizationUpdatedChangesRequested].mapJson(_.dropNullValues)
  implicit val decoderAuditLogOrganizationUpdatedChangesRequested: Decoder[AuditLogOrganizationUpdatedChangesRequested] = deriveDecoder[AuditLogOrganizationUpdatedChangesRequested]
}

/**
* 
* @param threadsUnderscoreuiUnderscorevisibility Visibility of the threads page which shows messages created with the Assistants API and Playground. One of `ANY_ROLE`, `OWNERS`, or `NONE`.
* @param usageUnderscoredashboardUnderscorevisibility Visibility of the usage dashboard which shows activity and costs for your organization. One of `ANY_ROLE` or `OWNERS`.
*/

case class AuditLogOrganizationUpdatedChangesRequestedSettings(
  threadsUnderscoreuiUnderscorevisibility: Option[String],
  usageUnderscoredashboardUnderscorevisibility: Option[String]
)
object AuditLogOrganizationUpdatedChangesRequestedSettings {
  implicit val encoderAuditLogOrganizationUpdatedChangesRequestedSettings: Encoder[AuditLogOrganizationUpdatedChangesRequestedSettings] = deriveEncoder[AuditLogOrganizationUpdatedChangesRequestedSettings].mapJson(_.dropNullValues)
  implicit val decoderAuditLogOrganizationUpdatedChangesRequestedSettings: Decoder[AuditLogOrganizationUpdatedChangesRequestedSettings] = deriveDecoder[AuditLogOrganizationUpdatedChangesRequestedSettings]
}

/**
* The project that the action was scoped to. Absent for actions not scoped to projects.
* @param id The project ID.
* @param name The project title.
*/

case class AuditLogProject(
  id: Option[String],
  name: Option[String]
)
object AuditLogProject {
  implicit val encoderAuditLogProject: Encoder[AuditLogProject] = deriveEncoder[AuditLogProject].mapJson(_.dropNullValues)
  implicit val decoderAuditLogProject: Decoder[AuditLogProject] = deriveDecoder[AuditLogProject]
}

/**
* The details for events with this `type`.
* @param id The project ID.
*/

case class AuditLogProjectArchived(
  id: Option[String]
)
object AuditLogProjectArchived {
  implicit val encoderAuditLogProjectArchived: Encoder[AuditLogProjectArchived] = deriveEncoder[AuditLogProjectArchived].mapJson(_.dropNullValues)
  implicit val decoderAuditLogProjectArchived: Decoder[AuditLogProjectArchived] = deriveDecoder[AuditLogProjectArchived]
}

/**
* The details for events with this `type`.
* @param id The project ID.
* @param data 
*/

case class AuditLogProjectCreated(
  id: Option[String],
  data: Option[AuditLogProjectCreatedData]
)
object AuditLogProjectCreated {
  implicit val encoderAuditLogProjectCreated: Encoder[AuditLogProjectCreated] = deriveEncoder[AuditLogProjectCreated].mapJson(_.dropNullValues)
  implicit val decoderAuditLogProjectCreated: Decoder[AuditLogProjectCreated] = deriveDecoder[AuditLogProjectCreated]
}

/**
* The payload used to create the project.
* @param name The project name.
* @param title The title of the project as seen on the dashboard.
*/

case class AuditLogProjectCreatedData(
  name: Option[String],
  title: Option[String]
)
object AuditLogProjectCreatedData {
  implicit val encoderAuditLogProjectCreatedData: Encoder[AuditLogProjectCreatedData] = deriveEncoder[AuditLogProjectCreatedData].mapJson(_.dropNullValues)
  implicit val decoderAuditLogProjectCreatedData: Decoder[AuditLogProjectCreatedData] = deriveDecoder[AuditLogProjectCreatedData]
}

/**
* The details for events with this `type`.
* @param id The project ID.
* @param changesUnderscorerequested 
*/

case class AuditLogProjectUpdated(
  id: Option[String],
  changesUnderscorerequested: Option[AuditLogProjectUpdatedChangesRequested]
)
object AuditLogProjectUpdated {
  implicit val encoderAuditLogProjectUpdated: Encoder[AuditLogProjectUpdated] = deriveEncoder[AuditLogProjectUpdated].mapJson(_.dropNullValues)
  implicit val decoderAuditLogProjectUpdated: Decoder[AuditLogProjectUpdated] = deriveDecoder[AuditLogProjectUpdated]
}

/**
* The payload used to update the project.
* @param title The title of the project as seen on the dashboard.
*/

case class AuditLogProjectUpdatedChangesRequested(
  title: Option[String]
)
object AuditLogProjectUpdatedChangesRequested {
  implicit val encoderAuditLogProjectUpdatedChangesRequested: Encoder[AuditLogProjectUpdatedChangesRequested] = deriveEncoder[AuditLogProjectUpdatedChangesRequested].mapJson(_.dropNullValues)
  implicit val decoderAuditLogProjectUpdatedChangesRequested: Decoder[AuditLogProjectUpdatedChangesRequested] = deriveDecoder[AuditLogProjectUpdatedChangesRequested]
}

/**
* The details for events with this `type`.
* @param id The rate limit ID
*/

case class AuditLogRateLimitDeleted(
  id: Option[String]
)
object AuditLogRateLimitDeleted {
  implicit val encoderAuditLogRateLimitDeleted: Encoder[AuditLogRateLimitDeleted] = deriveEncoder[AuditLogRateLimitDeleted].mapJson(_.dropNullValues)
  implicit val decoderAuditLogRateLimitDeleted: Decoder[AuditLogRateLimitDeleted] = deriveDecoder[AuditLogRateLimitDeleted]
}

/**
* The details for events with this `type`.
* @param id The rate limit ID
* @param changesUnderscorerequested 
*/

case class AuditLogRateLimitUpdated(
  id: Option[String],
  changesUnderscorerequested: Option[AuditLogRateLimitUpdatedChangesRequested]
)
object AuditLogRateLimitUpdated {
  implicit val encoderAuditLogRateLimitUpdated: Encoder[AuditLogRateLimitUpdated] = deriveEncoder[AuditLogRateLimitUpdated].mapJson(_.dropNullValues)
  implicit val decoderAuditLogRateLimitUpdated: Decoder[AuditLogRateLimitUpdated] = deriveDecoder[AuditLogRateLimitUpdated]
}

/**
* The payload used to update the rate limits.
* @param maxUnderscorerequestsUnderscoreperUnderscore1Underscoreminute The maximum requests per minute.
* @param maxUnderscoretokensUnderscoreperUnderscore1Underscoreminute The maximum tokens per minute.
* @param maxUnderscoreimagesUnderscoreperUnderscore1Underscoreminute The maximum images per minute. Only relevant for certain models.
* @param maxUnderscoreaudioUnderscoremegabytesUnderscoreperUnderscore1Underscoreminute The maximum audio megabytes per minute. Only relevant for certain models.
* @param maxUnderscorerequestsUnderscoreperUnderscore1Underscoreday The maximum requests per day. Only relevant for certain models.
* @param batchUnderscore1UnderscoredayUnderscoremaxUnderscoreinputUnderscoretokens The maximum batch input tokens per day. Only relevant for certain models.
*/

case class AuditLogRateLimitUpdatedChangesRequested(
  maxUnderscorerequestsUnderscoreperUnderscore1Underscoreminute: Option[Int],
  maxUnderscoretokensUnderscoreperUnderscore1Underscoreminute: Option[Int],
  maxUnderscoreimagesUnderscoreperUnderscore1Underscoreminute: Option[Int],
  maxUnderscoreaudioUnderscoremegabytesUnderscoreperUnderscore1Underscoreminute: Option[Int],
  maxUnderscorerequestsUnderscoreperUnderscore1Underscoreday: Option[Int],
  batchUnderscore1UnderscoredayUnderscoremaxUnderscoreinputUnderscoretokens: Option[Int]
)
object AuditLogRateLimitUpdatedChangesRequested {
  implicit val encoderAuditLogRateLimitUpdatedChangesRequested: Encoder[AuditLogRateLimitUpdatedChangesRequested] = deriveEncoder[AuditLogRateLimitUpdatedChangesRequested].mapJson(_.dropNullValues)
  implicit val decoderAuditLogRateLimitUpdatedChangesRequested: Decoder[AuditLogRateLimitUpdatedChangesRequested] = deriveDecoder[AuditLogRateLimitUpdatedChangesRequested]
}

/**
* The details for events with this `type`.
* @param id The service account ID.
* @param data 
*/

case class AuditLogServiceAccountCreated(
  id: Option[String],
  data: Option[AuditLogServiceAccountCreatedData]
)
object AuditLogServiceAccountCreated {
  implicit val encoderAuditLogServiceAccountCreated: Encoder[AuditLogServiceAccountCreated] = deriveEncoder[AuditLogServiceAccountCreated].mapJson(_.dropNullValues)
  implicit val decoderAuditLogServiceAccountCreated: Decoder[AuditLogServiceAccountCreated] = deriveDecoder[AuditLogServiceAccountCreated]
}

/**
* The payload used to create the service account.
* @param role The role of the service account. Is either `owner` or `member`.
*/

case class AuditLogServiceAccountCreatedData(
  role: Option[String]
)
object AuditLogServiceAccountCreatedData {
  implicit val encoderAuditLogServiceAccountCreatedData: Encoder[AuditLogServiceAccountCreatedData] = deriveEncoder[AuditLogServiceAccountCreatedData].mapJson(_.dropNullValues)
  implicit val decoderAuditLogServiceAccountCreatedData: Decoder[AuditLogServiceAccountCreatedData] = deriveDecoder[AuditLogServiceAccountCreatedData]
}

/**
* The details for events with this `type`.
* @param id The service account ID.
*/

case class AuditLogServiceAccountDeleted(
  id: Option[String]
)
object AuditLogServiceAccountDeleted {
  implicit val encoderAuditLogServiceAccountDeleted: Encoder[AuditLogServiceAccountDeleted] = deriveEncoder[AuditLogServiceAccountDeleted].mapJson(_.dropNullValues)
  implicit val decoderAuditLogServiceAccountDeleted: Decoder[AuditLogServiceAccountDeleted] = deriveDecoder[AuditLogServiceAccountDeleted]
}

/**
* The details for events with this `type`.
* @param id The service account ID.
* @param changesUnderscorerequested 
*/

case class AuditLogServiceAccountUpdated(
  id: Option[String],
  changesUnderscorerequested: Option[AuditLogServiceAccountUpdatedChangesRequested]
)
object AuditLogServiceAccountUpdated {
  implicit val encoderAuditLogServiceAccountUpdated: Encoder[AuditLogServiceAccountUpdated] = deriveEncoder[AuditLogServiceAccountUpdated].mapJson(_.dropNullValues)
  implicit val decoderAuditLogServiceAccountUpdated: Decoder[AuditLogServiceAccountUpdated] = deriveDecoder[AuditLogServiceAccountUpdated]
}

/**
* The payload used to updated the service account.
* @param role The role of the service account. Is either `owner` or `member`.
*/

case class AuditLogServiceAccountUpdatedChangesRequested(
  role: Option[String]
)
object AuditLogServiceAccountUpdatedChangesRequested {
  implicit val encoderAuditLogServiceAccountUpdatedChangesRequested: Encoder[AuditLogServiceAccountUpdatedChangesRequested] = deriveEncoder[AuditLogServiceAccountUpdatedChangesRequested].mapJson(_.dropNullValues)
  implicit val decoderAuditLogServiceAccountUpdatedChangesRequested: Decoder[AuditLogServiceAccountUpdatedChangesRequested] = deriveDecoder[AuditLogServiceAccountUpdatedChangesRequested]
}

/**
* The details for events with this `type`.
* @param id The user ID.
* @param data 
*/

case class AuditLogUserAdded(
  id: Option[String],
  data: Option[AuditLogUserAddedData]
)
object AuditLogUserAdded {
  implicit val encoderAuditLogUserAdded: Encoder[AuditLogUserAdded] = deriveEncoder[AuditLogUserAdded].mapJson(_.dropNullValues)
  implicit val decoderAuditLogUserAdded: Decoder[AuditLogUserAdded] = deriveDecoder[AuditLogUserAdded]
}

/**
* The payload used to add the user to the project.
* @param role The role of the user. Is either `owner` or `member`.
*/

case class AuditLogUserAddedData(
  role: Option[String]
)
object AuditLogUserAddedData {
  implicit val encoderAuditLogUserAddedData: Encoder[AuditLogUserAddedData] = deriveEncoder[AuditLogUserAddedData].mapJson(_.dropNullValues)
  implicit val decoderAuditLogUserAddedData: Decoder[AuditLogUserAddedData] = deriveDecoder[AuditLogUserAddedData]
}

/**
* The details for events with this `type`.
* @param id The user ID.
*/

case class AuditLogUserDeleted(
  id: Option[String]
)
object AuditLogUserDeleted {
  implicit val encoderAuditLogUserDeleted: Encoder[AuditLogUserDeleted] = deriveEncoder[AuditLogUserDeleted].mapJson(_.dropNullValues)
  implicit val decoderAuditLogUserDeleted: Decoder[AuditLogUserDeleted] = deriveDecoder[AuditLogUserDeleted]
}

/**
* The details for events with this `type`.
* @param id The project ID.
* @param changesUnderscorerequested 
*/

case class AuditLogUserUpdated(
  id: Option[String],
  changesUnderscorerequested: Option[AuditLogUserUpdatedChangesRequested]
)
object AuditLogUserUpdated {
  implicit val encoderAuditLogUserUpdated: Encoder[AuditLogUserUpdated] = deriveEncoder[AuditLogUserUpdated].mapJson(_.dropNullValues)
  implicit val decoderAuditLogUserUpdated: Decoder[AuditLogUserUpdated] = deriveDecoder[AuditLogUserUpdated]
}

/**
* The payload used to update the user.
* @param role The role of the user. Is either `owner` or `member`.
*/

case class AuditLogUserUpdatedChangesRequested(
  role: Option[String]
)
object AuditLogUserUpdatedChangesRequested {
  implicit val encoderAuditLogUserUpdatedChangesRequested: Encoder[AuditLogUserUpdatedChangesRequested] = deriveEncoder[AuditLogUserUpdatedChangesRequested].mapJson(_.dropNullValues)
  implicit val decoderAuditLogUserUpdatedChangesRequested: Decoder[AuditLogUserUpdatedChangesRequested] = deriveDecoder[AuditLogUserUpdatedChangesRequested]
}

/**
* The default strategy. This strategy currently uses a `max_chunk_size_tokens` of `800` and `chunk_overlap_tokens` of `400`.
* @param `type` Always `auto`.
*/

case class AutoChunkingStrategyRequestParam(
  `type`: String
) extends ChunkingStrategyRequestParam with CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy with CreateThreadRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy with CreateVectorStoreRequestChunkingStrategy
object AutoChunkingStrategyRequestParam {
  implicit val encoderAutoChunkingStrategyRequestParam: Encoder[AutoChunkingStrategyRequestParam] = deriveEncoder[AutoChunkingStrategyRequestParam].mapJson(_.dropNullValues)
  implicit val decoderAutoChunkingStrategyRequestParam: Decoder[AutoChunkingStrategyRequestParam] = deriveDecoder[AutoChunkingStrategyRequestParam]
}

/**
* 
* @param id 
* @param `object` The object type, which is always `batch`.
* @param endpoint The OpenAI API endpoint used by the batch.
* @param errors 
* @param inputUnderscorefileUnderscoreid The ID of the input file for the batch.
* @param completionUnderscorewindow The time frame within which the batch should be processed.
* @param status The current status of the batch.
* @param outputUnderscorefileUnderscoreid The ID of the file containing the outputs of successfully executed requests.
* @param errorUnderscorefileUnderscoreid The ID of the file containing the outputs of requests with errors.
* @param createdUnderscoreat The Unix timestamp (in seconds) for when the batch was created.
* @param inUnderscoreprogressUnderscoreat The Unix timestamp (in seconds) for when the batch started processing.
* @param expiresUnderscoreat The Unix timestamp (in seconds) for when the batch will expire.
* @param finalizingUnderscoreat The Unix timestamp (in seconds) for when the batch started finalizing.
* @param completedUnderscoreat The Unix timestamp (in seconds) for when the batch was completed.
* @param failedUnderscoreat The Unix timestamp (in seconds) for when the batch failed.
* @param expiredUnderscoreat The Unix timestamp (in seconds) for when the batch expired.
* @param cancellingUnderscoreat The Unix timestamp (in seconds) for when the batch started cancelling.
* @param cancelledUnderscoreat The Unix timestamp (in seconds) for when the batch was cancelled.
* @param requestUnderscorecounts 
* @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
*/

case class Batch(
  id: String,
  `object`: String,
  endpoint: String,
  errors: Option[BatchErrors],
  inputUnderscorefileUnderscoreid: String,
  completionUnderscorewindow: String,
  status: String,
  outputUnderscorefileUnderscoreid: Option[String],
  errorUnderscorefileUnderscoreid: Option[String],
  createdUnderscoreat: Int,
  inUnderscoreprogressUnderscoreat: Option[Int],
  expiresUnderscoreat: Option[Int],
  finalizingUnderscoreat: Option[Int],
  completedUnderscoreat: Option[Int],
  failedUnderscoreat: Option[Int],
  expiredUnderscoreat: Option[Int],
  cancellingUnderscoreat: Option[Int],
  cancelledUnderscoreat: Option[Int],
  requestUnderscorecounts: Option[BatchRequestCounts],
  metadata: Option[Object]
)
object Batch {
  implicit val encoderBatch: Encoder[Batch] = deriveEncoder[Batch].mapJson(_.dropNullValues)
  implicit val decoderBatch: Decoder[Batch] = deriveDecoder[Batch]
}

/**
* 
* @param `object` The object type, which is always `list`.
* @param data 
*/

case class BatchErrors(
  `object`: Option[String],
  data: Option[List[BatchErrorsDataInner]]
)
object BatchErrors {
  implicit val encoderBatchErrors: Encoder[BatchErrors] = deriveEncoder[BatchErrors].mapJson(_.dropNullValues)
  implicit val decoderBatchErrors: Decoder[BatchErrors] = deriveDecoder[BatchErrors]
}

/**
* 
* @param code An error code identifying the error type.
* @param message A human-readable message providing more details about the error.
* @param param The name of the parameter that caused the error, if applicable.
* @param line The line number of the input file where the error occurred, if applicable.
*/

case class BatchErrorsDataInner(
  code: Option[String],
  message: Option[String],
  param: Option[String],
  line: Option[Int]
)
object BatchErrorsDataInner {
  implicit val encoderBatchErrorsDataInner: Encoder[BatchErrorsDataInner] = deriveEncoder[BatchErrorsDataInner].mapJson(_.dropNullValues)
  implicit val decoderBatchErrorsDataInner: Decoder[BatchErrorsDataInner] = deriveDecoder[BatchErrorsDataInner]
}

/**
* The request counts for different statuses within the batch.
* @param total Total number of requests in the batch.
* @param completed Number of requests that have been completed successfully.
* @param failed Number of requests that have failed.
*/

case class BatchRequestCounts(
  total: Int,
  completed: Int,
  failed: Int
)
object BatchRequestCounts {
  implicit val encoderBatchRequestCounts: Encoder[BatchRequestCounts] = deriveEncoder[BatchRequestCounts].mapJson(_.dropNullValues)
  implicit val decoderBatchRequestCounts: Decoder[BatchRequestCounts] = deriveDecoder[BatchRequestCounts]
}

/**
* The per-line object of the batch input file
* @param customUnderscoreid A developer-provided per-request id that will be used to match outputs to inputs. Must be unique for each request in a batch.
* @param method The HTTP method to be used for the request. Currently only `POST` is supported.
* @param url The OpenAI API relative URL to be used for the request. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported.
*/

case class BatchRequestInput(
  customUnderscoreid: Option[String],
  method: Option[String],
  url: Option[String]
)
object BatchRequestInput {
  implicit val encoderBatchRequestInput: Encoder[BatchRequestInput] = deriveEncoder[BatchRequestInput].mapJson(_.dropNullValues)
  implicit val decoderBatchRequestInput: Decoder[BatchRequestInput] = deriveDecoder[BatchRequestInput]
}

/**
* The per-line object of the batch output and error files
* @param id 
* @param customUnderscoreid A developer-provided per-request id that will be used to match outputs to inputs.
* @param response 
* @param error 
*/

case class BatchRequestOutput(
  id: Option[String],
  customUnderscoreid: Option[String],
  response: Option[BatchRequestOutputResponse],
  error: Option[BatchRequestOutputError]
)
object BatchRequestOutput {
  implicit val encoderBatchRequestOutput: Encoder[BatchRequestOutput] = deriveEncoder[BatchRequestOutput].mapJson(_.dropNullValues)
  implicit val decoderBatchRequestOutput: Decoder[BatchRequestOutput] = deriveDecoder[BatchRequestOutput]
}

/**
* For requests that failed with a non-HTTP error, this will contain more information on the cause of the failure.
* @param code A machine-readable error code.
* @param message A human-readable error message.
*/

case class BatchRequestOutputError(
  code: Option[String],
  message: Option[String]
)
object BatchRequestOutputError {
  implicit val encoderBatchRequestOutputError: Encoder[BatchRequestOutputError] = deriveEncoder[BatchRequestOutputError].mapJson(_.dropNullValues)
  implicit val decoderBatchRequestOutputError: Decoder[BatchRequestOutputError] = deriveDecoder[BatchRequestOutputError]
}

/**
* 
* @param statusUnderscorecode The HTTP status code of the response
* @param requestUnderscoreid An unique identifier for the OpenAI API request. Please include this request ID when contacting support.
* @param body The JSON body of the response
*/

case class BatchRequestOutputResponse(
  statusUnderscorecode: Option[Int],
  requestUnderscoreid: Option[String],
  body: Option[Object]
)
object BatchRequestOutputResponse {
  implicit val encoderBatchRequestOutputResponse: Encoder[BatchRequestOutputResponse] = deriveEncoder[BatchRequestOutputResponse].mapJson(_.dropNullValues)
  implicit val decoderBatchRequestOutputResponse: Decoder[BatchRequestOutputResponse] = deriveDecoder[BatchRequestOutputResponse]
}

/**
* Specifying a particular function via `{\"name\": \"my_function\"}` forces the model to call that function. 
* @param name The name of the function to call.
*/

case class ChatCompletionFunctionCallOption(
  name: String
) extends CreateChatCompletionRequestFunctionCall
object ChatCompletionFunctionCallOption {
  implicit val encoderChatCompletionFunctionCallOption: Encoder[ChatCompletionFunctionCallOption] = deriveEncoder[ChatCompletionFunctionCallOption].mapJson(_.dropNullValues)
  implicit val decoderChatCompletionFunctionCallOption: Decoder[ChatCompletionFunctionCallOption] = deriveDecoder[ChatCompletionFunctionCallOption]
}

/**
* 
* @param description A description of what the function does, used by the model to choose when and how to call the function.
* @param name The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.
* @param parameters The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.   Omitting `parameters` defines a function with an empty parameter list.
*/

case class ChatCompletionFunctions(
  description: Option[String],
  name: String,
  parameters: Option[Map[String, AnyType]]
)
object ChatCompletionFunctions {
  implicit val encoderChatCompletionFunctions: Encoder[ChatCompletionFunctions] = deriveEncoder[ChatCompletionFunctions].mapJson(_.dropNullValues)
  implicit val decoderChatCompletionFunctions: Decoder[ChatCompletionFunctions] = deriveDecoder[ChatCompletionFunctions]
}

/**
* 
* @param id The ID of the tool call.
* @param `type` The type of the tool. Currently, only `function` is supported.
* @param function 
*/

case class ChatCompletionMessageToolCall(
  id: String,
  `type`: String,
  function: ChatCompletionMessageToolCallFunction
)
object ChatCompletionMessageToolCall {
  implicit val encoderChatCompletionMessageToolCall: Encoder[ChatCompletionMessageToolCall] = deriveEncoder[ChatCompletionMessageToolCall].mapJson(_.dropNullValues)
  implicit val decoderChatCompletionMessageToolCall: Decoder[ChatCompletionMessageToolCall] = deriveDecoder[ChatCompletionMessageToolCall]
}

/**
* 
* @param index 
* @param id The ID of the tool call.
* @param `type` The type of the tool. Currently, only `function` is supported.
* @param function 
*/

case class ChatCompletionMessageToolCallChunk(
  index: Int,
  id: Option[String],
  `type`: Option[String],
  function: Option[ChatCompletionMessageToolCallChunkFunction]
)
object ChatCompletionMessageToolCallChunk {
  implicit val encoderChatCompletionMessageToolCallChunk: Encoder[ChatCompletionMessageToolCallChunk] = deriveEncoder[ChatCompletionMessageToolCallChunk].mapJson(_.dropNullValues)
  implicit val decoderChatCompletionMessageToolCallChunk: Decoder[ChatCompletionMessageToolCallChunk] = deriveDecoder[ChatCompletionMessageToolCallChunk]
}

/**
* 
* @param name The name of the function to call.
* @param arguments The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function.
*/

case class ChatCompletionMessageToolCallChunkFunction(
  name: Option[String],
  arguments: Option[String]
)
object ChatCompletionMessageToolCallChunkFunction {
  implicit val encoderChatCompletionMessageToolCallChunkFunction: Encoder[ChatCompletionMessageToolCallChunkFunction] = deriveEncoder[ChatCompletionMessageToolCallChunkFunction].mapJson(_.dropNullValues)
  implicit val decoderChatCompletionMessageToolCallChunkFunction: Decoder[ChatCompletionMessageToolCallChunkFunction] = deriveDecoder[ChatCompletionMessageToolCallChunkFunction]
}

/**
* The function that the model called.
* @param name The name of the function to call.
* @param arguments The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function.
*/

case class ChatCompletionMessageToolCallFunction(
  name: String,
  arguments: String
)
object ChatCompletionMessageToolCallFunction {
  implicit val encoderChatCompletionMessageToolCallFunction: Encoder[ChatCompletionMessageToolCallFunction] = deriveEncoder[ChatCompletionMessageToolCallFunction].mapJson(_.dropNullValues)
  implicit val decoderChatCompletionMessageToolCallFunction: Decoder[ChatCompletionMessageToolCallFunction] = deriveDecoder[ChatCompletionMessageToolCallFunction]
}

/**
* Specifies a tool the model should use. Use to force the model to call a specific function.
* @param `type` The type of the tool. Currently, only `function` is supported.
* @param function 
*/

case class ChatCompletionNamedToolChoice(
  `type`: String,
  function: ChatCompletionNamedToolChoiceFunction
) extends ChatCompletionToolChoiceOption
object ChatCompletionNamedToolChoice {
  implicit val encoderChatCompletionNamedToolChoice: Encoder[ChatCompletionNamedToolChoice] = deriveEncoder[ChatCompletionNamedToolChoice].mapJson(_.dropNullValues)
  implicit val decoderChatCompletionNamedToolChoice: Decoder[ChatCompletionNamedToolChoice] = deriveDecoder[ChatCompletionNamedToolChoice]
}

/**
* 
* @param name The name of the function to call.
*/

case class ChatCompletionNamedToolChoiceFunction(
  name: String
)
object ChatCompletionNamedToolChoiceFunction {
  implicit val encoderChatCompletionNamedToolChoiceFunction: Encoder[ChatCompletionNamedToolChoiceFunction] = deriveEncoder[ChatCompletionNamedToolChoiceFunction].mapJson(_.dropNullValues)
  implicit val decoderChatCompletionNamedToolChoiceFunction: Decoder[ChatCompletionNamedToolChoiceFunction] = deriveDecoder[ChatCompletionNamedToolChoiceFunction]
}

/**
* Messages sent by the model in response to user messages. 
* @param content 
* @param refusal The refusal message by the assistant.
* @param role The role of the messages author, in this case `assistant`.
* @param name An optional name for the participant. Provides the model information to differentiate between participants of the same role.
* @param audio 
* @param toolUnderscorecalls The tool calls generated by the model, such as function calls.
* @param functionUnderscorecall 
*/

case class ChatCompletionRequestAssistantMessage(
  content: Option[ChatCompletionRequestAssistantMessageContent],
  refusal: Option[String],
  role: String,
  name: Option[String],
  audio: Option[ChatCompletionRequestAssistantMessageAudio],
  toolUnderscorecalls: Option[List[ChatCompletionMessageToolCall]],
  functionUnderscorecall: Option[ChatCompletionRequestAssistantMessageFunctionCall]
) extends ChatCompletionRequestMessage with FineTunePreferenceRequestInputNonPreferredCompletionInner with FineTunePreferenceRequestInputPreferredCompletionInner
object ChatCompletionRequestAssistantMessage {
  implicit val encoderChatCompletionRequestAssistantMessage: Encoder[ChatCompletionRequestAssistantMessage] = deriveEncoder[ChatCompletionRequestAssistantMessage].mapJson(_.dropNullValues)
  implicit val decoderChatCompletionRequestAssistantMessage: Decoder[ChatCompletionRequestAssistantMessage] = deriveDecoder[ChatCompletionRequestAssistantMessage]
}

/**
* Data about a previous audio response from the model.  [Learn more](/docs/guides/audio). 
* @param id Unique identifier for a previous audio response from the model. 
*/

case class ChatCompletionRequestAssistantMessageAudio(
  id: String
)
object ChatCompletionRequestAssistantMessageAudio {
  implicit val encoderChatCompletionRequestAssistantMessageAudio: Encoder[ChatCompletionRequestAssistantMessageAudio] = deriveEncoder[ChatCompletionRequestAssistantMessageAudio].mapJson(_.dropNullValues)
  implicit val decoderChatCompletionRequestAssistantMessageAudio: Decoder[ChatCompletionRequestAssistantMessageAudio] = deriveDecoder[ChatCompletionRequestAssistantMessageAudio]
}

/**
* The contents of the assistant message. Required unless `tool_calls` or `function_call` is specified. 
*/
sealed trait ChatCompletionRequestAssistantMessageContent
object ChatCompletionRequestAssistantMessageContent {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val chatCompletionRequestAssistantMessageContentEncoder: Encoder[ChatCompletionRequestAssistantMessageContent] = Encoder.instance {
    case list_ChatCompletionRequestAssistantMessageContentPart: List[ChatCompletionRequestAssistantMessageContentPart] => list_ChatCompletionRequestAssistantMessageContentPart.asJson
    case string: String => string.asJson
  }

  implicit val chatCompletionRequestAssistantMessageContentDecoder: Decoder[ChatCompletionRequestAssistantMessageContent] =
    List[Decoder[ChatCompletionRequestAssistantMessageContent]](
      Decoder[List[ChatCompletionRequestAssistantMessageContentPart]].widen,
      Decoder[String].widen,
  ).reduceLeft(_ or _)
}


/**
* 
* @param `type` The type of the content part.
* @param text The text content.
* @param refusal The refusal message generated by the model.
*/
sealed trait ChatCompletionRequestAssistantMessageContentPart
object ChatCompletionRequestAssistantMessageContentPart {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val chatCompletionRequestAssistantMessageContentPartEncoder: Encoder[ChatCompletionRequestAssistantMessageContentPart] = Encoder.instance {
    case chatCompletionRequestMessageContentPartRefusal: ChatCompletionRequestMessageContentPartRefusal => chatCompletionRequestMessageContentPartRefusal.asJson
    case chatCompletionRequestMessageContentPartText: ChatCompletionRequestMessageContentPartText => chatCompletionRequestMessageContentPartText.asJson
  }

  implicit val chatCompletionRequestAssistantMessageContentPartDecoder: Decoder[ChatCompletionRequestAssistantMessageContentPart] =
    List[Decoder[ChatCompletionRequestAssistantMessageContentPart]](
      Decoder[ChatCompletionRequestMessageContentPartRefusal].widen,
      Decoder[ChatCompletionRequestMessageContentPartText].widen,
  ).reduceLeft(_ or _)
}


/**
* Deprecated and replaced by `tool_calls`. The name and arguments of a function that should be called, as generated by the model.
* @param arguments The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function.
* @param name The name of the function to call.
*/

case class ChatCompletionRequestAssistantMessageFunctionCall(
  arguments: String,
  name: String
)
object ChatCompletionRequestAssistantMessageFunctionCall {
  implicit val encoderChatCompletionRequestAssistantMessageFunctionCall: Encoder[ChatCompletionRequestAssistantMessageFunctionCall] = deriveEncoder[ChatCompletionRequestAssistantMessageFunctionCall].mapJson(_.dropNullValues)
  implicit val decoderChatCompletionRequestAssistantMessageFunctionCall: Decoder[ChatCompletionRequestAssistantMessageFunctionCall] = deriveDecoder[ChatCompletionRequestAssistantMessageFunctionCall]
}

/**
* Developer-provided instructions that the model should follow, regardless of messages sent by the user. With o1 models and newer, `developer` messages replace the previous `system` messages. 
* @param content 
* @param role The role of the messages author, in this case `developer`.
* @param name An optional name for the participant. Provides the model information to differentiate between participants of the same role.
*/

case class ChatCompletionRequestDeveloperMessage(
  content: ChatCompletionRequestDeveloperMessageContent,
  role: String,
  name: Option[String]
) extends ChatCompletionRequestMessage
object ChatCompletionRequestDeveloperMessage {
  implicit val encoderChatCompletionRequestDeveloperMessage: Encoder[ChatCompletionRequestDeveloperMessage] = deriveEncoder[ChatCompletionRequestDeveloperMessage].mapJson(_.dropNullValues)
  implicit val decoderChatCompletionRequestDeveloperMessage: Decoder[ChatCompletionRequestDeveloperMessage] = deriveDecoder[ChatCompletionRequestDeveloperMessage]
}

/**
* The contents of the developer message.
*/
sealed trait ChatCompletionRequestDeveloperMessageContent
object ChatCompletionRequestDeveloperMessageContent {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val chatCompletionRequestDeveloperMessageContentEncoder: Encoder[ChatCompletionRequestDeveloperMessageContent] = Encoder.instance {
    case list_ChatCompletionRequestMessageContentPartText: List[ChatCompletionRequestMessageContentPartText] => list_ChatCompletionRequestMessageContentPartText.asJson
    case string: String => string.asJson
  }

  implicit val chatCompletionRequestDeveloperMessageContentDecoder: Decoder[ChatCompletionRequestDeveloperMessageContent] =
    List[Decoder[ChatCompletionRequestDeveloperMessageContent]](
      Decoder[List[ChatCompletionRequestMessageContentPartText]].widen,
      Decoder[String].widen,
  ).reduceLeft(_ or _)
}


/**
* 
* @param role The role of the messages author, in this case `function`.
* @param content The contents of the function message.
* @param name The name of the function to call.
*/

case class ChatCompletionRequestFunctionMessage(
  role: String,
  content: String,
  name: String
) extends ChatCompletionRequestMessage with FineTuneChatRequestInputMessagesInner with FineTunePreferenceRequestInputInputMessagesInner
object ChatCompletionRequestFunctionMessage {
  implicit val encoderChatCompletionRequestFunctionMessage: Encoder[ChatCompletionRequestFunctionMessage] = deriveEncoder[ChatCompletionRequestFunctionMessage].mapJson(_.dropNullValues)
  implicit val decoderChatCompletionRequestFunctionMessage: Decoder[ChatCompletionRequestFunctionMessage] = deriveDecoder[ChatCompletionRequestFunctionMessage]
}

/**
* 
* @param content The contents of the function message.
* @param role The role of the messages author, in this case `function`.
* @param name The name of the function to call.
* @param refusal The refusal message by the assistant.
* @param audio 
* @param toolUnderscorecalls The tool calls generated by the model, such as function calls.
* @param functionUnderscorecall 
* @param toolUnderscorecallUnderscoreid Tool call that this message is responding to.
*/
sealed trait ChatCompletionRequestMessage
object ChatCompletionRequestMessage {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val chatCompletionRequestMessageEncoder: Encoder[ChatCompletionRequestMessage] = Encoder.instance {
    case chatCompletionRequestAssistantMessage: ChatCompletionRequestAssistantMessage => chatCompletionRequestAssistantMessage.asJson
    case chatCompletionRequestDeveloperMessage: ChatCompletionRequestDeveloperMessage => chatCompletionRequestDeveloperMessage.asJson
    case chatCompletionRequestFunctionMessage: ChatCompletionRequestFunctionMessage => chatCompletionRequestFunctionMessage.asJson
    case chatCompletionRequestSystemMessage: ChatCompletionRequestSystemMessage => chatCompletionRequestSystemMessage.asJson
    case chatCompletionRequestToolMessage: ChatCompletionRequestToolMessage => chatCompletionRequestToolMessage.asJson
    case chatCompletionRequestUserMessage: ChatCompletionRequestUserMessage => chatCompletionRequestUserMessage.asJson
  }

  implicit val chatCompletionRequestMessageDecoder: Decoder[ChatCompletionRequestMessage] =
    List[Decoder[ChatCompletionRequestMessage]](
      Decoder[ChatCompletionRequestAssistantMessage].widen,
      Decoder[ChatCompletionRequestDeveloperMessage].widen,
      Decoder[ChatCompletionRequestFunctionMessage].widen,
      Decoder[ChatCompletionRequestSystemMessage].widen,
      Decoder[ChatCompletionRequestToolMessage].widen,
      Decoder[ChatCompletionRequestUserMessage].widen,
  ).reduceLeft(_ or _)
}


/**
* Learn about [audio inputs](/docs/guides/audio). 
* @param `type` The type of the content part. Always `input_audio`.
* @param inputUnderscoreaudio 
*/

case class ChatCompletionRequestMessageContentPartAudio(
  `type`: String,
  inputUnderscoreaudio: ChatCompletionRequestMessageContentPartAudioInputAudio
) extends ChatCompletionRequestUserMessageContentPart
object ChatCompletionRequestMessageContentPartAudio {
  implicit val encoderChatCompletionRequestMessageContentPartAudio: Encoder[ChatCompletionRequestMessageContentPartAudio] = deriveEncoder[ChatCompletionRequestMessageContentPartAudio].mapJson(_.dropNullValues)
  implicit val decoderChatCompletionRequestMessageContentPartAudio: Decoder[ChatCompletionRequestMessageContentPartAudio] = deriveDecoder[ChatCompletionRequestMessageContentPartAudio]
}

/**
* 
* @param data Base64 encoded audio data.
* @param format The format of the encoded audio data. Currently supports \"wav\" and \"mp3\". 
*/

case class ChatCompletionRequestMessageContentPartAudioInputAudio(
  data: String,
  format: String
)
object ChatCompletionRequestMessageContentPartAudioInputAudio {
  implicit val encoderChatCompletionRequestMessageContentPartAudioInputAudio: Encoder[ChatCompletionRequestMessageContentPartAudioInputAudio] = deriveEncoder[ChatCompletionRequestMessageContentPartAudioInputAudio].mapJson(_.dropNullValues)
  implicit val decoderChatCompletionRequestMessageContentPartAudioInputAudio: Decoder[ChatCompletionRequestMessageContentPartAudioInputAudio] = deriveDecoder[ChatCompletionRequestMessageContentPartAudioInputAudio]
}

/**
* Learn about [image inputs](/docs/guides/vision). 
* @param `type` The type of the content part.
* @param imageUnderscoreurl 
*/

case class ChatCompletionRequestMessageContentPartImage(
  `type`: String,
  imageUnderscoreurl: ChatCompletionRequestMessageContentPartImageImageUrl
) extends ChatCompletionRequestUserMessageContentPart
object ChatCompletionRequestMessageContentPartImage {
  implicit val encoderChatCompletionRequestMessageContentPartImage: Encoder[ChatCompletionRequestMessageContentPartImage] = deriveEncoder[ChatCompletionRequestMessageContentPartImage].mapJson(_.dropNullValues)
  implicit val decoderChatCompletionRequestMessageContentPartImage: Decoder[ChatCompletionRequestMessageContentPartImage] = deriveDecoder[ChatCompletionRequestMessageContentPartImage]
}

/**
* 
* @param url Either a URL of the image or the base64 encoded image data.
* @param detail Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision#low-or-high-fidelity-image-understanding).
*/

case class ChatCompletionRequestMessageContentPartImageImageUrl(
  url: URI,
  detail: Option[String]
)
object ChatCompletionRequestMessageContentPartImageImageUrl {
  implicit val encoderChatCompletionRequestMessageContentPartImageImageUrl: Encoder[ChatCompletionRequestMessageContentPartImageImageUrl] = deriveEncoder[ChatCompletionRequestMessageContentPartImageImageUrl].mapJson(_.dropNullValues)
  implicit val decoderChatCompletionRequestMessageContentPartImageImageUrl: Decoder[ChatCompletionRequestMessageContentPartImageImageUrl] = deriveDecoder[ChatCompletionRequestMessageContentPartImageImageUrl]
}

/**
* 
* @param `type` The type of the content part.
* @param refusal The refusal message generated by the model.
*/

case class ChatCompletionRequestMessageContentPartRefusal(
  `type`: String,
  refusal: String
) extends ChatCompletionRequestAssistantMessageContentPart
object ChatCompletionRequestMessageContentPartRefusal {
  implicit val encoderChatCompletionRequestMessageContentPartRefusal: Encoder[ChatCompletionRequestMessageContentPartRefusal] = deriveEncoder[ChatCompletionRequestMessageContentPartRefusal].mapJson(_.dropNullValues)
  implicit val decoderChatCompletionRequestMessageContentPartRefusal: Decoder[ChatCompletionRequestMessageContentPartRefusal] = deriveDecoder[ChatCompletionRequestMessageContentPartRefusal]
}

/**
* Learn about [text inputs](/docs/guides/text-generation). 
* @param `type` The type of the content part.
* @param text The text content.
*/

case class ChatCompletionRequestMessageContentPartText(
  `type`: String,
  text: String
) extends ChatCompletionRequestAssistantMessageContentPart with ChatCompletionRequestUserMessageContentPart
object ChatCompletionRequestMessageContentPartText {
  implicit val encoderChatCompletionRequestMessageContentPartText: Encoder[ChatCompletionRequestMessageContentPartText] = deriveEncoder[ChatCompletionRequestMessageContentPartText].mapJson(_.dropNullValues)
  implicit val decoderChatCompletionRequestMessageContentPartText: Decoder[ChatCompletionRequestMessageContentPartText] = deriveDecoder[ChatCompletionRequestMessageContentPartText]
}

/**
* Developer-provided instructions that the model should follow, regardless of messages sent by the user. With o1 models and newer, use `developer` messages for this purpose instead. 
* @param content 
* @param role The role of the messages author, in this case `system`.
* @param name An optional name for the participant. Provides the model information to differentiate between participants of the same role.
*/

case class ChatCompletionRequestSystemMessage(
  content: ChatCompletionRequestSystemMessageContent,
  role: String,
  name: Option[String]
) extends ChatCompletionRequestMessage with FineTuneChatRequestInputMessagesInner with FineTunePreferenceRequestInputInputMessagesInner
object ChatCompletionRequestSystemMessage {
  implicit val encoderChatCompletionRequestSystemMessage: Encoder[ChatCompletionRequestSystemMessage] = deriveEncoder[ChatCompletionRequestSystemMessage].mapJson(_.dropNullValues)
  implicit val decoderChatCompletionRequestSystemMessage: Decoder[ChatCompletionRequestSystemMessage] = deriveDecoder[ChatCompletionRequestSystemMessage]
}

/**
* The contents of the system message.
*/
sealed trait ChatCompletionRequestSystemMessageContent
object ChatCompletionRequestSystemMessageContent {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val chatCompletionRequestSystemMessageContentEncoder: Encoder[ChatCompletionRequestSystemMessageContent] = Encoder.instance {
    case list_ChatCompletionRequestMessageContentPartText: List[ChatCompletionRequestMessageContentPartText] => list_ChatCompletionRequestMessageContentPartText.asJson
    case string: String => string.asJson
  }

  implicit val chatCompletionRequestSystemMessageContentDecoder: Decoder[ChatCompletionRequestSystemMessageContent] =
    List[Decoder[ChatCompletionRequestSystemMessageContent]](
      Decoder[List[ChatCompletionRequestMessageContentPartText]].widen,
      Decoder[String].widen,
  ).reduceLeft(_ or _)
}


/**
* 
* @param role The role of the messages author, in this case `tool`.
* @param content 
* @param toolUnderscorecallUnderscoreid Tool call that this message is responding to.
*/

case class ChatCompletionRequestToolMessage(
  role: String,
  content: ChatCompletionRequestToolMessageContent,
  toolUnderscorecallUnderscoreid: String
) extends ChatCompletionRequestMessage with FineTuneChatRequestInputMessagesInner with FineTunePreferenceRequestInputInputMessagesInner
object ChatCompletionRequestToolMessage {
  implicit val encoderChatCompletionRequestToolMessage: Encoder[ChatCompletionRequestToolMessage] = deriveEncoder[ChatCompletionRequestToolMessage].mapJson(_.dropNullValues)
  implicit val decoderChatCompletionRequestToolMessage: Decoder[ChatCompletionRequestToolMessage] = deriveDecoder[ChatCompletionRequestToolMessage]
}

/**
* The contents of the tool message.
*/
sealed trait ChatCompletionRequestToolMessageContent
object ChatCompletionRequestToolMessageContent {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val chatCompletionRequestToolMessageContentEncoder: Encoder[ChatCompletionRequestToolMessageContent] = Encoder.instance {
    case list_ChatCompletionRequestMessageContentPartText: List[ChatCompletionRequestMessageContentPartText] => list_ChatCompletionRequestMessageContentPartText.asJson
    case string: String => string.asJson
  }

  implicit val chatCompletionRequestToolMessageContentDecoder: Decoder[ChatCompletionRequestToolMessageContent] =
    List[Decoder[ChatCompletionRequestToolMessageContent]](
      Decoder[List[ChatCompletionRequestMessageContentPartText]].widen,
      Decoder[String].widen,
  ).reduceLeft(_ or _)
}


/**
* Messages sent by an end user, containing prompts or additional context information. 
* @param content 
* @param role The role of the messages author, in this case `user`.
* @param name An optional name for the participant. Provides the model information to differentiate between participants of the same role.
*/

case class ChatCompletionRequestUserMessage(
  content: ChatCompletionRequestUserMessageContent,
  role: String,
  name: Option[String]
) extends ChatCompletionRequestMessage with FineTuneChatRequestInputMessagesInner with FineTunePreferenceRequestInputInputMessagesInner
object ChatCompletionRequestUserMessage {
  implicit val encoderChatCompletionRequestUserMessage: Encoder[ChatCompletionRequestUserMessage] = deriveEncoder[ChatCompletionRequestUserMessage].mapJson(_.dropNullValues)
  implicit val decoderChatCompletionRequestUserMessage: Decoder[ChatCompletionRequestUserMessage] = deriveDecoder[ChatCompletionRequestUserMessage]
}

/**
* The contents of the user message. 
*/
sealed trait ChatCompletionRequestUserMessageContent
object ChatCompletionRequestUserMessageContent {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val chatCompletionRequestUserMessageContentEncoder: Encoder[ChatCompletionRequestUserMessageContent] = Encoder.instance {
    case list_ChatCompletionRequestUserMessageContentPart: List[ChatCompletionRequestUserMessageContentPart] => list_ChatCompletionRequestUserMessageContentPart.asJson
    case string: String => string.asJson
  }

  implicit val chatCompletionRequestUserMessageContentDecoder: Decoder[ChatCompletionRequestUserMessageContent] =
    List[Decoder[ChatCompletionRequestUserMessageContent]](
      Decoder[List[ChatCompletionRequestUserMessageContentPart]].widen,
      Decoder[String].widen,
  ).reduceLeft(_ or _)
}


/**
* 
* @param `type` The type of the content part.
* @param text The text content.
* @param imageUnderscoreurl 
* @param inputUnderscoreaudio 
*/
sealed trait ChatCompletionRequestUserMessageContentPart
object ChatCompletionRequestUserMessageContentPart {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val chatCompletionRequestUserMessageContentPartEncoder: Encoder[ChatCompletionRequestUserMessageContentPart] = Encoder.instance {
    case chatCompletionRequestMessageContentPartAudio: ChatCompletionRequestMessageContentPartAudio => chatCompletionRequestMessageContentPartAudio.asJson
    case chatCompletionRequestMessageContentPartImage: ChatCompletionRequestMessageContentPartImage => chatCompletionRequestMessageContentPartImage.asJson
    case chatCompletionRequestMessageContentPartText: ChatCompletionRequestMessageContentPartText => chatCompletionRequestMessageContentPartText.asJson
  }

  implicit val chatCompletionRequestUserMessageContentPartDecoder: Decoder[ChatCompletionRequestUserMessageContentPart] =
    List[Decoder[ChatCompletionRequestUserMessageContentPart]](
      Decoder[ChatCompletionRequestMessageContentPartAudio].widen,
      Decoder[ChatCompletionRequestMessageContentPartImage].widen,
      Decoder[ChatCompletionRequestMessageContentPartText].widen,
  ).reduceLeft(_ or _)
}


/**
* A chat completion message generated by the model.
* @param content The contents of the message.
* @param refusal The refusal message generated by the model.
* @param toolUnderscorecalls The tool calls generated by the model, such as function calls.
* @param role The role of the author of this message.
* @param functionUnderscorecall 
* @param audio 
*/

case class ChatCompletionResponseMessage(
  content: String,
  refusal: String,
  toolUnderscorecalls: Option[List[ChatCompletionMessageToolCall]],
  role: String,
  functionUnderscorecall: Option[ChatCompletionResponseMessageFunctionCall],
  audio: Option[ChatCompletionResponseMessageAudio]
)
object ChatCompletionResponseMessage {
  implicit val encoderChatCompletionResponseMessage: Encoder[ChatCompletionResponseMessage] = deriveEncoder[ChatCompletionResponseMessage].mapJson(_.dropNullValues)
  implicit val decoderChatCompletionResponseMessage: Decoder[ChatCompletionResponseMessage] = deriveDecoder[ChatCompletionResponseMessage]
}

/**
* If the audio output modality is requested, this object contains data about the audio response from the model. [Learn more](/docs/guides/audio). 
* @param id Unique identifier for this audio response.
* @param expiresUnderscoreat The Unix timestamp (in seconds) for when this audio response will no longer be accessible on the server for use in multi-turn conversations. 
* @param data Base64 encoded audio bytes generated by the model, in the format specified in the request. 
* @param transcript Transcript of the audio generated by the model.
*/

case class ChatCompletionResponseMessageAudio(
  id: String,
  expiresUnderscoreat: Int,
  data: String,
  transcript: String
)
object ChatCompletionResponseMessageAudio {
  implicit val encoderChatCompletionResponseMessageAudio: Encoder[ChatCompletionResponseMessageAudio] = deriveEncoder[ChatCompletionResponseMessageAudio].mapJson(_.dropNullValues)
  implicit val decoderChatCompletionResponseMessageAudio: Decoder[ChatCompletionResponseMessageAudio] = deriveDecoder[ChatCompletionResponseMessageAudio]
}

/**
* Deprecated and replaced by `tool_calls`. The name and arguments of a function that should be called, as generated by the model.
* @param arguments The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function.
* @param name The name of the function to call.
*/

case class ChatCompletionResponseMessageFunctionCall(
  arguments: String,
  name: String
)
object ChatCompletionResponseMessageFunctionCall {
  implicit val encoderChatCompletionResponseMessageFunctionCall: Encoder[ChatCompletionResponseMessageFunctionCall] = deriveEncoder[ChatCompletionResponseMessageFunctionCall].mapJson(_.dropNullValues)
  implicit val decoderChatCompletionResponseMessageFunctionCall: Decoder[ChatCompletionResponseMessageFunctionCall] = deriveDecoder[ChatCompletionResponseMessageFunctionCall]
}

/**
* The role of the author of a message
*/

object ChatCompletionRole extends Enumeration {
    type ChatCompletionRole = Value
    val system = Value
    val user = Value
    val assistant = Value
    val tool = Value
    val function = Value
    implicit val decoder: Decoder[ChatCompletionRole.Value] = Decoder.decodeEnumeration(ChatCompletionRole)
    implicit val encoder: Encoder[ChatCompletionRole.Value] = Encoder.encodeEnumeration(ChatCompletionRole)
}

/**
* Options for streaming response. Only set this when you set `stream: true`. 
* @param includeUnderscoreusage If set, an additional chunk will be streamed before the `data: [DONE]` message. The `usage` field on this chunk shows the token usage statistics for the entire request, and the `choices` field will always be an empty array. All other chunks will also include a `usage` field, but with a null value. 
*/

case class ChatCompletionStreamOptions(
  includeUnderscoreusage: Option[Boolean]
)
object ChatCompletionStreamOptions {
  implicit val encoderChatCompletionStreamOptions: Encoder[ChatCompletionStreamOptions] = deriveEncoder[ChatCompletionStreamOptions].mapJson(_.dropNullValues)
  implicit val decoderChatCompletionStreamOptions: Decoder[ChatCompletionStreamOptions] = deriveDecoder[ChatCompletionStreamOptions]
}

/**
* A chat completion delta generated by streamed model responses.
* @param content The contents of the chunk message.
* @param functionUnderscorecall 
* @param toolUnderscorecalls 
* @param role The role of the author of this message.
* @param refusal The refusal message generated by the model.
*/

case class ChatCompletionStreamResponseDelta(
  content: Option[String],
  functionUnderscorecall: Option[ChatCompletionStreamResponseDeltaFunctionCall],
  toolUnderscorecalls: Option[List[ChatCompletionMessageToolCallChunk]],
  role: Option[String],
  refusal: Option[String]
)
object ChatCompletionStreamResponseDelta {
  implicit val encoderChatCompletionStreamResponseDelta: Encoder[ChatCompletionStreamResponseDelta] = deriveEncoder[ChatCompletionStreamResponseDelta].mapJson(_.dropNullValues)
  implicit val decoderChatCompletionStreamResponseDelta: Decoder[ChatCompletionStreamResponseDelta] = deriveDecoder[ChatCompletionStreamResponseDelta]
}

/**
* Deprecated and replaced by `tool_calls`. The name and arguments of a function that should be called, as generated by the model.
* @param arguments The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function.
* @param name The name of the function to call.
*/

case class ChatCompletionStreamResponseDeltaFunctionCall(
  arguments: Option[String],
  name: Option[String]
)
object ChatCompletionStreamResponseDeltaFunctionCall {
  implicit val encoderChatCompletionStreamResponseDeltaFunctionCall: Encoder[ChatCompletionStreamResponseDeltaFunctionCall] = deriveEncoder[ChatCompletionStreamResponseDeltaFunctionCall].mapJson(_.dropNullValues)
  implicit val decoderChatCompletionStreamResponseDeltaFunctionCall: Decoder[ChatCompletionStreamResponseDeltaFunctionCall] = deriveDecoder[ChatCompletionStreamResponseDeltaFunctionCall]
}

/**
* 
* @param token The token.
* @param logprob The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value `-9999.0` is used to signify that the token is very unlikely.
* @param bytes A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be `null` if there is no bytes representation for the token.
* @param topUnderscorelogprobs List of the most likely tokens and their log probability, at this token position. In rare cases, there may be fewer than the number of requested `top_logprobs` returned.
*/

case class ChatCompletionTokenLogprob(
  token: String,
  logprob: BigDecimal,
  bytes: List[Int],
  topUnderscorelogprobs: List[ChatCompletionTokenLogprobTopLogprobsInner]
)
object ChatCompletionTokenLogprob {
  implicit val encoderChatCompletionTokenLogprob: Encoder[ChatCompletionTokenLogprob] = deriveEncoder[ChatCompletionTokenLogprob].mapJson(_.dropNullValues)
  implicit val decoderChatCompletionTokenLogprob: Decoder[ChatCompletionTokenLogprob] = deriveDecoder[ChatCompletionTokenLogprob]
}

/**
* 
* @param token The token.
* @param logprob The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value `-9999.0` is used to signify that the token is very unlikely.
* @param bytes A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be `null` if there is no bytes representation for the token.
*/

case class ChatCompletionTokenLogprobTopLogprobsInner(
  token: String,
  logprob: BigDecimal,
  bytes: List[Int]
)
object ChatCompletionTokenLogprobTopLogprobsInner {
  implicit val encoderChatCompletionTokenLogprobTopLogprobsInner: Encoder[ChatCompletionTokenLogprobTopLogprobsInner] = deriveEncoder[ChatCompletionTokenLogprobTopLogprobsInner].mapJson(_.dropNullValues)
  implicit val decoderChatCompletionTokenLogprobTopLogprobsInner: Decoder[ChatCompletionTokenLogprobTopLogprobsInner] = deriveDecoder[ChatCompletionTokenLogprobTopLogprobsInner]
}

/**
* 
* @param `type` The type of the tool. Currently, only `function` is supported.
* @param function 
*/

case class ChatCompletionTool(
  `type`: String,
  function: FunctionObject
)
object ChatCompletionTool {
  implicit val encoderChatCompletionTool: Encoder[ChatCompletionTool] = deriveEncoder[ChatCompletionTool].mapJson(_.dropNullValues)
  implicit val decoderChatCompletionTool: Decoder[ChatCompletionTool] = deriveDecoder[ChatCompletionTool]
}

/**
* Controls which (if any) tool is called by the model. `none` means the model will not call any tool and instead generates a message. `auto` means the model can pick between generating a message or calling one or more tools. `required` means the model must call one or more tools. Specifying a particular tool via `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}` forces the model to call that tool.  `none` is the default when no tools are present. `auto` is the default if tools are present. 
* @param `type` The type of the tool. Currently, only `function` is supported.
* @param function 
*/
sealed trait ChatCompletionToolChoiceOption
object ChatCompletionToolChoiceOption {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val chatCompletionToolChoiceOptionEncoder: Encoder[ChatCompletionToolChoiceOption] = Encoder.instance {
    case chatCompletionNamedToolChoice: ChatCompletionNamedToolChoice => chatCompletionNamedToolChoice.asJson
    case string: String => string.asJson
  }

  implicit val chatCompletionToolChoiceOptionDecoder: Decoder[ChatCompletionToolChoiceOption] =
    List[Decoder[ChatCompletionToolChoiceOption]](
      Decoder[ChatCompletionNamedToolChoice].widen,
      Decoder[String].widen,
  ).reduceLeft(_ or _)
}


/**
* The chunking strategy used to chunk the file(s). If not set, will use the `auto` strategy.
* @param `type` Always `auto`.
* @param `static` 
*/
sealed trait ChunkingStrategyRequestParam
object ChunkingStrategyRequestParam {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val chunkingStrategyRequestParamEncoder: Encoder[ChunkingStrategyRequestParam] = Encoder.instance {
    case autoChunkingStrategyRequestParam: AutoChunkingStrategyRequestParam => autoChunkingStrategyRequestParam.asJson
    case staticChunkingStrategyRequestParam: StaticChunkingStrategyRequestParam => staticChunkingStrategyRequestParam.asJson
  }

  implicit val chunkingStrategyRequestParamDecoder: Decoder[ChunkingStrategyRequestParam] =
    List[Decoder[ChunkingStrategyRequestParam]](
      Decoder[AutoChunkingStrategyRequestParam].widen,
      Decoder[StaticChunkingStrategyRequestParam].widen,
  ).reduceLeft(_ or _)
}


/**
* 
* @param partUnderscoreids The ordered list of Part IDs. 
* @param md5 The optional md5 checksum for the file contents to verify if the bytes uploaded matches what you expect. 
*/

case class CompleteUploadRequest(
  partUnderscoreids: List[String],
  md5: Option[String]
)
object CompleteUploadRequest {
  implicit val encoderCompleteUploadRequest: Encoder[CompleteUploadRequest] = deriveEncoder[CompleteUploadRequest].mapJson(_.dropNullValues)
  implicit val decoderCompleteUploadRequest: Decoder[CompleteUploadRequest] = deriveDecoder[CompleteUploadRequest]
}

/**
* Usage statistics for the completion request.
* @param completionUnderscoretokens Number of tokens in the generated completion.
* @param promptUnderscoretokens Number of tokens in the prompt.
* @param totalUnderscoretokens Total number of tokens used in the request (prompt + completion).
* @param completionUnderscoretokensUnderscoredetails 
* @param promptUnderscoretokensUnderscoredetails 
*/

case class CompletionUsage(
  completionUnderscoretokens: Int,
  promptUnderscoretokens: Int,
  totalUnderscoretokens: Int,
  completionUnderscoretokensUnderscoredetails: Option[CompletionUsageCompletionTokensDetails],
  promptUnderscoretokensUnderscoredetails: Option[CompletionUsagePromptTokensDetails]
)
object CompletionUsage {
  implicit val encoderCompletionUsage: Encoder[CompletionUsage] = deriveEncoder[CompletionUsage].mapJson(_.dropNullValues)
  implicit val decoderCompletionUsage: Decoder[CompletionUsage] = deriveDecoder[CompletionUsage]
}

/**
* Breakdown of tokens used in a completion.
* @param acceptedUnderscorepredictionUnderscoretokens When using Predicted Outputs, the number of tokens in the prediction that appeared in the completion. 
* @param audioUnderscoretokens Audio input tokens generated by the model.
* @param reasoningUnderscoretokens Tokens generated by the model for reasoning.
* @param rejectedUnderscorepredictionUnderscoretokens When using Predicted Outputs, the number of tokens in the prediction that did not appear in the completion. However, like reasoning tokens, these tokens are still counted in the total completion tokens for purposes of billing, output, and context window limits. 
*/

case class CompletionUsageCompletionTokensDetails(
  acceptedUnderscorepredictionUnderscoretokens: Option[Int],
  audioUnderscoretokens: Option[Int],
  reasoningUnderscoretokens: Option[Int],
  rejectedUnderscorepredictionUnderscoretokens: Option[Int]
)
object CompletionUsageCompletionTokensDetails {
  implicit val encoderCompletionUsageCompletionTokensDetails: Encoder[CompletionUsageCompletionTokensDetails] = deriveEncoder[CompletionUsageCompletionTokensDetails].mapJson(_.dropNullValues)
  implicit val decoderCompletionUsageCompletionTokensDetails: Decoder[CompletionUsageCompletionTokensDetails] = deriveDecoder[CompletionUsageCompletionTokensDetails]
}

/**
* Breakdown of tokens used in the prompt.
* @param audioUnderscoretokens Audio input tokens present in the prompt.
* @param cachedUnderscoretokens Cached tokens present in the prompt.
*/

case class CompletionUsagePromptTokensDetails(
  audioUnderscoretokens: Option[Int],
  cachedUnderscoretokens: Option[Int]
)
object CompletionUsagePromptTokensDetails {
  implicit val encoderCompletionUsagePromptTokensDetails: Encoder[CompletionUsagePromptTokensDetails] = deriveEncoder[CompletionUsagePromptTokensDetails].mapJson(_.dropNullValues)
  implicit val decoderCompletionUsagePromptTokensDetails: Decoder[CompletionUsagePromptTokensDetails] = deriveDecoder[CompletionUsagePromptTokensDetails]
}

/**
* The aggregated costs details of the specific time bucket.
* @param `object` 
* @param amount 
* @param lineUnderscoreitem When `group_by=line_item`, this field provides the line item of the grouped costs result.
* @param projectUnderscoreid When `group_by=project_id`, this field provides the project ID of the grouped costs result.
*/

case class CostsResult(
  `object`: String,
  amount: Option[CostsResultAmount],
  lineUnderscoreitem: Option[String],
  projectUnderscoreid: Option[String]
) extends UsageTimeBucketResultInner
object CostsResult {
  implicit val encoderCostsResult: Encoder[CostsResult] = deriveEncoder[CostsResult].mapJson(_.dropNullValues)
  implicit val decoderCostsResult: Decoder[CostsResult] = deriveDecoder[CostsResult]
}

/**
* The monetary value in its associated currency.
* @param value The numeric value of the cost.
* @param currency Lowercase ISO-4217 currency e.g. \"usd\"
*/

case class CostsResultAmount(
  value: Option[BigDecimal],
  currency: Option[String]
)
object CostsResultAmount {
  implicit val encoderCostsResultAmount: Encoder[CostsResultAmount] = deriveEncoder[CostsResultAmount].mapJson(_.dropNullValues)
  implicit val decoderCostsResultAmount: Decoder[CostsResultAmount] = deriveDecoder[CostsResultAmount]
}

/**
* 
* @param model 
* @param name The name of the assistant. The maximum length is 256 characters. 
* @param description The description of the assistant. The maximum length is 512 characters. 
* @param instructions The system instructions that the assistant uses. The maximum length is 256,000 characters. 
* @param tools A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `file_search`, or `function`. 
* @param toolUnderscoreresources 
* @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
* @param temperature What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
* @param topUnderscorep An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. 
* @param responseUnderscoreformat 
*/

case class CreateAssistantRequest(
  model: CreateAssistantRequestModel,
  name: Option[Refined[String, MaxSize[256]]],
  description: Option[Refined[String, MaxSize[512]]],
  instructions: Option[Refined[String, MaxSize[256000]]],
  tools: Option[Refined[List[CreateAssistantRequestToolsInner], MaxSize[128]]],
  toolUnderscoreresources: Option[CreateAssistantRequestToolResources],
  metadata: Option[Object],
  temperature: Option[Refined[BigDecimal, GreaterEqual[0] And LessEqual[2]]],
  topUnderscorep: Option[Refined[BigDecimal, GreaterEqual[0] And LessEqual[1]]],
  responseUnderscoreformat: Option[AssistantsApiResponseFormatOption]
)
object CreateAssistantRequest {
  implicit val encoderCreateAssistantRequest: Encoder[CreateAssistantRequest] = deriveEncoder[CreateAssistantRequest].mapJson(_.dropNullValues)
  implicit val decoderCreateAssistantRequest: Decoder[CreateAssistantRequest] = deriveDecoder[CreateAssistantRequest]
}

/**
* ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models) for descriptions of them. 
*/

case class CreateAssistantRequestModel(
)
object CreateAssistantRequestModel {
  implicit val encoderCreateAssistantRequestModel: Encoder[CreateAssistantRequestModel] = deriveEncoder[CreateAssistantRequestModel].mapJson(_.dropNullValues)
  implicit val decoderCreateAssistantRequestModel: Decoder[CreateAssistantRequestModel] = deriveDecoder[CreateAssistantRequestModel]
}

/**
* A set of resources that are used by the assistant's tools. The resources are specific to the type of tool. For example, the `code_interpreter` tool requires a list of file IDs, while the `file_search` tool requires a list of vector store IDs. 
* @param codeUnderscoreinterpreter 
* @param fileUnderscoresearch 
*/

case class CreateAssistantRequestToolResources(
  codeUnderscoreinterpreter: Option[CreateAssistantRequestToolResourcesCodeInterpreter],
  fileUnderscoresearch: Option[CreateAssistantRequestToolResourcesFileSearch]
)
object CreateAssistantRequestToolResources {
  implicit val encoderCreateAssistantRequestToolResources: Encoder[CreateAssistantRequestToolResources] = deriveEncoder[CreateAssistantRequestToolResources].mapJson(_.dropNullValues)
  implicit val decoderCreateAssistantRequestToolResources: Decoder[CreateAssistantRequestToolResources] = deriveDecoder[CreateAssistantRequestToolResources]
}

/**
* 
* @param fileUnderscoreids A list of [file](/docs/api-reference/files) IDs made available to the `code_interpreter` tool. There can be a maximum of 20 files associated with the tool. 
*/

case class CreateAssistantRequestToolResourcesCodeInterpreter(
  fileUnderscoreids: Option[Refined[List[String], MaxSize[20]]]
)
object CreateAssistantRequestToolResourcesCodeInterpreter {
  implicit val encoderCreateAssistantRequestToolResourcesCodeInterpreter: Encoder[CreateAssistantRequestToolResourcesCodeInterpreter] = deriveEncoder[CreateAssistantRequestToolResourcesCodeInterpreter].mapJson(_.dropNullValues)
  implicit val decoderCreateAssistantRequestToolResourcesCodeInterpreter: Decoder[CreateAssistantRequestToolResourcesCodeInterpreter] = deriveDecoder[CreateAssistantRequestToolResourcesCodeInterpreter]
}

/**
* 
* @param vectorUnderscorestoreUnderscoreids The [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant. 
* @param vectorUnderscorestores A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this assistant. There can be a maximum of 1 vector store attached to the assistant. 
*/

case class CreateAssistantRequestToolResourcesFileSearch(
  vectorUnderscorestoreUnderscoreids: Option[Refined[List[String], MaxSize[1]]],
  vectorUnderscorestores: Option[Refined[List[CreateAssistantRequestToolResourcesFileSearchVectorStoresInner], MaxSize[1]]]
)
object CreateAssistantRequestToolResourcesFileSearch {
  implicit val encoderCreateAssistantRequestToolResourcesFileSearch: Encoder[CreateAssistantRequestToolResourcesFileSearch] = deriveEncoder[CreateAssistantRequestToolResourcesFileSearch].mapJson(_.dropNullValues)
  implicit val decoderCreateAssistantRequestToolResourcesFileSearch: Decoder[CreateAssistantRequestToolResourcesFileSearch] = deriveDecoder[CreateAssistantRequestToolResourcesFileSearch]
}

/**
* 
* @param fileUnderscoreids A list of [file](/docs/api-reference/files) IDs to add to the vector store. There can be a maximum of 10000 files in a vector store. 
* @param chunkingUnderscorestrategy 
* @param metadata Set of 16 key-value pairs that can be attached to a vector store. This can be useful for storing additional information about the vector store in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
*/

case class CreateAssistantRequestToolResourcesFileSearchVectorStoresInner(
  fileUnderscoreids: Option[Refined[List[String], MaxSize[10000]]],
  chunkingUnderscorestrategy: Option[CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy],
  metadata: Option[Object]
)
object CreateAssistantRequestToolResourcesFileSearchVectorStoresInner {
  implicit val encoderCreateAssistantRequestToolResourcesFileSearchVectorStoresInner: Encoder[CreateAssistantRequestToolResourcesFileSearchVectorStoresInner] = deriveEncoder[CreateAssistantRequestToolResourcesFileSearchVectorStoresInner].mapJson(_.dropNullValues)
  implicit val decoderCreateAssistantRequestToolResourcesFileSearchVectorStoresInner: Decoder[CreateAssistantRequestToolResourcesFileSearchVectorStoresInner] = deriveDecoder[CreateAssistantRequestToolResourcesFileSearchVectorStoresInner]
}

/**
* The chunking strategy used to chunk the file(s). If not set, will use the `auto` strategy.
* @param `type` Always `auto`.
* @param `static` 
*/
sealed trait CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy
object CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val createAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategyEncoder: Encoder[CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy] = Encoder.instance {
    case autoChunkingStrategyRequestParam: AutoChunkingStrategyRequestParam => autoChunkingStrategyRequestParam.asJson
    case staticChunkingStrategy: StaticChunkingStrategy => staticChunkingStrategy.asJson
  }

  implicit val createAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategyDecoder: Decoder[CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy] =
    List[Decoder[CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy]](
      Decoder[AutoChunkingStrategyRequestParam].widen,
      Decoder[StaticChunkingStrategy].widen,
  ).reduceLeft(_ or _)
}


/**
* 
* @param `type` The type of tool being defined: `code_interpreter`
* @param fileUnderscoresearch 
* @param function 
*/
sealed trait CreateAssistantRequestToolsInner
object CreateAssistantRequestToolsInner {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val createAssistantRequestToolsInnerEncoder: Encoder[CreateAssistantRequestToolsInner] = Encoder.instance {
    case assistantToolsCode: AssistantToolsCode => assistantToolsCode.asJson
    case assistantToolsFileSearch: AssistantToolsFileSearch => assistantToolsFileSearch.asJson
    case assistantToolsFunction: AssistantToolsFunction => assistantToolsFunction.asJson
  }

  implicit val createAssistantRequestToolsInnerDecoder: Decoder[CreateAssistantRequestToolsInner] =
    List[Decoder[CreateAssistantRequestToolsInner]](
      Decoder[AssistantToolsCode].widen,
      Decoder[AssistantToolsFileSearch].widen,
      Decoder[AssistantToolsFunction].widen,
  ).reduceLeft(_ or _)
}


/**
* 
* @param inputUnderscorefileUnderscoreid The ID of an uploaded file that contains requests for the new batch.  See [upload file](/docs/api-reference/files/create) for how to upload a file.  Your input file must be formatted as a [JSONL file](/docs/api-reference/batch/request-input), and must be uploaded with the purpose `batch`. The file can contain up to 50,000 requests, and can be up to 200 MB in size. 
* @param endpoint The endpoint to be used for all requests in the batch. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported. Note that `/v1/embeddings` batches are also restricted to a maximum of 50,000 embedding inputs across all requests in the batch.
* @param completionUnderscorewindow The time frame within which the batch should be processed. Currently only `24h` is supported.
* @param metadata Optional custom metadata for the batch.
*/

case class CreateBatchRequest(
  inputUnderscorefileUnderscoreid: String,
  endpoint: String,
  completionUnderscorewindow: String,
  metadata: Option[Map[String, String]]
)
object CreateBatchRequest {
  implicit val encoderCreateBatchRequest: Encoder[CreateBatchRequest] = deriveEncoder[CreateBatchRequest].mapJson(_.dropNullValues)
  implicit val decoderCreateBatchRequest: Decoder[CreateBatchRequest] = deriveDecoder[CreateBatchRequest]
}

/**
* Represents a chat completion response returned by model, based on the provided input.
* @param id A unique identifier for the chat completion.
* @param choices A list of chat completion choices. Can be more than one if `n` is greater than 1.
* @param created The Unix timestamp (in seconds) of when the chat completion was created.
* @param model The model used for the chat completion.
* @param systemUnderscorefingerprint This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
* @param `object` The object type, which is always `chat.completion`.
* @param usage 
*/

case class CreateChatCompletionFunctionResponse(
  id: String,
  choices: List[CreateChatCompletionFunctionResponseChoicesInner],
  created: Int,
  model: String,
  systemUnderscorefingerprint: Option[String],
  `object`: String,
  usage: Option[CompletionUsage]
)
object CreateChatCompletionFunctionResponse {
  implicit val encoderCreateChatCompletionFunctionResponse: Encoder[CreateChatCompletionFunctionResponse] = deriveEncoder[CreateChatCompletionFunctionResponse].mapJson(_.dropNullValues)
  implicit val decoderCreateChatCompletionFunctionResponse: Decoder[CreateChatCompletionFunctionResponse] = deriveDecoder[CreateChatCompletionFunctionResponse]
}

/**
* 
* @param finishUnderscorereason The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, or `function_call` if the model called a function. 
* @param index The index of the choice in the list of choices.
* @param message 
*/

case class CreateChatCompletionFunctionResponseChoicesInner(
  finishUnderscorereason: String,
  index: Int,
  message: ChatCompletionResponseMessage
)
object CreateChatCompletionFunctionResponseChoicesInner {
  implicit val encoderCreateChatCompletionFunctionResponseChoicesInner: Encoder[CreateChatCompletionFunctionResponseChoicesInner] = deriveEncoder[CreateChatCompletionFunctionResponseChoicesInner].mapJson(_.dropNullValues)
  implicit val decoderCreateChatCompletionFunctionResponseChoicesInner: Decoder[CreateChatCompletionFunctionResponseChoicesInner] = deriveDecoder[CreateChatCompletionFunctionResponseChoicesInner]
}

/**
* 
* @param messages A list of messages comprising the conversation so far. Depending on the [model](/docs/models) you use, different message types (modalities) are supported, like [text](/docs/guides/text-generation), [images](/docs/guides/vision), and [audio](/docs/guides/audio). 
* @param model 
* @param store Whether or not to store the output of this chat completion request for  use in our [model distillation](/docs/guides/distillation) or [evals](/docs/guides/evals) products. 
* @param reasoningUnderscoreeffort **o1 models only**   Constrains effort on reasoning for  [reasoning models](https://platform.openai.com/docs/guides/reasoning). Currently supported values are `low`, `medium`, and `high`. Reducing reasoning effort can result in faster responses and fewer tokens used on reasoning in a response. 
* @param metadata Developer-defined tags and values used for filtering completions in the [dashboard](https://platform.openai.com/chat-completions). 
* @param frequencyUnderscorepenalty Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model's likelihood to repeat the same line verbatim. 
* @param logitUnderscorebias Modify the likelihood of specified tokens appearing in the completion.  Accepts a JSON object that maps tokens (specified by their token ID in the tokenizer) to an associated bias value from -100 to 100. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token. 
* @param logprobs Whether to return log probabilities of the output tokens or not. If true, returns the log probabilities of each output token returned in the `content` of `message`. 
* @param topUnderscorelogprobs An integer between 0 and 20 specifying the number of most likely tokens to return at each token position, each with an associated log probability. `logprobs` must be set to `true` if this parameter is used. 
* @param maxUnderscoretokens The maximum number of [tokens](/tokenizer) that can be generated in the chat completion. This value can be used to control [costs](https://openai.com/api/pricing/) for text generated via API.  This value is now deprecated in favor of `max_completion_tokens`, and is not compatible with [o1 series models](/docs/guides/reasoning). 
* @param maxUnderscorecompletionUnderscoretokens An upper bound for the number of tokens that can be generated for a completion, including visible output tokens and [reasoning tokens](/docs/guides/reasoning). 
* @param n How many chat completion choices to generate for each input message. Note that you will be charged based on the number of generated tokens across all of the choices. Keep `n` as `1` to minimize costs.
* @param modalities Output types that you would like the model to generate for this request. Most models are capable of generating text, which is the default:  `[\"text\"]`  The `gpt-4o-audio-preview` model can also be used to [generate audio](/docs/guides/audio). To request that this model generate both text and audio responses, you can use:  `[\"text\", \"audio\"]` 
* @param prediction Configuration for a [Predicted Output](/docs/guides/predicted-outputs), which can greatly improve response times when large parts of the model response are known ahead of time. This is most common when you are regenerating a file with only minor changes to most of the content. 
* @param audio 
* @param presenceUnderscorepenalty Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model's likelihood to talk about new topics. 
* @param responseUnderscoreformat 
* @param seed This feature is in Beta. If specified, our system will make a best effort to sample deterministically, such that repeated requests with the same `seed` and parameters should return the same result. Determinism is not guaranteed, and you should refer to the `system_fingerprint` response parameter to monitor changes in the backend. 
* @param serviceUnderscoretier Specifies the latency tier to use for processing the request. This parameter is relevant for customers subscribed to the scale tier service:    - If set to 'auto', and the Project is Scale tier enabled, the system will utilize scale tier credits until they are exhausted.   - If set to 'auto', and the Project is not Scale tier enabled, the request will be processed using the default service tier with a lower uptime SLA and no latency guarentee.   - If set to 'default', the request will be processed using the default service tier with a lower uptime SLA and no latency guarentee.   - When not set, the default behavior is 'auto'.    When this parameter is set, the response body will include the `service_tier` utilized. 
* @param stop 
* @param stream If set, partial message deltas will be sent, like in ChatGPT. Tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://cookbook.openai.com/examples/how_to_stream_completions). 
* @param streamUnderscoreoptions 
* @param temperature What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. We generally recommend altering this or `top_p` but not both. 
* @param topUnderscorep An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. 
* @param tools A list of tools the model may call. Currently, only functions are supported as a tool. Use this to provide a list of functions the model may generate JSON inputs for. A max of 128 functions are supported. 
* @param toolUnderscorechoice 
* @param parallelUnderscoretoolUnderscorecalls Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
* @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
* @param functionUnderscorecall 
* @param functions Deprecated in favor of `tools`.  A list of functions the model may generate JSON inputs for. 
*/

case class CreateChatCompletionRequest(
  messages: Refined[List[ChatCompletionRequestMessage], MinSize[1]],
  model: CreateChatCompletionRequestModel,
  store: Option[Boolean],
  reasoningUnderscoreeffort: Option[String],
  metadata: Option[Map[String, String]],
  frequencyUnderscorepenalty: Option[Refined[BigDecimal, GreaterEqual[-2] And LessEqual[2]]],
  logitUnderscorebias: Option[Map[String, Int]],
  logprobs: Option[Boolean],
  topUnderscorelogprobs: Option[Refined[Int, GreaterEqual[0] And LessEqual[20]]],
  maxUnderscoretokens: Option[Int],
  maxUnderscorecompletionUnderscoretokens: Option[Int],
  n: Option[Refined[Int, GreaterEqual[1] And LessEqual[128]]],
  modalities: Option[List[String]],
  prediction: Option[PredictionContent],
  audio: Option[CreateChatCompletionRequestAudio],
  presenceUnderscorepenalty: Option[Refined[BigDecimal, GreaterEqual[-2] And LessEqual[2]]],
  responseUnderscoreformat: Option[CreateChatCompletionRequestResponseFormat],
  seed: Option[Refined[Int, GreaterEqual[-9223372036854776000] And LessEqual[9223372036854776000]]],
  serviceUnderscoretier: Option[String],
  stop: Option[CreateChatCompletionRequestStop],
  stream: Option[Boolean],
  streamUnderscoreoptions: Option[ChatCompletionStreamOptions],
  temperature: Option[Refined[BigDecimal, GreaterEqual[0] And LessEqual[2]]],
  topUnderscorep: Option[Refined[BigDecimal, GreaterEqual[0] And LessEqual[1]]],
  tools: Option[List[ChatCompletionTool]],
  toolUnderscorechoice: Option[ChatCompletionToolChoiceOption],
  parallelUnderscoretoolUnderscorecalls: Option[Boolean],
  user: Option[String],
  functionUnderscorecall: Option[CreateChatCompletionRequestFunctionCall],
  functions: Option[Refined[List[ChatCompletionFunctions], MinSize[1] And MaxSize[128]]]
)
object CreateChatCompletionRequest {
  implicit val encoderCreateChatCompletionRequest: Encoder[CreateChatCompletionRequest] = deriveEncoder[CreateChatCompletionRequest].mapJson(_.dropNullValues)
  implicit val decoderCreateChatCompletionRequest: Decoder[CreateChatCompletionRequest] = deriveDecoder[CreateChatCompletionRequest]
}

/**
* Parameters for audio output. Required when audio output is requested with `modalities: [\"audio\"]`. [Learn more](/docs/guides/audio). 
* @param voice The voice the model uses to respond. Supported voices are `ash`, `ballad`, `coral`, `sage`, and `verse` (also supported but not recommended are `alloy`, `echo`, and `shimmer`; these voices are less expressive). 
* @param format Specifies the output audio format. Must be one of `wav`, `mp3`, `flac`, `opus`, or `pcm16`. 
*/

case class CreateChatCompletionRequestAudio(
  voice: String,
  format: String
)
object CreateChatCompletionRequestAudio {
  implicit val encoderCreateChatCompletionRequestAudio: Encoder[CreateChatCompletionRequestAudio] = deriveEncoder[CreateChatCompletionRequestAudio].mapJson(_.dropNullValues)
  implicit val decoderCreateChatCompletionRequestAudio: Decoder[CreateChatCompletionRequestAudio] = deriveDecoder[CreateChatCompletionRequestAudio]
}

/**
* Deprecated in favor of `tool_choice`.  Controls which (if any) function is called by the model.  `none` means the model will not call a function and instead generates a message.  `auto` means the model can pick between generating a message or calling a function.  Specifying a particular function via `{\"name\": \"my_function\"}` forces the model to call that function.  `none` is the default when no functions are present. `auto` is the default if functions are present. 
* @param name The name of the function to call.
*/
sealed trait CreateChatCompletionRequestFunctionCall
object CreateChatCompletionRequestFunctionCall {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val createChatCompletionRequestFunctionCallEncoder: Encoder[CreateChatCompletionRequestFunctionCall] = Encoder.instance {
    case chatCompletionFunctionCallOption: ChatCompletionFunctionCallOption => chatCompletionFunctionCallOption.asJson
    case string: String => string.asJson
  }

  implicit val createChatCompletionRequestFunctionCallDecoder: Decoder[CreateChatCompletionRequestFunctionCall] =
    List[Decoder[CreateChatCompletionRequestFunctionCall]](
      Decoder[ChatCompletionFunctionCallOption].widen,
      Decoder[String].widen,
  ).reduceLeft(_ or _)
}


/**
* ID of the model to use. See the [model endpoint compatibility](/docs/models#model-endpoint-compatibility) table for details on which models work with the Chat API.
*/

case class CreateChatCompletionRequestModel(
)
object CreateChatCompletionRequestModel {
  implicit val encoderCreateChatCompletionRequestModel: Encoder[CreateChatCompletionRequestModel] = deriveEncoder[CreateChatCompletionRequestModel].mapJson(_.dropNullValues)
  implicit val decoderCreateChatCompletionRequestModel: Decoder[CreateChatCompletionRequestModel] = deriveDecoder[CreateChatCompletionRequestModel]
}

/**
* An object specifying the format that the model must output.  Setting to `{ \"type\": \"json_schema\", \"json_schema\": {...} }` enables Structured Outputs which ensures the model will match your supplied JSON schema. Learn more in the [Structured Outputs guide](/docs/guides/structured-outputs).  Setting to `{ \"type\": \"json_object\" }` enables JSON mode, which ensures the message the model generates is valid JSON.  **Important:** when using JSON mode, you **must** also instruct the model to produce JSON yourself via a system or user message. Without this, the model may generate an unending stream of whitespace until the generation reaches the token limit, resulting in a long-running and seemingly \"stuck\" request. Also note that the message content may be partially cut off if `finish_reason=\"length\"`, which indicates the generation exceeded `max_tokens` or the conversation exceeded the max context length. 
* @param `type` The type of response format being defined: `text`
* @param jsonUnderscoreschema 
*/
sealed trait CreateChatCompletionRequestResponseFormat
object CreateChatCompletionRequestResponseFormat {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val createChatCompletionRequestResponseFormatEncoder: Encoder[CreateChatCompletionRequestResponseFormat] = Encoder.instance {
    case responseFormatJsonObject: ResponseFormatJsonObject => responseFormatJsonObject.asJson
    case responseFormatJsonSchema: ResponseFormatJsonSchema => responseFormatJsonSchema.asJson
    case responseFormatText: ResponseFormatText => responseFormatText.asJson
  }

  implicit val createChatCompletionRequestResponseFormatDecoder: Decoder[CreateChatCompletionRequestResponseFormat] =
    List[Decoder[CreateChatCompletionRequestResponseFormat]](
      Decoder[ResponseFormatJsonObject].widen,
      Decoder[ResponseFormatJsonSchema].widen,
      Decoder[ResponseFormatText].widen,
  ).reduceLeft(_ or _)
}


/**
* Up to 4 sequences where the API will stop generating further tokens. 
*/
sealed trait CreateChatCompletionRequestStop
object CreateChatCompletionRequestStop {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val createChatCompletionRequestStopEncoder: Encoder[CreateChatCompletionRequestStop] = Encoder.instance {
    case list_String: List[String] => list_String.asJson
    case string: String => string.asJson
  }

  implicit val createChatCompletionRequestStopDecoder: Decoder[CreateChatCompletionRequestStop] =
    List[Decoder[CreateChatCompletionRequestStop]](
      Decoder[List[String]].widen,
      Decoder[String].widen,
  ).reduceLeft(_ or _)
}


/**
* Represents a chat completion response returned by model, based on the provided input.
* @param id A unique identifier for the chat completion.
* @param choices A list of chat completion choices. Can be more than one if `n` is greater than 1.
* @param created The Unix timestamp (in seconds) of when the chat completion was created.
* @param model The model used for the chat completion.
* @param serviceUnderscoretier The service tier used for processing the request. This field is only included if the `service_tier` parameter is specified in the request.
* @param systemUnderscorefingerprint This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
* @param `object` The object type, which is always `chat.completion`.
* @param usage 
*/

case class CreateChatCompletionResponse(
  id: String,
  choices: List[CreateChatCompletionResponseChoicesInner],
  created: Int,
  model: String,
  serviceUnderscoretier: Option[String],
  systemUnderscorefingerprint: Option[String],
  `object`: String,
  usage: Option[CompletionUsage]
)
object CreateChatCompletionResponse {
  implicit val encoderCreateChatCompletionResponse: Encoder[CreateChatCompletionResponse] = deriveEncoder[CreateChatCompletionResponse].mapJson(_.dropNullValues)
  implicit val decoderCreateChatCompletionResponse: Decoder[CreateChatCompletionResponse] = deriveDecoder[CreateChatCompletionResponse]
}

/**
* 
* @param finishUnderscorereason The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function. 
* @param index The index of the choice in the list of choices.
* @param message 
* @param logprobs 
*/

case class CreateChatCompletionResponseChoicesInner(
  finishUnderscorereason: String,
  index: Int,
  message: ChatCompletionResponseMessage,
  logprobs: CreateChatCompletionResponseChoicesInnerLogprobs
)
object CreateChatCompletionResponseChoicesInner {
  implicit val encoderCreateChatCompletionResponseChoicesInner: Encoder[CreateChatCompletionResponseChoicesInner] = deriveEncoder[CreateChatCompletionResponseChoicesInner].mapJson(_.dropNullValues)
  implicit val decoderCreateChatCompletionResponseChoicesInner: Decoder[CreateChatCompletionResponseChoicesInner] = deriveDecoder[CreateChatCompletionResponseChoicesInner]
}

/**
* Log probability information for the choice.
* @param content A list of message content tokens with log probability information.
* @param refusal A list of message refusal tokens with log probability information.
*/

case class CreateChatCompletionResponseChoicesInnerLogprobs(
  content: List[ChatCompletionTokenLogprob],
  refusal: List[ChatCompletionTokenLogprob]
)
object CreateChatCompletionResponseChoicesInnerLogprobs {
  implicit val encoderCreateChatCompletionResponseChoicesInnerLogprobs: Encoder[CreateChatCompletionResponseChoicesInnerLogprobs] = deriveEncoder[CreateChatCompletionResponseChoicesInnerLogprobs].mapJson(_.dropNullValues)
  implicit val decoderCreateChatCompletionResponseChoicesInnerLogprobs: Decoder[CreateChatCompletionResponseChoicesInnerLogprobs] = deriveDecoder[CreateChatCompletionResponseChoicesInnerLogprobs]
}

/**
* Represents a streamed chunk of a chat completion response returned by model, based on the provided input.
* @param id A unique identifier for the chat completion. Each chunk has the same ID.
* @param choices A list of chat completion choices. Can contain more than one elements if `n` is greater than 1. Can also be empty for the last chunk if you set `stream_options: {\"include_usage\": true}`. 
* @param created The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp.
* @param model The model to generate the completion.
* @param serviceUnderscoretier The service tier used for processing the request. This field is only included if the `service_tier` parameter is specified in the request.
* @param systemUnderscorefingerprint This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
* @param `object` The object type, which is always `chat.completion.chunk`.
* @param usage 
*/

case class CreateChatCompletionStreamResponse(
  id: String,
  choices: List[CreateChatCompletionStreamResponseChoicesInner],
  created: Int,
  model: String,
  serviceUnderscoretier: Option[String],
  systemUnderscorefingerprint: Option[String],
  `object`: String,
  usage: Option[CreateChatCompletionStreamResponseUsage]
)
object CreateChatCompletionStreamResponse {
  implicit val encoderCreateChatCompletionStreamResponse: Encoder[CreateChatCompletionStreamResponse] = deriveEncoder[CreateChatCompletionStreamResponse].mapJson(_.dropNullValues)
  implicit val decoderCreateChatCompletionStreamResponse: Decoder[CreateChatCompletionStreamResponse] = deriveDecoder[CreateChatCompletionStreamResponse]
}

/**
* 
* @param delta 
* @param logprobs 
* @param finishUnderscorereason The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function. 
* @param index The index of the choice in the list of choices.
*/

case class CreateChatCompletionStreamResponseChoicesInner(
  delta: ChatCompletionStreamResponseDelta,
  logprobs: Option[CreateChatCompletionStreamResponseChoicesInnerLogprobs],
  finishUnderscorereason: String,
  index: Int
)
object CreateChatCompletionStreamResponseChoicesInner {
  implicit val encoderCreateChatCompletionStreamResponseChoicesInner: Encoder[CreateChatCompletionStreamResponseChoicesInner] = deriveEncoder[CreateChatCompletionStreamResponseChoicesInner].mapJson(_.dropNullValues)
  implicit val decoderCreateChatCompletionStreamResponseChoicesInner: Decoder[CreateChatCompletionStreamResponseChoicesInner] = deriveDecoder[CreateChatCompletionStreamResponseChoicesInner]
}

/**
* Log probability information for the choice.
* @param content A list of message content tokens with log probability information.
* @param refusal A list of message refusal tokens with log probability information.
*/

case class CreateChatCompletionStreamResponseChoicesInnerLogprobs(
  content: List[ChatCompletionTokenLogprob],
  refusal: List[ChatCompletionTokenLogprob]
)
object CreateChatCompletionStreamResponseChoicesInnerLogprobs {
  implicit val encoderCreateChatCompletionStreamResponseChoicesInnerLogprobs: Encoder[CreateChatCompletionStreamResponseChoicesInnerLogprobs] = deriveEncoder[CreateChatCompletionStreamResponseChoicesInnerLogprobs].mapJson(_.dropNullValues)
  implicit val decoderCreateChatCompletionStreamResponseChoicesInnerLogprobs: Decoder[CreateChatCompletionStreamResponseChoicesInnerLogprobs] = deriveDecoder[CreateChatCompletionStreamResponseChoicesInnerLogprobs]
}

/**
* An optional field that will only be present when you set `stream_options: {\"include_usage\": true}` in your request. When present, it contains a null value except for the last chunk which contains the token usage statistics for the entire request. 
* @param completionUnderscoretokens Number of tokens in the generated completion.
* @param promptUnderscoretokens Number of tokens in the prompt.
* @param totalUnderscoretokens Total number of tokens used in the request (prompt + completion).
*/

case class CreateChatCompletionStreamResponseUsage(
  completionUnderscoretokens: Int,
  promptUnderscoretokens: Int,
  totalUnderscoretokens: Int
)
object CreateChatCompletionStreamResponseUsage {
  implicit val encoderCreateChatCompletionStreamResponseUsage: Encoder[CreateChatCompletionStreamResponseUsage] = deriveEncoder[CreateChatCompletionStreamResponseUsage].mapJson(_.dropNullValues)
  implicit val decoderCreateChatCompletionStreamResponseUsage: Decoder[CreateChatCompletionStreamResponseUsage] = deriveDecoder[CreateChatCompletionStreamResponseUsage]
}

/**
* 
* @param model 
* @param prompt 
* @param bestUnderscoreof Generates `best_of` completions server-side and returns the \"best\" (the one with the highest log probability per token). Results cannot be streamed.  When used with `n`, `best_of` controls the number of candidate completions and `n` specifies how many to return – `best_of` must be greater than `n`.  **Note:** Because this parameter generates many completions, it can quickly consume your token quota. Use carefully and ensure that you have reasonable settings for `max_tokens` and `stop`. 
* @param echo Echo back the prompt in addition to the completion 
* @param frequencyUnderscorepenalty Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model's likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/guides/text-generation) 
* @param logitUnderscorebias Modify the likelihood of specified tokens appearing in the completion.  Accepts a JSON object that maps tokens (specified by their token ID in the GPT tokenizer) to an associated bias value from -100 to 100. You can use this [tokenizer tool](/tokenizer?view=bpe) to convert text to token IDs. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token.  As an example, you can pass `{\"50256\": -100}` to prevent the <|endoftext|> token from being generated. 
* @param logprobs Include the log probabilities on the `logprobs` most likely output tokens, as well the chosen tokens. For example, if `logprobs` is 5, the API will return a list of the 5 most likely tokens. The API will always return the `logprob` of the sampled token, so there may be up to `logprobs+1` elements in the response.  The maximum value for `logprobs` is 5. 
* @param maxUnderscoretokens The maximum number of [tokens](/tokenizer) that can be generated in the completion.  The token count of your prompt plus `max_tokens` cannot exceed the model's context length. [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken) for counting tokens. 
* @param n How many completions to generate for each prompt.  **Note:** Because this parameter generates many completions, it can quickly consume your token quota. Use carefully and ensure that you have reasonable settings for `max_tokens` and `stop`. 
* @param presenceUnderscorepenalty Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model's likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/guides/text-generation) 
* @param seed If specified, our system will make a best effort to sample deterministically, such that repeated requests with the same `seed` and parameters should return the same result.  Determinism is not guaranteed, and you should refer to the `system_fingerprint` response parameter to monitor changes in the backend. 
* @param stop 
* @param stream Whether to stream back partial progress. If set, tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://cookbook.openai.com/examples/how_to_stream_completions). 
* @param streamUnderscoreoptions 
* @param suffix The suffix that comes after a completion of inserted text.  This parameter is only supported for `gpt-3.5-turbo-instruct`. 
* @param temperature What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both. 
* @param topUnderscorep An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. 
* @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
*/

case class CreateCompletionRequest(
  model: CreateCompletionRequestModel,
  prompt: CreateCompletionRequestPrompt,
  bestUnderscoreof: Option[Refined[Int, GreaterEqual[0] And LessEqual[20]]],
  echo: Option[Boolean],
  frequencyUnderscorepenalty: Option[Refined[BigDecimal, GreaterEqual[-2] And LessEqual[2]]],
  logitUnderscorebias: Option[Map[String, Int]],
  logprobs: Option[Refined[Int, GreaterEqual[0] And LessEqual[5]]],
  maxUnderscoretokens: Option[Refined[Int, GreaterEqual[0]]],
  n: Option[Refined[Int, GreaterEqual[1] And LessEqual[128]]],
  presenceUnderscorepenalty: Option[Refined[BigDecimal, GreaterEqual[-2] And LessEqual[2]]],
  seed: Option[Refined[Int, GreaterEqual[-9223372036854776000] And LessEqual[9223372036854776000]]],
  stop: Option[CreateCompletionRequestStop],
  stream: Option[Boolean],
  streamUnderscoreoptions: Option[ChatCompletionStreamOptions],
  suffix: Option[String],
  temperature: Option[Refined[BigDecimal, GreaterEqual[0] And LessEqual[2]]],
  topUnderscorep: Option[Refined[BigDecimal, GreaterEqual[0] And LessEqual[1]]],
  user: Option[String]
)
object CreateCompletionRequest {
  implicit val encoderCreateCompletionRequest: Encoder[CreateCompletionRequest] = deriveEncoder[CreateCompletionRequest].mapJson(_.dropNullValues)
  implicit val decoderCreateCompletionRequest: Decoder[CreateCompletionRequest] = deriveDecoder[CreateCompletionRequest]
}

/**
* ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models) for descriptions of them. 
*/

case class CreateCompletionRequestModel(
)
object CreateCompletionRequestModel {
  implicit val encoderCreateCompletionRequestModel: Encoder[CreateCompletionRequestModel] = deriveEncoder[CreateCompletionRequestModel].mapJson(_.dropNullValues)
  implicit val decoderCreateCompletionRequestModel: Decoder[CreateCompletionRequestModel] = deriveDecoder[CreateCompletionRequestModel]
}

/**
* The prompt(s) to generate completions for, encoded as a string, array of strings, array of tokens, or array of token arrays.  Note that <|endoftext|> is the document separator that the model sees during training, so if a prompt is not specified the model will generate as if from the beginning of a new document. 
*/
sealed trait CreateCompletionRequestPrompt
object CreateCompletionRequestPrompt {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val createCompletionRequestPromptEncoder: Encoder[CreateCompletionRequestPrompt] = Encoder.instance {
    case list_Int: List[Int] => list_Int.asJson
    case list_List_Int: List[List[Int]] => list_List_Int.asJson
    case list_String: List[String] => list_String.asJson
    case string: String => string.asJson
  }

  implicit val createCompletionRequestPromptDecoder: Decoder[CreateCompletionRequestPrompt] =
    List[Decoder[CreateCompletionRequestPrompt]](
      Decoder[List[Int]].widen,
      Decoder[List[List[Int]]].widen,
      Decoder[List[String]].widen,
      Decoder[String].widen,
  ).reduceLeft(_ or _)
}


/**
* Up to 4 sequences where the API will stop generating further tokens. The returned text will not contain the stop sequence. 
*/
sealed trait CreateCompletionRequestStop
object CreateCompletionRequestStop {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val createCompletionRequestStopEncoder: Encoder[CreateCompletionRequestStop] = Encoder.instance {
    case list_String: List[String] => list_String.asJson
    case string: String => string.asJson
  }

  implicit val createCompletionRequestStopDecoder: Decoder[CreateCompletionRequestStop] =
    List[Decoder[CreateCompletionRequestStop]](
      Decoder[List[String]].widen,
      Decoder[String].widen,
  ).reduceLeft(_ or _)
}


/**
* Represents a completion response from the API. Note: both the streamed and non-streamed response objects share the same shape (unlike the chat endpoint). 
* @param id A unique identifier for the completion.
* @param choices The list of completion choices the model generated for the input prompt.
* @param created The Unix timestamp (in seconds) of when the completion was created.
* @param model The model used for completion.
* @param systemUnderscorefingerprint This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
* @param `object` The object type, which is always \"text_completion\"
* @param usage 
*/

case class CreateCompletionResponse(
  id: String,
  choices: List[CreateCompletionResponseChoicesInner],
  created: Int,
  model: String,
  systemUnderscorefingerprint: Option[String],
  `object`: String,
  usage: Option[CompletionUsage]
)
object CreateCompletionResponse {
  implicit val encoderCreateCompletionResponse: Encoder[CreateCompletionResponse] = deriveEncoder[CreateCompletionResponse].mapJson(_.dropNullValues)
  implicit val decoderCreateCompletionResponse: Decoder[CreateCompletionResponse] = deriveDecoder[CreateCompletionResponse]
}

/**
* 
* @param finishUnderscorereason The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, or `content_filter` if content was omitted due to a flag from our content filters. 
* @param index 
* @param logprobs 
* @param text 
*/

case class CreateCompletionResponseChoicesInner(
  finishUnderscorereason: String,
  index: Int,
  logprobs: CreateCompletionResponseChoicesInnerLogprobs,
  text: String
)
object CreateCompletionResponseChoicesInner {
  implicit val encoderCreateCompletionResponseChoicesInner: Encoder[CreateCompletionResponseChoicesInner] = deriveEncoder[CreateCompletionResponseChoicesInner].mapJson(_.dropNullValues)
  implicit val decoderCreateCompletionResponseChoicesInner: Decoder[CreateCompletionResponseChoicesInner] = deriveDecoder[CreateCompletionResponseChoicesInner]
}

/**
* 
* @param textUnderscoreoffset 
* @param tokenUnderscorelogprobs 
* @param tokens 
* @param topUnderscorelogprobs 
*/

case class CreateCompletionResponseChoicesInnerLogprobs(
  textUnderscoreoffset: Option[List[Int]],
  tokenUnderscorelogprobs: Option[List[BigDecimal]],
  tokens: Option[List[String]],
  topUnderscorelogprobs: Option[List[Map[String, BigDecimal]]]
)
object CreateCompletionResponseChoicesInnerLogprobs {
  implicit val encoderCreateCompletionResponseChoicesInnerLogprobs: Encoder[CreateCompletionResponseChoicesInnerLogprobs] = deriveEncoder[CreateCompletionResponseChoicesInnerLogprobs].mapJson(_.dropNullValues)
  implicit val decoderCreateCompletionResponseChoicesInnerLogprobs: Decoder[CreateCompletionResponseChoicesInnerLogprobs] = deriveDecoder[CreateCompletionResponseChoicesInnerLogprobs]
}

/**
* 
* @param input 
* @param model 
* @param encodingUnderscoreformat The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/).
* @param dimensions The number of dimensions the resulting output embeddings should have. Only supported in `text-embedding-3` and later models. 
* @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
*/

case class CreateEmbeddingRequest(
  input: CreateEmbeddingRequestInput,
  model: CreateEmbeddingRequestModel,
  encodingUnderscoreformat: Option[String],
  dimensions: Option[Refined[Int, GreaterEqual[1]]],
  user: Option[String]
)
object CreateEmbeddingRequest {
  implicit val encoderCreateEmbeddingRequest: Encoder[CreateEmbeddingRequest] = deriveEncoder[CreateEmbeddingRequest].mapJson(_.dropNullValues)
  implicit val decoderCreateEmbeddingRequest: Decoder[CreateEmbeddingRequest] = deriveDecoder[CreateEmbeddingRequest]
}

/**
* Input text to embed, encoded as a string or array of tokens. To embed multiple inputs in a single request, pass an array of strings or array of token arrays. The input must not exceed the max input tokens for the model (8192 tokens for `text-embedding-ada-002`), cannot be an empty string, and any array must be 2048 dimensions or less. [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken) for counting tokens. 
*/
sealed trait CreateEmbeddingRequestInput
object CreateEmbeddingRequestInput {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val createEmbeddingRequestInputEncoder: Encoder[CreateEmbeddingRequestInput] = Encoder.instance {
    case list_Int: List[Int] => list_Int.asJson
    case list_List_Int: List[List[Int]] => list_List_Int.asJson
    case list_String: List[String] => list_String.asJson
    case string: String => string.asJson
  }

  implicit val createEmbeddingRequestInputDecoder: Decoder[CreateEmbeddingRequestInput] =
    List[Decoder[CreateEmbeddingRequestInput]](
      Decoder[List[Int]].widen,
      Decoder[List[List[Int]]].widen,
      Decoder[List[String]].widen,
      Decoder[String].widen,
  ).reduceLeft(_ or _)
}


/**
* ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models) for descriptions of them. 
*/

case class CreateEmbeddingRequestModel(
)
object CreateEmbeddingRequestModel {
  implicit val encoderCreateEmbeddingRequestModel: Encoder[CreateEmbeddingRequestModel] = deriveEncoder[CreateEmbeddingRequestModel].mapJson(_.dropNullValues)
  implicit val decoderCreateEmbeddingRequestModel: Decoder[CreateEmbeddingRequestModel] = deriveDecoder[CreateEmbeddingRequestModel]
}

/**
* 
* @param data The list of embeddings generated by the model.
* @param model The name of the model used to generate the embedding.
* @param `object` The object type, which is always \"list\".
* @param usage 
*/

case class CreateEmbeddingResponse(
  data: List[Embedding],
  model: String,
  `object`: String,
  usage: CreateEmbeddingResponseUsage
)
object CreateEmbeddingResponse {
  implicit val encoderCreateEmbeddingResponse: Encoder[CreateEmbeddingResponse] = deriveEncoder[CreateEmbeddingResponse].mapJson(_.dropNullValues)
  implicit val decoderCreateEmbeddingResponse: Decoder[CreateEmbeddingResponse] = deriveDecoder[CreateEmbeddingResponse]
}

/**
* The usage information for the request.
* @param promptUnderscoretokens The number of tokens used by the prompt.
* @param totalUnderscoretokens The total number of tokens used by the request.
*/

case class CreateEmbeddingResponseUsage(
  promptUnderscoretokens: Int,
  totalUnderscoretokens: Int
)
object CreateEmbeddingResponseUsage {
  implicit val encoderCreateEmbeddingResponseUsage: Encoder[CreateEmbeddingResponseUsage] = deriveEncoder[CreateEmbeddingResponseUsage].mapJson(_.dropNullValues)
  implicit val decoderCreateEmbeddingResponseUsage: Decoder[CreateEmbeddingResponseUsage] = deriveDecoder[CreateEmbeddingResponseUsage]
}

/**
* 
* @param model 
* @param trainingUnderscorefile The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/create) for how to upload a file.  Your dataset must be formatted as a JSONL file. Additionally, you must upload your file with the purpose `fine-tune`.  The contents of the file should differ depending on if the model uses the [chat](/docs/api-reference/fine-tuning/chat-input), [completions](/docs/api-reference/fine-tuning/completions-input) format, or if the fine-tuning method uses the [preference](/docs/api-reference/fine-tuning/preference-input) format.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. 
* @param hyperparameters 
* @param suffix A string of up to 64 characters that will be added to your fine-tuned model name.  For example, a `suffix` of \"custom-model-name\" would produce a model name like `ft:gpt-4o-mini:openai:custom-model-name:7p4lURel`. 
* @param validationUnderscorefile The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the fine-tuning results file. The same data should not be present in both train and validation files.  Your dataset must be formatted as a JSONL file. You must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. 
* @param integrations A list of integrations to enable for your fine-tuning job.
* @param seed The seed controls the reproducibility of the job. Passing in the same seed and job parameters should produce the same results, but may differ in rare cases. If a seed is not specified, one will be generated for you. 
* @param method 
*/

case class CreateFineTuningJobRequest(
  model: CreateFineTuningJobRequestModel,
  trainingUnderscorefile: String,
  hyperparameters: Option[CreateFineTuningJobRequestHyperparameters],
  suffix: Option[Refined[String, MinSize[1] And MaxSize[64]]],
  validationUnderscorefile: Option[String],
  integrations: Option[List[CreateFineTuningJobRequestIntegrationsInner]],
  seed: Option[Refined[Int, GreaterEqual[0] And LessEqual[2147483647]]],
  method: Option[FineTuneMethod]
)
object CreateFineTuningJobRequest {
  implicit val encoderCreateFineTuningJobRequest: Encoder[CreateFineTuningJobRequest] = deriveEncoder[CreateFineTuningJobRequest].mapJson(_.dropNullValues)
  implicit val decoderCreateFineTuningJobRequest: Decoder[CreateFineTuningJobRequest] = deriveDecoder[CreateFineTuningJobRequest]
}

/**
* The hyperparameters used for the fine-tuning job. This value is now deprecated in favor of `method`, and should be passed in under the `method` parameter. 
* @param batchUnderscoresize 
* @param learningUnderscorerateUnderscoremultiplier 
* @param nUnderscoreepochs 
*/

case class CreateFineTuningJobRequestHyperparameters(
  batchUnderscoresize: Option[CreateFineTuningJobRequestHyperparametersBatchSize],
  learningUnderscorerateUnderscoremultiplier: Option[CreateFineTuningJobRequestHyperparametersLearningRateMultiplier],
  nUnderscoreepochs: Option[CreateFineTuningJobRequestHyperparametersNEpochs]
)
object CreateFineTuningJobRequestHyperparameters {
  implicit val encoderCreateFineTuningJobRequestHyperparameters: Encoder[CreateFineTuningJobRequestHyperparameters] = deriveEncoder[CreateFineTuningJobRequestHyperparameters].mapJson(_.dropNullValues)
  implicit val decoderCreateFineTuningJobRequestHyperparameters: Decoder[CreateFineTuningJobRequestHyperparameters] = deriveDecoder[CreateFineTuningJobRequestHyperparameters]
}

/**
* Number of examples in each batch. A larger batch size means that model parameters are updated less frequently, but with lower variance. 
*/
sealed trait CreateFineTuningJobRequestHyperparametersBatchSize
object CreateFineTuningJobRequestHyperparametersBatchSize {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val createFineTuningJobRequestHyperparametersBatchSizeEncoder: Encoder[CreateFineTuningJobRequestHyperparametersBatchSize] = Encoder.instance {
    case `int`: Int => `int`.asJson
    case string: String => string.asJson
  }

  implicit val createFineTuningJobRequestHyperparametersBatchSizeDecoder: Decoder[CreateFineTuningJobRequestHyperparametersBatchSize] =
    List[Decoder[CreateFineTuningJobRequestHyperparametersBatchSize]](
      Decoder[Int].widen,
      Decoder[String].widen,
  ).reduceLeft(_ or _)
}


/**
* Scaling factor for the learning rate. A smaller learning rate may be useful to avoid overfitting. 
*/
sealed trait CreateFineTuningJobRequestHyperparametersLearningRateMultiplier
object CreateFineTuningJobRequestHyperparametersLearningRateMultiplier {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val createFineTuningJobRequestHyperparametersLearningRateMultiplierEncoder: Encoder[CreateFineTuningJobRequestHyperparametersLearningRateMultiplier] = Encoder.instance {
    case bigDecimal: BigDecimal => bigDecimal.asJson
    case string: String => string.asJson
  }

  implicit val createFineTuningJobRequestHyperparametersLearningRateMultiplierDecoder: Decoder[CreateFineTuningJobRequestHyperparametersLearningRateMultiplier] =
    List[Decoder[CreateFineTuningJobRequestHyperparametersLearningRateMultiplier]](
      Decoder[BigDecimal].widen,
      Decoder[String].widen,
  ).reduceLeft(_ or _)
}


/**
* The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. 
*/
sealed trait CreateFineTuningJobRequestHyperparametersNEpochs
object CreateFineTuningJobRequestHyperparametersNEpochs {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val createFineTuningJobRequestHyperparametersNEpochsEncoder: Encoder[CreateFineTuningJobRequestHyperparametersNEpochs] = Encoder.instance {
    case `int`: Int => `int`.asJson
    case string: String => string.asJson
  }

  implicit val createFineTuningJobRequestHyperparametersNEpochsDecoder: Decoder[CreateFineTuningJobRequestHyperparametersNEpochs] =
    List[Decoder[CreateFineTuningJobRequestHyperparametersNEpochs]](
      Decoder[Int].widen,
      Decoder[String].widen,
  ).reduceLeft(_ or _)
}


/**
* 
* @param `type` The type of integration to enable. Currently, only \"wandb\" (Weights and Biases) is supported. 
* @param wandb 
*/

case class CreateFineTuningJobRequestIntegrationsInner(
  `type`: String,
  wandb: CreateFineTuningJobRequestIntegrationsInnerWandb
)
object CreateFineTuningJobRequestIntegrationsInner {
  implicit val encoderCreateFineTuningJobRequestIntegrationsInner: Encoder[CreateFineTuningJobRequestIntegrationsInner] = deriveEncoder[CreateFineTuningJobRequestIntegrationsInner].mapJson(_.dropNullValues)
  implicit val decoderCreateFineTuningJobRequestIntegrationsInner: Decoder[CreateFineTuningJobRequestIntegrationsInner] = deriveDecoder[CreateFineTuningJobRequestIntegrationsInner]
}

/**
* The settings for your integration with Weights and Biases. This payload specifies the project that metrics will be sent to. Optionally, you can set an explicit display name for your run, add tags to your run, and set a default entity (team, username, etc) to be associated with your run. 
* @param project The name of the project that the new run will be created under. 
* @param name A display name to set for the run. If not set, we will use the Job ID as the name. 
* @param entity The entity to use for the run. This allows you to set the team or username of the WandB user that you would like associated with the run. If not set, the default entity for the registered WandB API key is used. 
* @param tags A list of tags to be attached to the newly created run. These tags are passed through directly to WandB. Some default tags are generated by OpenAI: \"openai/finetune\", \"openai/{base-model}\", \"openai/{ftjob-abcdef}\". 
*/

case class CreateFineTuningJobRequestIntegrationsInnerWandb(
  project: String,
  name: Option[String],
  entity: Option[String],
  tags: Option[List[String]]
)
object CreateFineTuningJobRequestIntegrationsInnerWandb {
  implicit val encoderCreateFineTuningJobRequestIntegrationsInnerWandb: Encoder[CreateFineTuningJobRequestIntegrationsInnerWandb] = deriveEncoder[CreateFineTuningJobRequestIntegrationsInnerWandb].mapJson(_.dropNullValues)
  implicit val decoderCreateFineTuningJobRequestIntegrationsInnerWandb: Decoder[CreateFineTuningJobRequestIntegrationsInnerWandb] = deriveDecoder[CreateFineTuningJobRequestIntegrationsInnerWandb]
}

/**
* The name of the model to fine-tune. You can select one of the [supported models](/docs/guides/fine-tuning#which-models-can-be-fine-tuned). 
*/

case class CreateFineTuningJobRequestModel(
)
object CreateFineTuningJobRequestModel {
  implicit val encoderCreateFineTuningJobRequestModel: Encoder[CreateFineTuningJobRequestModel] = deriveEncoder[CreateFineTuningJobRequestModel].mapJson(_.dropNullValues)
  implicit val decoderCreateFineTuningJobRequestModel: Decoder[CreateFineTuningJobRequestModel] = deriveDecoder[CreateFineTuningJobRequestModel]
}

/**
* The model to use for image generation. Only `dall-e-2` is supported at this time.
*/

case class CreateImageEditRequestModel(
)
object CreateImageEditRequestModel {
  implicit val encoderCreateImageEditRequestModel: Encoder[CreateImageEditRequestModel] = deriveEncoder[CreateImageEditRequestModel].mapJson(_.dropNullValues)
  implicit val decoderCreateImageEditRequestModel: Decoder[CreateImageEditRequestModel] = deriveDecoder[CreateImageEditRequestModel]
}

/**
* 
* @param prompt A text description of the desired image(s). The maximum length is 1000 characters for `dall-e-2` and 4000 characters for `dall-e-3`.
* @param model 
* @param n The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported.
* @param quality The quality of the image that will be generated. `hd` creates images with finer details and greater consistency across the image. This param is only supported for `dall-e-3`.
* @param responseUnderscoreformat The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.
* @param size The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024` for `dall-e-2`. Must be one of `1024x1024`, `1792x1024`, or `1024x1792` for `dall-e-3` models.
* @param style The style of the generated images. Must be one of `vivid` or `natural`. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for `dall-e-3`.
* @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
*/

case class CreateImageRequest(
  prompt: String,
  model: Option[CreateImageRequestModel],
  n: Option[Refined[Int, GreaterEqual[1] And LessEqual[10]]],
  quality: Option[String],
  responseUnderscoreformat: Option[String],
  size: Option[String],
  style: Option[String],
  user: Option[String]
)
object CreateImageRequest {
  implicit val encoderCreateImageRequest: Encoder[CreateImageRequest] = deriveEncoder[CreateImageRequest].mapJson(_.dropNullValues)
  implicit val decoderCreateImageRequest: Decoder[CreateImageRequest] = deriveDecoder[CreateImageRequest]
}

/**
* The model to use for image generation.
*/

case class CreateImageRequestModel(
)
object CreateImageRequestModel {
  implicit val encoderCreateImageRequestModel: Encoder[CreateImageRequestModel] = deriveEncoder[CreateImageRequestModel].mapJson(_.dropNullValues)
  implicit val decoderCreateImageRequestModel: Decoder[CreateImageRequestModel] = deriveDecoder[CreateImageRequestModel]
}

/**
* The model to use for image generation. Only `dall-e-2` is supported at this time.
*/

case class CreateImageVariationRequestModel(
)
object CreateImageVariationRequestModel {
  implicit val encoderCreateImageVariationRequestModel: Encoder[CreateImageVariationRequestModel] = deriveEncoder[CreateImageVariationRequestModel].mapJson(_.dropNullValues)
  implicit val decoderCreateImageVariationRequestModel: Decoder[CreateImageVariationRequestModel] = deriveDecoder[CreateImageVariationRequestModel]
}

/**
* 
* @param role The role of the entity that is creating the message. Allowed values include: - `user`: Indicates the message is sent by an actual user and should be used in most cases to represent user-generated messages. - `assistant`: Indicates the message is generated by the assistant. Use this value to insert messages from the assistant into the conversation. 
* @param content 
* @param attachments A list of files attached to the message, and the tools they should be added to.
* @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
*/

case class CreateMessageRequest(
  role: String,
  content: CreateMessageRequestContent,
  attachments: Option[List[CreateMessageRequestAttachmentsInner]],
  metadata: Option[Object]
)
object CreateMessageRequest {
  implicit val encoderCreateMessageRequest: Encoder[CreateMessageRequest] = deriveEncoder[CreateMessageRequest].mapJson(_.dropNullValues)
  implicit val decoderCreateMessageRequest: Decoder[CreateMessageRequest] = deriveDecoder[CreateMessageRequest]
}

/**
* 
* @param fileUnderscoreid The ID of the file to attach to the message.
* @param tools The tools to add this file to.
*/

case class CreateMessageRequestAttachmentsInner(
  fileUnderscoreid: Option[String],
  tools: Option[List[CreateMessageRequestAttachmentsInnerToolsInner]]
)
object CreateMessageRequestAttachmentsInner {
  implicit val encoderCreateMessageRequestAttachmentsInner: Encoder[CreateMessageRequestAttachmentsInner] = deriveEncoder[CreateMessageRequestAttachmentsInner].mapJson(_.dropNullValues)
  implicit val decoderCreateMessageRequestAttachmentsInner: Decoder[CreateMessageRequestAttachmentsInner] = deriveDecoder[CreateMessageRequestAttachmentsInner]
}

/**
* 
* @param `type` The type of tool being defined: `code_interpreter`
*/
sealed trait CreateMessageRequestAttachmentsInnerToolsInner
object CreateMessageRequestAttachmentsInnerToolsInner {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val createMessageRequestAttachmentsInnerToolsInnerEncoder: Encoder[CreateMessageRequestAttachmentsInnerToolsInner] = Encoder.instance {
    case assistantToolsCode: AssistantToolsCode => assistantToolsCode.asJson
    case assistantToolsFileSearchTypeOnly: AssistantToolsFileSearchTypeOnly => assistantToolsFileSearchTypeOnly.asJson
  }

  implicit val createMessageRequestAttachmentsInnerToolsInnerDecoder: Decoder[CreateMessageRequestAttachmentsInnerToolsInner] =
    List[Decoder[CreateMessageRequestAttachmentsInnerToolsInner]](
      Decoder[AssistantToolsCode].widen,
      Decoder[AssistantToolsFileSearchTypeOnly].widen,
  ).reduceLeft(_ or _)
}


/**
* 
*/
sealed trait CreateMessageRequestContent
object CreateMessageRequestContent {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val createMessageRequestContentEncoder: Encoder[CreateMessageRequestContent] = Encoder.instance {
    case list_ArrayOfContentPartsInner: List[ArrayOfContentPartsInner] => list_ArrayOfContentPartsInner.asJson
    case string: String => string.asJson
  }

  implicit val createMessageRequestContentDecoder: Decoder[CreateMessageRequestContent] =
    List[Decoder[CreateMessageRequestContent]](
      Decoder[List[ArrayOfContentPartsInner]].widen,
      Decoder[String].widen,
  ).reduceLeft(_ or _)
}


/**
* 
* @param input 
* @param model 
*/

case class CreateModerationRequest(
  input: CreateModerationRequestInput,
  model: Option[CreateModerationRequestModel]
)
object CreateModerationRequest {
  implicit val encoderCreateModerationRequest: Encoder[CreateModerationRequest] = deriveEncoder[CreateModerationRequest].mapJson(_.dropNullValues)
  implicit val decoderCreateModerationRequest: Decoder[CreateModerationRequest] = deriveDecoder[CreateModerationRequest]
}

/**
* Input (or inputs) to classify. Can be a single string, an array of strings, or an array of multi-modal input objects similar to other models. 
*/
sealed trait CreateModerationRequestInput
object CreateModerationRequestInput {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val createModerationRequestInputEncoder: Encoder[CreateModerationRequestInput] = Encoder.instance {
    case list_CreateModerationRequestInputOneOfInner: List[CreateModerationRequestInputOneOfInner] => list_CreateModerationRequestInputOneOfInner.asJson
    case list_String: List[String] => list_String.asJson
    case string: String => string.asJson
  }

  implicit val createModerationRequestInputDecoder: Decoder[CreateModerationRequestInput] =
    List[Decoder[CreateModerationRequestInput]](
      Decoder[List[CreateModerationRequestInputOneOfInner]].widen,
      Decoder[List[String]].widen,
      Decoder[String].widen,
  ).reduceLeft(_ or _)
}


/**
* 
* @param `type` Always `image_url`.
* @param imageUnderscoreurl 
* @param text A string of text to classify.
*/
sealed trait CreateModerationRequestInputOneOfInner
object CreateModerationRequestInputOneOfInner {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val createModerationRequestInputOneOfInnerEncoder: Encoder[CreateModerationRequestInputOneOfInner] = Encoder.instance {
    case createModerationRequestInputOneOfInnerOneOf: CreateModerationRequestInputOneOfInnerOneOf => createModerationRequestInputOneOfInnerOneOf.asJson
    case createModerationRequestInputOneOfInnerOneOf1: CreateModerationRequestInputOneOfInnerOneOf1 => createModerationRequestInputOneOfInnerOneOf1.asJson
  }

  implicit val createModerationRequestInputOneOfInnerDecoder: Decoder[CreateModerationRequestInputOneOfInner] =
    List[Decoder[CreateModerationRequestInputOneOfInner]](
      Decoder[CreateModerationRequestInputOneOfInnerOneOf].widen,
      Decoder[CreateModerationRequestInputOneOfInnerOneOf1].widen,
  ).reduceLeft(_ or _)
}


/**
* An object describing an image to classify.
* @param `type` Always `image_url`.
* @param imageUnderscoreurl 
*/

case class CreateModerationRequestInputOneOfInnerOneOf(
  `type`: String,
  imageUnderscoreurl: CreateModerationRequestInputOneOfInnerOneOfImageUrl
) extends CreateModerationRequestInputOneOfInner
object CreateModerationRequestInputOneOfInnerOneOf {
  implicit val encoderCreateModerationRequestInputOneOfInnerOneOf: Encoder[CreateModerationRequestInputOneOfInnerOneOf] = deriveEncoder[CreateModerationRequestInputOneOfInnerOneOf].mapJson(_.dropNullValues)
  implicit val decoderCreateModerationRequestInputOneOfInnerOneOf: Decoder[CreateModerationRequestInputOneOfInnerOneOf] = deriveDecoder[CreateModerationRequestInputOneOfInnerOneOf]
}

/**
* An object describing text to classify.
* @param `type` Always `text`.
* @param text A string of text to classify.
*/

case class CreateModerationRequestInputOneOfInnerOneOf1(
  `type`: String,
  text: String
) extends CreateModerationRequestInputOneOfInner
object CreateModerationRequestInputOneOfInnerOneOf1 {
  implicit val encoderCreateModerationRequestInputOneOfInnerOneOf1: Encoder[CreateModerationRequestInputOneOfInnerOneOf1] = deriveEncoder[CreateModerationRequestInputOneOfInnerOneOf1].mapJson(_.dropNullValues)
  implicit val decoderCreateModerationRequestInputOneOfInnerOneOf1: Decoder[CreateModerationRequestInputOneOfInnerOneOf1] = deriveDecoder[CreateModerationRequestInputOneOfInnerOneOf1]
}

/**
* Contains either an image URL or a data URL for a base64 encoded image.
* @param url Either a URL of the image or the base64 encoded image data.
*/

case class CreateModerationRequestInputOneOfInnerOneOfImageUrl(
  url: URI
)
object CreateModerationRequestInputOneOfInnerOneOfImageUrl {
  implicit val encoderCreateModerationRequestInputOneOfInnerOneOfImageUrl: Encoder[CreateModerationRequestInputOneOfInnerOneOfImageUrl] = deriveEncoder[CreateModerationRequestInputOneOfInnerOneOfImageUrl].mapJson(_.dropNullValues)
  implicit val decoderCreateModerationRequestInputOneOfInnerOneOfImageUrl: Decoder[CreateModerationRequestInputOneOfInnerOneOfImageUrl] = deriveDecoder[CreateModerationRequestInputOneOfInnerOneOfImageUrl]
}

/**
* The content moderation model you would like to use. Learn more in [the moderation guide](/docs/guides/moderation), and learn about available models [here](/docs/models#moderation). 
*/

case class CreateModerationRequestModel(
)
object CreateModerationRequestModel {
  implicit val encoderCreateModerationRequestModel: Encoder[CreateModerationRequestModel] = deriveEncoder[CreateModerationRequestModel].mapJson(_.dropNullValues)
  implicit val decoderCreateModerationRequestModel: Decoder[CreateModerationRequestModel] = deriveDecoder[CreateModerationRequestModel]
}

/**
* Represents if a given text input is potentially harmful.
* @param id The unique identifier for the moderation request.
* @param model The model used to generate the moderation results.
* @param results A list of moderation objects.
*/

case class CreateModerationResponse(
  id: String,
  model: String,
  results: List[CreateModerationResponseResultsInner]
)
object CreateModerationResponse {
  implicit val encoderCreateModerationResponse: Encoder[CreateModerationResponse] = deriveEncoder[CreateModerationResponse].mapJson(_.dropNullValues)
  implicit val decoderCreateModerationResponse: Decoder[CreateModerationResponse] = deriveDecoder[CreateModerationResponse]
}

/**
* 
* @param flagged Whether any of the below categories are flagged.
* @param categories 
* @param categoryUnderscorescores 
* @param categoryUnderscoreappliedUnderscoreinputUnderscoretypes 
*/

case class CreateModerationResponseResultsInner(
  flagged: Boolean,
  categories: CreateModerationResponseResultsInnerCategories,
  categoryUnderscorescores: CreateModerationResponseResultsInnerCategoryScores,
  categoryUnderscoreappliedUnderscoreinputUnderscoretypes: CreateModerationResponseResultsInnerCategoryAppliedInputTypes
)
object CreateModerationResponseResultsInner {
  implicit val encoderCreateModerationResponseResultsInner: Encoder[CreateModerationResponseResultsInner] = deriveEncoder[CreateModerationResponseResultsInner].mapJson(_.dropNullValues)
  implicit val decoderCreateModerationResponseResultsInner: Decoder[CreateModerationResponseResultsInner] = deriveDecoder[CreateModerationResponseResultsInner]
}

/**
* A list of the categories, and whether they are flagged or not.
* @param hate Content that expresses, incites, or promotes hate based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. Hateful content aimed at non-protected groups (e.g., chess players) is harassment.
* @param hateSlashthreatening Hateful content that also includes violence or serious harm towards the targeted group based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste.
* @param harassment Content that expresses, incites, or promotes harassing language towards any target.
* @param harassmentSlashthreatening Harassment content that also includes violence or serious harm towards any target.
* @param illicit Content that includes instructions or advice that facilitate the planning or execution of wrongdoing, or that gives advice or instruction on how to commit illicit acts. For example, \"how to shoplift\" would fit this category.
* @param illicitSlashviolent Content that includes instructions or advice that facilitate the planning or execution of wrongdoing that also includes violence, or that gives advice or instruction on the procurement of any weapon.
* @param selfMinusharm Content that promotes, encourages, or depicts acts of self-harm, such as suicide, cutting, and eating disorders.
* @param selfMinusharmSlashintent Content where the speaker expresses that they are engaging or intend to engage in acts of self-harm, such as suicide, cutting, and eating disorders.
* @param selfMinusharmSlashinstructions Content that encourages performing acts of self-harm, such as suicide, cutting, and eating disorders, or that gives instructions or advice on how to commit such acts.
* @param sexual Content meant to arouse sexual excitement, such as the description of sexual activity, or that promotes sexual services (excluding sex education and wellness).
* @param sexualSlashminors Sexual content that includes an individual who is under 18 years old.
* @param violence Content that depicts death, violence, or physical injury.
* @param violenceSlashgraphic Content that depicts death, violence, or physical injury in graphic detail.
*/

case class CreateModerationResponseResultsInnerCategories(
  hate: Boolean,
  hateSlashthreatening: Boolean,
  harassment: Boolean,
  harassmentSlashthreatening: Boolean,
  illicit: Boolean,
  illicitSlashviolent: Boolean,
  selfMinusharm: Boolean,
  selfMinusharmSlashintent: Boolean,
  selfMinusharmSlashinstructions: Boolean,
  sexual: Boolean,
  sexualSlashminors: Boolean,
  violence: Boolean,
  violenceSlashgraphic: Boolean
)
object CreateModerationResponseResultsInnerCategories {
  implicit val encoderCreateModerationResponseResultsInnerCategories: Encoder[CreateModerationResponseResultsInnerCategories] = deriveEncoder[CreateModerationResponseResultsInnerCategories].mapJson(_.dropNullValues)
  implicit val decoderCreateModerationResponseResultsInnerCategories: Decoder[CreateModerationResponseResultsInnerCategories] = deriveDecoder[CreateModerationResponseResultsInnerCategories]
}

/**
* A list of the categories along with the input type(s) that the score applies to.
* @param hate The applied input type(s) for the category 'hate'.
* @param hateSlashthreatening The applied input type(s) for the category 'hate/threatening'.
* @param harassment The applied input type(s) for the category 'harassment'.
* @param harassmentSlashthreatening The applied input type(s) for the category 'harassment/threatening'.
* @param illicit The applied input type(s) for the category 'illicit'.
* @param illicitSlashviolent The applied input type(s) for the category 'illicit/violent'.
* @param selfMinusharm The applied input type(s) for the category 'self-harm'.
* @param selfMinusharmSlashintent The applied input type(s) for the category 'self-harm/intent'.
* @param selfMinusharmSlashinstructions The applied input type(s) for the category 'self-harm/instructions'.
* @param sexual The applied input type(s) for the category 'sexual'.
* @param sexualSlashminors The applied input type(s) for the category 'sexual/minors'.
* @param violence The applied input type(s) for the category 'violence'.
* @param violenceSlashgraphic The applied input type(s) for the category 'violence/graphic'.
*/

case class CreateModerationResponseResultsInnerCategoryAppliedInputTypes(
  hate: List[String],
  hateSlashthreatening: List[String],
  harassment: List[String],
  harassmentSlashthreatening: List[String],
  illicit: List[String],
  illicitSlashviolent: List[String],
  selfMinusharm: List[String],
  selfMinusharmSlashintent: List[String],
  selfMinusharmSlashinstructions: List[String],
  sexual: List[String],
  sexualSlashminors: List[String],
  violence: List[String],
  violenceSlashgraphic: List[String]
)
object CreateModerationResponseResultsInnerCategoryAppliedInputTypes {
  implicit val encoderCreateModerationResponseResultsInnerCategoryAppliedInputTypes: Encoder[CreateModerationResponseResultsInnerCategoryAppliedInputTypes] = deriveEncoder[CreateModerationResponseResultsInnerCategoryAppliedInputTypes].mapJson(_.dropNullValues)
  implicit val decoderCreateModerationResponseResultsInnerCategoryAppliedInputTypes: Decoder[CreateModerationResponseResultsInnerCategoryAppliedInputTypes] = deriveDecoder[CreateModerationResponseResultsInnerCategoryAppliedInputTypes]
}

/**
* A list of the categories along with their scores as predicted by model.
* @param hate The score for the category 'hate'.
* @param hateSlashthreatening The score for the category 'hate/threatening'.
* @param harassment The score for the category 'harassment'.
* @param harassmentSlashthreatening The score for the category 'harassment/threatening'.
* @param illicit The score for the category 'illicit'.
* @param illicitSlashviolent The score for the category 'illicit/violent'.
* @param selfMinusharm The score for the category 'self-harm'.
* @param selfMinusharmSlashintent The score for the category 'self-harm/intent'.
* @param selfMinusharmSlashinstructions The score for the category 'self-harm/instructions'.
* @param sexual The score for the category 'sexual'.
* @param sexualSlashminors The score for the category 'sexual/minors'.
* @param violence The score for the category 'violence'.
* @param violenceSlashgraphic The score for the category 'violence/graphic'.
*/

case class CreateModerationResponseResultsInnerCategoryScores(
  hate: BigDecimal,
  hateSlashthreatening: BigDecimal,
  harassment: BigDecimal,
  harassmentSlashthreatening: BigDecimal,
  illicit: BigDecimal,
  illicitSlashviolent: BigDecimal,
  selfMinusharm: BigDecimal,
  selfMinusharmSlashintent: BigDecimal,
  selfMinusharmSlashinstructions: BigDecimal,
  sexual: BigDecimal,
  sexualSlashminors: BigDecimal,
  violence: BigDecimal,
  violenceSlashgraphic: BigDecimal
)
object CreateModerationResponseResultsInnerCategoryScores {
  implicit val encoderCreateModerationResponseResultsInnerCategoryScores: Encoder[CreateModerationResponseResultsInnerCategoryScores] = deriveEncoder[CreateModerationResponseResultsInnerCategoryScores].mapJson(_.dropNullValues)
  implicit val decoderCreateModerationResponseResultsInnerCategoryScores: Decoder[CreateModerationResponseResultsInnerCategoryScores] = deriveDecoder[CreateModerationResponseResultsInnerCategoryScores]
}

/**
* 
* @param assistantUnderscoreid The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run.
* @param model 
* @param instructions Overrides the [instructions](/docs/api-reference/assistants/createAssistant) of the assistant. This is useful for modifying the behavior on a per-run basis.
* @param additionalUnderscoreinstructions Appends additional instructions at the end of the instructions for the run. This is useful for modifying the behavior on a per-run basis without overriding other instructions.
* @param additionalUnderscoremessages Adds additional messages to the thread before creating the run.
* @param tools Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis.
* @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
* @param temperature What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
* @param topUnderscorep An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. 
* @param stream If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. 
* @param maxUnderscorepromptUnderscoretokens The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status `incomplete`. See `incomplete_details` for more info. 
* @param maxUnderscorecompletionUnderscoretokens The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status `incomplete`. See `incomplete_details` for more info. 
* @param truncationUnderscorestrategy 
* @param toolUnderscorechoice 
* @param parallelUnderscoretoolUnderscorecalls Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
* @param responseUnderscoreformat 
*/

case class CreateRunRequest(
  assistantUnderscoreid: String,
  model: Option[CreateRunRequestModel],
  instructions: Option[String],
  additionalUnderscoreinstructions: Option[String],
  additionalUnderscoremessages: Option[List[CreateMessageRequest]],
  tools: Option[Refined[List[CreateRunRequestToolsInner], MaxSize[20]]],
  metadata: Option[Object],
  temperature: Option[Refined[BigDecimal, GreaterEqual[0] And LessEqual[2]]],
  topUnderscorep: Option[Refined[BigDecimal, GreaterEqual[0] And LessEqual[1]]],
  stream: Option[Boolean],
  maxUnderscorepromptUnderscoretokens: Option[Refined[Int, GreaterEqual[256]]],
  maxUnderscorecompletionUnderscoretokens: Option[Refined[Int, GreaterEqual[256]]],
  truncationUnderscorestrategy: Option[TruncationObject],
  toolUnderscorechoice: Option[AssistantsApiToolChoiceOption],
  parallelUnderscoretoolUnderscorecalls: Option[Boolean],
  responseUnderscoreformat: Option[AssistantsApiResponseFormatOption]
)
object CreateRunRequest {
  implicit val encoderCreateRunRequest: Encoder[CreateRunRequest] = deriveEncoder[CreateRunRequest].mapJson(_.dropNullValues)
  implicit val decoderCreateRunRequest: Decoder[CreateRunRequest] = deriveDecoder[CreateRunRequest]
}

/**
* The ID of the [Model](/docs/api-reference/models) to be used to execute this run. If a value is provided here, it will override the model associated with the assistant. If not, the model associated with the assistant will be used.
*/

case class CreateRunRequestModel(
)
object CreateRunRequestModel {
  implicit val encoderCreateRunRequestModel: Encoder[CreateRunRequestModel] = deriveEncoder[CreateRunRequestModel].mapJson(_.dropNullValues)
  implicit val decoderCreateRunRequestModel: Decoder[CreateRunRequestModel] = deriveDecoder[CreateRunRequestModel]
}

/**
* 
* @param `type` The type of tool being defined: `code_interpreter`
* @param fileUnderscoresearch 
* @param function 
*/
sealed trait CreateRunRequestToolsInner
object CreateRunRequestToolsInner {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val createRunRequestToolsInnerEncoder: Encoder[CreateRunRequestToolsInner] = Encoder.instance {
    case assistantToolsCode: AssistantToolsCode => assistantToolsCode.asJson
    case assistantToolsFileSearch: AssistantToolsFileSearch => assistantToolsFileSearch.asJson
    case assistantToolsFunction: AssistantToolsFunction => assistantToolsFunction.asJson
  }

  implicit val createRunRequestToolsInnerDecoder: Decoder[CreateRunRequestToolsInner] =
    List[Decoder[CreateRunRequestToolsInner]](
      Decoder[AssistantToolsCode].widen,
      Decoder[AssistantToolsFileSearch].widen,
      Decoder[AssistantToolsFunction].widen,
  ).reduceLeft(_ or _)
}


/**
* 
* @param model 
* @param input The text to generate audio for. The maximum length is 4096 characters.
* @param voice The voice to use when generating the audio. Supported voices are `alloy`, `echo`, `fable`, `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech#voice-options).
* @param responseUnderscoreformat The format to audio in. Supported formats are `mp3`, `opus`, `aac`, `flac`, `wav`, and `pcm`.
* @param speed The speed of the generated audio. Select a value from `0.25` to `4.0`. `1.0` is the default.
*/

case class CreateSpeechRequest(
  model: CreateSpeechRequestModel,
  input: Refined[String, MaxSize[4096]],
  voice: String,
  responseUnderscoreformat: Option[String],
  speed: Option[Refined[BigDecimal, GreaterEqual[0.25] And LessEqual[4]]]
)
object CreateSpeechRequest {
  implicit val encoderCreateSpeechRequest: Encoder[CreateSpeechRequest] = deriveEncoder[CreateSpeechRequest].mapJson(_.dropNullValues)
  implicit val decoderCreateSpeechRequest: Decoder[CreateSpeechRequest] = deriveDecoder[CreateSpeechRequest]
}

/**
* One of the available [TTS models](/docs/models#tts): `tts-1` or `tts-1-hd` 
*/

case class CreateSpeechRequestModel(
)
object CreateSpeechRequestModel {
  implicit val encoderCreateSpeechRequestModel: Encoder[CreateSpeechRequestModel] = deriveEncoder[CreateSpeechRequestModel].mapJson(_.dropNullValues)
  implicit val decoderCreateSpeechRequestModel: Decoder[CreateSpeechRequestModel] = deriveDecoder[CreateSpeechRequestModel]
}

/**
* 
* @param assistantUnderscoreid The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run.
* @param thread 
* @param model 
* @param instructions Override the default system message of the assistant. This is useful for modifying the behavior on a per-run basis.
* @param tools Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis.
* @param toolUnderscoreresources 
* @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
* @param temperature What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
* @param topUnderscorep An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. 
* @param stream If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. 
* @param maxUnderscorepromptUnderscoretokens The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status `incomplete`. See `incomplete_details` for more info. 
* @param maxUnderscorecompletionUnderscoretokens The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status `incomplete`. See `incomplete_details` for more info. 
* @param truncationUnderscorestrategy 
* @param toolUnderscorechoice 
* @param parallelUnderscoretoolUnderscorecalls Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
* @param responseUnderscoreformat 
*/

case class CreateThreadAndRunRequest(
  assistantUnderscoreid: String,
  thread: Option[CreateThreadRequest],
  model: Option[CreateThreadAndRunRequestModel],
  instructions: Option[String],
  tools: Option[Refined[List[CreateThreadAndRunRequestToolsInner], MaxSize[20]]],
  toolUnderscoreresources: Option[CreateThreadAndRunRequestToolResources],
  metadata: Option[Object],
  temperature: Option[Refined[BigDecimal, GreaterEqual[0] And LessEqual[2]]],
  topUnderscorep: Option[Refined[BigDecimal, GreaterEqual[0] And LessEqual[1]]],
  stream: Option[Boolean],
  maxUnderscorepromptUnderscoretokens: Option[Refined[Int, GreaterEqual[256]]],
  maxUnderscorecompletionUnderscoretokens: Option[Refined[Int, GreaterEqual[256]]],
  truncationUnderscorestrategy: Option[TruncationObject],
  toolUnderscorechoice: Option[AssistantsApiToolChoiceOption],
  parallelUnderscoretoolUnderscorecalls: Option[Boolean],
  responseUnderscoreformat: Option[AssistantsApiResponseFormatOption]
)
object CreateThreadAndRunRequest {
  implicit val encoderCreateThreadAndRunRequest: Encoder[CreateThreadAndRunRequest] = deriveEncoder[CreateThreadAndRunRequest].mapJson(_.dropNullValues)
  implicit val decoderCreateThreadAndRunRequest: Decoder[CreateThreadAndRunRequest] = deriveDecoder[CreateThreadAndRunRequest]
}

/**
* The ID of the [Model](/docs/api-reference/models) to be used to execute this run. If a value is provided here, it will override the model associated with the assistant. If not, the model associated with the assistant will be used.
*/

case class CreateThreadAndRunRequestModel(
)
object CreateThreadAndRunRequestModel {
  implicit val encoderCreateThreadAndRunRequestModel: Encoder[CreateThreadAndRunRequestModel] = deriveEncoder[CreateThreadAndRunRequestModel].mapJson(_.dropNullValues)
  implicit val decoderCreateThreadAndRunRequestModel: Decoder[CreateThreadAndRunRequestModel] = deriveDecoder[CreateThreadAndRunRequestModel]
}

/**
* A set of resources that are used by the assistant's tools. The resources are specific to the type of tool. For example, the `code_interpreter` tool requires a list of file IDs, while the `file_search` tool requires a list of vector store IDs. 
* @param codeUnderscoreinterpreter 
* @param fileUnderscoresearch 
*/

case class CreateThreadAndRunRequestToolResources(
  codeUnderscoreinterpreter: Option[CreateThreadAndRunRequestToolResourcesCodeInterpreter],
  fileUnderscoresearch: Option[CreateThreadAndRunRequestToolResourcesFileSearch]
)
object CreateThreadAndRunRequestToolResources {
  implicit val encoderCreateThreadAndRunRequestToolResources: Encoder[CreateThreadAndRunRequestToolResources] = deriveEncoder[CreateThreadAndRunRequestToolResources].mapJson(_.dropNullValues)
  implicit val decoderCreateThreadAndRunRequestToolResources: Decoder[CreateThreadAndRunRequestToolResources] = deriveDecoder[CreateThreadAndRunRequestToolResources]
}

/**
* 
* @param fileUnderscoreids A list of [file](/docs/api-reference/files) IDs made available to the `code_interpreter` tool. There can be a maximum of 20 files associated with the tool. 
*/

case class CreateThreadAndRunRequestToolResourcesCodeInterpreter(
  fileUnderscoreids: Option[Refined[List[String], MaxSize[20]]]
)
object CreateThreadAndRunRequestToolResourcesCodeInterpreter {
  implicit val encoderCreateThreadAndRunRequestToolResourcesCodeInterpreter: Encoder[CreateThreadAndRunRequestToolResourcesCodeInterpreter] = deriveEncoder[CreateThreadAndRunRequestToolResourcesCodeInterpreter].mapJson(_.dropNullValues)
  implicit val decoderCreateThreadAndRunRequestToolResourcesCodeInterpreter: Decoder[CreateThreadAndRunRequestToolResourcesCodeInterpreter] = deriveDecoder[CreateThreadAndRunRequestToolResourcesCodeInterpreter]
}

/**
* 
* @param vectorUnderscorestoreUnderscoreids The ID of the [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant. 
*/

case class CreateThreadAndRunRequestToolResourcesFileSearch(
  vectorUnderscorestoreUnderscoreids: Option[Refined[List[String], MaxSize[1]]]
)
object CreateThreadAndRunRequestToolResourcesFileSearch {
  implicit val encoderCreateThreadAndRunRequestToolResourcesFileSearch: Encoder[CreateThreadAndRunRequestToolResourcesFileSearch] = deriveEncoder[CreateThreadAndRunRequestToolResourcesFileSearch].mapJson(_.dropNullValues)
  implicit val decoderCreateThreadAndRunRequestToolResourcesFileSearch: Decoder[CreateThreadAndRunRequestToolResourcesFileSearch] = deriveDecoder[CreateThreadAndRunRequestToolResourcesFileSearch]
}

/**
* 
* @param `type` The type of tool being defined: `code_interpreter`
* @param fileUnderscoresearch 
* @param function 
*/
sealed trait CreateThreadAndRunRequestToolsInner
object CreateThreadAndRunRequestToolsInner {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val createThreadAndRunRequestToolsInnerEncoder: Encoder[CreateThreadAndRunRequestToolsInner] = Encoder.instance {
    case assistantToolsCode: AssistantToolsCode => assistantToolsCode.asJson
    case assistantToolsFileSearch: AssistantToolsFileSearch => assistantToolsFileSearch.asJson
    case assistantToolsFunction: AssistantToolsFunction => assistantToolsFunction.asJson
  }

  implicit val createThreadAndRunRequestToolsInnerDecoder: Decoder[CreateThreadAndRunRequestToolsInner] =
    List[Decoder[CreateThreadAndRunRequestToolsInner]](
      Decoder[AssistantToolsCode].widen,
      Decoder[AssistantToolsFileSearch].widen,
      Decoder[AssistantToolsFunction].widen,
  ).reduceLeft(_ or _)
}


/**
* 
* @param messages A list of [messages](/docs/api-reference/messages) to start the thread with.
* @param toolUnderscoreresources 
* @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
*/

case class CreateThreadRequest(
  messages: Option[List[CreateMessageRequest]],
  toolUnderscoreresources: Option[CreateThreadRequestToolResources],
  metadata: Option[Object]
)
object CreateThreadRequest {
  implicit val encoderCreateThreadRequest: Encoder[CreateThreadRequest] = deriveEncoder[CreateThreadRequest].mapJson(_.dropNullValues)
  implicit val decoderCreateThreadRequest: Decoder[CreateThreadRequest] = deriveDecoder[CreateThreadRequest]
}

/**
* A set of resources that are made available to the assistant's tools in this thread. The resources are specific to the type of tool. For example, the `code_interpreter` tool requires a list of file IDs, while the `file_search` tool requires a list of vector store IDs. 
* @param codeUnderscoreinterpreter 
* @param fileUnderscoresearch 
*/

case class CreateThreadRequestToolResources(
  codeUnderscoreinterpreter: Option[CreateThreadRequestToolResourcesCodeInterpreter],
  fileUnderscoresearch: Option[CreateThreadRequestToolResourcesFileSearch]
)
object CreateThreadRequestToolResources {
  implicit val encoderCreateThreadRequestToolResources: Encoder[CreateThreadRequestToolResources] = deriveEncoder[CreateThreadRequestToolResources].mapJson(_.dropNullValues)
  implicit val decoderCreateThreadRequestToolResources: Decoder[CreateThreadRequestToolResources] = deriveDecoder[CreateThreadRequestToolResources]
}

/**
* 
* @param fileUnderscoreids A list of [file](/docs/api-reference/files) IDs made available to the `code_interpreter` tool. There can be a maximum of 20 files associated with the tool. 
*/

case class CreateThreadRequestToolResourcesCodeInterpreter(
  fileUnderscoreids: Option[Refined[List[String], MaxSize[20]]]
)
object CreateThreadRequestToolResourcesCodeInterpreter {
  implicit val encoderCreateThreadRequestToolResourcesCodeInterpreter: Encoder[CreateThreadRequestToolResourcesCodeInterpreter] = deriveEncoder[CreateThreadRequestToolResourcesCodeInterpreter].mapJson(_.dropNullValues)
  implicit val decoderCreateThreadRequestToolResourcesCodeInterpreter: Decoder[CreateThreadRequestToolResourcesCodeInterpreter] = deriveDecoder[CreateThreadRequestToolResourcesCodeInterpreter]
}

/**
* 
* @param vectorUnderscorestoreUnderscoreids The [vector store](/docs/api-reference/vector-stores/object) attached to this thread. There can be a maximum of 1 vector store attached to the thread. 
* @param vectorUnderscorestores A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this thread. There can be a maximum of 1 vector store attached to the thread. 
*/

case class CreateThreadRequestToolResourcesFileSearch(
  vectorUnderscorestoreUnderscoreids: Option[Refined[List[String], MaxSize[1]]],
  vectorUnderscorestores: Option[Refined[List[CreateThreadRequestToolResourcesFileSearchVectorStoresInner], MaxSize[1]]]
)
object CreateThreadRequestToolResourcesFileSearch {
  implicit val encoderCreateThreadRequestToolResourcesFileSearch: Encoder[CreateThreadRequestToolResourcesFileSearch] = deriveEncoder[CreateThreadRequestToolResourcesFileSearch].mapJson(_.dropNullValues)
  implicit val decoderCreateThreadRequestToolResourcesFileSearch: Decoder[CreateThreadRequestToolResourcesFileSearch] = deriveDecoder[CreateThreadRequestToolResourcesFileSearch]
}

/**
* 
* @param fileUnderscoreids A list of [file](/docs/api-reference/files) IDs to add to the vector store. There can be a maximum of 10000 files in a vector store. 
* @param chunkingUnderscorestrategy 
* @param metadata Set of 16 key-value pairs that can be attached to a vector store. This can be useful for storing additional information about the vector store in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
*/

case class CreateThreadRequestToolResourcesFileSearchVectorStoresInner(
  fileUnderscoreids: Option[Refined[List[String], MaxSize[10000]]],
  chunkingUnderscorestrategy: Option[CreateThreadRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy],
  metadata: Option[Object]
)
object CreateThreadRequestToolResourcesFileSearchVectorStoresInner {
  implicit val encoderCreateThreadRequestToolResourcesFileSearchVectorStoresInner: Encoder[CreateThreadRequestToolResourcesFileSearchVectorStoresInner] = deriveEncoder[CreateThreadRequestToolResourcesFileSearchVectorStoresInner].mapJson(_.dropNullValues)
  implicit val decoderCreateThreadRequestToolResourcesFileSearchVectorStoresInner: Decoder[CreateThreadRequestToolResourcesFileSearchVectorStoresInner] = deriveDecoder[CreateThreadRequestToolResourcesFileSearchVectorStoresInner]
}

/**
* The chunking strategy used to chunk the file(s). If not set, will use the `auto` strategy.
* @param `type` Always `auto`.
* @param `static` 
*/
sealed trait CreateThreadRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy
object CreateThreadRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val createThreadRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategyEncoder: Encoder[CreateThreadRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy] = Encoder.instance {
    case autoChunkingStrategyRequestParam: AutoChunkingStrategyRequestParam => autoChunkingStrategyRequestParam.asJson
    case staticChunkingStrategy1: StaticChunkingStrategy1 => staticChunkingStrategy1.asJson
  }

  implicit val createThreadRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategyDecoder: Decoder[CreateThreadRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy] =
    List[Decoder[CreateThreadRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy]](
      Decoder[AutoChunkingStrategyRequestParam].widen,
      Decoder[StaticChunkingStrategy1].widen,
  ).reduceLeft(_ or _)
}


/**
* 
* @param text The transcribed text.
* @param language The language of the input audio.
* @param duration The duration of the input audio.
* @param words Extracted words and their corresponding timestamps.
* @param segments Segments of the transcribed text and their corresponding details.
*/
sealed trait CreateTranscription200Response
object CreateTranscription200Response {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val createTranscription200ResponseEncoder: Encoder[CreateTranscription200Response] = Encoder.instance {
    case createTranscriptionResponseJson: CreateTranscriptionResponseJson => createTranscriptionResponseJson.asJson
    case createTranscriptionResponseVerboseJson: CreateTranscriptionResponseVerboseJson => createTranscriptionResponseVerboseJson.asJson
  }

  implicit val createTranscription200ResponseDecoder: Decoder[CreateTranscription200Response] =
    List[Decoder[CreateTranscription200Response]](
      Decoder[CreateTranscriptionResponseJson].widen,
      Decoder[CreateTranscriptionResponseVerboseJson].widen,
  ).reduceLeft(_ or _)
}


/**
* ID of the model to use. Only `whisper-1` (which is powered by our open source Whisper V2 model) is currently available. 
*/

case class CreateTranscriptionRequestModel(
)
object CreateTranscriptionRequestModel {
  implicit val encoderCreateTranscriptionRequestModel: Encoder[CreateTranscriptionRequestModel] = deriveEncoder[CreateTranscriptionRequestModel].mapJson(_.dropNullValues)
  implicit val decoderCreateTranscriptionRequestModel: Decoder[CreateTranscriptionRequestModel] = deriveDecoder[CreateTranscriptionRequestModel]
}

/**
* Represents a transcription response returned by model, based on the provided input.
* @param text The transcribed text.
*/

case class CreateTranscriptionResponseJson(
  text: String
) extends CreateTranscription200Response
object CreateTranscriptionResponseJson {
  implicit val encoderCreateTranscriptionResponseJson: Encoder[CreateTranscriptionResponseJson] = deriveEncoder[CreateTranscriptionResponseJson].mapJson(_.dropNullValues)
  implicit val decoderCreateTranscriptionResponseJson: Decoder[CreateTranscriptionResponseJson] = deriveDecoder[CreateTranscriptionResponseJson]
}

/**
* Represents a verbose json transcription response returned by model, based on the provided input.
* @param language The language of the input audio.
* @param duration The duration of the input audio.
* @param text The transcribed text.
* @param words Extracted words and their corresponding timestamps.
* @param segments Segments of the transcribed text and their corresponding details.
*/

case class CreateTranscriptionResponseVerboseJson(
  language: String,
  duration: String,
  text: String,
  words: Option[List[TranscriptionWord]],
  segments: Option[List[TranscriptionSegment]]
) extends CreateTranscription200Response
object CreateTranscriptionResponseVerboseJson {
  implicit val encoderCreateTranscriptionResponseVerboseJson: Encoder[CreateTranscriptionResponseVerboseJson] = deriveEncoder[CreateTranscriptionResponseVerboseJson].mapJson(_.dropNullValues)
  implicit val decoderCreateTranscriptionResponseVerboseJson: Decoder[CreateTranscriptionResponseVerboseJson] = deriveDecoder[CreateTranscriptionResponseVerboseJson]
}

/**
* 
* @param text The translated text.
* @param language The language of the output translation (always `english`).
* @param duration The duration of the input audio.
* @param segments Segments of the translated text and their corresponding details.
*/
sealed trait CreateTranslation200Response
object CreateTranslation200Response {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val createTranslation200ResponseEncoder: Encoder[CreateTranslation200Response] = Encoder.instance {
    case createTranslationResponseJson: CreateTranslationResponseJson => createTranslationResponseJson.asJson
    case createTranslationResponseVerboseJson: CreateTranslationResponseVerboseJson => createTranslationResponseVerboseJson.asJson
  }

  implicit val createTranslation200ResponseDecoder: Decoder[CreateTranslation200Response] =
    List[Decoder[CreateTranslation200Response]](
      Decoder[CreateTranslationResponseJson].widen,
      Decoder[CreateTranslationResponseVerboseJson].widen,
  ).reduceLeft(_ or _)
}


/**
* ID of the model to use. Only `whisper-1` (which is powered by our open source Whisper V2 model) is currently available. 
*/

case class CreateTranslationRequestModel(
)
object CreateTranslationRequestModel {
  implicit val encoderCreateTranslationRequestModel: Encoder[CreateTranslationRequestModel] = deriveEncoder[CreateTranslationRequestModel].mapJson(_.dropNullValues)
  implicit val decoderCreateTranslationRequestModel: Decoder[CreateTranslationRequestModel] = deriveDecoder[CreateTranslationRequestModel]
}

/**
* 
* @param text 
*/

case class CreateTranslationResponseJson(
  text: String
) extends CreateTranslation200Response
object CreateTranslationResponseJson {
  implicit val encoderCreateTranslationResponseJson: Encoder[CreateTranslationResponseJson] = deriveEncoder[CreateTranslationResponseJson].mapJson(_.dropNullValues)
  implicit val decoderCreateTranslationResponseJson: Decoder[CreateTranslationResponseJson] = deriveDecoder[CreateTranslationResponseJson]
}

/**
* 
* @param language The language of the output translation (always `english`).
* @param duration The duration of the input audio.
* @param text The translated text.
* @param segments Segments of the translated text and their corresponding details.
*/

case class CreateTranslationResponseVerboseJson(
  language: String,
  duration: String,
  text: String,
  segments: Option[List[TranscriptionSegment]]
) extends CreateTranslation200Response
object CreateTranslationResponseVerboseJson {
  implicit val encoderCreateTranslationResponseVerboseJson: Encoder[CreateTranslationResponseVerboseJson] = deriveEncoder[CreateTranslationResponseVerboseJson].mapJson(_.dropNullValues)
  implicit val decoderCreateTranslationResponseVerboseJson: Decoder[CreateTranslationResponseVerboseJson] = deriveDecoder[CreateTranslationResponseVerboseJson]
}

/**
* 
* @param filename The name of the file to upload. 
* @param purpose The intended purpose of the uploaded file.  See the [documentation on File purposes](/docs/api-reference/files/create#files-create-purpose). 
* @param bytes The number of bytes in the file you are uploading. 
* @param mimeUnderscoretype The MIME type of the file.  This must fall within the supported MIME types for your file purpose. See the supported MIME types for assistants and vision. 
*/

case class CreateUploadRequest(
  filename: String,
  purpose: String,
  bytes: Int,
  mimeUnderscoretype: String
)
object CreateUploadRequest {
  implicit val encoderCreateUploadRequest: Encoder[CreateUploadRequest] = deriveEncoder[CreateUploadRequest].mapJson(_.dropNullValues)
  implicit val decoderCreateUploadRequest: Decoder[CreateUploadRequest] = deriveDecoder[CreateUploadRequest]
}

/**
* 
* @param fileUnderscoreids A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like `file_search` that can access files.
* @param chunkingUnderscorestrategy 
*/

case class CreateVectorStoreFileBatchRequest(
  fileUnderscoreids: Refined[List[String], MinSize[1] And MaxSize[500]],
  chunkingUnderscorestrategy: Option[ChunkingStrategyRequestParam]
)
object CreateVectorStoreFileBatchRequest {
  implicit val encoderCreateVectorStoreFileBatchRequest: Encoder[CreateVectorStoreFileBatchRequest] = deriveEncoder[CreateVectorStoreFileBatchRequest].mapJson(_.dropNullValues)
  implicit val decoderCreateVectorStoreFileBatchRequest: Decoder[CreateVectorStoreFileBatchRequest] = deriveDecoder[CreateVectorStoreFileBatchRequest]
}

/**
* 
* @param fileUnderscoreid A [File](/docs/api-reference/files) ID that the vector store should use. Useful for tools like `file_search` that can access files.
* @param chunkingUnderscorestrategy 
*/

case class CreateVectorStoreFileRequest(
  fileUnderscoreid: String,
  chunkingUnderscorestrategy: Option[ChunkingStrategyRequestParam]
)
object CreateVectorStoreFileRequest {
  implicit val encoderCreateVectorStoreFileRequest: Encoder[CreateVectorStoreFileRequest] = deriveEncoder[CreateVectorStoreFileRequest].mapJson(_.dropNullValues)
  implicit val decoderCreateVectorStoreFileRequest: Decoder[CreateVectorStoreFileRequest] = deriveDecoder[CreateVectorStoreFileRequest]
}

/**
* 
* @param fileUnderscoreids A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like `file_search` that can access files.
* @param name The name of the vector store.
* @param expiresUnderscoreafter 
* @param chunkingUnderscorestrategy 
* @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
*/

case class CreateVectorStoreRequest(
  fileUnderscoreids: Option[Refined[List[String], MaxSize[500]]],
  name: Option[String],
  expiresUnderscoreafter: Option[VectorStoreExpirationAfter],
  chunkingUnderscorestrategy: Option[CreateVectorStoreRequestChunkingStrategy],
  metadata: Option[Object]
)
object CreateVectorStoreRequest {
  implicit val encoderCreateVectorStoreRequest: Encoder[CreateVectorStoreRequest] = deriveEncoder[CreateVectorStoreRequest].mapJson(_.dropNullValues)
  implicit val decoderCreateVectorStoreRequest: Decoder[CreateVectorStoreRequest] = deriveDecoder[CreateVectorStoreRequest]
}

/**
* The chunking strategy used to chunk the file(s). If not set, will use the `auto` strategy. Only applicable if `file_ids` is non-empty.
* @param `type` Always `auto`.
* @param `static` 
*/
sealed trait CreateVectorStoreRequestChunkingStrategy
object CreateVectorStoreRequestChunkingStrategy {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val createVectorStoreRequestChunkingStrategyEncoder: Encoder[CreateVectorStoreRequestChunkingStrategy] = Encoder.instance {
    case autoChunkingStrategyRequestParam: AutoChunkingStrategyRequestParam => autoChunkingStrategyRequestParam.asJson
    case staticChunkingStrategyRequestParam: StaticChunkingStrategyRequestParam => staticChunkingStrategyRequestParam.asJson
  }

  implicit val createVectorStoreRequestChunkingStrategyDecoder: Decoder[CreateVectorStoreRequestChunkingStrategy] =
    List[Decoder[CreateVectorStoreRequestChunkingStrategy]](
      Decoder[AutoChunkingStrategyRequestParam].widen,
      Decoder[StaticChunkingStrategyRequestParam].widen,
  ).reduceLeft(_ or _)
}


/**
* 
* @param code 
* @param message 
*/

case class DefaultProjectErrorResponse(
  code: Int,
  message: String
)
object DefaultProjectErrorResponse {
  implicit val encoderDefaultProjectErrorResponse: Encoder[DefaultProjectErrorResponse] = deriveEncoder[DefaultProjectErrorResponse].mapJson(_.dropNullValues)
  implicit val decoderDefaultProjectErrorResponse: Decoder[DefaultProjectErrorResponse] = deriveDecoder[DefaultProjectErrorResponse]
}

/**
* 
* @param id 
* @param deleted 
* @param `object` 
*/

case class DeleteAssistantResponse(
  id: String,
  deleted: Boolean,
  `object`: String
)
object DeleteAssistantResponse {
  implicit val encoderDeleteAssistantResponse: Encoder[DeleteAssistantResponse] = deriveEncoder[DeleteAssistantResponse].mapJson(_.dropNullValues)
  implicit val decoderDeleteAssistantResponse: Decoder[DeleteAssistantResponse] = deriveDecoder[DeleteAssistantResponse]
}

/**
* 
* @param id 
* @param `object` 
* @param deleted 
*/

case class DeleteFileResponse(
  id: String,
  `object`: String,
  deleted: Boolean
)
object DeleteFileResponse {
  implicit val encoderDeleteFileResponse: Encoder[DeleteFileResponse] = deriveEncoder[DeleteFileResponse].mapJson(_.dropNullValues)
  implicit val decoderDeleteFileResponse: Decoder[DeleteFileResponse] = deriveDecoder[DeleteFileResponse]
}

/**
* 
* @param id 
* @param deleted 
* @param `object` 
*/

case class DeleteMessageResponse(
  id: String,
  deleted: Boolean,
  `object`: String
)
object DeleteMessageResponse {
  implicit val encoderDeleteMessageResponse: Encoder[DeleteMessageResponse] = deriveEncoder[DeleteMessageResponse].mapJson(_.dropNullValues)
  implicit val decoderDeleteMessageResponse: Decoder[DeleteMessageResponse] = deriveDecoder[DeleteMessageResponse]
}

/**
* 
* @param id 
* @param deleted 
* @param `object` 
*/

case class DeleteModelResponse(
  id: String,
  deleted: Boolean,
  `object`: String
)
object DeleteModelResponse {
  implicit val encoderDeleteModelResponse: Encoder[DeleteModelResponse] = deriveEncoder[DeleteModelResponse].mapJson(_.dropNullValues)
  implicit val decoderDeleteModelResponse: Decoder[DeleteModelResponse] = deriveDecoder[DeleteModelResponse]
}

/**
* 
* @param id 
* @param deleted 
* @param `object` 
*/

case class DeleteThreadResponse(
  id: String,
  deleted: Boolean,
  `object`: String
)
object DeleteThreadResponse {
  implicit val encoderDeleteThreadResponse: Encoder[DeleteThreadResponse] = deriveEncoder[DeleteThreadResponse].mapJson(_.dropNullValues)
  implicit val decoderDeleteThreadResponse: Decoder[DeleteThreadResponse] = deriveDecoder[DeleteThreadResponse]
}

/**
* 
* @param id 
* @param deleted 
* @param `object` 
*/

case class DeleteVectorStoreFileResponse(
  id: String,
  deleted: Boolean,
  `object`: String
)
object DeleteVectorStoreFileResponse {
  implicit val encoderDeleteVectorStoreFileResponse: Encoder[DeleteVectorStoreFileResponse] = deriveEncoder[DeleteVectorStoreFileResponse].mapJson(_.dropNullValues)
  implicit val decoderDeleteVectorStoreFileResponse: Decoder[DeleteVectorStoreFileResponse] = deriveDecoder[DeleteVectorStoreFileResponse]
}

/**
* 
* @param id 
* @param deleted 
* @param `object` 
*/

case class DeleteVectorStoreResponse(
  id: String,
  deleted: Boolean,
  `object`: String
)
object DeleteVectorStoreResponse {
  implicit val encoderDeleteVectorStoreResponse: Encoder[DeleteVectorStoreResponse] = deriveEncoder[DeleteVectorStoreResponse].mapJson(_.dropNullValues)
  implicit val decoderDeleteVectorStoreResponse: Decoder[DeleteVectorStoreResponse] = deriveDecoder[DeleteVectorStoreResponse]
}

/**
* Occurs when a stream ends.
* @param event 
* @param data 
*/

case class DoneEvent(
  event: String,
  data: String
) extends AssistantStreamEvent
object DoneEvent {
  implicit val encoderDoneEvent: Encoder[DoneEvent] = deriveEncoder[DoneEvent].mapJson(_.dropNullValues)
  implicit val decoderDoneEvent: Decoder[DoneEvent] = deriveDecoder[DoneEvent]
}

/**
* Represents an embedding vector returned by embedding endpoint. 
* @param index The index of the embedding in the list of embeddings.
* @param embedding The embedding vector, which is a list of floats. The length of vector depends on the model as listed in the [embedding guide](/docs/guides/embeddings). 
* @param `object` The object type, which is always \"embedding\".
*/

case class Embedding(
  index: Int,
  embedding: List[BigDecimal],
  `object`: String
)
object Embedding {
  implicit val encoderEmbedding: Encoder[Embedding] = deriveEncoder[Embedding].mapJson(_.dropNullValues)
  implicit val decoderEmbedding: Decoder[Embedding] = deriveDecoder[Embedding]
}

/**
* 
* @param code 
* @param message 
* @param param 
* @param `type` 
*/

case class Error(
  code: String,
  message: String,
  param: String,
  `type`: String
)
object Error {
  implicit val encoderError: Encoder[Error] = deriveEncoder[Error].mapJson(_.dropNullValues)
  implicit val decoderError: Decoder[Error] = deriveDecoder[Error]
}

/**
* Occurs when an [error](/docs/guides/error-codes#api-errors) occurs. This can happen due to an internal server error or a timeout.
* @param event 
* @param data 
*/

case class ErrorEvent(
  event: String,
  data: Error
) extends AssistantStreamEvent
object ErrorEvent {
  implicit val encoderErrorEvent: Encoder[ErrorEvent] = deriveEncoder[ErrorEvent].mapJson(_.dropNullValues)
  implicit val decoderErrorEvent: Decoder[ErrorEvent] = deriveDecoder[ErrorEvent]
}

/**
* 
* @param error 
*/

case class ErrorResponse(
  error: Error
)
object ErrorResponse {
  implicit val encoderErrorResponse: Encoder[ErrorResponse] = deriveEncoder[ErrorResponse].mapJson(_.dropNullValues)
  implicit val decoderErrorResponse: Decoder[ErrorResponse] = deriveDecoder[ErrorResponse]
}

/**
* The ranking options for the file search. If not specified, the file search tool will use the `auto` ranker and a score_threshold of 0.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
* @param ranker The ranker to use for the file search. If not specified will use the `auto` ranker.
* @param scoreUnderscorethreshold The score threshold for the file search. All values must be a floating point number between 0 and 1.
*/

case class FileSearchRankingOptions(
  ranker: Option[String],
  scoreUnderscorethreshold: Refined[BigDecimal, GreaterEqual[0] And LessEqual[1]]
)
object FileSearchRankingOptions {
  implicit val encoderFileSearchRankingOptions: Encoder[FileSearchRankingOptions] = deriveEncoder[FileSearchRankingOptions].mapJson(_.dropNullValues)
  implicit val decoderFileSearchRankingOptions: Decoder[FileSearchRankingOptions] = deriveDecoder[FileSearchRankingOptions]
}

/**
* 
* @param weight Controls whether the assistant message is trained against (0 or 1)
* @param content 
* @param refusal The refusal message by the assistant.
* @param role The role of the messages author, in this case `assistant`.
* @param name An optional name for the participant. Provides the model information to differentiate between participants of the same role.
* @param audio 
* @param toolUnderscorecalls The tool calls generated by the model, such as function calls.
* @param functionUnderscorecall 
*/

case class FineTuneChatCompletionRequestAssistantMessage(
  weight: Option[Int],
  content: Option[ChatCompletionRequestAssistantMessageContent],
  refusal: Option[String],
  role: String,
  name: Option[String],
  audio: Option[ChatCompletionRequestAssistantMessageAudio],
  toolUnderscorecalls: Option[List[ChatCompletionMessageToolCall]],
  functionUnderscorecall: Option[ChatCompletionRequestAssistantMessageFunctionCall]
) extends FineTuneChatRequestInputMessagesInner with FineTunePreferenceRequestInputInputMessagesInner
object FineTuneChatCompletionRequestAssistantMessage {
  implicit val encoderFineTuneChatCompletionRequestAssistantMessage: Encoder[FineTuneChatCompletionRequestAssistantMessage] = deriveEncoder[FineTuneChatCompletionRequestAssistantMessage].mapJson(_.dropNullValues)
  implicit val decoderFineTuneChatCompletionRequestAssistantMessage: Decoder[FineTuneChatCompletionRequestAssistantMessage] = deriveDecoder[FineTuneChatCompletionRequestAssistantMessage]
}

/**
* The per-line training example of a fine-tuning input file for chat models using the supervised method.
* @param messages 
* @param tools A list of tools the model may generate JSON inputs for.
* @param parallelUnderscoretoolUnderscorecalls Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
* @param functions A list of functions the model may generate JSON inputs for.
*/

case class FineTuneChatRequestInput(
  messages: Option[Refined[List[FineTuneChatRequestInputMessagesInner], MinSize[1]]],
  tools: Option[List[ChatCompletionTool]],
  parallelUnderscoretoolUnderscorecalls: Option[Boolean],
  functions: Option[Refined[List[ChatCompletionFunctions], MinSize[1] And MaxSize[128]]]
)
object FineTuneChatRequestInput {
  implicit val encoderFineTuneChatRequestInput: Encoder[FineTuneChatRequestInput] = deriveEncoder[FineTuneChatRequestInput].mapJson(_.dropNullValues)
  implicit val decoderFineTuneChatRequestInput: Decoder[FineTuneChatRequestInput] = deriveDecoder[FineTuneChatRequestInput]
}

/**
* 
* @param content The contents of the function message.
* @param role The role of the messages author, in this case `function`.
* @param name The name of the function to call.
* @param weight Controls whether the assistant message is trained against (0 or 1)
* @param refusal The refusal message by the assistant.
* @param audio 
* @param toolUnderscorecalls The tool calls generated by the model, such as function calls.
* @param functionUnderscorecall 
* @param toolUnderscorecallUnderscoreid Tool call that this message is responding to.
*/
sealed trait FineTuneChatRequestInputMessagesInner
object FineTuneChatRequestInputMessagesInner {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val fineTuneChatRequestInputMessagesInnerEncoder: Encoder[FineTuneChatRequestInputMessagesInner] = Encoder.instance {
    case chatCompletionRequestFunctionMessage: ChatCompletionRequestFunctionMessage => chatCompletionRequestFunctionMessage.asJson
    case chatCompletionRequestSystemMessage: ChatCompletionRequestSystemMessage => chatCompletionRequestSystemMessage.asJson
    case chatCompletionRequestToolMessage: ChatCompletionRequestToolMessage => chatCompletionRequestToolMessage.asJson
    case chatCompletionRequestUserMessage: ChatCompletionRequestUserMessage => chatCompletionRequestUserMessage.asJson
    case fineTuneChatCompletionRequestAssistantMessage: FineTuneChatCompletionRequestAssistantMessage => fineTuneChatCompletionRequestAssistantMessage.asJson
  }

  implicit val fineTuneChatRequestInputMessagesInnerDecoder: Decoder[FineTuneChatRequestInputMessagesInner] =
    List[Decoder[FineTuneChatRequestInputMessagesInner]](
      Decoder[ChatCompletionRequestFunctionMessage].widen,
      Decoder[ChatCompletionRequestSystemMessage].widen,
      Decoder[ChatCompletionRequestToolMessage].widen,
      Decoder[ChatCompletionRequestUserMessage].widen,
      Decoder[FineTuneChatCompletionRequestAssistantMessage].widen,
  ).reduceLeft(_ or _)
}


/**
* The per-line training example of a fine-tuning input file for completions models
* @param prompt The input prompt for this training example.
* @param completion The desired completion for this training example.
*/

case class FineTuneCompletionRequestInput(
  prompt: Option[String],
  completion: Option[String]
)
object FineTuneCompletionRequestInput {
  implicit val encoderFineTuneCompletionRequestInput: Encoder[FineTuneCompletionRequestInput] = deriveEncoder[FineTuneCompletionRequestInput].mapJson(_.dropNullValues)
  implicit val decoderFineTuneCompletionRequestInput: Decoder[FineTuneCompletionRequestInput] = deriveDecoder[FineTuneCompletionRequestInput]
}

/**
* Configuration for the DPO fine-tuning method.
* @param hyperparameters 
*/

case class FineTuneDPOMethod(
  hyperparameters: Option[FineTuneDPOMethodHyperparameters]
)
object FineTuneDPOMethod {
  implicit val encoderFineTuneDPOMethod: Encoder[FineTuneDPOMethod] = deriveEncoder[FineTuneDPOMethod].mapJson(_.dropNullValues)
  implicit val decoderFineTuneDPOMethod: Decoder[FineTuneDPOMethod] = deriveDecoder[FineTuneDPOMethod]
}

/**
* The hyperparameters used for the fine-tuning job.
* @param beta 
* @param batchUnderscoresize 
* @param learningUnderscorerateUnderscoremultiplier 
* @param nUnderscoreepochs 
*/

case class FineTuneDPOMethodHyperparameters(
  beta: Option[FineTuneDPOMethodHyperparametersBeta],
  batchUnderscoresize: Option[FineTuneDPOMethodHyperparametersBatchSize],
  learningUnderscorerateUnderscoremultiplier: Option[FineTuneDPOMethodHyperparametersLearningRateMultiplier],
  nUnderscoreepochs: Option[FineTuneDPOMethodHyperparametersNEpochs]
)
object FineTuneDPOMethodHyperparameters {
  implicit val encoderFineTuneDPOMethodHyperparameters: Encoder[FineTuneDPOMethodHyperparameters] = deriveEncoder[FineTuneDPOMethodHyperparameters].mapJson(_.dropNullValues)
  implicit val decoderFineTuneDPOMethodHyperparameters: Decoder[FineTuneDPOMethodHyperparameters] = deriveDecoder[FineTuneDPOMethodHyperparameters]
}

/**
* Number of examples in each batch. A larger batch size means that model parameters are updated less frequently, but with lower variance. 
*/
sealed trait FineTuneDPOMethodHyperparametersBatchSize
object FineTuneDPOMethodHyperparametersBatchSize {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val fineTuneDPOMethodHyperparametersBatchSizeEncoder: Encoder[FineTuneDPOMethodHyperparametersBatchSize] = Encoder.instance {
    case `int`: Int => `int`.asJson
    case string: String => string.asJson
  }

  implicit val fineTuneDPOMethodHyperparametersBatchSizeDecoder: Decoder[FineTuneDPOMethodHyperparametersBatchSize] =
    List[Decoder[FineTuneDPOMethodHyperparametersBatchSize]](
      Decoder[Int].widen,
      Decoder[String].widen,
  ).reduceLeft(_ or _)
}


/**
* The beta value for the DPO method. A higher beta value will increase the weight of the penalty between the policy and reference model. 
*/
sealed trait FineTuneDPOMethodHyperparametersBeta
object FineTuneDPOMethodHyperparametersBeta {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val fineTuneDPOMethodHyperparametersBetaEncoder: Encoder[FineTuneDPOMethodHyperparametersBeta] = Encoder.instance {
    case bigDecimal: BigDecimal => bigDecimal.asJson
    case string: String => string.asJson
  }

  implicit val fineTuneDPOMethodHyperparametersBetaDecoder: Decoder[FineTuneDPOMethodHyperparametersBeta] =
    List[Decoder[FineTuneDPOMethodHyperparametersBeta]](
      Decoder[BigDecimal].widen,
      Decoder[String].widen,
  ).reduceLeft(_ or _)
}


/**
* Scaling factor for the learning rate. A smaller learning rate may be useful to avoid overfitting. 
*/
sealed trait FineTuneDPOMethodHyperparametersLearningRateMultiplier
object FineTuneDPOMethodHyperparametersLearningRateMultiplier {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val fineTuneDPOMethodHyperparametersLearningRateMultiplierEncoder: Encoder[FineTuneDPOMethodHyperparametersLearningRateMultiplier] = Encoder.instance {
    case bigDecimal: BigDecimal => bigDecimal.asJson
    case string: String => string.asJson
  }

  implicit val fineTuneDPOMethodHyperparametersLearningRateMultiplierDecoder: Decoder[FineTuneDPOMethodHyperparametersLearningRateMultiplier] =
    List[Decoder[FineTuneDPOMethodHyperparametersLearningRateMultiplier]](
      Decoder[BigDecimal].widen,
      Decoder[String].widen,
  ).reduceLeft(_ or _)
}


/**
* The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. 
*/
sealed trait FineTuneDPOMethodHyperparametersNEpochs
object FineTuneDPOMethodHyperparametersNEpochs {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val fineTuneDPOMethodHyperparametersNEpochsEncoder: Encoder[FineTuneDPOMethodHyperparametersNEpochs] = Encoder.instance {
    case `int`: Int => `int`.asJson
    case string: String => string.asJson
  }

  implicit val fineTuneDPOMethodHyperparametersNEpochsDecoder: Decoder[FineTuneDPOMethodHyperparametersNEpochs] =
    List[Decoder[FineTuneDPOMethodHyperparametersNEpochs]](
      Decoder[Int].widen,
      Decoder[String].widen,
  ).reduceLeft(_ or _)
}


/**
* The method used for fine-tuning.
* @param `type` The type of method. Is either `supervised` or `dpo`.
* @param supervised 
* @param dpo 
*/

case class FineTuneMethod(
  `type`: Option[String],
  supervised: Option[FineTuneSupervisedMethod],
  dpo: Option[FineTuneDPOMethod]
)
object FineTuneMethod {
  implicit val encoderFineTuneMethod: Encoder[FineTuneMethod] = deriveEncoder[FineTuneMethod].mapJson(_.dropNullValues)
  implicit val decoderFineTuneMethod: Decoder[FineTuneMethod] = deriveDecoder[FineTuneMethod]
}

/**
* The per-line training example of a fine-tuning input file for chat models using the dpo method.
* @param input 
* @param preferredUnderscorecompletion The preferred completion message for the output.
* @param nonUnderscorepreferredUnderscorecompletion The non-preferred completion message for the output.
*/

case class FineTunePreferenceRequestInput(
  input: Option[FineTunePreferenceRequestInputInput],
  preferredUnderscorecompletion: Option[Refined[List[FineTunePreferenceRequestInputPreferredCompletionInner], MaxSize[1]]],
  nonUnderscorepreferredUnderscorecompletion: Option[Refined[List[FineTunePreferenceRequestInputNonPreferredCompletionInner], MaxSize[1]]]
)
object FineTunePreferenceRequestInput {
  implicit val encoderFineTunePreferenceRequestInput: Encoder[FineTunePreferenceRequestInput] = deriveEncoder[FineTunePreferenceRequestInput].mapJson(_.dropNullValues)
  implicit val decoderFineTunePreferenceRequestInput: Decoder[FineTunePreferenceRequestInput] = deriveDecoder[FineTunePreferenceRequestInput]
}

/**
* 
* @param messages 
* @param tools A list of tools the model may generate JSON inputs for.
* @param parallelUnderscoretoolUnderscorecalls Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
*/

case class FineTunePreferenceRequestInputInput(
  messages: Option[Refined[List[FineTunePreferenceRequestInputInputMessagesInner], MinSize[1]]],
  tools: Option[List[ChatCompletionTool]],
  parallelUnderscoretoolUnderscorecalls: Option[Boolean]
)
object FineTunePreferenceRequestInputInput {
  implicit val encoderFineTunePreferenceRequestInputInput: Encoder[FineTunePreferenceRequestInputInput] = deriveEncoder[FineTunePreferenceRequestInputInput].mapJson(_.dropNullValues)
  implicit val decoderFineTunePreferenceRequestInputInput: Decoder[FineTunePreferenceRequestInputInput] = deriveDecoder[FineTunePreferenceRequestInputInput]
}

/**
* 
* @param content The contents of the function message.
* @param role The role of the messages author, in this case `function`.
* @param name The name of the function to call.
* @param weight Controls whether the assistant message is trained against (0 or 1)
* @param refusal The refusal message by the assistant.
* @param audio 
* @param toolUnderscorecalls The tool calls generated by the model, such as function calls.
* @param functionUnderscorecall 
* @param toolUnderscorecallUnderscoreid Tool call that this message is responding to.
*/
sealed trait FineTunePreferenceRequestInputInputMessagesInner
object FineTunePreferenceRequestInputInputMessagesInner {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val fineTunePreferenceRequestInputInputMessagesInnerEncoder: Encoder[FineTunePreferenceRequestInputInputMessagesInner] = Encoder.instance {
    case chatCompletionRequestFunctionMessage: ChatCompletionRequestFunctionMessage => chatCompletionRequestFunctionMessage.asJson
    case chatCompletionRequestSystemMessage: ChatCompletionRequestSystemMessage => chatCompletionRequestSystemMessage.asJson
    case chatCompletionRequestToolMessage: ChatCompletionRequestToolMessage => chatCompletionRequestToolMessage.asJson
    case chatCompletionRequestUserMessage: ChatCompletionRequestUserMessage => chatCompletionRequestUserMessage.asJson
    case fineTuneChatCompletionRequestAssistantMessage: FineTuneChatCompletionRequestAssistantMessage => fineTuneChatCompletionRequestAssistantMessage.asJson
  }

  implicit val fineTunePreferenceRequestInputInputMessagesInnerDecoder: Decoder[FineTunePreferenceRequestInputInputMessagesInner] =
    List[Decoder[FineTunePreferenceRequestInputInputMessagesInner]](
      Decoder[ChatCompletionRequestFunctionMessage].widen,
      Decoder[ChatCompletionRequestSystemMessage].widen,
      Decoder[ChatCompletionRequestToolMessage].widen,
      Decoder[ChatCompletionRequestUserMessage].widen,
      Decoder[FineTuneChatCompletionRequestAssistantMessage].widen,
  ).reduceLeft(_ or _)
}


/**
* 
* @param content 
* @param refusal The refusal message by the assistant.
* @param role The role of the messages author, in this case `assistant`.
* @param name An optional name for the participant. Provides the model information to differentiate between participants of the same role.
* @param audio 
* @param toolUnderscorecalls The tool calls generated by the model, such as function calls.
* @param functionUnderscorecall 
*/
sealed trait FineTunePreferenceRequestInputNonPreferredCompletionInner
object FineTunePreferenceRequestInputNonPreferredCompletionInner {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val fineTunePreferenceRequestInputNonPreferredCompletionInnerEncoder: Encoder[FineTunePreferenceRequestInputNonPreferredCompletionInner] = Encoder.instance {
    case chatCompletionRequestAssistantMessage: ChatCompletionRequestAssistantMessage => chatCompletionRequestAssistantMessage.asJson
  }

  implicit val fineTunePreferenceRequestInputNonPreferredCompletionInnerDecoder: Decoder[FineTunePreferenceRequestInputNonPreferredCompletionInner] =
    List[Decoder[FineTunePreferenceRequestInputNonPreferredCompletionInner]](
      Decoder[ChatCompletionRequestAssistantMessage].widen,
  ).reduceLeft(_ or _)
}


/**
* 
* @param content 
* @param refusal The refusal message by the assistant.
* @param role The role of the messages author, in this case `assistant`.
* @param name An optional name for the participant. Provides the model information to differentiate between participants of the same role.
* @param audio 
* @param toolUnderscorecalls The tool calls generated by the model, such as function calls.
* @param functionUnderscorecall 
*/
sealed trait FineTunePreferenceRequestInputPreferredCompletionInner
object FineTunePreferenceRequestInputPreferredCompletionInner {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val fineTunePreferenceRequestInputPreferredCompletionInnerEncoder: Encoder[FineTunePreferenceRequestInputPreferredCompletionInner] = Encoder.instance {
    case chatCompletionRequestAssistantMessage: ChatCompletionRequestAssistantMessage => chatCompletionRequestAssistantMessage.asJson
  }

  implicit val fineTunePreferenceRequestInputPreferredCompletionInnerDecoder: Decoder[FineTunePreferenceRequestInputPreferredCompletionInner] =
    List[Decoder[FineTunePreferenceRequestInputPreferredCompletionInner]](
      Decoder[ChatCompletionRequestAssistantMessage].widen,
  ).reduceLeft(_ or _)
}


/**
* Configuration for the supervised fine-tuning method.
* @param hyperparameters 
*/

case class FineTuneSupervisedMethod(
  hyperparameters: Option[FineTuneSupervisedMethodHyperparameters]
)
object FineTuneSupervisedMethod {
  implicit val encoderFineTuneSupervisedMethod: Encoder[FineTuneSupervisedMethod] = deriveEncoder[FineTuneSupervisedMethod].mapJson(_.dropNullValues)
  implicit val decoderFineTuneSupervisedMethod: Decoder[FineTuneSupervisedMethod] = deriveDecoder[FineTuneSupervisedMethod]
}

/**
* The hyperparameters used for the fine-tuning job.
* @param batchUnderscoresize 
* @param learningUnderscorerateUnderscoremultiplier 
* @param nUnderscoreepochs 
*/

case class FineTuneSupervisedMethodHyperparameters(
  batchUnderscoresize: Option[FineTuneSupervisedMethodHyperparametersBatchSize],
  learningUnderscorerateUnderscoremultiplier: Option[FineTuneSupervisedMethodHyperparametersLearningRateMultiplier],
  nUnderscoreepochs: Option[FineTuneSupervisedMethodHyperparametersNEpochs]
)
object FineTuneSupervisedMethodHyperparameters {
  implicit val encoderFineTuneSupervisedMethodHyperparameters: Encoder[FineTuneSupervisedMethodHyperparameters] = deriveEncoder[FineTuneSupervisedMethodHyperparameters].mapJson(_.dropNullValues)
  implicit val decoderFineTuneSupervisedMethodHyperparameters: Decoder[FineTuneSupervisedMethodHyperparameters] = deriveDecoder[FineTuneSupervisedMethodHyperparameters]
}

/**
* Number of examples in each batch. A larger batch size means that model parameters are updated less frequently, but with lower variance. 
*/
sealed trait FineTuneSupervisedMethodHyperparametersBatchSize
object FineTuneSupervisedMethodHyperparametersBatchSize {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val fineTuneSupervisedMethodHyperparametersBatchSizeEncoder: Encoder[FineTuneSupervisedMethodHyperparametersBatchSize] = Encoder.instance {
    case `int`: Int => `int`.asJson
    case string: String => string.asJson
  }

  implicit val fineTuneSupervisedMethodHyperparametersBatchSizeDecoder: Decoder[FineTuneSupervisedMethodHyperparametersBatchSize] =
    List[Decoder[FineTuneSupervisedMethodHyperparametersBatchSize]](
      Decoder[Int].widen,
      Decoder[String].widen,
  ).reduceLeft(_ or _)
}


/**
* Scaling factor for the learning rate. A smaller learning rate may be useful to avoid overfitting. 
*/
sealed trait FineTuneSupervisedMethodHyperparametersLearningRateMultiplier
object FineTuneSupervisedMethodHyperparametersLearningRateMultiplier {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val fineTuneSupervisedMethodHyperparametersLearningRateMultiplierEncoder: Encoder[FineTuneSupervisedMethodHyperparametersLearningRateMultiplier] = Encoder.instance {
    case bigDecimal: BigDecimal => bigDecimal.asJson
    case string: String => string.asJson
  }

  implicit val fineTuneSupervisedMethodHyperparametersLearningRateMultiplierDecoder: Decoder[FineTuneSupervisedMethodHyperparametersLearningRateMultiplier] =
    List[Decoder[FineTuneSupervisedMethodHyperparametersLearningRateMultiplier]](
      Decoder[BigDecimal].widen,
      Decoder[String].widen,
  ).reduceLeft(_ or _)
}


/**
* The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. 
*/
sealed trait FineTuneSupervisedMethodHyperparametersNEpochs
object FineTuneSupervisedMethodHyperparametersNEpochs {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val fineTuneSupervisedMethodHyperparametersNEpochsEncoder: Encoder[FineTuneSupervisedMethodHyperparametersNEpochs] = Encoder.instance {
    case `int`: Int => `int`.asJson
    case string: String => string.asJson
  }

  implicit val fineTuneSupervisedMethodHyperparametersNEpochsDecoder: Decoder[FineTuneSupervisedMethodHyperparametersNEpochs] =
    List[Decoder[FineTuneSupervisedMethodHyperparametersNEpochs]](
      Decoder[Int].widen,
      Decoder[String].widen,
  ).reduceLeft(_ or _)
}


/**
* 
* @param `type` The type of the integration being enabled for the fine-tuning job
* @param wandb 
*/

case class FineTuningIntegration(
  `type`: String,
  wandb: FineTuningIntegrationWandb
) extends FineTuningJobIntegrationsInner
object FineTuningIntegration {
  implicit val encoderFineTuningIntegration: Encoder[FineTuningIntegration] = deriveEncoder[FineTuningIntegration].mapJson(_.dropNullValues)
  implicit val decoderFineTuningIntegration: Decoder[FineTuningIntegration] = deriveDecoder[FineTuningIntegration]
}

/**
* The settings for your integration with Weights and Biases. This payload specifies the project that metrics will be sent to. Optionally, you can set an explicit display name for your run, add tags to your run, and set a default entity (team, username, etc) to be associated with your run. 
* @param project The name of the project that the new run will be created under. 
* @param name A display name to set for the run. If not set, we will use the Job ID as the name. 
* @param entity The entity to use for the run. This allows you to set the team or username of the WandB user that you would like associated with the run. If not set, the default entity for the registered WandB API key is used. 
* @param tags A list of tags to be attached to the newly created run. These tags are passed through directly to WandB. Some default tags are generated by OpenAI: \"openai/finetune\", \"openai/{base-model}\", \"openai/{ftjob-abcdef}\". 
*/

case class FineTuningIntegrationWandb(
  project: String,
  name: Option[String],
  entity: Option[String],
  tags: Option[List[String]]
)
object FineTuningIntegrationWandb {
  implicit val encoderFineTuningIntegrationWandb: Encoder[FineTuningIntegrationWandb] = deriveEncoder[FineTuningIntegrationWandb].mapJson(_.dropNullValues)
  implicit val decoderFineTuningIntegrationWandb: Decoder[FineTuningIntegrationWandb] = deriveDecoder[FineTuningIntegrationWandb]
}

/**
* The `fine_tuning.job` object represents a fine-tuning job that has been created through the API. 
* @param id The object identifier, which can be referenced in the API endpoints.
* @param createdUnderscoreat The Unix timestamp (in seconds) for when the fine-tuning job was created.
* @param error 
* @param fineUnderscoretunedUnderscoremodel The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running.
* @param finishedUnderscoreat The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running.
* @param hyperparameters 
* @param model The base model that is being fine-tuned.
* @param `object` The object type, which is always \"fine_tuning.job\".
* @param organizationUnderscoreid The organization that owns the fine-tuning job.
* @param resultUnderscorefiles The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents).
* @param status The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`.
* @param trainedUnderscoretokens The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running.
* @param trainingUnderscorefile The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents).
* @param validationUnderscorefile The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents).
* @param integrations A list of integrations to enable for this fine-tuning job.
* @param seed The seed used for the fine-tuning job.
* @param estimatedUnderscorefinish The Unix timestamp (in seconds) for when the fine-tuning job is estimated to finish. The value will be null if the fine-tuning job is not running.
* @param method 
*/

case class FineTuningJob(
  id: String,
  createdUnderscoreat: Int,
  error: FineTuningJobError,
  fineUnderscoretunedUnderscoremodel: String,
  finishedUnderscoreat: Int,
  hyperparameters: FineTuningJobHyperparameters,
  model: String,
  `object`: String,
  organizationUnderscoreid: String,
  resultUnderscorefiles: List[String],
  status: String,
  trainedUnderscoretokens: Int,
  trainingUnderscorefile: String,
  validationUnderscorefile: String,
  integrations: Option[Refined[List[FineTuningJobIntegrationsInner], MaxSize[5]]],
  seed: Int,
  estimatedUnderscorefinish: Option[Int],
  method: Option[FineTuneMethod]
)
object FineTuningJob {
  implicit val encoderFineTuningJob: Encoder[FineTuningJob] = deriveEncoder[FineTuningJob].mapJson(_.dropNullValues)
  implicit val decoderFineTuningJob: Decoder[FineTuningJob] = deriveDecoder[FineTuningJob]
}

/**
* The `fine_tuning.job.checkpoint` object represents a model checkpoint for a fine-tuning job that is ready to use. 
* @param id The checkpoint identifier, which can be referenced in the API endpoints.
* @param createdUnderscoreat The Unix timestamp (in seconds) for when the checkpoint was created.
* @param fineUnderscoretunedUnderscoremodelUnderscorecheckpoint The name of the fine-tuned checkpoint model that is created.
* @param stepUnderscorenumber The step number that the checkpoint was created at.
* @param metrics 
* @param fineUnderscoretuningUnderscorejobUnderscoreid The name of the fine-tuning job that this checkpoint was created from.
* @param `object` The object type, which is always \"fine_tuning.job.checkpoint\".
*/

case class FineTuningJobCheckpoint(
  id: String,
  createdUnderscoreat: Int,
  fineUnderscoretunedUnderscoremodelUnderscorecheckpoint: String,
  stepUnderscorenumber: Int,
  metrics: FineTuningJobCheckpointMetrics,
  fineUnderscoretuningUnderscorejobUnderscoreid: String,
  `object`: String
)
object FineTuningJobCheckpoint {
  implicit val encoderFineTuningJobCheckpoint: Encoder[FineTuningJobCheckpoint] = deriveEncoder[FineTuningJobCheckpoint].mapJson(_.dropNullValues)
  implicit val decoderFineTuningJobCheckpoint: Decoder[FineTuningJobCheckpoint] = deriveDecoder[FineTuningJobCheckpoint]
}

/**
* Metrics at the step number during the fine-tuning job.
* @param step 
* @param trainUnderscoreloss 
* @param trainUnderscoremeanUnderscoretokenUnderscoreaccuracy 
* @param validUnderscoreloss 
* @param validUnderscoremeanUnderscoretokenUnderscoreaccuracy 
* @param fullUnderscorevalidUnderscoreloss 
* @param fullUnderscorevalidUnderscoremeanUnderscoretokenUnderscoreaccuracy 
*/

case class FineTuningJobCheckpointMetrics(
  step: Option[BigDecimal],
  trainUnderscoreloss: Option[BigDecimal],
  trainUnderscoremeanUnderscoretokenUnderscoreaccuracy: Option[BigDecimal],
  validUnderscoreloss: Option[BigDecimal],
  validUnderscoremeanUnderscoretokenUnderscoreaccuracy: Option[BigDecimal],
  fullUnderscorevalidUnderscoreloss: Option[BigDecimal],
  fullUnderscorevalidUnderscoremeanUnderscoretokenUnderscoreaccuracy: Option[BigDecimal]
)
object FineTuningJobCheckpointMetrics {
  implicit val encoderFineTuningJobCheckpointMetrics: Encoder[FineTuningJobCheckpointMetrics] = deriveEncoder[FineTuningJobCheckpointMetrics].mapJson(_.dropNullValues)
  implicit val decoderFineTuningJobCheckpointMetrics: Decoder[FineTuningJobCheckpointMetrics] = deriveDecoder[FineTuningJobCheckpointMetrics]
}

/**
* For fine-tuning jobs that have `failed`, this will contain more information on the cause of the failure.
* @param code A machine-readable error code.
* @param message A human-readable error message.
* @param param The parameter that was invalid, usually `training_file` or `validation_file`. This field will be null if the failure was not parameter-specific.
*/

case class FineTuningJobError(
  code: String,
  message: String,
  param: String
)
object FineTuningJobError {
  implicit val encoderFineTuningJobError: Encoder[FineTuningJobError] = deriveEncoder[FineTuningJobError].mapJson(_.dropNullValues)
  implicit val decoderFineTuningJobError: Decoder[FineTuningJobError] = deriveDecoder[FineTuningJobError]
}

/**
* Fine-tuning job event object
* @param `object` The object type, which is always \"fine_tuning.job.event\".
* @param id The object identifier.
* @param createdUnderscoreat The Unix timestamp (in seconds) for when the fine-tuning job was created.
* @param level The log level of the event.
* @param message The message of the event.
* @param `type` The type of event.
* @param data The data associated with the event.
*/

case class FineTuningJobEvent(
  `object`: String,
  id: String,
  createdUnderscoreat: Int,
  level: String,
  message: String,
  `type`: Option[String],
  data: Option[Object]
)
object FineTuningJobEvent {
  implicit val encoderFineTuningJobEvent: Encoder[FineTuningJobEvent] = deriveEncoder[FineTuningJobEvent].mapJson(_.dropNullValues)
  implicit val decoderFineTuningJobEvent: Decoder[FineTuningJobEvent] = deriveDecoder[FineTuningJobEvent]
}

/**
* The hyperparameters used for the fine-tuning job. This value will only be returned when running `supervised` jobs.
* @param batchUnderscoresize 
* @param learningUnderscorerateUnderscoremultiplier 
* @param nUnderscoreepochs 
*/

case class FineTuningJobHyperparameters(
  batchUnderscoresize: Option[FineTuningJobHyperparametersBatchSize],
  learningUnderscorerateUnderscoremultiplier: Option[FineTuningJobHyperparametersLearningRateMultiplier],
  nUnderscoreepochs: Option[FineTuningJobHyperparametersNEpochs]
)
object FineTuningJobHyperparameters {
  implicit val encoderFineTuningJobHyperparameters: Encoder[FineTuningJobHyperparameters] = deriveEncoder[FineTuningJobHyperparameters].mapJson(_.dropNullValues)
  implicit val decoderFineTuningJobHyperparameters: Decoder[FineTuningJobHyperparameters] = deriveDecoder[FineTuningJobHyperparameters]
}

/**
* Number of examples in each batch. A larger batch size means that model parameters are updated less frequently, but with lower variance. 
*/
sealed trait FineTuningJobHyperparametersBatchSize
object FineTuningJobHyperparametersBatchSize {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val fineTuningJobHyperparametersBatchSizeEncoder: Encoder[FineTuningJobHyperparametersBatchSize] = Encoder.instance {
    case `int`: Int => `int`.asJson
    case string: String => string.asJson
  }

  implicit val fineTuningJobHyperparametersBatchSizeDecoder: Decoder[FineTuningJobHyperparametersBatchSize] =
    List[Decoder[FineTuningJobHyperparametersBatchSize]](
      Decoder[Int].widen,
      Decoder[String].widen,
  ).reduceLeft(_ or _)
}


/**
* Scaling factor for the learning rate. A smaller learning rate may be useful to avoid overfitting. 
*/
sealed trait FineTuningJobHyperparametersLearningRateMultiplier
object FineTuningJobHyperparametersLearningRateMultiplier {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val fineTuningJobHyperparametersLearningRateMultiplierEncoder: Encoder[FineTuningJobHyperparametersLearningRateMultiplier] = Encoder.instance {
    case bigDecimal: BigDecimal => bigDecimal.asJson
    case string: String => string.asJson
  }

  implicit val fineTuningJobHyperparametersLearningRateMultiplierDecoder: Decoder[FineTuningJobHyperparametersLearningRateMultiplier] =
    List[Decoder[FineTuningJobHyperparametersLearningRateMultiplier]](
      Decoder[BigDecimal].widen,
      Decoder[String].widen,
  ).reduceLeft(_ or _)
}


/**
* The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. 
*/
sealed trait FineTuningJobHyperparametersNEpochs
object FineTuningJobHyperparametersNEpochs {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val fineTuningJobHyperparametersNEpochsEncoder: Encoder[FineTuningJobHyperparametersNEpochs] = Encoder.instance {
    case `int`: Int => `int`.asJson
    case string: String => string.asJson
  }

  implicit val fineTuningJobHyperparametersNEpochsDecoder: Decoder[FineTuningJobHyperparametersNEpochs] =
    List[Decoder[FineTuningJobHyperparametersNEpochs]](
      Decoder[Int].widen,
      Decoder[String].widen,
  ).reduceLeft(_ or _)
}


/**
* 
* @param `type` The type of the integration being enabled for the fine-tuning job
* @param wandb 
*/
sealed trait FineTuningJobIntegrationsInner
object FineTuningJobIntegrationsInner {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val fineTuningJobIntegrationsInnerEncoder: Encoder[FineTuningJobIntegrationsInner] = Encoder.instance {
    case fineTuningIntegration: FineTuningIntegration => fineTuningIntegration.asJson
  }

  implicit val fineTuningJobIntegrationsInnerDecoder: Decoder[FineTuningJobIntegrationsInner] =
    List[Decoder[FineTuningJobIntegrationsInner]](
      Decoder[FineTuningIntegration].widen,
  ).reduceLeft(_ or _)
}


/**
* 
* @param description A description of what the function does, used by the model to choose when and how to call the function.
* @param name The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.
* @param parameters The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.   Omitting `parameters` defines a function with an empty parameter list.
* @param strict Whether to enable strict schema adherence when generating the function call. If set to true, the model will follow the exact schema defined in the `parameters` field. Only a subset of JSON Schema is supported when `strict` is `true`. Learn more about Structured Outputs in the [function calling guide](docs/guides/function-calling).
*/

case class FunctionObject(
  description: Option[String],
  name: String,
  parameters: Option[Map[String, AnyType]],
  strict: Option[Boolean]
)
object FunctionObject {
  implicit val encoderFunctionObject: Encoder[FunctionObject] = deriveEncoder[FunctionObject].mapJson(_.dropNullValues)
  implicit val decoderFunctionObject: Decoder[FunctionObject] = deriveDecoder[FunctionObject]
}

/**
* Represents the url or the content of an image generated by the OpenAI API.
* @param b64Underscorejson The base64-encoded JSON of the generated image, if `response_format` is `b64_json`.
* @param url The URL of the generated image, if `response_format` is `url` (default).
* @param revisedUnderscoreprompt The prompt that was used to generate the image, if there was any revision to the prompt.
*/

case class Image(
  b64Underscorejson: Option[String],
  url: Option[String],
  revisedUnderscoreprompt: Option[String]
)
object Image {
  implicit val encoderImage: Encoder[Image] = deriveEncoder[Image].mapJson(_.dropNullValues)
  implicit val decoderImage: Decoder[Image] = deriveDecoder[Image]
}

/**
* 
* @param created 
* @param data 
*/

case class ImagesResponse(
  created: Int,
  data: List[Image]
)
object ImagesResponse {
  implicit val encoderImagesResponse: Encoder[ImagesResponse] = deriveEncoder[ImagesResponse].mapJson(_.dropNullValues)
  implicit val decoderImagesResponse: Decoder[ImagesResponse] = deriveDecoder[ImagesResponse]
}

/**
* Represents an individual `invite` to the organization.
* @param `object` The object type, which is always `organization.invite`
* @param id The identifier, which can be referenced in API endpoints
* @param email The email address of the individual to whom the invite was sent
* @param role `owner` or `reader`
* @param status `accepted`,`expired`, or `pending`
* @param invitedUnderscoreat The Unix timestamp (in seconds) of when the invite was sent.
* @param expiresUnderscoreat The Unix timestamp (in seconds) of when the invite expires.
* @param acceptedUnderscoreat The Unix timestamp (in seconds) of when the invite was accepted.
* @param projects The projects that were granted membership upon acceptance of the invite.
*/

case class Invite(
  `object`: String,
  id: String,
  email: String,
  role: String,
  status: String,
  invitedUnderscoreat: Int,
  expiresUnderscoreat: Int,
  acceptedUnderscoreat: Option[Int],
  projects: Option[List[InviteProjectsInner]]
)
object Invite {
  implicit val encoderInvite: Encoder[Invite] = deriveEncoder[Invite].mapJson(_.dropNullValues)
  implicit val decoderInvite: Decoder[Invite] = deriveDecoder[Invite]
}

/**
* 
* @param `object` The object type, which is always `organization.invite.deleted`
* @param id 
* @param deleted 
*/

case class InviteDeleteResponse(
  `object`: String,
  id: String,
  deleted: Boolean
)
object InviteDeleteResponse {
  implicit val encoderInviteDeleteResponse: Encoder[InviteDeleteResponse] = deriveEncoder[InviteDeleteResponse].mapJson(_.dropNullValues)
  implicit val decoderInviteDeleteResponse: Decoder[InviteDeleteResponse] = deriveDecoder[InviteDeleteResponse]
}

/**
* 
* @param `object` The object type, which is always `list`
* @param data 
* @param firstUnderscoreid The first `invite_id` in the retrieved `list`
* @param lastUnderscoreid The last `invite_id` in the retrieved `list`
* @param hasUnderscoremore The `has_more` property is used for pagination to indicate there are additional results.
*/

case class InviteListResponse(
  `object`: String,
  data: List[Invite],
  firstUnderscoreid: Option[String],
  lastUnderscoreid: Option[String],
  hasUnderscoremore: Option[Boolean]
)
object InviteListResponse {
  implicit val encoderInviteListResponse: Encoder[InviteListResponse] = deriveEncoder[InviteListResponse].mapJson(_.dropNullValues)
  implicit val decoderInviteListResponse: Decoder[InviteListResponse] = deriveDecoder[InviteListResponse]
}

/**
* 
* @param id Project's public ID
* @param role Project membership role
*/

case class InviteProjectsInner(
  id: Option[String],
  role: Option[String]
)
object InviteProjectsInner {
  implicit val encoderInviteProjectsInner: Encoder[InviteProjectsInner] = deriveEncoder[InviteProjectsInner].mapJson(_.dropNullValues)
  implicit val decoderInviteProjectsInner: Decoder[InviteProjectsInner] = deriveDecoder[InviteProjectsInner]
}

/**
* 
* @param email Send an email to this address
* @param role `owner` or `reader`
* @param projects An array of projects to which membership is granted at the same time the org invite is accepted. If omitted, the user will be invited to the default project for compatibility with legacy behavior.
*/

case class InviteRequest(
  email: String,
  role: String,
  projects: Option[List[InviteRequestProjectsInner]]
)
object InviteRequest {
  implicit val encoderInviteRequest: Encoder[InviteRequest] = deriveEncoder[InviteRequest].mapJson(_.dropNullValues)
  implicit val decoderInviteRequest: Decoder[InviteRequest] = deriveDecoder[InviteRequest]
}

/**
* 
* @param id Project's public ID
* @param role Project membership role
*/

case class InviteRequestProjectsInner(
  id: String,
  role: String
)
object InviteRequestProjectsInner {
  implicit val encoderInviteRequestProjectsInner: Encoder[InviteRequestProjectsInner] = deriveEncoder[InviteRequestProjectsInner].mapJson(_.dropNullValues)
  implicit val decoderInviteRequestProjectsInner: Decoder[InviteRequestProjectsInner] = deriveDecoder[InviteRequestProjectsInner]
}

/**
* 
* @param `object` 
* @param data 
* @param firstUnderscoreid 
* @param lastUnderscoreid 
* @param hasUnderscoremore 
*/

case class ListAssistantsResponse(
  `object`: String,
  data: List[AssistantObject],
  firstUnderscoreid: String,
  lastUnderscoreid: String,
  hasUnderscoremore: Boolean
)
object ListAssistantsResponse {
  implicit val encoderListAssistantsResponse: Encoder[ListAssistantsResponse] = deriveEncoder[ListAssistantsResponse].mapJson(_.dropNullValues)
  implicit val decoderListAssistantsResponse: Decoder[ListAssistantsResponse] = deriveDecoder[ListAssistantsResponse]
}

/**
* 
* @param gt Return only events whose `effective_at` (Unix seconds) is greater than this value.
* @param gte Return only events whose `effective_at` (Unix seconds) is greater than or equal to this value.
* @param lt Return only events whose `effective_at` (Unix seconds) is less than this value.
* @param lte Return only events whose `effective_at` (Unix seconds) is less than or equal to this value.
*/

case class ListAuditLogsEffectiveAtParameter(
  gt: Option[Int],
  gte: Option[Int],
  lt: Option[Int],
  lte: Option[Int]
)
object ListAuditLogsEffectiveAtParameter {
  implicit val encoderListAuditLogsEffectiveAtParameter: Encoder[ListAuditLogsEffectiveAtParameter] = deriveEncoder[ListAuditLogsEffectiveAtParameter].mapJson(_.dropNullValues)
  implicit val decoderListAuditLogsEffectiveAtParameter: Decoder[ListAuditLogsEffectiveAtParameter] = deriveDecoder[ListAuditLogsEffectiveAtParameter]
}

/**
* 
* @param `object` 
* @param data 
* @param firstUnderscoreid 
* @param lastUnderscoreid 
* @param hasUnderscoremore 
*/

case class ListAuditLogsResponse(
  `object`: String,
  data: List[AuditLog],
  firstUnderscoreid: String,
  lastUnderscoreid: String,
  hasUnderscoremore: Boolean
)
object ListAuditLogsResponse {
  implicit val encoderListAuditLogsResponse: Encoder[ListAuditLogsResponse] = deriveEncoder[ListAuditLogsResponse].mapJson(_.dropNullValues)
  implicit val decoderListAuditLogsResponse: Decoder[ListAuditLogsResponse] = deriveDecoder[ListAuditLogsResponse]
}

/**
* 
* @param data 
* @param firstUnderscoreid 
* @param lastUnderscoreid 
* @param hasUnderscoremore 
* @param `object` 
*/

case class ListBatchesResponse(
  data: List[Batch],
  firstUnderscoreid: Option[String],
  lastUnderscoreid: Option[String],
  hasUnderscoremore: Boolean,
  `object`: String
)
object ListBatchesResponse {
  implicit val encoderListBatchesResponse: Encoder[ListBatchesResponse] = deriveEncoder[ListBatchesResponse].mapJson(_.dropNullValues)
  implicit val decoderListBatchesResponse: Decoder[ListBatchesResponse] = deriveDecoder[ListBatchesResponse]
}

/**
* 
* @param `object` 
* @param data 
* @param firstUnderscoreid 
* @param lastUnderscoreid 
* @param hasUnderscoremore 
*/

case class ListFilesResponse(
  `object`: String,
  data: List[OpenAIFile],
  firstUnderscoreid: String,
  lastUnderscoreid: String,
  hasUnderscoremore: Boolean
)
object ListFilesResponse {
  implicit val encoderListFilesResponse: Encoder[ListFilesResponse] = deriveEncoder[ListFilesResponse].mapJson(_.dropNullValues)
  implicit val decoderListFilesResponse: Decoder[ListFilesResponse] = deriveDecoder[ListFilesResponse]
}

/**
* 
* @param data 
* @param `object` 
* @param firstUnderscoreid 
* @param lastUnderscoreid 
* @param hasUnderscoremore 
*/

case class ListFineTuningJobCheckpointsResponse(
  data: List[FineTuningJobCheckpoint],
  `object`: String,
  firstUnderscoreid: Option[String],
  lastUnderscoreid: Option[String],
  hasUnderscoremore: Boolean
)
object ListFineTuningJobCheckpointsResponse {
  implicit val encoderListFineTuningJobCheckpointsResponse: Encoder[ListFineTuningJobCheckpointsResponse] = deriveEncoder[ListFineTuningJobCheckpointsResponse].mapJson(_.dropNullValues)
  implicit val decoderListFineTuningJobCheckpointsResponse: Decoder[ListFineTuningJobCheckpointsResponse] = deriveDecoder[ListFineTuningJobCheckpointsResponse]
}

/**
* 
* @param data 
* @param `object` 
*/

case class ListFineTuningJobEventsResponse(
  data: List[FineTuningJobEvent],
  `object`: String
)
object ListFineTuningJobEventsResponse {
  implicit val encoderListFineTuningJobEventsResponse: Encoder[ListFineTuningJobEventsResponse] = deriveEncoder[ListFineTuningJobEventsResponse].mapJson(_.dropNullValues)
  implicit val decoderListFineTuningJobEventsResponse: Decoder[ListFineTuningJobEventsResponse] = deriveDecoder[ListFineTuningJobEventsResponse]
}

/**
* 
* @param `object` 
* @param data 
* @param firstUnderscoreid 
* @param lastUnderscoreid 
* @param hasUnderscoremore 
*/

case class ListMessagesResponse(
  `object`: String,
  data: List[MessageObject],
  firstUnderscoreid: String,
  lastUnderscoreid: String,
  hasUnderscoremore: Boolean
)
object ListMessagesResponse {
  implicit val encoderListMessagesResponse: Encoder[ListMessagesResponse] = deriveEncoder[ListMessagesResponse].mapJson(_.dropNullValues)
  implicit val decoderListMessagesResponse: Decoder[ListMessagesResponse] = deriveDecoder[ListMessagesResponse]
}

/**
* 
* @param `object` 
* @param data 
*/

case class ListModelsResponse(
  `object`: String,
  data: List[Model]
)
object ListModelsResponse {
  implicit val encoderListModelsResponse: Encoder[ListModelsResponse] = deriveEncoder[ListModelsResponse].mapJson(_.dropNullValues)
  implicit val decoderListModelsResponse: Decoder[ListModelsResponse] = deriveDecoder[ListModelsResponse]
}

/**
* 
* @param data 
* @param hasUnderscoremore 
* @param `object` 
*/

case class ListPaginatedFineTuningJobsResponse(
  data: List[FineTuningJob],
  hasUnderscoremore: Boolean,
  `object`: String
)
object ListPaginatedFineTuningJobsResponse {
  implicit val encoderListPaginatedFineTuningJobsResponse: Encoder[ListPaginatedFineTuningJobsResponse] = deriveEncoder[ListPaginatedFineTuningJobsResponse].mapJson(_.dropNullValues)
  implicit val decoderListPaginatedFineTuningJobsResponse: Decoder[ListPaginatedFineTuningJobsResponse] = deriveDecoder[ListPaginatedFineTuningJobsResponse]
}

/**
* 
* @param `object` 
* @param data 
* @param firstUnderscoreid 
* @param lastUnderscoreid 
* @param hasUnderscoremore 
*/

case class ListRunStepsResponse(
  `object`: String,
  data: List[RunStepObject],
  firstUnderscoreid: String,
  lastUnderscoreid: String,
  hasUnderscoremore: Boolean
)
object ListRunStepsResponse {
  implicit val encoderListRunStepsResponse: Encoder[ListRunStepsResponse] = deriveEncoder[ListRunStepsResponse].mapJson(_.dropNullValues)
  implicit val decoderListRunStepsResponse: Decoder[ListRunStepsResponse] = deriveDecoder[ListRunStepsResponse]
}

/**
* 
* @param `object` 
* @param data 
* @param firstUnderscoreid 
* @param lastUnderscoreid 
* @param hasUnderscoremore 
*/

case class ListRunsResponse(
  `object`: String,
  data: List[RunObject],
  firstUnderscoreid: String,
  lastUnderscoreid: String,
  hasUnderscoremore: Boolean
)
object ListRunsResponse {
  implicit val encoderListRunsResponse: Encoder[ListRunsResponse] = deriveEncoder[ListRunsResponse].mapJson(_.dropNullValues)
  implicit val decoderListRunsResponse: Decoder[ListRunsResponse] = deriveDecoder[ListRunsResponse]
}

/**
* 
* @param `object` 
* @param data 
* @param firstUnderscoreid 
* @param lastUnderscoreid 
* @param hasUnderscoremore 
*/

case class ListThreadsResponse(
  `object`: String,
  data: List[ThreadObject],
  firstUnderscoreid: String,
  lastUnderscoreid: String,
  hasUnderscoremore: Boolean
)
object ListThreadsResponse {
  implicit val encoderListThreadsResponse: Encoder[ListThreadsResponse] = deriveEncoder[ListThreadsResponse].mapJson(_.dropNullValues)
  implicit val decoderListThreadsResponse: Decoder[ListThreadsResponse] = deriveDecoder[ListThreadsResponse]
}

/**
* 
* @param `object` 
* @param data 
* @param firstUnderscoreid 
* @param lastUnderscoreid 
* @param hasUnderscoremore 
*/

case class ListVectorStoreFilesResponse(
  `object`: String,
  data: List[VectorStoreFileObject],
  firstUnderscoreid: String,
  lastUnderscoreid: String,
  hasUnderscoremore: Boolean
)
object ListVectorStoreFilesResponse {
  implicit val encoderListVectorStoreFilesResponse: Encoder[ListVectorStoreFilesResponse] = deriveEncoder[ListVectorStoreFilesResponse].mapJson(_.dropNullValues)
  implicit val decoderListVectorStoreFilesResponse: Decoder[ListVectorStoreFilesResponse] = deriveDecoder[ListVectorStoreFilesResponse]
}

/**
* 
* @param `object` 
* @param data 
* @param firstUnderscoreid 
* @param lastUnderscoreid 
* @param hasUnderscoremore 
*/

case class ListVectorStoresResponse(
  `object`: String,
  data: List[VectorStoreObject],
  firstUnderscoreid: String,
  lastUnderscoreid: String,
  hasUnderscoremore: Boolean
)
object ListVectorStoresResponse {
  implicit val encoderListVectorStoresResponse: Encoder[ListVectorStoresResponse] = deriveEncoder[ListVectorStoresResponse].mapJson(_.dropNullValues)
  implicit val decoderListVectorStoresResponse: Decoder[ListVectorStoresResponse] = deriveDecoder[ListVectorStoresResponse]
}

/**
* References an image [File](/docs/api-reference/files) in the content of a message.
* @param `type` Always `image_file`.
* @param imageUnderscorefile 
*/

case class MessageContentImageFileObject(
  `type`: String,
  imageUnderscorefile: MessageContentImageFileObjectImageFile
) extends ArrayOfContentPartsInner with MessageObjectContentInner
object MessageContentImageFileObject {
  implicit val encoderMessageContentImageFileObject: Encoder[MessageContentImageFileObject] = deriveEncoder[MessageContentImageFileObject].mapJson(_.dropNullValues)
  implicit val decoderMessageContentImageFileObject: Decoder[MessageContentImageFileObject] = deriveDecoder[MessageContentImageFileObject]
}

/**
* 
* @param fileUnderscoreid The [File](/docs/api-reference/files) ID of the image in the message content. Set `purpose=\"vision\"` when uploading the File if you need to later display the file content.
* @param detail Specifies the detail level of the image if specified by the user. `low` uses fewer tokens, you can opt in to high resolution using `high`.
*/

case class MessageContentImageFileObjectImageFile(
  fileUnderscoreid: String,
  detail: Option[String]
)
object MessageContentImageFileObjectImageFile {
  implicit val encoderMessageContentImageFileObjectImageFile: Encoder[MessageContentImageFileObjectImageFile] = deriveEncoder[MessageContentImageFileObjectImageFile].mapJson(_.dropNullValues)
  implicit val decoderMessageContentImageFileObjectImageFile: Decoder[MessageContentImageFileObjectImageFile] = deriveDecoder[MessageContentImageFileObjectImageFile]
}

/**
* References an image URL in the content of a message.
* @param `type` The type of the content part.
* @param imageUnderscoreurl 
*/

case class MessageContentImageUrlObject(
  `type`: String,
  imageUnderscoreurl: MessageContentImageUrlObjectImageUrl
) extends ArrayOfContentPartsInner with MessageObjectContentInner
object MessageContentImageUrlObject {
  implicit val encoderMessageContentImageUrlObject: Encoder[MessageContentImageUrlObject] = deriveEncoder[MessageContentImageUrlObject].mapJson(_.dropNullValues)
  implicit val decoderMessageContentImageUrlObject: Decoder[MessageContentImageUrlObject] = deriveDecoder[MessageContentImageUrlObject]
}

/**
* 
* @param url The external URL of the image, must be a supported image types: jpeg, jpg, png, gif, webp.
* @param detail Specifies the detail level of the image. `low` uses fewer tokens, you can opt in to high resolution using `high`. Default value is `auto`
*/

case class MessageContentImageUrlObjectImageUrl(
  url: URI,
  detail: Option[String]
)
object MessageContentImageUrlObjectImageUrl {
  implicit val encoderMessageContentImageUrlObjectImageUrl: Encoder[MessageContentImageUrlObjectImageUrl] = deriveEncoder[MessageContentImageUrlObjectImageUrl].mapJson(_.dropNullValues)
  implicit val decoderMessageContentImageUrlObjectImageUrl: Decoder[MessageContentImageUrlObjectImageUrl] = deriveDecoder[MessageContentImageUrlObjectImageUrl]
}

/**
* The refusal content generated by the assistant.
* @param `type` Always `refusal`.
* @param refusal 
*/

case class MessageContentRefusalObject(
  `type`: String,
  refusal: String
) extends MessageObjectContentInner
object MessageContentRefusalObject {
  implicit val encoderMessageContentRefusalObject: Encoder[MessageContentRefusalObject] = deriveEncoder[MessageContentRefusalObject].mapJson(_.dropNullValues)
  implicit val decoderMessageContentRefusalObject: Decoder[MessageContentRefusalObject] = deriveDecoder[MessageContentRefusalObject]
}

/**
* A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \"file_search\" tool to search files.
* @param `type` Always `file_citation`.
* @param text The text in the message content that needs to be replaced.
* @param fileUnderscorecitation 
* @param startUnderscoreindex 
* @param endUnderscoreindex 
*/

case class MessageContentTextAnnotationsFileCitationObject(
  `type`: String,
  text: String,
  fileUnderscorecitation: MessageContentTextAnnotationsFileCitationObjectFileCitation,
  startUnderscoreindex: Refined[Int, GreaterEqual[0]],
  endUnderscoreindex: Refined[Int, GreaterEqual[0]]
) extends MessageContentTextObjectTextAnnotationsInner
object MessageContentTextAnnotationsFileCitationObject {
  implicit val encoderMessageContentTextAnnotationsFileCitationObject: Encoder[MessageContentTextAnnotationsFileCitationObject] = deriveEncoder[MessageContentTextAnnotationsFileCitationObject].mapJson(_.dropNullValues)
  implicit val decoderMessageContentTextAnnotationsFileCitationObject: Decoder[MessageContentTextAnnotationsFileCitationObject] = deriveDecoder[MessageContentTextAnnotationsFileCitationObject]
}

/**
* 
* @param fileUnderscoreid The ID of the specific File the citation is from.
*/

case class MessageContentTextAnnotationsFileCitationObjectFileCitation(
  fileUnderscoreid: String
)
object MessageContentTextAnnotationsFileCitationObjectFileCitation {
  implicit val encoderMessageContentTextAnnotationsFileCitationObjectFileCitation: Encoder[MessageContentTextAnnotationsFileCitationObjectFileCitation] = deriveEncoder[MessageContentTextAnnotationsFileCitationObjectFileCitation].mapJson(_.dropNullValues)
  implicit val decoderMessageContentTextAnnotationsFileCitationObjectFileCitation: Decoder[MessageContentTextAnnotationsFileCitationObjectFileCitation] = deriveDecoder[MessageContentTextAnnotationsFileCitationObjectFileCitation]
}

/**
* A URL for the file that's generated when the assistant used the `code_interpreter` tool to generate a file.
* @param `type` Always `file_path`.
* @param text The text in the message content that needs to be replaced.
* @param fileUnderscorepath 
* @param startUnderscoreindex 
* @param endUnderscoreindex 
*/

case class MessageContentTextAnnotationsFilePathObject(
  `type`: String,
  text: String,
  fileUnderscorepath: MessageContentTextAnnotationsFilePathObjectFilePath,
  startUnderscoreindex: Refined[Int, GreaterEqual[0]],
  endUnderscoreindex: Refined[Int, GreaterEqual[0]]
) extends MessageContentTextObjectTextAnnotationsInner
object MessageContentTextAnnotationsFilePathObject {
  implicit val encoderMessageContentTextAnnotationsFilePathObject: Encoder[MessageContentTextAnnotationsFilePathObject] = deriveEncoder[MessageContentTextAnnotationsFilePathObject].mapJson(_.dropNullValues)
  implicit val decoderMessageContentTextAnnotationsFilePathObject: Decoder[MessageContentTextAnnotationsFilePathObject] = deriveDecoder[MessageContentTextAnnotationsFilePathObject]
}

/**
* 
* @param fileUnderscoreid The ID of the file that was generated.
*/

case class MessageContentTextAnnotationsFilePathObjectFilePath(
  fileUnderscoreid: String
)
object MessageContentTextAnnotationsFilePathObjectFilePath {
  implicit val encoderMessageContentTextAnnotationsFilePathObjectFilePath: Encoder[MessageContentTextAnnotationsFilePathObjectFilePath] = deriveEncoder[MessageContentTextAnnotationsFilePathObjectFilePath].mapJson(_.dropNullValues)
  implicit val decoderMessageContentTextAnnotationsFilePathObjectFilePath: Decoder[MessageContentTextAnnotationsFilePathObjectFilePath] = deriveDecoder[MessageContentTextAnnotationsFilePathObjectFilePath]
}

/**
* The text content that is part of a message.
* @param `type` Always `text`.
* @param text 
*/

case class MessageContentTextObject(
  `type`: String,
  text: MessageContentTextObjectText
) extends MessageObjectContentInner
object MessageContentTextObject {
  implicit val encoderMessageContentTextObject: Encoder[MessageContentTextObject] = deriveEncoder[MessageContentTextObject].mapJson(_.dropNullValues)
  implicit val decoderMessageContentTextObject: Decoder[MessageContentTextObject] = deriveDecoder[MessageContentTextObject]
}

/**
* 
* @param value The data that makes up the text.
* @param annotations 
*/

case class MessageContentTextObjectText(
  value: String,
  annotations: List[MessageContentTextObjectTextAnnotationsInner]
)
object MessageContentTextObjectText {
  implicit val encoderMessageContentTextObjectText: Encoder[MessageContentTextObjectText] = deriveEncoder[MessageContentTextObjectText].mapJson(_.dropNullValues)
  implicit val decoderMessageContentTextObjectText: Decoder[MessageContentTextObjectText] = deriveDecoder[MessageContentTextObjectText]
}

/**
* 
* @param `type` Always `file_citation`.
* @param text The text in the message content that needs to be replaced.
* @param fileUnderscorecitation 
* @param startUnderscoreindex 
* @param endUnderscoreindex 
* @param fileUnderscorepath 
*/
sealed trait MessageContentTextObjectTextAnnotationsInner
object MessageContentTextObjectTextAnnotationsInner {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val messageContentTextObjectTextAnnotationsInnerEncoder: Encoder[MessageContentTextObjectTextAnnotationsInner] = Encoder.instance {
    case messageContentTextAnnotationsFileCitationObject: MessageContentTextAnnotationsFileCitationObject => messageContentTextAnnotationsFileCitationObject.asJson
    case messageContentTextAnnotationsFilePathObject: MessageContentTextAnnotationsFilePathObject => messageContentTextAnnotationsFilePathObject.asJson
  }

  implicit val messageContentTextObjectTextAnnotationsInnerDecoder: Decoder[MessageContentTextObjectTextAnnotationsInner] =
    List[Decoder[MessageContentTextObjectTextAnnotationsInner]](
      Decoder[MessageContentTextAnnotationsFileCitationObject].widen,
      Decoder[MessageContentTextAnnotationsFilePathObject].widen,
  ).reduceLeft(_ or _)
}


/**
* References an image [File](/docs/api-reference/files) in the content of a message.
* @param index The index of the content part in the message.
* @param `type` Always `image_file`.
* @param imageUnderscorefile 
*/

case class MessageDeltaContentImageFileObject(
  index: Int,
  `type`: String,
  imageUnderscorefile: Option[MessageDeltaContentImageFileObjectImageFile]
) extends MessageDeltaObjectDeltaContentInner
object MessageDeltaContentImageFileObject {
  implicit val encoderMessageDeltaContentImageFileObject: Encoder[MessageDeltaContentImageFileObject] = deriveEncoder[MessageDeltaContentImageFileObject].mapJson(_.dropNullValues)
  implicit val decoderMessageDeltaContentImageFileObject: Decoder[MessageDeltaContentImageFileObject] = deriveDecoder[MessageDeltaContentImageFileObject]
}

/**
* 
* @param fileUnderscoreid The [File](/docs/api-reference/files) ID of the image in the message content. Set `purpose=\"vision\"` when uploading the File if you need to later display the file content.
* @param detail Specifies the detail level of the image if specified by the user. `low` uses fewer tokens, you can opt in to high resolution using `high`.
*/

case class MessageDeltaContentImageFileObjectImageFile(
  fileUnderscoreid: Option[String],
  detail: Option[String]
)
object MessageDeltaContentImageFileObjectImageFile {
  implicit val encoderMessageDeltaContentImageFileObjectImageFile: Encoder[MessageDeltaContentImageFileObjectImageFile] = deriveEncoder[MessageDeltaContentImageFileObjectImageFile].mapJson(_.dropNullValues)
  implicit val decoderMessageDeltaContentImageFileObjectImageFile: Decoder[MessageDeltaContentImageFileObjectImageFile] = deriveDecoder[MessageDeltaContentImageFileObjectImageFile]
}

/**
* References an image URL in the content of a message.
* @param index The index of the content part in the message.
* @param `type` Always `image_url`.
* @param imageUnderscoreurl 
*/

case class MessageDeltaContentImageUrlObject(
  index: Int,
  `type`: String,
  imageUnderscoreurl: Option[MessageDeltaContentImageUrlObjectImageUrl]
) extends MessageDeltaObjectDeltaContentInner
object MessageDeltaContentImageUrlObject {
  implicit val encoderMessageDeltaContentImageUrlObject: Encoder[MessageDeltaContentImageUrlObject] = deriveEncoder[MessageDeltaContentImageUrlObject].mapJson(_.dropNullValues)
  implicit val decoderMessageDeltaContentImageUrlObject: Decoder[MessageDeltaContentImageUrlObject] = deriveDecoder[MessageDeltaContentImageUrlObject]
}

/**
* 
* @param url The URL of the image, must be a supported image types: jpeg, jpg, png, gif, webp.
* @param detail Specifies the detail level of the image. `low` uses fewer tokens, you can opt in to high resolution using `high`.
*/

case class MessageDeltaContentImageUrlObjectImageUrl(
  url: Option[String],
  detail: Option[String]
)
object MessageDeltaContentImageUrlObjectImageUrl {
  implicit val encoderMessageDeltaContentImageUrlObjectImageUrl: Encoder[MessageDeltaContentImageUrlObjectImageUrl] = deriveEncoder[MessageDeltaContentImageUrlObjectImageUrl].mapJson(_.dropNullValues)
  implicit val decoderMessageDeltaContentImageUrlObjectImageUrl: Decoder[MessageDeltaContentImageUrlObjectImageUrl] = deriveDecoder[MessageDeltaContentImageUrlObjectImageUrl]
}

/**
* The refusal content that is part of a message.
* @param index The index of the refusal part in the message.
* @param `type` Always `refusal`.
* @param refusal 
*/

case class MessageDeltaContentRefusalObject(
  index: Int,
  `type`: String,
  refusal: Option[String]
) extends MessageDeltaObjectDeltaContentInner
object MessageDeltaContentRefusalObject {
  implicit val encoderMessageDeltaContentRefusalObject: Encoder[MessageDeltaContentRefusalObject] = deriveEncoder[MessageDeltaContentRefusalObject].mapJson(_.dropNullValues)
  implicit val decoderMessageDeltaContentRefusalObject: Decoder[MessageDeltaContentRefusalObject] = deriveDecoder[MessageDeltaContentRefusalObject]
}

/**
* A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \"file_search\" tool to search files.
* @param index The index of the annotation in the text content part.
* @param `type` Always `file_citation`.
* @param text The text in the message content that needs to be replaced.
* @param fileUnderscorecitation 
* @param startUnderscoreindex 
* @param endUnderscoreindex 
*/

case class MessageDeltaContentTextAnnotationsFileCitationObject(
  index: Int,
  `type`: String,
  text: Option[String],
  fileUnderscorecitation: Option[MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation],
  startUnderscoreindex: Option[Refined[Int, GreaterEqual[0]]],
  endUnderscoreindex: Option[Refined[Int, GreaterEqual[0]]]
) extends MessageDeltaContentTextObjectTextAnnotationsInner
object MessageDeltaContentTextAnnotationsFileCitationObject {
  implicit val encoderMessageDeltaContentTextAnnotationsFileCitationObject: Encoder[MessageDeltaContentTextAnnotationsFileCitationObject] = deriveEncoder[MessageDeltaContentTextAnnotationsFileCitationObject].mapJson(_.dropNullValues)
  implicit val decoderMessageDeltaContentTextAnnotationsFileCitationObject: Decoder[MessageDeltaContentTextAnnotationsFileCitationObject] = deriveDecoder[MessageDeltaContentTextAnnotationsFileCitationObject]
}

/**
* 
* @param fileUnderscoreid The ID of the specific File the citation is from.
* @param quote The specific quote in the file.
*/

case class MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation(
  fileUnderscoreid: Option[String],
  quote: Option[String]
)
object MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation {
  implicit val encoderMessageDeltaContentTextAnnotationsFileCitationObjectFileCitation: Encoder[MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation] = deriveEncoder[MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation].mapJson(_.dropNullValues)
  implicit val decoderMessageDeltaContentTextAnnotationsFileCitationObjectFileCitation: Decoder[MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation] = deriveDecoder[MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation]
}

/**
* A URL for the file that's generated when the assistant used the `code_interpreter` tool to generate a file.
* @param index The index of the annotation in the text content part.
* @param `type` Always `file_path`.
* @param text The text in the message content that needs to be replaced.
* @param fileUnderscorepath 
* @param startUnderscoreindex 
* @param endUnderscoreindex 
*/

case class MessageDeltaContentTextAnnotationsFilePathObject(
  index: Int,
  `type`: String,
  text: Option[String],
  fileUnderscorepath: Option[MessageDeltaContentTextAnnotationsFilePathObjectFilePath],
  startUnderscoreindex: Option[Refined[Int, GreaterEqual[0]]],
  endUnderscoreindex: Option[Refined[Int, GreaterEqual[0]]]
) extends MessageDeltaContentTextObjectTextAnnotationsInner
object MessageDeltaContentTextAnnotationsFilePathObject {
  implicit val encoderMessageDeltaContentTextAnnotationsFilePathObject: Encoder[MessageDeltaContentTextAnnotationsFilePathObject] = deriveEncoder[MessageDeltaContentTextAnnotationsFilePathObject].mapJson(_.dropNullValues)
  implicit val decoderMessageDeltaContentTextAnnotationsFilePathObject: Decoder[MessageDeltaContentTextAnnotationsFilePathObject] = deriveDecoder[MessageDeltaContentTextAnnotationsFilePathObject]
}

/**
* 
* @param fileUnderscoreid The ID of the file that was generated.
*/

case class MessageDeltaContentTextAnnotationsFilePathObjectFilePath(
  fileUnderscoreid: Option[String]
)
object MessageDeltaContentTextAnnotationsFilePathObjectFilePath {
  implicit val encoderMessageDeltaContentTextAnnotationsFilePathObjectFilePath: Encoder[MessageDeltaContentTextAnnotationsFilePathObjectFilePath] = deriveEncoder[MessageDeltaContentTextAnnotationsFilePathObjectFilePath].mapJson(_.dropNullValues)
  implicit val decoderMessageDeltaContentTextAnnotationsFilePathObjectFilePath: Decoder[MessageDeltaContentTextAnnotationsFilePathObjectFilePath] = deriveDecoder[MessageDeltaContentTextAnnotationsFilePathObjectFilePath]
}

/**
* The text content that is part of a message.
* @param index The index of the content part in the message.
* @param `type` Always `text`.
* @param text 
*/

case class MessageDeltaContentTextObject(
  index: Int,
  `type`: String,
  text: Option[MessageDeltaContentTextObjectText]
) extends MessageDeltaObjectDeltaContentInner
object MessageDeltaContentTextObject {
  implicit val encoderMessageDeltaContentTextObject: Encoder[MessageDeltaContentTextObject] = deriveEncoder[MessageDeltaContentTextObject].mapJson(_.dropNullValues)
  implicit val decoderMessageDeltaContentTextObject: Decoder[MessageDeltaContentTextObject] = deriveDecoder[MessageDeltaContentTextObject]
}

/**
* 
* @param value The data that makes up the text.
* @param annotations 
*/

case class MessageDeltaContentTextObjectText(
  value: Option[String],
  annotations: Option[List[MessageDeltaContentTextObjectTextAnnotationsInner]]
)
object MessageDeltaContentTextObjectText {
  implicit val encoderMessageDeltaContentTextObjectText: Encoder[MessageDeltaContentTextObjectText] = deriveEncoder[MessageDeltaContentTextObjectText].mapJson(_.dropNullValues)
  implicit val decoderMessageDeltaContentTextObjectText: Decoder[MessageDeltaContentTextObjectText] = deriveDecoder[MessageDeltaContentTextObjectText]
}

/**
* 
* @param index The index of the annotation in the text content part.
* @param `type` Always `file_citation`.
* @param text The text in the message content that needs to be replaced.
* @param fileUnderscorecitation 
* @param startUnderscoreindex 
* @param endUnderscoreindex 
* @param fileUnderscorepath 
*/
sealed trait MessageDeltaContentTextObjectTextAnnotationsInner
object MessageDeltaContentTextObjectTextAnnotationsInner {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val messageDeltaContentTextObjectTextAnnotationsInnerEncoder: Encoder[MessageDeltaContentTextObjectTextAnnotationsInner] = Encoder.instance {
    case messageDeltaContentTextAnnotationsFileCitationObject: MessageDeltaContentTextAnnotationsFileCitationObject => messageDeltaContentTextAnnotationsFileCitationObject.asJson
    case messageDeltaContentTextAnnotationsFilePathObject: MessageDeltaContentTextAnnotationsFilePathObject => messageDeltaContentTextAnnotationsFilePathObject.asJson
  }

  implicit val messageDeltaContentTextObjectTextAnnotationsInnerDecoder: Decoder[MessageDeltaContentTextObjectTextAnnotationsInner] =
    List[Decoder[MessageDeltaContentTextObjectTextAnnotationsInner]](
      Decoder[MessageDeltaContentTextAnnotationsFileCitationObject].widen,
      Decoder[MessageDeltaContentTextAnnotationsFilePathObject].widen,
  ).reduceLeft(_ or _)
}


/**
* Represents a message delta i.e. any changed fields on a message during streaming. 
* @param id The identifier of the message, which can be referenced in API endpoints.
* @param `object` The object type, which is always `thread.message.delta`.
* @param delta 
*/

case class MessageDeltaObject(
  id: String,
  `object`: String,
  delta: MessageDeltaObjectDelta
)
object MessageDeltaObject {
  implicit val encoderMessageDeltaObject: Encoder[MessageDeltaObject] = deriveEncoder[MessageDeltaObject].mapJson(_.dropNullValues)
  implicit val decoderMessageDeltaObject: Decoder[MessageDeltaObject] = deriveDecoder[MessageDeltaObject]
}

/**
* The delta containing the fields that have changed on the Message.
* @param role The entity that produced the message. One of `user` or `assistant`.
* @param content The content of the message in array of text and/or images.
*/

case class MessageDeltaObjectDelta(
  role: Option[String],
  content: Option[List[MessageDeltaObjectDeltaContentInner]]
)
object MessageDeltaObjectDelta {
  implicit val encoderMessageDeltaObjectDelta: Encoder[MessageDeltaObjectDelta] = deriveEncoder[MessageDeltaObjectDelta].mapJson(_.dropNullValues)
  implicit val decoderMessageDeltaObjectDelta: Decoder[MessageDeltaObjectDelta] = deriveDecoder[MessageDeltaObjectDelta]
}

/**
* 
* @param index The index of the content part in the message.
* @param `type` Always `image_file`.
* @param imageUnderscorefile 
* @param text 
* @param refusal 
* @param imageUnderscoreurl 
*/
sealed trait MessageDeltaObjectDeltaContentInner
object MessageDeltaObjectDeltaContentInner {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val messageDeltaObjectDeltaContentInnerEncoder: Encoder[MessageDeltaObjectDeltaContentInner] = Encoder.instance {
    case messageDeltaContentImageFileObject: MessageDeltaContentImageFileObject => messageDeltaContentImageFileObject.asJson
    case messageDeltaContentImageUrlObject: MessageDeltaContentImageUrlObject => messageDeltaContentImageUrlObject.asJson
    case messageDeltaContentRefusalObject: MessageDeltaContentRefusalObject => messageDeltaContentRefusalObject.asJson
    case messageDeltaContentTextObject: MessageDeltaContentTextObject => messageDeltaContentTextObject.asJson
  }

  implicit val messageDeltaObjectDeltaContentInnerDecoder: Decoder[MessageDeltaObjectDeltaContentInner] =
    List[Decoder[MessageDeltaObjectDeltaContentInner]](
      Decoder[MessageDeltaContentImageFileObject].widen,
      Decoder[MessageDeltaContentImageUrlObject].widen,
      Decoder[MessageDeltaContentRefusalObject].widen,
      Decoder[MessageDeltaContentTextObject].widen,
  ).reduceLeft(_ or _)
}


/**
* Represents a message within a [thread](/docs/api-reference/threads).
* @param id The identifier, which can be referenced in API endpoints.
* @param `object` The object type, which is always `thread.message`.
* @param createdUnderscoreat The Unix timestamp (in seconds) for when the message was created.
* @param threadUnderscoreid The [thread](/docs/api-reference/threads) ID that this message belongs to.
* @param status The status of the message, which can be either `in_progress`, `incomplete`, or `completed`.
* @param incompleteUnderscoredetails 
* @param completedUnderscoreat The Unix timestamp (in seconds) for when the message was completed.
* @param incompleteUnderscoreat The Unix timestamp (in seconds) for when the message was marked as incomplete.
* @param role The entity that produced the message. One of `user` or `assistant`.
* @param content The content of the message in array of text and/or images.
* @param assistantUnderscoreid If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message.
* @param runUnderscoreid The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is `null` when messages are created manually using the create message or create thread endpoints.
* @param attachments A list of files attached to the message, and the tools they were added to.
* @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
*/

case class MessageObject(
  id: String,
  `object`: String,
  createdUnderscoreat: Int,
  threadUnderscoreid: String,
  status: String,
  incompleteUnderscoredetails: MessageObjectIncompleteDetails,
  completedUnderscoreat: Int,
  incompleteUnderscoreat: Int,
  role: String,
  content: List[MessageObjectContentInner],
  assistantUnderscoreid: String,
  runUnderscoreid: String,
  attachments: List[MessageObjectAttachmentsInner],
  metadata: Object
)
object MessageObject {
  implicit val encoderMessageObject: Encoder[MessageObject] = deriveEncoder[MessageObject].mapJson(_.dropNullValues)
  implicit val decoderMessageObject: Decoder[MessageObject] = deriveDecoder[MessageObject]
}

/**
* 
* @param fileUnderscoreid The ID of the file to attach to the message.
* @param tools The tools to add this file to.
*/

case class MessageObjectAttachmentsInner(
  fileUnderscoreid: Option[String],
  tools: Option[List[MessageObjectAttachmentsInnerToolsInner]]
)
object MessageObjectAttachmentsInner {
  implicit val encoderMessageObjectAttachmentsInner: Encoder[MessageObjectAttachmentsInner] = deriveEncoder[MessageObjectAttachmentsInner].mapJson(_.dropNullValues)
  implicit val decoderMessageObjectAttachmentsInner: Decoder[MessageObjectAttachmentsInner] = deriveDecoder[MessageObjectAttachmentsInner]
}

/**
* 
* @param `type` The type of tool being defined: `code_interpreter`
*/
sealed trait MessageObjectAttachmentsInnerToolsInner
object MessageObjectAttachmentsInnerToolsInner {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val messageObjectAttachmentsInnerToolsInnerEncoder: Encoder[MessageObjectAttachmentsInnerToolsInner] = Encoder.instance {
    case assistantToolsCode: AssistantToolsCode => assistantToolsCode.asJson
    case assistantToolsFileSearchTypeOnly: AssistantToolsFileSearchTypeOnly => assistantToolsFileSearchTypeOnly.asJson
  }

  implicit val messageObjectAttachmentsInnerToolsInnerDecoder: Decoder[MessageObjectAttachmentsInnerToolsInner] =
    List[Decoder[MessageObjectAttachmentsInnerToolsInner]](
      Decoder[AssistantToolsCode].widen,
      Decoder[AssistantToolsFileSearchTypeOnly].widen,
  ).reduceLeft(_ or _)
}


/**
* 
* @param `type` Always `image_file`.
* @param imageUnderscorefile 
* @param imageUnderscoreurl 
* @param text 
* @param refusal 
*/
sealed trait MessageObjectContentInner
object MessageObjectContentInner {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val messageObjectContentInnerEncoder: Encoder[MessageObjectContentInner] = Encoder.instance {
    case messageContentImageFileObject: MessageContentImageFileObject => messageContentImageFileObject.asJson
    case messageContentImageUrlObject: MessageContentImageUrlObject => messageContentImageUrlObject.asJson
    case messageContentRefusalObject: MessageContentRefusalObject => messageContentRefusalObject.asJson
    case messageContentTextObject: MessageContentTextObject => messageContentTextObject.asJson
  }

  implicit val messageObjectContentInnerDecoder: Decoder[MessageObjectContentInner] =
    List[Decoder[MessageObjectContentInner]](
      Decoder[MessageContentImageFileObject].widen,
      Decoder[MessageContentImageUrlObject].widen,
      Decoder[MessageContentRefusalObject].widen,
      Decoder[MessageContentTextObject].widen,
  ).reduceLeft(_ or _)
}


/**
* On an incomplete message, details about why the message is incomplete.
* @param reason The reason the message is incomplete.
*/

case class MessageObjectIncompleteDetails(
  reason: String
)
object MessageObjectIncompleteDetails {
  implicit val encoderMessageObjectIncompleteDetails: Encoder[MessageObjectIncompleteDetails] = deriveEncoder[MessageObjectIncompleteDetails].mapJson(_.dropNullValues)
  implicit val decoderMessageObjectIncompleteDetails: Decoder[MessageObjectIncompleteDetails] = deriveDecoder[MessageObjectIncompleteDetails]
}

/**
* The text content that is part of a message.
* @param `type` Always `text`.
* @param text Text content to be sent to the model
*/

case class MessageRequestContentTextObject(
  `type`: String,
  text: String
) extends ArrayOfContentPartsInner
object MessageRequestContentTextObject {
  implicit val encoderMessageRequestContentTextObject: Encoder[MessageRequestContentTextObject] = deriveEncoder[MessageRequestContentTextObject].mapJson(_.dropNullValues)
  implicit val decoderMessageRequestContentTextObject: Decoder[MessageRequestContentTextObject] = deriveDecoder[MessageRequestContentTextObject]
}

/**
* 
* @param event 
* @param data 
*/
sealed trait MessageStreamEvent
object MessageStreamEvent {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val messageStreamEventEncoder: Encoder[MessageStreamEvent] = Encoder.instance {
    case messageStreamEventOneOf: MessageStreamEventOneOf => messageStreamEventOneOf.asJson
    case messageStreamEventOneOf1: MessageStreamEventOneOf1 => messageStreamEventOneOf1.asJson
    case messageStreamEventOneOf2: MessageStreamEventOneOf2 => messageStreamEventOneOf2.asJson
    case messageStreamEventOneOf3: MessageStreamEventOneOf3 => messageStreamEventOneOf3.asJson
    case messageStreamEventOneOf4: MessageStreamEventOneOf4 => messageStreamEventOneOf4.asJson
  }

  implicit val messageStreamEventDecoder: Decoder[MessageStreamEvent] =
    List[Decoder[MessageStreamEvent]](
      Decoder[MessageStreamEventOneOf].widen,
      Decoder[MessageStreamEventOneOf1].widen,
      Decoder[MessageStreamEventOneOf2].widen,
      Decoder[MessageStreamEventOneOf3].widen,
      Decoder[MessageStreamEventOneOf4].widen,
  ).reduceLeft(_ or _)
}


/**
* Occurs when a [message](/docs/api-reference/messages/object) is created.
* @param event 
* @param data 
*/

case class MessageStreamEventOneOf(
  event: String,
  data: MessageObject
) extends MessageStreamEvent
object MessageStreamEventOneOf {
  implicit val encoderMessageStreamEventOneOf: Encoder[MessageStreamEventOneOf] = deriveEncoder[MessageStreamEventOneOf].mapJson(_.dropNullValues)
  implicit val decoderMessageStreamEventOneOf: Decoder[MessageStreamEventOneOf] = deriveDecoder[MessageStreamEventOneOf]
}

/**
* Occurs when a [message](/docs/api-reference/messages/object) moves to an `in_progress` state.
* @param event 
* @param data 
*/

case class MessageStreamEventOneOf1(
  event: String,
  data: MessageObject
) extends MessageStreamEvent
object MessageStreamEventOneOf1 {
  implicit val encoderMessageStreamEventOneOf1: Encoder[MessageStreamEventOneOf1] = deriveEncoder[MessageStreamEventOneOf1].mapJson(_.dropNullValues)
  implicit val decoderMessageStreamEventOneOf1: Decoder[MessageStreamEventOneOf1] = deriveDecoder[MessageStreamEventOneOf1]
}

/**
* Occurs when parts of a [Message](/docs/api-reference/messages/object) are being streamed.
* @param event 
* @param data 
*/

case class MessageStreamEventOneOf2(
  event: String,
  data: MessageDeltaObject
) extends MessageStreamEvent
object MessageStreamEventOneOf2 {
  implicit val encoderMessageStreamEventOneOf2: Encoder[MessageStreamEventOneOf2] = deriveEncoder[MessageStreamEventOneOf2].mapJson(_.dropNullValues)
  implicit val decoderMessageStreamEventOneOf2: Decoder[MessageStreamEventOneOf2] = deriveDecoder[MessageStreamEventOneOf2]
}

/**
* Occurs when a [message](/docs/api-reference/messages/object) is completed.
* @param event 
* @param data 
*/

case class MessageStreamEventOneOf3(
  event: String,
  data: MessageObject
) extends MessageStreamEvent
object MessageStreamEventOneOf3 {
  implicit val encoderMessageStreamEventOneOf3: Encoder[MessageStreamEventOneOf3] = deriveEncoder[MessageStreamEventOneOf3].mapJson(_.dropNullValues)
  implicit val decoderMessageStreamEventOneOf3: Decoder[MessageStreamEventOneOf3] = deriveDecoder[MessageStreamEventOneOf3]
}

/**
* Occurs when a [message](/docs/api-reference/messages/object) ends before it is completed.
* @param event 
* @param data 
*/

case class MessageStreamEventOneOf4(
  event: String,
  data: MessageObject
) extends MessageStreamEvent
object MessageStreamEventOneOf4 {
  implicit val encoderMessageStreamEventOneOf4: Encoder[MessageStreamEventOneOf4] = deriveEncoder[MessageStreamEventOneOf4].mapJson(_.dropNullValues)
  implicit val decoderMessageStreamEventOneOf4: Decoder[MessageStreamEventOneOf4] = deriveDecoder[MessageStreamEventOneOf4]
}

/**
* Describes an OpenAI model offering that can be used with the API.
* @param id The model identifier, which can be referenced in the API endpoints.
* @param created The Unix timestamp (in seconds) when the model was created.
* @param `object` The object type, which is always \"model\".
* @param ownedUnderscoreby The organization that owns the model.
*/

case class Model(
  id: String,
  created: Int,
  `object`: String,
  ownedUnderscoreby: String
)
object Model {
  implicit val encoderModel: Encoder[Model] = deriveEncoder[Model].mapJson(_.dropNullValues)
  implicit val decoderModel: Decoder[Model] = deriveDecoder[Model]
}

/**
* 
* @param model ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models) for descriptions of them. 
* @param name The name of the assistant. The maximum length is 256 characters. 
* @param description The description of the assistant. The maximum length is 512 characters. 
* @param instructions The system instructions that the assistant uses. The maximum length is 256,000 characters. 
* @param tools A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `file_search`, or `function`. 
* @param toolUnderscoreresources 
* @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
* @param temperature What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
* @param topUnderscorep An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. 
* @param responseUnderscoreformat 
*/

case class ModifyAssistantRequest(
  model: Option[String],
  name: Option[Refined[String, MaxSize[256]]],
  description: Option[Refined[String, MaxSize[512]]],
  instructions: Option[Refined[String, MaxSize[256000]]],
  tools: Option[Refined[List[ModifyAssistantRequestToolsInner], MaxSize[128]]],
  toolUnderscoreresources: Option[ModifyAssistantRequestToolResources],
  metadata: Option[Object],
  temperature: Option[Refined[BigDecimal, GreaterEqual[0] And LessEqual[2]]],
  topUnderscorep: Option[Refined[BigDecimal, GreaterEqual[0] And LessEqual[1]]],
  responseUnderscoreformat: Option[AssistantsApiResponseFormatOption]
)
object ModifyAssistantRequest {
  implicit val encoderModifyAssistantRequest: Encoder[ModifyAssistantRequest] = deriveEncoder[ModifyAssistantRequest].mapJson(_.dropNullValues)
  implicit val decoderModifyAssistantRequest: Decoder[ModifyAssistantRequest] = deriveDecoder[ModifyAssistantRequest]
}

/**
* A set of resources that are used by the assistant's tools. The resources are specific to the type of tool. For example, the `code_interpreter` tool requires a list of file IDs, while the `file_search` tool requires a list of vector store IDs. 
* @param codeUnderscoreinterpreter 
* @param fileUnderscoresearch 
*/

case class ModifyAssistantRequestToolResources(
  codeUnderscoreinterpreter: Option[ModifyAssistantRequestToolResourcesCodeInterpreter],
  fileUnderscoresearch: Option[ModifyAssistantRequestToolResourcesFileSearch]
)
object ModifyAssistantRequestToolResources {
  implicit val encoderModifyAssistantRequestToolResources: Encoder[ModifyAssistantRequestToolResources] = deriveEncoder[ModifyAssistantRequestToolResources].mapJson(_.dropNullValues)
  implicit val decoderModifyAssistantRequestToolResources: Decoder[ModifyAssistantRequestToolResources] = deriveDecoder[ModifyAssistantRequestToolResources]
}

/**
* 
* @param fileUnderscoreids Overrides the list of [file](/docs/api-reference/files) IDs made available to the `code_interpreter` tool. There can be a maximum of 20 files associated with the tool. 
*/

case class ModifyAssistantRequestToolResourcesCodeInterpreter(
  fileUnderscoreids: Option[Refined[List[String], MaxSize[20]]]
)
object ModifyAssistantRequestToolResourcesCodeInterpreter {
  implicit val encoderModifyAssistantRequestToolResourcesCodeInterpreter: Encoder[ModifyAssistantRequestToolResourcesCodeInterpreter] = deriveEncoder[ModifyAssistantRequestToolResourcesCodeInterpreter].mapJson(_.dropNullValues)
  implicit val decoderModifyAssistantRequestToolResourcesCodeInterpreter: Decoder[ModifyAssistantRequestToolResourcesCodeInterpreter] = deriveDecoder[ModifyAssistantRequestToolResourcesCodeInterpreter]
}

/**
* 
* @param vectorUnderscorestoreUnderscoreids Overrides the [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant. 
*/

case class ModifyAssistantRequestToolResourcesFileSearch(
  vectorUnderscorestoreUnderscoreids: Option[Refined[List[String], MaxSize[1]]]
)
object ModifyAssistantRequestToolResourcesFileSearch {
  implicit val encoderModifyAssistantRequestToolResourcesFileSearch: Encoder[ModifyAssistantRequestToolResourcesFileSearch] = deriveEncoder[ModifyAssistantRequestToolResourcesFileSearch].mapJson(_.dropNullValues)
  implicit val decoderModifyAssistantRequestToolResourcesFileSearch: Decoder[ModifyAssistantRequestToolResourcesFileSearch] = deriveDecoder[ModifyAssistantRequestToolResourcesFileSearch]
}

/**
* 
* @param `type` The type of tool being defined: `code_interpreter`
* @param fileUnderscoresearch 
* @param function 
*/
sealed trait ModifyAssistantRequestToolsInner
object ModifyAssistantRequestToolsInner {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val modifyAssistantRequestToolsInnerEncoder: Encoder[ModifyAssistantRequestToolsInner] = Encoder.instance {
    case assistantToolsCode: AssistantToolsCode => assistantToolsCode.asJson
    case assistantToolsFileSearch: AssistantToolsFileSearch => assistantToolsFileSearch.asJson
    case assistantToolsFunction: AssistantToolsFunction => assistantToolsFunction.asJson
  }

  implicit val modifyAssistantRequestToolsInnerDecoder: Decoder[ModifyAssistantRequestToolsInner] =
    List[Decoder[ModifyAssistantRequestToolsInner]](
      Decoder[AssistantToolsCode].widen,
      Decoder[AssistantToolsFileSearch].widen,
      Decoder[AssistantToolsFunction].widen,
  ).reduceLeft(_ or _)
}


/**
* 
* @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
*/

case class ModifyMessageRequest(
  metadata: Option[Object]
)
object ModifyMessageRequest {
  implicit val encoderModifyMessageRequest: Encoder[ModifyMessageRequest] = deriveEncoder[ModifyMessageRequest].mapJson(_.dropNullValues)
  implicit val decoderModifyMessageRequest: Decoder[ModifyMessageRequest] = deriveDecoder[ModifyMessageRequest]
}

/**
* 
* @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
*/

case class ModifyRunRequest(
  metadata: Option[Object]
)
object ModifyRunRequest {
  implicit val encoderModifyRunRequest: Encoder[ModifyRunRequest] = deriveEncoder[ModifyRunRequest].mapJson(_.dropNullValues)
  implicit val decoderModifyRunRequest: Decoder[ModifyRunRequest] = deriveDecoder[ModifyRunRequest]
}

/**
* 
* @param toolUnderscoreresources 
* @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
*/

case class ModifyThreadRequest(
  toolUnderscoreresources: Option[ModifyThreadRequestToolResources],
  metadata: Option[Object]
)
object ModifyThreadRequest {
  implicit val encoderModifyThreadRequest: Encoder[ModifyThreadRequest] = deriveEncoder[ModifyThreadRequest].mapJson(_.dropNullValues)
  implicit val decoderModifyThreadRequest: Decoder[ModifyThreadRequest] = deriveDecoder[ModifyThreadRequest]
}

/**
* A set of resources that are made available to the assistant's tools in this thread. The resources are specific to the type of tool. For example, the `code_interpreter` tool requires a list of file IDs, while the `file_search` tool requires a list of vector store IDs. 
* @param codeUnderscoreinterpreter 
* @param fileUnderscoresearch 
*/

case class ModifyThreadRequestToolResources(
  codeUnderscoreinterpreter: Option[ModifyThreadRequestToolResourcesCodeInterpreter],
  fileUnderscoresearch: Option[ModifyThreadRequestToolResourcesFileSearch]
)
object ModifyThreadRequestToolResources {
  implicit val encoderModifyThreadRequestToolResources: Encoder[ModifyThreadRequestToolResources] = deriveEncoder[ModifyThreadRequestToolResources].mapJson(_.dropNullValues)
  implicit val decoderModifyThreadRequestToolResources: Decoder[ModifyThreadRequestToolResources] = deriveDecoder[ModifyThreadRequestToolResources]
}

/**
* 
* @param fileUnderscoreids A list of [file](/docs/api-reference/files) IDs made available to the `code_interpreter` tool. There can be a maximum of 20 files associated with the tool. 
*/

case class ModifyThreadRequestToolResourcesCodeInterpreter(
  fileUnderscoreids: Option[Refined[List[String], MaxSize[20]]]
)
object ModifyThreadRequestToolResourcesCodeInterpreter {
  implicit val encoderModifyThreadRequestToolResourcesCodeInterpreter: Encoder[ModifyThreadRequestToolResourcesCodeInterpreter] = deriveEncoder[ModifyThreadRequestToolResourcesCodeInterpreter].mapJson(_.dropNullValues)
  implicit val decoderModifyThreadRequestToolResourcesCodeInterpreter: Decoder[ModifyThreadRequestToolResourcesCodeInterpreter] = deriveDecoder[ModifyThreadRequestToolResourcesCodeInterpreter]
}

/**
* 
* @param vectorUnderscorestoreUnderscoreids The [vector store](/docs/api-reference/vector-stores/object) attached to this thread. There can be a maximum of 1 vector store attached to the thread. 
*/

case class ModifyThreadRequestToolResourcesFileSearch(
  vectorUnderscorestoreUnderscoreids: Option[Refined[List[String], MaxSize[1]]]
)
object ModifyThreadRequestToolResourcesFileSearch {
  implicit val encoderModifyThreadRequestToolResourcesFileSearch: Encoder[ModifyThreadRequestToolResourcesFileSearch] = deriveEncoder[ModifyThreadRequestToolResourcesFileSearch].mapJson(_.dropNullValues)
  implicit val decoderModifyThreadRequestToolResourcesFileSearch: Decoder[ModifyThreadRequestToolResourcesFileSearch] = deriveDecoder[ModifyThreadRequestToolResourcesFileSearch]
}

/**
* The `File` object represents a document that has been uploaded to OpenAI.
* @param id The file identifier, which can be referenced in the API endpoints.
* @param bytes The size of the file, in bytes.
* @param createdUnderscoreat The Unix timestamp (in seconds) for when the file was created.
* @param filename The name of the file.
* @param `object` The object type, which is always `file`.
* @param purpose The intended purpose of the file. Supported values are `assistants`, `assistants_output`, `batch`, `batch_output`, `fine-tune`, `fine-tune-results` and `vision`.
* @param status Deprecated. The current status of the file, which can be either `uploaded`, `processed`, or `error`.
* @param statusUnderscoredetails Deprecated. For details on why a fine-tuning training file failed validation, see the `error` field on `fine_tuning.job`.
*/

case class OpenAIFile(
  id: String,
  bytes: Int,
  createdUnderscoreat: Int,
  filename: String,
  `object`: String,
  purpose: String,
  status: String,
  statusUnderscoredetails: Option[String]
)
object OpenAIFile {
  implicit val encoderOpenAIFile: Encoder[OpenAIFile] = deriveEncoder[OpenAIFile].mapJson(_.dropNullValues)
  implicit val decoderOpenAIFile: Decoder[OpenAIFile] = deriveDecoder[OpenAIFile]
}

/**
* This is returned when the chunking strategy is unknown. Typically, this is because the file was indexed before the `chunking_strategy` concept was introduced in the API.
* @param `type` Always `other`.
*/

case class OtherChunkingStrategyResponseParam(
  `type`: String
) extends VectorStoreFileObjectChunkingStrategy
object OtherChunkingStrategyResponseParam {
  implicit val encoderOtherChunkingStrategyResponseParam: Encoder[OtherChunkingStrategyResponseParam] = deriveEncoder[OtherChunkingStrategyResponseParam].mapJson(_.dropNullValues)
  implicit val decoderOtherChunkingStrategyResponseParam: Decoder[OtherChunkingStrategyResponseParam] = deriveDecoder[OtherChunkingStrategyResponseParam]
}

/**
* Static predicted output content, such as the content of a text file that is being regenerated. 
* @param `type` The type of the predicted content you want to provide. This type is currently always `content`. 
* @param content 
*/

case class PredictionContent(
  `type`: String,
  content: PredictionContentContent
)
object PredictionContent {
  implicit val encoderPredictionContent: Encoder[PredictionContent] = deriveEncoder[PredictionContent].mapJson(_.dropNullValues)
  implicit val decoderPredictionContent: Decoder[PredictionContent] = deriveDecoder[PredictionContent]
}

/**
* The content that should be matched when generating a model response. If generated tokens would match this content, the entire model response can be returned much more quickly. 
*/
sealed trait PredictionContentContent
object PredictionContentContent {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val predictionContentContentEncoder: Encoder[PredictionContentContent] = Encoder.instance {
    case list_ChatCompletionRequestMessageContentPartText: List[ChatCompletionRequestMessageContentPartText] => list_ChatCompletionRequestMessageContentPartText.asJson
    case string: String => string.asJson
  }

  implicit val predictionContentContentDecoder: Decoder[PredictionContentContent] =
    List[Decoder[PredictionContentContent]](
      Decoder[List[ChatCompletionRequestMessageContentPartText]].widen,
      Decoder[String].widen,
  ).reduceLeft(_ or _)
}


/**
* Represents an individual project.
* @param id The identifier, which can be referenced in API endpoints
* @param `object` The object type, which is always `organization.project`
* @param name The name of the project. This appears in reporting.
* @param createdUnderscoreat The Unix timestamp (in seconds) of when the project was created.
* @param archivedUnderscoreat The Unix timestamp (in seconds) of when the project was archived or `null`.
* @param status `active` or `archived`
*/

case class Project(
  id: String,
  `object`: String,
  name: String,
  createdUnderscoreat: Int,
  archivedUnderscoreat: Option[Int],
  status: String
)
object Project {
  implicit val encoderProject: Encoder[Project] = deriveEncoder[Project].mapJson(_.dropNullValues)
  implicit val decoderProject: Decoder[Project] = deriveDecoder[Project]
}

/**
* Represents an individual API key in a project.
* @param `object` The object type, which is always `organization.project.api_key`
* @param redactedUnderscorevalue The redacted value of the API key
* @param name The name of the API key
* @param createdUnderscoreat The Unix timestamp (in seconds) of when the API key was created
* @param id The identifier, which can be referenced in API endpoints
* @param owner 
*/

case class ProjectApiKey(
  `object`: String,
  redactedUnderscorevalue: String,
  name: String,
  createdUnderscoreat: Int,
  id: String,
  owner: ProjectApiKeyOwner
)
object ProjectApiKey {
  implicit val encoderProjectApiKey: Encoder[ProjectApiKey] = deriveEncoder[ProjectApiKey].mapJson(_.dropNullValues)
  implicit val decoderProjectApiKey: Decoder[ProjectApiKey] = deriveDecoder[ProjectApiKey]
}

/**
* 
* @param `object` 
* @param id 
* @param deleted 
*/

case class ProjectApiKeyDeleteResponse(
  `object`: String,
  id: String,
  deleted: Boolean
)
object ProjectApiKeyDeleteResponse {
  implicit val encoderProjectApiKeyDeleteResponse: Encoder[ProjectApiKeyDeleteResponse] = deriveEncoder[ProjectApiKeyDeleteResponse].mapJson(_.dropNullValues)
  implicit val decoderProjectApiKeyDeleteResponse: Decoder[ProjectApiKeyDeleteResponse] = deriveDecoder[ProjectApiKeyDeleteResponse]
}

/**
* 
* @param `object` 
* @param data 
* @param firstUnderscoreid 
* @param lastUnderscoreid 
* @param hasUnderscoremore 
*/

case class ProjectApiKeyListResponse(
  `object`: String,
  data: List[ProjectApiKey],
  firstUnderscoreid: String,
  lastUnderscoreid: String,
  hasUnderscoremore: Boolean
)
object ProjectApiKeyListResponse {
  implicit val encoderProjectApiKeyListResponse: Encoder[ProjectApiKeyListResponse] = deriveEncoder[ProjectApiKeyListResponse].mapJson(_.dropNullValues)
  implicit val decoderProjectApiKeyListResponse: Decoder[ProjectApiKeyListResponse] = deriveDecoder[ProjectApiKeyListResponse]
}

/**
* 
* @param `type` `user` or `service_account`
* @param user 
* @param serviceUnderscoreaccount 
*/

case class ProjectApiKeyOwner(
  `type`: Option[String],
  user: Option[ProjectUser],
  serviceUnderscoreaccount: Option[ProjectServiceAccount]
)
object ProjectApiKeyOwner {
  implicit val encoderProjectApiKeyOwner: Encoder[ProjectApiKeyOwner] = deriveEncoder[ProjectApiKeyOwner].mapJson(_.dropNullValues)
  implicit val decoderProjectApiKeyOwner: Decoder[ProjectApiKeyOwner] = deriveDecoder[ProjectApiKeyOwner]
}

/**
* 
* @param name The friendly name of the project, this name appears in reports.
*/

case class ProjectCreateRequest(
  name: String
)
object ProjectCreateRequest {
  implicit val encoderProjectCreateRequest: Encoder[ProjectCreateRequest] = deriveEncoder[ProjectCreateRequest].mapJson(_.dropNullValues)
  implicit val decoderProjectCreateRequest: Decoder[ProjectCreateRequest] = deriveDecoder[ProjectCreateRequest]
}

/**
* 
* @param `object` 
* @param data 
* @param firstUnderscoreid 
* @param lastUnderscoreid 
* @param hasUnderscoremore 
*/

case class ProjectListResponse(
  `object`: String,
  data: List[Project],
  firstUnderscoreid: String,
  lastUnderscoreid: String,
  hasUnderscoremore: Boolean
)
object ProjectListResponse {
  implicit val encoderProjectListResponse: Encoder[ProjectListResponse] = deriveEncoder[ProjectListResponse].mapJson(_.dropNullValues)
  implicit val decoderProjectListResponse: Decoder[ProjectListResponse] = deriveDecoder[ProjectListResponse]
}

/**
* Represents a project rate limit config.
* @param `object` The object type, which is always `project.rate_limit`
* @param id The identifier, which can be referenced in API endpoints.
* @param model The model this rate limit applies to.
* @param maxUnderscorerequestsUnderscoreperUnderscore1Underscoreminute The maximum requests per minute.
* @param maxUnderscoretokensUnderscoreperUnderscore1Underscoreminute The maximum tokens per minute.
* @param maxUnderscoreimagesUnderscoreperUnderscore1Underscoreminute The maximum images per minute. Only present for relevant models.
* @param maxUnderscoreaudioUnderscoremegabytesUnderscoreperUnderscore1Underscoreminute The maximum audio megabytes per minute. Only present for relevant models.
* @param maxUnderscorerequestsUnderscoreperUnderscore1Underscoreday The maximum requests per day. Only present for relevant models.
* @param batchUnderscore1UnderscoredayUnderscoremaxUnderscoreinputUnderscoretokens The maximum batch input tokens per day. Only present for relevant models.
*/

case class ProjectRateLimit(
  `object`: String,
  id: String,
  model: String,
  maxUnderscorerequestsUnderscoreperUnderscore1Underscoreminute: Int,
  maxUnderscoretokensUnderscoreperUnderscore1Underscoreminute: Int,
  maxUnderscoreimagesUnderscoreperUnderscore1Underscoreminute: Option[Int],
  maxUnderscoreaudioUnderscoremegabytesUnderscoreperUnderscore1Underscoreminute: Option[Int],
  maxUnderscorerequestsUnderscoreperUnderscore1Underscoreday: Option[Int],
  batchUnderscore1UnderscoredayUnderscoremaxUnderscoreinputUnderscoretokens: Option[Int]
)
object ProjectRateLimit {
  implicit val encoderProjectRateLimit: Encoder[ProjectRateLimit] = deriveEncoder[ProjectRateLimit].mapJson(_.dropNullValues)
  implicit val decoderProjectRateLimit: Decoder[ProjectRateLimit] = deriveDecoder[ProjectRateLimit]
}

/**
* 
* @param `object` 
* @param data 
* @param firstUnderscoreid 
* @param lastUnderscoreid 
* @param hasUnderscoremore 
*/

case class ProjectRateLimitListResponse(
  `object`: String,
  data: List[ProjectRateLimit],
  firstUnderscoreid: String,
  lastUnderscoreid: String,
  hasUnderscoremore: Boolean
)
object ProjectRateLimitListResponse {
  implicit val encoderProjectRateLimitListResponse: Encoder[ProjectRateLimitListResponse] = deriveEncoder[ProjectRateLimitListResponse].mapJson(_.dropNullValues)
  implicit val decoderProjectRateLimitListResponse: Decoder[ProjectRateLimitListResponse] = deriveDecoder[ProjectRateLimitListResponse]
}

/**
* 
* @param maxUnderscorerequestsUnderscoreperUnderscore1Underscoreminute The maximum requests per minute.
* @param maxUnderscoretokensUnderscoreperUnderscore1Underscoreminute The maximum tokens per minute.
* @param maxUnderscoreimagesUnderscoreperUnderscore1Underscoreminute The maximum images per minute. Only relevant for certain models.
* @param maxUnderscoreaudioUnderscoremegabytesUnderscoreperUnderscore1Underscoreminute The maximum audio megabytes per minute. Only relevant for certain models.
* @param maxUnderscorerequestsUnderscoreperUnderscore1Underscoreday The maximum requests per day. Only relevant for certain models.
* @param batchUnderscore1UnderscoredayUnderscoremaxUnderscoreinputUnderscoretokens The maximum batch input tokens per day. Only relevant for certain models.
*/

case class ProjectRateLimitUpdateRequest(
  maxUnderscorerequestsUnderscoreperUnderscore1Underscoreminute: Option[Int],
  maxUnderscoretokensUnderscoreperUnderscore1Underscoreminute: Option[Int],
  maxUnderscoreimagesUnderscoreperUnderscore1Underscoreminute: Option[Int],
  maxUnderscoreaudioUnderscoremegabytesUnderscoreperUnderscore1Underscoreminute: Option[Int],
  maxUnderscorerequestsUnderscoreperUnderscore1Underscoreday: Option[Int],
  batchUnderscore1UnderscoredayUnderscoremaxUnderscoreinputUnderscoretokens: Option[Int]
)
object ProjectRateLimitUpdateRequest {
  implicit val encoderProjectRateLimitUpdateRequest: Encoder[ProjectRateLimitUpdateRequest] = deriveEncoder[ProjectRateLimitUpdateRequest].mapJson(_.dropNullValues)
  implicit val decoderProjectRateLimitUpdateRequest: Decoder[ProjectRateLimitUpdateRequest] = deriveDecoder[ProjectRateLimitUpdateRequest]
}

/**
* Represents an individual service account in a project.
* @param `object` The object type, which is always `organization.project.service_account`
* @param id The identifier, which can be referenced in API endpoints
* @param name The name of the service account
* @param role `owner` or `member`
* @param createdUnderscoreat The Unix timestamp (in seconds) of when the service account was created
*/

case class ProjectServiceAccount(
  `object`: String,
  id: String,
  name: String,
  role: String,
  createdUnderscoreat: Int
)
object ProjectServiceAccount {
  implicit val encoderProjectServiceAccount: Encoder[ProjectServiceAccount] = deriveEncoder[ProjectServiceAccount].mapJson(_.dropNullValues)
  implicit val decoderProjectServiceAccount: Decoder[ProjectServiceAccount] = deriveDecoder[ProjectServiceAccount]
}

/**
* 
* @param `object` The object type, which is always `organization.project.service_account.api_key`
* @param value 
* @param name 
* @param createdUnderscoreat 
* @param id 
*/

case class ProjectServiceAccountApiKey(
  `object`: String,
  value: String,
  name: String,
  createdUnderscoreat: Int,
  id: String
)
object ProjectServiceAccountApiKey {
  implicit val encoderProjectServiceAccountApiKey: Encoder[ProjectServiceAccountApiKey] = deriveEncoder[ProjectServiceAccountApiKey].mapJson(_.dropNullValues)
  implicit val decoderProjectServiceAccountApiKey: Decoder[ProjectServiceAccountApiKey] = deriveDecoder[ProjectServiceAccountApiKey]
}

/**
* 
* @param name The name of the service account being created.
*/

case class ProjectServiceAccountCreateRequest(
  name: String
)
object ProjectServiceAccountCreateRequest {
  implicit val encoderProjectServiceAccountCreateRequest: Encoder[ProjectServiceAccountCreateRequest] = deriveEncoder[ProjectServiceAccountCreateRequest].mapJson(_.dropNullValues)
  implicit val decoderProjectServiceAccountCreateRequest: Decoder[ProjectServiceAccountCreateRequest] = deriveDecoder[ProjectServiceAccountCreateRequest]
}

/**
* 
* @param `object` 
* @param id 
* @param name 
* @param role Service accounts can only have one role of type `member`
* @param createdUnderscoreat 
* @param apiUnderscorekey 
*/

case class ProjectServiceAccountCreateResponse(
  `object`: String,
  id: String,
  name: String,
  role: String,
  createdUnderscoreat: Int,
  apiUnderscorekey: ProjectServiceAccountApiKey
)
object ProjectServiceAccountCreateResponse {
  implicit val encoderProjectServiceAccountCreateResponse: Encoder[ProjectServiceAccountCreateResponse] = deriveEncoder[ProjectServiceAccountCreateResponse].mapJson(_.dropNullValues)
  implicit val decoderProjectServiceAccountCreateResponse: Decoder[ProjectServiceAccountCreateResponse] = deriveDecoder[ProjectServiceAccountCreateResponse]
}

/**
* 
* @param `object` 
* @param id 
* @param deleted 
*/

case class ProjectServiceAccountDeleteResponse(
  `object`: String,
  id: String,
  deleted: Boolean
)
object ProjectServiceAccountDeleteResponse {
  implicit val encoderProjectServiceAccountDeleteResponse: Encoder[ProjectServiceAccountDeleteResponse] = deriveEncoder[ProjectServiceAccountDeleteResponse].mapJson(_.dropNullValues)
  implicit val decoderProjectServiceAccountDeleteResponse: Decoder[ProjectServiceAccountDeleteResponse] = deriveDecoder[ProjectServiceAccountDeleteResponse]
}

/**
* 
* @param `object` 
* @param data 
* @param firstUnderscoreid 
* @param lastUnderscoreid 
* @param hasUnderscoremore 
*/

case class ProjectServiceAccountListResponse(
  `object`: String,
  data: List[ProjectServiceAccount],
  firstUnderscoreid: String,
  lastUnderscoreid: String,
  hasUnderscoremore: Boolean
)
object ProjectServiceAccountListResponse {
  implicit val encoderProjectServiceAccountListResponse: Encoder[ProjectServiceAccountListResponse] = deriveEncoder[ProjectServiceAccountListResponse].mapJson(_.dropNullValues)
  implicit val decoderProjectServiceAccountListResponse: Decoder[ProjectServiceAccountListResponse] = deriveDecoder[ProjectServiceAccountListResponse]
}

/**
* 
* @param name The updated name of the project, this name appears in reports.
*/

case class ProjectUpdateRequest(
  name: String
)
object ProjectUpdateRequest {
  implicit val encoderProjectUpdateRequest: Encoder[ProjectUpdateRequest] = deriveEncoder[ProjectUpdateRequest].mapJson(_.dropNullValues)
  implicit val decoderProjectUpdateRequest: Decoder[ProjectUpdateRequest] = deriveDecoder[ProjectUpdateRequest]
}

/**
* Represents an individual user in a project.
* @param `object` The object type, which is always `organization.project.user`
* @param id The identifier, which can be referenced in API endpoints
* @param name The name of the user
* @param email The email address of the user
* @param role `owner` or `member`
* @param addedUnderscoreat The Unix timestamp (in seconds) of when the project was added.
*/

case class ProjectUser(
  `object`: String,
  id: String,
  name: String,
  email: String,
  role: String,
  addedUnderscoreat: Int
)
object ProjectUser {
  implicit val encoderProjectUser: Encoder[ProjectUser] = deriveEncoder[ProjectUser].mapJson(_.dropNullValues)
  implicit val decoderProjectUser: Decoder[ProjectUser] = deriveDecoder[ProjectUser]
}

/**
* 
* @param userUnderscoreid The ID of the user.
* @param role `owner` or `member`
*/

case class ProjectUserCreateRequest(
  userUnderscoreid: String,
  role: String
)
object ProjectUserCreateRequest {
  implicit val encoderProjectUserCreateRequest: Encoder[ProjectUserCreateRequest] = deriveEncoder[ProjectUserCreateRequest].mapJson(_.dropNullValues)
  implicit val decoderProjectUserCreateRequest: Decoder[ProjectUserCreateRequest] = deriveDecoder[ProjectUserCreateRequest]
}

/**
* 
* @param `object` 
* @param id 
* @param deleted 
*/

case class ProjectUserDeleteResponse(
  `object`: String,
  id: String,
  deleted: Boolean
)
object ProjectUserDeleteResponse {
  implicit val encoderProjectUserDeleteResponse: Encoder[ProjectUserDeleteResponse] = deriveEncoder[ProjectUserDeleteResponse].mapJson(_.dropNullValues)
  implicit val decoderProjectUserDeleteResponse: Decoder[ProjectUserDeleteResponse] = deriveDecoder[ProjectUserDeleteResponse]
}

/**
* 
* @param `object` 
* @param data 
* @param firstUnderscoreid 
* @param lastUnderscoreid 
* @param hasUnderscoremore 
*/

case class ProjectUserListResponse(
  `object`: String,
  data: List[ProjectUser],
  firstUnderscoreid: String,
  lastUnderscoreid: String,
  hasUnderscoremore: Boolean
)
object ProjectUserListResponse {
  implicit val encoderProjectUserListResponse: Encoder[ProjectUserListResponse] = deriveEncoder[ProjectUserListResponse].mapJson(_.dropNullValues)
  implicit val decoderProjectUserListResponse: Decoder[ProjectUserListResponse] = deriveDecoder[ProjectUserListResponse]
}

/**
* 
* @param role `owner` or `member`
*/

case class ProjectUserUpdateRequest(
  role: String
)
object ProjectUserUpdateRequest {
  implicit val encoderProjectUserUpdateRequest: Encoder[ProjectUserUpdateRequest] = deriveEncoder[ProjectUserUpdateRequest].mapJson(_.dropNullValues)
  implicit val decoderProjectUserUpdateRequest: Decoder[ProjectUserUpdateRequest] = deriveDecoder[ProjectUserUpdateRequest]
}

/**
* Add a new Item to the Conversation's context, including messages, function  calls, and function call responses. This event can be used both to populate a  \"history\" of the conversation and to add new items mid-stream, but has the  current limitation that it cannot populate assistant audio messages.  If successful, the server will respond with a `conversation.item.created`  event, otherwise an `error` event will be sent. 
* @param eventUnderscoreid Optional client-generated ID used to identify this event.
* @param `type` The event type, must be `conversation.item.create`.
* @param previousUnderscoreitemUnderscoreid The ID of the preceding item after which the new item will be inserted.  If not set, the new item will be appended to the end of the conversation.  If set, it allows an item to be inserted mid-conversation. If the ID  cannot be found, an error will be returned and the item will not be added. 
* @param item 
*/

case class RealtimeClientEventConversationItemCreate(
  eventUnderscoreid: Option[String],
  `type`: String,
  previousUnderscoreitemUnderscoreid: Option[String],
  item: RealtimeConversationItem
)
object RealtimeClientEventConversationItemCreate {
  implicit val encoderRealtimeClientEventConversationItemCreate: Encoder[RealtimeClientEventConversationItemCreate] = deriveEncoder[RealtimeClientEventConversationItemCreate].mapJson(_.dropNullValues)
  implicit val decoderRealtimeClientEventConversationItemCreate: Decoder[RealtimeClientEventConversationItemCreate] = deriveDecoder[RealtimeClientEventConversationItemCreate]
}

/**
* Send this event when you want to remove any item from the conversation  history. The server will respond with a `conversation.item.deleted` event,  unless the item does not exist in the conversation history, in which case the  server will respond with an error. 
* @param eventUnderscoreid Optional client-generated ID used to identify this event.
* @param `type` The event type, must be `conversation.item.delete`.
* @param itemUnderscoreid The ID of the item to delete.
*/

case class RealtimeClientEventConversationItemDelete(
  eventUnderscoreid: Option[String],
  `type`: String,
  itemUnderscoreid: String
)
object RealtimeClientEventConversationItemDelete {
  implicit val encoderRealtimeClientEventConversationItemDelete: Encoder[RealtimeClientEventConversationItemDelete] = deriveEncoder[RealtimeClientEventConversationItemDelete].mapJson(_.dropNullValues)
  implicit val decoderRealtimeClientEventConversationItemDelete: Decoder[RealtimeClientEventConversationItemDelete] = deriveDecoder[RealtimeClientEventConversationItemDelete]
}

/**
* Send this event to truncate a previous assistant message’s audio. The server  will produce audio faster than realtime, so this event is useful when the user  interrupts to truncate audio that has already been sent to the client but not  yet played. This will synchronize the server's understanding of the audio with  the client's playback.  Truncating audio will delete the server-side text transcript to ensure there  is not text in the context that hasn't been heard by the user.  If successful, the server will respond with a `conversation.item.truncated`  event.  
* @param eventUnderscoreid Optional client-generated ID used to identify this event.
* @param `type` The event type, must be `conversation.item.truncate`.
* @param itemUnderscoreid The ID of the assistant message item to truncate. Only assistant message  items can be truncated. 
* @param contentUnderscoreindex The index of the content part to truncate. Set this to 0.
* @param audioUnderscoreendUnderscorems Inclusive duration up to which audio is truncated, in milliseconds. If  the audio_end_ms is greater than the actual audio duration, the server  will respond with an error. 
*/

case class RealtimeClientEventConversationItemTruncate(
  eventUnderscoreid: Option[String],
  `type`: String,
  itemUnderscoreid: String,
  contentUnderscoreindex: Int,
  audioUnderscoreendUnderscorems: Int
)
object RealtimeClientEventConversationItemTruncate {
  implicit val encoderRealtimeClientEventConversationItemTruncate: Encoder[RealtimeClientEventConversationItemTruncate] = deriveEncoder[RealtimeClientEventConversationItemTruncate].mapJson(_.dropNullValues)
  implicit val decoderRealtimeClientEventConversationItemTruncate: Decoder[RealtimeClientEventConversationItemTruncate] = deriveDecoder[RealtimeClientEventConversationItemTruncate]
}

/**
* Send this event to append audio bytes to the input audio buffer. The audio  buffer is temporary storage you can write to and later commit. In Server VAD  mode, the audio buffer is used to detect speech and the server will decide  when to commit. When Server VAD is disabled, you must commit the audio buffer manually.  The client may choose how much audio to place in each event up to a maximum  of 15 MiB, for example streaming smaller chunks from the client may allow the  VAD to be more responsive. Unlike made other client events, the server will  not send a confirmation response to this event. 
* @param eventUnderscoreid Optional client-generated ID used to identify this event.
* @param `type` The event type, must be `input_audio_buffer.append`.
* @param audio Base64-encoded audio bytes. This must be in the format specified by the  `input_audio_format` field in the session configuration. 
*/

case class RealtimeClientEventInputAudioBufferAppend(
  eventUnderscoreid: Option[String],
  `type`: String,
  audio: String
)
object RealtimeClientEventInputAudioBufferAppend {
  implicit val encoderRealtimeClientEventInputAudioBufferAppend: Encoder[RealtimeClientEventInputAudioBufferAppend] = deriveEncoder[RealtimeClientEventInputAudioBufferAppend].mapJson(_.dropNullValues)
  implicit val decoderRealtimeClientEventInputAudioBufferAppend: Decoder[RealtimeClientEventInputAudioBufferAppend] = deriveDecoder[RealtimeClientEventInputAudioBufferAppend]
}

/**
* Send this event to clear the audio bytes in the buffer. The server will  respond with an `input_audio_buffer.cleared` event. 
* @param eventUnderscoreid Optional client-generated ID used to identify this event.
* @param `type` The event type, must be `input_audio_buffer.clear`.
*/

case class RealtimeClientEventInputAudioBufferClear(
  eventUnderscoreid: Option[String],
  `type`: String
)
object RealtimeClientEventInputAudioBufferClear {
  implicit val encoderRealtimeClientEventInputAudioBufferClear: Encoder[RealtimeClientEventInputAudioBufferClear] = deriveEncoder[RealtimeClientEventInputAudioBufferClear].mapJson(_.dropNullValues)
  implicit val decoderRealtimeClientEventInputAudioBufferClear: Decoder[RealtimeClientEventInputAudioBufferClear] = deriveDecoder[RealtimeClientEventInputAudioBufferClear]
}

/**
* Send this event to commit the user input audio buffer, which will create a  new user message item in the conversation. This event will produce an error  if the input audio buffer is empty. When in Server VAD mode, the client does  not need to send this event, the server will commit the audio buffer  automatically.  Committing the input audio buffer will trigger input audio transcription  (if enabled in session configuration), but it will not create a response  from the model. The server will respond with an `input_audio_buffer.committed`  event. 
* @param eventUnderscoreid Optional client-generated ID used to identify this event.
* @param `type` The event type, must be `input_audio_buffer.commit`.
*/

case class RealtimeClientEventInputAudioBufferCommit(
  eventUnderscoreid: Option[String],
  `type`: String
)
object RealtimeClientEventInputAudioBufferCommit {
  implicit val encoderRealtimeClientEventInputAudioBufferCommit: Encoder[RealtimeClientEventInputAudioBufferCommit] = deriveEncoder[RealtimeClientEventInputAudioBufferCommit].mapJson(_.dropNullValues)
  implicit val decoderRealtimeClientEventInputAudioBufferCommit: Decoder[RealtimeClientEventInputAudioBufferCommit] = deriveDecoder[RealtimeClientEventInputAudioBufferCommit]
}

/**
* Send this event to cancel an in-progress response. The server will respond  with a `response.cancelled` event or an error if there is no response to  cancel. 
* @param eventUnderscoreid Optional client-generated ID used to identify this event.
* @param `type` The event type, must be `response.cancel`.
* @param responseUnderscoreid A specific response ID to cancel - if not provided, will cancel an  in-progress response in the default conversation. 
*/

case class RealtimeClientEventResponseCancel(
  eventUnderscoreid: Option[String],
  `type`: String,
  responseUnderscoreid: Option[String]
)
object RealtimeClientEventResponseCancel {
  implicit val encoderRealtimeClientEventResponseCancel: Encoder[RealtimeClientEventResponseCancel] = deriveEncoder[RealtimeClientEventResponseCancel].mapJson(_.dropNullValues)
  implicit val decoderRealtimeClientEventResponseCancel: Decoder[RealtimeClientEventResponseCancel] = deriveDecoder[RealtimeClientEventResponseCancel]
}

/**
* This event instructs the server to create a Response, which means triggering  model inference. When in Server VAD mode, the server will create Responses  automatically.  A Response will include at least one Item, and may have two, in which case  the second will be a function call. These Items will be appended to the  conversation history.  The server will respond with a `response.created` event, events for Items  and content created, and finally a `response.done` event to indicate the  Response is complete.  The `response.create` event includes inference configuration like  `instructions`, and `temperature`. These fields will override the Session's  configuration for this Response only. 
* @param eventUnderscoreid Optional client-generated ID used to identify this event.
* @param `type` The event type, must be `response.create`.
* @param response 
*/

case class RealtimeClientEventResponseCreate(
  eventUnderscoreid: Option[String],
  `type`: String,
  response: Option[RealtimeResponseCreateParams]
)
object RealtimeClientEventResponseCreate {
  implicit val encoderRealtimeClientEventResponseCreate: Encoder[RealtimeClientEventResponseCreate] = deriveEncoder[RealtimeClientEventResponseCreate].mapJson(_.dropNullValues)
  implicit val decoderRealtimeClientEventResponseCreate: Decoder[RealtimeClientEventResponseCreate] = deriveDecoder[RealtimeClientEventResponseCreate]
}

/**
* Send this event to update the session’s default configuration. The client may  send this event at any time to update the session configuration, and any  field may be updated at any time, except for \"voice\". The server will respond  with a `session.updated` event that shows the full effective configuration.  Only fields that are present are updated, thus the correct way to clear a  field like \"instructions\" is to pass an empty string. 
* @param eventUnderscoreid Optional client-generated ID used to identify this event.
* @param `type` The event type, must be `session.update`.
* @param session 
*/

case class RealtimeClientEventSessionUpdate(
  eventUnderscoreid: Option[String],
  `type`: String,
  session: RealtimeSessionCreateRequest
)
object RealtimeClientEventSessionUpdate {
  implicit val encoderRealtimeClientEventSessionUpdate: Encoder[RealtimeClientEventSessionUpdate] = deriveEncoder[RealtimeClientEventSessionUpdate].mapJson(_.dropNullValues)
  implicit val decoderRealtimeClientEventSessionUpdate: Decoder[RealtimeClientEventSessionUpdate] = deriveDecoder[RealtimeClientEventSessionUpdate]
}

/**
* The item to add to the conversation.
* @param id The unique ID of the item, this can be generated by the client to help  manage server-side context, but is not required because the server will  generate one if not provided. 
* @param `type` The type of the item (`message`, `function_call`, `function_call_output`). 
* @param `object` Identifier for the API object being returned - always `realtime.item`. 
* @param status The status of the item (`completed`, `incomplete`). These have no effect  on the conversation, but are accepted for consistency with the  `conversation.item.created` event. 
* @param role The role of the message sender (`user`, `assistant`, `system`), only  applicable for `message` items. 
* @param content The content of the message, applicable for `message` items.  - Message items of role `system` support only `input_text` content - Message items of role `user` support `input_text` and `input_audio`    content - Message items of role `assistant` support `text` content. 
* @param callUnderscoreid The ID of the function call (for `function_call` and  `function_call_output` items). If passed on a `function_call_output`  item, the server will check that a `function_call` item with the same  ID exists in the conversation history. 
* @param name The name of the function being called (for `function_call` items). 
* @param arguments The arguments of the function call (for `function_call` items). 
* @param output The output of the function call (for `function_call_output` items). 
*/

case class RealtimeConversationItem(
  id: Option[String],
  `type`: Option[String],
  `object`: Option[String],
  status: Option[String],
  role: Option[String],
  content: Option[List[RealtimeConversationItemContentInner]],
  callUnderscoreid: Option[String],
  name: Option[String],
  arguments: Option[String],
  output: Option[String]
)
object RealtimeConversationItem {
  implicit val encoderRealtimeConversationItem: Encoder[RealtimeConversationItem] = deriveEncoder[RealtimeConversationItem].mapJson(_.dropNullValues)
  implicit val decoderRealtimeConversationItem: Decoder[RealtimeConversationItem] = deriveDecoder[RealtimeConversationItem]
}

/**
* 
* @param `type` The content type (`input_text`, `input_audio`, `item_reference`, `text`). 
* @param text The text content, used for `input_text` and `text` content types. 
* @param id ID of a previous conversation item to reference (for `item_reference` content types in `response.create` events). These can reference both client and server created items. 
* @param audio Base64-encoded audio bytes, used for `input_audio` content type. 
* @param transcript The transcript of the audio, used for `input_audio` content type. 
*/

case class RealtimeConversationItemContentInner(
  `type`: Option[String],
  text: Option[String],
  id: Option[String],
  audio: Option[String],
  transcript: Option[String]
)
object RealtimeConversationItemContentInner {
  implicit val encoderRealtimeConversationItemContentInner: Encoder[RealtimeConversationItemContentInner] = deriveEncoder[RealtimeConversationItemContentInner].mapJson(_.dropNullValues)
  implicit val decoderRealtimeConversationItemContentInner: Decoder[RealtimeConversationItemContentInner] = deriveDecoder[RealtimeConversationItemContentInner]
}

/**
* The response resource.
* @param id The unique ID of the response.
* @param `object` The object type, must be `realtime.response`.
* @param status The final status of the response (`completed`, `cancelled`, `failed`, or  `incomplete`). 
* @param statusUnderscoredetails 
* @param output The list of output items generated by the response.
* @param metadata Developer-provided string key-value pairs associated with this response. 
* @param usage 
*/

case class RealtimeResponse(
  id: Option[String],
  `object`: Option[String],
  status: Option[String],
  statusUnderscoredetails: Option[RealtimeResponseStatusDetails],
  output: Option[List[RealtimeConversationItem]],
  metadata: Option[Object],
  usage: Option[RealtimeResponseUsage]
)
object RealtimeResponse {
  implicit val encoderRealtimeResponse: Encoder[RealtimeResponse] = deriveEncoder[RealtimeResponse].mapJson(_.dropNullValues)
  implicit val decoderRealtimeResponse: Decoder[RealtimeResponse] = deriveDecoder[RealtimeResponse]
}

/**
* Create a new Realtime response with these parameters
* @param modalities The set of modalities the model can respond with. To disable audio, set this to [\"text\"]. 
* @param instructions The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \"be extremely succinct\", \"act friendly\", \"here are examples of good  responses\") and on audio behavior (e.g. \"talk quickly\", \"inject emotion  into your voice\", \"laugh frequently\"). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the `session.created` event at the  start of the session. 
* @param voice The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
* @param outputUnderscoreaudioUnderscoreformat The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
* @param tools Tools (functions) available to the model.
* @param toolUnderscorechoice How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function, like `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}`. 
* @param temperature Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8. 
* @param maxUnderscoreresponseUnderscoreoutputUnderscoretokens 
* @param conversation 
* @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
* @param input Input items to include in the prompt for the model. Creates a new context for this response, without including the default conversation. Can include references to items from the default conversation. 
*/

case class RealtimeResponseCreateParams(
  modalities: Option[List[String]],
  instructions: Option[String],
  voice: Option[String],
  outputUnderscoreaudioUnderscoreformat: Option[String],
  tools: Option[List[RealtimeResponseCreateParamsToolsInner]],
  toolUnderscorechoice: Option[String],
  temperature: Option[BigDecimal],
  maxUnderscoreresponseUnderscoreoutputUnderscoretokens: Option[RealtimeResponseCreateParamsMaxResponseOutputTokens],
  conversation: Option[RealtimeResponseCreateParamsConversation],
  metadata: Option[Object],
  input: Option[List[RealtimeConversationItem]]
)
object RealtimeResponseCreateParams {
  implicit val encoderRealtimeResponseCreateParams: Encoder[RealtimeResponseCreateParams] = deriveEncoder[RealtimeResponseCreateParams].mapJson(_.dropNullValues)
  implicit val decoderRealtimeResponseCreateParams: Decoder[RealtimeResponseCreateParams] = deriveDecoder[RealtimeResponseCreateParams]
}

/**
* Controls which conversation the response is added to. Currently supports `auto` and `none`, with `auto` as the default value. The `auto` value means that the contents of the response will be added to the default conversation. Set this to `none` to create an out-of-band response which  will not add items to default conversation. 
*/
sealed trait RealtimeResponseCreateParamsConversation
object RealtimeResponseCreateParamsConversation {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val realtimeResponseCreateParamsConversationEncoder: Encoder[RealtimeResponseCreateParamsConversation] = Encoder.instance {
    case string: String => string.asJson
  }

  implicit val realtimeResponseCreateParamsConversationDecoder: Decoder[RealtimeResponseCreateParamsConversation] =
    List[Decoder[RealtimeResponseCreateParamsConversation]](
      Decoder[String].widen,
  ).reduceLeft(_ or _)
}


/**
* Maximum number of output tokens for a single assistant response, inclusive of tool calls. Provide an integer between 1 and 4096 to limit output tokens, or `inf` for the maximum available tokens for a given model. Defaults to `inf`. 
*/
sealed trait RealtimeResponseCreateParamsMaxResponseOutputTokens
object RealtimeResponseCreateParamsMaxResponseOutputTokens {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val realtimeResponseCreateParamsMaxResponseOutputTokensEncoder: Encoder[RealtimeResponseCreateParamsMaxResponseOutputTokens] = Encoder.instance {
    case `int`: Int => `int`.asJson
    case string: String => string.asJson
  }

  implicit val realtimeResponseCreateParamsMaxResponseOutputTokensDecoder: Decoder[RealtimeResponseCreateParamsMaxResponseOutputTokens] =
    List[Decoder[RealtimeResponseCreateParamsMaxResponseOutputTokens]](
      Decoder[Int].widen,
      Decoder[String].widen,
  ).reduceLeft(_ or _)
}


/**
* 
* @param `type` The type of the tool, i.e. `function`.
* @param name The name of the function.
* @param description The description of the function, including guidance on when and how  to call it, and guidance about what to tell the user when calling  (if anything). 
* @param parameters Parameters of the function in JSON Schema.
*/

case class RealtimeResponseCreateParamsToolsInner(
  `type`: Option[String],
  name: Option[String],
  description: Option[String],
  parameters: Option[Object]
)
object RealtimeResponseCreateParamsToolsInner {
  implicit val encoderRealtimeResponseCreateParamsToolsInner: Encoder[RealtimeResponseCreateParamsToolsInner] = deriveEncoder[RealtimeResponseCreateParamsToolsInner].mapJson(_.dropNullValues)
  implicit val decoderRealtimeResponseCreateParamsToolsInner: Decoder[RealtimeResponseCreateParamsToolsInner] = deriveDecoder[RealtimeResponseCreateParamsToolsInner]
}

/**
* Additional details about the status.
* @param `type` The type of error that caused the response to fail, corresponding  with the `status` field (`completed`, `cancelled`, `incomplete`,  `failed`). 
* @param reason The reason the Response did not complete. For a `cancelled` Response,  one of `turn_detected` (the server VAD detected a new start of speech)  or `client_cancelled` (the client sent a cancel event). For an  `incomplete` Response, one of `max_output_tokens` or `content_filter`  (the server-side safety filter activated and cut off the response). 
* @param error 
*/

case class RealtimeResponseStatusDetails(
  `type`: Option[String],
  reason: Option[String],
  error: Option[RealtimeResponseStatusDetailsError]
)
object RealtimeResponseStatusDetails {
  implicit val encoderRealtimeResponseStatusDetails: Encoder[RealtimeResponseStatusDetails] = deriveEncoder[RealtimeResponseStatusDetails].mapJson(_.dropNullValues)
  implicit val decoderRealtimeResponseStatusDetails: Decoder[RealtimeResponseStatusDetails] = deriveDecoder[RealtimeResponseStatusDetails]
}

/**
* A description of the error that caused the response to fail,  populated when the `status` is `failed`. 
* @param `type` The type of error.
* @param code Error code, if any.
*/

case class RealtimeResponseStatusDetailsError(
  `type`: Option[String],
  code: Option[String]
)
object RealtimeResponseStatusDetailsError {
  implicit val encoderRealtimeResponseStatusDetailsError: Encoder[RealtimeResponseStatusDetailsError] = deriveEncoder[RealtimeResponseStatusDetailsError].mapJson(_.dropNullValues)
  implicit val decoderRealtimeResponseStatusDetailsError: Decoder[RealtimeResponseStatusDetailsError] = deriveDecoder[RealtimeResponseStatusDetailsError]
}

/**
* Usage statistics for the Response, this will correspond to billing. A  Realtime API session will maintain a conversation context and append new  Items to the Conversation, thus output from previous turns (text and  audio tokens) will become the input for later turns. 
* @param totalUnderscoretokens The total number of tokens in the Response including input and output  text and audio tokens. 
* @param inputUnderscoretokens The number of input tokens used in the Response, including text and  audio tokens. 
* @param outputUnderscoretokens The number of output tokens sent in the Response, including text and  audio tokens. 
* @param inputUnderscoretokenUnderscoredetails 
* @param outputUnderscoretokenUnderscoredetails 
*/

case class RealtimeResponseUsage(
  totalUnderscoretokens: Option[Int],
  inputUnderscoretokens: Option[Int],
  outputUnderscoretokens: Option[Int],
  inputUnderscoretokenUnderscoredetails: Option[RealtimeResponseUsageInputTokenDetails],
  outputUnderscoretokenUnderscoredetails: Option[RealtimeResponseUsageOutputTokenDetails]
)
object RealtimeResponseUsage {
  implicit val encoderRealtimeResponseUsage: Encoder[RealtimeResponseUsage] = deriveEncoder[RealtimeResponseUsage].mapJson(_.dropNullValues)
  implicit val decoderRealtimeResponseUsage: Decoder[RealtimeResponseUsage] = deriveDecoder[RealtimeResponseUsage]
}

/**
* Details about the input tokens used in the Response.
* @param cachedUnderscoretokens The number of cached tokens used in the Response.
* @param textUnderscoretokens The number of text tokens used in the Response.
* @param audioUnderscoretokens The number of audio tokens used in the Response.
*/

case class RealtimeResponseUsageInputTokenDetails(
  cachedUnderscoretokens: Option[Int],
  textUnderscoretokens: Option[Int],
  audioUnderscoretokens: Option[Int]
)
object RealtimeResponseUsageInputTokenDetails {
  implicit val encoderRealtimeResponseUsageInputTokenDetails: Encoder[RealtimeResponseUsageInputTokenDetails] = deriveEncoder[RealtimeResponseUsageInputTokenDetails].mapJson(_.dropNullValues)
  implicit val decoderRealtimeResponseUsageInputTokenDetails: Decoder[RealtimeResponseUsageInputTokenDetails] = deriveDecoder[RealtimeResponseUsageInputTokenDetails]
}

/**
* Details about the output tokens used in the Response.
* @param textUnderscoretokens The number of text tokens used in the Response.
* @param audioUnderscoretokens The number of audio tokens used in the Response.
*/

case class RealtimeResponseUsageOutputTokenDetails(
  textUnderscoretokens: Option[Int],
  audioUnderscoretokens: Option[Int]
)
object RealtimeResponseUsageOutputTokenDetails {
  implicit val encoderRealtimeResponseUsageOutputTokenDetails: Encoder[RealtimeResponseUsageOutputTokenDetails] = deriveEncoder[RealtimeResponseUsageOutputTokenDetails].mapJson(_.dropNullValues)
  implicit val decoderRealtimeResponseUsageOutputTokenDetails: Decoder[RealtimeResponseUsageOutputTokenDetails] = deriveDecoder[RealtimeResponseUsageOutputTokenDetails]
}

/**
* Returned when a conversation is created. Emitted right after session creation. 
* @param eventUnderscoreid The unique ID of the server event.
* @param `type` The event type, must be `conversation.created`.
* @param conversation 
*/

case class RealtimeServerEventConversationCreated(
  eventUnderscoreid: String,
  `type`: String,
  conversation: RealtimeServerEventConversationCreatedConversation
)
object RealtimeServerEventConversationCreated {
  implicit val encoderRealtimeServerEventConversationCreated: Encoder[RealtimeServerEventConversationCreated] = deriveEncoder[RealtimeServerEventConversationCreated].mapJson(_.dropNullValues)
  implicit val decoderRealtimeServerEventConversationCreated: Decoder[RealtimeServerEventConversationCreated] = deriveDecoder[RealtimeServerEventConversationCreated]
}

/**
* The conversation resource.
* @param id The unique ID of the conversation.
* @param `object` The object type, must be `realtime.conversation`.
*/

case class RealtimeServerEventConversationCreatedConversation(
  id: Option[String],
  `object`: Option[String]
)
object RealtimeServerEventConversationCreatedConversation {
  implicit val encoderRealtimeServerEventConversationCreatedConversation: Encoder[RealtimeServerEventConversationCreatedConversation] = deriveEncoder[RealtimeServerEventConversationCreatedConversation].mapJson(_.dropNullValues)
  implicit val decoderRealtimeServerEventConversationCreatedConversation: Decoder[RealtimeServerEventConversationCreatedConversation] = deriveDecoder[RealtimeServerEventConversationCreatedConversation]
}

/**
* Returned when a conversation item is created. There are several scenarios that  produce this event:   - The server is generating a Response, which if successful will produce      either one or two Items, which will be of type `message`      (role `assistant`) or type `function_call`.   - The input audio buffer has been committed, either by the client or the      server (in `server_vad` mode). The server will take the content of the      input audio buffer and add it to a new user message Item.   - The client has sent a `conversation.item.create` event to add a new Item      to the Conversation. 
* @param eventUnderscoreid The unique ID of the server event.
* @param `type` The event type, must be `conversation.item.created`.
* @param previousUnderscoreitemUnderscoreid The ID of the preceding item in the Conversation context, allows the  client to understand the order of the conversation. 
* @param item 
*/

case class RealtimeServerEventConversationItemCreated(
  eventUnderscoreid: String,
  `type`: String,
  previousUnderscoreitemUnderscoreid: String,
  item: RealtimeConversationItem
)
object RealtimeServerEventConversationItemCreated {
  implicit val encoderRealtimeServerEventConversationItemCreated: Encoder[RealtimeServerEventConversationItemCreated] = deriveEncoder[RealtimeServerEventConversationItemCreated].mapJson(_.dropNullValues)
  implicit val decoderRealtimeServerEventConversationItemCreated: Decoder[RealtimeServerEventConversationItemCreated] = deriveDecoder[RealtimeServerEventConversationItemCreated]
}

/**
* Returned when an item in the conversation is deleted by the client with a  `conversation.item.delete` event. This event is used to synchronize the  server's understanding of the conversation history with the client's view. 
* @param eventUnderscoreid The unique ID of the server event.
* @param `type` The event type, must be `conversation.item.deleted`.
* @param itemUnderscoreid The ID of the item that was deleted.
*/

case class RealtimeServerEventConversationItemDeleted(
  eventUnderscoreid: String,
  `type`: String,
  itemUnderscoreid: String
)
object RealtimeServerEventConversationItemDeleted {
  implicit val encoderRealtimeServerEventConversationItemDeleted: Encoder[RealtimeServerEventConversationItemDeleted] = deriveEncoder[RealtimeServerEventConversationItemDeleted].mapJson(_.dropNullValues)
  implicit val decoderRealtimeServerEventConversationItemDeleted: Decoder[RealtimeServerEventConversationItemDeleted] = deriveDecoder[RealtimeServerEventConversationItemDeleted]
}

/**
* This event is the output of audio transcription for user audio written to the  user audio buffer. Transcription begins when the input audio buffer is  committed by the client or server (in `server_vad` mode). Transcription runs  asynchronously with Response creation, so this event may come before or after  the Response events.  Realtime API models accept audio natively, and thus input transcription is a  separate process run on a separate ASR (Automatic Speech Recognition) model,  currently always `whisper-1`. Thus the transcript may diverge somewhat from  the model's interpretation, and should be treated as a rough guide. 
* @param eventUnderscoreid The unique ID of the server event.
* @param `type` The event type, must be `conversation.item.input_audio_transcription.completed`. 
* @param itemUnderscoreid The ID of the user message item containing the audio.
* @param contentUnderscoreindex The index of the content part containing the audio.
* @param transcript The transcribed text.
*/

case class RealtimeServerEventConversationItemInputAudioTranscriptionCompleted(
  eventUnderscoreid: String,
  `type`: String,
  itemUnderscoreid: String,
  contentUnderscoreindex: Int,
  transcript: String
)
object RealtimeServerEventConversationItemInputAudioTranscriptionCompleted {
  implicit val encoderRealtimeServerEventConversationItemInputAudioTranscriptionCompleted: Encoder[RealtimeServerEventConversationItemInputAudioTranscriptionCompleted] = deriveEncoder[RealtimeServerEventConversationItemInputAudioTranscriptionCompleted].mapJson(_.dropNullValues)
  implicit val decoderRealtimeServerEventConversationItemInputAudioTranscriptionCompleted: Decoder[RealtimeServerEventConversationItemInputAudioTranscriptionCompleted] = deriveDecoder[RealtimeServerEventConversationItemInputAudioTranscriptionCompleted]
}

/**
* Returned when input audio transcription is configured, and a transcription  request for a user message failed. These events are separate from other  `error` events so that the client can identify the related Item. 
* @param eventUnderscoreid The unique ID of the server event.
* @param `type` The event type, must be `conversation.item.input_audio_transcription.failed`. 
* @param itemUnderscoreid The ID of the user message item.
* @param contentUnderscoreindex The index of the content part containing the audio.
* @param error 
*/

case class RealtimeServerEventConversationItemInputAudioTranscriptionFailed(
  eventUnderscoreid: String,
  `type`: String,
  itemUnderscoreid: String,
  contentUnderscoreindex: Int,
  error: RealtimeServerEventConversationItemInputAudioTranscriptionFailedError
)
object RealtimeServerEventConversationItemInputAudioTranscriptionFailed {
  implicit val encoderRealtimeServerEventConversationItemInputAudioTranscriptionFailed: Encoder[RealtimeServerEventConversationItemInputAudioTranscriptionFailed] = deriveEncoder[RealtimeServerEventConversationItemInputAudioTranscriptionFailed].mapJson(_.dropNullValues)
  implicit val decoderRealtimeServerEventConversationItemInputAudioTranscriptionFailed: Decoder[RealtimeServerEventConversationItemInputAudioTranscriptionFailed] = deriveDecoder[RealtimeServerEventConversationItemInputAudioTranscriptionFailed]
}

/**
* Details of the transcription error.
* @param `type` The type of error.
* @param code Error code, if any.
* @param message A human-readable error message.
* @param param Parameter related to the error, if any.
*/

case class RealtimeServerEventConversationItemInputAudioTranscriptionFailedError(
  `type`: Option[String],
  code: Option[String],
  message: Option[String],
  param: Option[String]
)
object RealtimeServerEventConversationItemInputAudioTranscriptionFailedError {
  implicit val encoderRealtimeServerEventConversationItemInputAudioTranscriptionFailedError: Encoder[RealtimeServerEventConversationItemInputAudioTranscriptionFailedError] = deriveEncoder[RealtimeServerEventConversationItemInputAudioTranscriptionFailedError].mapJson(_.dropNullValues)
  implicit val decoderRealtimeServerEventConversationItemInputAudioTranscriptionFailedError: Decoder[RealtimeServerEventConversationItemInputAudioTranscriptionFailedError] = deriveDecoder[RealtimeServerEventConversationItemInputAudioTranscriptionFailedError]
}

/**
* Returned when an earlier assistant audio message item is truncated by the  client with a `conversation.item.truncate` event. This event is used to  synchronize the server's understanding of the audio with the client's playback.  This action will truncate the audio and remove the server-side text transcript  to ensure there is no text in the context that hasn't been heard by the user. 
* @param eventUnderscoreid The unique ID of the server event.
* @param `type` The event type, must be `conversation.item.truncated`.
* @param itemUnderscoreid The ID of the assistant message item that was truncated.
* @param contentUnderscoreindex The index of the content part that was truncated.
* @param audioUnderscoreendUnderscorems The duration up to which the audio was truncated, in milliseconds. 
*/

case class RealtimeServerEventConversationItemTruncated(
  eventUnderscoreid: String,
  `type`: String,
  itemUnderscoreid: String,
  contentUnderscoreindex: Int,
  audioUnderscoreendUnderscorems: Int
)
object RealtimeServerEventConversationItemTruncated {
  implicit val encoderRealtimeServerEventConversationItemTruncated: Encoder[RealtimeServerEventConversationItemTruncated] = deriveEncoder[RealtimeServerEventConversationItemTruncated].mapJson(_.dropNullValues)
  implicit val decoderRealtimeServerEventConversationItemTruncated: Decoder[RealtimeServerEventConversationItemTruncated] = deriveDecoder[RealtimeServerEventConversationItemTruncated]
}

/**
* Returned when an error occurs, which could be a client problem or a server  problem. Most errors are recoverable and the session will stay open, we  recommend to implementors to monitor and log error messages by default. 
* @param eventUnderscoreid The unique ID of the server event.
* @param `type` The event type, must be `error`.
* @param error 
*/

case class RealtimeServerEventError(
  eventUnderscoreid: String,
  `type`: String,
  error: RealtimeServerEventErrorError
)
object RealtimeServerEventError {
  implicit val encoderRealtimeServerEventError: Encoder[RealtimeServerEventError] = deriveEncoder[RealtimeServerEventError].mapJson(_.dropNullValues)
  implicit val decoderRealtimeServerEventError: Decoder[RealtimeServerEventError] = deriveDecoder[RealtimeServerEventError]
}

/**
* Details of the error.
* @param `type` The type of error (e.g., \"invalid_request_error\", \"server_error\"). 
* @param code Error code, if any.
* @param message A human-readable error message.
* @param param Parameter related to the error, if any.
* @param eventUnderscoreid The event_id of the client event that caused the error, if applicable. 
*/

case class RealtimeServerEventErrorError(
  `type`: String,
  code: Option[String],
  message: String,
  param: Option[String],
  eventUnderscoreid: Option[String]
)
object RealtimeServerEventErrorError {
  implicit val encoderRealtimeServerEventErrorError: Encoder[RealtimeServerEventErrorError] = deriveEncoder[RealtimeServerEventErrorError].mapJson(_.dropNullValues)
  implicit val decoderRealtimeServerEventErrorError: Decoder[RealtimeServerEventErrorError] = deriveDecoder[RealtimeServerEventErrorError]
}

/**
* Returned when the input audio buffer is cleared by the client with a  `input_audio_buffer.clear` event. 
* @param eventUnderscoreid The unique ID of the server event.
* @param `type` The event type, must be `input_audio_buffer.cleared`.
*/

case class RealtimeServerEventInputAudioBufferCleared(
  eventUnderscoreid: String,
  `type`: String
)
object RealtimeServerEventInputAudioBufferCleared {
  implicit val encoderRealtimeServerEventInputAudioBufferCleared: Encoder[RealtimeServerEventInputAudioBufferCleared] = deriveEncoder[RealtimeServerEventInputAudioBufferCleared].mapJson(_.dropNullValues)
  implicit val decoderRealtimeServerEventInputAudioBufferCleared: Decoder[RealtimeServerEventInputAudioBufferCleared] = deriveDecoder[RealtimeServerEventInputAudioBufferCleared]
}

/**
* Returned when an input audio buffer is committed, either by the client or  automatically in server VAD mode. The `item_id` property is the ID of the user message item that will be created, thus a `conversation.item.created` event  will also be sent to the client. 
* @param eventUnderscoreid The unique ID of the server event.
* @param `type` The event type, must be `input_audio_buffer.committed`.
* @param previousUnderscoreitemUnderscoreid The ID of the preceding item after which the new item will be inserted. 
* @param itemUnderscoreid The ID of the user message item that will be created.
*/

case class RealtimeServerEventInputAudioBufferCommitted(
  eventUnderscoreid: String,
  `type`: String,
  previousUnderscoreitemUnderscoreid: String,
  itemUnderscoreid: String
)
object RealtimeServerEventInputAudioBufferCommitted {
  implicit val encoderRealtimeServerEventInputAudioBufferCommitted: Encoder[RealtimeServerEventInputAudioBufferCommitted] = deriveEncoder[RealtimeServerEventInputAudioBufferCommitted].mapJson(_.dropNullValues)
  implicit val decoderRealtimeServerEventInputAudioBufferCommitted: Decoder[RealtimeServerEventInputAudioBufferCommitted] = deriveDecoder[RealtimeServerEventInputAudioBufferCommitted]
}

/**
* Sent by the server when in `server_vad` mode to indicate that speech has been  detected in the audio buffer. This can happen any time audio is added to the  buffer (unless speech is already detected). The client may want to use this  event to interrupt audio playback or provide visual feedback to the user.   The client should expect to receive a `input_audio_buffer.speech_stopped` event  when speech stops. The `item_id` property is the ID of the user message item  that will be created when speech stops and will also be included in the  `input_audio_buffer.speech_stopped` event (unless the client manually commits  the audio buffer during VAD activation). 
* @param eventUnderscoreid The unique ID of the server event.
* @param `type` The event type, must be `input_audio_buffer.speech_started`.
* @param audioUnderscorestartUnderscorems Milliseconds from the start of all audio written to the buffer during the  session when speech was first detected. This will correspond to the  beginning of audio sent to the model, and thus includes the  `prefix_padding_ms` configured in the Session. 
* @param itemUnderscoreid The ID of the user message item that will be created when speech stops. 
*/

case class RealtimeServerEventInputAudioBufferSpeechStarted(
  eventUnderscoreid: String,
  `type`: String,
  audioUnderscorestartUnderscorems: Int,
  itemUnderscoreid: String
)
object RealtimeServerEventInputAudioBufferSpeechStarted {
  implicit val encoderRealtimeServerEventInputAudioBufferSpeechStarted: Encoder[RealtimeServerEventInputAudioBufferSpeechStarted] = deriveEncoder[RealtimeServerEventInputAudioBufferSpeechStarted].mapJson(_.dropNullValues)
  implicit val decoderRealtimeServerEventInputAudioBufferSpeechStarted: Decoder[RealtimeServerEventInputAudioBufferSpeechStarted] = deriveDecoder[RealtimeServerEventInputAudioBufferSpeechStarted]
}

/**
* Returned in `server_vad` mode when the server detects the end of speech in  the audio buffer. The server will also send an `conversation.item.created`  event with the user message item that is created from the audio buffer. 
* @param eventUnderscoreid The unique ID of the server event.
* @param `type` The event type, must be `input_audio_buffer.speech_stopped`.
* @param audioUnderscoreendUnderscorems Milliseconds since the session started when speech stopped. This will  correspond to the end of audio sent to the model, and thus includes the  `min_silence_duration_ms` configured in the Session. 
* @param itemUnderscoreid The ID of the user message item that will be created.
*/

case class RealtimeServerEventInputAudioBufferSpeechStopped(
  eventUnderscoreid: String,
  `type`: String,
  audioUnderscoreendUnderscorems: Int,
  itemUnderscoreid: String
)
object RealtimeServerEventInputAudioBufferSpeechStopped {
  implicit val encoderRealtimeServerEventInputAudioBufferSpeechStopped: Encoder[RealtimeServerEventInputAudioBufferSpeechStopped] = deriveEncoder[RealtimeServerEventInputAudioBufferSpeechStopped].mapJson(_.dropNullValues)
  implicit val decoderRealtimeServerEventInputAudioBufferSpeechStopped: Decoder[RealtimeServerEventInputAudioBufferSpeechStopped] = deriveDecoder[RealtimeServerEventInputAudioBufferSpeechStopped]
}

/**
* Emitted at the beginning of a Response to indicate the updated rate limits.  When a Response is created some tokens will be \"reserved\" for the output  tokens, the rate limits shown here reflect that reservation, which is then  adjusted accordingly once the Response is completed. 
* @param eventUnderscoreid The unique ID of the server event.
* @param `type` The event type, must be `rate_limits.updated`.
* @param rateUnderscorelimits List of rate limit information.
*/

case class RealtimeServerEventRateLimitsUpdated(
  eventUnderscoreid: String,
  `type`: String,
  rateUnderscorelimits: List[RealtimeServerEventRateLimitsUpdatedRateLimitsInner]
)
object RealtimeServerEventRateLimitsUpdated {
  implicit val encoderRealtimeServerEventRateLimitsUpdated: Encoder[RealtimeServerEventRateLimitsUpdated] = deriveEncoder[RealtimeServerEventRateLimitsUpdated].mapJson(_.dropNullValues)
  implicit val decoderRealtimeServerEventRateLimitsUpdated: Decoder[RealtimeServerEventRateLimitsUpdated] = deriveDecoder[RealtimeServerEventRateLimitsUpdated]
}

/**
* 
* @param name The name of the rate limit (`requests`, `tokens`). 
* @param limit The maximum allowed value for the rate limit.
* @param remaining The remaining value before the limit is reached.
* @param resetUnderscoreseconds Seconds until the rate limit resets.
*/

case class RealtimeServerEventRateLimitsUpdatedRateLimitsInner(
  name: Option[String],
  limit: Option[Int],
  remaining: Option[Int],
  resetUnderscoreseconds: Option[BigDecimal]
)
object RealtimeServerEventRateLimitsUpdatedRateLimitsInner {
  implicit val encoderRealtimeServerEventRateLimitsUpdatedRateLimitsInner: Encoder[RealtimeServerEventRateLimitsUpdatedRateLimitsInner] = deriveEncoder[RealtimeServerEventRateLimitsUpdatedRateLimitsInner].mapJson(_.dropNullValues)
  implicit val decoderRealtimeServerEventRateLimitsUpdatedRateLimitsInner: Decoder[RealtimeServerEventRateLimitsUpdatedRateLimitsInner] = deriveDecoder[RealtimeServerEventRateLimitsUpdatedRateLimitsInner]
}

/**
* Returned when the model-generated audio is updated.
* @param eventUnderscoreid The unique ID of the server event.
* @param `type` The event type, must be `response.audio.delta`.
* @param responseUnderscoreid The ID of the response.
* @param itemUnderscoreid The ID of the item.
* @param outputUnderscoreindex The index of the output item in the response.
* @param contentUnderscoreindex The index of the content part in the item's content array.
* @param delta Base64-encoded audio data delta.
*/

case class RealtimeServerEventResponseAudioDelta(
  eventUnderscoreid: String,
  `type`: String,
  responseUnderscoreid: String,
  itemUnderscoreid: String,
  outputUnderscoreindex: Int,
  contentUnderscoreindex: Int,
  delta: String
)
object RealtimeServerEventResponseAudioDelta {
  implicit val encoderRealtimeServerEventResponseAudioDelta: Encoder[RealtimeServerEventResponseAudioDelta] = deriveEncoder[RealtimeServerEventResponseAudioDelta].mapJson(_.dropNullValues)
  implicit val decoderRealtimeServerEventResponseAudioDelta: Decoder[RealtimeServerEventResponseAudioDelta] = deriveDecoder[RealtimeServerEventResponseAudioDelta]
}

/**
* Returned when the model-generated audio is done. Also emitted when a Response is interrupted, incomplete, or cancelled. 
* @param eventUnderscoreid The unique ID of the server event.
* @param `type` The event type, must be `response.audio.done`.
* @param responseUnderscoreid The ID of the response.
* @param itemUnderscoreid The ID of the item.
* @param outputUnderscoreindex The index of the output item in the response.
* @param contentUnderscoreindex The index of the content part in the item's content array.
*/

case class RealtimeServerEventResponseAudioDone(
  eventUnderscoreid: String,
  `type`: String,
  responseUnderscoreid: String,
  itemUnderscoreid: String,
  outputUnderscoreindex: Int,
  contentUnderscoreindex: Int
)
object RealtimeServerEventResponseAudioDone {
  implicit val encoderRealtimeServerEventResponseAudioDone: Encoder[RealtimeServerEventResponseAudioDone] = deriveEncoder[RealtimeServerEventResponseAudioDone].mapJson(_.dropNullValues)
  implicit val decoderRealtimeServerEventResponseAudioDone: Decoder[RealtimeServerEventResponseAudioDone] = deriveDecoder[RealtimeServerEventResponseAudioDone]
}

/**
* Returned when the model-generated transcription of audio output is updated. 
* @param eventUnderscoreid The unique ID of the server event.
* @param `type` The event type, must be `response.audio_transcript.delta`.
* @param responseUnderscoreid The ID of the response.
* @param itemUnderscoreid The ID of the item.
* @param outputUnderscoreindex The index of the output item in the response.
* @param contentUnderscoreindex The index of the content part in the item's content array.
* @param delta The transcript delta.
*/

case class RealtimeServerEventResponseAudioTranscriptDelta(
  eventUnderscoreid: String,
  `type`: String,
  responseUnderscoreid: String,
  itemUnderscoreid: String,
  outputUnderscoreindex: Int,
  contentUnderscoreindex: Int,
  delta: String
)
object RealtimeServerEventResponseAudioTranscriptDelta {
  implicit val encoderRealtimeServerEventResponseAudioTranscriptDelta: Encoder[RealtimeServerEventResponseAudioTranscriptDelta] = deriveEncoder[RealtimeServerEventResponseAudioTranscriptDelta].mapJson(_.dropNullValues)
  implicit val decoderRealtimeServerEventResponseAudioTranscriptDelta: Decoder[RealtimeServerEventResponseAudioTranscriptDelta] = deriveDecoder[RealtimeServerEventResponseAudioTranscriptDelta]
}

/**
* Returned when the model-generated transcription of audio output is done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. 
* @param eventUnderscoreid The unique ID of the server event.
* @param `type` The event type, must be `response.audio_transcript.done`.
* @param responseUnderscoreid The ID of the response.
* @param itemUnderscoreid The ID of the item.
* @param outputUnderscoreindex The index of the output item in the response.
* @param contentUnderscoreindex The index of the content part in the item's content array.
* @param transcript The final transcript of the audio.
*/

case class RealtimeServerEventResponseAudioTranscriptDone(
  eventUnderscoreid: String,
  `type`: String,
  responseUnderscoreid: String,
  itemUnderscoreid: String,
  outputUnderscoreindex: Int,
  contentUnderscoreindex: Int,
  transcript: String
)
object RealtimeServerEventResponseAudioTranscriptDone {
  implicit val encoderRealtimeServerEventResponseAudioTranscriptDone: Encoder[RealtimeServerEventResponseAudioTranscriptDone] = deriveEncoder[RealtimeServerEventResponseAudioTranscriptDone].mapJson(_.dropNullValues)
  implicit val decoderRealtimeServerEventResponseAudioTranscriptDone: Decoder[RealtimeServerEventResponseAudioTranscriptDone] = deriveDecoder[RealtimeServerEventResponseAudioTranscriptDone]
}

/**
* Returned when a new content part is added to an assistant message item during response generation. 
* @param eventUnderscoreid The unique ID of the server event.
* @param `type` The event type, must be `response.content_part.added`.
* @param responseUnderscoreid The ID of the response.
* @param itemUnderscoreid The ID of the item to which the content part was added.
* @param outputUnderscoreindex The index of the output item in the response.
* @param contentUnderscoreindex The index of the content part in the item's content array.
* @param part 
*/

case class RealtimeServerEventResponseContentPartAdded(
  eventUnderscoreid: String,
  `type`: String,
  responseUnderscoreid: String,
  itemUnderscoreid: String,
  outputUnderscoreindex: Int,
  contentUnderscoreindex: Int,
  part: RealtimeServerEventResponseContentPartAddedPart
)
object RealtimeServerEventResponseContentPartAdded {
  implicit val encoderRealtimeServerEventResponseContentPartAdded: Encoder[RealtimeServerEventResponseContentPartAdded] = deriveEncoder[RealtimeServerEventResponseContentPartAdded].mapJson(_.dropNullValues)
  implicit val decoderRealtimeServerEventResponseContentPartAdded: Decoder[RealtimeServerEventResponseContentPartAdded] = deriveDecoder[RealtimeServerEventResponseContentPartAdded]
}

/**
* The content part that was added.
* @param `type` The content type (\"text\", \"audio\").
* @param text The text content (if type is \"text\").
* @param audio Base64-encoded audio data (if type is \"audio\").
* @param transcript The transcript of the audio (if type is \"audio\").
*/

case class RealtimeServerEventResponseContentPartAddedPart(
  `type`: Option[String],
  text: Option[String],
  audio: Option[String],
  transcript: Option[String]
)
object RealtimeServerEventResponseContentPartAddedPart {
  implicit val encoderRealtimeServerEventResponseContentPartAddedPart: Encoder[RealtimeServerEventResponseContentPartAddedPart] = deriveEncoder[RealtimeServerEventResponseContentPartAddedPart].mapJson(_.dropNullValues)
  implicit val decoderRealtimeServerEventResponseContentPartAddedPart: Decoder[RealtimeServerEventResponseContentPartAddedPart] = deriveDecoder[RealtimeServerEventResponseContentPartAddedPart]
}

/**
* Returned when a content part is done streaming in an assistant message item. Also emitted when a Response is interrupted, incomplete, or cancelled. 
* @param eventUnderscoreid The unique ID of the server event.
* @param `type` The event type, must be `response.content_part.done`.
* @param responseUnderscoreid The ID of the response.
* @param itemUnderscoreid The ID of the item.
* @param outputUnderscoreindex The index of the output item in the response.
* @param contentUnderscoreindex The index of the content part in the item's content array.
* @param part 
*/

case class RealtimeServerEventResponseContentPartDone(
  eventUnderscoreid: String,
  `type`: String,
  responseUnderscoreid: String,
  itemUnderscoreid: String,
  outputUnderscoreindex: Int,
  contentUnderscoreindex: Int,
  part: RealtimeServerEventResponseContentPartDonePart
)
object RealtimeServerEventResponseContentPartDone {
  implicit val encoderRealtimeServerEventResponseContentPartDone: Encoder[RealtimeServerEventResponseContentPartDone] = deriveEncoder[RealtimeServerEventResponseContentPartDone].mapJson(_.dropNullValues)
  implicit val decoderRealtimeServerEventResponseContentPartDone: Decoder[RealtimeServerEventResponseContentPartDone] = deriveDecoder[RealtimeServerEventResponseContentPartDone]
}

/**
* The content part that is done.
* @param `type` The content type (\"text\", \"audio\").
* @param text The text content (if type is \"text\").
* @param audio Base64-encoded audio data (if type is \"audio\").
* @param transcript The transcript of the audio (if type is \"audio\").
*/

case class RealtimeServerEventResponseContentPartDonePart(
  `type`: Option[String],
  text: Option[String],
  audio: Option[String],
  transcript: Option[String]
)
object RealtimeServerEventResponseContentPartDonePart {
  implicit val encoderRealtimeServerEventResponseContentPartDonePart: Encoder[RealtimeServerEventResponseContentPartDonePart] = deriveEncoder[RealtimeServerEventResponseContentPartDonePart].mapJson(_.dropNullValues)
  implicit val decoderRealtimeServerEventResponseContentPartDonePart: Decoder[RealtimeServerEventResponseContentPartDonePart] = deriveDecoder[RealtimeServerEventResponseContentPartDonePart]
}

/**
* Returned when a new Response is created. The first event of response creation, where the response is in an initial state of `in_progress`. 
* @param eventUnderscoreid The unique ID of the server event.
* @param `type` The event type, must be `response.created`.
* @param response 
*/

case class RealtimeServerEventResponseCreated(
  eventUnderscoreid: String,
  `type`: String,
  response: RealtimeResponse
)
object RealtimeServerEventResponseCreated {
  implicit val encoderRealtimeServerEventResponseCreated: Encoder[RealtimeServerEventResponseCreated] = deriveEncoder[RealtimeServerEventResponseCreated].mapJson(_.dropNullValues)
  implicit val decoderRealtimeServerEventResponseCreated: Decoder[RealtimeServerEventResponseCreated] = deriveDecoder[RealtimeServerEventResponseCreated]
}

/**
* Returned when a Response is done streaming. Always emitted, no matter the  final state. The Response object included in the `response.done` event will  include all output Items in the Response but will omit the raw audio data. 
* @param eventUnderscoreid The unique ID of the server event.
* @param `type` The event type, must be `response.done`.
* @param response 
*/

case class RealtimeServerEventResponseDone(
  eventUnderscoreid: String,
  `type`: String,
  response: RealtimeResponse
)
object RealtimeServerEventResponseDone {
  implicit val encoderRealtimeServerEventResponseDone: Encoder[RealtimeServerEventResponseDone] = deriveEncoder[RealtimeServerEventResponseDone].mapJson(_.dropNullValues)
  implicit val decoderRealtimeServerEventResponseDone: Decoder[RealtimeServerEventResponseDone] = deriveDecoder[RealtimeServerEventResponseDone]
}

/**
* Returned when the model-generated function call arguments are updated. 
* @param eventUnderscoreid The unique ID of the server event.
* @param `type` The event type, must be `response.function_call_arguments.delta`. 
* @param responseUnderscoreid The ID of the response.
* @param itemUnderscoreid The ID of the function call item.
* @param outputUnderscoreindex The index of the output item in the response.
* @param callUnderscoreid The ID of the function call.
* @param delta The arguments delta as a JSON string.
*/

case class RealtimeServerEventResponseFunctionCallArgumentsDelta(
  eventUnderscoreid: String,
  `type`: String,
  responseUnderscoreid: String,
  itemUnderscoreid: String,
  outputUnderscoreindex: Int,
  callUnderscoreid: String,
  delta: String
)
object RealtimeServerEventResponseFunctionCallArgumentsDelta {
  implicit val encoderRealtimeServerEventResponseFunctionCallArgumentsDelta: Encoder[RealtimeServerEventResponseFunctionCallArgumentsDelta] = deriveEncoder[RealtimeServerEventResponseFunctionCallArgumentsDelta].mapJson(_.dropNullValues)
  implicit val decoderRealtimeServerEventResponseFunctionCallArgumentsDelta: Decoder[RealtimeServerEventResponseFunctionCallArgumentsDelta] = deriveDecoder[RealtimeServerEventResponseFunctionCallArgumentsDelta]
}

/**
* Returned when the model-generated function call arguments are done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. 
* @param eventUnderscoreid The unique ID of the server event.
* @param `type` The event type, must be `response.function_call_arguments.done`. 
* @param responseUnderscoreid The ID of the response.
* @param itemUnderscoreid The ID of the function call item.
* @param outputUnderscoreindex The index of the output item in the response.
* @param callUnderscoreid The ID of the function call.
* @param arguments The final arguments as a JSON string.
*/

case class RealtimeServerEventResponseFunctionCallArgumentsDone(
  eventUnderscoreid: String,
  `type`: String,
  responseUnderscoreid: String,
  itemUnderscoreid: String,
  outputUnderscoreindex: Int,
  callUnderscoreid: String,
  arguments: String
)
object RealtimeServerEventResponseFunctionCallArgumentsDone {
  implicit val encoderRealtimeServerEventResponseFunctionCallArgumentsDone: Encoder[RealtimeServerEventResponseFunctionCallArgumentsDone] = deriveEncoder[RealtimeServerEventResponseFunctionCallArgumentsDone].mapJson(_.dropNullValues)
  implicit val decoderRealtimeServerEventResponseFunctionCallArgumentsDone: Decoder[RealtimeServerEventResponseFunctionCallArgumentsDone] = deriveDecoder[RealtimeServerEventResponseFunctionCallArgumentsDone]
}

/**
* Returned when a new Item is created during Response generation.
* @param eventUnderscoreid The unique ID of the server event.
* @param `type` The event type, must be `response.output_item.added`.
* @param responseUnderscoreid The ID of the Response to which the item belongs.
* @param outputUnderscoreindex The index of the output item in the Response.
* @param item 
*/

case class RealtimeServerEventResponseOutputItemAdded(
  eventUnderscoreid: String,
  `type`: String,
  responseUnderscoreid: String,
  outputUnderscoreindex: Int,
  item: RealtimeConversationItem
)
object RealtimeServerEventResponseOutputItemAdded {
  implicit val encoderRealtimeServerEventResponseOutputItemAdded: Encoder[RealtimeServerEventResponseOutputItemAdded] = deriveEncoder[RealtimeServerEventResponseOutputItemAdded].mapJson(_.dropNullValues)
  implicit val decoderRealtimeServerEventResponseOutputItemAdded: Decoder[RealtimeServerEventResponseOutputItemAdded] = deriveDecoder[RealtimeServerEventResponseOutputItemAdded]
}

/**
* Returned when an Item is done streaming. Also emitted when a Response is  interrupted, incomplete, or cancelled. 
* @param eventUnderscoreid The unique ID of the server event.
* @param `type` The event type, must be `response.output_item.done`.
* @param responseUnderscoreid The ID of the Response to which the item belongs.
* @param outputUnderscoreindex The index of the output item in the Response.
* @param item 
*/

case class RealtimeServerEventResponseOutputItemDone(
  eventUnderscoreid: String,
  `type`: String,
  responseUnderscoreid: String,
  outputUnderscoreindex: Int,
  item: RealtimeConversationItem
)
object RealtimeServerEventResponseOutputItemDone {
  implicit val encoderRealtimeServerEventResponseOutputItemDone: Encoder[RealtimeServerEventResponseOutputItemDone] = deriveEncoder[RealtimeServerEventResponseOutputItemDone].mapJson(_.dropNullValues)
  implicit val decoderRealtimeServerEventResponseOutputItemDone: Decoder[RealtimeServerEventResponseOutputItemDone] = deriveDecoder[RealtimeServerEventResponseOutputItemDone]
}

/**
* Returned when the text value of a \"text\" content part is updated.
* @param eventUnderscoreid The unique ID of the server event.
* @param `type` The event type, must be `response.text.delta`.
* @param responseUnderscoreid The ID of the response.
* @param itemUnderscoreid The ID of the item.
* @param outputUnderscoreindex The index of the output item in the response.
* @param contentUnderscoreindex The index of the content part in the item's content array.
* @param delta The text delta.
*/

case class RealtimeServerEventResponseTextDelta(
  eventUnderscoreid: String,
  `type`: String,
  responseUnderscoreid: String,
  itemUnderscoreid: String,
  outputUnderscoreindex: Int,
  contentUnderscoreindex: Int,
  delta: String
)
object RealtimeServerEventResponseTextDelta {
  implicit val encoderRealtimeServerEventResponseTextDelta: Encoder[RealtimeServerEventResponseTextDelta] = deriveEncoder[RealtimeServerEventResponseTextDelta].mapJson(_.dropNullValues)
  implicit val decoderRealtimeServerEventResponseTextDelta: Decoder[RealtimeServerEventResponseTextDelta] = deriveDecoder[RealtimeServerEventResponseTextDelta]
}

/**
* Returned when the text value of a \"text\" content part is done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. 
* @param eventUnderscoreid The unique ID of the server event.
* @param `type` The event type, must be `response.text.done`.
* @param responseUnderscoreid The ID of the response.
* @param itemUnderscoreid The ID of the item.
* @param outputUnderscoreindex The index of the output item in the response.
* @param contentUnderscoreindex The index of the content part in the item's content array.
* @param text The final text content.
*/

case class RealtimeServerEventResponseTextDone(
  eventUnderscoreid: String,
  `type`: String,
  responseUnderscoreid: String,
  itemUnderscoreid: String,
  outputUnderscoreindex: Int,
  contentUnderscoreindex: Int,
  text: String
)
object RealtimeServerEventResponseTextDone {
  implicit val encoderRealtimeServerEventResponseTextDone: Encoder[RealtimeServerEventResponseTextDone] = deriveEncoder[RealtimeServerEventResponseTextDone].mapJson(_.dropNullValues)
  implicit val decoderRealtimeServerEventResponseTextDone: Decoder[RealtimeServerEventResponseTextDone] = deriveDecoder[RealtimeServerEventResponseTextDone]
}

/**
* Returned when a Session is created. Emitted automatically when a new  connection is established as the first server event. This event will contain  the default Session configuration. 
* @param eventUnderscoreid The unique ID of the server event.
* @param `type` The event type, must be `session.created`.
* @param session 
*/

case class RealtimeServerEventSessionCreated(
  eventUnderscoreid: String,
  `type`: String,
  session: RealtimeSession
)
object RealtimeServerEventSessionCreated {
  implicit val encoderRealtimeServerEventSessionCreated: Encoder[RealtimeServerEventSessionCreated] = deriveEncoder[RealtimeServerEventSessionCreated].mapJson(_.dropNullValues)
  implicit val decoderRealtimeServerEventSessionCreated: Decoder[RealtimeServerEventSessionCreated] = deriveDecoder[RealtimeServerEventSessionCreated]
}

/**
* Returned when a session is updated with a `session.update` event, unless  there is an error. 
* @param eventUnderscoreid The unique ID of the server event.
* @param `type` The event type, must be `session.updated`.
* @param session 
*/

case class RealtimeServerEventSessionUpdated(
  eventUnderscoreid: String,
  `type`: String,
  session: RealtimeSession
)
object RealtimeServerEventSessionUpdated {
  implicit val encoderRealtimeServerEventSessionUpdated: Encoder[RealtimeServerEventSessionUpdated] = deriveEncoder[RealtimeServerEventSessionUpdated].mapJson(_.dropNullValues)
  implicit val decoderRealtimeServerEventSessionUpdated: Decoder[RealtimeServerEventSessionUpdated] = deriveDecoder[RealtimeServerEventSessionUpdated]
}

/**
* Realtime session object configuration.
* @param id Unique identifier for the session object. 
* @param modalities The set of modalities the model can respond with. To disable audio, set this to [\"text\"]. 
* @param model 
* @param instructions The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \"be extremely succinct\", \"act friendly\", \"here are examples of good  responses\") and on audio behavior (e.g. \"talk quickly\", \"inject emotion  into your voice\", \"laugh frequently\"). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the `session.created` event at the  start of the session. 
* @param voice The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
* @param inputUnderscoreaudioUnderscoreformat The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
* @param outputUnderscoreaudioUnderscoreformat The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
* @param inputUnderscoreaudioUnderscoretranscription 
* @param turnUnderscoredetection 
* @param tools Tools (functions) available to the model.
* @param toolUnderscorechoice How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function. 
* @param temperature Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8. 
* @param maxUnderscoreresponseUnderscoreoutputUnderscoretokens 
*/

case class RealtimeSession(
  id: Option[String],
  modalities: Option[List[String]],
  model: Option[RealtimeSessionModel],
  instructions: Option[String],
  voice: Option[String],
  inputUnderscoreaudioUnderscoreformat: Option[String],
  outputUnderscoreaudioUnderscoreformat: Option[String],
  inputUnderscoreaudioUnderscoretranscription: Option[RealtimeSessionInputAudioTranscription],
  turnUnderscoredetection: Option[RealtimeSessionTurnDetection],
  tools: Option[List[RealtimeSessionToolsInner]],
  toolUnderscorechoice: Option[String],
  temperature: Option[BigDecimal],
  maxUnderscoreresponseUnderscoreoutputUnderscoretokens: Option[RealtimeSessionMaxResponseOutputTokens]
)
object RealtimeSession {
  implicit val encoderRealtimeSession: Encoder[RealtimeSession] = deriveEncoder[RealtimeSession].mapJson(_.dropNullValues)
  implicit val decoderRealtimeSession: Decoder[RealtimeSession] = deriveDecoder[RealtimeSession]
}

/**
* Realtime session object configuration.
* @param modalities The set of modalities the model can respond with. To disable audio, set this to [\"text\"]. 
* @param model The Realtime model used for this session. 
* @param instructions The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \"be extremely succinct\", \"act friendly\", \"here are examples of good  responses\") and on audio behavior (e.g. \"talk quickly\", \"inject emotion  into your voice\", \"laugh frequently\"). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the `session.created` event at the  start of the session. 
* @param voice The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
* @param inputUnderscoreaudioUnderscoreformat The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
* @param outputUnderscoreaudioUnderscoreformat The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
* @param inputUnderscoreaudioUnderscoretranscription 
* @param turnUnderscoredetection 
* @param tools Tools (functions) available to the model.
* @param toolUnderscorechoice How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function. 
* @param temperature Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8. 
* @param maxUnderscoreresponseUnderscoreoutputUnderscoretokens 
*/

case class RealtimeSessionCreateRequest(
  modalities: Option[List[String]],
  model: String,
  instructions: Option[String],
  voice: Option[String],
  inputUnderscoreaudioUnderscoreformat: Option[String],
  outputUnderscoreaudioUnderscoreformat: Option[String],
  inputUnderscoreaudioUnderscoretranscription: Option[RealtimeSessionCreateRequestInputAudioTranscription],
  turnUnderscoredetection: Option[RealtimeSessionCreateRequestTurnDetection],
  tools: Option[List[RealtimeSessionCreateRequestToolsInner]],
  toolUnderscorechoice: Option[String],
  temperature: Option[BigDecimal],
  maxUnderscoreresponseUnderscoreoutputUnderscoretokens: Option[RealtimeSessionCreateRequestMaxResponseOutputTokens]
)
object RealtimeSessionCreateRequest {
  implicit val encoderRealtimeSessionCreateRequest: Encoder[RealtimeSessionCreateRequest] = deriveEncoder[RealtimeSessionCreateRequest].mapJson(_.dropNullValues)
  implicit val decoderRealtimeSessionCreateRequest: Decoder[RealtimeSessionCreateRequest] = deriveDecoder[RealtimeSessionCreateRequest]
}

/**
* Configuration for input audio transcription, defaults to off and can be  set to `null` to turn off once on. Input audio transcription is not native  to the model, since the model consumes audio directly. Transcription runs  asynchronously through Whisper and should be treated as rough guidance  rather than the representation understood by the model. 
* @param model The model to use for transcription, `whisper-1` is the only currently  supported model. 
*/

case class RealtimeSessionCreateRequestInputAudioTranscription(
  model: Option[String]
)
object RealtimeSessionCreateRequestInputAudioTranscription {
  implicit val encoderRealtimeSessionCreateRequestInputAudioTranscription: Encoder[RealtimeSessionCreateRequestInputAudioTranscription] = deriveEncoder[RealtimeSessionCreateRequestInputAudioTranscription].mapJson(_.dropNullValues)
  implicit val decoderRealtimeSessionCreateRequestInputAudioTranscription: Decoder[RealtimeSessionCreateRequestInputAudioTranscription] = deriveDecoder[RealtimeSessionCreateRequestInputAudioTranscription]
}

/**
* Maximum number of output tokens for a single assistant response, inclusive of tool calls. Provide an integer between 1 and 4096 to limit output tokens, or `inf` for the maximum available tokens for a given model. Defaults to `inf`. 
*/
sealed trait RealtimeSessionCreateRequestMaxResponseOutputTokens
object RealtimeSessionCreateRequestMaxResponseOutputTokens {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val realtimeSessionCreateRequestMaxResponseOutputTokensEncoder: Encoder[RealtimeSessionCreateRequestMaxResponseOutputTokens] = Encoder.instance {
    case `int`: Int => `int`.asJson
    case string: String => string.asJson
  }

  implicit val realtimeSessionCreateRequestMaxResponseOutputTokensDecoder: Decoder[RealtimeSessionCreateRequestMaxResponseOutputTokens] =
    List[Decoder[RealtimeSessionCreateRequestMaxResponseOutputTokens]](
      Decoder[Int].widen,
      Decoder[String].widen,
  ).reduceLeft(_ or _)
}


/**
* 
* @param `type` The type of the tool, i.e. `function`.
* @param name The name of the function.
* @param description The description of the function, including guidance on when and how  to call it, and guidance about what to tell the user when calling  (if anything). 
* @param parameters Parameters of the function in JSON Schema.
*/

case class RealtimeSessionCreateRequestToolsInner(
  `type`: Option[String],
  name: Option[String],
  description: Option[String],
  parameters: Option[Object]
)
object RealtimeSessionCreateRequestToolsInner {
  implicit val encoderRealtimeSessionCreateRequestToolsInner: Encoder[RealtimeSessionCreateRequestToolsInner] = deriveEncoder[RealtimeSessionCreateRequestToolsInner].mapJson(_.dropNullValues)
  implicit val decoderRealtimeSessionCreateRequestToolsInner: Decoder[RealtimeSessionCreateRequestToolsInner] = deriveDecoder[RealtimeSessionCreateRequestToolsInner]
}

/**
* Configuration for turn detection. Can be set to `null` to turn off. Server  VAD means that the model will detect the start and end of speech based on  audio volume and respond at the end of user speech. 
* @param `type` Type of turn detection, only `server_vad` is currently supported. 
* @param threshold Activation threshold for VAD (0.0 to 1.0), this defaults to 0.5. A  higher threshold will require louder audio to activate the model, and  thus might perform better in noisy environments. 
* @param prefixUnderscorepaddingUnderscorems Amount of audio to include before the VAD detected speech (in  milliseconds). Defaults to 300ms. 
* @param silenceUnderscoredurationUnderscorems Duration of silence to detect speech stop (in milliseconds). Defaults  to 500ms. With shorter values the model will respond more quickly,  but may jump in on short pauses from the user. 
* @param createUnderscoreresponse Whether or not to automatically generate a response when VAD is enabled. `true` by default. 
*/

case class RealtimeSessionCreateRequestTurnDetection(
  `type`: Option[String],
  threshold: Option[BigDecimal],
  prefixUnderscorepaddingUnderscorems: Option[Int],
  silenceUnderscoredurationUnderscorems: Option[Int],
  createUnderscoreresponse: Option[Boolean]
)
object RealtimeSessionCreateRequestTurnDetection {
  implicit val encoderRealtimeSessionCreateRequestTurnDetection: Encoder[RealtimeSessionCreateRequestTurnDetection] = deriveEncoder[RealtimeSessionCreateRequestTurnDetection].mapJson(_.dropNullValues)
  implicit val decoderRealtimeSessionCreateRequestTurnDetection: Decoder[RealtimeSessionCreateRequestTurnDetection] = deriveDecoder[RealtimeSessionCreateRequestTurnDetection]
}

/**
* A new Realtime session configuration, with an ephermeral key. Default TTL for keys is one minute. 
* @param clientUnderscoresecret 
* @param modalities The set of modalities the model can respond with. To disable audio, set this to [\"text\"]. 
* @param instructions The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \"be extremely succinct\", \"act friendly\", \"here are examples of good  responses\") and on audio behavior (e.g. \"talk quickly\", \"inject emotion  into your voice\", \"laugh frequently\"). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the `session.created` event at the  start of the session. 
* @param voice The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
* @param inputUnderscoreaudioUnderscoreformat The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
* @param outputUnderscoreaudioUnderscoreformat The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
* @param inputUnderscoreaudioUnderscoretranscription 
* @param turnUnderscoredetection 
* @param tools Tools (functions) available to the model.
* @param toolUnderscorechoice How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function. 
* @param temperature Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8. 
* @param maxUnderscoreresponseUnderscoreoutputUnderscoretokens 
*/

case class RealtimeSessionCreateResponse(
  clientUnderscoresecret: Option[RealtimeSessionCreateResponseClientSecret],
  modalities: Option[List[String]],
  instructions: Option[String],
  voice: Option[String],
  inputUnderscoreaudioUnderscoreformat: Option[String],
  outputUnderscoreaudioUnderscoreformat: Option[String],
  inputUnderscoreaudioUnderscoretranscription: Option[RealtimeSessionCreateResponseInputAudioTranscription],
  turnUnderscoredetection: Option[RealtimeSessionCreateResponseTurnDetection],
  tools: Option[List[RealtimeSessionCreateResponseToolsInner]],
  toolUnderscorechoice: Option[String],
  temperature: Option[BigDecimal],
  maxUnderscoreresponseUnderscoreoutputUnderscoretokens: Option[RealtimeSessionCreateResponseMaxResponseOutputTokens]
)
object RealtimeSessionCreateResponse {
  implicit val encoderRealtimeSessionCreateResponse: Encoder[RealtimeSessionCreateResponse] = deriveEncoder[RealtimeSessionCreateResponse].mapJson(_.dropNullValues)
  implicit val decoderRealtimeSessionCreateResponse: Decoder[RealtimeSessionCreateResponse] = deriveDecoder[RealtimeSessionCreateResponse]
}

/**
* Ephemeral key returned by the API.
* @param value Ephemeral key usable in client environments to authenticate connections to the Realtime API. Use this in client-side environments rather than a standard API token, which should only be used server-side. 
* @param expiresUnderscoreat Timestamp for when the token expires. Currently, all tokens expire after one minute. 
*/

case class RealtimeSessionCreateResponseClientSecret(
  value: Option[String],
  expiresUnderscoreat: Option[Int]
)
object RealtimeSessionCreateResponseClientSecret {
  implicit val encoderRealtimeSessionCreateResponseClientSecret: Encoder[RealtimeSessionCreateResponseClientSecret] = deriveEncoder[RealtimeSessionCreateResponseClientSecret].mapJson(_.dropNullValues)
  implicit val decoderRealtimeSessionCreateResponseClientSecret: Decoder[RealtimeSessionCreateResponseClientSecret] = deriveDecoder[RealtimeSessionCreateResponseClientSecret]
}

/**
* Configuration for input audio transcription, defaults to off and can be  set to `null` to turn off once on. Input audio transcription is not native  to the model, since the model consumes audio directly. Transcription runs  asynchronously through Whisper and should be treated as rough guidance  rather than the representation understood by the model. 
* @param model The model to use for transcription, `whisper-1` is the only currently  supported model. 
*/

case class RealtimeSessionCreateResponseInputAudioTranscription(
  model: Option[String]
)
object RealtimeSessionCreateResponseInputAudioTranscription {
  implicit val encoderRealtimeSessionCreateResponseInputAudioTranscription: Encoder[RealtimeSessionCreateResponseInputAudioTranscription] = deriveEncoder[RealtimeSessionCreateResponseInputAudioTranscription].mapJson(_.dropNullValues)
  implicit val decoderRealtimeSessionCreateResponseInputAudioTranscription: Decoder[RealtimeSessionCreateResponseInputAudioTranscription] = deriveDecoder[RealtimeSessionCreateResponseInputAudioTranscription]
}

/**
* Maximum number of output tokens for a single assistant response, inclusive of tool calls. Provide an integer between 1 and 4096 to limit output tokens, or `inf` for the maximum available tokens for a given model. Defaults to `inf`. 
*/
sealed trait RealtimeSessionCreateResponseMaxResponseOutputTokens
object RealtimeSessionCreateResponseMaxResponseOutputTokens {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val realtimeSessionCreateResponseMaxResponseOutputTokensEncoder: Encoder[RealtimeSessionCreateResponseMaxResponseOutputTokens] = Encoder.instance {
    case `int`: Int => `int`.asJson
    case string: String => string.asJson
  }

  implicit val realtimeSessionCreateResponseMaxResponseOutputTokensDecoder: Decoder[RealtimeSessionCreateResponseMaxResponseOutputTokens] =
    List[Decoder[RealtimeSessionCreateResponseMaxResponseOutputTokens]](
      Decoder[Int].widen,
      Decoder[String].widen,
  ).reduceLeft(_ or _)
}


/**
* 
* @param `type` The type of the tool, i.e. `function`.
* @param name The name of the function.
* @param description The description of the function, including guidance on when and how  to call it, and guidance about what to tell the user when calling  (if anything). 
* @param parameters Parameters of the function in JSON Schema.
*/

case class RealtimeSessionCreateResponseToolsInner(
  `type`: Option[String],
  name: Option[String],
  description: Option[String],
  parameters: Option[Object]
)
object RealtimeSessionCreateResponseToolsInner {
  implicit val encoderRealtimeSessionCreateResponseToolsInner: Encoder[RealtimeSessionCreateResponseToolsInner] = deriveEncoder[RealtimeSessionCreateResponseToolsInner].mapJson(_.dropNullValues)
  implicit val decoderRealtimeSessionCreateResponseToolsInner: Decoder[RealtimeSessionCreateResponseToolsInner] = deriveDecoder[RealtimeSessionCreateResponseToolsInner]
}

/**
* Configuration for turn detection. Can be set to `null` to turn off. Server  VAD means that the model will detect the start and end of speech based on  audio volume and respond at the end of user speech. 
* @param `type` Type of turn detection, only `server_vad` is currently supported. 
* @param threshold Activation threshold for VAD (0.0 to 1.0), this defaults to 0.5. A  higher threshold will require louder audio to activate the model, and  thus might perform better in noisy environments. 
* @param prefixUnderscorepaddingUnderscorems Amount of audio to include before the VAD detected speech (in  milliseconds). Defaults to 300ms. 
* @param silenceUnderscoredurationUnderscorems Duration of silence to detect speech stop (in milliseconds). Defaults  to 500ms. With shorter values the model will respond more quickly,  but may jump in on short pauses from the user. 
*/

case class RealtimeSessionCreateResponseTurnDetection(
  `type`: Option[String],
  threshold: Option[BigDecimal],
  prefixUnderscorepaddingUnderscorems: Option[Int],
  silenceUnderscoredurationUnderscorems: Option[Int]
)
object RealtimeSessionCreateResponseTurnDetection {
  implicit val encoderRealtimeSessionCreateResponseTurnDetection: Encoder[RealtimeSessionCreateResponseTurnDetection] = deriveEncoder[RealtimeSessionCreateResponseTurnDetection].mapJson(_.dropNullValues)
  implicit val decoderRealtimeSessionCreateResponseTurnDetection: Decoder[RealtimeSessionCreateResponseTurnDetection] = deriveDecoder[RealtimeSessionCreateResponseTurnDetection]
}

/**
* Configuration for input audio transcription, defaults to off and can be  set to `null` to turn off once on. Input audio transcription is not native  to the model, since the model consumes audio directly. Transcription runs  asynchronously through Whisper and should be treated as rough guidance  rather than the representation understood by the model. 
* @param model The model to use for transcription, `whisper-1` is the only currently  supported model. 
*/

case class RealtimeSessionInputAudioTranscription(
  model: Option[String]
)
object RealtimeSessionInputAudioTranscription {
  implicit val encoderRealtimeSessionInputAudioTranscription: Encoder[RealtimeSessionInputAudioTranscription] = deriveEncoder[RealtimeSessionInputAudioTranscription].mapJson(_.dropNullValues)
  implicit val decoderRealtimeSessionInputAudioTranscription: Decoder[RealtimeSessionInputAudioTranscription] = deriveDecoder[RealtimeSessionInputAudioTranscription]
}

/**
* Maximum number of output tokens for a single assistant response, inclusive of tool calls. Provide an integer between 1 and 4096 to limit output tokens, or `inf` for the maximum available tokens for a given model. Defaults to `inf`. 
*/
sealed trait RealtimeSessionMaxResponseOutputTokens
object RealtimeSessionMaxResponseOutputTokens {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val realtimeSessionMaxResponseOutputTokensEncoder: Encoder[RealtimeSessionMaxResponseOutputTokens] = Encoder.instance {
    case `int`: Int => `int`.asJson
    case string: String => string.asJson
  }

  implicit val realtimeSessionMaxResponseOutputTokensDecoder: Decoder[RealtimeSessionMaxResponseOutputTokens] =
    List[Decoder[RealtimeSessionMaxResponseOutputTokens]](
      Decoder[Int].widen,
      Decoder[String].widen,
  ).reduceLeft(_ or _)
}


/**
* The Realtime model used for this session. 
*/

case class RealtimeSessionModel(
)
object RealtimeSessionModel {
  implicit val encoderRealtimeSessionModel: Encoder[RealtimeSessionModel] = deriveEncoder[RealtimeSessionModel].mapJson(_.dropNullValues)
  implicit val decoderRealtimeSessionModel: Decoder[RealtimeSessionModel] = deriveDecoder[RealtimeSessionModel]
}

/**
* 
* @param `type` The type of the tool, i.e. `function`.
* @param name The name of the function.
* @param description The description of the function, including guidance on when and how  to call it, and guidance about what to tell the user when calling  (if anything). 
* @param parameters Parameters of the function in JSON Schema.
*/

case class RealtimeSessionToolsInner(
  `type`: Option[String],
  name: Option[String],
  description: Option[String],
  parameters: Option[Object]
)
object RealtimeSessionToolsInner {
  implicit val encoderRealtimeSessionToolsInner: Encoder[RealtimeSessionToolsInner] = deriveEncoder[RealtimeSessionToolsInner].mapJson(_.dropNullValues)
  implicit val decoderRealtimeSessionToolsInner: Decoder[RealtimeSessionToolsInner] = deriveDecoder[RealtimeSessionToolsInner]
}

/**
* Configuration for turn detection. Can be set to `null` to turn off. Server  VAD means that the model will detect the start and end of speech based on  audio volume and respond at the end of user speech. 
* @param `type` Type of turn detection, only `server_vad` is currently supported. 
* @param threshold Activation threshold for VAD (0.0 to 1.0), this defaults to 0.5. A  higher threshold will require louder audio to activate the model, and  thus might perform better in noisy environments. 
* @param prefixUnderscorepaddingUnderscorems Amount of audio to include before the VAD detected speech (in  milliseconds). Defaults to 300ms. 
* @param silenceUnderscoredurationUnderscorems Duration of silence to detect speech stop (in milliseconds). Defaults  to 500ms. With shorter values the model will respond more quickly,  but may jump in on short pauses from the user. 
*/

case class RealtimeSessionTurnDetection(
  `type`: Option[String],
  threshold: Option[BigDecimal],
  prefixUnderscorepaddingUnderscorems: Option[Int],
  silenceUnderscoredurationUnderscorems: Option[Int]
)
object RealtimeSessionTurnDetection {
  implicit val encoderRealtimeSessionTurnDetection: Encoder[RealtimeSessionTurnDetection] = deriveEncoder[RealtimeSessionTurnDetection].mapJson(_.dropNullValues)
  implicit val decoderRealtimeSessionTurnDetection: Decoder[RealtimeSessionTurnDetection] = deriveDecoder[RealtimeSessionTurnDetection]
}

/**
* 
* @param `type` The type of response format being defined: `json_object`
*/

case class ResponseFormatJsonObject(
  `type`: String
) extends AssistantsApiResponseFormatOption with CreateChatCompletionRequestResponseFormat
object ResponseFormatJsonObject {
  implicit val encoderResponseFormatJsonObject: Encoder[ResponseFormatJsonObject] = deriveEncoder[ResponseFormatJsonObject].mapJson(_.dropNullValues)
  implicit val decoderResponseFormatJsonObject: Decoder[ResponseFormatJsonObject] = deriveDecoder[ResponseFormatJsonObject]
}

/**
* 
* @param `type` The type of response format being defined: `json_schema`
* @param jsonUnderscoreschema 
*/

case class ResponseFormatJsonSchema(
  `type`: String,
  jsonUnderscoreschema: ResponseFormatJsonSchemaJsonSchema
) extends AssistantsApiResponseFormatOption with CreateChatCompletionRequestResponseFormat
object ResponseFormatJsonSchema {
  implicit val encoderResponseFormatJsonSchema: Encoder[ResponseFormatJsonSchema] = deriveEncoder[ResponseFormatJsonSchema].mapJson(_.dropNullValues)
  implicit val decoderResponseFormatJsonSchema: Decoder[ResponseFormatJsonSchema] = deriveDecoder[ResponseFormatJsonSchema]
}

/**
* 
* @param description A description of what the response format is for, used by the model to determine how to respond in the format.
* @param name The name of the response format. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.
* @param schema The schema for the response format, described as a JSON Schema object.
* @param strict Whether to enable strict schema adherence when generating the output. If set to true, the model will always follow the exact schema defined in the `schema` field. Only a subset of JSON Schema is supported when `strict` is `true`. To learn more, read the [Structured Outputs guide](/docs/guides/structured-outputs).
*/

case class ResponseFormatJsonSchemaJsonSchema(
  description: Option[String],
  name: String,
  schema: Option[Map[String, AnyType]],
  strict: Option[Boolean]
)
object ResponseFormatJsonSchemaJsonSchema {
  implicit val encoderResponseFormatJsonSchemaJsonSchema: Encoder[ResponseFormatJsonSchemaJsonSchema] = deriveEncoder[ResponseFormatJsonSchemaJsonSchema].mapJson(_.dropNullValues)
  implicit val decoderResponseFormatJsonSchemaJsonSchema: Decoder[ResponseFormatJsonSchemaJsonSchema] = deriveDecoder[ResponseFormatJsonSchemaJsonSchema]
}

/**
* 
* @param `type` The type of response format being defined: `text`
*/

case class ResponseFormatText(
  `type`: String
) extends AssistantsApiResponseFormatOption with CreateChatCompletionRequestResponseFormat
object ResponseFormatText {
  implicit val encoderResponseFormatText: Encoder[ResponseFormatText] = deriveEncoder[ResponseFormatText].mapJson(_.dropNullValues)
  implicit val decoderResponseFormatText: Decoder[ResponseFormatText] = deriveDecoder[ResponseFormatText]
}

/**
* Usage statistics related to the run. This value will be `null` if the run is not in a terminal state (i.e. `in_progress`, `queued`, etc.).
* @param completionUnderscoretokens Number of completion tokens used over the course of the run.
* @param promptUnderscoretokens Number of prompt tokens used over the course of the run.
* @param totalUnderscoretokens Total number of tokens used (prompt + completion).
*/

case class RunCompletionUsage(
  completionUnderscoretokens: Int,
  promptUnderscoretokens: Int,
  totalUnderscoretokens: Int
)
object RunCompletionUsage {
  implicit val encoderRunCompletionUsage: Encoder[RunCompletionUsage] = deriveEncoder[RunCompletionUsage].mapJson(_.dropNullValues)
  implicit val decoderRunCompletionUsage: Decoder[RunCompletionUsage] = deriveDecoder[RunCompletionUsage]
}

/**
* Represents an execution run on a [thread](/docs/api-reference/threads).
* @param id The identifier, which can be referenced in API endpoints.
* @param `object` The object type, which is always `thread.run`.
* @param createdUnderscoreat The Unix timestamp (in seconds) for when the run was created.
* @param threadUnderscoreid The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run.
* @param assistantUnderscoreid The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run.
* @param status The status of the run, which can be either `queued`, `in_progress`, `requires_action`, `cancelling`, `cancelled`, `failed`, `completed`, `incomplete`, or `expired`.
* @param requiredUnderscoreaction 
* @param lastUnderscoreerror 
* @param expiresUnderscoreat The Unix timestamp (in seconds) for when the run will expire.
* @param startedUnderscoreat The Unix timestamp (in seconds) for when the run was started.
* @param cancelledUnderscoreat The Unix timestamp (in seconds) for when the run was cancelled.
* @param failedUnderscoreat The Unix timestamp (in seconds) for when the run failed.
* @param completedUnderscoreat The Unix timestamp (in seconds) for when the run was completed.
* @param incompleteUnderscoredetails 
* @param model The model that the [assistant](/docs/api-reference/assistants) used for this run.
* @param instructions The instructions that the [assistant](/docs/api-reference/assistants) used for this run.
* @param tools The list of tools that the [assistant](/docs/api-reference/assistants) used for this run.
* @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
* @param usage 
* @param temperature The sampling temperature used for this run. If not set, defaults to 1.
* @param topUnderscorep The nucleus sampling value used for this run. If not set, defaults to 1.
* @param maxUnderscorepromptUnderscoretokens The maximum number of prompt tokens specified to have been used over the course of the run. 
* @param maxUnderscorecompletionUnderscoretokens The maximum number of completion tokens specified to have been used over the course of the run. 
* @param truncationUnderscorestrategy 
* @param toolUnderscorechoice 
* @param parallelUnderscoretoolUnderscorecalls Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
* @param responseUnderscoreformat 
*/

case class RunObject(
  id: String,
  `object`: String,
  createdUnderscoreat: Int,
  threadUnderscoreid: String,
  assistantUnderscoreid: String,
  status: String,
  requiredUnderscoreaction: RunObjectRequiredAction,
  lastUnderscoreerror: RunObjectLastError,
  expiresUnderscoreat: Int,
  startedUnderscoreat: Int,
  cancelledUnderscoreat: Int,
  failedUnderscoreat: Int,
  completedUnderscoreat: Int,
  incompleteUnderscoredetails: RunObjectIncompleteDetails,
  model: String,
  instructions: String,
  tools: Refined[List[RunObjectToolsInner], MaxSize[20]],
  metadata: Object,
  usage: RunCompletionUsage,
  temperature: Option[BigDecimal],
  topUnderscorep: Option[BigDecimal],
  maxUnderscorepromptUnderscoretokens: Refined[Int, GreaterEqual[256]],
  maxUnderscorecompletionUnderscoretokens: Refined[Int, GreaterEqual[256]],
  truncationUnderscorestrategy: TruncationObject,
  toolUnderscorechoice: AssistantsApiToolChoiceOption,
  parallelUnderscoretoolUnderscorecalls: Boolean,
  responseUnderscoreformat: AssistantsApiResponseFormatOption
)
object RunObject {
  implicit val encoderRunObject: Encoder[RunObject] = deriveEncoder[RunObject].mapJson(_.dropNullValues)
  implicit val decoderRunObject: Decoder[RunObject] = deriveDecoder[RunObject]
}

/**
* Details on why the run is incomplete. Will be `null` if the run is not incomplete.
* @param reason The reason why the run is incomplete. This will point to which specific token limit was reached over the course of the run.
*/

case class RunObjectIncompleteDetails(
  reason: Option[String]
)
object RunObjectIncompleteDetails {
  implicit val encoderRunObjectIncompleteDetails: Encoder[RunObjectIncompleteDetails] = deriveEncoder[RunObjectIncompleteDetails].mapJson(_.dropNullValues)
  implicit val decoderRunObjectIncompleteDetails: Decoder[RunObjectIncompleteDetails] = deriveDecoder[RunObjectIncompleteDetails]
}

/**
* The last error associated with this run. Will be `null` if there are no errors.
* @param code One of `server_error`, `rate_limit_exceeded`, or `invalid_prompt`.
* @param message A human-readable description of the error.
*/

case class RunObjectLastError(
  code: String,
  message: String
)
object RunObjectLastError {
  implicit val encoderRunObjectLastError: Encoder[RunObjectLastError] = deriveEncoder[RunObjectLastError].mapJson(_.dropNullValues)
  implicit val decoderRunObjectLastError: Decoder[RunObjectLastError] = deriveDecoder[RunObjectLastError]
}

/**
* Details on the action required to continue the run. Will be `null` if no action is required.
* @param `type` For now, this is always `submit_tool_outputs`.
* @param submitUnderscoretoolUnderscoreoutputs 
*/

case class RunObjectRequiredAction(
  `type`: String,
  submitUnderscoretoolUnderscoreoutputs: RunObjectRequiredActionSubmitToolOutputs
)
object RunObjectRequiredAction {
  implicit val encoderRunObjectRequiredAction: Encoder[RunObjectRequiredAction] = deriveEncoder[RunObjectRequiredAction].mapJson(_.dropNullValues)
  implicit val decoderRunObjectRequiredAction: Decoder[RunObjectRequiredAction] = deriveDecoder[RunObjectRequiredAction]
}

/**
* Details on the tool outputs needed for this run to continue.
* @param toolUnderscorecalls A list of the relevant tool calls.
*/

case class RunObjectRequiredActionSubmitToolOutputs(
  toolUnderscorecalls: List[RunToolCallObject]
)
object RunObjectRequiredActionSubmitToolOutputs {
  implicit val encoderRunObjectRequiredActionSubmitToolOutputs: Encoder[RunObjectRequiredActionSubmitToolOutputs] = deriveEncoder[RunObjectRequiredActionSubmitToolOutputs].mapJson(_.dropNullValues)
  implicit val decoderRunObjectRequiredActionSubmitToolOutputs: Decoder[RunObjectRequiredActionSubmitToolOutputs] = deriveDecoder[RunObjectRequiredActionSubmitToolOutputs]
}

/**
* 
* @param `type` The type of tool being defined: `code_interpreter`
* @param fileUnderscoresearch 
* @param function 
*/
sealed trait RunObjectToolsInner
object RunObjectToolsInner {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val runObjectToolsInnerEncoder: Encoder[RunObjectToolsInner] = Encoder.instance {
    case assistantToolsCode: AssistantToolsCode => assistantToolsCode.asJson
    case assistantToolsFileSearch: AssistantToolsFileSearch => assistantToolsFileSearch.asJson
    case assistantToolsFunction: AssistantToolsFunction => assistantToolsFunction.asJson
  }

  implicit val runObjectToolsInnerDecoder: Decoder[RunObjectToolsInner] =
    List[Decoder[RunObjectToolsInner]](
      Decoder[AssistantToolsCode].widen,
      Decoder[AssistantToolsFileSearch].widen,
      Decoder[AssistantToolsFunction].widen,
  ).reduceLeft(_ or _)
}


/**
* Usage statistics related to the run step. This value will be `null` while the run step's status is `in_progress`.
* @param completionUnderscoretokens Number of completion tokens used over the course of the run step.
* @param promptUnderscoretokens Number of prompt tokens used over the course of the run step.
* @param totalUnderscoretokens Total number of tokens used (prompt + completion).
*/

case class RunStepCompletionUsage(
  completionUnderscoretokens: Int,
  promptUnderscoretokens: Int,
  totalUnderscoretokens: Int
)
object RunStepCompletionUsage {
  implicit val encoderRunStepCompletionUsage: Encoder[RunStepCompletionUsage] = deriveEncoder[RunStepCompletionUsage].mapJson(_.dropNullValues)
  implicit val decoderRunStepCompletionUsage: Decoder[RunStepCompletionUsage] = deriveDecoder[RunStepCompletionUsage]
}

/**
* Represents a run step delta i.e. any changed fields on a run step during streaming. 
* @param id The identifier of the run step, which can be referenced in API endpoints.
* @param `object` The object type, which is always `thread.run.step.delta`.
* @param delta 
*/

case class RunStepDeltaObject(
  id: String,
  `object`: String,
  delta: RunStepDeltaObjectDelta
)
object RunStepDeltaObject {
  implicit val encoderRunStepDeltaObject: Encoder[RunStepDeltaObject] = deriveEncoder[RunStepDeltaObject].mapJson(_.dropNullValues)
  implicit val decoderRunStepDeltaObject: Decoder[RunStepDeltaObject] = deriveDecoder[RunStepDeltaObject]
}

/**
* The delta containing the fields that have changed on the run step.
* @param stepUnderscoredetails 
*/

case class RunStepDeltaObjectDelta(
  stepUnderscoredetails: Option[RunStepDeltaObjectDeltaStepDetails]
)
object RunStepDeltaObjectDelta {
  implicit val encoderRunStepDeltaObjectDelta: Encoder[RunStepDeltaObjectDelta] = deriveEncoder[RunStepDeltaObjectDelta].mapJson(_.dropNullValues)
  implicit val decoderRunStepDeltaObjectDelta: Decoder[RunStepDeltaObjectDelta] = deriveDecoder[RunStepDeltaObjectDelta]
}

/**
* The details of the run step.
* @param `type` Always `message_creation`.
* @param messageUnderscorecreation 
* @param toolUnderscorecalls An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `file_search`, or `function`. 
*/
sealed trait RunStepDeltaObjectDeltaStepDetails
object RunStepDeltaObjectDeltaStepDetails {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val runStepDeltaObjectDeltaStepDetailsEncoder: Encoder[RunStepDeltaObjectDeltaStepDetails] = Encoder.instance {
    case runStepDeltaStepDetailsMessageCreationObject: RunStepDeltaStepDetailsMessageCreationObject => runStepDeltaStepDetailsMessageCreationObject.asJson
    case runStepDeltaStepDetailsToolCallsObject: RunStepDeltaStepDetailsToolCallsObject => runStepDeltaStepDetailsToolCallsObject.asJson
  }

  implicit val runStepDeltaObjectDeltaStepDetailsDecoder: Decoder[RunStepDeltaObjectDeltaStepDetails] =
    List[Decoder[RunStepDeltaObjectDeltaStepDetails]](
      Decoder[RunStepDeltaStepDetailsMessageCreationObject].widen,
      Decoder[RunStepDeltaStepDetailsToolCallsObject].widen,
  ).reduceLeft(_ or _)
}


/**
* Details of the message creation by the run step.
* @param `type` Always `message_creation`.
* @param messageUnderscorecreation 
*/

case class RunStepDeltaStepDetailsMessageCreationObject(
  `type`: String,
  messageUnderscorecreation: Option[RunStepDeltaStepDetailsMessageCreationObjectMessageCreation]
) extends RunStepDeltaObjectDeltaStepDetails
object RunStepDeltaStepDetailsMessageCreationObject {
  implicit val encoderRunStepDeltaStepDetailsMessageCreationObject: Encoder[RunStepDeltaStepDetailsMessageCreationObject] = deriveEncoder[RunStepDeltaStepDetailsMessageCreationObject].mapJson(_.dropNullValues)
  implicit val decoderRunStepDeltaStepDetailsMessageCreationObject: Decoder[RunStepDeltaStepDetailsMessageCreationObject] = deriveDecoder[RunStepDeltaStepDetailsMessageCreationObject]
}

/**
* 
* @param messageUnderscoreid The ID of the message that was created by this run step.
*/

case class RunStepDeltaStepDetailsMessageCreationObjectMessageCreation(
  messageUnderscoreid: Option[String]
)
object RunStepDeltaStepDetailsMessageCreationObjectMessageCreation {
  implicit val encoderRunStepDeltaStepDetailsMessageCreationObjectMessageCreation: Encoder[RunStepDeltaStepDetailsMessageCreationObjectMessageCreation] = deriveEncoder[RunStepDeltaStepDetailsMessageCreationObjectMessageCreation].mapJson(_.dropNullValues)
  implicit val decoderRunStepDeltaStepDetailsMessageCreationObjectMessageCreation: Decoder[RunStepDeltaStepDetailsMessageCreationObjectMessageCreation] = deriveDecoder[RunStepDeltaStepDetailsMessageCreationObjectMessageCreation]
}

/**
* Details of the Code Interpreter tool call the run step was involved in.
* @param index The index of the tool call in the tool calls array.
* @param id The ID of the tool call.
* @param `type` The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
* @param codeUnderscoreinterpreter 
*/

case class RunStepDeltaStepDetailsToolCallsCodeObject(
  index: Int,
  id: Option[String],
  `type`: String,
  codeUnderscoreinterpreter: Option[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter]
) extends RunStepDeltaStepDetailsToolCallsObjectToolCallsInner
object RunStepDeltaStepDetailsToolCallsCodeObject {
  implicit val encoderRunStepDeltaStepDetailsToolCallsCodeObject: Encoder[RunStepDeltaStepDetailsToolCallsCodeObject] = deriveEncoder[RunStepDeltaStepDetailsToolCallsCodeObject].mapJson(_.dropNullValues)
  implicit val decoderRunStepDeltaStepDetailsToolCallsCodeObject: Decoder[RunStepDeltaStepDetailsToolCallsCodeObject] = deriveDecoder[RunStepDeltaStepDetailsToolCallsCodeObject]
}

/**
* The Code Interpreter tool call definition.
* @param input The input to the Code Interpreter tool call.
* @param outputs The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (`logs`) or images (`image`). Each of these are represented by a different object type.
*/

case class RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter(
  input: Option[String],
  outputs: Option[List[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner]]
)
object RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter {
  implicit val encoderRunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter: Encoder[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter] = deriveEncoder[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter].mapJson(_.dropNullValues)
  implicit val decoderRunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter: Decoder[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter] = deriveDecoder[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter]
}

/**
* 
* @param index The index of the output in the outputs array.
* @param `type` Always `logs`.
* @param logs The text output from the Code Interpreter tool call.
* @param image 
*/
sealed trait RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner
object RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerEncoder: Encoder[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner] = Encoder.instance {
    case runStepDeltaStepDetailsToolCallsCodeOutputImageObject: RunStepDeltaStepDetailsToolCallsCodeOutputImageObject => runStepDeltaStepDetailsToolCallsCodeOutputImageObject.asJson
    case runStepDeltaStepDetailsToolCallsCodeOutputLogsObject: RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject => runStepDeltaStepDetailsToolCallsCodeOutputLogsObject.asJson
  }

  implicit val runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerDecoder: Decoder[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner] =
    List[Decoder[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner]](
      Decoder[RunStepDeltaStepDetailsToolCallsCodeOutputImageObject].widen,
      Decoder[RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject].widen,
  ).reduceLeft(_ or _)
}


/**
* 
* @param index The index of the output in the outputs array.
* @param `type` Always `image`.
* @param image 
*/

case class RunStepDeltaStepDetailsToolCallsCodeOutputImageObject(
  index: Int,
  `type`: String,
  image: Option[RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage]
) extends RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner
object RunStepDeltaStepDetailsToolCallsCodeOutputImageObject {
  implicit val encoderRunStepDeltaStepDetailsToolCallsCodeOutputImageObject: Encoder[RunStepDeltaStepDetailsToolCallsCodeOutputImageObject] = deriveEncoder[RunStepDeltaStepDetailsToolCallsCodeOutputImageObject].mapJson(_.dropNullValues)
  implicit val decoderRunStepDeltaStepDetailsToolCallsCodeOutputImageObject: Decoder[RunStepDeltaStepDetailsToolCallsCodeOutputImageObject] = deriveDecoder[RunStepDeltaStepDetailsToolCallsCodeOutputImageObject]
}

/**
* 
* @param fileUnderscoreid The [file](/docs/api-reference/files) ID of the image.
*/

case class RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage(
  fileUnderscoreid: Option[String]
)
object RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage {
  implicit val encoderRunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage: Encoder[RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage] = deriveEncoder[RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage].mapJson(_.dropNullValues)
  implicit val decoderRunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage: Decoder[RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage] = deriveDecoder[RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage]
}

/**
* Text output from the Code Interpreter tool call as part of a run step.
* @param index The index of the output in the outputs array.
* @param `type` Always `logs`.
* @param logs The text output from the Code Interpreter tool call.
*/

case class RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject(
  index: Int,
  `type`: String,
  logs: Option[String]
) extends RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner
object RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject {
  implicit val encoderRunStepDeltaStepDetailsToolCallsCodeOutputLogsObject: Encoder[RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject] = deriveEncoder[RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject].mapJson(_.dropNullValues)
  implicit val decoderRunStepDeltaStepDetailsToolCallsCodeOutputLogsObject: Decoder[RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject] = deriveDecoder[RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject]
}

/**
* 
* @param index The index of the tool call in the tool calls array.
* @param id The ID of the tool call object.
* @param `type` The type of tool call. This is always going to be `file_search` for this type of tool call.
* @param fileUnderscoresearch For now, this is always going to be an empty object.
*/

case class RunStepDeltaStepDetailsToolCallsFileSearchObject(
  index: Int,
  id: Option[String],
  `type`: String,
  fileUnderscoresearch: Object
) extends RunStepDeltaStepDetailsToolCallsObjectToolCallsInner
object RunStepDeltaStepDetailsToolCallsFileSearchObject {
  implicit val encoderRunStepDeltaStepDetailsToolCallsFileSearchObject: Encoder[RunStepDeltaStepDetailsToolCallsFileSearchObject] = deriveEncoder[RunStepDeltaStepDetailsToolCallsFileSearchObject].mapJson(_.dropNullValues)
  implicit val decoderRunStepDeltaStepDetailsToolCallsFileSearchObject: Decoder[RunStepDeltaStepDetailsToolCallsFileSearchObject] = deriveDecoder[RunStepDeltaStepDetailsToolCallsFileSearchObject]
}

/**
* 
* @param index The index of the tool call in the tool calls array.
* @param id The ID of the tool call object.
* @param `type` The type of tool call. This is always going to be `function` for this type of tool call.
* @param function 
*/

case class RunStepDeltaStepDetailsToolCallsFunctionObject(
  index: Int,
  id: Option[String],
  `type`: String,
  function: Option[RunStepDeltaStepDetailsToolCallsFunctionObjectFunction]
) extends RunStepDeltaStepDetailsToolCallsObjectToolCallsInner
object RunStepDeltaStepDetailsToolCallsFunctionObject {
  implicit val encoderRunStepDeltaStepDetailsToolCallsFunctionObject: Encoder[RunStepDeltaStepDetailsToolCallsFunctionObject] = deriveEncoder[RunStepDeltaStepDetailsToolCallsFunctionObject].mapJson(_.dropNullValues)
  implicit val decoderRunStepDeltaStepDetailsToolCallsFunctionObject: Decoder[RunStepDeltaStepDetailsToolCallsFunctionObject] = deriveDecoder[RunStepDeltaStepDetailsToolCallsFunctionObject]
}

/**
* The definition of the function that was called.
* @param name The name of the function.
* @param arguments The arguments passed to the function.
* @param output The output of the function. This will be `null` if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet.
*/

case class RunStepDeltaStepDetailsToolCallsFunctionObjectFunction(
  name: Option[String],
  arguments: Option[String],
  output: Option[String]
)
object RunStepDeltaStepDetailsToolCallsFunctionObjectFunction {
  implicit val encoderRunStepDeltaStepDetailsToolCallsFunctionObjectFunction: Encoder[RunStepDeltaStepDetailsToolCallsFunctionObjectFunction] = deriveEncoder[RunStepDeltaStepDetailsToolCallsFunctionObjectFunction].mapJson(_.dropNullValues)
  implicit val decoderRunStepDeltaStepDetailsToolCallsFunctionObjectFunction: Decoder[RunStepDeltaStepDetailsToolCallsFunctionObjectFunction] = deriveDecoder[RunStepDeltaStepDetailsToolCallsFunctionObjectFunction]
}

/**
* Details of the tool call.
* @param `type` Always `tool_calls`.
* @param toolUnderscorecalls An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `file_search`, or `function`. 
*/

case class RunStepDeltaStepDetailsToolCallsObject(
  `type`: String,
  toolUnderscorecalls: Option[List[RunStepDeltaStepDetailsToolCallsObjectToolCallsInner]]
) extends RunStepDeltaObjectDeltaStepDetails
object RunStepDeltaStepDetailsToolCallsObject {
  implicit val encoderRunStepDeltaStepDetailsToolCallsObject: Encoder[RunStepDeltaStepDetailsToolCallsObject] = deriveEncoder[RunStepDeltaStepDetailsToolCallsObject].mapJson(_.dropNullValues)
  implicit val decoderRunStepDeltaStepDetailsToolCallsObject: Decoder[RunStepDeltaStepDetailsToolCallsObject] = deriveDecoder[RunStepDeltaStepDetailsToolCallsObject]
}

/**
* 
* @param index The index of the tool call in the tool calls array.
* @param id The ID of the tool call object.
* @param `type` The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
* @param codeUnderscoreinterpreter 
* @param fileUnderscoresearch For now, this is always going to be an empty object.
* @param function 
*/
sealed trait RunStepDeltaStepDetailsToolCallsObjectToolCallsInner
object RunStepDeltaStepDetailsToolCallsObjectToolCallsInner {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val runStepDeltaStepDetailsToolCallsObjectToolCallsInnerEncoder: Encoder[RunStepDeltaStepDetailsToolCallsObjectToolCallsInner] = Encoder.instance {
    case runStepDeltaStepDetailsToolCallsCodeObject: RunStepDeltaStepDetailsToolCallsCodeObject => runStepDeltaStepDetailsToolCallsCodeObject.asJson
    case runStepDeltaStepDetailsToolCallsFileSearchObject: RunStepDeltaStepDetailsToolCallsFileSearchObject => runStepDeltaStepDetailsToolCallsFileSearchObject.asJson
    case runStepDeltaStepDetailsToolCallsFunctionObject: RunStepDeltaStepDetailsToolCallsFunctionObject => runStepDeltaStepDetailsToolCallsFunctionObject.asJson
  }

  implicit val runStepDeltaStepDetailsToolCallsObjectToolCallsInnerDecoder: Decoder[RunStepDeltaStepDetailsToolCallsObjectToolCallsInner] =
    List[Decoder[RunStepDeltaStepDetailsToolCallsObjectToolCallsInner]](
      Decoder[RunStepDeltaStepDetailsToolCallsCodeObject].widen,
      Decoder[RunStepDeltaStepDetailsToolCallsFileSearchObject].widen,
      Decoder[RunStepDeltaStepDetailsToolCallsFunctionObject].widen,
  ).reduceLeft(_ or _)
}


/**
* Details of the message creation by the run step.
* @param `type` Always `message_creation`.
* @param messageUnderscorecreation 
*/

case class RunStepDetailsMessageCreationObject(
  `type`: String,
  messageUnderscorecreation: RunStepDetailsMessageCreationObjectMessageCreation
) extends RunStepObjectStepDetails
object RunStepDetailsMessageCreationObject {
  implicit val encoderRunStepDetailsMessageCreationObject: Encoder[RunStepDetailsMessageCreationObject] = deriveEncoder[RunStepDetailsMessageCreationObject].mapJson(_.dropNullValues)
  implicit val decoderRunStepDetailsMessageCreationObject: Decoder[RunStepDetailsMessageCreationObject] = deriveDecoder[RunStepDetailsMessageCreationObject]
}

/**
* 
* @param messageUnderscoreid The ID of the message that was created by this run step.
*/

case class RunStepDetailsMessageCreationObjectMessageCreation(
  messageUnderscoreid: String
)
object RunStepDetailsMessageCreationObjectMessageCreation {
  implicit val encoderRunStepDetailsMessageCreationObjectMessageCreation: Encoder[RunStepDetailsMessageCreationObjectMessageCreation] = deriveEncoder[RunStepDetailsMessageCreationObjectMessageCreation].mapJson(_.dropNullValues)
  implicit val decoderRunStepDetailsMessageCreationObjectMessageCreation: Decoder[RunStepDetailsMessageCreationObjectMessageCreation] = deriveDecoder[RunStepDetailsMessageCreationObjectMessageCreation]
}

/**
* Details of the Code Interpreter tool call the run step was involved in.
* @param id The ID of the tool call.
* @param `type` The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
* @param codeUnderscoreinterpreter 
*/

case class RunStepDetailsToolCallsCodeObject(
  id: String,
  `type`: String,
  codeUnderscoreinterpreter: RunStepDetailsToolCallsCodeObjectCodeInterpreter
) extends RunStepDetailsToolCallsObjectToolCallsInner
object RunStepDetailsToolCallsCodeObject {
  implicit val encoderRunStepDetailsToolCallsCodeObject: Encoder[RunStepDetailsToolCallsCodeObject] = deriveEncoder[RunStepDetailsToolCallsCodeObject].mapJson(_.dropNullValues)
  implicit val decoderRunStepDetailsToolCallsCodeObject: Decoder[RunStepDetailsToolCallsCodeObject] = deriveDecoder[RunStepDetailsToolCallsCodeObject]
}

/**
* The Code Interpreter tool call definition.
* @param input The input to the Code Interpreter tool call.
* @param outputs The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (`logs`) or images (`image`). Each of these are represented by a different object type.
*/

case class RunStepDetailsToolCallsCodeObjectCodeInterpreter(
  input: String,
  outputs: List[RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner]
)
object RunStepDetailsToolCallsCodeObjectCodeInterpreter {
  implicit val encoderRunStepDetailsToolCallsCodeObjectCodeInterpreter: Encoder[RunStepDetailsToolCallsCodeObjectCodeInterpreter] = deriveEncoder[RunStepDetailsToolCallsCodeObjectCodeInterpreter].mapJson(_.dropNullValues)
  implicit val decoderRunStepDetailsToolCallsCodeObjectCodeInterpreter: Decoder[RunStepDetailsToolCallsCodeObjectCodeInterpreter] = deriveDecoder[RunStepDetailsToolCallsCodeObjectCodeInterpreter]
}

/**
* 
* @param `type` Always `logs`.
* @param logs The text output from the Code Interpreter tool call.
* @param image 
*/
sealed trait RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner
object RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val runStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerEncoder: Encoder[RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner] = Encoder.instance {
    case runStepDetailsToolCallsCodeOutputImageObject: RunStepDetailsToolCallsCodeOutputImageObject => runStepDetailsToolCallsCodeOutputImageObject.asJson
    case runStepDetailsToolCallsCodeOutputLogsObject: RunStepDetailsToolCallsCodeOutputLogsObject => runStepDetailsToolCallsCodeOutputLogsObject.asJson
  }

  implicit val runStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerDecoder: Decoder[RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner] =
    List[Decoder[RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner]](
      Decoder[RunStepDetailsToolCallsCodeOutputImageObject].widen,
      Decoder[RunStepDetailsToolCallsCodeOutputLogsObject].widen,
  ).reduceLeft(_ or _)
}


/**
* 
* @param `type` Always `image`.
* @param image 
*/

case class RunStepDetailsToolCallsCodeOutputImageObject(
  `type`: String,
  image: RunStepDetailsToolCallsCodeOutputImageObjectImage
) extends RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner
object RunStepDetailsToolCallsCodeOutputImageObject {
  implicit val encoderRunStepDetailsToolCallsCodeOutputImageObject: Encoder[RunStepDetailsToolCallsCodeOutputImageObject] = deriveEncoder[RunStepDetailsToolCallsCodeOutputImageObject].mapJson(_.dropNullValues)
  implicit val decoderRunStepDetailsToolCallsCodeOutputImageObject: Decoder[RunStepDetailsToolCallsCodeOutputImageObject] = deriveDecoder[RunStepDetailsToolCallsCodeOutputImageObject]
}

/**
* 
* @param fileUnderscoreid The [file](/docs/api-reference/files) ID of the image.
*/

case class RunStepDetailsToolCallsCodeOutputImageObjectImage(
  fileUnderscoreid: String
)
object RunStepDetailsToolCallsCodeOutputImageObjectImage {
  implicit val encoderRunStepDetailsToolCallsCodeOutputImageObjectImage: Encoder[RunStepDetailsToolCallsCodeOutputImageObjectImage] = deriveEncoder[RunStepDetailsToolCallsCodeOutputImageObjectImage].mapJson(_.dropNullValues)
  implicit val decoderRunStepDetailsToolCallsCodeOutputImageObjectImage: Decoder[RunStepDetailsToolCallsCodeOutputImageObjectImage] = deriveDecoder[RunStepDetailsToolCallsCodeOutputImageObjectImage]
}

/**
* Text output from the Code Interpreter tool call as part of a run step.
* @param `type` Always `logs`.
* @param logs The text output from the Code Interpreter tool call.
*/

case class RunStepDetailsToolCallsCodeOutputLogsObject(
  `type`: String,
  logs: String
) extends RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner
object RunStepDetailsToolCallsCodeOutputLogsObject {
  implicit val encoderRunStepDetailsToolCallsCodeOutputLogsObject: Encoder[RunStepDetailsToolCallsCodeOutputLogsObject] = deriveEncoder[RunStepDetailsToolCallsCodeOutputLogsObject].mapJson(_.dropNullValues)
  implicit val decoderRunStepDetailsToolCallsCodeOutputLogsObject: Decoder[RunStepDetailsToolCallsCodeOutputLogsObject] = deriveDecoder[RunStepDetailsToolCallsCodeOutputLogsObject]
}

/**
* 
* @param id The ID of the tool call object.
* @param `type` The type of tool call. This is always going to be `file_search` for this type of tool call.
* @param fileUnderscoresearch 
*/

case class RunStepDetailsToolCallsFileSearchObject(
  id: String,
  `type`: String,
  fileUnderscoresearch: RunStepDetailsToolCallsFileSearchObjectFileSearch
) extends RunStepDetailsToolCallsObjectToolCallsInner
object RunStepDetailsToolCallsFileSearchObject {
  implicit val encoderRunStepDetailsToolCallsFileSearchObject: Encoder[RunStepDetailsToolCallsFileSearchObject] = deriveEncoder[RunStepDetailsToolCallsFileSearchObject].mapJson(_.dropNullValues)
  implicit val decoderRunStepDetailsToolCallsFileSearchObject: Decoder[RunStepDetailsToolCallsFileSearchObject] = deriveDecoder[RunStepDetailsToolCallsFileSearchObject]
}

/**
* For now, this is always going to be an empty object.
* @param rankingUnderscoreoptions 
* @param results The results of the file search.
*/

case class RunStepDetailsToolCallsFileSearchObjectFileSearch(
  rankingUnderscoreoptions: Option[RunStepDetailsToolCallsFileSearchRankingOptionsObject],
  results: Option[List[RunStepDetailsToolCallsFileSearchResultObject]]
)
object RunStepDetailsToolCallsFileSearchObjectFileSearch {
  implicit val encoderRunStepDetailsToolCallsFileSearchObjectFileSearch: Encoder[RunStepDetailsToolCallsFileSearchObjectFileSearch] = deriveEncoder[RunStepDetailsToolCallsFileSearchObjectFileSearch].mapJson(_.dropNullValues)
  implicit val decoderRunStepDetailsToolCallsFileSearchObjectFileSearch: Decoder[RunStepDetailsToolCallsFileSearchObjectFileSearch] = deriveDecoder[RunStepDetailsToolCallsFileSearchObjectFileSearch]
}

/**
* The ranking options for the file search.
* @param ranker The ranker used for the file search.
* @param scoreUnderscorethreshold The score threshold for the file search. All values must be a floating point number between 0 and 1.
*/

case class RunStepDetailsToolCallsFileSearchRankingOptionsObject(
  ranker: String,
  scoreUnderscorethreshold: Refined[BigDecimal, GreaterEqual[0] And LessEqual[1]]
)
object RunStepDetailsToolCallsFileSearchRankingOptionsObject {
  implicit val encoderRunStepDetailsToolCallsFileSearchRankingOptionsObject: Encoder[RunStepDetailsToolCallsFileSearchRankingOptionsObject] = deriveEncoder[RunStepDetailsToolCallsFileSearchRankingOptionsObject].mapJson(_.dropNullValues)
  implicit val decoderRunStepDetailsToolCallsFileSearchRankingOptionsObject: Decoder[RunStepDetailsToolCallsFileSearchRankingOptionsObject] = deriveDecoder[RunStepDetailsToolCallsFileSearchRankingOptionsObject]
}

/**
* A result instance of the file search.
* @param fileUnderscoreid The ID of the file that result was found in.
* @param fileUnderscorename The name of the file that result was found in.
* @param score The score of the result. All values must be a floating point number between 0 and 1.
* @param content The content of the result that was found. The content is only included if requested via the include query parameter.
*/

case class RunStepDetailsToolCallsFileSearchResultObject(
  fileUnderscoreid: String,
  fileUnderscorename: String,
  score: Refined[BigDecimal, GreaterEqual[0] And LessEqual[1]],
  content: Option[List[RunStepDetailsToolCallsFileSearchResultObjectContentInner]]
)
object RunStepDetailsToolCallsFileSearchResultObject {
  implicit val encoderRunStepDetailsToolCallsFileSearchResultObject: Encoder[RunStepDetailsToolCallsFileSearchResultObject] = deriveEncoder[RunStepDetailsToolCallsFileSearchResultObject].mapJson(_.dropNullValues)
  implicit val decoderRunStepDetailsToolCallsFileSearchResultObject: Decoder[RunStepDetailsToolCallsFileSearchResultObject] = deriveDecoder[RunStepDetailsToolCallsFileSearchResultObject]
}

/**
* 
* @param `type` The type of the content.
* @param text The text content of the file.
*/

case class RunStepDetailsToolCallsFileSearchResultObjectContentInner(
  `type`: Option[String],
  text: Option[String]
)
object RunStepDetailsToolCallsFileSearchResultObjectContentInner {
  implicit val encoderRunStepDetailsToolCallsFileSearchResultObjectContentInner: Encoder[RunStepDetailsToolCallsFileSearchResultObjectContentInner] = deriveEncoder[RunStepDetailsToolCallsFileSearchResultObjectContentInner].mapJson(_.dropNullValues)
  implicit val decoderRunStepDetailsToolCallsFileSearchResultObjectContentInner: Decoder[RunStepDetailsToolCallsFileSearchResultObjectContentInner] = deriveDecoder[RunStepDetailsToolCallsFileSearchResultObjectContentInner]
}

/**
* 
* @param id The ID of the tool call object.
* @param `type` The type of tool call. This is always going to be `function` for this type of tool call.
* @param function 
*/

case class RunStepDetailsToolCallsFunctionObject(
  id: String,
  `type`: String,
  function: RunStepDetailsToolCallsFunctionObjectFunction
) extends RunStepDetailsToolCallsObjectToolCallsInner
object RunStepDetailsToolCallsFunctionObject {
  implicit val encoderRunStepDetailsToolCallsFunctionObject: Encoder[RunStepDetailsToolCallsFunctionObject] = deriveEncoder[RunStepDetailsToolCallsFunctionObject].mapJson(_.dropNullValues)
  implicit val decoderRunStepDetailsToolCallsFunctionObject: Decoder[RunStepDetailsToolCallsFunctionObject] = deriveDecoder[RunStepDetailsToolCallsFunctionObject]
}

/**
* The definition of the function that was called.
* @param name The name of the function.
* @param arguments The arguments passed to the function.
* @param output The output of the function. This will be `null` if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet.
*/

case class RunStepDetailsToolCallsFunctionObjectFunction(
  name: String,
  arguments: String,
  output: String
)
object RunStepDetailsToolCallsFunctionObjectFunction {
  implicit val encoderRunStepDetailsToolCallsFunctionObjectFunction: Encoder[RunStepDetailsToolCallsFunctionObjectFunction] = deriveEncoder[RunStepDetailsToolCallsFunctionObjectFunction].mapJson(_.dropNullValues)
  implicit val decoderRunStepDetailsToolCallsFunctionObjectFunction: Decoder[RunStepDetailsToolCallsFunctionObjectFunction] = deriveDecoder[RunStepDetailsToolCallsFunctionObjectFunction]
}

/**
* Details of the tool call.
* @param `type` Always `tool_calls`.
* @param toolUnderscorecalls An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `file_search`, or `function`. 
*/

case class RunStepDetailsToolCallsObject(
  `type`: String,
  toolUnderscorecalls: List[RunStepDetailsToolCallsObjectToolCallsInner]
) extends RunStepObjectStepDetails
object RunStepDetailsToolCallsObject {
  implicit val encoderRunStepDetailsToolCallsObject: Encoder[RunStepDetailsToolCallsObject] = deriveEncoder[RunStepDetailsToolCallsObject].mapJson(_.dropNullValues)
  implicit val decoderRunStepDetailsToolCallsObject: Decoder[RunStepDetailsToolCallsObject] = deriveDecoder[RunStepDetailsToolCallsObject]
}

/**
* 
* @param id The ID of the tool call object.
* @param `type` The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
* @param codeUnderscoreinterpreter 
* @param fileUnderscoresearch 
* @param function 
*/
sealed trait RunStepDetailsToolCallsObjectToolCallsInner
object RunStepDetailsToolCallsObjectToolCallsInner {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val runStepDetailsToolCallsObjectToolCallsInnerEncoder: Encoder[RunStepDetailsToolCallsObjectToolCallsInner] = Encoder.instance {
    case runStepDetailsToolCallsCodeObject: RunStepDetailsToolCallsCodeObject => runStepDetailsToolCallsCodeObject.asJson
    case runStepDetailsToolCallsFileSearchObject: RunStepDetailsToolCallsFileSearchObject => runStepDetailsToolCallsFileSearchObject.asJson
    case runStepDetailsToolCallsFunctionObject: RunStepDetailsToolCallsFunctionObject => runStepDetailsToolCallsFunctionObject.asJson
  }

  implicit val runStepDetailsToolCallsObjectToolCallsInnerDecoder: Decoder[RunStepDetailsToolCallsObjectToolCallsInner] =
    List[Decoder[RunStepDetailsToolCallsObjectToolCallsInner]](
      Decoder[RunStepDetailsToolCallsCodeObject].widen,
      Decoder[RunStepDetailsToolCallsFileSearchObject].widen,
      Decoder[RunStepDetailsToolCallsFunctionObject].widen,
  ).reduceLeft(_ or _)
}


/**
* Represents a step in execution of a run. 
* @param id The identifier of the run step, which can be referenced in API endpoints.
* @param `object` The object type, which is always `thread.run.step`.
* @param createdUnderscoreat The Unix timestamp (in seconds) for when the run step was created.
* @param assistantUnderscoreid The ID of the [assistant](/docs/api-reference/assistants) associated with the run step.
* @param threadUnderscoreid The ID of the [thread](/docs/api-reference/threads) that was run.
* @param runUnderscoreid The ID of the [run](/docs/api-reference/runs) that this run step is a part of.
* @param `type` The type of run step, which can be either `message_creation` or `tool_calls`.
* @param status The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`.
* @param stepUnderscoredetails 
* @param lastUnderscoreerror 
* @param expiredUnderscoreat The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired.
* @param cancelledUnderscoreat The Unix timestamp (in seconds) for when the run step was cancelled.
* @param failedUnderscoreat The Unix timestamp (in seconds) for when the run step failed.
* @param completedUnderscoreat The Unix timestamp (in seconds) for when the run step completed.
* @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
* @param usage 
*/

case class RunStepObject(
  id: String,
  `object`: String,
  createdUnderscoreat: Int,
  assistantUnderscoreid: String,
  threadUnderscoreid: String,
  runUnderscoreid: String,
  `type`: String,
  status: String,
  stepUnderscoredetails: RunStepObjectStepDetails,
  lastUnderscoreerror: RunStepObjectLastError,
  expiredUnderscoreat: Int,
  cancelledUnderscoreat: Int,
  failedUnderscoreat: Int,
  completedUnderscoreat: Int,
  metadata: Object,
  usage: RunStepCompletionUsage
)
object RunStepObject {
  implicit val encoderRunStepObject: Encoder[RunStepObject] = deriveEncoder[RunStepObject].mapJson(_.dropNullValues)
  implicit val decoderRunStepObject: Decoder[RunStepObject] = deriveDecoder[RunStepObject]
}

/**
* The last error associated with this run step. Will be `null` if there are no errors.
* @param code One of `server_error` or `rate_limit_exceeded`.
* @param message A human-readable description of the error.
*/

case class RunStepObjectLastError(
  code: String,
  message: String
)
object RunStepObjectLastError {
  implicit val encoderRunStepObjectLastError: Encoder[RunStepObjectLastError] = deriveEncoder[RunStepObjectLastError].mapJson(_.dropNullValues)
  implicit val decoderRunStepObjectLastError: Decoder[RunStepObjectLastError] = deriveDecoder[RunStepObjectLastError]
}

/**
* The details of the run step.
* @param `type` Always `message_creation`.
* @param messageUnderscorecreation 
* @param toolUnderscorecalls An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `file_search`, or `function`. 
*/
sealed trait RunStepObjectStepDetails
object RunStepObjectStepDetails {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val runStepObjectStepDetailsEncoder: Encoder[RunStepObjectStepDetails] = Encoder.instance {
    case runStepDetailsMessageCreationObject: RunStepDetailsMessageCreationObject => runStepDetailsMessageCreationObject.asJson
    case runStepDetailsToolCallsObject: RunStepDetailsToolCallsObject => runStepDetailsToolCallsObject.asJson
  }

  implicit val runStepObjectStepDetailsDecoder: Decoder[RunStepObjectStepDetails] =
    List[Decoder[RunStepObjectStepDetails]](
      Decoder[RunStepDetailsMessageCreationObject].widen,
      Decoder[RunStepDetailsToolCallsObject].widen,
  ).reduceLeft(_ or _)
}


/**
* 
* @param event 
* @param data 
*/
sealed trait RunStepStreamEvent
object RunStepStreamEvent {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val runStepStreamEventEncoder: Encoder[RunStepStreamEvent] = Encoder.instance {
    case runStepStreamEventOneOf: RunStepStreamEventOneOf => runStepStreamEventOneOf.asJson
    case runStepStreamEventOneOf1: RunStepStreamEventOneOf1 => runStepStreamEventOneOf1.asJson
    case runStepStreamEventOneOf2: RunStepStreamEventOneOf2 => runStepStreamEventOneOf2.asJson
    case runStepStreamEventOneOf3: RunStepStreamEventOneOf3 => runStepStreamEventOneOf3.asJson
    case runStepStreamEventOneOf4: RunStepStreamEventOneOf4 => runStepStreamEventOneOf4.asJson
    case runStepStreamEventOneOf5: RunStepStreamEventOneOf5 => runStepStreamEventOneOf5.asJson
    case runStepStreamEventOneOf6: RunStepStreamEventOneOf6 => runStepStreamEventOneOf6.asJson
  }

  implicit val runStepStreamEventDecoder: Decoder[RunStepStreamEvent] =
    List[Decoder[RunStepStreamEvent]](
      Decoder[RunStepStreamEventOneOf].widen,
      Decoder[RunStepStreamEventOneOf1].widen,
      Decoder[RunStepStreamEventOneOf2].widen,
      Decoder[RunStepStreamEventOneOf3].widen,
      Decoder[RunStepStreamEventOneOf4].widen,
      Decoder[RunStepStreamEventOneOf5].widen,
      Decoder[RunStepStreamEventOneOf6].widen,
  ).reduceLeft(_ or _)
}


/**
* Occurs when a [run step](/docs/api-reference/run-steps/step-object) is created.
* @param event 
* @param data 
*/

case class RunStepStreamEventOneOf(
  event: String,
  data: RunStepObject
) extends RunStepStreamEvent
object RunStepStreamEventOneOf {
  implicit val encoderRunStepStreamEventOneOf: Encoder[RunStepStreamEventOneOf] = deriveEncoder[RunStepStreamEventOneOf].mapJson(_.dropNullValues)
  implicit val decoderRunStepStreamEventOneOf: Decoder[RunStepStreamEventOneOf] = deriveDecoder[RunStepStreamEventOneOf]
}

/**
* Occurs when a [run step](/docs/api-reference/run-steps/step-object) moves to an `in_progress` state.
* @param event 
* @param data 
*/

case class RunStepStreamEventOneOf1(
  event: String,
  data: RunStepObject
) extends RunStepStreamEvent
object RunStepStreamEventOneOf1 {
  implicit val encoderRunStepStreamEventOneOf1: Encoder[RunStepStreamEventOneOf1] = deriveEncoder[RunStepStreamEventOneOf1].mapJson(_.dropNullValues)
  implicit val decoderRunStepStreamEventOneOf1: Decoder[RunStepStreamEventOneOf1] = deriveDecoder[RunStepStreamEventOneOf1]
}

/**
* Occurs when parts of a [run step](/docs/api-reference/run-steps/step-object) are being streamed.
* @param event 
* @param data 
*/

case class RunStepStreamEventOneOf2(
  event: String,
  data: RunStepDeltaObject
) extends RunStepStreamEvent
object RunStepStreamEventOneOf2 {
  implicit val encoderRunStepStreamEventOneOf2: Encoder[RunStepStreamEventOneOf2] = deriveEncoder[RunStepStreamEventOneOf2].mapJson(_.dropNullValues)
  implicit val decoderRunStepStreamEventOneOf2: Decoder[RunStepStreamEventOneOf2] = deriveDecoder[RunStepStreamEventOneOf2]
}

/**
* Occurs when a [run step](/docs/api-reference/run-steps/step-object) is completed.
* @param event 
* @param data 
*/

case class RunStepStreamEventOneOf3(
  event: String,
  data: RunStepObject
) extends RunStepStreamEvent
object RunStepStreamEventOneOf3 {
  implicit val encoderRunStepStreamEventOneOf3: Encoder[RunStepStreamEventOneOf3] = deriveEncoder[RunStepStreamEventOneOf3].mapJson(_.dropNullValues)
  implicit val decoderRunStepStreamEventOneOf3: Decoder[RunStepStreamEventOneOf3] = deriveDecoder[RunStepStreamEventOneOf3]
}

/**
* Occurs when a [run step](/docs/api-reference/run-steps/step-object) fails.
* @param event 
* @param data 
*/

case class RunStepStreamEventOneOf4(
  event: String,
  data: RunStepObject
) extends RunStepStreamEvent
object RunStepStreamEventOneOf4 {
  implicit val encoderRunStepStreamEventOneOf4: Encoder[RunStepStreamEventOneOf4] = deriveEncoder[RunStepStreamEventOneOf4].mapJson(_.dropNullValues)
  implicit val decoderRunStepStreamEventOneOf4: Decoder[RunStepStreamEventOneOf4] = deriveDecoder[RunStepStreamEventOneOf4]
}

/**
* Occurs when a [run step](/docs/api-reference/run-steps/step-object) is cancelled.
* @param event 
* @param data 
*/

case class RunStepStreamEventOneOf5(
  event: String,
  data: RunStepObject
) extends RunStepStreamEvent
object RunStepStreamEventOneOf5 {
  implicit val encoderRunStepStreamEventOneOf5: Encoder[RunStepStreamEventOneOf5] = deriveEncoder[RunStepStreamEventOneOf5].mapJson(_.dropNullValues)
  implicit val decoderRunStepStreamEventOneOf5: Decoder[RunStepStreamEventOneOf5] = deriveDecoder[RunStepStreamEventOneOf5]
}

/**
* Occurs when a [run step](/docs/api-reference/run-steps/step-object) expires.
* @param event 
* @param data 
*/

case class RunStepStreamEventOneOf6(
  event: String,
  data: RunStepObject
) extends RunStepStreamEvent
object RunStepStreamEventOneOf6 {
  implicit val encoderRunStepStreamEventOneOf6: Encoder[RunStepStreamEventOneOf6] = deriveEncoder[RunStepStreamEventOneOf6].mapJson(_.dropNullValues)
  implicit val decoderRunStepStreamEventOneOf6: Decoder[RunStepStreamEventOneOf6] = deriveDecoder[RunStepStreamEventOneOf6]
}

/**
* 
* @param event 
* @param data 
*/
sealed trait RunStreamEvent
object RunStreamEvent {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val runStreamEventEncoder: Encoder[RunStreamEvent] = Encoder.instance {
    case runStreamEventOneOf: RunStreamEventOneOf => runStreamEventOneOf.asJson
    case runStreamEventOneOf1: RunStreamEventOneOf1 => runStreamEventOneOf1.asJson
    case runStreamEventOneOf2: RunStreamEventOneOf2 => runStreamEventOneOf2.asJson
    case runStreamEventOneOf3: RunStreamEventOneOf3 => runStreamEventOneOf3.asJson
    case runStreamEventOneOf4: RunStreamEventOneOf4 => runStreamEventOneOf4.asJson
    case runStreamEventOneOf5: RunStreamEventOneOf5 => runStreamEventOneOf5.asJson
    case runStreamEventOneOf6: RunStreamEventOneOf6 => runStreamEventOneOf6.asJson
    case runStreamEventOneOf7: RunStreamEventOneOf7 => runStreamEventOneOf7.asJson
    case runStreamEventOneOf8: RunStreamEventOneOf8 => runStreamEventOneOf8.asJson
    case runStreamEventOneOf9: RunStreamEventOneOf9 => runStreamEventOneOf9.asJson
  }

  implicit val runStreamEventDecoder: Decoder[RunStreamEvent] =
    List[Decoder[RunStreamEvent]](
      Decoder[RunStreamEventOneOf].widen,
      Decoder[RunStreamEventOneOf1].widen,
      Decoder[RunStreamEventOneOf2].widen,
      Decoder[RunStreamEventOneOf3].widen,
      Decoder[RunStreamEventOneOf4].widen,
      Decoder[RunStreamEventOneOf5].widen,
      Decoder[RunStreamEventOneOf6].widen,
      Decoder[RunStreamEventOneOf7].widen,
      Decoder[RunStreamEventOneOf8].widen,
      Decoder[RunStreamEventOneOf9].widen,
  ).reduceLeft(_ or _)
}


/**
* Occurs when a new [run](/docs/api-reference/runs/object) is created.
* @param event 
* @param data 
*/

case class RunStreamEventOneOf(
  event: String,
  data: RunObject
) extends RunStreamEvent
object RunStreamEventOneOf {
  implicit val encoderRunStreamEventOneOf: Encoder[RunStreamEventOneOf] = deriveEncoder[RunStreamEventOneOf].mapJson(_.dropNullValues)
  implicit val decoderRunStreamEventOneOf: Decoder[RunStreamEventOneOf] = deriveDecoder[RunStreamEventOneOf]
}

/**
* Occurs when a [run](/docs/api-reference/runs/object) moves to a `queued` status.
* @param event 
* @param data 
*/

case class RunStreamEventOneOf1(
  event: String,
  data: RunObject
) extends RunStreamEvent
object RunStreamEventOneOf1 {
  implicit val encoderRunStreamEventOneOf1: Encoder[RunStreamEventOneOf1] = deriveEncoder[RunStreamEventOneOf1].mapJson(_.dropNullValues)
  implicit val decoderRunStreamEventOneOf1: Decoder[RunStreamEventOneOf1] = deriveDecoder[RunStreamEventOneOf1]
}

/**
* Occurs when a [run](/docs/api-reference/runs/object) moves to an `in_progress` status.
* @param event 
* @param data 
*/

case class RunStreamEventOneOf2(
  event: String,
  data: RunObject
) extends RunStreamEvent
object RunStreamEventOneOf2 {
  implicit val encoderRunStreamEventOneOf2: Encoder[RunStreamEventOneOf2] = deriveEncoder[RunStreamEventOneOf2].mapJson(_.dropNullValues)
  implicit val decoderRunStreamEventOneOf2: Decoder[RunStreamEventOneOf2] = deriveDecoder[RunStreamEventOneOf2]
}

/**
* Occurs when a [run](/docs/api-reference/runs/object) moves to a `requires_action` status.
* @param event 
* @param data 
*/

case class RunStreamEventOneOf3(
  event: String,
  data: RunObject
) extends RunStreamEvent
object RunStreamEventOneOf3 {
  implicit val encoderRunStreamEventOneOf3: Encoder[RunStreamEventOneOf3] = deriveEncoder[RunStreamEventOneOf3].mapJson(_.dropNullValues)
  implicit val decoderRunStreamEventOneOf3: Decoder[RunStreamEventOneOf3] = deriveDecoder[RunStreamEventOneOf3]
}

/**
* Occurs when a [run](/docs/api-reference/runs/object) is completed.
* @param event 
* @param data 
*/

case class RunStreamEventOneOf4(
  event: String,
  data: RunObject
) extends RunStreamEvent
object RunStreamEventOneOf4 {
  implicit val encoderRunStreamEventOneOf4: Encoder[RunStreamEventOneOf4] = deriveEncoder[RunStreamEventOneOf4].mapJson(_.dropNullValues)
  implicit val decoderRunStreamEventOneOf4: Decoder[RunStreamEventOneOf4] = deriveDecoder[RunStreamEventOneOf4]
}

/**
* Occurs when a [run](/docs/api-reference/runs/object) ends with status `incomplete`.
* @param event 
* @param data 
*/

case class RunStreamEventOneOf5(
  event: String,
  data: RunObject
) extends RunStreamEvent
object RunStreamEventOneOf5 {
  implicit val encoderRunStreamEventOneOf5: Encoder[RunStreamEventOneOf5] = deriveEncoder[RunStreamEventOneOf5].mapJson(_.dropNullValues)
  implicit val decoderRunStreamEventOneOf5: Decoder[RunStreamEventOneOf5] = deriveDecoder[RunStreamEventOneOf5]
}

/**
* Occurs when a [run](/docs/api-reference/runs/object) fails.
* @param event 
* @param data 
*/

case class RunStreamEventOneOf6(
  event: String,
  data: RunObject
) extends RunStreamEvent
object RunStreamEventOneOf6 {
  implicit val encoderRunStreamEventOneOf6: Encoder[RunStreamEventOneOf6] = deriveEncoder[RunStreamEventOneOf6].mapJson(_.dropNullValues)
  implicit val decoderRunStreamEventOneOf6: Decoder[RunStreamEventOneOf6] = deriveDecoder[RunStreamEventOneOf6]
}

/**
* Occurs when a [run](/docs/api-reference/runs/object) moves to a `cancelling` status.
* @param event 
* @param data 
*/

case class RunStreamEventOneOf7(
  event: String,
  data: RunObject
) extends RunStreamEvent
object RunStreamEventOneOf7 {
  implicit val encoderRunStreamEventOneOf7: Encoder[RunStreamEventOneOf7] = deriveEncoder[RunStreamEventOneOf7].mapJson(_.dropNullValues)
  implicit val decoderRunStreamEventOneOf7: Decoder[RunStreamEventOneOf7] = deriveDecoder[RunStreamEventOneOf7]
}

/**
* Occurs when a [run](/docs/api-reference/runs/object) is cancelled.
* @param event 
* @param data 
*/

case class RunStreamEventOneOf8(
  event: String,
  data: RunObject
) extends RunStreamEvent
object RunStreamEventOneOf8 {
  implicit val encoderRunStreamEventOneOf8: Encoder[RunStreamEventOneOf8] = deriveEncoder[RunStreamEventOneOf8].mapJson(_.dropNullValues)
  implicit val decoderRunStreamEventOneOf8: Decoder[RunStreamEventOneOf8] = deriveDecoder[RunStreamEventOneOf8]
}

/**
* Occurs when a [run](/docs/api-reference/runs/object) expires.
* @param event 
* @param data 
*/

case class RunStreamEventOneOf9(
  event: String,
  data: RunObject
) extends RunStreamEvent
object RunStreamEventOneOf9 {
  implicit val encoderRunStreamEventOneOf9: Encoder[RunStreamEventOneOf9] = deriveEncoder[RunStreamEventOneOf9].mapJson(_.dropNullValues)
  implicit val decoderRunStreamEventOneOf9: Decoder[RunStreamEventOneOf9] = deriveDecoder[RunStreamEventOneOf9]
}

/**
* Tool call objects
* @param id The ID of the tool call. This ID must be referenced when you submit the tool outputs in using the [Submit tool outputs to run](/docs/api-reference/runs/submitToolOutputs) endpoint.
* @param `type` The type of tool call the output is required for. For now, this is always `function`.
* @param function 
*/

case class RunToolCallObject(
  id: String,
  `type`: String,
  function: RunToolCallObjectFunction
)
object RunToolCallObject {
  implicit val encoderRunToolCallObject: Encoder[RunToolCallObject] = deriveEncoder[RunToolCallObject].mapJson(_.dropNullValues)
  implicit val decoderRunToolCallObject: Decoder[RunToolCallObject] = deriveDecoder[RunToolCallObject]
}

/**
* The function definition.
* @param name The name of the function.
* @param arguments The arguments that the model expects you to pass to the function.
*/

case class RunToolCallObjectFunction(
  name: String,
  arguments: String
)
object RunToolCallObjectFunction {
  implicit val encoderRunToolCallObjectFunction: Encoder[RunToolCallObjectFunction] = deriveEncoder[RunToolCallObjectFunction].mapJson(_.dropNullValues)
  implicit val decoderRunToolCallObjectFunction: Decoder[RunToolCallObjectFunction] = deriveDecoder[RunToolCallObjectFunction]
}

/**
* 
* @param `type` Always `static`.
* @param `static` 
*/

case class StaticChunkingStrategy(
  `type`: String,
  `static`: StaticChunkingStrategyStatic
) extends CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy
object StaticChunkingStrategy {
  implicit val encoderStaticChunkingStrategy: Encoder[StaticChunkingStrategy] = deriveEncoder[StaticChunkingStrategy].mapJson(_.dropNullValues)
  implicit val decoderStaticChunkingStrategy: Decoder[StaticChunkingStrategy] = deriveDecoder[StaticChunkingStrategy]
}

/**
* 
* @param `type` Always `static`.
* @param `static` 
*/

case class StaticChunkingStrategy1(
  `type`: String,
  `static`: StaticChunkingStrategy1Static
) extends CreateThreadRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy
object StaticChunkingStrategy1 {
  implicit val encoderStaticChunkingStrategy1: Encoder[StaticChunkingStrategy1] = deriveEncoder[StaticChunkingStrategy1].mapJson(_.dropNullValues)
  implicit val decoderStaticChunkingStrategy1: Decoder[StaticChunkingStrategy1] = deriveDecoder[StaticChunkingStrategy1]
}

/**
* 
* @param maxUnderscorechunkUnderscoresizeUnderscoretokens The maximum number of tokens in each chunk. The default value is `800`. The minimum value is `100` and the maximum value is `4096`.
* @param chunkUnderscoreoverlapUnderscoretokens The number of tokens that overlap between chunks. The default value is `400`.  Note that the overlap must not exceed half of `max_chunk_size_tokens`. 
*/

case class StaticChunkingStrategy1Static(
  maxUnderscorechunkUnderscoresizeUnderscoretokens: Refined[Int, GreaterEqual[100] And LessEqual[4096]],
  chunkUnderscoreoverlapUnderscoretokens: Int
)
object StaticChunkingStrategy1Static {
  implicit val encoderStaticChunkingStrategy1Static: Encoder[StaticChunkingStrategy1Static] = deriveEncoder[StaticChunkingStrategy1Static].mapJson(_.dropNullValues)
  implicit val decoderStaticChunkingStrategy1Static: Decoder[StaticChunkingStrategy1Static] = deriveDecoder[StaticChunkingStrategy1Static]
}

/**
* 
* @param `type` Always `static`.
* @param `static` 
*/

case class StaticChunkingStrategyRequestParam(
  `type`: String,
  `static`: StaticChunkingStrategy
) extends ChunkingStrategyRequestParam with CreateVectorStoreRequestChunkingStrategy with VectorStoreFileObjectChunkingStrategy
object StaticChunkingStrategyRequestParam {
  implicit val encoderStaticChunkingStrategyRequestParam: Encoder[StaticChunkingStrategyRequestParam] = deriveEncoder[StaticChunkingStrategyRequestParam].mapJson(_.dropNullValues)
  implicit val decoderStaticChunkingStrategyRequestParam: Decoder[StaticChunkingStrategyRequestParam] = deriveDecoder[StaticChunkingStrategyRequestParam]
}

/**
* 
* @param maxUnderscorechunkUnderscoresizeUnderscoretokens The maximum number of tokens in each chunk. The default value is `800`. The minimum value is `100` and the maximum value is `4096`.
* @param chunkUnderscoreoverlapUnderscoretokens The number of tokens that overlap between chunks. The default value is `400`.  Note that the overlap must not exceed half of `max_chunk_size_tokens`. 
*/

case class StaticChunkingStrategyStatic(
  maxUnderscorechunkUnderscoresizeUnderscoretokens: Refined[Int, GreaterEqual[100] And LessEqual[4096]],
  chunkUnderscoreoverlapUnderscoretokens: Int
)
object StaticChunkingStrategyStatic {
  implicit val encoderStaticChunkingStrategyStatic: Encoder[StaticChunkingStrategyStatic] = deriveEncoder[StaticChunkingStrategyStatic].mapJson(_.dropNullValues)
  implicit val decoderStaticChunkingStrategyStatic: Decoder[StaticChunkingStrategyStatic] = deriveDecoder[StaticChunkingStrategyStatic]
}

/**
* 
* @param toolUnderscoreoutputs A list of tools for which the outputs are being submitted.
* @param stream If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. 
*/

case class SubmitToolOutputsRunRequest(
  toolUnderscoreoutputs: List[SubmitToolOutputsRunRequestToolOutputsInner],
  stream: Option[Boolean]
)
object SubmitToolOutputsRunRequest {
  implicit val encoderSubmitToolOutputsRunRequest: Encoder[SubmitToolOutputsRunRequest] = deriveEncoder[SubmitToolOutputsRunRequest].mapJson(_.dropNullValues)
  implicit val decoderSubmitToolOutputsRunRequest: Decoder[SubmitToolOutputsRunRequest] = deriveDecoder[SubmitToolOutputsRunRequest]
}

/**
* 
* @param toolUnderscorecallUnderscoreid The ID of the tool call in the `required_action` object within the run object the output is being submitted for.
* @param output The output of the tool call to be submitted to continue the run.
*/

case class SubmitToolOutputsRunRequestToolOutputsInner(
  toolUnderscorecallUnderscoreid: Option[String],
  output: Option[String]
)
object SubmitToolOutputsRunRequestToolOutputsInner {
  implicit val encoderSubmitToolOutputsRunRequestToolOutputsInner: Encoder[SubmitToolOutputsRunRequestToolOutputsInner] = deriveEncoder[SubmitToolOutputsRunRequestToolOutputsInner].mapJson(_.dropNullValues)
  implicit val decoderSubmitToolOutputsRunRequestToolOutputsInner: Decoder[SubmitToolOutputsRunRequestToolOutputsInner] = deriveDecoder[SubmitToolOutputsRunRequestToolOutputsInner]
}

/**
* Represents a thread that contains [messages](/docs/api-reference/messages).
* @param id The identifier, which can be referenced in API endpoints.
* @param `object` The object type, which is always `thread`.
* @param createdUnderscoreat The Unix timestamp (in seconds) for when the thread was created.
* @param toolUnderscoreresources 
* @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
*/

case class ThreadObject(
  id: String,
  `object`: String,
  createdUnderscoreat: Int,
  toolUnderscoreresources: ThreadObjectToolResources,
  metadata: Object
)
object ThreadObject {
  implicit val encoderThreadObject: Encoder[ThreadObject] = deriveEncoder[ThreadObject].mapJson(_.dropNullValues)
  implicit val decoderThreadObject: Decoder[ThreadObject] = deriveDecoder[ThreadObject]
}

/**
* A set of resources that are made available to the assistant's tools in this thread. The resources are specific to the type of tool. For example, the `code_interpreter` tool requires a list of file IDs, while the `file_search` tool requires a list of vector store IDs. 
* @param codeUnderscoreinterpreter 
* @param fileUnderscoresearch 
*/

case class ThreadObjectToolResources(
  codeUnderscoreinterpreter: Option[ThreadObjectToolResourcesCodeInterpreter],
  fileUnderscoresearch: Option[ThreadObjectToolResourcesFileSearch]
)
object ThreadObjectToolResources {
  implicit val encoderThreadObjectToolResources: Encoder[ThreadObjectToolResources] = deriveEncoder[ThreadObjectToolResources].mapJson(_.dropNullValues)
  implicit val decoderThreadObjectToolResources: Decoder[ThreadObjectToolResources] = deriveDecoder[ThreadObjectToolResources]
}

/**
* 
* @param fileUnderscoreids A list of [file](/docs/api-reference/files) IDs made available to the `code_interpreter` tool. There can be a maximum of 20 files associated with the tool. 
*/

case class ThreadObjectToolResourcesCodeInterpreter(
  fileUnderscoreids: Option[Refined[List[String], MaxSize[20]]]
)
object ThreadObjectToolResourcesCodeInterpreter {
  implicit val encoderThreadObjectToolResourcesCodeInterpreter: Encoder[ThreadObjectToolResourcesCodeInterpreter] = deriveEncoder[ThreadObjectToolResourcesCodeInterpreter].mapJson(_.dropNullValues)
  implicit val decoderThreadObjectToolResourcesCodeInterpreter: Decoder[ThreadObjectToolResourcesCodeInterpreter] = deriveDecoder[ThreadObjectToolResourcesCodeInterpreter]
}

/**
* 
* @param vectorUnderscorestoreUnderscoreids The [vector store](/docs/api-reference/vector-stores/object) attached to this thread. There can be a maximum of 1 vector store attached to the thread. 
*/

case class ThreadObjectToolResourcesFileSearch(
  vectorUnderscorestoreUnderscoreids: Option[Refined[List[String], MaxSize[1]]]
)
object ThreadObjectToolResourcesFileSearch {
  implicit val encoderThreadObjectToolResourcesFileSearch: Encoder[ThreadObjectToolResourcesFileSearch] = deriveEncoder[ThreadObjectToolResourcesFileSearch].mapJson(_.dropNullValues)
  implicit val decoderThreadObjectToolResourcesFileSearch: Decoder[ThreadObjectToolResourcesFileSearch] = deriveDecoder[ThreadObjectToolResourcesFileSearch]
}

/**
* Occurs when a new [thread](/docs/api-reference/threads/object) is created.
* @param enabled Whether to enable input audio transcription.
* @param event 
* @param data 
*/

case class ThreadStreamEvent(
  enabled: Option[Boolean],
  event: String,
  data: ThreadObject
) extends AssistantStreamEvent
object ThreadStreamEvent {
  implicit val encoderThreadStreamEvent: Encoder[ThreadStreamEvent] = deriveEncoder[ThreadStreamEvent].mapJson(_.dropNullValues)
  implicit val decoderThreadStreamEvent: Decoder[ThreadStreamEvent] = deriveDecoder[ThreadStreamEvent]
}

/**
* 
* @param id Unique identifier of the segment.
* @param seek Seek offset of the segment.
* @param start Start time of the segment in seconds.
* @param end End time of the segment in seconds.
* @param text Text content of the segment.
* @param tokens Array of token IDs for the text content.
* @param temperature Temperature parameter used for generating the segment.
* @param avgUnderscorelogprob Average logprob of the segment. If the value is lower than -1, consider the logprobs failed.
* @param compressionUnderscoreratio Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed.
* @param noUnderscorespeechUnderscoreprob Probability of no speech in the segment. If the value is higher than 1.0 and the `avg_logprob` is below -1, consider this segment silent.
*/

case class TranscriptionSegment(
  id: Int,
  seek: Int,
  start: Float,
  end: Float,
  text: String,
  tokens: List[Int],
  temperature: Float,
  avgUnderscorelogprob: Float,
  compressionUnderscoreratio: Float,
  noUnderscorespeechUnderscoreprob: Float
)
object TranscriptionSegment {
  implicit val encoderTranscriptionSegment: Encoder[TranscriptionSegment] = deriveEncoder[TranscriptionSegment].mapJson(_.dropNullValues)
  implicit val decoderTranscriptionSegment: Decoder[TranscriptionSegment] = deriveDecoder[TranscriptionSegment]
}

/**
* 
* @param word The text content of the word.
* @param start Start time of the word in seconds.
* @param end End time of the word in seconds.
*/

case class TranscriptionWord(
  word: String,
  start: Float,
  end: Float
)
object TranscriptionWord {
  implicit val encoderTranscriptionWord: Encoder[TranscriptionWord] = deriveEncoder[TranscriptionWord].mapJson(_.dropNullValues)
  implicit val decoderTranscriptionWord: Decoder[TranscriptionWord] = deriveDecoder[TranscriptionWord]
}

/**
* Controls for how a thread will be truncated prior to the run. Use this to control the intial context window of the run.
* @param `type` The truncation strategy to use for the thread. The default is `auto`. If set to `last_messages`, the thread will be truncated to the n most recent messages in the thread. When set to `auto`, messages in the middle of the thread will be dropped to fit the context length of the model, `max_prompt_tokens`.
* @param lastUnderscoremessages The number of most recent messages from the thread when constructing the context for the run.
*/

case class TruncationObject(
  `type`: String,
  lastUnderscoremessages: Option[Refined[Int, GreaterEqual[1]]]
)
object TruncationObject {
  implicit val encoderTruncationObject: Encoder[TruncationObject] = deriveEncoder[TruncationObject].mapJson(_.dropNullValues)
  implicit val decoderTruncationObject: Decoder[TruncationObject] = deriveDecoder[TruncationObject]
}

/**
* 
* @param name The name of the vector store.
* @param expiresUnderscoreafter 
* @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
*/

case class UpdateVectorStoreRequest(
  name: Option[String],
  expiresUnderscoreafter: Option[VectorStoreExpirationAfter],
  metadata: Option[Object]
)
object UpdateVectorStoreRequest {
  implicit val encoderUpdateVectorStoreRequest: Encoder[UpdateVectorStoreRequest] = deriveEncoder[UpdateVectorStoreRequest].mapJson(_.dropNullValues)
  implicit val decoderUpdateVectorStoreRequest: Decoder[UpdateVectorStoreRequest] = deriveDecoder[UpdateVectorStoreRequest]
}

/**
* The Upload object can accept byte chunks in the form of Parts. 
* @param id The Upload unique identifier, which can be referenced in API endpoints.
* @param createdUnderscoreat The Unix timestamp (in seconds) for when the Upload was created.
* @param filename The name of the file to be uploaded.
* @param bytes The intended number of bytes to be uploaded.
* @param purpose The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values.
* @param status The status of the Upload.
* @param expiresUnderscoreat The Unix timestamp (in seconds) for when the Upload was created.
* @param `object` The object type, which is always \"upload\".
* @param file 
*/

case class Upload(
  id: String,
  createdUnderscoreat: Int,
  filename: String,
  bytes: Int,
  purpose: String,
  status: String,
  expiresUnderscoreat: Int,
  `object`: Option[String],
  file: Option[OpenAIFile]
)
object Upload {
  implicit val encoderUpload: Encoder[Upload] = deriveEncoder[Upload].mapJson(_.dropNullValues)
  implicit val decoderUpload: Decoder[Upload] = deriveDecoder[Upload]
}

/**
* The upload Part represents a chunk of bytes we can add to an Upload object. 
* @param id The upload Part unique identifier, which can be referenced in API endpoints.
* @param createdUnderscoreat The Unix timestamp (in seconds) for when the Part was created.
* @param uploadUnderscoreid The ID of the Upload object that this Part was added to.
* @param `object` The object type, which is always `upload.part`.
*/

case class UploadPart(
  id: String,
  createdUnderscoreat: Int,
  uploadUnderscoreid: String,
  `object`: String
)
object UploadPart {
  implicit val encoderUploadPart: Encoder[UploadPart] = deriveEncoder[UploadPart].mapJson(_.dropNullValues)
  implicit val decoderUploadPart: Decoder[UploadPart] = deriveDecoder[UploadPart]
}

/**
* The aggregated audio speeches usage details of the specific time bucket.
* @param `object` 
* @param characters The number of characters processed.
* @param numUnderscoremodelUnderscorerequests The count of requests made to the model.
* @param projectUnderscoreid When `group_by=project_id`, this field provides the project ID of the grouped usage result.
* @param userUnderscoreid When `group_by=user_id`, this field provides the user ID of the grouped usage result.
* @param apiUnderscorekeyUnderscoreid When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
* @param model When `group_by=model`, this field provides the model name of the grouped usage result.
*/

case class UsageAudioSpeechesResult(
  `object`: String,
  characters: Int,
  numUnderscoremodelUnderscorerequests: Int,
  projectUnderscoreid: Option[String],
  userUnderscoreid: Option[String],
  apiUnderscorekeyUnderscoreid: Option[String],
  model: Option[String]
) extends UsageTimeBucketResultInner
object UsageAudioSpeechesResult {
  implicit val encoderUsageAudioSpeechesResult: Encoder[UsageAudioSpeechesResult] = deriveEncoder[UsageAudioSpeechesResult].mapJson(_.dropNullValues)
  implicit val decoderUsageAudioSpeechesResult: Decoder[UsageAudioSpeechesResult] = deriveDecoder[UsageAudioSpeechesResult]
}

/**
* The aggregated audio transcriptions usage details of the specific time bucket.
* @param `object` 
* @param seconds The number of seconds processed.
* @param numUnderscoremodelUnderscorerequests The count of requests made to the model.
* @param projectUnderscoreid When `group_by=project_id`, this field provides the project ID of the grouped usage result.
* @param userUnderscoreid When `group_by=user_id`, this field provides the user ID of the grouped usage result.
* @param apiUnderscorekeyUnderscoreid When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
* @param model When `group_by=model`, this field provides the model name of the grouped usage result.
*/

case class UsageAudioTranscriptionsResult(
  `object`: String,
  seconds: Int,
  numUnderscoremodelUnderscorerequests: Int,
  projectUnderscoreid: Option[String],
  userUnderscoreid: Option[String],
  apiUnderscorekeyUnderscoreid: Option[String],
  model: Option[String]
) extends UsageTimeBucketResultInner
object UsageAudioTranscriptionsResult {
  implicit val encoderUsageAudioTranscriptionsResult: Encoder[UsageAudioTranscriptionsResult] = deriveEncoder[UsageAudioTranscriptionsResult].mapJson(_.dropNullValues)
  implicit val decoderUsageAudioTranscriptionsResult: Decoder[UsageAudioTranscriptionsResult] = deriveDecoder[UsageAudioTranscriptionsResult]
}

/**
* The aggregated code interpreter sessions usage details of the specific time bucket.
* @param `object` 
* @param sessions The number of code interpreter sessions.
* @param projectUnderscoreid When `group_by=project_id`, this field provides the project ID of the grouped usage result.
*/

case class UsageCodeInterpreterSessionsResult(
  `object`: String,
  sessions: Int,
  projectUnderscoreid: Option[String]
) extends UsageTimeBucketResultInner
object UsageCodeInterpreterSessionsResult {
  implicit val encoderUsageCodeInterpreterSessionsResult: Encoder[UsageCodeInterpreterSessionsResult] = deriveEncoder[UsageCodeInterpreterSessionsResult].mapJson(_.dropNullValues)
  implicit val decoderUsageCodeInterpreterSessionsResult: Decoder[UsageCodeInterpreterSessionsResult] = deriveDecoder[UsageCodeInterpreterSessionsResult]
}

/**
* The aggregated completions usage details of the specific time bucket.
* @param `object` 
* @param inputUnderscoretokens The aggregated number of text input tokens used, including cached tokens. For customers subscribe to scale tier, this includes scale tier tokens.
* @param inputUnderscorecachedUnderscoretokens The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens.
* @param outputUnderscoretokens The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens.
* @param inputUnderscoreaudioUnderscoretokens The aggregated number of audio input tokens used, including cached tokens.
* @param outputUnderscoreaudioUnderscoretokens The aggregated number of audio output tokens used.
* @param numUnderscoremodelUnderscorerequests The count of requests made to the model.
* @param projectUnderscoreid When `group_by=project_id`, this field provides the project ID of the grouped usage result.
* @param userUnderscoreid When `group_by=user_id`, this field provides the user ID of the grouped usage result.
* @param apiUnderscorekeyUnderscoreid When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
* @param model When `group_by=model`, this field provides the model name of the grouped usage result.
* @param batch When `group_by=batch`, this field tells whether the grouped usage result is batch or not.
*/

case class UsageCompletionsResult(
  `object`: String,
  inputUnderscoretokens: Int,
  inputUnderscorecachedUnderscoretokens: Option[Int],
  outputUnderscoretokens: Int,
  inputUnderscoreaudioUnderscoretokens: Option[Int],
  outputUnderscoreaudioUnderscoretokens: Option[Int],
  numUnderscoremodelUnderscorerequests: Int,
  projectUnderscoreid: Option[String],
  userUnderscoreid: Option[String],
  apiUnderscorekeyUnderscoreid: Option[String],
  model: Option[String],
  batch: Option[Boolean]
) extends UsageTimeBucketResultInner
object UsageCompletionsResult {
  implicit val encoderUsageCompletionsResult: Encoder[UsageCompletionsResult] = deriveEncoder[UsageCompletionsResult].mapJson(_.dropNullValues)
  implicit val decoderUsageCompletionsResult: Decoder[UsageCompletionsResult] = deriveDecoder[UsageCompletionsResult]
}

/**
* The aggregated embeddings usage details of the specific time bucket.
* @param `object` 
* @param inputUnderscoretokens The aggregated number of input tokens used.
* @param numUnderscoremodelUnderscorerequests The count of requests made to the model.
* @param projectUnderscoreid When `group_by=project_id`, this field provides the project ID of the grouped usage result.
* @param userUnderscoreid When `group_by=user_id`, this field provides the user ID of the grouped usage result.
* @param apiUnderscorekeyUnderscoreid When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
* @param model When `group_by=model`, this field provides the model name of the grouped usage result.
*/

case class UsageEmbeddingsResult(
  `object`: String,
  inputUnderscoretokens: Int,
  numUnderscoremodelUnderscorerequests: Int,
  projectUnderscoreid: Option[String],
  userUnderscoreid: Option[String],
  apiUnderscorekeyUnderscoreid: Option[String],
  model: Option[String]
) extends UsageTimeBucketResultInner
object UsageEmbeddingsResult {
  implicit val encoderUsageEmbeddingsResult: Encoder[UsageEmbeddingsResult] = deriveEncoder[UsageEmbeddingsResult].mapJson(_.dropNullValues)
  implicit val decoderUsageEmbeddingsResult: Decoder[UsageEmbeddingsResult] = deriveDecoder[UsageEmbeddingsResult]
}

/**
* The aggregated images usage details of the specific time bucket.
* @param `object` 
* @param images The number of images processed.
* @param numUnderscoremodelUnderscorerequests The count of requests made to the model.
* @param source When `group_by=source`, this field provides the source of the grouped usage result, possible values are `image.generation`, `image.edit`, `image.variation`.
* @param size When `group_by=size`, this field provides the image size of the grouped usage result.
* @param projectUnderscoreid When `group_by=project_id`, this field provides the project ID of the grouped usage result.
* @param userUnderscoreid When `group_by=user_id`, this field provides the user ID of the grouped usage result.
* @param apiUnderscorekeyUnderscoreid When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
* @param model When `group_by=model`, this field provides the model name of the grouped usage result.
*/

case class UsageImagesResult(
  `object`: String,
  images: Int,
  numUnderscoremodelUnderscorerequests: Int,
  source: Option[String],
  size: Option[String],
  projectUnderscoreid: Option[String],
  userUnderscoreid: Option[String],
  apiUnderscorekeyUnderscoreid: Option[String],
  model: Option[String]
) extends UsageTimeBucketResultInner
object UsageImagesResult {
  implicit val encoderUsageImagesResult: Encoder[UsageImagesResult] = deriveEncoder[UsageImagesResult].mapJson(_.dropNullValues)
  implicit val decoderUsageImagesResult: Decoder[UsageImagesResult] = deriveDecoder[UsageImagesResult]
}

/**
* The aggregated moderations usage details of the specific time bucket.
* @param `object` 
* @param inputUnderscoretokens The aggregated number of input tokens used.
* @param numUnderscoremodelUnderscorerequests The count of requests made to the model.
* @param projectUnderscoreid When `group_by=project_id`, this field provides the project ID of the grouped usage result.
* @param userUnderscoreid When `group_by=user_id`, this field provides the user ID of the grouped usage result.
* @param apiUnderscorekeyUnderscoreid When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
* @param model When `group_by=model`, this field provides the model name of the grouped usage result.
*/

case class UsageModerationsResult(
  `object`: String,
  inputUnderscoretokens: Int,
  numUnderscoremodelUnderscorerequests: Int,
  projectUnderscoreid: Option[String],
  userUnderscoreid: Option[String],
  apiUnderscorekeyUnderscoreid: Option[String],
  model: Option[String]
) extends UsageTimeBucketResultInner
object UsageModerationsResult {
  implicit val encoderUsageModerationsResult: Encoder[UsageModerationsResult] = deriveEncoder[UsageModerationsResult].mapJson(_.dropNullValues)
  implicit val decoderUsageModerationsResult: Decoder[UsageModerationsResult] = deriveDecoder[UsageModerationsResult]
}

/**
* 
* @param `object` 
* @param data 
* @param hasUnderscoremore 
* @param nextUnderscorepage 
*/

case class UsageResponse(
  `object`: String,
  data: List[UsageTimeBucket],
  hasUnderscoremore: Boolean,
  nextUnderscorepage: String
)
object UsageResponse {
  implicit val encoderUsageResponse: Encoder[UsageResponse] = deriveEncoder[UsageResponse].mapJson(_.dropNullValues)
  implicit val decoderUsageResponse: Decoder[UsageResponse] = deriveDecoder[UsageResponse]
}

/**
* 
* @param `object` 
* @param startUnderscoretime 
* @param endUnderscoretime 
* @param result 
*/

case class UsageTimeBucket(
  `object`: String,
  startUnderscoretime: Int,
  endUnderscoretime: Int,
  result: List[UsageTimeBucketResultInner]
)
object UsageTimeBucket {
  implicit val encoderUsageTimeBucket: Encoder[UsageTimeBucket] = deriveEncoder[UsageTimeBucket].mapJson(_.dropNullValues)
  implicit val decoderUsageTimeBucket: Decoder[UsageTimeBucket] = deriveDecoder[UsageTimeBucket]
}

/**
* 
* @param `object` 
* @param inputUnderscoretokens The aggregated number of input tokens used.
* @param inputUnderscorecachedUnderscoretokens The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens.
* @param outputUnderscoretokens The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens.
* @param inputUnderscoreaudioUnderscoretokens The aggregated number of audio input tokens used, including cached tokens.
* @param outputUnderscoreaudioUnderscoretokens The aggregated number of audio output tokens used.
* @param numUnderscoremodelUnderscorerequests The count of requests made to the model.
* @param projectUnderscoreid When `group_by=project_id`, this field provides the project ID of the grouped costs result.
* @param userUnderscoreid When `group_by=user_id`, this field provides the user ID of the grouped usage result.
* @param apiUnderscorekeyUnderscoreid When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
* @param model When `group_by=model`, this field provides the model name of the grouped usage result.
* @param batch When `group_by=batch`, this field tells whether the grouped usage result is batch or not.
* @param images The number of images processed.
* @param source When `group_by=source`, this field provides the source of the grouped usage result, possible values are `image.generation`, `image.edit`, `image.variation`.
* @param size When `group_by=size`, this field provides the image size of the grouped usage result.
* @param characters The number of characters processed.
* @param seconds The number of seconds processed.
* @param usageUnderscorebytes The vector stores usage in bytes.
* @param sessions The number of code interpreter sessions.
* @param amount 
* @param lineUnderscoreitem When `group_by=line_item`, this field provides the line item of the grouped costs result.
*/
sealed trait UsageTimeBucketResultInner
object UsageTimeBucketResultInner {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val usageTimeBucketResultInnerEncoder: Encoder[UsageTimeBucketResultInner] = Encoder.instance {
    case costsResult: CostsResult => costsResult.asJson
    case usageAudioSpeechesResult: UsageAudioSpeechesResult => usageAudioSpeechesResult.asJson
    case usageAudioTranscriptionsResult: UsageAudioTranscriptionsResult => usageAudioTranscriptionsResult.asJson
    case usageCodeInterpreterSessionsResult: UsageCodeInterpreterSessionsResult => usageCodeInterpreterSessionsResult.asJson
    case usageCompletionsResult: UsageCompletionsResult => usageCompletionsResult.asJson
    case usageEmbeddingsResult: UsageEmbeddingsResult => usageEmbeddingsResult.asJson
    case usageImagesResult: UsageImagesResult => usageImagesResult.asJson
    case usageModerationsResult: UsageModerationsResult => usageModerationsResult.asJson
    case usageVectorStoresResult: UsageVectorStoresResult => usageVectorStoresResult.asJson
  }

  implicit val usageTimeBucketResultInnerDecoder: Decoder[UsageTimeBucketResultInner] =
    List[Decoder[UsageTimeBucketResultInner]](
      Decoder[CostsResult].widen,
      Decoder[UsageAudioSpeechesResult].widen,
      Decoder[UsageAudioTranscriptionsResult].widen,
      Decoder[UsageCodeInterpreterSessionsResult].widen,
      Decoder[UsageCompletionsResult].widen,
      Decoder[UsageEmbeddingsResult].widen,
      Decoder[UsageImagesResult].widen,
      Decoder[UsageModerationsResult].widen,
      Decoder[UsageVectorStoresResult].widen,
  ).reduceLeft(_ or _)
}


/**
* The aggregated vector stores usage details of the specific time bucket.
* @param `object` 
* @param usageUnderscorebytes The vector stores usage in bytes.
* @param projectUnderscoreid When `group_by=project_id`, this field provides the project ID of the grouped usage result.
*/

case class UsageVectorStoresResult(
  `object`: String,
  usageUnderscorebytes: Int,
  projectUnderscoreid: Option[String]
) extends UsageTimeBucketResultInner
object UsageVectorStoresResult {
  implicit val encoderUsageVectorStoresResult: Encoder[UsageVectorStoresResult] = deriveEncoder[UsageVectorStoresResult].mapJson(_.dropNullValues)
  implicit val decoderUsageVectorStoresResult: Decoder[UsageVectorStoresResult] = deriveDecoder[UsageVectorStoresResult]
}

/**
* Represents an individual `user` within an organization.
* @param `object` The object type, which is always `organization.user`
* @param id The identifier, which can be referenced in API endpoints
* @param name The name of the user
* @param email The email address of the user
* @param role `owner` or `reader`
* @param addedUnderscoreat The Unix timestamp (in seconds) of when the user was added.
*/

case class User(
  `object`: String,
  id: String,
  name: String,
  email: String,
  role: String,
  addedUnderscoreat: Int
)
object User {
  implicit val encoderUser: Encoder[User] = deriveEncoder[User].mapJson(_.dropNullValues)
  implicit val decoderUser: Decoder[User] = deriveDecoder[User]
}

/**
* 
* @param `object` 
* @param id 
* @param deleted 
*/

case class UserDeleteResponse(
  `object`: String,
  id: String,
  deleted: Boolean
)
object UserDeleteResponse {
  implicit val encoderUserDeleteResponse: Encoder[UserDeleteResponse] = deriveEncoder[UserDeleteResponse].mapJson(_.dropNullValues)
  implicit val decoderUserDeleteResponse: Decoder[UserDeleteResponse] = deriveDecoder[UserDeleteResponse]
}

/**
* 
* @param `object` 
* @param data 
* @param firstUnderscoreid 
* @param lastUnderscoreid 
* @param hasUnderscoremore 
*/

case class UserListResponse(
  `object`: String,
  data: List[User],
  firstUnderscoreid: String,
  lastUnderscoreid: String,
  hasUnderscoremore: Boolean
)
object UserListResponse {
  implicit val encoderUserListResponse: Encoder[UserListResponse] = deriveEncoder[UserListResponse].mapJson(_.dropNullValues)
  implicit val decoderUserListResponse: Decoder[UserListResponse] = deriveDecoder[UserListResponse]
}

/**
* 
* @param role `owner` or `reader`
*/

case class UserRoleUpdateRequest(
  role: String
)
object UserRoleUpdateRequest {
  implicit val encoderUserRoleUpdateRequest: Encoder[UserRoleUpdateRequest] = deriveEncoder[UserRoleUpdateRequest].mapJson(_.dropNullValues)
  implicit val decoderUserRoleUpdateRequest: Decoder[UserRoleUpdateRequest] = deriveDecoder[UserRoleUpdateRequest]
}

/**
* The expiration policy for a vector store.
* @param anchor Anchor timestamp after which the expiration policy applies. Supported anchors: `last_active_at`.
* @param days The number of days after the anchor time that the vector store will expire.
*/

case class VectorStoreExpirationAfter(
  anchor: String,
  days: Refined[Int, GreaterEqual[1] And LessEqual[365]]
)
object VectorStoreExpirationAfter {
  implicit val encoderVectorStoreExpirationAfter: Encoder[VectorStoreExpirationAfter] = deriveEncoder[VectorStoreExpirationAfter].mapJson(_.dropNullValues)
  implicit val decoderVectorStoreExpirationAfter: Decoder[VectorStoreExpirationAfter] = deriveDecoder[VectorStoreExpirationAfter]
}

/**
* A batch of files attached to a vector store.
* @param id The identifier, which can be referenced in API endpoints.
* @param `object` The object type, which is always `vector_store.file_batch`.
* @param createdUnderscoreat The Unix timestamp (in seconds) for when the vector store files batch was created.
* @param vectorUnderscorestoreUnderscoreid The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to.
* @param status The status of the vector store files batch, which can be either `in_progress`, `completed`, `cancelled` or `failed`.
* @param fileUnderscorecounts 
*/

case class VectorStoreFileBatchObject(
  id: String,
  `object`: String,
  createdUnderscoreat: Int,
  vectorUnderscorestoreUnderscoreid: String,
  status: String,
  fileUnderscorecounts: VectorStoreFileBatchObjectFileCounts
)
object VectorStoreFileBatchObject {
  implicit val encoderVectorStoreFileBatchObject: Encoder[VectorStoreFileBatchObject] = deriveEncoder[VectorStoreFileBatchObject].mapJson(_.dropNullValues)
  implicit val decoderVectorStoreFileBatchObject: Decoder[VectorStoreFileBatchObject] = deriveDecoder[VectorStoreFileBatchObject]
}

/**
* 
* @param inUnderscoreprogress The number of files that are currently being processed.
* @param completed The number of files that have been processed.
* @param failed The number of files that have failed to process.
* @param cancelled The number of files that where cancelled.
* @param total The total number of files.
*/

case class VectorStoreFileBatchObjectFileCounts(
  inUnderscoreprogress: Int,
  completed: Int,
  failed: Int,
  cancelled: Int,
  total: Int
)
object VectorStoreFileBatchObjectFileCounts {
  implicit val encoderVectorStoreFileBatchObjectFileCounts: Encoder[VectorStoreFileBatchObjectFileCounts] = deriveEncoder[VectorStoreFileBatchObjectFileCounts].mapJson(_.dropNullValues)
  implicit val decoderVectorStoreFileBatchObjectFileCounts: Decoder[VectorStoreFileBatchObjectFileCounts] = deriveDecoder[VectorStoreFileBatchObjectFileCounts]
}

/**
* A list of files attached to a vector store.
* @param id The identifier, which can be referenced in API endpoints.
* @param `object` The object type, which is always `vector_store.file`.
* @param usageUnderscorebytes The total vector store usage in bytes. Note that this may be different from the original file size.
* @param createdUnderscoreat The Unix timestamp (in seconds) for when the vector store file was created.
* @param vectorUnderscorestoreUnderscoreid The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to.
* @param status The status of the vector store file, which can be either `in_progress`, `completed`, `cancelled`, or `failed`. The status `completed` indicates that the vector store file is ready for use.
* @param lastUnderscoreerror 
* @param chunkingUnderscorestrategy 
*/

case class VectorStoreFileObject(
  id: String,
  `object`: String,
  usageUnderscorebytes: Int,
  createdUnderscoreat: Int,
  vectorUnderscorestoreUnderscoreid: String,
  status: String,
  lastUnderscoreerror: VectorStoreFileObjectLastError,
  chunkingUnderscorestrategy: Option[VectorStoreFileObjectChunkingStrategy]
)
object VectorStoreFileObject {
  implicit val encoderVectorStoreFileObject: Encoder[VectorStoreFileObject] = deriveEncoder[VectorStoreFileObject].mapJson(_.dropNullValues)
  implicit val decoderVectorStoreFileObject: Decoder[VectorStoreFileObject] = deriveDecoder[VectorStoreFileObject]
}

/**
* The strategy used to chunk the file.
* @param `type` Always `static`.
* @param `static` 
*/
sealed trait VectorStoreFileObjectChunkingStrategy
object VectorStoreFileObjectChunkingStrategy {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val vectorStoreFileObjectChunkingStrategyEncoder: Encoder[VectorStoreFileObjectChunkingStrategy] = Encoder.instance {
    case otherChunkingStrategyResponseParam: OtherChunkingStrategyResponseParam => otherChunkingStrategyResponseParam.asJson
    case staticChunkingStrategyRequestParam: StaticChunkingStrategyRequestParam => staticChunkingStrategyRequestParam.asJson
  }

  implicit val vectorStoreFileObjectChunkingStrategyDecoder: Decoder[VectorStoreFileObjectChunkingStrategy] =
    List[Decoder[VectorStoreFileObjectChunkingStrategy]](
      Decoder[OtherChunkingStrategyResponseParam].widen,
      Decoder[StaticChunkingStrategyRequestParam].widen,
  ).reduceLeft(_ or _)
}


/**
* The last error associated with this vector store file. Will be `null` if there are no errors.
* @param code One of `server_error` or `rate_limit_exceeded`.
* @param message A human-readable description of the error.
*/

case class VectorStoreFileObjectLastError(
  code: String,
  message: String
)
object VectorStoreFileObjectLastError {
  implicit val encoderVectorStoreFileObjectLastError: Encoder[VectorStoreFileObjectLastError] = deriveEncoder[VectorStoreFileObjectLastError].mapJson(_.dropNullValues)
  implicit val decoderVectorStoreFileObjectLastError: Decoder[VectorStoreFileObjectLastError] = deriveDecoder[VectorStoreFileObjectLastError]
}

/**
* A vector store is a collection of processed files can be used by the `file_search` tool.
* @param id The identifier, which can be referenced in API endpoints.
* @param `object` The object type, which is always `vector_store`.
* @param createdUnderscoreat The Unix timestamp (in seconds) for when the vector store was created.
* @param name The name of the vector store.
* @param usageUnderscorebytes The total number of bytes used by the files in the vector store.
* @param fileUnderscorecounts 
* @param status The status of the vector store, which can be either `expired`, `in_progress`, or `completed`. A status of `completed` indicates that the vector store is ready for use.
* @param expiresUnderscoreafter 
* @param expiresUnderscoreat The Unix timestamp (in seconds) for when the vector store will expire.
* @param lastUnderscoreactiveUnderscoreat The Unix timestamp (in seconds) for when the vector store was last active.
* @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
*/

case class VectorStoreObject(
  id: String,
  `object`: String,
  createdUnderscoreat: Int,
  name: String,
  usageUnderscorebytes: Int,
  fileUnderscorecounts: VectorStoreObjectFileCounts,
  status: String,
  expiresUnderscoreafter: Option[VectorStoreExpirationAfter],
  expiresUnderscoreat: Option[Int],
  lastUnderscoreactiveUnderscoreat: Int,
  metadata: Object
)
object VectorStoreObject {
  implicit val encoderVectorStoreObject: Encoder[VectorStoreObject] = deriveEncoder[VectorStoreObject].mapJson(_.dropNullValues)
  implicit val decoderVectorStoreObject: Decoder[VectorStoreObject] = deriveDecoder[VectorStoreObject]
}

/**
* 
* @param inUnderscoreprogress The number of files that are currently being processed.
* @param completed The number of files that have been successfully processed.
* @param failed The number of files that have failed to process.
* @param cancelled The number of files that were cancelled.
* @param total The total number of files.
*/

case class VectorStoreObjectFileCounts(
  inUnderscoreprogress: Int,
  completed: Int,
  failed: Int,
  cancelled: Int,
  total: Int
)
object VectorStoreObjectFileCounts {
  implicit val encoderVectorStoreObjectFileCounts: Encoder[VectorStoreObjectFileCounts] = deriveEncoder[VectorStoreObjectFileCounts].mapJson(_.dropNullValues)
  implicit val decoderVectorStoreObjectFileCounts: Decoder[VectorStoreObjectFileCounts] = deriveDecoder[VectorStoreObjectFileCounts]
}

