#' Create a new RealtimeResponseStatusDetailsError
#'
#' @description
#' A description of the error that caused the response to fail,  populated when the `status` is `failed`. 
#'
#' @docType class
#' @title RealtimeResponseStatusDetailsError
#' @description RealtimeResponseStatusDetailsError Class
#' @format An \code{R6Class} generator object
#' @field type The type of error. character [optional]
#' @field code Error code, if any. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RealtimeResponseStatusDetailsError <- R6::R6Class(
  "RealtimeResponseStatusDetailsError",
  public = list(
    `type` = NULL,
    `code` = NULL,

    #' @description
    #' Initialize a new RealtimeResponseStatusDetailsError class.
    #'
    #' @param type The type of error.
    #' @param code Error code, if any.
    #' @param ... Other optional arguments.
    initialize = function(`type` = NULL, `code` = NULL, ...) {
      if (!is.null(`type`)) {
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!is.null(`code`)) {
        if (!(is.character(`code`) && length(`code`) == 1)) {
          stop(paste("Error! Invalid data for `code`. Must be a string:", `code`))
        }
        self$`code` <- `code`
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
    #' @return RealtimeResponseStatusDetailsError as a base R list.
    #' @examples
    #' # convert array of RealtimeResponseStatusDetailsError (x) to a data frame
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
    #' Convert RealtimeResponseStatusDetailsError to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RealtimeResponseStatusDetailsErrorObject <- list()
      if (!is.null(self$`type`)) {
        RealtimeResponseStatusDetailsErrorObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`code`)) {
        RealtimeResponseStatusDetailsErrorObject[["code"]] <-
          self$`code`
      }
      return(RealtimeResponseStatusDetailsErrorObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeResponseStatusDetailsError
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeResponseStatusDetailsError
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`code`)) {
        self$`code` <- this_object$`code`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return RealtimeResponseStatusDetailsError in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeResponseStatusDetailsError
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeResponseStatusDetailsError
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`type` <- this_object$`type`
      self$`code` <- this_object$`code`
      self
    },

    #' @description
    #' Validate JSON input with respect to RealtimeResponseStatusDetailsError and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RealtimeResponseStatusDetailsError
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
# RealtimeResponseStatusDetailsError$unlock()
#
## Below is an example to define the print function
# RealtimeResponseStatusDetailsError$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RealtimeResponseStatusDetailsError$lock()

