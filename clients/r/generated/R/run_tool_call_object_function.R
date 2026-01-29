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

    #' @description
    #' Initialize a new RunToolCallObjectFunction class.
    #'
    #' @param name The name of the function.
    #' @param arguments The arguments that the model expects you to pass to the function.
    #' @param ... Other optional arguments.
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
    #' @return RunToolCallObjectFunction as a base R list.
    #' @examples
    #' # convert array of RunToolCallObjectFunction (x) to a data frame
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
    #' Convert RunToolCallObjectFunction to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RunToolCallObjectFunctionObject <- list()
      if (!is.null(self$`name`)) {
        RunToolCallObjectFunctionObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`arguments`)) {
        RunToolCallObjectFunctionObject[["arguments"]] <-
          self$`arguments`
      }
      return(RunToolCallObjectFunctionObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of RunToolCallObjectFunction
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunToolCallObjectFunction
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

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return RunToolCallObjectFunction in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RunToolCallObjectFunction
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunToolCallObjectFunction
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`name` <- this_object$`name`
      self$`arguments` <- this_object$`arguments`
      self
    },

    #' @description
    #' Validate JSON input with respect to RunToolCallObjectFunction and throw an exception if invalid
    #'
    #' @param input the JSON input
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

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RunToolCallObjectFunction
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
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

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
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
# RunToolCallObjectFunction$unlock()
#
## Below is an example to define the print function
# RunToolCallObjectFunction$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RunToolCallObjectFunction$lock()

