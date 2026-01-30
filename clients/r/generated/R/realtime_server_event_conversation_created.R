#' Create a new RealtimeServerEventConversationCreated
#'
#' @description
#' Returned when a conversation is created. Emitted right after session creation. 
#'
#' @docType class
#' @title RealtimeServerEventConversationCreated
#' @description RealtimeServerEventConversationCreated Class
#' @format An \code{R6Class} generator object
#' @field event_id The unique ID of the server event. character
#' @field type The event type, must be `conversation.created`. character
#' @field conversation  \link{RealtimeServerEventConversationCreatedConversation}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RealtimeServerEventConversationCreated <- R6::R6Class(
  "RealtimeServerEventConversationCreated",
  public = list(
    `event_id` = NULL,
    `type` = NULL,
    `conversation` = NULL,

    #' @description
    #' Initialize a new RealtimeServerEventConversationCreated class.
    #'
    #' @param event_id The unique ID of the server event.
    #' @param type The event type, must be `conversation.created`.
    #' @param conversation conversation
    #' @param ... Other optional arguments.
    initialize = function(`event_id`, `type`, `conversation`, ...) {
      if (!missing(`event_id`)) {
        if (!(is.character(`event_id`) && length(`event_id`) == 1)) {
          stop(paste("Error! Invalid data for `event_id`. Must be a string:", `event_id`))
        }
        self$`event_id` <- `event_id`
      }
      if (!missing(`type`)) {
        if (!(`type` %in% c("conversation.created"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"conversation.created\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!missing(`conversation`)) {
        stopifnot(R6::is.R6(`conversation`))
        self$`conversation` <- `conversation`
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
    #' @return RealtimeServerEventConversationCreated as a base R list.
    #' @examples
    #' # convert array of RealtimeServerEventConversationCreated (x) to a data frame
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
    #' Convert RealtimeServerEventConversationCreated to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RealtimeServerEventConversationCreatedObject <- list()
      if (!is.null(self$`event_id`)) {
        RealtimeServerEventConversationCreatedObject[["event_id"]] <-
          self$`event_id`
      }
      if (!is.null(self$`type`)) {
        RealtimeServerEventConversationCreatedObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`conversation`)) {
        RealtimeServerEventConversationCreatedObject[["conversation"]] <-
          self$`conversation`$toSimpleType()
      }
      return(RealtimeServerEventConversationCreatedObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeServerEventConversationCreated
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeServerEventConversationCreated
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`event_id`)) {
        self$`event_id` <- this_object$`event_id`
      }
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("conversation.created"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"conversation.created\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`conversation`)) {
        `conversation_object` <- RealtimeServerEventConversationCreatedConversation$new()
        `conversation_object`$fromJSON(jsonlite::toJSON(this_object$`conversation`, auto_unbox = TRUE, digits = NA))
        self$`conversation` <- `conversation_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return RealtimeServerEventConversationCreated in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeServerEventConversationCreated
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeServerEventConversationCreated
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`event_id` <- this_object$`event_id`
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("conversation.created"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"conversation.created\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`conversation` <- RealtimeServerEventConversationCreatedConversation$new()$fromJSON(jsonlite::toJSON(this_object$`conversation`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to RealtimeServerEventConversationCreated and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for RealtimeServerEventConversationCreated: the required field `event_id` is missing."))
      }
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        if (!(is.character(input_json$`type`) && length(input_json$`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", input_json$`type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RealtimeServerEventConversationCreated: the required field `type` is missing."))
      }
      # check the required field `conversation`
      if (!is.null(input_json$`conversation`)) {
        stopifnot(R6::is.R6(input_json$`conversation`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RealtimeServerEventConversationCreated: the required field `conversation` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RealtimeServerEventConversationCreated
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

      # check if the required `conversation` is null
      if (is.null(self$`conversation`)) {
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

      # check if the required `conversation` is null
      if (is.null(self$`conversation`)) {
        invalid_fields["conversation"] <- "Non-nullable required field `conversation` cannot be null."
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
# RealtimeServerEventConversationCreated$unlock()
#
## Below is an example to define the print function
# RealtimeServerEventConversationCreated$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RealtimeServerEventConversationCreated$lock()

