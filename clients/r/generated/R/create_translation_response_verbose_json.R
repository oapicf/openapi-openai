#' Create a new CreateTranslationResponseVerboseJson
#'
#' @description
#' CreateTranslationResponseVerboseJson Class
#'
#' @docType class
#' @title CreateTranslationResponseVerboseJson
#' @description CreateTranslationResponseVerboseJson Class
#' @format An \code{R6Class} generator object
#' @field language The language of the output translation (always `english`). character
#' @field duration The duration of the input audio. character
#' @field text The translated text. character
#' @field segments Segments of the translated text and their corresponding details. list(\link{TranscriptionSegment}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateTranslationResponseVerboseJson <- R6::R6Class(
  "CreateTranslationResponseVerboseJson",
  public = list(
    `language` = NULL,
    `duration` = NULL,
    `text` = NULL,
    `segments` = NULL,

    #' @description
    #' Initialize a new CreateTranslationResponseVerboseJson class.
    #'
    #' @param language The language of the output translation (always `english`).
    #' @param duration The duration of the input audio.
    #' @param text The translated text.
    #' @param segments Segments of the translated text and their corresponding details.
    #' @param ... Other optional arguments.
    initialize = function(`language`, `duration`, `text`, `segments` = NULL, ...) {
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
      if (!is.null(`segments`)) {
        stopifnot(is.vector(`segments`), length(`segments`) != 0)
        sapply(`segments`, function(x) stopifnot(R6::is.R6(x)))
        self$`segments` <- `segments`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return CreateTranslationResponseVerboseJson in JSON format
    toJSON = function() {
      CreateTranslationResponseVerboseJsonObject <- list()
      if (!is.null(self$`language`)) {
        CreateTranslationResponseVerboseJsonObject[["language"]] <-
          self$`language`
      }
      if (!is.null(self$`duration`)) {
        CreateTranslationResponseVerboseJsonObject[["duration"]] <-
          self$`duration`
      }
      if (!is.null(self$`text`)) {
        CreateTranslationResponseVerboseJsonObject[["text"]] <-
          self$`text`
      }
      if (!is.null(self$`segments`)) {
        CreateTranslationResponseVerboseJsonObject[["segments"]] <-
          lapply(self$`segments`, function(x) x$toJSON())
      }
      CreateTranslationResponseVerboseJsonObject
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateTranslationResponseVerboseJson
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateTranslationResponseVerboseJson
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
      if (!is.null(this_object$`segments`)) {
        self$`segments` <- ApiClient$new()$deserializeObj(this_object$`segments`, "array[TranscriptionSegment]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return CreateTranslationResponseVerboseJson in JSON format
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

    #' @description
    #' Deserialize JSON string into an instance of CreateTranslationResponseVerboseJson
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateTranslationResponseVerboseJson
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`language` <- this_object$`language`
      self$`duration` <- this_object$`duration`
      self$`text` <- this_object$`text`
      self$`segments` <- ApiClient$new()$deserializeObj(this_object$`segments`, "array[TranscriptionSegment]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to CreateTranslationResponseVerboseJson and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `language`
      if (!is.null(input_json$`language`)) {
        if (!(is.character(input_json$`language`) && length(input_json$`language`) == 1)) {
          stop(paste("Error! Invalid data for `language`. Must be a string:", input_json$`language`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateTranslationResponseVerboseJson: the required field `language` is missing."))
      }
      # check the required field `duration`
      if (!is.null(input_json$`duration`)) {
        if (!(is.character(input_json$`duration`) && length(input_json$`duration`) == 1)) {
          stop(paste("Error! Invalid data for `duration`. Must be a string:", input_json$`duration`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateTranslationResponseVerboseJson: the required field `duration` is missing."))
      }
      # check the required field `text`
      if (!is.null(input_json$`text`)) {
        if (!(is.character(input_json$`text`) && length(input_json$`text`) == 1)) {
          stop(paste("Error! Invalid data for `text`. Must be a string:", input_json$`text`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateTranslationResponseVerboseJson: the required field `text` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateTranslationResponseVerboseJson
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
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

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
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
# CreateTranslationResponseVerboseJson$unlock()
#
## Below is an example to define the print function
# CreateTranslationResponseVerboseJson$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateTranslationResponseVerboseJson$lock()

