#' Create a new RealtimeClientEventResponseCancel
#'
#' @description
#' Send this event to cancel an in-progress response. The server will respond  with a `response.cancelled` event or an error if there is no response to  cancel. 
#'
#' @docType class
#' @title RealtimeClientEventResponseCancel
#' @description RealtimeClientEventResponseCancel Class
#' @format An \code{R6Class} generator object
#' @field event_id Optional client-generated ID used to identify this event. character [optional]
#' @field type The event type, must be `response.cancel`. character
#' @field response_id A specific response ID to cancel - if not provided, will cancel an  in-progress response in the default conversation. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RealtimeClientEventResponseCancel <- R6::R6Class(
  "RealtimeClientEventResponseCancel",
  public = list(
    `event_id` = NULL,
    `type` = NULL,
    `response_id` = NULL,

    #' @description
    #' Initialize a new RealtimeClientEventResponseCancel class.
    #'
    #' @param type The event type, must be `response.cancel`.
    #' @param event_id Optional client-generated ID used to identify this event.
    #' @param response_id A specific response ID to cancel - if not provided, will cancel an  in-progress response in the default conversation.
    #' @param ... Other optional arguments.
    initialize = function(`type`, `event_id` = NULL, `response_id` = NULL, ...) {
      if (!missing(`type`)) {
        if (!(`type` %in% c("response.cancel"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"response.cancel\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!is.null(`event_id`)) {
        if (!(is.character(`event_id`) && length(`event_id`) == 1)) {
          stop(paste("Error! Invalid data for `event_id`. Must be a string:", `event_id`))
        }
        self$`event_id` <- `event_id`
      }
      if (!is.null(`response_id`)) {
        if (!(is.character(`response_id`) && length(`response_id`) == 1)) {
          stop(paste("Error! Invalid data for `response_id`. Must be a string:", `response_id`))
        }
        self$`response_id` <- `response_id`
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
    #' @return RealtimeClientEventResponseCancel as a base R list.
    #' @examples
    #' # convert array of RealtimeClientEventResponseCancel (x) to a data frame
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
    #' Convert RealtimeClientEventResponseCancel to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RealtimeClientEventResponseCancelObject <- list()
      if (!is.null(self$`event_id`)) {
        RealtimeClientEventResponseCancelObject[["event_id"]] <-
          self$`event_id`
      }
      if (!is.null(self$`type`)) {
        RealtimeClientEventResponseCancelObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`response_id`)) {
        RealtimeClientEventResponseCancelObject[["response_id"]] <-
          self$`response_id`
      }
      return(RealtimeClientEventResponseCancelObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeClientEventResponseCancel
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeClientEventResponseCancel
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`event_id`)) {
        self$`event_id` <- this_object$`event_id`
      }
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("response.cancel"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"response.cancel\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`response_id`)) {
        self$`response_id` <- this_object$`response_id`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return RealtimeClientEventResponseCancel in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeClientEventResponseCancel
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeClientEventResponseCancel
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`event_id` <- this_object$`event_id`
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("response.cancel"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"response.cancel\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`response_id` <- this_object$`response_id`
      self
    },

    #' @description
    #' Validate JSON input with respect to RealtimeClientEventResponseCancel and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for RealtimeClientEventResponseCancel: the required field `type` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RealtimeClientEventResponseCancel
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
# RealtimeClientEventResponseCancel$unlock()
#
## Below is an example to define the print function
# RealtimeClientEventResponseCancel$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RealtimeClientEventResponseCancel$lock()

