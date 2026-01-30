#' Create a new CostsResultAmount
#'
#' @description
#' The monetary value in its associated currency.
#'
#' @docType class
#' @title CostsResultAmount
#' @description CostsResultAmount Class
#' @format An \code{R6Class} generator object
#' @field value The numeric value of the cost. numeric [optional]
#' @field currency Lowercase ISO-4217 currency e.g. \"usd\" character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CostsResultAmount <- R6::R6Class(
  "CostsResultAmount",
  public = list(
    `value` = NULL,
    `currency` = NULL,

    #' @description
    #' Initialize a new CostsResultAmount class.
    #'
    #' @param value The numeric value of the cost.
    #' @param currency Lowercase ISO-4217 currency e.g. \"usd\"
    #' @param ... Other optional arguments.
    initialize = function(`value` = NULL, `currency` = NULL, ...) {
      if (!is.null(`value`)) {
        self$`value` <- `value`
      }
      if (!is.null(`currency`)) {
        if (!(is.character(`currency`) && length(`currency`) == 1)) {
          stop(paste("Error! Invalid data for `currency`. Must be a string:", `currency`))
        }
        self$`currency` <- `currency`
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
    #' @return CostsResultAmount as a base R list.
    #' @examples
    #' # convert array of CostsResultAmount (x) to a data frame
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
    #' Convert CostsResultAmount to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CostsResultAmountObject <- list()
      if (!is.null(self$`value`)) {
        CostsResultAmountObject[["value"]] <-
          self$`value`
      }
      if (!is.null(self$`currency`)) {
        CostsResultAmountObject[["currency"]] <-
          self$`currency`
      }
      return(CostsResultAmountObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CostsResultAmount
    #'
    #' @param input_json the JSON input
    #' @return the instance of CostsResultAmount
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`value`)) {
        self$`value` <- this_object$`value`
      }
      if (!is.null(this_object$`currency`)) {
        self$`currency` <- this_object$`currency`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CostsResultAmount in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CostsResultAmount
    #'
    #' @param input_json the JSON input
    #' @return the instance of CostsResultAmount
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`value` <- this_object$`value`
      self$`currency` <- this_object$`currency`
      self
    },

    #' @description
    #' Validate JSON input with respect to CostsResultAmount and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CostsResultAmount
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
# CostsResultAmount$unlock()
#
## Below is an example to define the print function
# CostsResultAmount$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CostsResultAmount$lock()

