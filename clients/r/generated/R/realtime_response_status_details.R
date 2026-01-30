#' Create a new RealtimeResponseStatusDetails
#'
#' @description
#' Additional details about the status.
#'
#' @docType class
#' @title RealtimeResponseStatusDetails
#' @description RealtimeResponseStatusDetails Class
#' @format An \code{R6Class} generator object
#' @field type The type of error that caused the response to fail, corresponding  with the `status` field (`completed`, `cancelled`, `incomplete`,  `failed`). character [optional]
#' @field reason The reason the Response did not complete. For a `cancelled` Response,  one of `turn_detected` (the server VAD detected a new start of speech)  or `client_cancelled` (the client sent a cancel event). For an  `incomplete` Response, one of `max_output_tokens` or `content_filter`  (the server-side safety filter activated and cut off the response). character [optional]
#' @field error  \link{RealtimeResponseStatusDetailsError} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RealtimeResponseStatusDetails <- R6::R6Class(
  "RealtimeResponseStatusDetails",
  public = list(
    `type` = NULL,
    `reason` = NULL,
    `error` = NULL,

    #' @description
    #' Initialize a new RealtimeResponseStatusDetails class.
    #'
    #' @param type The type of error that caused the response to fail, corresponding  with the `status` field (`completed`, `cancelled`, `incomplete`,  `failed`).
    #' @param reason The reason the Response did not complete. For a `cancelled` Response,  one of `turn_detected` (the server VAD detected a new start of speech)  or `client_cancelled` (the client sent a cancel event). For an  `incomplete` Response, one of `max_output_tokens` or `content_filter`  (the server-side safety filter activated and cut off the response).
    #' @param error error
    #' @param ... Other optional arguments.
    initialize = function(`type` = NULL, `reason` = NULL, `error` = NULL, ...) {
      if (!is.null(`type`)) {
        if (!(`type` %in% c("completed", "cancelled", "failed", "incomplete"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"completed\", \"cancelled\", \"failed\", \"incomplete\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!is.null(`reason`)) {
        if (!(`reason` %in% c("turn_detected", "client_cancelled", "max_output_tokens", "content_filter"))) {
          stop(paste("Error! \"", `reason`, "\" cannot be assigned to `reason`. Must be \"turn_detected\", \"client_cancelled\", \"max_output_tokens\", \"content_filter\".", sep = ""))
        }
        if (!(is.character(`reason`) && length(`reason`) == 1)) {
          stop(paste("Error! Invalid data for `reason`. Must be a string:", `reason`))
        }
        self$`reason` <- `reason`
      }
      if (!is.null(`error`)) {
        stopifnot(R6::is.R6(`error`))
        self$`error` <- `error`
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
    #' @return RealtimeResponseStatusDetails as a base R list.
    #' @examples
    #' # convert array of RealtimeResponseStatusDetails (x) to a data frame
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
    #' Convert RealtimeResponseStatusDetails to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RealtimeResponseStatusDetailsObject <- list()
      if (!is.null(self$`type`)) {
        RealtimeResponseStatusDetailsObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`reason`)) {
        RealtimeResponseStatusDetailsObject[["reason"]] <-
          self$`reason`
      }
      if (!is.null(self$`error`)) {
        RealtimeResponseStatusDetailsObject[["error"]] <-
          self$`error`$toSimpleType()
      }
      return(RealtimeResponseStatusDetailsObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeResponseStatusDetails
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeResponseStatusDetails
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("completed", "cancelled", "failed", "incomplete"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"completed\", \"cancelled\", \"failed\", \"incomplete\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`reason`)) {
        if (!is.null(this_object$`reason`) && !(this_object$`reason` %in% c("turn_detected", "client_cancelled", "max_output_tokens", "content_filter"))) {
          stop(paste("Error! \"", this_object$`reason`, "\" cannot be assigned to `reason`. Must be \"turn_detected\", \"client_cancelled\", \"max_output_tokens\", \"content_filter\".", sep = ""))
        }
        self$`reason` <- this_object$`reason`
      }
      if (!is.null(this_object$`error`)) {
        `error_object` <- RealtimeResponseStatusDetailsError$new()
        `error_object`$fromJSON(jsonlite::toJSON(this_object$`error`, auto_unbox = TRUE, digits = NA))
        self$`error` <- `error_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return RealtimeResponseStatusDetails in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeResponseStatusDetails
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeResponseStatusDetails
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("completed", "cancelled", "failed", "incomplete"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"completed\", \"cancelled\", \"failed\", \"incomplete\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      if (!is.null(this_object$`reason`) && !(this_object$`reason` %in% c("turn_detected", "client_cancelled", "max_output_tokens", "content_filter"))) {
        stop(paste("Error! \"", this_object$`reason`, "\" cannot be assigned to `reason`. Must be \"turn_detected\", \"client_cancelled\", \"max_output_tokens\", \"content_filter\".", sep = ""))
      }
      self$`reason` <- this_object$`reason`
      self$`error` <- RealtimeResponseStatusDetailsError$new()$fromJSON(jsonlite::toJSON(this_object$`error`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to RealtimeResponseStatusDetails and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RealtimeResponseStatusDetails
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
# RealtimeResponseStatusDetails$unlock()
#
## Below is an example to define the print function
# RealtimeResponseStatusDetails$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RealtimeResponseStatusDetails$lock()

