#' Create a new FineTuningJobEvent
#'
#' @description
#' Fine-tuning job event object
#'
#' @docType class
#' @title FineTuningJobEvent
#' @description FineTuningJobEvent Class
#' @format An \code{R6Class} generator object
#' @field id  character
#' @field created_at  integer
#' @field level  character
#' @field message  character
#' @field object  character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FineTuningJobEvent <- R6::R6Class(
  "FineTuningJobEvent",
  public = list(
    `id` = NULL,
    `created_at` = NULL,
    `level` = NULL,
    `message` = NULL,
    `object` = NULL,

    #' @description
    #' Initialize a new FineTuningJobEvent class.
    #'
    #' @param id id
    #' @param created_at created_at
    #' @param level level
    #' @param message message
    #' @param object object
    #' @param ... Other optional arguments.
    initialize = function(`id`, `created_at`, `level`, `message`, `object`, ...) {
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`created_at`)) {
        if (!(is.numeric(`created_at`) && length(`created_at`) == 1)) {
          stop(paste("Error! Invalid data for `created_at`. Must be an integer:", `created_at`))
        }
        self$`created_at` <- `created_at`
      }
      if (!missing(`level`)) {
        if (!(`level` %in% c("info", "warn", "error"))) {
          stop(paste("Error! \"", `level`, "\" cannot be assigned to `level`. Must be \"info\", \"warn\", \"error\".", sep = ""))
        }
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
      if (!missing(`object`)) {
        if (!(`object` %in% c("fine_tuning.job.event"))) {
          stop(paste("Error! \"", `object`, "\" cannot be assigned to `object`. Must be \"fine_tuning.job.event\".", sep = ""))
        }
        if (!(is.character(`object`) && length(`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", `object`))
        }
        self$`object` <- `object`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return FineTuningJobEvent in JSON format
    toJSON = function() {
      FineTuningJobEventObject <- list()
      if (!is.null(self$`id`)) {
        FineTuningJobEventObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`created_at`)) {
        FineTuningJobEventObject[["created_at"]] <-
          self$`created_at`
      }
      if (!is.null(self$`level`)) {
        FineTuningJobEventObject[["level"]] <-
          self$`level`
      }
      if (!is.null(self$`message`)) {
        FineTuningJobEventObject[["message"]] <-
          self$`message`
      }
      if (!is.null(self$`object`)) {
        FineTuningJobEventObject[["object"]] <-
          self$`object`
      }
      FineTuningJobEventObject
    },

    #' @description
    #' Deserialize JSON string into an instance of FineTuningJobEvent
    #'
    #' @param input_json the JSON input
    #' @return the instance of FineTuningJobEvent
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`created_at`)) {
        self$`created_at` <- this_object$`created_at`
      }
      if (!is.null(this_object$`level`)) {
        if (!is.null(this_object$`level`) && !(this_object$`level` %in% c("info", "warn", "error"))) {
          stop(paste("Error! \"", this_object$`level`, "\" cannot be assigned to `level`. Must be \"info\", \"warn\", \"error\".", sep = ""))
        }
        self$`level` <- this_object$`level`
      }
      if (!is.null(this_object$`message`)) {
        self$`message` <- this_object$`message`
      }
      if (!is.null(this_object$`object`)) {
        if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("fine_tuning.job.event"))) {
          stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"fine_tuning.job.event\".", sep = ""))
        }
        self$`object` <- this_object$`object`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return FineTuningJobEvent in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`id`)) {
          sprintf(
          '"id":
            "%s"
                    ',
          self$`id`
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
        },
        if (!is.null(self$`object`)) {
          sprintf(
          '"object":
            "%s"
                    ',
          self$`object`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of FineTuningJobEvent
    #'
    #' @param input_json the JSON input
    #' @return the instance of FineTuningJobEvent
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`created_at` <- this_object$`created_at`
      if (!is.null(this_object$`level`) && !(this_object$`level` %in% c("info", "warn", "error"))) {
        stop(paste("Error! \"", this_object$`level`, "\" cannot be assigned to `level`. Must be \"info\", \"warn\", \"error\".", sep = ""))
      }
      self$`level` <- this_object$`level`
      self$`message` <- this_object$`message`
      if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("fine_tuning.job.event"))) {
        stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"fine_tuning.job.event\".", sep = ""))
      }
      self$`object` <- this_object$`object`
      self
    },

    #' @description
    #' Validate JSON input with respect to FineTuningJobEvent and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for FineTuningJobEvent: the required field `id` is missing."))
      }
      # check the required field `created_at`
      if (!is.null(input_json$`created_at`)) {
        if (!(is.numeric(input_json$`created_at`) && length(input_json$`created_at`) == 1)) {
          stop(paste("Error! Invalid data for `created_at`. Must be an integer:", input_json$`created_at`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FineTuningJobEvent: the required field `created_at` is missing."))
      }
      # check the required field `level`
      if (!is.null(input_json$`level`)) {
        if (!(is.character(input_json$`level`) && length(input_json$`level`) == 1)) {
          stop(paste("Error! Invalid data for `level`. Must be a string:", input_json$`level`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FineTuningJobEvent: the required field `level` is missing."))
      }
      # check the required field `message`
      if (!is.null(input_json$`message`)) {
        if (!(is.character(input_json$`message`) && length(input_json$`message`) == 1)) {
          stop(paste("Error! Invalid data for `message`. Must be a string:", input_json$`message`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FineTuningJobEvent: the required field `message` is missing."))
      }
      # check the required field `object`
      if (!is.null(input_json$`object`)) {
        if (!(is.character(input_json$`object`) && length(input_json$`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", input_json$`object`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FineTuningJobEvent: the required field `object` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of FineTuningJobEvent
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

      # check if the required `object` is null
      if (is.null(self$`object`)) {
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

      # check if the required `object` is null
      if (is.null(self$`object`)) {
        invalid_fields["object"] <- "Non-nullable required field `object` cannot be null."
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
# FineTuningJobEvent$unlock()
#
## Below is an example to define the print function
# FineTuningJobEvent$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# FineTuningJobEvent$lock()

