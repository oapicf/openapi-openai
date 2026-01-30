#' Create a new ChatCompletionRequestMessageContentPartAudioInputAudio
#'
#' @description
#' ChatCompletionRequestMessageContentPartAudioInputAudio Class
#'
#' @docType class
#' @title ChatCompletionRequestMessageContentPartAudioInputAudio
#' @description ChatCompletionRequestMessageContentPartAudioInputAudio Class
#' @format An \code{R6Class} generator object
#' @field data Base64 encoded audio data. character
#' @field format The format of the encoded audio data. Currently supports \"wav\" and \"mp3\". character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ChatCompletionRequestMessageContentPartAudioInputAudio <- R6::R6Class(
  "ChatCompletionRequestMessageContentPartAudioInputAudio",
  public = list(
    `data` = NULL,
    `format` = NULL,

    #' @description
    #' Initialize a new ChatCompletionRequestMessageContentPartAudioInputAudio class.
    #'
    #' @param data Base64 encoded audio data.
    #' @param format The format of the encoded audio data. Currently supports \"wav\" and \"mp3\".
    #' @param ... Other optional arguments.
    initialize = function(`data`, `format`, ...) {
      if (!missing(`data`)) {
        if (!(is.character(`data`) && length(`data`) == 1)) {
          stop(paste("Error! Invalid data for `data`. Must be a string:", `data`))
        }
        self$`data` <- `data`
      }
      if (!missing(`format`)) {
        if (!(`format` %in% c("wav", "mp3"))) {
          stop(paste("Error! \"", `format`, "\" cannot be assigned to `format`. Must be \"wav\", \"mp3\".", sep = ""))
        }
        if (!(is.character(`format`) && length(`format`) == 1)) {
          stop(paste("Error! Invalid data for `format`. Must be a string:", `format`))
        }
        self$`format` <- `format`
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
    #' @return ChatCompletionRequestMessageContentPartAudioInputAudio as a base R list.
    #' @examples
    #' # convert array of ChatCompletionRequestMessageContentPartAudioInputAudio (x) to a data frame
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
    #' Convert ChatCompletionRequestMessageContentPartAudioInputAudio to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ChatCompletionRequestMessageContentPartAudioInputAudioObject <- list()
      if (!is.null(self$`data`)) {
        ChatCompletionRequestMessageContentPartAudioInputAudioObject[["data"]] <-
          self$`data`
      }
      if (!is.null(self$`format`)) {
        ChatCompletionRequestMessageContentPartAudioInputAudioObject[["format"]] <-
          self$`format`
      }
      return(ChatCompletionRequestMessageContentPartAudioInputAudioObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ChatCompletionRequestMessageContentPartAudioInputAudio
    #'
    #' @param input_json the JSON input
    #' @return the instance of ChatCompletionRequestMessageContentPartAudioInputAudio
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`data`)) {
        self$`data` <- this_object$`data`
      }
      if (!is.null(this_object$`format`)) {
        if (!is.null(this_object$`format`) && !(this_object$`format` %in% c("wav", "mp3"))) {
          stop(paste("Error! \"", this_object$`format`, "\" cannot be assigned to `format`. Must be \"wav\", \"mp3\".", sep = ""))
        }
        self$`format` <- this_object$`format`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ChatCompletionRequestMessageContentPartAudioInputAudio in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ChatCompletionRequestMessageContentPartAudioInputAudio
    #'
    #' @param input_json the JSON input
    #' @return the instance of ChatCompletionRequestMessageContentPartAudioInputAudio
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`data` <- this_object$`data`
      if (!is.null(this_object$`format`) && !(this_object$`format` %in% c("wav", "mp3"))) {
        stop(paste("Error! \"", this_object$`format`, "\" cannot be assigned to `format`. Must be \"wav\", \"mp3\".", sep = ""))
      }
      self$`format` <- this_object$`format`
      self
    },

    #' @description
    #' Validate JSON input with respect to ChatCompletionRequestMessageContentPartAudioInputAudio and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `data`
      if (!is.null(input_json$`data`)) {
        if (!(is.character(input_json$`data`) && length(input_json$`data`) == 1)) {
          stop(paste("Error! Invalid data for `data`. Must be a string:", input_json$`data`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ChatCompletionRequestMessageContentPartAudioInputAudio: the required field `data` is missing."))
      }
      # check the required field `format`
      if (!is.null(input_json$`format`)) {
        if (!(is.character(input_json$`format`) && length(input_json$`format`) == 1)) {
          stop(paste("Error! Invalid data for `format`. Must be a string:", input_json$`format`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ChatCompletionRequestMessageContentPartAudioInputAudio: the required field `format` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ChatCompletionRequestMessageContentPartAudioInputAudio
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `data` is null
      if (is.null(self$`data`)) {
        return(FALSE)
      }

      # check if the required `format` is null
      if (is.null(self$`format`)) {
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
      # check if the required `data` is null
      if (is.null(self$`data`)) {
        invalid_fields["data"] <- "Non-nullable required field `data` cannot be null."
      }

      # check if the required `format` is null
      if (is.null(self$`format`)) {
        invalid_fields["format"] <- "Non-nullable required field `format` cannot be null."
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
# ChatCompletionRequestMessageContentPartAudioInputAudio$unlock()
#
## Below is an example to define the print function
# ChatCompletionRequestMessageContentPartAudioInputAudio$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ChatCompletionRequestMessageContentPartAudioInputAudio$lock()

