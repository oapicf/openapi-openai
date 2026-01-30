#' Create a new RealtimeConversationItemContentInner
#'
#' @description
#' RealtimeConversationItemContentInner Class
#'
#' @docType class
#' @title RealtimeConversationItemContentInner
#' @description RealtimeConversationItemContentInner Class
#' @format An \code{R6Class} generator object
#' @field type The content type (`input_text`, `input_audio`, `item_reference`, `text`). character [optional]
#' @field text The text content, used for `input_text` and `text` content types. character [optional]
#' @field id ID of a previous conversation item to reference (for `item_reference` content types in `response.create` events). These can reference both client and server created items. character [optional]
#' @field audio Base64-encoded audio bytes, used for `input_audio` content type. character [optional]
#' @field transcript The transcript of the audio, used for `input_audio` content type. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RealtimeConversationItemContentInner <- R6::R6Class(
  "RealtimeConversationItemContentInner",
  public = list(
    `type` = NULL,
    `text` = NULL,
    `id` = NULL,
    `audio` = NULL,
    `transcript` = NULL,

    #' @description
    #' Initialize a new RealtimeConversationItemContentInner class.
    #'
    #' @param type The content type (`input_text`, `input_audio`, `item_reference`, `text`).
    #' @param text The text content, used for `input_text` and `text` content types.
    #' @param id ID of a previous conversation item to reference (for `item_reference` content types in `response.create` events). These can reference both client and server created items.
    #' @param audio Base64-encoded audio bytes, used for `input_audio` content type.
    #' @param transcript The transcript of the audio, used for `input_audio` content type.
    #' @param ... Other optional arguments.
    initialize = function(`type` = NULL, `text` = NULL, `id` = NULL, `audio` = NULL, `transcript` = NULL, ...) {
      if (!is.null(`type`)) {
        if (!(`type` %in% c("input_audio", "input_text", "item_reference", "text"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"input_audio\", \"input_text\", \"item_reference\", \"text\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!is.null(`text`)) {
        if (!(is.character(`text`) && length(`text`) == 1)) {
          stop(paste("Error! Invalid data for `text`. Must be a string:", `text`))
        }
        self$`text` <- `text`
      }
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`audio`)) {
        if (!(is.character(`audio`) && length(`audio`) == 1)) {
          stop(paste("Error! Invalid data for `audio`. Must be a string:", `audio`))
        }
        self$`audio` <- `audio`
      }
      if (!is.null(`transcript`)) {
        if (!(is.character(`transcript`) && length(`transcript`) == 1)) {
          stop(paste("Error! Invalid data for `transcript`. Must be a string:", `transcript`))
        }
        self$`transcript` <- `transcript`
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
    #' @return RealtimeConversationItemContentInner as a base R list.
    #' @examples
    #' # convert array of RealtimeConversationItemContentInner (x) to a data frame
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
    #' Convert RealtimeConversationItemContentInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RealtimeConversationItemContentInnerObject <- list()
      if (!is.null(self$`type`)) {
        RealtimeConversationItemContentInnerObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`text`)) {
        RealtimeConversationItemContentInnerObject[["text"]] <-
          self$`text`
      }
      if (!is.null(self$`id`)) {
        RealtimeConversationItemContentInnerObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`audio`)) {
        RealtimeConversationItemContentInnerObject[["audio"]] <-
          self$`audio`
      }
      if (!is.null(self$`transcript`)) {
        RealtimeConversationItemContentInnerObject[["transcript"]] <-
          self$`transcript`
      }
      return(RealtimeConversationItemContentInnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeConversationItemContentInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeConversationItemContentInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("input_audio", "input_text", "item_reference", "text"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"input_audio\", \"input_text\", \"item_reference\", \"text\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`text`)) {
        self$`text` <- this_object$`text`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`audio`)) {
        self$`audio` <- this_object$`audio`
      }
      if (!is.null(this_object$`transcript`)) {
        self$`transcript` <- this_object$`transcript`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return RealtimeConversationItemContentInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeConversationItemContentInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeConversationItemContentInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("input_audio", "input_text", "item_reference", "text"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"input_audio\", \"input_text\", \"item_reference\", \"text\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`text` <- this_object$`text`
      self$`id` <- this_object$`id`
      self$`audio` <- this_object$`audio`
      self$`transcript` <- this_object$`transcript`
      self
    },

    #' @description
    #' Validate JSON input with respect to RealtimeConversationItemContentInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RealtimeConversationItemContentInner
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
# RealtimeConversationItemContentInner$unlock()
#
## Below is an example to define the print function
# RealtimeConversationItemContentInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RealtimeConversationItemContentInner$lock()

