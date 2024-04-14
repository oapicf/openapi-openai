#' Create a new RunToolCallObjectFunction
#'
#' @description
#' The function definition.
#'
#' @docType class
#' @title RunToolCallObjectFunction
#' @description RunToolCallObjectFunction Class
#' @format An \code{R6Class} generator object
#' @field name The name of the function. character
#' @field arguments The arguments that the model expects you to pass to the function. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RunToolCallObjectFunction <- R6::R6Class(
  "RunToolCallObjectFunction",
  public = list(
    `name` = NULL,
    `arguments` = NULL,
    #' Initialize a new RunToolCallObjectFunction class.
    #'
    #' @description
    #' Initialize a new RunToolCallObjectFunction class.
    #'
    #' @param name The name of the function.
    #' @param arguments The arguments that the model expects you to pass to the function.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`name`, `arguments`, ...) {
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
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return RunToolCallObjectFunction in JSON format
    #' @export
    toJSON = function() {
      RunToolCallObjectFunctionObject <- list()
      if (!is.null(self$`name`)) {
        RunToolCallObjectFunctionObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`arguments`)) {
        RunToolCallObjectFunctionObject[["arguments"]] <-
          self$`arguments`
      }
      RunToolCallObjectFunctionObject
    },
    #' Deserialize JSON string into an instance of RunToolCallObjectFunction
    #'
    #' @description
    #' Deserialize JSON string into an instance of RunToolCallObjectFunction
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunToolCallObjectFunction
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`arguments`)) {
        self$`arguments` <- this_object$`arguments`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return RunToolCallObjectFunction in JSON format
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
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of RunToolCallObjectFunction
    #'
    #' @description
    #' Deserialize JSON string into an instance of RunToolCallObjectFunction
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunToolCallObjectFunction
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`name` <- this_object$`name`
      self$`arguments` <- this_object$`arguments`
      self
    },
    #' Validate JSON input with respect to RunToolCallObjectFunction
    #'
    #' @description
    #' Validate JSON input with respect to RunToolCallObjectFunction and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for RunToolCallObjectFunction: the required field `name` is missing."))
      }
      # check the required field `arguments`
      if (!is.null(input_json$`arguments`)) {
        if (!(is.character(input_json$`arguments`) && length(input_json$`arguments`) == 1)) {
          stop(paste("Error! Invalid data for `arguments`. Must be a string:", input_json$`arguments`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunToolCallObjectFunction: the required field `arguments` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RunToolCallObjectFunction
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
# RunToolCallObjectFunction$unlock()
#
## Below is an example to define the print function
# RunToolCallObjectFunction$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RunToolCallObjectFunction$lock()

