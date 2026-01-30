#' Create a new AuditLog
#'
#' @description
#' A log of a user action or configuration change within this organization.
#'
#' @docType class
#' @title AuditLog
#' @description AuditLog Class
#' @format An \code{R6Class} generator object
#' @field id The ID of this log. character
#' @field type  \link{AuditLogEventType}
#' @field effective_at The Unix timestamp (in seconds) of the event. integer
#' @field project  \link{AuditLogProject} [optional]
#' @field actor  \link{AuditLogActor}
#' @field api_key.created  \link{AuditLogApiKeyCreated} [optional]
#' @field api_key.updated  \link{AuditLogApiKeyUpdated} [optional]
#' @field api_key.deleted  \link{AuditLogApiKeyDeleted} [optional]
#' @field invite.sent  \link{AuditLogInviteSent} [optional]
#' @field invite.accepted  \link{AuditLogInviteAccepted} [optional]
#' @field invite.deleted  \link{AuditLogInviteAccepted} [optional]
#' @field login.failed  \link{AuditLogLoginFailed} [optional]
#' @field logout.failed  \link{AuditLogLoginFailed} [optional]
#' @field organization.updated  \link{AuditLogOrganizationUpdated} [optional]
#' @field project.created  \link{AuditLogProjectCreated} [optional]
#' @field project.updated  \link{AuditLogProjectUpdated} [optional]
#' @field project.archived  \link{AuditLogProjectArchived} [optional]
#' @field rate_limit.updated  \link{AuditLogRateLimitUpdated} [optional]
#' @field rate_limit.deleted  \link{AuditLogRateLimitDeleted} [optional]
#' @field service_account.created  \link{AuditLogServiceAccountCreated} [optional]
#' @field service_account.updated  \link{AuditLogServiceAccountUpdated} [optional]
#' @field service_account.deleted  \link{AuditLogServiceAccountDeleted} [optional]
#' @field user.added  \link{AuditLogUserAdded} [optional]
#' @field user.updated  \link{AuditLogUserUpdated} [optional]
#' @field user.deleted  \link{AuditLogUserDeleted} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AuditLog <- R6::R6Class(
  "AuditLog",
  public = list(
    `id` = NULL,
    `type` = NULL,
    `effective_at` = NULL,
    `project` = NULL,
    `actor` = NULL,
    `api_key.created` = NULL,
    `api_key.updated` = NULL,
    `api_key.deleted` = NULL,
    `invite.sent` = NULL,
    `invite.accepted` = NULL,
    `invite.deleted` = NULL,
    `login.failed` = NULL,
    `logout.failed` = NULL,
    `organization.updated` = NULL,
    `project.created` = NULL,
    `project.updated` = NULL,
    `project.archived` = NULL,
    `rate_limit.updated` = NULL,
    `rate_limit.deleted` = NULL,
    `service_account.created` = NULL,
    `service_account.updated` = NULL,
    `service_account.deleted` = NULL,
    `user.added` = NULL,
    `user.updated` = NULL,
    `user.deleted` = NULL,

    #' @description
    #' Initialize a new AuditLog class.
    #'
    #' @param id The ID of this log.
    #' @param type type
    #' @param effective_at The Unix timestamp (in seconds) of the event.
    #' @param actor actor
    #' @param project project
    #' @param api_key.created api_key.created
    #' @param api_key.updated api_key.updated
    #' @param api_key.deleted api_key.deleted
    #' @param invite.sent invite.sent
    #' @param invite.accepted invite.accepted
    #' @param invite.deleted invite.deleted
    #' @param login.failed login.failed
    #' @param logout.failed logout.failed
    #' @param organization.updated organization.updated
    #' @param project.created project.created
    #' @param project.updated project.updated
    #' @param project.archived project.archived
    #' @param rate_limit.updated rate_limit.updated
    #' @param rate_limit.deleted rate_limit.deleted
    #' @param service_account.created service_account.created
    #' @param service_account.updated service_account.updated
    #' @param service_account.deleted service_account.deleted
    #' @param user.added user.added
    #' @param user.updated user.updated
    #' @param user.deleted user.deleted
    #' @param ... Other optional arguments.
    initialize = function(`id`, `type`, `effective_at`, `actor`, `project` = NULL, `api_key.created` = NULL, `api_key.updated` = NULL, `api_key.deleted` = NULL, `invite.sent` = NULL, `invite.accepted` = NULL, `invite.deleted` = NULL, `login.failed` = NULL, `logout.failed` = NULL, `organization.updated` = NULL, `project.created` = NULL, `project.updated` = NULL, `project.archived` = NULL, `rate_limit.updated` = NULL, `rate_limit.deleted` = NULL, `service_account.created` = NULL, `service_account.updated` = NULL, `service_account.deleted` = NULL, `user.added` = NULL, `user.updated` = NULL, `user.deleted` = NULL, ...) {
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`type`)) {
        if (!(`type` %in% c())) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`type`))
        self$`type` <- `type`
      }
      if (!missing(`effective_at`)) {
        if (!(is.numeric(`effective_at`) && length(`effective_at`) == 1)) {
          stop(paste("Error! Invalid data for `effective_at`. Must be an integer:", `effective_at`))
        }
        self$`effective_at` <- `effective_at`
      }
      if (!missing(`actor`)) {
        stopifnot(R6::is.R6(`actor`))
        self$`actor` <- `actor`
      }
      if (!is.null(`project`)) {
        stopifnot(R6::is.R6(`project`))
        self$`project` <- `project`
      }
      if (!is.null(`api_key.created`)) {
        stopifnot(R6::is.R6(`api_key.created`))
        self$`api_key.created` <- `api_key.created`
      }
      if (!is.null(`api_key.updated`)) {
        stopifnot(R6::is.R6(`api_key.updated`))
        self$`api_key.updated` <- `api_key.updated`
      }
      if (!is.null(`api_key.deleted`)) {
        stopifnot(R6::is.R6(`api_key.deleted`))
        self$`api_key.deleted` <- `api_key.deleted`
      }
      if (!is.null(`invite.sent`)) {
        stopifnot(R6::is.R6(`invite.sent`))
        self$`invite.sent` <- `invite.sent`
      }
      if (!is.null(`invite.accepted`)) {
        stopifnot(R6::is.R6(`invite.accepted`))
        self$`invite.accepted` <- `invite.accepted`
      }
      if (!is.null(`invite.deleted`)) {
        stopifnot(R6::is.R6(`invite.deleted`))
        self$`invite.deleted` <- `invite.deleted`
      }
      if (!is.null(`login.failed`)) {
        stopifnot(R6::is.R6(`login.failed`))
        self$`login.failed` <- `login.failed`
      }
      if (!is.null(`logout.failed`)) {
        stopifnot(R6::is.R6(`logout.failed`))
        self$`logout.failed` <- `logout.failed`
      }
      if (!is.null(`organization.updated`)) {
        stopifnot(R6::is.R6(`organization.updated`))
        self$`organization.updated` <- `organization.updated`
      }
      if (!is.null(`project.created`)) {
        stopifnot(R6::is.R6(`project.created`))
        self$`project.created` <- `project.created`
      }
      if (!is.null(`project.updated`)) {
        stopifnot(R6::is.R6(`project.updated`))
        self$`project.updated` <- `project.updated`
      }
      if (!is.null(`project.archived`)) {
        stopifnot(R6::is.R6(`project.archived`))
        self$`project.archived` <- `project.archived`
      }
      if (!is.null(`rate_limit.updated`)) {
        stopifnot(R6::is.R6(`rate_limit.updated`))
        self$`rate_limit.updated` <- `rate_limit.updated`
      }
      if (!is.null(`rate_limit.deleted`)) {
        stopifnot(R6::is.R6(`rate_limit.deleted`))
        self$`rate_limit.deleted` <- `rate_limit.deleted`
      }
      if (!is.null(`service_account.created`)) {
        stopifnot(R6::is.R6(`service_account.created`))
        self$`service_account.created` <- `service_account.created`
      }
      if (!is.null(`service_account.updated`)) {
        stopifnot(R6::is.R6(`service_account.updated`))
        self$`service_account.updated` <- `service_account.updated`
      }
      if (!is.null(`service_account.deleted`)) {
        stopifnot(R6::is.R6(`service_account.deleted`))
        self$`service_account.deleted` <- `service_account.deleted`
      }
      if (!is.null(`user.added`)) {
        stopifnot(R6::is.R6(`user.added`))
        self$`user.added` <- `user.added`
      }
      if (!is.null(`user.updated`)) {
        stopifnot(R6::is.R6(`user.updated`))
        self$`user.updated` <- `user.updated`
      }
      if (!is.null(`user.deleted`)) {
        stopifnot(R6::is.R6(`user.deleted`))
        self$`user.deleted` <- `user.deleted`
      }
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert to a List
    #'
    #' Convert the R6 object to a list to work more easily with other tooling.
    #'
    #' @return AuditLog as a base R list.
    #' @examples
    #' # convert array of AuditLog (x) to a data frame
    #' \dontrun{
    #' library(purrr)
    #' library(tibble)
    #' df <- x |> map(\(y)y$toList()) |> map(as_tibble) |> list_rbind()
    #' df
    #' }
    toList = function() {
      return(self$toSimpleType())
    },

    #' @description
    #' Convert AuditLog to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AuditLogObject <- list()
      if (!is.null(self$`id`)) {
        AuditLogObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`type`)) {
        AuditLogObject[["type"]] <-
          self$`type`$toSimpleType()
      }
      if (!is.null(self$`effective_at`)) {
        AuditLogObject[["effective_at"]] <-
          self$`effective_at`
      }
      if (!is.null(self$`project`)) {
        AuditLogObject[["project"]] <-
          self$`project`$toSimpleType()
      }
      if (!is.null(self$`actor`)) {
        AuditLogObject[["actor"]] <-
          self$`actor`$toSimpleType()
      }
      if (!is.null(self$`api_key.created`)) {
        AuditLogObject[["api_key.created"]] <-
          self$`api_key.created`$toSimpleType()
      }
      if (!is.null(self$`api_key.updated`)) {
        AuditLogObject[["api_key.updated"]] <-
          self$`api_key.updated`$toSimpleType()
      }
      if (!is.null(self$`api_key.deleted`)) {
        AuditLogObject[["api_key.deleted"]] <-
          self$`api_key.deleted`$toSimpleType()
      }
      if (!is.null(self$`invite.sent`)) {
        AuditLogObject[["invite.sent"]] <-
          self$`invite.sent`$toSimpleType()
      }
      if (!is.null(self$`invite.accepted`)) {
        AuditLogObject[["invite.accepted"]] <-
          self$`invite.accepted`$toSimpleType()
      }
      if (!is.null(self$`invite.deleted`)) {
        AuditLogObject[["invite.deleted"]] <-
          self$`invite.deleted`$toSimpleType()
      }
      if (!is.null(self$`login.failed`)) {
        AuditLogObject[["login.failed"]] <-
          self$`login.failed`$toSimpleType()
      }
      if (!is.null(self$`logout.failed`)) {
        AuditLogObject[["logout.failed"]] <-
          self$`logout.failed`$toSimpleType()
      }
      if (!is.null(self$`organization.updated`)) {
        AuditLogObject[["organization.updated"]] <-
          self$`organization.updated`$toSimpleType()
      }
      if (!is.null(self$`project.created`)) {
        AuditLogObject[["project.created"]] <-
          self$`project.created`$toSimpleType()
      }
      if (!is.null(self$`project.updated`)) {
        AuditLogObject[["project.updated"]] <-
          self$`project.updated`$toSimpleType()
      }
      if (!is.null(self$`project.archived`)) {
        AuditLogObject[["project.archived"]] <-
          self$`project.archived`$toSimpleType()
      }
      if (!is.null(self$`rate_limit.updated`)) {
        AuditLogObject[["rate_limit.updated"]] <-
          self$`rate_limit.updated`$toSimpleType()
      }
      if (!is.null(self$`rate_limit.deleted`)) {
        AuditLogObject[["rate_limit.deleted"]] <-
          self$`rate_limit.deleted`$toSimpleType()
      }
      if (!is.null(self$`service_account.created`)) {
        AuditLogObject[["service_account.created"]] <-
          self$`service_account.created`$toSimpleType()
      }
      if (!is.null(self$`service_account.updated`)) {
        AuditLogObject[["service_account.updated"]] <-
          self$`service_account.updated`$toSimpleType()
      }
      if (!is.null(self$`service_account.deleted`)) {
        AuditLogObject[["service_account.deleted"]] <-
          self$`service_account.deleted`$toSimpleType()
      }
      if (!is.null(self$`user.added`)) {
        AuditLogObject[["user.added"]] <-
          self$`user.added`$toSimpleType()
      }
      if (!is.null(self$`user.updated`)) {
        AuditLogObject[["user.updated"]] <-
          self$`user.updated`$toSimpleType()
      }
      if (!is.null(self$`user.deleted`)) {
        AuditLogObject[["user.deleted"]] <-
          self$`user.deleted`$toSimpleType()
      }
      return(AuditLogObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AuditLog
    #'
    #' @param input_json the JSON input
    #' @return the instance of AuditLog
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`type`)) {
        `type_object` <- AuditLogEventType$new()
        `type_object`$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
        self$`type` <- `type_object`
      }
      if (!is.null(this_object$`effective_at`)) {
        self$`effective_at` <- this_object$`effective_at`
      }
      if (!is.null(this_object$`project`)) {
        `project_object` <- AuditLogProject$new()
        `project_object`$fromJSON(jsonlite::toJSON(this_object$`project`, auto_unbox = TRUE, digits = NA))
        self$`project` <- `project_object`
      }
      if (!is.null(this_object$`actor`)) {
        `actor_object` <- AuditLogActor$new()
        `actor_object`$fromJSON(jsonlite::toJSON(this_object$`actor`, auto_unbox = TRUE, digits = NA))
        self$`actor` <- `actor_object`
      }
      if (!is.null(this_object$`api_key.created`)) {
        `api_key.created_object` <- AuditLogApiKeyCreated$new()
        `api_key.created_object`$fromJSON(jsonlite::toJSON(this_object$`api_key.created`, auto_unbox = TRUE, digits = NA))
        self$`api_key.created` <- `api_key.created_object`
      }
      if (!is.null(this_object$`api_key.updated`)) {
        `api_key.updated_object` <- AuditLogApiKeyUpdated$new()
        `api_key.updated_object`$fromJSON(jsonlite::toJSON(this_object$`api_key.updated`, auto_unbox = TRUE, digits = NA))
        self$`api_key.updated` <- `api_key.updated_object`
      }
      if (!is.null(this_object$`api_key.deleted`)) {
        `api_key.deleted_object` <- AuditLogApiKeyDeleted$new()
        `api_key.deleted_object`$fromJSON(jsonlite::toJSON(this_object$`api_key.deleted`, auto_unbox = TRUE, digits = NA))
        self$`api_key.deleted` <- `api_key.deleted_object`
      }
      if (!is.null(this_object$`invite.sent`)) {
        `invite.sent_object` <- AuditLogInviteSent$new()
        `invite.sent_object`$fromJSON(jsonlite::toJSON(this_object$`invite.sent`, auto_unbox = TRUE, digits = NA))
        self$`invite.sent` <- `invite.sent_object`
      }
      if (!is.null(this_object$`invite.accepted`)) {
        `invite.accepted_object` <- AuditLogInviteAccepted$new()
        `invite.accepted_object`$fromJSON(jsonlite::toJSON(this_object$`invite.accepted`, auto_unbox = TRUE, digits = NA))
        self$`invite.accepted` <- `invite.accepted_object`
      }
      if (!is.null(this_object$`invite.deleted`)) {
        `invite.deleted_object` <- AuditLogInviteAccepted$new()
        `invite.deleted_object`$fromJSON(jsonlite::toJSON(this_object$`invite.deleted`, auto_unbox = TRUE, digits = NA))
        self$`invite.deleted` <- `invite.deleted_object`
      }
      if (!is.null(this_object$`login.failed`)) {
        `login.failed_object` <- AuditLogLoginFailed$new()
        `login.failed_object`$fromJSON(jsonlite::toJSON(this_object$`login.failed`, auto_unbox = TRUE, digits = NA))
        self$`login.failed` <- `login.failed_object`
      }
      if (!is.null(this_object$`logout.failed`)) {
        `logout.failed_object` <- AuditLogLoginFailed$new()
        `logout.failed_object`$fromJSON(jsonlite::toJSON(this_object$`logout.failed`, auto_unbox = TRUE, digits = NA))
        self$`logout.failed` <- `logout.failed_object`
      }
      if (!is.null(this_object$`organization.updated`)) {
        `organization.updated_object` <- AuditLogOrganizationUpdated$new()
        `organization.updated_object`$fromJSON(jsonlite::toJSON(this_object$`organization.updated`, auto_unbox = TRUE, digits = NA))
        self$`organization.updated` <- `organization.updated_object`
      }
      if (!is.null(this_object$`project.created`)) {
        `project.created_object` <- AuditLogProjectCreated$new()
        `project.created_object`$fromJSON(jsonlite::toJSON(this_object$`project.created`, auto_unbox = TRUE, digits = NA))
        self$`project.created` <- `project.created_object`
      }
      if (!is.null(this_object$`project.updated`)) {
        `project.updated_object` <- AuditLogProjectUpdated$new()
        `project.updated_object`$fromJSON(jsonlite::toJSON(this_object$`project.updated`, auto_unbox = TRUE, digits = NA))
        self$`project.updated` <- `project.updated_object`
      }
      if (!is.null(this_object$`project.archived`)) {
        `project.archived_object` <- AuditLogProjectArchived$new()
        `project.archived_object`$fromJSON(jsonlite::toJSON(this_object$`project.archived`, auto_unbox = TRUE, digits = NA))
        self$`project.archived` <- `project.archived_object`
      }
      if (!is.null(this_object$`rate_limit.updated`)) {
        `rate_limit.updated_object` <- AuditLogRateLimitUpdated$new()
        `rate_limit.updated_object`$fromJSON(jsonlite::toJSON(this_object$`rate_limit.updated`, auto_unbox = TRUE, digits = NA))
        self$`rate_limit.updated` <- `rate_limit.updated_object`
      }
      if (!is.null(this_object$`rate_limit.deleted`)) {
        `rate_limit.deleted_object` <- AuditLogRateLimitDeleted$new()
        `rate_limit.deleted_object`$fromJSON(jsonlite::toJSON(this_object$`rate_limit.deleted`, auto_unbox = TRUE, digits = NA))
        self$`rate_limit.deleted` <- `rate_limit.deleted_object`
      }
      if (!is.null(this_object$`service_account.created`)) {
        `service_account.created_object` <- AuditLogServiceAccountCreated$new()
        `service_account.created_object`$fromJSON(jsonlite::toJSON(this_object$`service_account.created`, auto_unbox = TRUE, digits = NA))
        self$`service_account.created` <- `service_account.created_object`
      }
      if (!is.null(this_object$`service_account.updated`)) {
        `service_account.updated_object` <- AuditLogServiceAccountUpdated$new()
        `service_account.updated_object`$fromJSON(jsonlite::toJSON(this_object$`service_account.updated`, auto_unbox = TRUE, digits = NA))
        self$`service_account.updated` <- `service_account.updated_object`
      }
      if (!is.null(this_object$`service_account.deleted`)) {
        `service_account.deleted_object` <- AuditLogServiceAccountDeleted$new()
        `service_account.deleted_object`$fromJSON(jsonlite::toJSON(this_object$`service_account.deleted`, auto_unbox = TRUE, digits = NA))
        self$`service_account.deleted` <- `service_account.deleted_object`
      }
      if (!is.null(this_object$`user.added`)) {
        `user.added_object` <- AuditLogUserAdded$new()
        `user.added_object`$fromJSON(jsonlite::toJSON(this_object$`user.added`, auto_unbox = TRUE, digits = NA))
        self$`user.added` <- `user.added_object`
      }
      if (!is.null(this_object$`user.updated`)) {
        `user.updated_object` <- AuditLogUserUpdated$new()
        `user.updated_object`$fromJSON(jsonlite::toJSON(this_object$`user.updated`, auto_unbox = TRUE, digits = NA))
        self$`user.updated` <- `user.updated_object`
      }
      if (!is.null(this_object$`user.deleted`)) {
        `user.deleted_object` <- AuditLogUserDeleted$new()
        `user.deleted_object`$fromJSON(jsonlite::toJSON(this_object$`user.deleted`, auto_unbox = TRUE, digits = NA))
        self$`user.deleted` <- `user.deleted_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AuditLog in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AuditLog
    #'
    #' @param input_json the JSON input
    #' @return the instance of AuditLog
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`type` <- AuditLogEventType$new()$fromJSON(jsonlite::toJSON(this_object$`type`, auto_unbox = TRUE, digits = NA))
      self$`effective_at` <- this_object$`effective_at`
      self$`project` <- AuditLogProject$new()$fromJSON(jsonlite::toJSON(this_object$`project`, auto_unbox = TRUE, digits = NA))
      self$`actor` <- AuditLogActor$new()$fromJSON(jsonlite::toJSON(this_object$`actor`, auto_unbox = TRUE, digits = NA))
      self$`api_key.created` <- AuditLogApiKeyCreated$new()$fromJSON(jsonlite::toJSON(this_object$`api_key.created`, auto_unbox = TRUE, digits = NA))
      self$`api_key.updated` <- AuditLogApiKeyUpdated$new()$fromJSON(jsonlite::toJSON(this_object$`api_key.updated`, auto_unbox = TRUE, digits = NA))
      self$`api_key.deleted` <- AuditLogApiKeyDeleted$new()$fromJSON(jsonlite::toJSON(this_object$`api_key.deleted`, auto_unbox = TRUE, digits = NA))
      self$`invite.sent` <- AuditLogInviteSent$new()$fromJSON(jsonlite::toJSON(this_object$`invite.sent`, auto_unbox = TRUE, digits = NA))
      self$`invite.accepted` <- AuditLogInviteAccepted$new()$fromJSON(jsonlite::toJSON(this_object$`invite.accepted`, auto_unbox = TRUE, digits = NA))
      self$`invite.deleted` <- AuditLogInviteAccepted$new()$fromJSON(jsonlite::toJSON(this_object$`invite.deleted`, auto_unbox = TRUE, digits = NA))
      self$`login.failed` <- AuditLogLoginFailed$new()$fromJSON(jsonlite::toJSON(this_object$`login.failed`, auto_unbox = TRUE, digits = NA))
      self$`logout.failed` <- AuditLogLoginFailed$new()$fromJSON(jsonlite::toJSON(this_object$`logout.failed`, auto_unbox = TRUE, digits = NA))
      self$`organization.updated` <- AuditLogOrganizationUpdated$new()$fromJSON(jsonlite::toJSON(this_object$`organization.updated`, auto_unbox = TRUE, digits = NA))
      self$`project.created` <- AuditLogProjectCreated$new()$fromJSON(jsonlite::toJSON(this_object$`project.created`, auto_unbox = TRUE, digits = NA))
      self$`project.updated` <- AuditLogProjectUpdated$new()$fromJSON(jsonlite::toJSON(this_object$`project.updated`, auto_unbox = TRUE, digits = NA))
      self$`project.archived` <- AuditLogProjectArchived$new()$fromJSON(jsonlite::toJSON(this_object$`project.archived`, auto_unbox = TRUE, digits = NA))
      self$`rate_limit.updated` <- AuditLogRateLimitUpdated$new()$fromJSON(jsonlite::toJSON(this_object$`rate_limit.updated`, auto_unbox = TRUE, digits = NA))
      self$`rate_limit.deleted` <- AuditLogRateLimitDeleted$new()$fromJSON(jsonlite::toJSON(this_object$`rate_limit.deleted`, auto_unbox = TRUE, digits = NA))
      self$`service_account.created` <- AuditLogServiceAccountCreated$new()$fromJSON(jsonlite::toJSON(this_object$`service_account.created`, auto_unbox = TRUE, digits = NA))
      self$`service_account.updated` <- AuditLogServiceAccountUpdated$new()$fromJSON(jsonlite::toJSON(this_object$`service_account.updated`, auto_unbox = TRUE, digits = NA))
      self$`service_account.deleted` <- AuditLogServiceAccountDeleted$new()$fromJSON(jsonlite::toJSON(this_object$`service_account.deleted`, auto_unbox = TRUE, digits = NA))
      self$`user.added` <- AuditLogUserAdded$new()$fromJSON(jsonlite::toJSON(this_object$`user.added`, auto_unbox = TRUE, digits = NA))
      self$`user.updated` <- AuditLogUserUpdated$new()$fromJSON(jsonlite::toJSON(this_object$`user.updated`, auto_unbox = TRUE, digits = NA))
      self$`user.deleted` <- AuditLogUserDeleted$new()$fromJSON(jsonlite::toJSON(this_object$`user.deleted`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to AuditLog and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.character(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AuditLog: the required field `id` is missing."))
      }
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        stopifnot(R6::is.R6(input_json$`type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AuditLog: the required field `type` is missing."))
      }
      # check the required field `effective_at`
      if (!is.null(input_json$`effective_at`)) {
        if (!(is.numeric(input_json$`effective_at`) && length(input_json$`effective_at`) == 1)) {
          stop(paste("Error! Invalid data for `effective_at`. Must be an integer:", input_json$`effective_at`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AuditLog: the required field `effective_at` is missing."))
      }
      # check the required field `actor`
      if (!is.null(input_json$`actor`)) {
        stopifnot(R6::is.R6(input_json$`actor`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AuditLog: the required field `actor` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AuditLog
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

      # check if the required `type` is null
      if (is.null(self$`type`)) {
        return(FALSE)
      }

      # check if the required `effective_at` is null
      if (is.null(self$`effective_at`)) {
        return(FALSE)
      }

      # check if the required `actor` is null
      if (is.null(self$`actor`)) {
        return(FALSE)
      }

      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

      # check if the required `type` is null
      if (is.null(self$`type`)) {
        invalid_fields["type"] <- "Non-nullable required field `type` cannot be null."
      }

      # check if the required `effective_at` is null
      if (is.null(self$`effective_at`)) {
        invalid_fields["effective_at"] <- "Non-nullable required field `effective_at` cannot be null."
      }

      # check if the required `actor` is null
      if (is.null(self$`actor`)) {
        invalid_fields["actor"] <- "Non-nullable required field `actor` cannot be null."
      }

      invalid_fields
    },

    #' @description
    #' Print the object
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# AuditLog$unlock()
#
## Below is an example to define the print function
# AuditLog$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AuditLog$lock()

