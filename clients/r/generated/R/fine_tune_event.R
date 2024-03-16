#' Create a new FineTuneEvent
#'
#' @description
#' FineTuneEvent Class
#'
#' @docType class
#' @title FineTuneEvent
#' @description FineTuneEvent Class
#' @format An \code{R6Class} generator object
#' @field object  character
#' @field created_at  integer
#' @field level  character
#' @field message  character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FineTuneEvent <- R6::R6Class(
  "FineTuneEvent",
  public = list(
    `object` = NULL,
    `created_at` = NULL,
    `level` = NULL,
    `message` = NULL,
    #' Initialize a new FineTuneEvent class.
    #'
    #' @description
    #' Initialize a new FineTuneEvent class.
    #'
    #' @param object object
    #' @param created_at created_at
    #' @param level level
    #' @param message message
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`object`, `created_at`, `level`, `message`, ...) {
      if (!missing(`object`)) {
        if (!(is.character(`object`) && length(`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", `object`))
        }
        self$`object` <- `object`
      }
      if (!missing(`created_at`)) {
        if (!(is.numeric(`created_at`) && length(`created_at`) == 1)) {
          stop(paste("Error! Invalid data for `created_at`. Must be an integer:", `created_at`))
        }
        self$`created_at` <- `created_at`
      }
      if (!missing(`level`)) {
        if (!(is.character(`level`) && length(`level`) == 1)) {
          stop(paste("Error! Invalid data for `level`. Must be a string:", `level`))
        }
        self$`level` <- `level`
      }
      if (!missing(`message`)) {
        if (!(is.character(`message`) && length(`message`) == 1)) {
          stop(paste("Error! Invalid data for `message`. Must be a string:", `message`))
        }
        self$`message` <- `message`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FineTuneEvent in JSON format
    #' @export
    toJSON = function() {
      FineTuneEventObject <- list()
      if (!is.null(self$`object`)) {
        FineTuneEventObject[["object"]] <-
          self$`object`
      }
      if (!is.null(self$`created_at`)) {
        FineTuneEventObject[["created_at"]] <-
          self$`created_at`
      }
      if (!is.null(self$`level`)) {
        FineTuneEventObject[["level"]] <-
          self$`level`
      }
      if (!is.null(self$`message`)) {
        FineTuneEventObject[["message"]] <-
          self$`message`
      }
      FineTuneEventObject
    },
    #' Deserialize JSON string into an instance of FineTuneEvent
    #'
    #' @description
    #' Deserialize JSON string into an instance of FineTuneEvent
    #'
    #' @param input_json the JSON input
    #' @return the instance of FineTuneEvent
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`object`)) {
        self$`object` <- this_object$`object`
      }
      if (!is.null(this_object$`created_at`)) {
        self$`created_at` <- this_object$`created_at`
      }
      if (!is.null(this_object$`level`)) {
        self$`level` <- this_object$`level`
      }
      if (!is.null(this_object$`message`)) {
        self$`message` <- this_object$`message`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FineTuneEvent in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`object`)) {
          sprintf(
          '"object":
            "%s"
                    ',
          self$`object`
          )
        },
        if (!is.null(self$`created_at`)) {
          sprintf(
          '"created_at":
            %d
                    ',
          self$`created_at`
          )
        },
        if (!is.null(self$`level`)) {
          sprintf(
          '"level":
            "%s"
                    ',
          self$`level`
          )
        },
        if (!is.null(self$`message`)) {
          sprintf(
          '"message":
            "%s"
                    ',
          self$`message`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of FineTuneEvent
    #'
    #' @description
    #' Deserialize JSON string into an instance of FineTuneEvent
    #'
    #' @param input_json the JSON input
    #' @return the instance of FineTuneEvent
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`object` <- this_object$`object`
      self$`created_at` <- this_object$`created_at`
      self$`level` <- this_object$`level`
      self$`message` <- this_object$`message`
      self
    },
    #' Validate JSON input with respect to FineTuneEvent
    #'
    #' @description
    #' Validate JSON input with respect to FineTuneEvent and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `object`
      if (!is.null(input_json$`object`)) {
        if (!(is.character(input_json$`object`) && length(input_json$`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", input_json$`object`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FineTuneEvent: the required field `object` is missing."))
      }
      # check the required field `created_at`
      if (!is.null(input_json$`created_at`)) {
        if (!(is.numeric(input_json$`created_at`) && length(input_json$`created_at`) == 1)) {
          stop(paste("Error! Invalid data for `created_at`. Must be an integer:", input_json$`created_at`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FineTuneEvent: the required field `created_at` is missing."))
      }
      # check the required field `level`
      if (!is.null(input_json$`level`)) {
        if (!(is.character(input_json$`level`) && length(input_json$`level`) == 1)) {
          stop(paste("Error! Invalid data for `level`. Must be a string:", input_json$`level`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FineTuneEvent: the required field `level` is missing."))
      }
      # check the required field `message`
      if (!is.null(input_json$`message`)) {
        if (!(is.character(input_json$`message`) && length(input_json$`message`) == 1)) {
          stop(paste("Error! Invalid data for `message`. Must be a string:", input_json$`message`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FineTuneEvent: the required field `message` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of FineTuneEvent
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
      # check if the required `object` is null
      if (is.null(self$`object`)) {
        return(FALSE)
      }

      # check if the required `created_at` is null
      if (is.null(self$`created_at`)) {
        return(FALSE)
      }

      # check if the required `level` is null
      if (is.null(self$`level`)) {
        return(FALSE)
      }

      # check if the required `message` is null
      if (is.null(self$`message`)) {
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
      # check if the required `object` is null
      if (is.null(self$`object`)) {
        invalid_fields["object"] <- "Non-nullable required field `object` cannot be null."
      }

      # check if the required `created_at` is null
      if (is.null(self$`created_at`)) {
        invalid_fields["created_at"] <- "Non-nullable required field `created_at` cannot be null."
      }

      # check if the required `level` is null
      if (is.null(self$`level`)) {
        invalid_fields["level"] <- "Non-nullable required field `level` cannot be null."
      }

      # check if the required `message` is null
      if (is.null(self$`message`)) {
        invalid_fields["message"] <- "Non-nullable required field `message` cannot be null."
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
# FineTuneEvent$unlock()
#
## Below is an example to define the print function
# FineTuneEvent$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# FineTuneEvent$lock()

