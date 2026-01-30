#' Create a new FineTuneDPOMethod
#'
#' @description
#' Configuration for the DPO fine-tuning method.
#'
#' @docType class
#' @title FineTuneDPOMethod
#' @description FineTuneDPOMethod Class
#' @format An \code{R6Class} generator object
#' @field hyperparameters  \link{FineTuneDPOMethodHyperparameters} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FineTuneDPOMethod <- R6::R6Class(
  "FineTuneDPOMethod",
  public = list(
    `hyperparameters` = NULL,

    #' @description
    #' Initialize a new FineTuneDPOMethod class.
    #'
    #' @param hyperparameters hyperparameters
    #' @param ... Other optional arguments.
    initialize = function(`hyperparameters` = NULL, ...) {
      if (!is.null(`hyperparameters`)) {
        stopifnot(R6::is.R6(`hyperparameters`))
        self$`hyperparameters` <- `hyperparameters`
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
    #' @return FineTuneDPOMethod as a base R list.
    #' @examples
    #' # convert array of FineTuneDPOMethod (x) to a data frame
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
    #' Convert FineTuneDPOMethod to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      FineTuneDPOMethodObject <- list()
      if (!is.null(self$`hyperparameters`)) {
        FineTuneDPOMethodObject[["hyperparameters"]] <-
          self$`hyperparameters`$toSimpleType()
      }
      return(FineTuneDPOMethodObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of FineTuneDPOMethod
    #'
    #' @param input_json the JSON input
    #' @return the instance of FineTuneDPOMethod
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`hyperparameters`)) {
        `hyperparameters_object` <- FineTuneDPOMethodHyperparameters$new()
        `hyperparameters_object`$fromJSON(jsonlite::toJSON(this_object$`hyperparameters`, auto_unbox = TRUE, digits = NA))
        self$`hyperparameters` <- `hyperparameters_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return FineTuneDPOMethod in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of FineTuneDPOMethod
    #'
    #' @param input_json the JSON input
    #' @return the instance of FineTuneDPOMethod
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`hyperparameters` <- FineTuneDPOMethodHyperparameters$new()$fromJSON(jsonlite::toJSON(this_object$`hyperparameters`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to FineTuneDPOMethod and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of FineTuneDPOMethod
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
# FineTuneDPOMethod$unlock()
#
## Below is an example to define the print function
# FineTuneDPOMethod$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# FineTuneDPOMethod$lock()

