#' Create a new CreateTranscriptionResponseVerboseJson
#'
#' @description
#' Represents a verbose json transcription response returned by model, based on the provided input.
#'
#' @docType class
#' @title CreateTranscriptionResponseVerboseJson
#' @description CreateTranscriptionResponseVerboseJson Class
#' @format An \code{R6Class} generator object
#' @field language The language of the input audio. character
#' @field duration The duration of the input audio. character
#' @field text The transcribed text. character
#' @field words Extracted words and their corresponding timestamps. list(\link{TranscriptionWord}) [optional]
#' @field segments Segments of the transcribed text and their corresponding details. list(\link{TranscriptionSegment}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateTranscriptionResponseVerboseJson <- R6::R6Class(
  "CreateTranscriptionResponseVerboseJson",
  public = list(
    `language` = NULL,
    `duration` = NULL,
    `text` = NULL,
    `words` = NULL,
    `segments` = NULL,
    #' Initialize a new CreateTranscriptionResponseVerboseJson class.
    #'
    #' @description
    #' Initialize a new CreateTranscriptionResponseVerboseJson class.
    #'
    #' @param language The language of the input audio.
    #' @param duration The duration of the input audio.
    #' @param text The transcribed text.
    #' @param words Extracted words and their corresponding timestamps.
    #' @param segments Segments of the transcribed text and their corresponding details.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`language`, `duration`, `text`, `words` = NULL, `segments` = NULL, ...) {
      if (!missing(`language`)) {
        if (!(is.character(`language`) && length(`language`) == 1)) {
          stop(paste("Error! Invalid data for `language`. Must be a string:", `language`))
        }
        self$`language` <- `language`
      }
      if (!missing(`duration`)) {
        if (!(is.character(`duration`) && length(`duration`) == 1)) {
          stop(paste("Error! Invalid data for `duration`. Must be a string:", `duration`))
        }
        self$`duration` <- `duration`
      }
      if (!missing(`text`)) {
        if (!(is.character(`text`) && length(`text`) == 1)) {
          stop(paste("Error! Invalid data for `text`. Must be a string:", `text`))
        }
        self$`text` <- `text`
      }
      if (!is.null(`words`)) {
        stopifnot(is.vector(`words`), length(`words`) != 0)
        sapply(`words`, function(x) stopifnot(R6::is.R6(x)))
        self$`words` <- `words`
      }
      if (!is.null(`segments`)) {
        stopifnot(is.vector(`segments`), length(`segments`) != 0)
        sapply(`segments`, function(x) stopifnot(R6::is.R6(x)))
        self$`segments` <- `segments`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CreateTranscriptionResponseVerboseJson in JSON format
    #' @export
    toJSON = function() {
      CreateTranscriptionResponseVerboseJsonObject <- list()
      if (!is.null(self$`language`)) {
        CreateTranscriptionResponseVerboseJsonObject[["language"]] <-
          self$`language`
      }
      if (!is.null(self$`duration`)) {
        CreateTranscriptionResponseVerboseJsonObject[["duration"]] <-
          self$`duration`
      }
      if (!is.null(self$`text`)) {
        CreateTranscriptionResponseVerboseJsonObject[["text"]] <-
          self$`text`
      }
      if (!is.null(self$`words`)) {
        CreateTranscriptionResponseVerboseJsonObject[["words"]] <-
          lapply(self$`words`, function(x) x$toJSON())
      }
      if (!is.null(self$`segments`)) {
        CreateTranscriptionResponseVerboseJsonObject[["segments"]] <-
          lapply(self$`segments`, function(x) x$toJSON())
      }
      CreateTranscriptionResponseVerboseJsonObject
    },
    #' Deserialize JSON string into an instance of CreateTranscriptionResponseVerboseJson
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateTranscriptionResponseVerboseJson
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateTranscriptionResponseVerboseJson
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`language`)) {
        self$`language` <- this_object$`language`
      }
      if (!is.null(this_object$`duration`)) {
        self$`duration` <- this_object$`duration`
      }
      if (!is.null(this_object$`text`)) {
        self$`text` <- this_object$`text`
      }
      if (!is.null(this_object$`words`)) {
        self$`words` <- ApiClient$new()$deserializeObj(this_object$`words`, "array[TranscriptionWord]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`segments`)) {
        self$`segments` <- ApiClient$new()$deserializeObj(this_object$`segments`, "array[TranscriptionSegment]", loadNamespace("openapi"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CreateTranscriptionResponseVerboseJson in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`language`)) {
          sprintf(
          '"language":
            "%s"
                    ',
          self$`language`
          )
        },
        if (!is.null(self$`duration`)) {
          sprintf(
          '"duration":
            "%s"
                    ',
          self$`duration`
          )
        },
        if (!is.null(self$`text`)) {
          sprintf(
          '"text":
            "%s"
                    ',
          self$`text`
          )
        },
        if (!is.null(self$`words`)) {
          sprintf(
          '"words":
          [%s]
',
          paste(sapply(self$`words`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`segments`)) {
          sprintf(
          '"segments":
          [%s]
',
          paste(sapply(self$`segments`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CreateTranscriptionResponseVerboseJson
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateTranscriptionResponseVerboseJson
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateTranscriptionResponseVerboseJson
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`language` <- this_object$`language`
      self$`duration` <- this_object$`duration`
      self$`text` <- this_object$`text`
      self$`words` <- ApiClient$new()$deserializeObj(this_object$`words`, "array[TranscriptionWord]", loadNamespace("openapi"))
      self$`segments` <- ApiClient$new()$deserializeObj(this_object$`segments`, "array[TranscriptionSegment]", loadNamespace("openapi"))
      self
    },
    #' Validate JSON input with respect to CreateTranscriptionResponseVerboseJson
    #'
    #' @description
    #' Validate JSON input with respect to CreateTranscriptionResponseVerboseJson and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `language`
      if (!is.null(input_json$`language`)) {
        if (!(is.character(input_json$`language`) && length(input_json$`language`) == 1)) {
          stop(paste("Error! Invalid data for `language`. Must be a string:", input_json$`language`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateTranscriptionResponseVerboseJson: the required field `language` is missing."))
      }
      # check the required field `duration`
      if (!is.null(input_json$`duration`)) {
        if (!(is.character(input_json$`duration`) && length(input_json$`duration`) == 1)) {
          stop(paste("Error! Invalid data for `duration`. Must be a string:", input_json$`duration`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateTranscriptionResponseVerboseJson: the required field `duration` is missing."))
      }
      # check the required field `text`
      if (!is.null(input_json$`text`)) {
        if (!(is.character(input_json$`text`) && length(input_json$`text`) == 1)) {
          stop(paste("Error! Invalid data for `text`. Must be a string:", input_json$`text`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateTranscriptionResponseVerboseJson: the required field `text` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateTranscriptionResponseVerboseJson
    #' @export
    toString = function() {
      self$toJSONString()
    },
    #' Return true if the values in all fields are valid.
    #'
    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    #' @export
    isValid = function() {
      # check if the required `language` is null
      if (is.null(self$`language`)) {
        return(FALSE)
      }

      # check if the required `duration` is null
      if (is.null(self$`duration`)) {
        return(FALSE)
      }

      # check if the required `text` is null
      if (is.null(self$`text`)) {
        return(FALSE)
      }

      TRUE
    },
    #' Return a list of invalid fields (if any).
    #'
    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    #' @export
    getInvalidFields = function() {
      invalid_fields <- list()
      # check if the required `language` is null
      if (is.null(self$`language`)) {
        invalid_fields["language"] <- "Non-nullable required field `language` cannot be null."
      }

      # check if the required `duration` is null
      if (is.null(self$`duration`)) {
        invalid_fields["duration"] <- "Non-nullable required field `duration` cannot be null."
      }

      # check if the required `text` is null
      if (is.null(self$`text`)) {
        invalid_fields["text"] <- "Non-nullable required field `text` cannot be null."
      }

      invalid_fields
    },
    #' Print the object
    #'
    #' @description
    #' Print the object
    #'
    #' @export
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# CreateTranscriptionResponseVerboseJson$unlock()
#
## Below is an example to define the print function
# CreateTranscriptionResponseVerboseJson$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateTranscriptionResponseVerboseJson$lock()

