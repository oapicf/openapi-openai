#' Create a new RealtimeClientEventResponseCreate
#'
#' @description
#' This event instructs the server to create a Response, which means triggering  model inference. When in Server VAD mode, the server will create Responses  automatically.  A Response will include at least one Item, and may have two, in which case  the second will be a function call. These Items will be appended to the  conversation history.  The server will respond with a `response.created` event, events for Items  and content created, and finally a `response.done` event to indicate the  Response is complete.  The `response.create` event includes inference configuration like  `instructions`, and `temperature`. These fields will override the Session's  configuration for this Response only. 
#'
#' @docType class
#' @title RealtimeClientEventResponseCreate
#' @description RealtimeClientEventResponseCreate Class
#' @format An \code{R6Class} generator object
#' @field event_id Optional client-generated ID used to identify this event. character [optional]
#' @field type The event type, must be `response.create`. character
#' @field response  \link{RealtimeResponseCreateParams} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RealtimeClientEventResponseCreate <- R6::R6Class(
  "RealtimeClientEventResponseCreate",
  public = list(
    `event_id` = NULL,
    `type` = NULL,
    `response` = NULL,

    #' @description
    #' Initialize a new RealtimeClientEventResponseCreate class.
    #'
    #' @param type The event type, must be `response.create`.
    #' @param event_id Optional client-generated ID used to identify this event.
    #' @param response response
    #' @param ... Other optional arguments.
    initialize = function(`type`, `event_id` = NULL, `response` = NULL, ...) {
      if (!missing(`type`)) {
        if (!(`type` %in% c("response.create"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"response.create\".", sep = ""))
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
      if (!is.null(`response`)) {
        stopifnot(R6::is.R6(`response`))
        self$`response` <- `response`
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
    #' @return RealtimeClientEventResponseCreate as a base R list.
    #' @examples
    #' # convert array of RealtimeClientEventResponseCreate (x) to a data frame
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
    #' Convert RealtimeClientEventResponseCreate to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RealtimeClientEventResponseCreateObject <- list()
      if (!is.null(self$`event_id`)) {
        RealtimeClientEventResponseCreateObject[["event_id"]] <-
          self$`event_id`
      }
      if (!is.null(self$`type`)) {
        RealtimeClientEventResponseCreateObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`response`)) {
        RealtimeClientEventResponseCreateObject[["response"]] <-
          self$`response`$toSimpleType()
      }
      return(RealtimeClientEventResponseCreateObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeClientEventResponseCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeClientEventResponseCreate
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`event_id`)) {
        self$`event_id` <- this_object$`event_id`
      }
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("response.create"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"response.create\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`response`)) {
        `response_object` <- RealtimeResponseCreateParams$new()
        `response_object`$fromJSON(jsonlite::toJSON(this_object$`response`, auto_unbox = TRUE, digits = NA))
        self$`response` <- `response_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return RealtimeClientEventResponseCreate in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeClientEventResponseCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeClientEventResponseCreate
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`event_id` <- this_object$`event_id`
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("response.create"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"response.create\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`response` <- RealtimeResponseCreateParams$new()$fromJSON(jsonlite::toJSON(this_object$`response`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to RealtimeClientEventResponseCreate and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for RealtimeClientEventResponseCreate: the required field `type` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RealtimeClientEventResponseCreate
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
# RealtimeClientEventResponseCreate$unlock()
#
## Below is an example to define the print function
# RealtimeClientEventResponseCreate$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RealtimeClientEventResponseCreate$lock()

