#' Create a new RealtimeServerEventConversationCreatedConversation
#'
#' @description
#' The conversation resource.
#'
#' @docType class
#' @title RealtimeServerEventConversationCreatedConversation
#' @description RealtimeServerEventConversationCreatedConversation Class
#' @format An \code{R6Class} generator object
#' @field id The unique ID of the conversation. character [optional]
#' @field object The object type, must be `realtime.conversation`. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RealtimeServerEventConversationCreatedConversation <- R6::R6Class(
  "RealtimeServerEventConversationCreatedConversation",
  public = list(
    `id` = NULL,
    `object` = NULL,

    #' @description
    #' Initialize a new RealtimeServerEventConversationCreatedConversation class.
    #'
    #' @param id The unique ID of the conversation.
    #' @param object The object type, must be `realtime.conversation`.
    #' @param ... Other optional arguments.
    initialize = function(`id` = NULL, `object` = NULL, ...) {
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`object`)) {
        if (!(is.character(`object`) && length(`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", `object`))
        }
        self$`object` <- `object`
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
    #' @return RealtimeServerEventConversationCreatedConversation as a base R list.
    #' @examples
    #' # convert array of RealtimeServerEventConversationCreatedConversation (x) to a data frame
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
    #' Convert RealtimeServerEventConversationCreatedConversation to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RealtimeServerEventConversationCreatedConversationObject <- list()
      if (!is.null(self$`id`)) {
        RealtimeServerEventConversationCreatedConversationObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`object`)) {
        RealtimeServerEventConversationCreatedConversationObject[["object"]] <-
          self$`object`
      }
      return(RealtimeServerEventConversationCreatedConversationObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeServerEventConversationCreatedConversation
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeServerEventConversationCreatedConversation
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`object`)) {
        self$`object` <- this_object$`object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return RealtimeServerEventConversationCreatedConversation in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeServerEventConversationCreatedConversation
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeServerEventConversationCreatedConversation
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`object` <- this_object$`object`
      self
    },

    #' @description
    #' Validate JSON input with respect to RealtimeServerEventConversationCreatedConversation and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RealtimeServerEventConversationCreatedConversation
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
# RealtimeServerEventConversationCreatedConversation$unlock()
#
## Below is an example to define the print function
# RealtimeServerEventConversationCreatedConversation$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RealtimeServerEventConversationCreatedConversation$lock()

