#' Create a new RealtimeServerEventResponseCreated
#'
#' @description
#' Returned when a new Response is created. The first event of response creation, where the response is in an initial state of `in_progress`. 
#'
#' @docType class
#' @title RealtimeServerEventResponseCreated
#' @description RealtimeServerEventResponseCreated Class
#' @format An \code{R6Class} generator object
#' @field event_id The unique ID of the server event. character
#' @field type The event type, must be `response.created`. character
#' @field response  \link{RealtimeResponse}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RealtimeServerEventResponseCreated <- R6::R6Class(
  "RealtimeServerEventResponseCreated",
  public = list(
    `event_id` = NULL,
    `type` = NULL,
    `response` = NULL,

    #' @description
    #' Initialize a new RealtimeServerEventResponseCreated class.
    #'
    #' @param event_id The unique ID of the server event.
    #' @param type The event type, must be `response.created`.
    #' @param response response
    #' @param ... Other optional arguments.
    initialize = function(`event_id`, `type`, `response`, ...) {
      if (!missing(`event_id`)) {
        if (!(is.character(`event_id`) && length(`event_id`) == 1)) {
          stop(paste("Error! Invalid data for `event_id`. Must be a string:", `event_id`))
        }
        self$`event_id` <- `event_id`
      }
      if (!missing(`type`)) {
        if (!(`type` %in% c("response.created"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"response.created\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!missing(`response`)) {
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
    #' @return RealtimeServerEventResponseCreated as a base R list.
    #' @examples
    #' # convert array of RealtimeServerEventResponseCreated (x) to a data frame
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
    #' Convert RealtimeServerEventResponseCreated to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RealtimeServerEventResponseCreatedObject <- list()
      if (!is.null(self$`event_id`)) {
        RealtimeServerEventResponseCreatedObject[["event_id"]] <-
          self$`event_id`
      }
      if (!is.null(self$`type`)) {
        RealtimeServerEventResponseCreatedObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`response`)) {
        RealtimeServerEventResponseCreatedObject[["response"]] <-
          self$`response`$toSimpleType()
      }
      return(RealtimeServerEventResponseCreatedObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeServerEventResponseCreated
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeServerEventResponseCreated
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`event_id`)) {
        self$`event_id` <- this_object$`event_id`
      }
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("response.created"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"response.created\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`response`)) {
        `response_object` <- RealtimeResponse$new()
        `response_object`$fromJSON(jsonlite::toJSON(this_object$`response`, auto_unbox = TRUE, digits = NA))
        self$`response` <- `response_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return RealtimeServerEventResponseCreated in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeServerEventResponseCreated
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeServerEventResponseCreated
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`event_id` <- this_object$`event_id`
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("response.created"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"response.created\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`response` <- RealtimeResponse$new()$fromJSON(jsonlite::toJSON(this_object$`response`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to RealtimeServerEventResponseCreated and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `event_id`
      if (!is.null(input_json$`event_id`)) {
        if (!(is.character(input_json$`event_id`) && length(input_json$`event_id`) == 1)) {
          stop(paste("Error! Invalid data for `event_id`. Must be a string:", input_json$`event_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RealtimeServerEventResponseCreated: the required field `event_id` is missing."))
      }
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        if (!(is.character(input_json$`type`) && length(input_json$`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", input_json$`type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RealtimeServerEventResponseCreated: the required field `type` is missing."))
      }
      # check the required field `response`
      if (!is.null(input_json$`response`)) {
        stopifnot(R6::is.R6(input_json$`response`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RealtimeServerEventResponseCreated: the required field `response` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RealtimeServerEventResponseCreated
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `event_id` is null
      if (is.null(self$`event_id`)) {
        return(FALSE)
      }

      # check if the required `type` is null
      if (is.null(self$`type`)) {
        return(FALSE)
      }

      # check if the required `response` is null
      if (is.null(self$`response`)) {
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
      # check if the required `event_id` is null
      if (is.null(self$`event_id`)) {
        invalid_fields["event_id"] <- "Non-nullable required field `event_id` cannot be null."
      }

      # check if the required `type` is null
      if (is.null(self$`type`)) {
        invalid_fields["type"] <- "Non-nullable required field `type` cannot be null."
      }

      # check if the required `response` is null
      if (is.null(self$`response`)) {
        invalid_fields["response"] <- "Non-nullable required field `response` cannot be null."
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
# RealtimeServerEventResponseCreated$unlock()
#
## Below is an example to define the print function
# RealtimeServerEventResponseCreated$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RealtimeServerEventResponseCreated$lock()

