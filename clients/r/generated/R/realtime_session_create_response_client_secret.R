#' Create a new RealtimeSessionCreateResponseClientSecret
#'
#' @description
#' Ephemeral key returned by the API.
#'
#' @docType class
#' @title RealtimeSessionCreateResponseClientSecret
#' @description RealtimeSessionCreateResponseClientSecret Class
#' @format An \code{R6Class} generator object
#' @field value Ephemeral key usable in client environments to authenticate connections to the Realtime API. Use this in client-side environments rather than a standard API token, which should only be used server-side. character [optional]
#' @field expires_at Timestamp for when the token expires. Currently, all tokens expire after one minute. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RealtimeSessionCreateResponseClientSecret <- R6::R6Class(
  "RealtimeSessionCreateResponseClientSecret",
  public = list(
    `value` = NULL,
    `expires_at` = NULL,

    #' @description
    #' Initialize a new RealtimeSessionCreateResponseClientSecret class.
    #'
    #' @param value Ephemeral key usable in client environments to authenticate connections to the Realtime API. Use this in client-side environments rather than a standard API token, which should only be used server-side.
    #' @param expires_at Timestamp for when the token expires. Currently, all tokens expire after one minute.
    #' @param ... Other optional arguments.
    initialize = function(`value` = NULL, `expires_at` = NULL, ...) {
      if (!is.null(`value`)) {
        if (!(is.character(`value`) && length(`value`) == 1)) {
          stop(paste("Error! Invalid data for `value`. Must be a string:", `value`))
        }
        self$`value` <- `value`
      }
      if (!is.null(`expires_at`)) {
        if (!(is.numeric(`expires_at`) && length(`expires_at`) == 1)) {
          stop(paste("Error! Invalid data for `expires_at`. Must be an integer:", `expires_at`))
        }
        self$`expires_at` <- `expires_at`
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
    #' @return RealtimeSessionCreateResponseClientSecret as a base R list.
    #' @examples
    #' # convert array of RealtimeSessionCreateResponseClientSecret (x) to a data frame
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
    #' Convert RealtimeSessionCreateResponseClientSecret to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RealtimeSessionCreateResponseClientSecretObject <- list()
      if (!is.null(self$`value`)) {
        RealtimeSessionCreateResponseClientSecretObject[["value"]] <-
          self$`value`
      }
      if (!is.null(self$`expires_at`)) {
        RealtimeSessionCreateResponseClientSecretObject[["expires_at"]] <-
          self$`expires_at`
      }
      return(RealtimeSessionCreateResponseClientSecretObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeSessionCreateResponseClientSecret
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeSessionCreateResponseClientSecret
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`value`)) {
        self$`value` <- this_object$`value`
      }
      if (!is.null(this_object$`expires_at`)) {
        self$`expires_at` <- this_object$`expires_at`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return RealtimeSessionCreateResponseClientSecret in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeSessionCreateResponseClientSecret
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeSessionCreateResponseClientSecret
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`value` <- this_object$`value`
      self$`expires_at` <- this_object$`expires_at`
      self
    },

    #' @description
    #' Validate JSON input with respect to RealtimeSessionCreateResponseClientSecret and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RealtimeSessionCreateResponseClientSecret
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
# RealtimeSessionCreateResponseClientSecret$unlock()
#
## Below is an example to define the print function
# RealtimeSessionCreateResponseClientSecret$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RealtimeSessionCreateResponseClientSecret$lock()

