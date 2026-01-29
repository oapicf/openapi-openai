#' Create a new CreateSpeechRequest
#'
#' @description
#' CreateSpeechRequest Class
#'
#' @docType class
#' @title CreateSpeechRequest
#' @description CreateSpeechRequest Class
#' @format An \code{R6Class} generator object
#' @field model  \link{CreateSpeechRequestModel}
#' @field input The text to generate audio for. The maximum length is 4096 characters. character
#' @field voice The voice to use when generating the audio. Supported voices are `alloy`, `echo`, `fable`, `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech/voice-options). character
#' @field response_format The format to audio in. Supported formats are `mp3`, `opus`, `aac`, `flac`, `wav`, and `pcm`. character [optional]
#' @field speed The speed of the generated audio. Select a value from `0.25` to `4.0`. `1.0` is the default. numeric [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateSpeechRequest <- R6::R6Class(
  "CreateSpeechRequest",
  public = list(
    `model` = NULL,
    `input` = NULL,
    `voice` = NULL,
    `response_format` = NULL,
    `speed` = NULL,

    #' @description
    #' Initialize a new CreateSpeechRequest class.
    #'
    #' @param model model
    #' @param input The text to generate audio for. The maximum length is 4096 characters.
    #' @param voice The voice to use when generating the audio. Supported voices are `alloy`, `echo`, `fable`, `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech/voice-options).
    #' @param response_format The format to audio in. Supported formats are `mp3`, `opus`, `aac`, `flac`, `wav`, and `pcm`.. Default to "mp3".
    #' @param speed The speed of the generated audio. Select a value from `0.25` to `4.0`. `1.0` is the default.. Default to 1.0.
    #' @param ... Other optional arguments.
    initialize = function(`model`, `input`, `voice`, `response_format` = "mp3", `speed` = 1.0, ...) {
      if (!missing(`model`)) {
        stopifnot(R6::is.R6(`model`))
        self$`model` <- `model`
      }
      if (!missing(`input`)) {
        if (!(is.character(`input`) && length(`input`) == 1)) {
          stop(paste("Error! Invalid data for `input`. Must be a string:", `input`))
        }
        self$`input` <- `input`
      }
      if (!missing(`voice`)) {
        if (!(`voice` %in% c("alloy", "echo", "fable", "onyx", "nova", "shimmer"))) {
          stop(paste("Error! \"", `voice`, "\" cannot be assigned to `voice`. Must be \"alloy\", \"echo\", \"fable\", \"onyx\", \"nova\", \"shimmer\".", sep = ""))
        }
        if (!(is.character(`voice`) && length(`voice`) == 1)) {
          stop(paste("Error! Invalid data for `voice`. Must be a string:", `voice`))
        }
        self$`voice` <- `voice`
      }
      if (!is.null(`response_format`)) {
        if (!(`response_format` %in% c("mp3", "opus", "aac", "flac", "wav", "pcm"))) {
          stop(paste("Error! \"", `response_format`, "\" cannot be assigned to `response_format`. Must be \"mp3\", \"opus\", \"aac\", \"flac\", \"wav\", \"pcm\".", sep = ""))
        }
        if (!(is.character(`response_format`) && length(`response_format`) == 1)) {
          stop(paste("Error! Invalid data for `response_format`. Must be a string:", `response_format`))
        }
        self$`response_format` <- `response_format`
      }
      if (!is.null(`speed`)) {
        self$`speed` <- `speed`
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
    #' @return CreateSpeechRequest as a base R list.
    #' @examples
    #' # convert array of CreateSpeechRequest (x) to a data frame
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
    #' Convert CreateSpeechRequest to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CreateSpeechRequestObject <- list()
      if (!is.null(self$`model`)) {
        CreateSpeechRequestObject[["model"]] <-
          self$`model`$toSimpleType()
      }
      if (!is.null(self$`input`)) {
        CreateSpeechRequestObject[["input"]] <-
          self$`input`
      }
      if (!is.null(self$`voice`)) {
        CreateSpeechRequestObject[["voice"]] <-
          self$`voice`
      }
      if (!is.null(self$`response_format`)) {
        CreateSpeechRequestObject[["response_format"]] <-
          self$`response_format`
      }
      if (!is.null(self$`speed`)) {
        CreateSpeechRequestObject[["speed"]] <-
          self$`speed`
      }
      return(CreateSpeechRequestObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateSpeechRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateSpeechRequest
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`model`)) {
        `model_object` <- CreateSpeechRequestModel$new()
        `model_object`$fromJSON(jsonlite::toJSON(this_object$`model`, auto_unbox = TRUE, digits = NA))
        self$`model` <- `model_object`
      }
      if (!is.null(this_object$`input`)) {
        self$`input` <- this_object$`input`
      }
      if (!is.null(this_object$`voice`)) {
        if (!is.null(this_object$`voice`) && !(this_object$`voice` %in% c("alloy", "echo", "fable", "onyx", "nova", "shimmer"))) {
          stop(paste("Error! \"", this_object$`voice`, "\" cannot be assigned to `voice`. Must be \"alloy\", \"echo\", \"fable\", \"onyx\", \"nova\", \"shimmer\".", sep = ""))
        }
        self$`voice` <- this_object$`voice`
      }
      if (!is.null(this_object$`response_format`)) {
        if (!is.null(this_object$`response_format`) && !(this_object$`response_format` %in% c("mp3", "opus", "aac", "flac", "wav", "pcm"))) {
          stop(paste("Error! \"", this_object$`response_format`, "\" cannot be assigned to `response_format`. Must be \"mp3\", \"opus\", \"aac\", \"flac\", \"wav\", \"pcm\".", sep = ""))
        }
        self$`response_format` <- this_object$`response_format`
      }
      if (!is.null(this_object$`speed`)) {
        self$`speed` <- this_object$`speed`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CreateSpeechRequest in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateSpeechRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateSpeechRequest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`model` <- CreateSpeechRequestModel$new()$fromJSON(jsonlite::toJSON(this_object$`model`, auto_unbox = TRUE, digits = NA))
      self$`input` <- this_object$`input`
      if (!is.null(this_object$`voice`) && !(this_object$`voice` %in% c("alloy", "echo", "fable", "onyx", "nova", "shimmer"))) {
        stop(paste("Error! \"", this_object$`voice`, "\" cannot be assigned to `voice`. Must be \"alloy\", \"echo\", \"fable\", \"onyx\", \"nova\", \"shimmer\".", sep = ""))
      }
      self$`voice` <- this_object$`voice`
      if (!is.null(this_object$`response_format`) && !(this_object$`response_format` %in% c("mp3", "opus", "aac", "flac", "wav", "pcm"))) {
        stop(paste("Error! \"", this_object$`response_format`, "\" cannot be assigned to `response_format`. Must be \"mp3\", \"opus\", \"aac\", \"flac\", \"wav\", \"pcm\".", sep = ""))
      }
      self$`response_format` <- this_object$`response_format`
      self$`speed` <- this_object$`speed`
      self
    },

    #' @description
    #' Validate JSON input with respect to CreateSpeechRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `model`
      if (!is.null(input_json$`model`)) {
        stopifnot(R6::is.R6(input_json$`model`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateSpeechRequest: the required field `model` is missing."))
      }
      # check the required field `input`
      if (!is.null(input_json$`input`)) {
        if (!(is.character(input_json$`input`) && length(input_json$`input`) == 1)) {
          stop(paste("Error! Invalid data for `input`. Must be a string:", input_json$`input`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateSpeechRequest: the required field `input` is missing."))
      }
      # check the required field `voice`
      if (!is.null(input_json$`voice`)) {
        if (!(is.character(input_json$`voice`) && length(input_json$`voice`) == 1)) {
          stop(paste("Error! Invalid data for `voice`. Must be a string:", input_json$`voice`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateSpeechRequest: the required field `voice` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateSpeechRequest
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `model` is null
      if (is.null(self$`model`)) {
        return(FALSE)
      }

      # check if the required `input` is null
      if (is.null(self$`input`)) {
        return(FALSE)
      }

      if (nchar(self$`input`) > 4096) {
        return(FALSE)
      }

      # check if the required `voice` is null
      if (is.null(self$`voice`)) {
        return(FALSE)
      }

      if (self$`speed` > 4.0) {
        return(FALSE)
      }
      if (self$`speed` < 0.25) {
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
      # check if the required `model` is null
      if (is.null(self$`model`)) {
        invalid_fields["model"] <- "Non-nullable required field `model` cannot be null."
      }

      # check if the required `input` is null
      if (is.null(self$`input`)) {
        invalid_fields["input"] <- "Non-nullable required field `input` cannot be null."
      }

      if (nchar(self$`input`) > 4096) {
        invalid_fields["input"] <- "Invalid length for `input`, must be smaller than or equal to 4096."
      }

      # check if the required `voice` is null
      if (is.null(self$`voice`)) {
        invalid_fields["voice"] <- "Non-nullable required field `voice` cannot be null."
      }

      if (self$`speed` > 4.0) {
        invalid_fields["speed"] <- "Invalid value for `speed`, must be smaller than or equal to 4.0."
      }
      if (self$`speed` < 0.25) {
        invalid_fields["speed"] <- "Invalid value for `speed`, must be bigger than or equal to 0.25."
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
# CreateSpeechRequest$unlock()
#
## Below is an example to define the print function
# CreateSpeechRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateSpeechRequest$lock()

