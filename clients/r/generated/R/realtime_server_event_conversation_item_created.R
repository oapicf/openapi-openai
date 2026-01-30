#' Create a new RealtimeServerEventConversationItemCreated
#'
#' @description
#' Returned when a conversation item is created. There are several scenarios that  produce this event:   - The server is generating a Response, which if successful will produce      either one or two Items, which will be of type `message`      (role `assistant`) or type `function_call`.   - The input audio buffer has been committed, either by the client or the      server (in `server_vad` mode). The server will take the content of the      input audio buffer and add it to a new user message Item.   - The client has sent a `conversation.item.create` event to add a new Item      to the Conversation. 
#'
#' @docType class
#' @title RealtimeServerEventConversationItemCreated
#' @description RealtimeServerEventConversationItemCreated Class
#' @format An \code{R6Class} generator object
#' @field event_id The unique ID of the server event. character
#' @field type The event type, must be `conversation.item.created`. character
#' @field previous_item_id The ID of the preceding item in the Conversation context, allows the  client to understand the order of the conversation. character
#' @field item  \link{RealtimeConversationItem}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RealtimeServerEventConversationItemCreated <- R6::R6Class(
  "RealtimeServerEventConversationItemCreated",
  public = list(
    `event_id` = NULL,
    `type` = NULL,
    `previous_item_id` = NULL,
    `item` = NULL,

    #' @description
    #' Initialize a new RealtimeServerEventConversationItemCreated class.
    #'
    #' @param event_id The unique ID of the server event.
    #' @param type The event type, must be `conversation.item.created`.
    #' @param previous_item_id The ID of the preceding item in the Conversation context, allows the  client to understand the order of the conversation.
    #' @param item item
    #' @param ... Other optional arguments.
    initialize = function(`event_id`, `type`, `previous_item_id`, `item`, ...) {
      if (!missing(`event_id`)) {
        if (!(is.character(`event_id`) && length(`event_id`) == 1)) {
          stop(paste("Error! Invalid data for `event_id`. Must be a string:", `event_id`))
        }
        self$`event_id` <- `event_id`
      }
      if (!missing(`type`)) {
        if (!(`type` %in% c("conversation.item.created"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"conversation.item.created\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!missing(`previous_item_id`)) {
        if (!(is.character(`previous_item_id`) && length(`previous_item_id`) == 1)) {
          stop(paste("Error! Invalid data for `previous_item_id`. Must be a string:", `previous_item_id`))
        }
        self$`previous_item_id` <- `previous_item_id`
      }
      if (!missing(`item`)) {
        stopifnot(R6::is.R6(`item`))
        self$`item` <- `item`
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
    #' @return RealtimeServerEventConversationItemCreated as a base R list.
    #' @examples
    #' # convert array of RealtimeServerEventConversationItemCreated (x) to a data frame
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
    #' Convert RealtimeServerEventConversationItemCreated to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RealtimeServerEventConversationItemCreatedObject <- list()
      if (!is.null(self$`event_id`)) {
        RealtimeServerEventConversationItemCreatedObject[["event_id"]] <-
          self$`event_id`
      }
      if (!is.null(self$`type`)) {
        RealtimeServerEventConversationItemCreatedObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`previous_item_id`)) {
        RealtimeServerEventConversationItemCreatedObject[["previous_item_id"]] <-
          self$`previous_item_id`
      }
      if (!is.null(self$`item`)) {
        RealtimeServerEventConversationItemCreatedObject[["item"]] <-
          self$`item`$toSimpleType()
      }
      return(RealtimeServerEventConversationItemCreatedObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeServerEventConversationItemCreated
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeServerEventConversationItemCreated
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`event_id`)) {
        self$`event_id` <- this_object$`event_id`
      }
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("conversation.item.created"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"conversation.item.created\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`previous_item_id`)) {
        self$`previous_item_id` <- this_object$`previous_item_id`
      }
      if (!is.null(this_object$`item`)) {
        `item_object` <- RealtimeConversationItem$new()
        `item_object`$fromJSON(jsonlite::toJSON(this_object$`item`, auto_unbox = TRUE, digits = NA))
        self$`item` <- `item_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return RealtimeServerEventConversationItemCreated in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeServerEventConversationItemCreated
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeServerEventConversationItemCreated
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`event_id` <- this_object$`event_id`
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("conversation.item.created"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"conversation.item.created\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`previous_item_id` <- this_object$`previous_item_id`
      self$`item` <- RealtimeConversationItem$new()$fromJSON(jsonlite::toJSON(this_object$`item`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to RealtimeServerEventConversationItemCreated and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for RealtimeServerEventConversationItemCreated: the required field `event_id` is missing."))
      }
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        if (!(is.character(input_json$`type`) && length(input_json$`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", input_json$`type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RealtimeServerEventConversationItemCreated: the required field `type` is missing."))
      }
      # check the required field `previous_item_id`
      if (!is.null(input_json$`previous_item_id`)) {
        if (!(is.character(input_json$`previous_item_id`) && length(input_json$`previous_item_id`) == 1)) {
          stop(paste("Error! Invalid data for `previous_item_id`. Must be a string:", input_json$`previous_item_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RealtimeServerEventConversationItemCreated: the required field `previous_item_id` is missing."))
      }
      # check the required field `item`
      if (!is.null(input_json$`item`)) {
        stopifnot(R6::is.R6(input_json$`item`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RealtimeServerEventConversationItemCreated: the required field `item` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RealtimeServerEventConversationItemCreated
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

      # check if the required `previous_item_id` is null
      if (is.null(self$`previous_item_id`)) {
        return(FALSE)
      }

      # check if the required `item` is null
      if (is.null(self$`item`)) {
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

      # check if the required `previous_item_id` is null
      if (is.null(self$`previous_item_id`)) {
        invalid_fields["previous_item_id"] <- "Non-nullable required field `previous_item_id` cannot be null."
      }

      # check if the required `item` is null
      if (is.null(self$`item`)) {
        invalid_fields["item"] <- "Non-nullable required field `item` cannot be null."
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
# RealtimeServerEventConversationItemCreated$unlock()
#
## Below is an example to define the print function
# RealtimeServerEventConversationItemCreated$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RealtimeServerEventConversationItemCreated$lock()

