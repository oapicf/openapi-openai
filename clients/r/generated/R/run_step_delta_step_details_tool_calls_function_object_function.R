#' Create a new RunStepDeltaStepDetailsToolCallsFunctionObjectFunction
#'
#' @description
#' The definition of the function that was called.
#'
#' @docType class
#' @title RunStepDeltaStepDetailsToolCallsFunctionObjectFunction
#' @description RunStepDeltaStepDetailsToolCallsFunctionObjectFunction Class
#' @format An \code{R6Class} generator object
#' @field name The name of the function. character [optional]
#' @field arguments The arguments passed to the function. character [optional]
#' @field output The output of the function. This will be `null` if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RunStepDeltaStepDetailsToolCallsFunctionObjectFunction <- R6::R6Class(
  "RunStepDeltaStepDetailsToolCallsFunctionObjectFunction",
  public = list(
    `name` = NULL,
    `arguments` = NULL,
    `output` = NULL,

    #' @description
    #' Initialize a new RunStepDeltaStepDetailsToolCallsFunctionObjectFunction class.
    #'
    #' @param name The name of the function.
    #' @param arguments The arguments passed to the function.
    #' @param output The output of the function. This will be `null` if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet.
    #' @param ... Other optional arguments.
    initialize = function(`name` = NULL, `arguments` = NULL, `output` = NULL, ...) {
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`arguments`)) {
        if (!(is.character(`arguments`) && length(`arguments`) == 1)) {
          stop(paste("Error! Invalid data for `arguments`. Must be a string:", `arguments`))
        }
        self$`arguments` <- `arguments`
      }
      if (!is.null(`output`)) {
        if (!(is.character(`output`) && length(`output`) == 1)) {
          stop(paste("Error! Invalid data for `output`. Must be a string:", `output`))
        }
        self$`output` <- `output`
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
    #' @return RunStepDeltaStepDetailsToolCallsFunctionObjectFunction as a base R list.
    #' @examples
    #' # convert array of RunStepDeltaStepDetailsToolCallsFunctionObjectFunction (x) to a data frame
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
    #' Convert RunStepDeltaStepDetailsToolCallsFunctionObjectFunction to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RunStepDeltaStepDetailsToolCallsFunctionObjectFunctionObject <- list()
      if (!is.null(self$`name`)) {
        RunStepDeltaStepDetailsToolCallsFunctionObjectFunctionObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`arguments`)) {
        RunStepDeltaStepDetailsToolCallsFunctionObjectFunctionObject[["arguments"]] <-
          self$`arguments`
      }
      if (!is.null(self$`output`)) {
        RunStepDeltaStepDetailsToolCallsFunctionObjectFunctionObject[["output"]] <-
          self$`output`
      }
      return(RunStepDeltaStepDetailsToolCallsFunctionObjectFunctionObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of RunStepDeltaStepDetailsToolCallsFunctionObjectFunction
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepDeltaStepDetailsToolCallsFunctionObjectFunction
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

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return RunStepDeltaStepDetailsToolCallsFunctionObjectFunction in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RunStepDeltaStepDetailsToolCallsFunctionObjectFunction
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepDeltaStepDetailsToolCallsFunctionObjectFunction
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`name` <- this_object$`name`
      self$`arguments` <- this_object$`arguments`
      self$`output` <- this_object$`output`
      self
    },

    #' @description
    #' Validate JSON input with respect to RunStepDeltaStepDetailsToolCallsFunctionObjectFunction and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RunStepDeltaStepDetailsToolCallsFunctionObjectFunction
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
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
# RunStepDeltaStepDetailsToolCallsFunctionObjectFunction$unlock()
#
## Below is an example to define the print function
# RunStepDeltaStepDetailsToolCallsFunctionObjectFunction$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RunStepDeltaStepDetailsToolCallsFunctionObjectFunction$lock()

