#' @docType class
#' @title AuditLogEventType
#' @description AuditLogEventType Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AuditLogEventType <- R6::R6Class(
  "AuditLogEventType",
  public = list(

    #' @description
    #' Initialize a new AuditLogEventType class.
    #'
    #' @param ... Optional arguments.
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_AuditLogEventType()

      if (length(val) == 0L) {
        val = "DUMMY_ENUM"
      } else {
        stopifnot(length(val) == 1L)
      }

      if (!val %in% enumvec) {
        if (!(val=="DUMMY_ENUM")) {
          stop("Use one of the valid values: ",
            paste0(enumvec, collapse = ", "))
        }
        warning("Initializing AuditLogEventType with DUMMY_ENUM. Use one of the valid values: ",
          paste0(enumvec, collapse = ", "),
          ". If you did not manually initialize AuditLogEventType, this may already be overwritten by an enum loaded from a JSON config.")
      }
      private$value <- val
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert AuditLogEventType to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      return(private$value)
    },

    #' @description
    #' Deserialize JSON string into an instance of AuditLogEventType
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of AuditLogEventType
    fromJSON = function(input_json) {
      private$value <- jsonlite::fromJSON(input_json,
          simplifyVector = FALSE)
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AuditLogEventType in JSON format
    toJSONString = function(...) {
      json <- jsonlite::toJSON(self$toSimpleType(), auto_unbox = TRUE, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AuditLogEventType
    #'
    #' @param input_json the JSON input
    #'
    #' @return the instance of AuditLogEventType
    fromJSONString = function(input_json) {
      private$value <- jsonlite::fromJSON(input_json,
          simplifyVector = FALSE)
      self
    }
  ),
  private = list(
    value = NULL
  )
)

# add to utils.R
.parse_AuditLogEventType <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[api_key.created, api_key.updated, api_key.deleted, invite.sent, invite.accepted, invite.deleted, login.succeeded, login.failed, logout.succeeded, logout.failed, organization.updated, project.created, project.updated, project.archived, service_account.created, service_account.updated, service_account.deleted, rate_limit.updated, rate_limit.deleted, user.added, user.updated, user.deleted]")
  unlist(strsplit(res, ", "))
}

