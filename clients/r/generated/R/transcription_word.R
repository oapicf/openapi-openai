#' Create a new TranscriptionWord
#'
#' @description
#' TranscriptionWord Class
#'
#' @docType class
#' @title TranscriptionWord
#' @description TranscriptionWord Class
#' @format An \code{R6Class} generator object
#' @field word The text content of the word. character
#' @field start Start time of the word in seconds. numeric
#' @field end End time of the word in seconds. numeric
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TranscriptionWord <- R6::R6Class(
  "TranscriptionWord",
  public = list(
    `word` = NULL,
    `start` = NULL,
    `end` = NULL,
    #' Initialize a new TranscriptionWord class.
    #'
    #' @description
    #' Initialize a new TranscriptionWord class.
    #'
    #' @param word The text content of the word.
    #' @param start Start time of the word in seconds.
    #' @param end End time of the word in seconds.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`word`, `start`, `end`, ...) {
      if (!missing(`word`)) {
        if (!(is.character(`word`) && length(`word`) == 1)) {
          stop(paste("Error! Invalid data for `word`. Must be a string:", `word`))
        }
        self$`word` <- `word`
      }
      if (!missing(`start`)) {
        if (!(is.numeric(`start`) && length(`start`) == 1)) {
          stop(paste("Error! Invalid data for `start`. Must be a number:", `start`))
        }
        self$`start` <- `start`
      }
      if (!missing(`end`)) {
        if (!(is.numeric(`end`) && length(`end`) == 1)) {
          stop(paste("Error! Invalid data for `end`. Must be a number:", `end`))
        }
        self$`end` <- `end`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return TranscriptionWord in JSON format
    #' @export
    toJSON = function() {
      TranscriptionWordObject <- list()
      if (!is.null(self$`word`)) {
        TranscriptionWordObject[["word"]] <-
          self$`word`
      }
      if (!is.null(self$`start`)) {
        TranscriptionWordObject[["start"]] <-
          self$`start`
      }
      if (!is.null(self$`end`)) {
        TranscriptionWordObject[["end"]] <-
          self$`end`
      }
      TranscriptionWordObject
    },
    #' Deserialize JSON string into an instance of TranscriptionWord
    #'
    #' @description
    #' Deserialize JSON string into an instance of TranscriptionWord
    #'
    #' @param input_json the JSON input
    #' @return the instance of TranscriptionWord
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`word`)) {
        self$`word` <- this_object$`word`
      }
      if (!is.null(this_object$`start`)) {
        self$`start` <- this_object$`start`
      }
      if (!is.null(this_object$`end`)) {
        self$`end` <- this_object$`end`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return TranscriptionWord in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`word`)) {
          sprintf(
          '"word":
            "%s"
                    ',
          self$`word`
          )
        },
        if (!is.null(self$`start`)) {
          sprintf(
          '"start":
            %d
                    ',
          self$`start`
          )
        },
        if (!is.null(self$`end`)) {
          sprintf(
          '"end":
            %d
                    ',
          self$`end`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of TranscriptionWord
    #'
    #' @description
    #' Deserialize JSON string into an instance of TranscriptionWord
    #'
    #' @param input_json the JSON input
    #' @return the instance of TranscriptionWord
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`word` <- this_object$`word`
      self$`start` <- this_object$`start`
      self$`end` <- this_object$`end`
      self
    },
    #' Validate JSON input with respect to TranscriptionWord
    #'
    #' @description
    #' Validate JSON input with respect to TranscriptionWord and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `word`
      if (!is.null(input_json$`word`)) {
        if (!(is.character(input_json$`word`) && length(input_json$`word`) == 1)) {
          stop(paste("Error! Invalid data for `word`. Must be a string:", input_json$`word`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TranscriptionWord: the required field `word` is missing."))
      }
      # check the required field `start`
      if (!is.null(input_json$`start`)) {
        if (!(is.numeric(input_json$`start`) && length(input_json$`start`) == 1)) {
          stop(paste("Error! Invalid data for `start`. Must be a number:", input_json$`start`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TranscriptionWord: the required field `start` is missing."))
      }
      # check the required field `end`
      if (!is.null(input_json$`end`)) {
        if (!(is.numeric(input_json$`end`) && length(input_json$`end`) == 1)) {
          stop(paste("Error! Invalid data for `end`. Must be a number:", input_json$`end`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TranscriptionWord: the required field `end` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of TranscriptionWord
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
      # check if the required `word` is null
      if (is.null(self$`word`)) {
        return(FALSE)
      }

      # check if the required `start` is null
      if (is.null(self$`start`)) {
        return(FALSE)
      }

      # check if the required `end` is null
      if (is.null(self$`end`)) {
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
      # check if the required `word` is null
      if (is.null(self$`word`)) {
        invalid_fields["word"] <- "Non-nullable required field `word` cannot be null."
      }

      # check if the required `start` is null
      if (is.null(self$`start`)) {
        invalid_fields["start"] <- "Non-nullable required field `start` cannot be null."
      }

      # check if the required `end` is null
      if (is.null(self$`end`)) {
        invalid_fields["end"] <- "Non-nullable required field `end` cannot be null."
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
# TranscriptionWord$unlock()
#
## Below is an example to define the print function
# TranscriptionWord$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TranscriptionWord$lock()

