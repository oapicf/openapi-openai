#' Create a new CreateChatCompletionRequestAudio
#'
#' @description
#' Parameters for audio output. Required when audio output is requested with `modalities: [\"audio\"]`. [Learn more](/docs/guides/audio). 
#'
#' @docType class
#' @title CreateChatCompletionRequestAudio
#' @description CreateChatCompletionRequestAudio Class
#' @format An \code{R6Class} generator object
#' @field voice The voice the model uses to respond. Supported voices are `ash`, `ballad`, `coral`, `sage`, and `verse` (also supported but not recommended are `alloy`, `echo`, and `shimmer`; these voices are less expressive). character
#' @field format Specifies the output audio format. Must be one of `wav`, `mp3`, `flac`, `opus`, or `pcm16`. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateChatCompletionRequestAudio <- R6::R6Class(
  "CreateChatCompletionRequestAudio",
  public = list(
    `voice` = NULL,
    `format` = NULL,

    #' @description
    #' Initialize a new CreateChatCompletionRequestAudio class.
    #'
    #' @param voice The voice the model uses to respond. Supported voices are `ash`, `ballad`, `coral`, `sage`, and `verse` (also supported but not recommended are `alloy`, `echo`, and `shimmer`; these voices are less expressive).
    #' @param format Specifies the output audio format. Must be one of `wav`, `mp3`, `flac`, `opus`, or `pcm16`.
    #' @param ... Other optional arguments.
    initialize = function(`voice`, `format`, ...) {
      if (!missing(`voice`)) {
        if (!(`voice` %in% c("alloy", "ash", "ballad", "coral", "echo", "sage", "shimmer", "verse"))) {
          stop(paste("Error! \"", `voice`, "\" cannot be assigned to `voice`. Must be \"alloy\", \"ash\", \"ballad\", \"coral\", \"echo\", \"sage\", \"shimmer\", \"verse\".", sep = ""))
        }
        if (!(is.character(`voice`) && length(`voice`) == 1)) {
          stop(paste("Error! Invalid data for `voice`. Must be a string:", `voice`))
        }
        self$`voice` <- `voice`
      }
      if (!missing(`format`)) {
        if (!(`format` %in% c("wav", "mp3", "flac", "opus", "pcm16"))) {
          stop(paste("Error! \"", `format`, "\" cannot be assigned to `format`. Must be \"wav\", \"mp3\", \"flac\", \"opus\", \"pcm16\".", sep = ""))
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
    #' @return CreateChatCompletionRequestAudio as a base R list.
    #' @examples
    #' # convert array of CreateChatCompletionRequestAudio (x) to a data frame
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
    #' Convert CreateChatCompletionRequestAudio to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CreateChatCompletionRequestAudioObject <- list()
      if (!is.null(self$`voice`)) {
        CreateChatCompletionRequestAudioObject[["voice"]] <-
          self$`voice`
      }
      if (!is.null(self$`format`)) {
        CreateChatCompletionRequestAudioObject[["format"]] <-
          self$`format`
      }
      return(CreateChatCompletionRequestAudioObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateChatCompletionRequestAudio
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateChatCompletionRequestAudio
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`voice`)) {
        if (!is.null(this_object$`voice`) && !(this_object$`voice` %in% c("alloy", "ash", "ballad", "coral", "echo", "sage", "shimmer", "verse"))) {
          stop(paste("Error! \"", this_object$`voice`, "\" cannot be assigned to `voice`. Must be \"alloy\", \"ash\", \"ballad\", \"coral\", \"echo\", \"sage\", \"shimmer\", \"verse\".", sep = ""))
        }
        self$`voice` <- this_object$`voice`
      }
      if (!is.null(this_object$`format`)) {
        if (!is.null(this_object$`format`) && !(this_object$`format` %in% c("wav", "mp3", "flac", "opus", "pcm16"))) {
          stop(paste("Error! \"", this_object$`format`, "\" cannot be assigned to `format`. Must be \"wav\", \"mp3\", \"flac\", \"opus\", \"pcm16\".", sep = ""))
        }
        self$`format` <- this_object$`format`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CreateChatCompletionRequestAudio in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateChatCompletionRequestAudio
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateChatCompletionRequestAudio
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`voice`) && !(this_object$`voice` %in% c("alloy", "ash", "ballad", "coral", "echo", "sage", "shimmer", "verse"))) {
        stop(paste("Error! \"", this_object$`voice`, "\" cannot be assigned to `voice`. Must be \"alloy\", \"ash\", \"ballad\", \"coral\", \"echo\", \"sage\", \"shimmer\", \"verse\".", sep = ""))
      }
      self$`voice` <- this_object$`voice`
      if (!is.null(this_object$`format`) && !(this_object$`format` %in% c("wav", "mp3", "flac", "opus", "pcm16"))) {
        stop(paste("Error! \"", this_object$`format`, "\" cannot be assigned to `format`. Must be \"wav\", \"mp3\", \"flac\", \"opus\", \"pcm16\".", sep = ""))
      }
      self$`format` <- this_object$`format`
      self
    },

    #' @description
    #' Validate JSON input with respect to CreateChatCompletionRequestAudio and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `voice`
      if (!is.null(input_json$`voice`)) {
        if (!(is.character(input_json$`voice`) && length(input_json$`voice`) == 1)) {
          stop(paste("Error! Invalid data for `voice`. Must be a string:", input_json$`voice`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateChatCompletionRequestAudio: the required field `voice` is missing."))
      }
      # check the required field `format`
      if (!is.null(input_json$`format`)) {
        if (!(is.character(input_json$`format`) && length(input_json$`format`) == 1)) {
          stop(paste("Error! Invalid data for `format`. Must be a string:", input_json$`format`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateChatCompletionRequestAudio: the required field `format` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateChatCompletionRequestAudio
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `voice` is null
      if (is.null(self$`voice`)) {
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
      # check if the required `voice` is null
      if (is.null(self$`voice`)) {
        invalid_fields["voice"] <- "Non-nullable required field `voice` cannot be null."
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
# CreateChatCompletionRequestAudio$unlock()
#
## Below is an example to define the print function
# CreateChatCompletionRequestAudio$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateChatCompletionRequestAudio$lock()

