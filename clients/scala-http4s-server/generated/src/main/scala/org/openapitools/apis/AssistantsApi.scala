package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.AssistantObject
import org.openapitools.models.CreateAssistantRequest
import org.openapitools.models.CreateMessageRequest
import org.openapitools.models.CreateRunRequest
import org.openapitools.models.CreateThreadAndRunRequest
import org.openapitools.models.CreateThreadRequest
import org.openapitools.models.DeleteAssistantResponse
import org.openapitools.models.DeleteMessageResponse
import org.openapitools.models.DeleteThreadResponse
import org.openapitools.models.ListAssistantsResponse
import org.openapitools.models.ListMessagesResponse
import org.openapitools.models.ListRunStepsResponse
import org.openapitools.models.ListRunsResponse
import org.openapitools.models.MessageObject
import org.openapitools.models.ModifyAssistantRequest
import org.openapitools.models.ModifyMessageRequest
import org.openapitools.models.ModifyRunRequest
import org.openapitools.models.ModifyThreadRequest
import org.openapitools.models.RunObject
import org.openapitools.models.RunStepObject
import org.openapitools.models.SubmitToolOutputsRunRequest
import org.openapitools.models.ThreadObject


import cats.Monad
import cats.syntax.all._

import org.http4s._
import org.http4s.circe._
import org.http4s.server._
import org.http4s.headers._
import org.http4s.dsl.Http4sDsl
import org.http4s.circe.CirceEntityEncoder._

final case class AssistantsApiRoutes[
  F[_]: JsonDecoder: Monad, ApiKeyAuth
](delegate: AssistantsApiDelegate[F, ApiKeyAuth]) extends Http4sDsl[F] {
  object cancelRun {
    import AssistantsApiDelegate.cancelRunResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ POST -> Root / "threads" / thread_id / "runs" / run_id / "cancel") as auth =>
        delegate.cancelRun.handle_ApiKeyAuth(auth, req, thread_id, run_id, responses)

    }

    val responses: cancelRunResponses[F] = new cancelRunResponses[F] {
      def resp200(value: RunObject): F[Response[F]] = Ok(value)
    }
  }
  object createAssistant {
    import AssistantsApiDelegate.createAssistantResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ POST -> Root / "assistants") as auth =>
          delegate.createAssistant.handle_ApiKeyAuth(auth, req, req.asJsonDecode[CreateAssistantRequest] , responses)

    }

    val responses: createAssistantResponses[F] = new createAssistantResponses[F] {
      def resp200(value: AssistantObject): F[Response[F]] = Ok(value)
    }
  }
  object createMessage {
    import AssistantsApiDelegate.createMessageResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ POST -> Root / "threads" / thread_id / "messages") as auth =>
          delegate.createMessage.handle_ApiKeyAuth(auth, req, req.asJsonDecode[CreateMessageRequest] , thread_id, responses)

    }

    val responses: createMessageResponses[F] = new createMessageResponses[F] {
      def resp200(value: MessageObject): F[Response[F]] = Ok(value)
    }
  }
  object createRun {
    import AssistantsApiDelegate.createRunResponses

    object include[]QueryParam extends OptionalQuerySeqParamDecoderMatcher[String]("include[]")

    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ POST -> Root / "threads" / thread_id / "runs" :? include[]QueryParam(include[])) as auth =>
          delegate.createRun.handle_ApiKeyAuth(auth, req, req.asJsonDecode[CreateRunRequest] , thread_id, include[], responses)

    }

    val responses: createRunResponses[F] = new createRunResponses[F] {
      def resp200(value: RunObject): F[Response[F]] = Ok(value)
    }
  }
  object createThread {
    import AssistantsApiDelegate.createThreadResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ POST -> Root / "threads") as auth =>
          delegate.createThread.handle_ApiKeyAuth(auth, req, req.asJsonDecode[CreateThreadRequest] , responses)

    }

    val responses: createThreadResponses[F] = new createThreadResponses[F] {
      def resp200(value: ThreadObject): F[Response[F]] = Ok(value)
    }
  }
  object createThreadAndRun {
    import AssistantsApiDelegate.createThreadAndRunResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ POST -> Root / "threads" / "runs") as auth =>
          delegate.createThreadAndRun.handle_ApiKeyAuth(auth, req, req.asJsonDecode[CreateThreadAndRunRequest] , responses)

    }

    val responses: createThreadAndRunResponses[F] = new createThreadAndRunResponses[F] {
      def resp200(value: RunObject): F[Response[F]] = Ok(value)
    }
  }
  object deleteAssistant {
    import AssistantsApiDelegate.deleteAssistantResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ DELETE -> Root / "assistants" / assistant_id) as auth =>
        delegate.deleteAssistant.handle_ApiKeyAuth(auth, req, assistant_id, responses)

    }

    val responses: deleteAssistantResponses[F] = new deleteAssistantResponses[F] {
      def resp200(value: DeleteAssistantResponse): F[Response[F]] = Ok(value)
    }
  }
  object deleteMessage {
    import AssistantsApiDelegate.deleteMessageResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ DELETE -> Root / "threads" / thread_id / "messages" / message_id) as auth =>
        delegate.deleteMessage.handle_ApiKeyAuth(auth, req, thread_id, message_id, responses)

    }

    val responses: deleteMessageResponses[F] = new deleteMessageResponses[F] {
      def resp200(value: DeleteMessageResponse): F[Response[F]] = Ok(value)
    }
  }
  object deleteThread {
    import AssistantsApiDelegate.deleteThreadResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ DELETE -> Root / "threads" / thread_id) as auth =>
        delegate.deleteThread.handle_ApiKeyAuth(auth, req, thread_id, responses)

    }

    val responses: deleteThreadResponses[F] = new deleteThreadResponses[F] {
      def resp200(value: DeleteThreadResponse): F[Response[F]] = Ok(value)
    }
  }
  object getAssistant {
    import AssistantsApiDelegate.getAssistantResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ GET -> Root / "assistants" / assistant_id) as auth =>
        delegate.getAssistant.handle_ApiKeyAuth(auth, req, assistant_id, responses)

    }

    val responses: getAssistantResponses[F] = new getAssistantResponses[F] {
      def resp200(value: AssistantObject): F[Response[F]] = Ok(value)
    }
  }
  object getMessage {
    import AssistantsApiDelegate.getMessageResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ GET -> Root / "threads" / thread_id / "messages" / message_id) as auth =>
        delegate.getMessage.handle_ApiKeyAuth(auth, req, thread_id, message_id, responses)

    }

    val responses: getMessageResponses[F] = new getMessageResponses[F] {
      def resp200(value: MessageObject): F[Response[F]] = Ok(value)
    }
  }
  object getRun {
    import AssistantsApiDelegate.getRunResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ GET -> Root / "threads" / thread_id / "runs" / run_id) as auth =>
        delegate.getRun.handle_ApiKeyAuth(auth, req, thread_id, run_id, responses)

    }

    val responses: getRunResponses[F] = new getRunResponses[F] {
      def resp200(value: RunObject): F[Response[F]] = Ok(value)
    }
  }
  object getRunStep {
    import AssistantsApiDelegate.getRunStepResponses

    object include[]QueryParam extends OptionalQuerySeqParamDecoderMatcher[String]("include[]")

    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ GET -> Root / "threads" / thread_id / "runs" / run_id / "steps" / step_id :? include[]QueryParam(include[])) as auth =>
        delegate.getRunStep.handle_ApiKeyAuth(auth, req, thread_id, run_id, step_id, include[], responses)

    }

    val responses: getRunStepResponses[F] = new getRunStepResponses[F] {
      def resp200(value: RunStepObject): F[Response[F]] = Ok(value)
    }
  }
  object getThread {
    import AssistantsApiDelegate.getThreadResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ GET -> Root / "threads" / thread_id) as auth =>
        delegate.getThread.handle_ApiKeyAuth(auth, req, thread_id, responses)

    }

    val responses: getThreadResponses[F] = new getThreadResponses[F] {
      def resp200(value: ThreadObject): F[Response[F]] = Ok(value)
    }
  }
  object listAssistants {
    import AssistantsApiDelegate.listAssistantsResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object orderQueryParam extends OptionalQueryParamDecoderMatcher[String]("order")
    object afterQueryParam extends OptionalQueryParamDecoderMatcher[String]("after")
    object beforeQueryParam extends OptionalQueryParamDecoderMatcher[String]("before")

    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ GET -> Root / "assistants" :? limitQueryParam(limit) +& orderQueryParam(order) +& afterQueryParam(after) +& beforeQueryParam(before)) as auth =>
        delegate.listAssistants.handle_ApiKeyAuth(auth, req, limit, order, after, before, responses)

    }

    val responses: listAssistantsResponses[F] = new listAssistantsResponses[F] {
      def resp200(value: ListAssistantsResponse): F[Response[F]] = Ok(value)
    }
  }
  object listMessages {
    import AssistantsApiDelegate.listMessagesResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object orderQueryParam extends OptionalQueryParamDecoderMatcher[String]("order")
    object afterQueryParam extends OptionalQueryParamDecoderMatcher[String]("after")
    object beforeQueryParam extends OptionalQueryParamDecoderMatcher[String]("before")
    object run_idQueryParam extends OptionalQueryParamDecoderMatcher[String]("run_id")

    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ GET -> Root / "threads" / thread_id / "messages" :? limitQueryParam(limit) +& orderQueryParam(order) +& afterQueryParam(after) +& beforeQueryParam(before) +& run_idQueryParam(run_id)) as auth =>
        delegate.listMessages.handle_ApiKeyAuth(auth, req, thread_id, limit, order, after, before, run_id, responses)

    }

    val responses: listMessagesResponses[F] = new listMessagesResponses[F] {
      def resp200(value: ListMessagesResponse): F[Response[F]] = Ok(value)
    }
  }
  object listRunSteps {
    import AssistantsApiDelegate.listRunStepsResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object orderQueryParam extends OptionalQueryParamDecoderMatcher[String]("order")
    object afterQueryParam extends OptionalQueryParamDecoderMatcher[String]("after")
    object beforeQueryParam extends OptionalQueryParamDecoderMatcher[String]("before")
    object include[]QueryParam extends OptionalQuerySeqParamDecoderMatcher[String]("include[]")

    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ GET -> Root / "threads" / thread_id / "runs" / run_id / "steps" :? limitQueryParam(limit) +& orderQueryParam(order) +& afterQueryParam(after) +& beforeQueryParam(before) +& include[]QueryParam(include[])) as auth =>
        delegate.listRunSteps.handle_ApiKeyAuth(auth, req, thread_id, run_id, limit, order, after, before, include[], responses)

    }

    val responses: listRunStepsResponses[F] = new listRunStepsResponses[F] {
      def resp200(value: ListRunStepsResponse): F[Response[F]] = Ok(value)
    }
  }
  object listRuns {
    import AssistantsApiDelegate.listRunsResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object orderQueryParam extends OptionalQueryParamDecoderMatcher[String]("order")
    object afterQueryParam extends OptionalQueryParamDecoderMatcher[String]("after")
    object beforeQueryParam extends OptionalQueryParamDecoderMatcher[String]("before")

    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ GET -> Root / "threads" / thread_id / "runs" :? limitQueryParam(limit) +& orderQueryParam(order) +& afterQueryParam(after) +& beforeQueryParam(before)) as auth =>
        delegate.listRuns.handle_ApiKeyAuth(auth, req, thread_id, limit, order, after, before, responses)

    }

    val responses: listRunsResponses[F] = new listRunsResponses[F] {
      def resp200(value: ListRunsResponse): F[Response[F]] = Ok(value)
    }
  }
  object modifyAssistant {
    import AssistantsApiDelegate.modifyAssistantResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ POST -> Root / "assistants" / assistant_id) as auth =>
          delegate.modifyAssistant.handle_ApiKeyAuth(auth, req, req.asJsonDecode[ModifyAssistantRequest] , assistant_id, responses)

    }

    val responses: modifyAssistantResponses[F] = new modifyAssistantResponses[F] {
      def resp200(value: AssistantObject): F[Response[F]] = Ok(value)
    }
  }
  object modifyMessage {
    import AssistantsApiDelegate.modifyMessageResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ POST -> Root / "threads" / thread_id / "messages" / message_id) as auth =>
          delegate.modifyMessage.handle_ApiKeyAuth(auth, req, req.asJsonDecode[ModifyMessageRequest] , thread_id, message_id, responses)

    }

    val responses: modifyMessageResponses[F] = new modifyMessageResponses[F] {
      def resp200(value: MessageObject): F[Response[F]] = Ok(value)
    }
  }
  object modifyRun {
    import AssistantsApiDelegate.modifyRunResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ POST -> Root / "threads" / thread_id / "runs" / run_id) as auth =>
          delegate.modifyRun.handle_ApiKeyAuth(auth, req, req.asJsonDecode[ModifyRunRequest] , thread_id, run_id, responses)

    }

    val responses: modifyRunResponses[F] = new modifyRunResponses[F] {
      def resp200(value: RunObject): F[Response[F]] = Ok(value)
    }
  }
  object modifyThread {
    import AssistantsApiDelegate.modifyThreadResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ POST -> Root / "threads" / thread_id) as auth =>
          delegate.modifyThread.handle_ApiKeyAuth(auth, req, req.asJsonDecode[ModifyThreadRequest] , thread_id, responses)

    }

    val responses: modifyThreadResponses[F] = new modifyThreadResponses[F] {
      def resp200(value: ThreadObject): F[Response[F]] = Ok(value)
    }
  }
  object submitToolOuputsToRun {
    import AssistantsApiDelegate.submitToolOuputsToRunResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ POST -> Root / "threads" / thread_id / "runs" / run_id / "submit_tool_outputs") as auth =>
          delegate.submitToolOuputsToRun.handle_ApiKeyAuth(auth, req, req.asJsonDecode[SubmitToolOutputsRunRequest] , thread_id, run_id, responses)

    }

    val responses: submitToolOuputsToRunResponses[F] = new submitToolOuputsToRunResponses[F] {
      def resp200(value: RunObject): F[Response[F]] = Ok(value)
    }
  }

  val routesApiKeyAuth =
    cancelRun.routeApiKeyAuth <+>
    createAssistant.routeApiKeyAuth <+>
    createMessage.routeApiKeyAuth <+>
    createRun.routeApiKeyAuth <+>
    createThread.routeApiKeyAuth <+>
    createThreadAndRun.routeApiKeyAuth <+>
    deleteAssistant.routeApiKeyAuth <+>
    deleteMessage.routeApiKeyAuth <+>
    deleteThread.routeApiKeyAuth <+>
    getAssistant.routeApiKeyAuth <+>
    getMessage.routeApiKeyAuth <+>
    getRun.routeApiKeyAuth <+>
    getRunStep.routeApiKeyAuth <+>
    getThread.routeApiKeyAuth <+>
    listAssistants.routeApiKeyAuth <+>
    listMessages.routeApiKeyAuth <+>
    listRunSteps.routeApiKeyAuth <+>
    listRuns.routeApiKeyAuth <+>
    modifyAssistant.routeApiKeyAuth <+>
    modifyMessage.routeApiKeyAuth <+>
    modifyRun.routeApiKeyAuth <+>
    modifyThread.routeApiKeyAuth <+>
    submitToolOuputsToRun.routeApiKeyAuth
}

object AssistantsApiDelegate {
  trait cancelRunResponses[F[_]] {
    def resp200(value: RunObject): F[Response[F]]
  }

  trait createAssistantResponses[F[_]] {
    def resp200(value: AssistantObject): F[Response[F]]
  }

  trait createMessageResponses[F[_]] {
    def resp200(value: MessageObject): F[Response[F]]
  }

  trait createRunResponses[F[_]] {
    def resp200(value: RunObject): F[Response[F]]
  }

  trait createThreadResponses[F[_]] {
    def resp200(value: ThreadObject): F[Response[F]]
  }

  trait createThreadAndRunResponses[F[_]] {
    def resp200(value: RunObject): F[Response[F]]
  }

  trait deleteAssistantResponses[F[_]] {
    def resp200(value: DeleteAssistantResponse): F[Response[F]]
  }

  trait deleteMessageResponses[F[_]] {
    def resp200(value: DeleteMessageResponse): F[Response[F]]
  }

  trait deleteThreadResponses[F[_]] {
    def resp200(value: DeleteThreadResponse): F[Response[F]]
  }

  trait getAssistantResponses[F[_]] {
    def resp200(value: AssistantObject): F[Response[F]]
  }

  trait getMessageResponses[F[_]] {
    def resp200(value: MessageObject): F[Response[F]]
  }

  trait getRunResponses[F[_]] {
    def resp200(value: RunObject): F[Response[F]]
  }

  trait getRunStepResponses[F[_]] {
    def resp200(value: RunStepObject): F[Response[F]]
  }

  trait getThreadResponses[F[_]] {
    def resp200(value: ThreadObject): F[Response[F]]
  }

  trait listAssistantsResponses[F[_]] {
    def resp200(value: ListAssistantsResponse): F[Response[F]]
  }

  trait listMessagesResponses[F[_]] {
    def resp200(value: ListMessagesResponse): F[Response[F]]
  }

  trait listRunStepsResponses[F[_]] {
    def resp200(value: ListRunStepsResponse): F[Response[F]]
  }

  trait listRunsResponses[F[_]] {
    def resp200(value: ListRunsResponse): F[Response[F]]
  }

  trait modifyAssistantResponses[F[_]] {
    def resp200(value: AssistantObject): F[Response[F]]
  }

  trait modifyMessageResponses[F[_]] {
    def resp200(value: MessageObject): F[Response[F]]
  }

  trait modifyRunResponses[F[_]] {
    def resp200(value: RunObject): F[Response[F]]
  }

  trait modifyThreadResponses[F[_]] {
    def resp200(value: ThreadObject): F[Response[F]]
  }

  trait submitToolOuputsToRunResponses[F[_]] {
    def resp200(value: RunObject): F[Response[F]]
  }

}

trait AssistantsApiDelegate[F[_], ApiKeyAuth] {

  trait cancelRun {
    import AssistantsApiDelegate.cancelRunResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      threadId: String,
      runId: String,
      responses: cancelRunResponses[F]
    ): F[Response[F]]

  }
  def cancelRun: cancelRun


  trait createAssistant {
    import AssistantsApiDelegate.createAssistantResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      createAssistant: F[CreateAssistantRequest],
      responses: createAssistantResponses[F]
    ): F[Response[F]]


  }
  def createAssistant: createAssistant


  trait createMessage {
    import AssistantsApiDelegate.createMessageResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      createMessage: F[CreateMessageRequest],
      threadId: String,
      responses: createMessageResponses[F]
    ): F[Response[F]]


  }
  def createMessage: createMessage


  trait createRun {
    import AssistantsApiDelegate.createRunResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      createRun: F[CreateRunRequest],
      threadId: String,
      includeLeft_Square_BracketRight_Square_Bracket: Option[List[String]],
      responses: createRunResponses[F]
    ): F[Response[F]]


  }
  def createRun: createRun


  trait createThread {
    import AssistantsApiDelegate.createThreadResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      createThread: F[CreateThreadRequest],
      responses: createThreadResponses[F]
    ): F[Response[F]]


  }
  def createThread: createThread


  trait createThreadAndRun {
    import AssistantsApiDelegate.createThreadAndRunResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      createThreadAndRun: F[CreateThreadAndRunRequest],
      responses: createThreadAndRunResponses[F]
    ): F[Response[F]]


  }
  def createThreadAndRun: createThreadAndRun


  trait deleteAssistant {
    import AssistantsApiDelegate.deleteAssistantResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      assistantId: String,
      responses: deleteAssistantResponses[F]
    ): F[Response[F]]

  }
  def deleteAssistant: deleteAssistant


  trait deleteMessage {
    import AssistantsApiDelegate.deleteMessageResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      threadId: String,
      messageId: String,
      responses: deleteMessageResponses[F]
    ): F[Response[F]]

  }
  def deleteMessage: deleteMessage


  trait deleteThread {
    import AssistantsApiDelegate.deleteThreadResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      threadId: String,
      responses: deleteThreadResponses[F]
    ): F[Response[F]]

  }
  def deleteThread: deleteThread


  trait getAssistant {
    import AssistantsApiDelegate.getAssistantResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      assistantId: String,
      responses: getAssistantResponses[F]
    ): F[Response[F]]

  }
  def getAssistant: getAssistant


  trait getMessage {
    import AssistantsApiDelegate.getMessageResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      threadId: String,
      messageId: String,
      responses: getMessageResponses[F]
    ): F[Response[F]]

  }
  def getMessage: getMessage


  trait getRun {
    import AssistantsApiDelegate.getRunResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      threadId: String,
      runId: String,
      responses: getRunResponses[F]
    ): F[Response[F]]

  }
  def getRun: getRun


  trait getRunStep {
    import AssistantsApiDelegate.getRunStepResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      threadId: String,
      runId: String,
      stepId: String,
      includeLeft_Square_BracketRight_Square_Bracket: Option[List[String]],
      responses: getRunStepResponses[F]
    ): F[Response[F]]

  }
  def getRunStep: getRunStep


  trait getThread {
    import AssistantsApiDelegate.getThreadResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      threadId: String,
      responses: getThreadResponses[F]
    ): F[Response[F]]

  }
  def getThread: getThread


  trait listAssistants {
    import AssistantsApiDelegate.listAssistantsResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      limit: Option[Int],
      order: Option[String],
      after: Option[String],
      before: Option[String],
      responses: listAssistantsResponses[F]
    ): F[Response[F]]

  }
  def listAssistants: listAssistants


  trait listMessages {
    import AssistantsApiDelegate.listMessagesResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      threadId: String,
      limit: Option[Int],
      order: Option[String],
      after: Option[String],
      before: Option[String],
      runId: Option[String],
      responses: listMessagesResponses[F]
    ): F[Response[F]]

  }
  def listMessages: listMessages


  trait listRunSteps {
    import AssistantsApiDelegate.listRunStepsResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      threadId: String,
      runId: String,
      limit: Option[Int],
      order: Option[String],
      after: Option[String],
      before: Option[String],
      includeLeft_Square_BracketRight_Square_Bracket: Option[List[String]],
      responses: listRunStepsResponses[F]
    ): F[Response[F]]

  }
  def listRunSteps: listRunSteps


  trait listRuns {
    import AssistantsApiDelegate.listRunsResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      threadId: String,
      limit: Option[Int],
      order: Option[String],
      after: Option[String],
      before: Option[String],
      responses: listRunsResponses[F]
    ): F[Response[F]]

  }
  def listRuns: listRuns


  trait modifyAssistant {
    import AssistantsApiDelegate.modifyAssistantResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      modifyAssistant: F[ModifyAssistantRequest],
      assistantId: String,
      responses: modifyAssistantResponses[F]
    ): F[Response[F]]


  }
  def modifyAssistant: modifyAssistant


  trait modifyMessage {
    import AssistantsApiDelegate.modifyMessageResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      modifyMessage: F[ModifyMessageRequest],
      threadId: String,
      messageId: String,
      responses: modifyMessageResponses[F]
    ): F[Response[F]]


  }
  def modifyMessage: modifyMessage


  trait modifyRun {
    import AssistantsApiDelegate.modifyRunResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      modifyRun: F[ModifyRunRequest],
      threadId: String,
      runId: String,
      responses: modifyRunResponses[F]
    ): F[Response[F]]


  }
  def modifyRun: modifyRun


  trait modifyThread {
    import AssistantsApiDelegate.modifyThreadResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      modifyThread: F[ModifyThreadRequest],
      threadId: String,
      responses: modifyThreadResponses[F]
    ): F[Response[F]]


  }
  def modifyThread: modifyThread


  trait submitToolOuputsToRun {
    import AssistantsApiDelegate.submitToolOuputsToRunResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      submitToolOuputsToRun: F[SubmitToolOutputsRunRequest],
      threadId: String,
      runId: String,
      responses: submitToolOuputsToRunResponses[F]
    ): F[Response[F]]


  }
  def submitToolOuputsToRun: submitToolOuputsToRun

}