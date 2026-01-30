#' Create a new ChatCompletionRequestMessageContentPartAudio
#'
#' @description
#' Learn about [audio inputs](/docs/guides/audio). 
#'
#' @docType class
#' @title ChatCompletionRequestMessageContentPartAudio
#' @description ChatCompletionRequestMessageContentPartAudio Class
#' @format An \code{R6Class} generator object
#' @field type The type of the content part. Always `input_audio`. character
#' @field input_audio  \link{ChatCompletionRequestMessageContentPartAudioInputAudio}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ChatCompletionRequestMessageContentPartAudio <- R6::R6Class(
  "ChatCompletionRequestMessageContentPartAudio",
  public = list(
    `type` = NULL,
    `input_audio` = NULL,

    #' @description
    #' Initialize a new ChatCompletionRequestMessageContentPartAudio class.
    #'
    #' @param type The type of the content part. Always `input_audio`.
    #' @param input_audio input_audio
    #' @param ... Other optional arguments.
    initialize = function(`type`, `input_audio`, ...) {
      if (!missing(`type`)) {
        if (!(`type` %in% c("input_audio"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"input_audio\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!missing(`input_audio`)) {
        stopifnot(R6::is.R6(`input_audio`))
        self$`input_audio` <- `input_audio`
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
    #' @return ChatCompletionRequestMessageContentPartAudio as a base R list.
    #' @examples
    #' # convert array of ChatCompletionRequestMessageContentPartAudio (x) to a data frame
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
    #' Convert ChatCompletionRequestMessageContentPartAudio to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ChatCompletionRequestMessageContentPartAudioObject <- list()
      if (!is.null(self$`type`)) {
        ChatCompletionRequestMessageContentPartAudioObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`input_audio`)) {
        ChatCompletionRequestMessageContentPartAudioObject[["input_audio"]] <-
          self$`input_audio`$toSimpleType()
      }
      return(ChatCompletionRequestMessageContentPartAudioObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ChatCompletionRequestMessageContentPartAudio
    #'
    #' @param input_json the JSON input
    #' @return the instance of ChatCompletionRequestMessageContentPartAudio
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("input_audio"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"input_audio\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`input_audio`)) {
        `input_audio_object` <- ChatCompletionRequestMessageContentPartAudioInputAudio$new()
        `input_audio_object`$fromJSON(jsonlite::toJSON(this_object$`input_audio`, auto_unbox = TRUE, digits = NA))
        self$`input_audio` <- `input_audio_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ChatCompletionRequestMessageContentPartAudio in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ChatCompletionRequestMessageContentPartAudio
    #'
    #' @param input_json the JSON input
    #' @return the instance of ChatCompletionRequestMessageContentPartAudio
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("input_audio"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"input_audio\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`input_audio` <- ChatCompletionRequestMessageContentPartAudioInputAudio$new()$fromJSON(jsonlite::toJSON(this_object$`input_audio`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to ChatCompletionRequestMessageContentPartAudio and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for ChatCompletionRequestMessageContentPartAudio: the required field `type` is missing."))
      }
      # check the required field `input_audio`
      if (!is.null(input_json$`input_audio`)) {
        stopifnot(R6::is.R6(input_json$`input_audio`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ChatCompletionRequestMessageContentPartAudio: the required field `input_audio` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ChatCompletionRequestMessageContentPartAudio
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

      # check if the required `input_audio` is null
      if (is.null(self$`input_audio`)) {
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

      # check if the required `input_audio` is null
      if (is.null(self$`input_audio`)) {
        invalid_fields["input_audio"] <- "Non-nullable required field `input_audio` cannot be null."
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
# ChatCompletionRequestMessageContentPartAudio$unlock()
#
## Below is an example to define the print function
# ChatCompletionRequestMessageContentPartAudio$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ChatCompletionRequestMessageContentPartAudio$lock()

