#' Create a new RealtimeServerEventConversationItemTruncated
#'
#' @description
#' Returned when an earlier assistant audio message item is truncated by the  client with a `conversation.item.truncate` event. This event is used to  synchronize the server's understanding of the audio with the client's playback.  This action will truncate the audio and remove the server-side text transcript  to ensure there is no text in the context that hasn't been heard by the user. 
#'
#' @docType class
#' @title RealtimeServerEventConversationItemTruncated
#' @description RealtimeServerEventConversationItemTruncated Class
#' @format An \code{R6Class} generator object
#' @field event_id The unique ID of the server event. character
#' @field type The event type, must be `conversation.item.truncated`. character
#' @field item_id The ID of the assistant message item that was truncated. character
#' @field content_index The index of the content part that was truncated. integer
#' @field audio_end_ms The duration up to which the audio was truncated, in milliseconds. integer
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RealtimeServerEventConversationItemTruncated <- R6::R6Class(
  "RealtimeServerEventConversationItemTruncated",
  public = list(
    `event_id` = NULL,
    `type` = NULL,
    `item_id` = NULL,
    `content_index` = NULL,
    `audio_end_ms` = NULL,

    #' @description
    #' Initialize a new RealtimeServerEventConversationItemTruncated class.
    #'
    #' @param event_id The unique ID of the server event.
    #' @param type The event type, must be `conversation.item.truncated`.
    #' @param item_id The ID of the assistant message item that was truncated.
    #' @param content_index The index of the content part that was truncated.
    #' @param audio_end_ms The duration up to which the audio was truncated, in milliseconds.
    #' @param ... Other optional arguments.
    initialize = function(`event_id`, `type`, `item_id`, `content_index`, `audio_end_ms`, ...) {
      if (!missing(`event_id`)) {
        if (!(is.character(`event_id`) && length(`event_id`) == 1)) {
          stop(paste("Error! Invalid data for `event_id`. Must be a string:", `event_id`))
        }
        self$`event_id` <- `event_id`
      }
      if (!missing(`type`)) {
        if (!(`type` %in% c("conversation.item.truncated"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"conversation.item.truncated\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!missing(`item_id`)) {
        if (!(is.character(`item_id`) && length(`item_id`) == 1)) {
          stop(paste("Error! Invalid data for `item_id`. Must be a string:", `item_id`))
        }
        self$`item_id` <- `item_id`
      }
      if (!missing(`content_index`)) {
        if (!(is.numeric(`content_index`) && length(`content_index`) == 1)) {
          stop(paste("Error! Invalid data for `content_index`. Must be an integer:", `content_index`))
        }
        self$`content_index` <- `content_index`
      }
      if (!missing(`audio_end_ms`)) {
        if (!(is.numeric(`audio_end_ms`) && length(`audio_end_ms`) == 1)) {
          stop(paste("Error! Invalid data for `audio_end_ms`. Must be an integer:", `audio_end_ms`))
        }
        self$`audio_end_ms` <- `audio_end_ms`
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
    #' @return RealtimeServerEventConversationItemTruncated as a base R list.
    #' @examples
    #' # convert array of RealtimeServerEventConversationItemTruncated (x) to a data frame
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
    #' Convert RealtimeServerEventConversationItemTruncated to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RealtimeServerEventConversationItemTruncatedObject <- list()
      if (!is.null(self$`event_id`)) {
        RealtimeServerEventConversationItemTruncatedObject[["event_id"]] <-
          self$`event_id`
      }
      if (!is.null(self$`type`)) {
        RealtimeServerEventConversationItemTruncatedObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`item_id`)) {
        RealtimeServerEventConversationItemTruncatedObject[["item_id"]] <-
          self$`item_id`
      }
      if (!is.null(self$`content_index`)) {
        RealtimeServerEventConversationItemTruncatedObject[["content_index"]] <-
          self$`content_index`
      }
      if (!is.null(self$`audio_end_ms`)) {
        RealtimeServerEventConversationItemTruncatedObject[["audio_end_ms"]] <-
          self$`audio_end_ms`
      }
      return(RealtimeServerEventConversationItemTruncatedObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeServerEventConversationItemTruncated
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeServerEventConversationItemTruncated
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`event_id`)) {
        self$`event_id` <- this_object$`event_id`
      }
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("conversation.item.truncated"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"conversation.item.truncated\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`item_id`)) {
        self$`item_id` <- this_object$`item_id`
      }
      if (!is.null(this_object$`content_index`)) {
        self$`content_index` <- this_object$`content_index`
      }
      if (!is.null(this_object$`audio_end_ms`)) {
        self$`audio_end_ms` <- this_object$`audio_end_ms`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return RealtimeServerEventConversationItemTruncated in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeServerEventConversationItemTruncated
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeServerEventConversationItemTruncated
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`event_id` <- this_object$`event_id`
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("conversation.item.truncated"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"conversation.item.truncated\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`item_id` <- this_object$`item_id`
      self$`content_index` <- this_object$`content_index`
      self$`audio_end_ms` <- this_object$`audio_end_ms`
      self
    },

    #' @description
    #' Validate JSON input with respect to RealtimeServerEventConversationItemTruncated and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for RealtimeServerEventConversationItemTruncated: the required field `event_id` is missing."))
      }
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        if (!(is.character(input_json$`type`) && length(input_json$`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", input_json$`type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RealtimeServerEventConversationItemTruncated: the required field `type` is missing."))
      }
      # check the required field `item_id`
      if (!is.null(input_json$`item_id`)) {
        if (!(is.character(input_json$`item_id`) && length(input_json$`item_id`) == 1)) {
          stop(paste("Error! Invalid data for `item_id`. Must be a string:", input_json$`item_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RealtimeServerEventConversationItemTruncated: the required field `item_id` is missing."))
      }
      # check the required field `content_index`
      if (!is.null(input_json$`content_index`)) {
        if (!(is.numeric(input_json$`content_index`) && length(input_json$`content_index`) == 1)) {
          stop(paste("Error! Invalid data for `content_index`. Must be an integer:", input_json$`content_index`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RealtimeServerEventConversationItemTruncated: the required field `content_index` is missing."))
      }
      # check the required field `audio_end_ms`
      if (!is.null(input_json$`audio_end_ms`)) {
        if (!(is.numeric(input_json$`audio_end_ms`) && length(input_json$`audio_end_ms`) == 1)) {
          stop(paste("Error! Invalid data for `audio_end_ms`. Must be an integer:", input_json$`audio_end_ms`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RealtimeServerEventConversationItemTruncated: the required field `audio_end_ms` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RealtimeServerEventConversationItemTruncated
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

      # check if the required `item_id` is null
      if (is.null(self$`item_id`)) {
        return(FALSE)
      }

      # check if the required `content_index` is null
      if (is.null(self$`content_index`)) {
        return(FALSE)
      }

      # check if the required `audio_end_ms` is null
      if (is.null(self$`audio_end_ms`)) {
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

      # check if the required `item_id` is null
      if (is.null(self$`item_id`)) {
        invalid_fields["item_id"] <- "Non-nullable required field `item_id` cannot be null."
      }

      # check if the required `content_index` is null
      if (is.null(self$`content_index`)) {
        invalid_fields["content_index"] <- "Non-nullable required field `content_index` cannot be null."
      }

      # check if the required `audio_end_ms` is null
      if (is.null(self$`audio_end_ms`)) {
        invalid_fields["audio_end_ms"] <- "Non-nullable required field `audio_end_ms` cannot be null."
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
# RealtimeServerEventConversationItemTruncated$unlock()
#
## Below is an example to define the print function
# RealtimeServerEventConversationItemTruncated$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RealtimeServerEventConversationItemTruncated$lock()

