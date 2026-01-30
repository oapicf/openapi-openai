#' Create a new FineTuneCompletionRequestInput
#'
#' @description
#' The per-line training example of a fine-tuning input file for completions models
#'
#' @docType class
#' @title FineTuneCompletionRequestInput
#' @description FineTuneCompletionRequestInput Class
#' @format An \code{R6Class} generator object
#' @field prompt The input prompt for this training example. character [optional]
#' @field completion The desired completion for this training example. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FineTuneCompletionRequestInput <- R6::R6Class(
  "FineTuneCompletionRequestInput",
  public = list(
    `prompt` = NULL,
    `completion` = NULL,

    #' @description
    #' Initialize a new FineTuneCompletionRequestInput class.
    #'
    #' @param prompt The input prompt for this training example.
    #' @param completion The desired completion for this training example.
    #' @param ... Other optional arguments.
    initialize = function(`prompt` = NULL, `completion` = NULL, ...) {
      if (!is.null(`prompt`)) {
        if (!(is.character(`prompt`) && length(`prompt`) == 1)) {
          stop(paste("Error! Invalid data for `prompt`. Must be a string:", `prompt`))
        }
        self$`prompt` <- `prompt`
      }
      if (!is.null(`completion`)) {
        if (!(is.character(`completion`) && length(`completion`) == 1)) {
          stop(paste("Error! Invalid data for `completion`. Must be a string:", `completion`))
        }
        self$`completion` <- `completion`
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
    #' @return FineTuneCompletionRequestInput as a base R list.
    #' @examples
    #' # convert array of FineTuneCompletionRequestInput (x) to a data frame
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
    #' Convert FineTuneCompletionRequestInput to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      FineTuneCompletionRequestInputObject <- list()
      if (!is.null(self$`prompt`)) {
        FineTuneCompletionRequestInputObject[["prompt"]] <-
          self$`prompt`
      }
      if (!is.null(self$`completion`)) {
        FineTuneCompletionRequestInputObject[["completion"]] <-
          self$`completion`
      }
      return(FineTuneCompletionRequestInputObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of FineTuneCompletionRequestInput
    #'
    #' @param input_json the JSON input
    #' @return the instance of FineTuneCompletionRequestInput
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`prompt`)) {
        self$`prompt` <- this_object$`prompt`
      }
      if (!is.null(this_object$`completion`)) {
        self$`completion` <- this_object$`completion`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return FineTuneCompletionRequestInput in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of FineTuneCompletionRequestInput
    #'
    #' @param input_json the JSON input
    #' @return the instance of FineTuneCompletionRequestInput
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`prompt` <- this_object$`prompt`
      self$`completion` <- this_object$`completion`
      self
    },

    #' @description
    #' Validate JSON input with respect to FineTuneCompletionRequestInput and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of FineTuneCompletionRequestInput
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
# FineTuneCompletionRequestInput$unlock()
#
## Below is an example to define the print function
# FineTuneCompletionRequestInput$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# FineTuneCompletionRequestInput$lock()

