#' Create a new AuditLogActorApiKey
#'
#' @description
#' The API Key used to perform the audit logged action.
#'
#' @docType class
#' @title AuditLogActorApiKey
#' @description AuditLogActorApiKey Class
#' @format An \code{R6Class} generator object
#' @field id The tracking id of the API key. character [optional]
#' @field type The type of API key. Can be either `user` or `service_account`. character [optional]
#' @field user  \link{AuditLogActorUser} [optional]
#' @field service_account  \link{AuditLogActorServiceAccount} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AuditLogActorApiKey <- R6::R6Class(
  "AuditLogActorApiKey",
  public = list(
    `id` = NULL,
    `type` = NULL,
    `user` = NULL,
    `service_account` = NULL,

    #' @description
    #' Initialize a new AuditLogActorApiKey class.
    #'
    #' @param id The tracking id of the API key.
    #' @param type The type of API key. Can be either `user` or `service_account`.
    #' @param user user
    #' @param service_account service_account
    #' @param ... Other optional arguments.
    initialize = function(`id` = NULL, `type` = NULL, `user` = NULL, `service_account` = NULL, ...) {
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`type`)) {
        if (!(`type` %in% c("user", "service_account"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"user\", \"service_account\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!is.null(`user`)) {
        stopifnot(R6::is.R6(`user`))
        self$`user` <- `user`
      }
      if (!is.null(`service_account`)) {
        stopifnot(R6::is.R6(`service_account`))
        self$`service_account` <- `service_account`
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
    #' @return AuditLogActorApiKey as a base R list.
    #' @examples
    #' # convert array of AuditLogActorApiKey (x) to a data frame
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
    #' Convert AuditLogActorApiKey to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AuditLogActorApiKeyObject <- list()
      if (!is.null(self$`id`)) {
        AuditLogActorApiKeyObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`type`)) {
        AuditLogActorApiKeyObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`user`)) {
        AuditLogActorApiKeyObject[["user"]] <-
          self$`user`$toSimpleType()
      }
      if (!is.null(self$`service_account`)) {
        AuditLogActorApiKeyObject[["service_account"]] <-
          self$`service_account`$toSimpleType()
      }
      return(AuditLogActorApiKeyObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AuditLogActorApiKey
    #'
    #' @param input_json the JSON input
    #' @return the instance of AuditLogActorApiKey
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("user", "service_account"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"user\", \"service_account\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`user`)) {
        `user_object` <- AuditLogActorUser$new()
        `user_object`$fromJSON(jsonlite::toJSON(this_object$`user`, auto_unbox = TRUE, digits = NA))
        self$`user` <- `user_object`
      }
      if (!is.null(this_object$`service_account`)) {
        `service_account_object` <- AuditLogActorServiceAccount$new()
        `service_account_object`$fromJSON(jsonlite::toJSON(this_object$`service_account`, auto_unbox = TRUE, digits = NA))
        self$`service_account` <- `service_account_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AuditLogActorApiKey in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AuditLogActorApiKey
    #'
    #' @param input_json the JSON input
    #' @return the instance of AuditLogActorApiKey
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("user", "service_account"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"user\", \"service_account\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`user` <- AuditLogActorUser$new()$fromJSON(jsonlite::toJSON(this_object$`user`, auto_unbox = TRUE, digits = NA))
      self$`service_account` <- AuditLogActorServiceAccount$new()$fromJSON(jsonlite::toJSON(this_object$`service_account`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to AuditLogActorApiKey and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AuditLogActorApiKey
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
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
# AuditLogActorApiKey$unlock()
#
## Below is an example to define the print function
# AuditLogActorApiKey$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AuditLogActorApiKey$lock()

