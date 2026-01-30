#' Create a new ChatCompletionRequestAssistantMessageAudio
#'
#' @description
#' Data about a previous audio response from the model.  [Learn more](/docs/guides/audio). 
#'
#' @docType class
#' @title ChatCompletionRequestAssistantMessageAudio
#' @description ChatCompletionRequestAssistantMessageAudio Class
#' @format An \code{R6Class} generator object
#' @field id Unique identifier for a previous audio response from the model. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ChatCompletionRequestAssistantMessageAudio <- R6::R6Class(
  "ChatCompletionRequestAssistantMessageAudio",
  public = list(
    `id` = NULL,

    #' @description
    #' Initialize a new ChatCompletionRequestAssistantMessageAudio class.
    #'
    #' @param id Unique identifier for a previous audio response from the model.
    #' @param ... Other optional arguments.
    initialize = function(`id`, ...) {
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
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
    #' @return ChatCompletionRequestAssistantMessageAudio as a base R list.
    #' @examples
    #' # convert array of ChatCompletionRequestAssistantMessageAudio (x) to a data frame
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
    #' Convert ChatCompletionRequestAssistantMessageAudio to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ChatCompletionRequestAssistantMessageAudioObject <- list()
      if (!is.null(self$`id`)) {
        ChatCompletionRequestAssistantMessageAudioObject[["id"]] <-
          self$`id`
      }
      return(ChatCompletionRequestAssistantMessageAudioObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ChatCompletionRequestAssistantMessageAudio
    #'
    #' @param input_json the JSON input
    #' @return the instance of ChatCompletionRequestAssistantMessageAudio
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ChatCompletionRequestAssistantMessageAudio in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ChatCompletionRequestAssistantMessageAudio
    #'
    #' @param input_json the JSON input
    #' @return the instance of ChatCompletionRequestAssistantMessageAudio
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self
    },

    #' @description
    #' Validate JSON input with respect to ChatCompletionRequestAssistantMessageAudio and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.character(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ChatCompletionRequestAssistantMessageAudio: the required field `id` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ChatCompletionRequestAssistantMessageAudio
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `id` is null
      if (is.null(self$`id`)) {
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
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
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
# ChatCompletionRequestAssistantMessageAudio$unlock()
#
## Below is an example to define the print function
# ChatCompletionRequestAssistantMessageAudio$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ChatCompletionRequestAssistantMessageAudio$lock()

