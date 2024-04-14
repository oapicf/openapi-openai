#' Create a new RunStepDetailsToolCallsFunctionObjectFunction
#'
#' @description
#' The definition of the function that was called.
#'
#' @docType class
#' @title RunStepDetailsToolCallsFunctionObjectFunction
#' @description RunStepDetailsToolCallsFunctionObjectFunction Class
#' @format An \code{R6Class} generator object
#' @field name The name of the function. character
#' @field arguments The arguments passed to the function. character
#' @field output The output of the function. This will be `null` if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RunStepDetailsToolCallsFunctionObjectFunction <- R6::R6Class(
  "RunStepDetailsToolCallsFunctionObjectFunction",
  public = list(
    `name` = NULL,
    `arguments` = NULL,
    `output` = NULL,
    #' Initialize a new RunStepDetailsToolCallsFunctionObjectFunction class.
    #'
    #' @description
    #' Initialize a new RunStepDetailsToolCallsFunctionObjectFunction class.
    #'
    #' @param name The name of the function.
    #' @param arguments The arguments passed to the function.
    #' @param output The output of the function. This will be `null` if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`name`, `arguments`, `output`, ...) {
      if (!missing(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!missing(`arguments`)) {
        if (!(is.character(`arguments`) && length(`arguments`) == 1)) {
          stop(paste("Error! Invalid data for `arguments`. Must be a string:", `arguments`))
        }
        self$`arguments` <- `arguments`
      }
      if (!missing(`output`)) {
        if (!(is.character(`output`) && length(`output`) == 1)) {
          stop(paste("Error! Invalid data for `output`. Must be a string:", `output`))
        }
        self$`output` <- `output`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return RunStepDetailsToolCallsFunctionObjectFunction in JSON format
    #' @export
    toJSON = function() {
      RunStepDetailsToolCallsFunctionObjectFunctionObject <- list()
      if (!is.null(self$`name`)) {
        RunStepDetailsToolCallsFunctionObjectFunctionObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`arguments`)) {
        RunStepDetailsToolCallsFunctionObjectFunctionObject[["arguments"]] <-
          self$`arguments`
      }
      if (!is.null(self$`output`)) {
        RunStepDetailsToolCallsFunctionObjectFunctionObject[["output"]] <-
          self$`output`
      }
      RunStepDetailsToolCallsFunctionObjectFunctionObject
    },
    #' Deserialize JSON string into an instance of RunStepDetailsToolCallsFunctionObjectFunction
    #'
    #' @description
    #' Deserialize JSON string into an instance of RunStepDetailsToolCallsFunctionObjectFunction
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepDetailsToolCallsFunctionObjectFunction
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`arguments`)) {
        self$`arguments` <- this_object$`arguments`
      }
      if (!is.null(this_object$`output`)) {
        self$`output` <- this_object$`output`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return RunStepDetailsToolCallsFunctionObjectFunction in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`name`)) {
          sprintf(
          '"name":
            "%s"
                    ',
          self$`name`
          )
        },
        if (!is.null(self$`arguments`)) {
          sprintf(
          '"arguments":
            "%s"
                    ',
          self$`arguments`
          )
        },
        if (!is.null(self$`output`)) {
          sprintf(
          '"output":
            "%s"
                    ',
          self$`output`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of RunStepDetailsToolCallsFunctionObjectFunction
    #'
    #' @description
    #' Deserialize JSON string into an instance of RunStepDetailsToolCallsFunctionObjectFunction
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepDetailsToolCallsFunctionObjectFunction
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`name` <- this_object$`name`
      self$`arguments` <- this_object$`arguments`
      self$`output` <- this_object$`output`
      self
    },
    #' Validate JSON input with respect to RunStepDetailsToolCallsFunctionObjectFunction
    #'
    #' @description
    #' Validate JSON input with respect to RunStepDetailsToolCallsFunctionObjectFunction and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunStepDetailsToolCallsFunctionObjectFunction: the required field `name` is missing."))
      }
      # check the required field `arguments`
      if (!is.null(input_json$`arguments`)) {
        if (!(is.character(input_json$`arguments`) && length(input_json$`arguments`) == 1)) {
          stop(paste("Error! Invalid data for `arguments`. Must be a string:", input_json$`arguments`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunStepDetailsToolCallsFunctionObjectFunction: the required field `arguments` is missing."))
      }
      # check the required field `output`
      if (!is.null(input_json$`output`)) {
        if (!(is.character(input_json$`output`) && length(input_json$`output`) == 1)) {
          stop(paste("Error! Invalid data for `output`. Must be a string:", input_json$`output`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunStepDetailsToolCallsFunctionObjectFunction: the required field `output` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RunStepDetailsToolCallsFunctionObjectFunction
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
      # check if the required `name` is null
      if (is.null(self$`name`)) {
        return(FALSE)
      }

      # check if the required `arguments` is null
      if (is.null(self$`arguments`)) {
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
      # check if the required `name` is null
      if (is.null(self$`name`)) {
        invalid_fields["name"] <- "Non-nullable required field `name` cannot be null."
      }

      # check if the required `arguments` is null
      if (is.null(self$`arguments`)) {
        invalid_fields["arguments"] <- "Non-nullable required field `arguments` cannot be null."
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
# RunStepDetailsToolCallsFunctionObjectFunction$unlock()
#
## Below is an example to define the print function
# RunStepDetailsToolCallsFunctionObjectFunction$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RunStepDetailsToolCallsFunctionObjectFunction$lock()

