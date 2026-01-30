#' Create a new RealtimeClientEventConversationItemTruncate
#'
#' @description
#' Send this event to truncate a previous assistant message’s audio. The server  will produce audio faster than realtime, so this event is useful when the user  interrupts to truncate audio that has already been sent to the client but not  yet played. This will synchronize the server's understanding of the audio with  the client's playback.  Truncating audio will delete the server-side text transcript to ensure there  is not text in the context that hasn't been heard by the user.  If successful, the server will respond with a `conversation.item.truncated`  event.  
#'
#' @docType class
#' @title RealtimeClientEventConversationItemTruncate
#' @description RealtimeClientEventConversationItemTruncate Class
#' @format An \code{R6Class} generator object
#' @field event_id Optional client-generated ID used to identify this event. character [optional]
#' @field type The event type, must be `conversation.item.truncate`. character
#' @field item_id The ID of the assistant message item to truncate. Only assistant message  items can be truncated. character
#' @field content_index The index of the content part to truncate. Set this to 0. integer
#' @field audio_end_ms Inclusive duration up to which audio is truncated, in milliseconds. If  the audio_end_ms is greater than the actual audio duration, the server  will respond with an error. integer
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RealtimeClientEventConversationItemTruncate <- R6::R6Class(
  "RealtimeClientEventConversationItemTruncate",
  public = list(
    `event_id` = NULL,
    `type` = NULL,
    `item_id` = NULL,
    `content_index` = NULL,
    `audio_end_ms` = NULL,

    #' @description
    #' Initialize a new RealtimeClientEventConversationItemTruncate class.
    #'
    #' @param type The event type, must be `conversation.item.truncate`.
    #' @param item_id The ID of the assistant message item to truncate. Only assistant message  items can be truncated.
    #' @param content_index The index of the content part to truncate. Set this to 0.
    #' @param audio_end_ms Inclusive duration up to which audio is truncated, in milliseconds. If  the audio_end_ms is greater than the actual audio duration, the server  will respond with an error.
    #' @param event_id Optional client-generated ID used to identify this event.
    #' @param ... Other optional arguments.
    initialize = function(`type`, `item_id`, `content_index`, `audio_end_ms`, `event_id` = NULL, ...) {
      if (!missing(`type`)) {
        if (!(`type` %in% c("conversation.item.truncate"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"conversation.item.truncate\".", sep = ""))
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
    #' @return RealtimeClientEventConversationItemTruncate as a base R list.
    #' @examples
    #' # convert array of RealtimeClientEventConversationItemTruncate (x) to a data frame
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
    #' Convert RealtimeClientEventConversationItemTruncate to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RealtimeClientEventConversationItemTruncateObject <- list()
      if (!is.null(self$`event_id`)) {
        RealtimeClientEventConversationItemTruncateObject[["event_id"]] <-
          self$`event_id`
      }
      if (!is.null(self$`type`)) {
        RealtimeClientEventConversationItemTruncateObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`item_id`)) {
        RealtimeClientEventConversationItemTruncateObject[["item_id"]] <-
          self$`item_id`
      }
      if (!is.null(self$`content_index`)) {
        RealtimeClientEventConversationItemTruncateObject[["content_index"]] <-
          self$`content_index`
      }
      if (!is.null(self$`audio_end_ms`)) {
        RealtimeClientEventConversationItemTruncateObject[["audio_end_ms"]] <-
          self$`audio_end_ms`
      }
      return(RealtimeClientEventConversationItemTruncateObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeClientEventConversationItemTruncate
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeClientEventConversationItemTruncate
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`event_id`)) {
        self$`event_id` <- this_object$`event_id`
      }
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("conversation.item.truncate"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"conversation.item.truncate\".", sep = ""))
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
    #' @return RealtimeClientEventConversationItemTruncate in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeClientEventConversationItemTruncate
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeClientEventConversationItemTruncate
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`event_id` <- this_object$`event_id`
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("conversation.item.truncate"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"conversation.item.truncate\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`item_id` <- this_object$`item_id`
      self$`content_index` <- this_object$`content_index`
      self$`audio_end_ms` <- this_object$`audio_end_ms`
      self
    },

    #' @description
    #' Validate JSON input with respect to RealtimeClientEventConversationItemTruncate and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for RealtimeClientEventConversationItemTruncate: the required field `type` is missing."))
      }
      # check the required field `item_id`
      if (!is.null(input_json$`item_id`)) {
        if (!(is.character(input_json$`item_id`) && length(input_json$`item_id`) == 1)) {
          stop(paste("Error! Invalid data for `item_id`. Must be a string:", input_json$`item_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RealtimeClientEventConversationItemTruncate: the required field `item_id` is missing."))
      }
      # check the required field `content_index`
      if (!is.null(input_json$`content_index`)) {
        if (!(is.numeric(input_json$`content_index`) && length(input_json$`content_index`) == 1)) {
          stop(paste("Error! Invalid data for `content_index`. Must be an integer:", input_json$`content_index`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RealtimeClientEventConversationItemTruncate: the required field `content_index` is missing."))
      }
      # check the required field `audio_end_ms`
      if (!is.null(input_json$`audio_end_ms`)) {
        if (!(is.numeric(input_json$`audio_end_ms`) && length(input_json$`audio_end_ms`) == 1)) {
          stop(paste("Error! Invalid data for `audio_end_ms`. Must be an integer:", input_json$`audio_end_ms`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RealtimeClientEventConversationItemTruncate: the required field `audio_end_ms` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RealtimeClientEventConversationItemTruncate
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
# RealtimeClientEventConversationItemTruncate$unlock()
#
## Below is an example to define the print function
# RealtimeClientEventConversationItemTruncate$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RealtimeClientEventConversationItemTruncate$lock()

