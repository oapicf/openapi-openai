#' Create a new RunStepDeltaObject
#'
#' @description
#' Represents a run step delta i.e. any changed fields on a run step during streaming. 
#'
#' @docType class
#' @title RunStepDeltaObject
#' @description RunStepDeltaObject Class
#' @format An \code{R6Class} generator object
#' @field id The identifier of the run step, which can be referenced in API endpoints. character
#' @field object The object type, which is always `thread.run.step.delta`. character
#' @field delta  \link{RunStepDeltaObjectDelta}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RunStepDeltaObject <- R6::R6Class(
  "RunStepDeltaObject",
  public = list(
    `id` = NULL,
    `object` = NULL,
    `delta` = NULL,

    #' @description
    #' Initialize a new RunStepDeltaObject class.
    #'
    #' @param id The identifier of the run step, which can be referenced in API endpoints.
    #' @param object The object type, which is always `thread.run.step.delta`.
    #' @param delta delta
    #' @param ... Other optional arguments.
    initialize = function(`id`, `object`, `delta`, ...) {
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`object`)) {
        if (!(`object` %in% c("thread.run.step.delta"))) {
          stop(paste("Error! \"", `object`, "\" cannot be assigned to `object`. Must be \"thread.run.step.delta\".", sep = ""))
        }
        if (!(is.character(`object`) && length(`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", `object`))
        }
        self$`object` <- `object`
      }
      if (!missing(`delta`)) {
        stopifnot(R6::is.R6(`delta`))
        self$`delta` <- `delta`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return RunStepDeltaObject in JSON format
    toJSON = function() {
      RunStepDeltaObjectObject <- list()
      if (!is.null(self$`id`)) {
        RunStepDeltaObjectObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`object`)) {
        RunStepDeltaObjectObject[["object"]] <-
          self$`object`
      }
      if (!is.null(self$`delta`)) {
        RunStepDeltaObjectObject[["delta"]] <-
          self$`delta`$toJSON()
      }
      RunStepDeltaObjectObject
    },

    #' @description
    #' Deserialize JSON string into an instance of RunStepDeltaObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepDeltaObject
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`object`)) {
        if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("thread.run.step.delta"))) {
          stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"thread.run.step.delta\".", sep = ""))
        }
        self$`object` <- this_object$`object`
      }
      if (!is.null(this_object$`delta`)) {
        `delta_object` <- RunStepDeltaObjectDelta$new()
        `delta_object`$fromJSON(jsonlite::toJSON(this_object$`delta`, auto_unbox = TRUE, digits = NA))
        self$`delta` <- `delta_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return RunStepDeltaObject in JSON format
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
        if (!is.null(self$`object`)) {
          sprintf(
          '"object":
            "%s"
                    ',
          self$`object`
          )
        },
        if (!is.null(self$`delta`)) {
          sprintf(
          '"delta":
          %s
          ',
          jsonlite::toJSON(self$`delta`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of RunStepDeltaObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepDeltaObject
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("thread.run.step.delta"))) {
        stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"thread.run.step.delta\".", sep = ""))
      }
      self$`object` <- this_object$`object`
      self$`delta` <- RunStepDeltaObjectDelta$new()$fromJSON(jsonlite::toJSON(this_object$`delta`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to RunStepDeltaObject and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for RunStepDeltaObject: the required field `id` is missing."))
      }
      # check the required field `object`
      if (!is.null(input_json$`object`)) {
        if (!(is.character(input_json$`object`) && length(input_json$`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", input_json$`object`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunStepDeltaObject: the required field `object` is missing."))
      }
      # check the required field `delta`
      if (!is.null(input_json$`delta`)) {
        stopifnot(R6::is.R6(input_json$`delta`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunStepDeltaObject: the required field `delta` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RunStepDeltaObject
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

      # check if the required `object` is null
      if (is.null(self$`object`)) {
        return(FALSE)
      }

      # check if the required `delta` is null
      if (is.null(self$`delta`)) {
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

      # check if the required `object` is null
      if (is.null(self$`object`)) {
        invalid_fields["object"] <- "Non-nullable required field `object` cannot be null."
      }

      # check if the required `delta` is null
      if (is.null(self$`delta`)) {
        invalid_fields["delta"] <- "Non-nullable required field `delta` cannot be null."
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
# RunStepDeltaObject$unlock()
#
## Below is an example to define the print function
# RunStepDeltaObject$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RunStepDeltaObject$lock()

