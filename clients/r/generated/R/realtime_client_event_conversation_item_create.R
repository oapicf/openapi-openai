#' Create a new RealtimeClientEventConversationItemCreate
#'
#' @description
#' Add a new Item to the Conversation's context, including messages, function  calls, and function call responses. This event can be used both to populate a  \"history\" of the conversation and to add new items mid-stream, but has the  current limitation that it cannot populate assistant audio messages.  If successful, the server will respond with a `conversation.item.created`  event, otherwise an `error` event will be sent. 
#'
#' @docType class
#' @title RealtimeClientEventConversationItemCreate
#' @description RealtimeClientEventConversationItemCreate Class
#' @format An \code{R6Class} generator object
#' @field event_id Optional client-generated ID used to identify this event. character [optional]
#' @field type The event type, must be `conversation.item.create`. character
#' @field previous_item_id The ID of the preceding item after which the new item will be inserted.  If not set, the new item will be appended to the end of the conversation.  If set, it allows an item to be inserted mid-conversation. If the ID  cannot be found, an error will be returned and the item will not be added. character [optional]
#' @field item  \link{RealtimeConversationItem}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RealtimeClientEventConversationItemCreate <- R6::R6Class(
  "RealtimeClientEventConversationItemCreate",
  public = list(
    `event_id` = NULL,
    `type` = NULL,
    `previous_item_id` = NULL,
    `item` = NULL,

    #' @description
    #' Initialize a new RealtimeClientEventConversationItemCreate class.
    #'
    #' @param type The event type, must be `conversation.item.create`.
    #' @param item item
    #' @param event_id Optional client-generated ID used to identify this event.
    #' @param previous_item_id The ID of the preceding item after which the new item will be inserted.  If not set, the new item will be appended to the end of the conversation.  If set, it allows an item to be inserted mid-conversation. If the ID  cannot be found, an error will be returned and the item will not be added.
    #' @param ... Other optional arguments.
    initialize = function(`type`, `item`, `event_id` = NULL, `previous_item_id` = NULL, ...) {
      if (!missing(`type`)) {
        if (!(`type` %in% c("conversation.item.create"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"conversation.item.create\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!missing(`item`)) {
        stopifnot(R6::is.R6(`item`))
        self$`item` <- `item`
      }
      if (!is.null(`event_id`)) {
        if (!(is.character(`event_id`) && length(`event_id`) == 1)) {
          stop(paste("Error! Invalid data for `event_id`. Must be a string:", `event_id`))
        }
        self$`event_id` <- `event_id`
      }
      if (!is.null(`previous_item_id`)) {
        if (!(is.character(`previous_item_id`) && length(`previous_item_id`) == 1)) {
          stop(paste("Error! Invalid data for `previous_item_id`. Must be a string:", `previous_item_id`))
        }
        self$`previous_item_id` <- `previous_item_id`
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
    #' @return RealtimeClientEventConversationItemCreate as a base R list.
    #' @examples
    #' # convert array of RealtimeClientEventConversationItemCreate (x) to a data frame
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
    #' Convert RealtimeClientEventConversationItemCreate to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RealtimeClientEventConversationItemCreateObject <- list()
      if (!is.null(self$`event_id`)) {
        RealtimeClientEventConversationItemCreateObject[["event_id"]] <-
          self$`event_id`
      }
      if (!is.null(self$`type`)) {
        RealtimeClientEventConversationItemCreateObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`previous_item_id`)) {
        RealtimeClientEventConversationItemCreateObject[["previous_item_id"]] <-
          self$`previous_item_id`
      }
      if (!is.null(self$`item`)) {
        RealtimeClientEventConversationItemCreateObject[["item"]] <-
          self$`item`$toSimpleType()
      }
      return(RealtimeClientEventConversationItemCreateObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeClientEventConversationItemCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeClientEventConversationItemCreate
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`event_id`)) {
        self$`event_id` <- this_object$`event_id`
      }
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("conversation.item.create"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"conversation.item.create\".", sep = ""))
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
    #' @return RealtimeClientEventConversationItemCreate in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeClientEventConversationItemCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeClientEventConversationItemCreate
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`event_id` <- this_object$`event_id`
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("conversation.item.create"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"conversation.item.create\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`previous_item_id` <- this_object$`previous_item_id`
      self$`item` <- RealtimeConversationItem$new()$fromJSON(jsonlite::toJSON(this_object$`item`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to RealtimeClientEventConversationItemCreate and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for RealtimeClientEventConversationItemCreate: the required field `type` is missing."))
      }
      # check the required field `item`
      if (!is.null(input_json$`item`)) {
        stopifnot(R6::is.R6(input_json$`item`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RealtimeClientEventConversationItemCreate: the required field `item` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RealtimeClientEventConversationItemCreate
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
      # check if the required `type` is null
      if (is.null(self$`type`)) {
        invalid_fields["type"] <- "Non-nullable required field `type` cannot be null."
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
# RealtimeClientEventConversationItemCreate$unlock()
#
## Below is an example to define the print function
# RealtimeClientEventConversationItemCreate$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RealtimeClientEventConversationItemCreate$lock()

