#' Create a new RealtimeClientEventSessionUpdate
#'
#' @description
#' Send this event to update the session’s default configuration. The client may  send this event at any time to update the session configuration, and any  field may be updated at any time, except for \"voice\". The server will respond  with a `session.updated` event that shows the full effective configuration.  Only fields that are present are updated, thus the correct way to clear a  field like \"instructions\" is to pass an empty string. 
#'
#' @docType class
#' @title RealtimeClientEventSessionUpdate
#' @description RealtimeClientEventSessionUpdate Class
#' @format An \code{R6Class} generator object
#' @field event_id Optional client-generated ID used to identify this event. character [optional]
#' @field type The event type, must be `session.update`. character
#' @field session  \link{RealtimeSessionCreateRequest}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RealtimeClientEventSessionUpdate <- R6::R6Class(
  "RealtimeClientEventSessionUpdate",
  public = list(
    `event_id` = NULL,
    `type` = NULL,
    `session` = NULL,

    #' @description
    #' Initialize a new RealtimeClientEventSessionUpdate class.
    #'
    #' @param type The event type, must be `session.update`.
    #' @param session session
    #' @param event_id Optional client-generated ID used to identify this event.
    #' @param ... Other optional arguments.
    initialize = function(`type`, `session`, `event_id` = NULL, ...) {
      if (!missing(`type`)) {
        if (!(`type` %in% c("session.update"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"session.update\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!missing(`session`)) {
        stopifnot(R6::is.R6(`session`))
        self$`session` <- `session`
      }
      if (!is.null(`event_id`)) {
        if (!(is.character(`event_id`) && length(`event_id`) == 1)) {
          stop(paste("Error! Invalid data for `event_id`. Must be a string:", `event_id`))
        }
        self$`event_id` <- `event_id`
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
    #' @return RealtimeClientEventSessionUpdate as a base R list.
    #' @examples
    #' # convert array of RealtimeClientEventSessionUpdate (x) to a data frame
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
    #' Convert RealtimeClientEventSessionUpdate to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RealtimeClientEventSessionUpdateObject <- list()
      if (!is.null(self$`event_id`)) {
        RealtimeClientEventSessionUpdateObject[["event_id"]] <-
          self$`event_id`
      }
      if (!is.null(self$`type`)) {
        RealtimeClientEventSessionUpdateObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`session`)) {
        RealtimeClientEventSessionUpdateObject[["session"]] <-
          self$`session`$toSimpleType()
      }
      return(RealtimeClientEventSessionUpdateObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeClientEventSessionUpdate
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeClientEventSessionUpdate
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`event_id`)) {
        self$`event_id` <- this_object$`event_id`
      }
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("session.update"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"session.update\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`session`)) {
        `session_object` <- RealtimeSessionCreateRequest$new()
        `session_object`$fromJSON(jsonlite::toJSON(this_object$`session`, auto_unbox = TRUE, digits = NA))
        self$`session` <- `session_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return RealtimeClientEventSessionUpdate in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeClientEventSessionUpdate
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeClientEventSessionUpdate
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`event_id` <- this_object$`event_id`
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("session.update"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"session.update\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`session` <- RealtimeSessionCreateRequest$new()$fromJSON(jsonlite::toJSON(this_object$`session`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to RealtimeClientEventSessionUpdate and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        if (!(is.character(input_json$`type`) && length(input_json$`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", input_json$`type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RealtimeClientEventSessionUpdate: the required field `type` is missing."))
      }
      # check the required field `session`
      if (!is.null(input_json$`session`)) {
        stopifnot(R6::is.R6(input_json$`session`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RealtimeClientEventSessionUpdate: the required field `session` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RealtimeClientEventSessionUpdate
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `type` is null
      if (is.null(self$`type`)) {
        return(FALSE)
      }

      # check if the required `session` is null
      if (is.null(self$`session`)) {
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
      # check if the required `type` is null
      if (is.null(self$`type`)) {
        invalid_fields["type"] <- "Non-nullable required field `type` cannot be null."
      }

      # check if the required `session` is null
      if (is.null(self$`session`)) {
        invalid_fields["session"] <- "Non-nullable required field `session` cannot be null."
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
# RealtimeClientEventSessionUpdate$unlock()
#
## Below is an example to define the print function
# RealtimeClientEventSessionUpdate$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RealtimeClientEventSessionUpdate$lock()

