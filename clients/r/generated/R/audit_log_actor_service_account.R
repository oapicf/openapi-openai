#' Create a new AuditLogActorServiceAccount
#'
#' @description
#' The service account that performed the audit logged action.
#'
#' @docType class
#' @title AuditLogActorServiceAccount
#' @description AuditLogActorServiceAccount Class
#' @format An \code{R6Class} generator object
#' @field id The service account id. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AuditLogActorServiceAccount <- R6::R6Class(
  "AuditLogActorServiceAccount",
  public = list(
    `id` = NULL,

    #' @description
    #' Initialize a new AuditLogActorServiceAccount class.
    #'
    #' @param id The service account id.
    #' @param ... Other optional arguments.
    initialize = function(`id` = NULL, ...) {
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
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
    #' @return AuditLogActorServiceAccount as a base R list.
    #' @examples
    #' # convert array of AuditLogActorServiceAccount (x) to a data frame
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
    #' Convert AuditLogActorServiceAccount to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AuditLogActorServiceAccountObject <- list()
      if (!is.null(self$`id`)) {
        AuditLogActorServiceAccountObject[["id"]] <-
          self$`id`
      }
      return(AuditLogActorServiceAccountObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AuditLogActorServiceAccount
    #'
    #' @param input_json the JSON input
    #' @return the instance of AuditLogActorServiceAccount
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AuditLogActorServiceAccount in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AuditLogActorServiceAccount
    #'
    #' @param input_json the JSON input
    #' @return the instance of AuditLogActorServiceAccount
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self
    },

    #' @description
    #' Validate JSON input with respect to AuditLogActorServiceAccount and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AuditLogActorServiceAccount
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
# AuditLogActorServiceAccount$unlock()
#
## Below is an example to define the print function
# AuditLogActorServiceAccount$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AuditLogActorServiceAccount$lock()

